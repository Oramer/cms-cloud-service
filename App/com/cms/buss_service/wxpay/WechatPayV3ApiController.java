package com.cms.buss_service.wxpay;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.OrderEnum;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.thread.TimeTaskFactory;
import com.cms.base_service.common.thread.TreadUtils;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.IdUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.buss_service.bucket.domain.BussBucketDetails;
import com.cms.buss_service.bucket.domain.BussBucketInfo;
import com.cms.buss_service.bucket.service.BussBucketDetailsService;
import com.cms.buss_service.bucket.service.BussBucketInfoService;
import com.cms.buss_service.card.domain.BussUserCard;
import com.cms.buss_service.card.mapper.BussUserCardMapper;
import com.cms.buss_service.coupon.domain.BussCoupon;
import com.cms.buss_service.coupon.domain.BussUserCoupon;
import com.cms.buss_service.coupon.domain.BussUserCouponRecord;
import com.cms.buss_service.coupon.service.BussUserCouponRecordService;
import com.cms.buss_service.coupon.service.BussUserCouponService;
import com.cms.buss_service.order.domain.BussOrderInfo;
import com.cms.buss_service.order.service.BussOrderInfoService;
import com.cms.buss_service.order.service.BussOrderInfoTicketService;
import com.cms.buss_service.order.service.BussReceiverMessageService;
import com.cms.buss_service.poster.service.BussPosterDispatchRewardRecordService;
import com.cms.buss_service.poster.service.BussPosterDistanceDeductService;
import com.cms.buss_service.product.domain.BussProductBrand;
import com.cms.buss_service.product.domain.BussProductInfo;
import com.cms.buss_service.product.service.BussProductInfoService;
import com.cms.buss_service.station.domain.BussWaterStationInfo;
import com.cms.buss_service.station.service.BussStationClimbFeeService;
import com.cms.buss_service.station.service.BussWaterStationInfoService;
import com.cms.buss_service.ticket.domain.BussTicketInfo;
import com.cms.buss_service.ticket.domain.BussTicketUsedRecord;
import com.cms.buss_service.ticket.domain.BussUserTicketInfo;
import com.cms.buss_service.ticket.service.BussTicketInfoService;
import com.cms.buss_service.ticket.service.BussTicketUsedRecordService;
import com.cms.buss_service.ticket.service.BussUserTicketInfoService;
import com.cms.buss_service.yjuser.domain.BussYjOrderInfo;
import com.cms.buss_service.yjuser.service.BussYjOrderInfoService;
import com.cms.system_service.system.mapper.SysUserMapper;
import com.cms.system_service.system.service.ISysUserService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/wechatPay/v3"})
public class WechatPayV3ApiController extends BaseCtl {
    /*  63 */   private static final Logger log = LoggerFactory.getLogger(com.cms.buss_service.wxpay.WechatPayV3ApiController.class);

    @Autowired
    protected WechatPayV3Utils wechatPayV3Utils;

    @Autowired
    protected BuildOrderInfoSevice buildService;

    @Autowired
    protected BussOrderInfoService bussOrderInfoService;

    @Autowired
    protected BussOrderInfoTicketService bussOrderInfoTicketService;

    @Autowired
    protected BussTicketInfoService bussTicketInfoService;

    @Autowired
    protected BussUserTicketInfoService bussUserTicketInfoService;

    @Autowired
    protected BussTicketUsedRecordService bussTicketUsedRecordService;

    @Autowired
    protected BussStationClimbFeeService bussStationClimbFeeService;

    @Autowired
    protected ISysUserService sysUserService;

    @Autowired
    private BussProductInfoService bussProductInfoService;
    @Autowired
    protected BussUserCouponService bussUserCouponService;
    @Autowired
    protected BussUserCouponRecordService bussUserCouponRecordService;
    @Autowired
    protected BussReceiverMessageService bussReceiverMessageService;
    @Autowired
    protected BussWaterStationInfoService bussWaterStationInfoService;
    @Autowired
    protected BussPosterDispatchRewardRecordService bussPosterDispatchRewardRecordService;
    @Autowired
    protected BussPosterDistanceDeductService bussPosterDistanceDeductService;
    @Autowired
    protected BussBucketInfoService bussBucketInfoService;
    @Autowired
    protected BussBucketDetailsService bussBucketDetailsService;
    @Autowired(required = false)
    private BussUserCardMapper bussUserCardMapper;
    @Autowired(required = false)
    private SysUserMapper sysUserMapper;
    @Autowired
    private BussYjOrderInfoService bussYjOrderInfoService;

    @PostMapping({"/wechatPay"})
    public RestResult wechatPay(@RequestBody PrepareVo vo) {
        /* 121 */
        vo = this.buildService.calcOrderAmount(vo);
        /* 122 */
        BigDecimal amount = vo.getVarifyFree();
        /* 123 */
        System.out.println("后端计算的价格:" + amount + "前端计算的价格:" + vo.getAmount());
        /* 124 */
        if (vo.getAmount().compareTo(amount) != 0) {
            /* 125 */
            return RestResult.fail("订单总价信息异常,请刷新页面重试");
        }
        /* 127 */
        if (amount.compareTo(BigDecimal.ZERO) == 0) {
            /* 128 */
            vo.setUserId(SecurityUtils.getUid());
            /* 129 */
            vo.setStationUser(SecurityUtils.getStationCharge());
            /* 130 */
            vo.setStationId(String.valueOf(SecurityUtils.getUserStationId()));
            /* 131 */
            String odno = this.buildService.createZEROAmountOrderInfo(vo);
            /* 132 */
            orderCallBackOptionForPD(odno);
            /* 133 */
            return RestResult.ok("统一下单成功", Integer.valueOf(-1));
        }
        /* 135 */
        vo.setAmount(amount);
        /* 136 */
        vo.setOut_trade_no(IdUtils.createOrderNo("PO"));
        /* 137 */
        RestResult rss = this.buildService.preparePayInfo("水站产品购买", vo.getOut_trade_no(), vo.getAmount(), vo.getOpenid());
        /* 138 */
        String prepareInfo = JSON.toJSONString(rss.getData());
        /* 139 */
        WxReturnVo rt = (WxReturnVo) JSON.parseObject(prepareInfo, WxReturnVo.class);
        /* 140 */
        vo.setPrepareInfo(prepareInfo);
        /* 141 */
        vo.setWx_trade_no(rt.getWx_trade_no());
        /* 142 */
        vo.setUserId(SecurityUtils.getUid());
        /* 143 */
        vo.setStationUser(SecurityUtils.getStationCharge());
        /* 144 */
        vo.setStationId(String.valueOf(SecurityUtils.getUserStationId()));
        /* 145 */
        this.buildService.createOrderInfo(vo);
        /* 146 */
        return RestResult.ok("统一下单成功", prepareInfo);
    }


    @PostMapping({"/wechatPay_yj"})
    public RestResult wechatPayForYj(@RequestBody PrepareVo vo) {
        /* 157 */
        String wtid = this.sysUserMapper.queryUserGroupId(SecurityUtils.getUid());
        /* 158 */
        if (StringUtils.isBlank(wtid)) {
            /* 159 */
            return RestResult.fail("当前尚未开通月结服务,请联系水站开通后重试");
        }
        /* 161 */
        vo = this.buildService.calcOrderAmount(vo);
        /* 162 */
        BigDecimal amount = vo.getVarifyFree();
        /* 163 */
        System.out.println("后端计算的价格:" + amount + "前端计算的价格:" + vo.getAmount());
        /* 164 */
        if (vo.getAmount().compareTo(amount) != 0) {
            /* 165 */
            return RestResult.fail("订单总价信息异常,请刷新页面重试");
        }

        /* 168 */
        vo.setUserId(SecurityUtils.getUid());
        /* 169 */
        vo.setStationUser(SecurityUtils.getStationCharge());
        /* 170 */
        vo.setStationId(String.valueOf(SecurityUtils.getUserStationId()));
        /* 171 */
        String odno = this.buildService.createYjOrderInfo(vo);
        /* 172 */
        orderCallBackOptionForPD(odno);
        /* 173 */
        return RestResult.ok("统一下单成功", Integer.valueOf(-1));
    }


    private void sendSocketMsg(String userId) {
        /* 184 */
        TreadUtils.me().execute((TimerTask) new Object());
    }


    @PostMapping({"/bucketPay"})
    public RestResult wechatPayForBucketOrder(@RequestBody PrepareVo vo) {
        /* 201 */
        BigDecimal amount = this.buildService.calcBucketOrderAmount(vo);
        /* 202 */
        vo.setAmount(amount);
        /* 203 */
        vo.setOut_trade_no(IdUtils.createOrderNo("BO"));
        /* 204 */
        RestResult rss = this.buildService.preparePayInfo("水站压桶信息", vo.getOut_trade_no(), vo.getAmount(), vo.getOpenid());
        /* 205 */
        String prepareInfo = JSON.toJSONString(rss.getData());
        /* 206 */
        log.error(prepareInfo);
        /* 207 */
        WxReturnVo rt = (WxReturnVo) JSON.parseObject(prepareInfo, WxReturnVo.class);
        /* 208 */
        vo.setPrepareInfo(prepareInfo);
        /* 209 */
        vo.setWx_trade_no(rt.getWx_trade_no());
        /* 210 */
        vo.setUserId(SecurityUtils.getUid());

        /* 212 */
        this.buildService.createBucketOrderInfo(vo);
        /* 213 */
        return RestResult.ok("统一下单成功", prepareInfo);
    }


    @PostMapping({"/ticketPay"})
    public RestResult wechatPayForTicketOrder(@RequestBody PrepareVo vo) {
        /* 224 */
        BigDecimal amount = this.buildService.calcTicketOrderAmount(vo);
        /* 225 */
        vo.setAmount(amount);
        /* 226 */
        vo.setOut_trade_no(IdUtils.createOrderNo("TO"));
        /* 227 */
        RestResult rss = this.buildService.preparePayInfo("水票购买 " + vo.getTvo().getRuleName(), vo.getOut_trade_no(), vo.getAmount(), vo.getOpenid());
        /* 228 */
        String prepareInfo = JSON.toJSONString(rss.getData());
        /* 229 */
        WxReturnVo rt = (WxReturnVo) JSON.parseObject(prepareInfo, WxReturnVo.class);
        /* 230 */
        vo.setPrepareInfo(prepareInfo);
        /* 231 */
        vo.setWx_trade_no(rt.getWx_trade_no());
        /* 232 */
        vo.setUserId(SecurityUtils.getUid());
        /* 233 */
        this.buildService.createTicketOrderInfo(vo);
        /* 234 */
        return RestResult.ok("统一下单成功", prepareInfo);
    }


    @PostMapping({"/rechargePay"})
    public RestResult wechatPayForRecharge(@RequestBody PrepareVo vo) {
        /* 245 */
        vo.setAmount(vo.getAmount());
        /* 246 */
        vo.setOut_trade_no(IdUtils.get());
        /* 247 */
        RestResult rss = this.buildService.preparePayInfo("用户预充值 ", vo.getOut_trade_no(), vo.getAmount(), vo.getOpenid());
        /* 248 */
        String prepareInfo = JSON.toJSONString(rss.getData());
        /* 249 */
        WxReturnVo rt = (WxReturnVo) JSON.parseObject(prepareInfo, WxReturnVo.class);
        /* 250 */
        vo.setPrepareInfo(prepareInfo);
        /* 251 */
        vo.setWx_trade_no(rt.getWx_trade_no());
        /* 252 */
        vo.setUserId(SecurityUtils.getUid());
        /* 253 */
        this.buildService.createRechargeOrderInfo(vo);
        /* 254 */
        return RestResult.ok("统一下单成功", prepareInfo);
    }


    @PostMapping({"/checkPay"})
    public RestResult checkPay(@RequestBody String out_trade_no) {
        /* 265 */
        String status = orderQueryByOutTradeNo(out_trade_no);
        /* 266 */
        log.info("检查支付状态信息........" + out_trade_no + "............." + status);
        /* 267 */
        if ("SUCCESS".equalsIgnoreCase(status)) {
            /* 268 */
            successPayCallBack(out_trade_no);
        }
        /* 270 */
        return RestResult.ok("请求成功", status);
    }


    @PostMapping({"/checkPayForYj"})
    public RestResult checkPayForYj(@RequestBody String out_trade_no) {
        /* 276 */
        String status = orderQueryByOutTradeNo(out_trade_no);
        /* 277 */
        log.info("检查支付状态信息........" + out_trade_no + "............." + status);
        /* 278 */
        if ("SUCCESS".equalsIgnoreCase(status)) {
            /* 279 */
            successPayCallBackForYj(out_trade_no);
        }
        /* 281 */
        return RestResult.ok("请求成功", status);
    }


    @PostMapping({"/wechatRefund"})
    public RestResult wechatRefund(String transaction_id) {
        /* 299 */
        Long userId = Long.valueOf(1L);
        /* 300 */
        BigDecimal amount = new BigDecimal("5.06");
        /* 301 */
        String reason = "退款";



        /* 305 */
        String out_refund_no = IdUtils.get();
        /* 306 */
        JSONObject params = new JSONObject();
        /* 307 */
        params.put("out_trade_no", "PO1648945581846683648");
        /* 308 */
        params.put("out_refund_no", out_refund_no);
        /* 309 */
        params.put("reason", reason);
        /* 310 */
        params.put("notify_url", "https://www.allinkwater.com/wxapi/api/wechatPay/v3/wechatRefundNotify");
        /* 311 */
        JSONObject amountJson = new JSONObject();
        /* 312 */
        amountJson.put("refund", Integer.valueOf(Integer.parseInt(this.buildService.amount_fee(amount))));
        /* 313 */
        amountJson.put("total", Integer.valueOf(Integer.parseInt(this.buildService.amount_fee(amount))));
        /* 314 */
        amountJson.put("currency", "CNY");
        /* 315 */
        params.put("amount", amountJson);
        /* 316 */
        JSONObject res = this.wechatPayV3Utils.sendPost("https://api.mch.weixin.qq.com/v3/refund/domestic/refunds", params);
        /* 317 */
        if (res == null) {
            /* 319 */
            return RestResult.fail("退款申请失败");
        }
        /* 321 */
        log.info("微信退款单号：" + res.getString("refund_id"));

        /* 323 */
        return RestResult.ok();
    }


    @PostMapping({"/wechatPayNotify"})
    public Map<String, String> wechatPayNotify(HttpServletRequest request) {
        /* 335 */
        log.info("微信支付回调:>>>>>>>>");
        /* 336 */
        Map<String, String> result = new HashMap<>(2);
        /* 337 */
        JSONObject res = this.wechatPayV3Utils.getCallbackData(request);
        /* 338 */
        log.info("微信支付回调:>>>>>>>>", res);

        /* 340 */
        if (res == null) {
            /* 341 */
            result.put("code", "FAIL");
            /* 342 */
            result.put("message", "失败");
            /* 343 */
            return result;
        }

        /* 346 */
        Object odd = res.get("out_trade_no");
        /* 347 */
        String out_trade_no = String.valueOf(odd);
        /* 348 */
        log.info("最终拿到的微信支付通知数据：" + res);
        /* 349 */
        log.info("最终拿到的微信支付通知数据外部订单号：" + out_trade_no);

        /* 351 */
        if (StringUtils.isNotBlank(out_trade_no)) {
            /* 352 */
            successPayCallBack(out_trade_no);
        }
        /* 354 */
        result.put("code", "SUCCESS");
        /* 355 */
        result.put("message", "OK");
        /* 356 */
        return result;
    }

    @PostMapping({"/yjNotify"})
    public Map<String, String> yjNotify(HttpServletRequest request) {
        /* 361 */
        log.info("月结支付回调:>>>>>>>>");
        /* 362 */
        Map<String, String> result = new HashMap<>(2);
        /* 363 */
        JSONObject res = this.wechatPayV3Utils.getCallbackData(request);
        /* 364 */
        log.info("月结信支付回调:>>>>>>>>", res);

        /* 366 */
        if (res == null) {
            /* 367 */
            result.put("code", "FAIL");
            /* 368 */
            result.put("message", "失败");
            /* 369 */
            return result;
        }

        /* 372 */
        Object odd = res.get("out_trade_no");
        /* 373 */
        String out_trade_no = String.valueOf(odd);
        /* 374 */
        log.info("最终拿到的微信支付通知数据：" + res);
        /* 375 */
        log.info("最终拿到的微信支付通知数据外部订单号：" + out_trade_no);

        /* 377 */
        if (StringUtils.isNotBlank(out_trade_no)) {
            /* 378 */
            successPayCallBackForYj(out_trade_no);
        }
        /* 380 */
        result.put("code", "SUCCESS");
        /* 381 */
        result.put("message", "OK");
        /* 382 */
        return result;
    }


    private void successPayCallBackForYj(String out_trade_no) {
        /* 391 */
        if (StringUtils.isNotBlank(out_trade_no)) {
            /* 392 */
            BussYjOrderInfo info = this.bussYjOrderInfoService.selectBussYjOrderInfoById(out_trade_no);
            /* 393 */
            if (info != null && info.getOrderStatus().longValue() == 1L) {
                /* 394 */
                info.setOrderStatus(Long.valueOf(2L));
                /* 395 */
                info.setOrderPayTime(DateUtils.getTime());
                /* 396 */
                this.bussYjOrderInfoService.updateBussYjOrderInfo(info);
            }
        }
    }


    @Transactional(rollbackFor = {Exception.class})
    public void successPayCallBack(String out_trade_no) {
        /* 408 */
        log.info("支付成功业务操作开始..........外部单号为:" + out_trade_no);
        /* 409 */
        BussOrderInfo info = this.bussOrderInfoService.selectBussOrderInfoById(out_trade_no);
        /* 410 */
        BussWaterStationInfo st = null;
        /* 411 */
        if (info.getStationId() != null) {
            /* 412 */
            st = this.bussWaterStationInfoService.selectBussWaterStationInfoById(info.getStationId());
        }

        /* 415 */
        if (!OrderEnum.ORDER_DZF.getCode().equals(info.getOrderStatus())) {
            /* 416 */
            log.info("支付成功业务操作重复回调 主动结束:" + out_trade_no);

            return;
        }

        /* 421 */
        if (info.getOrderStatus().equals(OrderEnum.ORDER_DZF.getCode())) {
            /* 422 */
            clearPrepareInfo(info);
        }
        /* 424 */
        PrepareVo vo = (PrepareVo) JSON.parseObject(info.getNo14(), PrepareVo.class);

        /* 426 */
        if (out_trade_no.startsWith("TO")) {

            /* 428 */
            sendTicketForUser(info, vo);



            /* 432 */
            if (st != null) {
                /* 433 */
                sendSystemMsg(st.getStationCharge(), out_trade_no);
            }
        }

        /* 437 */
        if (out_trade_no.startsWith("PO")) {
            /* 439 */
            if ("1".equalsIgnoreCase(info.getOrderType())) {

                /* 441 */
                updateOrderBucketInfo(vo, out_trade_no, info);

                /* 443 */
                updateOrderTicketInfo(vo, out_trade_no);

                /* 445 */
                updateOrderCouponInfo(vo, out_trade_no);



                /* 449 */
                if (st != null) {
                    /* 450 */
                    sendSystemMsg(st.getStationCharge(), out_trade_no);
                }

                /* 453 */
                cleanUserCard(vo, info);
            }
        }

        /* 457 */
        if (out_trade_no.startsWith("BO")) {
            /* 458 */
            BussBucketInfo binf = this.bussBucketInfoService.selectBussBucketInfoById(vo.getYtOrderPk());
            /* 459 */
            if (binf != null) {

                /* 461 */
                binf.setStatus("2");
                /* 462 */
                binf.setRecordType("2");
                /* 463 */
                this.bussBucketInfoService.updateBussBucketInfo(binf);
            }
        }












































        /* 510 */
        log.info("支付成功业务操作结束....................");
    }

    private void sendSystemMsg(String stationUser, String out_trade_no) {
        /* 514 */
        TreadUtils.me().execute(TimeTaskFactory.sendMessage(stationUser, out_trade_no));
        /* 515 */
        sendSocketMsg(stationUser);
    }

    @Transactional(rollbackFor = {Exception.class})
    public void orderCallBackOptionForPD(String out_trade_no) {
        /* 520 */
        BussOrderInfo info = this.bussOrderInfoService.selectBussOrderInfoById(out_trade_no);
        /* 521 */
        PrepareVo vo = (PrepareVo) JSON.parseObject(info.getNo14(), PrepareVo.class);

        /* 523 */
        updateOrderBucketInfo(vo, out_trade_no, info);

        /* 525 */
        updateOrderTicketInfo(vo, out_trade_no);

        /* 527 */
        updateOrderCouponInfo(vo, out_trade_no);



        /* 531 */
        cleanUserCard(vo, info);
        /* 532 */
        BussWaterStationInfo st = null;
        /* 533 */
        if (info.getStationId() != null) {
            /* 534 */
            st = this.bussWaterStationInfoService.selectBussWaterStationInfoById(info.getStationId());
        }
        /* 536 */
        sendSocketMsg(st.getStationCharge());
    }

    private void cleanUserCard(PrepareVo vo, BussOrderInfo info) {
        /* 540 */
        List<ProductVo> vo1 = vo.getVo();
        /* 541 */
        if (vo1 != null && vo1.size() > 0) {
            /* 542 */
            vo1.forEach(is -> {
                BussUserCard cd = this.bussUserCardMapper.queryCardByUserIdAndProductId(is.getProductPk(), vo.getUserId());
                if (cd != null) {
                    this.bussUserCardMapper.deleteBussUserCardById(cd.getPk());
                }
            });
        }
    }


    private void clearPrepareInfo(BussOrderInfo info) {
        /* 561 */
        info.setOrderStatus(OrderEnum.ORDER_YZF.getCode());
        /* 562 */
        info.setOrderPayTime(DateUtils.getTime());
        /* 563 */
        info.setNo15("");
        /* 564 */
        this.bussOrderInfoService.updateBussOrderInfo(info);
    }


    private void sendTicketForUser(BussOrderInfo info, PrepareVo vo) {
        /* 574 */
        BussTicketInfo bussTicketInfo = this.bussTicketInfoService.selectBussTicketInfoById(info.getNo3());

        /* 576 */
        BussUserTicketInfo ts = new BussUserTicketInfo();
        /* 577 */
        ts.setProductId(vo.getTvo().getProductPk());
        /* 578 */
        ts.setUserId(vo.getUserId());
        /* 579 */
        List<BussUserTicketInfo> tssList = this.bussUserTicketInfoService.selectBussUserTicketInfoList(ts);
        /* 580 */
        if (tssList != null && tssList.size() > 0) {

            /* 582 */
            BussUserTicketInfo ticketInfo = tssList.get(0);
            /* 583 */
            Integer ticketAccount = ticketInfo.getTicketAccount();
            /* 584 */
            int currentAco = bussTicketInfo.getpBasic().intValue() + bussTicketInfo.getpBonus().intValue();
            /* 585 */
            ticketInfo.setTicketAccount(Integer.valueOf(ticketAccount.intValue() + currentAco));
            /* 586 */
            int ihistory = Integer.valueOf(ticketInfo.getNo1()).intValue() + currentAco;
            /* 587 */
            ticketInfo.setNo1(String.valueOf(ihistory));
            /* 588 */
            this.bussUserTicketInfoService.updateBussUserTicketInfo(ticketInfo);
        } else {

            /* 591 */
            int icount = bussTicketInfo.getpBasic().intValue() + bussTicketInfo.getpBonus().intValue();
            /* 592 */
            BussUserTicketInfo ticketInfo = new BussUserTicketInfo();
            /* 593 */
            ticketInfo.setUserId(info.getOrderPersion());
            /* 594 */
            ticketInfo.setProductId(vo.getTvo().getProductPk());
            /* 595 */
            ticketInfo.setOrderId(info.getPk());
            /* 596 */
            ticketInfo.setTicketId(info.getNo3());
            /* 597 */
            ticketInfo.setTicketAccount(Integer.valueOf(icount));
            /* 598 */
            ticketInfo.setNo1(String.valueOf(icount));
            /* 599 */
            this.bussUserTicketInfoService.insertBussUserTicketInfo(ticketInfo);
        }
        /* 601 */
        log.info("水票信息发送成功..........");
    }


    @Transactional(rollbackFor = {Exception.class})
    protected void updateOrderBucketInfo(PrepareVo vo, String out_trade_no, BussOrderInfo info) {
        /* 611 */
        log.info("支付成功 桶业务处理Start.........." + out_trade_no + "用户勾选的是压桶么?" + vo.getChoseYt());
        /* 612 */
        BussBucketInfo infos = new BussBucketInfo();
        /* 613 */
        String indi = IdUtils.createOrderNo("BK");

        /* 615 */
        Integer count = Integer.valueOf(0);
        /* 616 */
        Integer needYt = Integer.valueOf(0);
        /* 617 */
        List<ProductVo> vo1 = vo.getVo();
        /* 618 */
        for (int i = 0; i < vo1.size(); i++) {
            /* 619 */
            ProductVo item = vo1.get(i);
            /* 620 */
            if ("Y".equalsIgnoreCase(item.getNeedyt())) {
                /* 621 */
                needYt = Integer.valueOf(needYt.intValue());
                /* 622 */
                if (StringUtils.isNotBlank(item.getPay_count())) {
                    /* 623 */
                    count = Integer.valueOf(count.intValue() - Integer.parseInt(item.getPay_count()));
                }
                /* 625 */
                BussProductInfo pdd = this.bussProductInfoService.selectBussProductInfoById(item.getProductPk());
                /* 626 */
                BussProductBrand brand = pdd.getBrand();



                /* 630 */
                BussBucketDetails dds = new BussBucketDetails();
                /* 631 */
                dds.setBrandName(item.getBrandPk());
                /* 632 */
                dds.setArecordPk(indi);
                /* 633 */
                List<BussBucketDetails> dsList = this.bussBucketDetailsService.selectBussBucketDetailsList(dds);
                /* 634 */
                if (dsList != null && dsList.size() > 0) {

                    /* 636 */
                    BussBucketDetails bussBucketDetails = dsList.get(0);
                    /* 637 */
                    int counts = bussBucketDetails.getCount().intValue() - Integer.parseInt(item.getPay_count());
                    /* 638 */
                    bussBucketDetails.setCount(Integer.valueOf(counts));
                    /* 639 */
                    this.bussBucketDetailsService.updateBussBucketDetails(bussBucketDetails);
                } else {
                    /* 641 */
                    BussBucketDetails red = new BussBucketDetails();
                    /* 642 */
                    red.setArecordPk(indi);
                    /* 643 */
                    red.setNo8(brand.getBrandName());
                    /* 644 */
                    red.setNo9(info.getOrderPersion());
                    /* 645 */
                    red.setCount(Integer.valueOf(Integer.parseInt(item.getPay_count())));
                    /* 646 */
                    red.setOrderPk(out_trade_no);
                    /* 647 */
                    red.setBrandName(item.getBrandPk());
                    /* 648 */
                    this.bussBucketDetailsService.insertBussBucketDetails(red);
                }
            }
        }
        /* 652 */
        if (needYt.intValue() > 0) {
            /* 653 */
            infos.setPk(indi);
            /* 654 */
            infos.setOrderPk(out_trade_no);
            /* 655 */
            infos.setStationPk(vo.getStationId());
            /* 656 */
            infos.setPosterPk(info.getNo5());
            /* 657 */
            infos.setUserPk(info.getOrderPersion());

            /* 659 */
            infos.setStatus(vo.getChoseYt().booleanValue() ? "2" : "1");
            /* 660 */
            infos.setRecordType(vo.getChoseYt().booleanValue() ? "2" : "1");
            /* 661 */
            infos.setNo1(count);
            /* 662 */
            this.bussBucketInfoService.insertBussBucketInfo(infos);
        }



































        /* 699 */
        log.info("支付成功 退压桶业务处理End.........." + out_trade_no);
    }


    @Transactional(rollbackFor = {Exception.class})
    protected void updateOrderTicketInfo(PrepareVo vo, String out_trade_no) {
        /* 707 */
        log.info("支付成功 水票业务处理Start.........." + out_trade_no);
        /* 708 */
        List<BussUserTicketInfo> tvos = vo.getTvos();
        /* 709 */
        vo.getVo().forEach(item -> {
            BussProductInfo pdd = this.bussProductInfoService.selectBussProductInfoById(item.getProductPk());

            if (tvos != null && tvos.size() > 0) {
                boolean present = tvos.stream().findAny().isPresent();

                if (present) {
                    BussUserTicketInfo infos = tvos.stream().findFirst().get();

                    if (infos != null && infos.getPk() != null) {
                        int ss = ((infos.getTicketAccount().intValue() > Integer.valueOf(item.getPay_count()).intValue()) ? Integer.valueOf(item.getPay_count()) : infos.getTicketAccount()).intValue();

                        BussTicketUsedRecord record = new BussTicketUsedRecord(out_trade_no, pdd.getPk(), infos.getPk(), String.valueOf(ss));
                        record.setStatus(Integer.valueOf(1));
                        this.bussTicketUsedRecordService.insertBussTicketUsedRecord(record);
                        BussUserTicketInfo ticketInfo = this.bussUserTicketInfoService.selectBussUserTicketInfoById(infos.getPk());
                        Integer akl = ticketInfo.getTicketAccount();
                        Integer usedCount = Integer.valueOf(ss);
                        int iss = akl.intValue() - usedCount.intValue();
                        ticketInfo.setTicketAccount(Integer.valueOf((iss >= 0) ? iss : 0));
                        this.bussUserTicketInfoService.updateBussUserTicketInfo(ticketInfo);
                    }
                }
            }
        });
        /* 734 */
        log.info("支付成功 水票业务处理END.........." + out_trade_no);
    }


    @Transactional(rollbackFor = {Exception.class})
    protected void updateOrderCouponInfo(PrepareVo vo, String out_trade_no) {
        /* 745 */
        log.info("支付成功 优惠券业务处理Start.........." + out_trade_no);
        /* 746 */
        BussCoupon conpon = vo.getConpon();
        /* 747 */
        if (conpon != null && StringUtils.isNotBlank(conpon.getPk())) {
            /* 748 */
            BussUserCoupon cp = new BussUserCoupon();
            /* 749 */
            cp.setUserPk(vo.getUserId());
            /* 750 */
            cp.setCouponPk(conpon.getPk());
            /* 751 */
            List<BussUserCoupon> coupons = this.bussUserCouponService.selectBussUserCouponList(cp);
            /* 752 */
            if (coupons != null && coupons.size() > 0) {
                /* 753 */
                coupons.forEach(is -> {
                    is.setWhetherToUse("Y");

                    this.bussUserCouponService.updateBussUserCoupon(is);

                    BussUserCouponRecord red = new BussUserCouponRecord();
                    red.setOrderId(out_trade_no);
                    red.setUserId(vo.getUserId());
                    red.setUserCouponId(String.valueOf(is.getId()));
                    this.bussUserCouponRecordService.insertBussUserCouponRecord(red);
                });
            }
        }
        /* 766 */
        log.info("支付成功 优惠券业务处理End.........." + out_trade_no);
    }


    @PostMapping({"/wechatRefundNotify"})
    public Map<String, String> wechatRefundNotify(HttpServletRequest request) {
        /* 777 */
        Map<String, String> result = new HashMap<>(2);
        /* 778 */
        JSONObject res = this.wechatPayV3Utils.getCallbackData(request);
        /* 779 */
        if (res == null) {
            /* 780 */
            result.put("code", "FAIL");
            /* 781 */
            result.put("message", "失败");
            /* 782 */
            return result;
        }
        /* 784 */
        log.info("最终拿到的微信退款通知数据：" + res);

        /* 786 */
        result.put("code", "SUCCESS");
        /* 787 */
        result.put("message", "OK");
        /* 788 */
        return result;
    }


    public String orderQueryByOutTradeNo(String out_trade_no) {
        /* 798 */
        JSONObject res = this.wechatPayV3Utils.sendGet(String.format("https://api.mch.weixin.qq.com/v3/pay/transactions/out-trade-no/%s?mchid=%s", new Object[]{out_trade_no, "1636136569"}));
        /* 799 */
        return (res == null) ? null : res.getString("trade_state");
    }


    public JSONObject refundQuery(String out_refund_no) {
        /* 809 */
        return this.wechatPayV3Utils.sendGet(String.format("https://api.mch.weixin.qq.com/v3/refund/domestic/refunds/%s", new Object[]{out_refund_no}));
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\WechatPayV3ApiController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */