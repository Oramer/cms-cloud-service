package com.cms.buss_service.wxpay;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.model.OrderEnum;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.IdUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.buss_service.bucket.domain.BussBucketDetails;
import com.cms.buss_service.card.domain.BussUserCard;
import com.cms.buss_service.card.service.BussUserCardService;
import com.cms.buss_service.order.domain.BussOrderInfo;
import com.cms.buss_service.order.domain.BussOrderProductInfo;
import com.cms.buss_service.order.service.BussOrderInfoService;
import com.cms.buss_service.order.service.BussOrderProductInfoService;
import com.cms.buss_service.product.domain.BussProductInfo;
import com.cms.buss_service.product.service.BussProductInfoService;
import com.cms.buss_service.ticket.domain.BussTicketInfo;
import com.cms.buss_service.ticket.domain.BussUserTicketInfo;
import com.cms.system_service.system.mapper.SysUserMapper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

@Service("buildService")
public class BuildOrderInfoSevice {
    /*  44 */   private static final Logger log = LoggerFactory.getLogger(BuildOrderInfoSevice.class);


    @Autowired
    private BussProductInfoService bussProductInfoService;


    @Autowired
    private BussOrderInfoService bussOrderInfoService;


    @Autowired
    private BussOrderProductInfoService bussOrderProductInfoService;


    @Autowired
    private BussUserCardService bussUserCardService;

    @Autowired
    private WechatPayV3Utils wechatPayV3Utils;

    @Autowired(required = false)
    SysUserMapper sysUserMapper;


    public RestResult preparePayInfo(String desciption, String outTradeNo, BigDecimal amount, String openId) {
        /*  70 */
        Calendar calendar = Calendar.getInstance();
        /*  71 */
        calendar.set(12, calendar.get(12) + 15);
        /*  72 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        /*  73 */
        JSONObject params = new JSONObject();
        /*  74 */
        params.put("appid", "wx578320de8ea6562e");
        /*  75 */
        params.put("mchid", "1636136569");
        /*  76 */
        params.put("description", desciption);
        /*  77 */
        params.put("out_trade_no", outTradeNo);
        /*  78 */
        params.put("time_expire", sdf.format(calendar.getTime()));
        /*  79 */
        params.put("notify_url", "https://www.allinkwater.com/wxapi/api/wechatPay/v3/wechatPayNotify");
        /*  80 */
        JSONObject amount_json = new JSONObject();
        /*  81 */
        amount_json.put("total", Integer.valueOf(Integer.parseInt(amount_fee(amount))));
        /*  82 */
        params.put("amount", amount_json);
        /*  83 */
        JSONObject payer = new JSONObject();
        /*  84 */
        payer.put("openid", openId);
        /*  85 */
        params.put("payer", payer);

        /*  87 */
        JSONObject res = this.wechatPayV3Utils.sendPost("https://api.mch.weixin.qq.com/v3/pay/transactions/jsapi", params);

        /*  89 */
        if (res == null || StringUtils.isEmpty(res.getString("prepay_id"))) {
            /*  90 */
            return RestResult.fail("支付发起失败");
        }
        /*  92 */
        log.error("res.getString(\"prepay_id\")" + res.getString("prepay_id"));
        /*  93 */
        Map<String, String> prepay_id = prepareToApp(res.getString("prepay_id"), outTradeNo);
        /*  94 */
        return RestResult.ok(prepay_id);
    }


    public Map<String, String> prepareToApp(String prepay_id, String out_trade_no) {
        /* 105 */
        StringBuilder sb = new StringBuilder();

        /* 107 */
        Map<String, String> result = new HashMap<>();
        /* 108 */
        result.put("appId", "wx578320de8ea6562e");
        /* 109 */
        sb.append(result.get("appId")).append("\n");
        /* 110 */
        result.put("timeStamp", ((new Date()).getTime() / 1000L) + "");
        /* 111 */
        sb.append(result.get("timeStamp")).append("\n");
        /* 112 */
        result.put("nonceStr", RandomStringUtils.randomAlphanumeric(32));
        /* 113 */
        sb.append(result.get("nonceStr")).append("\n");
        /* 114 */
        result.put("package", "prepay_id=" + prepay_id);
        /* 115 */
        sb.append(result.get("package")).append("\n");
        /* 116 */
        result.put("paySign", this.wechatPayV3Utils.signRSA(sb.toString()));
        /* 117 */
        result.put("signType", "RSA");
        /* 118 */
        result.put("out_trade_no", out_trade_no);
        /* 119 */
        result.put("wx_trade_no", prepay_id);
        /* 120 */
        return result;
    }


    public void createOrderInfo(PrepareVo vo) {
        /* 129 */
        List<BussUserTicketInfo> tvos = vo.getTvos();
        /* 130 */
        BussOrderInfo info = new BussOrderInfo();
        /* 131 */
        info.setPk(vo.getOut_trade_no());
        /* 132 */
        info.setOrderType(StringUtils.isBlank(vo.getOrderType()) ? "1" : vo.getOrderType());
        /* 133 */
        info.setOrderTime(DateUtils.getTime());
        /* 134 */
        info.setOrderPersion(SecurityUtils.getUid());
        /* 135 */
        info.setAmountofmoney(vo.getAmount());
        /* 136 */
        info.setRealMoney(vo.getAmount());
        /* 137 */
        info.setOrderAddressId(Long.valueOf(vo.getOrderAddressId()));
        /* 138 */
        info.setNo15(vo.getPrepareInfo());
        /* 139 */
        info.setNo14(JSON.toJSONString(vo));
        /* 140 */
        info.setNo12(String.valueOf(vo.getTotalJs()));
        /* 141 */
        info.setNo2(vo.getCouponInfoId());
        /* 142 */
        info.setBatchNo(vo.getWx_trade_no());
        /* 143 */
        info.setStationId(SecurityUtils.getUserStationId());
        /* 144 */
        info.setExpressFee(vo.getPsFree());
        /* 145 */
        info.setNo4(String.valueOf(vo.getPlFree()));
        /* 146 */
        info.setOrderRemark(vo.getOrderRemark());
        /* 147 */
        info.setNeedMortgage(Boolean.toString(vo.getChoseYt().booleanValue()));
        /* 148 */
        if (vo.getAddress() != null) {
            /* 149 */
            info.setPayType(vo.getAddress().getPhone() + "|" + vo.getAddress().getName());
        }

        /* 152 */
        Long total = Long.valueOf(0L);
        /* 153 */
        if (vo.getVo().size() > 0) {
            /* 154 */
            List<ProductVo> vo1 = vo.getVo();
            /* 155 */
            for (int i = 0; i < vo1.size(); i++) {
                /* 156 */
                BussOrderProductInfo prinfo = new BussOrderProductInfo();
                /* 157 */
                prinfo.setOrderInfoPk(info.getPk());
                /* 158 */
                prinfo.setProductPk(((ProductVo) vo1.get(i)).getProductPk());
                /* 159 */
                prinfo.setProductAmount(Long.valueOf(Long.parseLong(((ProductVo) vo1.get(i)).getPay_count())));
                /* 160 */
                total = Long.valueOf(total.longValue() + Long.parseLong(((ProductVo) vo1.get(i)).getPay_count()));
                /* 161 */
                this.bussOrderProductInfoService.insertBussOrderProductInfo(prinfo);
            }
        }
        /* 164 */
        info.setAmount(total);
        /* 165 */
        this.bussOrderInfoService.insertBussOrderInfo(info);
    }


    public String createZEROAmountOrderInfo(PrepareVo vo) {
        /* 176 */
        String odno = IdUtils.createOrderNo("SP");
        /* 177 */
        List<BussUserTicketInfo> tvos = vo.getTvos();
        /* 178 */
        BussOrderInfo info = new BussOrderInfo();
        /* 179 */
        info.setPk(odno);
        /* 180 */
        info.setOrderType(StringUtils.isBlank(vo.getOrderType()) ? "1" : vo.getOrderType());
        /* 181 */
        info.setOrderTime(DateUtils.getTime());
        /* 182 */
        info.setOrderPersion(SecurityUtils.getUid());
        /* 183 */
        info.setAmountofmoney(vo.getAmount());
        /* 184 */
        info.setRealMoney(BigDecimal.ZERO);
        /* 185 */
        info.setOrderAddressId(Long.valueOf(vo.getOrderAddressId()));
        /* 186 */
        info.setNo15(vo.getPrepareInfo());
        /* 187 */
        info.setNo14(JSON.toJSONString(vo));
        /* 188 */
        info.setNo12(String.valueOf(vo.getTotalJs()));
        /* 189 */
        info.setNo2(vo.getCouponInfoId());
        /* 190 */
        info.setBatchNo(vo.getWx_trade_no());
        /* 191 */
        info.setStationId(SecurityUtils.getUserStationId());
        /* 192 */
        info.setExpressFee(vo.getPsFree());
        /* 193 */
        info.setNo4(String.valueOf(vo.getPlFree()));
        /* 194 */
        info.setOrderStatus(OrderEnum.ORDER_YZF.getCode());
        /* 195 */
        info.setOrderRemark(vo.getOrderRemark());
        /* 196 */
        info.setNeedMortgage(Boolean.toString(vo.getChoseYt().booleanValue()));
        /* 197 */
        Long total = Long.valueOf(0L);
        /* 198 */
        if (vo.getVo().size() > 0) {
            /* 199 */
            List<ProductVo> vo1 = vo.getVo();
            /* 200 */
            for (int i = 0; i < vo1.size(); i++) {
                /* 201 */
                BussOrderProductInfo prinfo = new BussOrderProductInfo();
                /* 202 */
                prinfo.setOrderInfoPk(info.getPk());
                /* 203 */
                prinfo.setProductPk(((ProductVo) vo1.get(i)).getProductPk());
                /* 204 */
                prinfo.setProductAmount(Long.valueOf(Long.parseLong(((ProductVo) vo1.get(i)).getPay_count())));
                /* 205 */
                this.bussOrderProductInfoService.insertBussOrderProductInfo(prinfo);

                /* 207 */
                BussUserCard cd = this.bussUserCardService.queryCardByUserIdAndProductId(((ProductVo) vo1.get(i)).getProductPk());
                /* 208 */
                if (cd != null) {
                    /* 209 */
                    this.bussUserCardService.deleteBussUserCardById(cd.getPk());
                }
                /* 211 */
                total = Long.valueOf(total.longValue() + Long.parseLong(((ProductVo) vo1.get(i)).getPay_count()));
            }
        }

        /* 215 */
        info.setAmount(total);
        /* 216 */
        this.bussOrderInfoService.insertBussOrderInfo(info);
        /* 217 */
        return odno;
    }


    public String createYjOrderInfo(PrepareVo vo) {
        /* 231 */
        String wtid = this.sysUserMapper.queryUserGroupId(SecurityUtils.getUid());
        /* 232 */
        String odno = IdUtils.createOrderNo("YJ");
        /* 233 */
        List<BussUserTicketInfo> tvos = vo.getTvos();
        /* 234 */
        BussOrderInfo info = new BussOrderInfo();
        /* 235 */
        info.setPk(odno);
        /* 236 */
        info.setOrderType(StringUtils.isBlank(vo.getOrderType()) ? "1" : vo.getOrderType());
        /* 237 */
        info.setOrderTime(DateUtils.getTime());
        /* 238 */
        info.setOrderPersion(SecurityUtils.getUid());
        /* 239 */
        info.setAmountofmoney(vo.getAmount());
        /* 240 */
        info.setRealMoney(BigDecimal.ZERO);
        /* 241 */
        info.setOrderAddressId(Long.valueOf(vo.getOrderAddressId()));
        /* 242 */
        info.setNo15(vo.getPrepareInfo());
        /* 243 */
        info.setNo14(JSON.toJSONString(vo));
        /* 244 */
        info.setNo13(wtid);
        /* 245 */
        info.setNo12(String.valueOf(vo.getTotalJs()));
        /* 246 */
        info.setNo2(vo.getCouponInfoId());
        /* 247 */
        info.setBatchNo(vo.getWx_trade_no());
        /* 248 */
        info.setStationId(SecurityUtils.getUserStationId());
        /* 249 */
        info.setExpressFee(vo.getPsFree());
        /* 250 */
        info.setNo4(String.valueOf(vo.getPlFree()));
        /* 251 */
        info.setOrderStatus(OrderEnum.ORDER_YZF.getCode());
        /* 252 */
        info.setOrderRemark(vo.getOrderRemark());
        /* 253 */
        info.setNeedMortgage(Boolean.toString(vo.getChoseYt().booleanValue()));
        /* 254 */
        Long total = Long.valueOf(0L);
        /* 255 */
        if (vo.getVo().size() > 0) {
            /* 256 */
            List<ProductVo> vo1 = vo.getVo();
            /* 257 */
            for (int i = 0; i < vo1.size(); i++) {
                /* 258 */
                BussOrderProductInfo prinfo = new BussOrderProductInfo();
                /* 259 */
                prinfo.setOrderInfoPk(info.getPk());
                /* 260 */
                prinfo.setProductPk(((ProductVo) vo1.get(i)).getProductPk());
                /* 261 */
                prinfo.setProductAmount(Long.valueOf(Long.parseLong(((ProductVo) vo1.get(i)).getPay_count())));
                /* 262 */
                this.bussOrderProductInfoService.insertBussOrderProductInfo(prinfo);

                /* 264 */
                BussUserCard cd = this.bussUserCardService.queryCardByUserIdAndProductId(((ProductVo) vo1.get(i)).getProductPk());
                /* 265 */
                if (cd != null) {
                    /* 266 */
                    this.bussUserCardService.deleteBussUserCardById(cd.getPk());
                }
                /* 268 */
                total = Long.valueOf(total.longValue() + Long.parseLong(((ProductVo) vo1.get(i)).getPay_count()));
            }
        }

        /* 272 */
        info.setAmount(total);
        /* 273 */
        this.bussOrderInfoService.insertBussOrderInfo(info);
        /* 274 */
        return odno;
    }


    public void createBucketOrderInfo(PrepareVo vo) {
        /* 286 */
        BussOrderInfo info = new BussOrderInfo();
        /* 287 */
        info.setPk(vo.getOut_trade_no());
        /* 288 */
        info.setOrderType(StringUtils.isBlank(vo.getOrderType()) ? "1" : vo.getOrderType());
        /* 289 */
        info.setOrderTime(DateUtils.getTime());
        /* 290 */
        info.setOrderPersion(vo.getUserId());
        /* 291 */
        info.setStationId(SecurityUtils.getUserStationId());
        /* 292 */
        info.setAmountofmoney(vo.getAmount());
        /* 293 */
        info.setOrderAddressId(StringUtils.isNotBlank(vo.getOrderAddressId()) ? Long.valueOf(Long.parseLong(vo.getOrderAddressId())) : null);
        /* 294 */
        info.setNo14(JSON.toJSONString(vo));
        /* 295 */
        info.setNo15(vo.getPrepareInfo());
        /* 296 */
        info.setNo12(String.valueOf(vo.getTotalJs()));
        /* 297 */
        info.setNo2(vo.getCouponInfoId());
        /* 298 */
        info.setBatchNo(vo.getWx_trade_no());
        /* 299 */
        this.bussOrderInfoService.insertBussOrderInfo(info);
    }


    public BigDecimal calcBucketOrderAmount(PrepareVo vo) {
        /* 340 */
        AtomicReference<BigDecimal> totalAmount = new AtomicReference<>(new BigDecimal("0.00"));
        /* 341 */
        List<BussBucketDetails> bvo = vo.getBvo();
        /* 342 */
        if (!CollectionUtils.isEmpty(bvo)) {
            /* 343 */
            bvo.forEach(is -> {
                BigDecimal single = Constants.SYSTEM_YT_MONEY.multiply(new BigDecimal(is.getCount().intValue()));
                totalAmount.set(single.add(totalAmount.get()));
            });
        }
        /* 348 */
        return totalAmount.get();
    }


    public PrepareVo calcOrderAmount(PrepareVo vo) {
        /* 358 */
        List<BussUserTicketInfo> tvos = vo.getTvos();
        /* 359 */
        AtomicReference<BigDecimal> totalAmount = new AtomicReference<>(new BigDecimal("0.00"));
        /* 360 */
        List<ProductVo> vos = vo.getVo();
        /* 361 */
        AtomicReference<BigDecimal> allCount = new AtomicReference<>(new BigDecimal("0"));
        /* 362 */
        AtomicReference<BigDecimal> ytCount = new AtomicReference<>(new BigDecimal("0"));
        /* 363 */
        AtomicReference<BigDecimal> us = new AtomicReference<>(new BigDecimal("0"));
        /* 364 */
        if (!CollectionUtils.isEmpty(vos)) {
            /* 365 */
            vos.forEach(is -> {
                us.set(((BigDecimal) us.get()).add(new BigDecimal(is.getPay_count())));

                BigDecimal single = new BigDecimal(0.0D);

                BigDecimal ytAmount = new BigDecimal(0.0D);

                BussProductInfo vosI = this.bussProductInfoService.selectBussProductInfoById(is.getProductPk());

                allCount.set(((BigDecimal) allCount.get()).add(new BigDecimal(is.getPay_count())));

                if (vo.getTvos() != null && vo.getTvos().size() > 0) {
                    boolean present = tvos.stream().findAny().isPresent();

                    if (present) {
                        BussUserTicketInfo info = tvos.stream().findFirst().get();

                        if (info != null && info.getPk() != null) {
                            if (info.getTicketAccount().intValue() <= Integer.parseInt(is.getPay_count())) {
                                int count = Integer.parseInt(is.getPay_count()) - info.getTicketAccount().intValue();

                                single = vosI.getProductPrice().multiply(new BigDecimal(count));
                            }
                        } else {
                            single = vosI.getProductPrice().multiply(new BigDecimal(is.getPay_count()));
                        }
                    } else {
                        single = vosI.getProductPrice().multiply(new BigDecimal(is.getPay_count()));
                    }
                } else {
                    single = vosI.getProductPrice().multiply(new BigDecimal(is.getPay_count()));
                }
                if ("Y".equalsIgnoreCase(is.getNeedyt())) {
                    ytCount.set(((BigDecimal) ytCount.get()).add(new BigDecimal(is.getPay_count())));
                }
                single = single.add(ytAmount);
                totalAmount.set(single.add(totalAmount.get()));
            });
        }
        /* 404 */
        if (vo.getChoseYt().booleanValue()) {
            /* 405 */
            BigDecimal ytMo = Constants.SYSTEM_YT_MONEY.multiply(ytCount.get()).setScale(2, RoundingMode.HALF_DOWN);
            /* 406 */
            totalAmount.set(((BigDecimal) totalAmount.get()).add(ytMo));
            /* 407 */
            vo.setYtFree(ytMo);
        }

        /* 410 */
        if (vo.getConpon() != null) {
            /* 411 */
            if ("1".equalsIgnoreCase(vo.getConpon().getCouponType())) {
                /* 412 */
                BigDecimal money = new BigDecimal(vo.getConpon().getMoney());
                /* 413 */
                BigDecimal totalPrice = totalAmount.get();
                /* 414 */
                if (totalPrice.compareTo(money) >= 0) {
                    /* 415 */
                    totalAmount.set(totalPrice.subtract(money));
                    /* 416 */
                    vo.setYhFree(money);
                } else {
                    /* 418 */
                    totalAmount.set(new BigDecimal(0.0D));
                }
            }
            /* 421 */
            if ("2".equalsIgnoreCase(vo.getConpon().getCouponType())) {
                /* 422 */
                BigDecimal money = new BigDecimal(vo.getConpon().getMoney());
                /* 423 */
                BigDecimal totalPrice = totalAmount.get();
                /* 424 */
                BigDecimal linjie = new BigDecimal(vo.getConpon().getThreshold());
                /* 425 */
                if (totalPrice.compareTo(linjie) >= 0) {
                    /* 426 */
                    totalAmount.set(totalPrice.subtract(money));
                    /* 427 */
                    vo.setYhFree(money);
                }
            }
        }
        /* 431 */
        if (vo.getPsFree() != null) {
            /* 432 */
            totalAmount.set(vo.getPsFree().add(totalAmount.get()));
        }
        /* 434 */
        if (vo.getPlFree() != null) {
            /* 435 */
            BigDecimal add = vo.getPlFree().multiply(allCount.get()).add(totalAmount.get());
            /* 436 */
            totalAmount.set(add);
            /* 437 */
            vo.setCbFree(add);
        }
        /* 439 */
        vo.setVarifyFree(totalAmount.get());
        /* 440 */
        vo.setTotalJs(us.get());
        /* 441 */
        return vo;
    }


    public String createOrderNo(String head, Long id) {
        /* 454 */
        StringBuilder uid = new StringBuilder(id.toString());
        /* 455 */
        Date date = new Date();
        /* 456 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        /* 457 */
        int length = uid.length();
        /* 458 */
        for (int i = 0; i < 9 - length; i++) {
            /* 459 */
            uid.insert(0, "0");
        }
        /* 461 */
        return head + sdf.format(date) + uid + (int) ((Math.random() * 9.0D + 1.0D) * 1000.0D);
    }


    public String amount_fee(BigDecimal cny) {
        /* 471 */
        BigDecimal b2 = new BigDecimal(100);
        /* 472 */
        return cny.multiply(b2).setScale(0, RoundingMode.DOWN).toString();
    }

    public BigDecimal calcTicketOrderAmount(PrepareVo vo) {
        /* 476 */
        BussTicketInfo tvo = vo.getTvo();
        /* 477 */
        BigDecimal multiply = tvo.getProductPrice().multiply(new BigDecimal(tvo.getpBasic().intValue()));
        /* 478 */
        return multiply;
    }


    public void createTicketOrderInfo(PrepareVo vo) {
        /* 487 */
        BussOrderInfo info = new BussOrderInfo();
        /* 488 */
        info.setPk(vo.getOut_trade_no());
        /* 489 */
        info.setOrderType(StringUtils.isBlank(vo.getOrderType()) ? "3" : vo.getOrderType());
        /* 490 */
        info.setOrderTime(DateUtils.getTime());
        /* 491 */
        info.setStationId(SecurityUtils.getUserStationId());
        /* 492 */
        info.setOrderPersion(SecurityUtils.getUid());
        /* 493 */
        info.setAmountofmoney(vo.getAmount());
        /* 494 */
        info.setNo14(JSON.toJSONString(vo));
        /* 495 */
        info.setNo15(vo.getPrepareInfo());

        /* 497 */
        info.setNo10(vo.getTvo().getRuleName());
        /* 498 */
        info.setNo3(vo.getTvo().getPk());
        /* 499 */
        info.setBatchNo(vo.getWx_trade_no());
        /* 500 */
        this.bussOrderInfoService.insertBussOrderInfo(info);
    }


    public void createRechargeOrderInfo(PrepareVo vo) {
        /* 505 */
        BussOrderInfo info = new BussOrderInfo();
        /* 506 */
        info.setPk(vo.getOut_trade_no());
        /* 507 */
        info.setOrderType(StringUtils.isBlank(vo.getOrderType()) ? "4" : vo.getOrderType());
        /* 508 */
        info.setOrderTime(DateUtils.getTime());

        /* 510 */
        info.setOrderPersion(SecurityUtils.getUid());
        /* 511 */
        info.setAmountofmoney(vo.getAmount());
        /* 512 */
        info.setNo14(JSON.toJSONString(vo));
        /* 513 */
        info.setNo15(vo.getPrepareInfo());
        /* 514 */
        info.setBatchNo(vo.getWx_trade_no());
        /* 515 */
        this.bussOrderInfoService.insertBussOrderInfo(info);
    }

    public RestResult prepareYjPayInfo(String desciption, String outTradeNo, BigDecimal amount, String openId) {
        /* 519 */
        Calendar calendar = Calendar.getInstance();
        /* 520 */
        calendar.set(12, calendar.get(12) + 15);
        /* 521 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        /* 522 */
        JSONObject params = new JSONObject();
        /* 523 */
        params.put("appid", "wx578320de8ea6562e");
        /* 524 */
        params.put("mchid", "1636136569");
        /* 525 */
        params.put("description", desciption);
        /* 526 */
        params.put("out_trade_no", outTradeNo);
        /* 527 */
        params.put("time_expire", sdf.format(calendar.getTime()));
        /* 528 */
        params.put("notify_url", WechatUrlConstants.PAY_V3_NOTIFY_YJ);
        /* 529 */
        JSONObject amount_json = new JSONObject();
        /* 530 */
        amount_json.put("total", Integer.valueOf(Integer.parseInt(amount_fee(amount))));
        /* 531 */
        params.put("amount", amount_json);
        /* 532 */
        JSONObject payer = new JSONObject();
        /* 533 */
        payer.put("openid", openId);
        /* 534 */
        params.put("payer", payer);

        /* 536 */
        JSONObject res = this.wechatPayV3Utils.sendPost("https://api.mch.weixin.qq.com/v3/pay/transactions/jsapi", params);

        /* 538 */
        if (res == null || StringUtils.isEmpty(res.getString("prepay_id"))) {
            /* 539 */
            return RestResult.fail("支付发起失败");
        }
        /* 541 */
        log.error("res.getString(\"prepay_id\")" + res.getString("prepay_id"));
        /* 542 */
        Map<String, String> prepay_id = prepareToApp(res.getString("prepay_id"), outTradeNo);
        /* 543 */
        return RestResult.ok(prepay_id);
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\BuildOrderInfoSevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */