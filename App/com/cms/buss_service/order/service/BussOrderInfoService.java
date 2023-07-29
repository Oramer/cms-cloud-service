package com.cms.buss_service.order.service;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.cms.base_service.common.MathUtils;
import com.cms.base_service.common.model.BucketEnum;
import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.model.OrderEnum;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.IdUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.exception.BusinessException;
import com.cms.buss_service.bucket.domain.BucketVoForPd;
import com.cms.buss_service.bucket.domain.BussBucketDetails;
import com.cms.buss_service.bucket.domain.BussBucketInfo;
import com.cms.buss_service.bucket.domain.HytProductVo;
import com.cms.buss_service.bucket.service.BussBucketBackRecordService;
import com.cms.buss_service.bucket.service.BussBucketDetailsService;
import com.cms.buss_service.bucket.service.BussBucketInfoService;
import com.cms.buss_service.order.domain.BaseOrder;
import com.cms.buss_service.order.domain.BussOrderInfo;
import com.cms.buss_service.order.domain.BussOrderTransferRecord;
import com.cms.buss_service.order.domain.BussReceiverMessage;
import com.cms.buss_service.order.mapper.BussOrderInfoMapper;
import com.cms.buss_service.order.service.BussOrderProductInfoService;
import com.cms.buss_service.order.service.BussOrderTransferRecordService;
import com.cms.buss_service.order.service.BussReceiverMessageService;
import com.cms.buss_service.poster.controller.BusinessConst;
import com.cms.buss_service.poster.domain.BussPosterDispatchRewardRecord;
import com.cms.buss_service.poster.domain.BussPosterDistanceDeduct;
import com.cms.buss_service.poster.domain.BussStationPoster;
import com.cms.buss_service.poster.service.BussPosterDispatchRewardRecordService;
import com.cms.buss_service.poster.service.BussPosterDistanceDeductService;
import com.cms.buss_service.poster.service.BussStationPosterService;
import com.cms.buss_service.station.domain.BussStationInountRecord;
import com.cms.buss_service.station.domain.BussWaterStationInfo;
import com.cms.buss_service.station.service.BussStationClimbFeeService;
import com.cms.buss_service.station.service.BussStationInountRecordService;
import com.cms.buss_service.station.service.BussStationInountService;
import com.cms.buss_service.station.service.BussWaterStationInfoService;
import com.cms.buss_service.yjuser.domain.BussYjOrderInfo;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.service.ISysUserService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BussOrderInfoService {
    /*  54 */   private static final Logger log = LoggerFactory.getLogger(com.cms.buss_service.order.service.BussOrderInfoService.class);

    @Autowired(required = false)
    private BussOrderInfoMapper bussOrderInfoMapper;

    @Autowired
    private BussBucketBackRecordService bussBucketBackRecordService;

    @Autowired
    private BussBucketInfoService bussBucketInfoService;

    @Autowired
    private BussBucketDetailsService bussBucketDetailsService;

    @Autowired
    protected BussOrderProductInfoService bussOrderProductInfoService;

    @Autowired
    private BussStationPosterService bussStationPosterService;

    @Autowired
    protected BussWaterStationInfoService bussWaterStationInfoService;

    @Autowired
    protected BussReceiverMessageService bussReceiverMessageService;
    @Autowired
    protected BussPosterDispatchRewardRecordService bussPosterDispatchRewardRecordService;
    @Autowired
    protected BussPosterDistanceDeductService bussPosterDistanceDeductService;
    @Autowired
    protected BussStationClimbFeeService bussStationClimbFeeService;
    @Autowired
    protected BussStationInountRecordService bussStationInountRecordService;
    @Autowired
    protected BussStationInountService bssStationInountService;
    @Autowired
    protected ISysUserService sysUserService;
    @Autowired
    protected BussOrderTransferRecordService bussOrderTransferRecordService;

    public BussOrderInfo selectBussOrderInfoById(String pk) {
        /*  95 */
        return this.bussOrderInfoMapper.selectBussOrderInfoById(pk);
    }


    public List<BussOrderInfo> selectBussOrderInfoList(BussOrderInfo bussOrderInfo) {
        /* 105 */
        return this.bussOrderInfoMapper.selectBussOrderInfoList(bussOrderInfo);
    }


    public int insertBussOrderInfo(BussOrderInfo bussOrderInfo) {
        /* 116 */
        bussOrderInfo.setCreateBy(SecurityUtils.getUid());
        /* 117 */
        bussOrderInfo.setCreateTime(DateUtils.getTime());
        /* 118 */
        return this.bussOrderInfoMapper.insertBussOrderInfo(bussOrderInfo);
    }


    public int updateBussOrderInfo(BussOrderInfo bussOrderInfo) {
        /* 129 */
        bussOrderInfo.setUpdateTime(DateUtils.getTime());
        /* 130 */
        return this.bussOrderInfoMapper.updateBussOrderInfo(bussOrderInfo);
    }


    public int deleteBussOrderInfoByIds(String[] pks) {
        /* 140 */
        return this.bussOrderInfoMapper.deleteBussOrderInfoByIds(pks);
    }


    public int deleteBussOrderInfoById(String pk) {
        /* 150 */
        return this.bussOrderInfoMapper.deleteBussOrderInfoById(pk);
    }

    public List<BussOrderInfo> selectBussOrderInvoiceList(BussOrderInfo bussOrderInfo) {
        /* 154 */
        return this.bussOrderInfoMapper.selectBussOrderInvoiceList(bussOrderInfo);
    }

    public Map<String, Object> queryUserLastOrderInfo(String userPk) {
        /* 158 */
        return this.bussOrderInfoMapper.queryUserLastOrderInfo(userPk);
    }

    public Map<String, Object> queryMyStationInTjInfo(BussOrderInfo info) {
        /* 162 */
        return this.bussOrderInfoMapper.queryMyStationInTjInfo(info);
    }

    public List<BussOrderInfo> selectUserReminderList(BussOrderInfo bussOrderInfo) {
        /* 166 */
        return this.bussOrderInfoMapper.selectUserReminderList(bussOrderInfo);
    }

    public Map<String, Object> queryPosterTjInfo(BussOrderInfo info) {
        /* 170 */
        return this.bussOrderInfoMapper.queryPosterTjInfo(info);
    }

    public List<BussOrderInfo> queryBucketList(BussOrderInfo bussOrderInfo) {
        /* 174 */
        return this.bussOrderInfoMapper.queryBucketList(bussOrderInfo);
    }

    public void cancelOrderPd(BussOrderInfo info) {
        /* 178 */
        this.bussOrderInfoMapper.cancelOrderPd(info);
    }

    public Map<String, Object> queryOrderGroupInfo(BussOrderInfo info) {
        /* 182 */
        return this.bussOrderInfoMapper.queryOrderGroupInfo(info);
    }

    public Map<String, Object> queryOrderCount(BussOrderInfo info) {
        /* 186 */
        return this.bussOrderInfoMapper.queryOrderCount(info);
    }

    public List<BussBucketDetails> queryUserYtInfo(BussBucketInfo bd) {
        /* 190 */
        return this.bussOrderInfoMapper.queryUserYtInfo(bd);
    }

    public List<BussBucketDetails> queryUserQtInfo(BussBucketInfo bd) {
        /* 194 */
        return this.bussOrderInfoMapper.queryUserQtInfo(bd);
    }

    public List<BussOrderInfo> selectBussOrderInfoListForYj(BussYjOrderInfo bussOrderInfo) {
        /* 198 */
        return this.bussOrderInfoMapper.selectBussOrderInfoListForYj(bussOrderInfo);
    }

    @Transactional(rollbackFor = {Exception.class})
    public RestResult complateOrder(BucketVoForPd vo) {
        /* 203 */
        if (StringUtils.isBlank(vo.getOrderId())) {
            /* 204 */
            return RestResult.fail("订单信息缺失");
        }
        /* 206 */
        BussOrderInfo info = this.bussOrderInfoMapper.selectBussOrderInfoById(vo.getOrderId());

        /* 208 */
        BussBucketInfo binfo = this.bussBucketInfoService.selectInfoByOrderIdQt(vo.getOrderId());
        /* 209 */
        if (binfo == null) {

            /* 211 */
            info.setOrderStatus(OrderEnum.ORDER_YWC.getCode());
            /* 212 */
            this.bussOrderInfoMapper.updateBussOrderInfo(info);

            /* 214 */
            calcPosterDispatchReocd(info);
            /* 215 */
            return RestResult.ok("操作成功");
        }

        /* 218 */
        Integer dds = this.bussBucketDetailsService.selectDetailsCountByInfoId(binfo.getPk());
        /* 219 */
        List<HytProductVo> products = vo.getProducts();
        /* 220 */
        Integer currentCount = Integer.valueOf(0);
        /* 221 */
        if (products != null && products.size() > 0) {
            /* 222 */
            for (int i = 0; i < products.size(); i++) {
                /* 223 */
                if (products.get(i) != null && "Y".equalsIgnoreCase(((HytProductVo) products.get(i)).getNo1()) && ((HytProductVo) products.get(i)).getBucketCount() != null) {
                    /* 224 */
                    Integer bucketCount = ((HytProductVo) products.get(i)).getBucketCount();
                    /* 225 */
                    currentCount = Integer.valueOf(currentCount.intValue() + bucketCount.intValue());
                }
            }
        }
        /* 229 */
        if (currentCount.intValue() <= 0 && vo.getYtCount().intValue() <= 0 && vo.getQtCount().intValue() <= 0) {
            /* 230 */
            return RestResult.fail("订单欠桶压桶回桶信息不能全为空");
        }

        /* 233 */
        if (currentCount.intValue() >= dds.intValue()) {
            /* 234 */
            String htRecord = createHtRecord(binfo, currentCount.intValue(), dds.intValue(), products);
            /* 235 */
            binfo.setStatus("4");
            /* 236 */
            binfo.setNo8(htRecord);
            /* 237 */
            this.bussBucketInfoService.updateBussBucketInfo(binfo);
        } else {
            /* 239 */
            binfo.setNo2((currentCount.intValue() >= dds.intValue()) ? dds : currentCount);
            /* 240 */
            binfo.setStatus("4");
            /* 241 */
            this.bussBucketInfoService.updateBussBucketInfo(binfo);

            /* 243 */
            if (vo.getQtCount().intValue() > 0) {
                /* 244 */
                String ytId = IdUtils.createOrderNo("YT");
                /* 245 */
                BussBucketInfo inss = new BussBucketInfo();
                /* 246 */
                BeanUtils.copyProperties(binfo, inss);
                /* 247 */
                inss.setPk(ytId);
                /* 248 */
                inss.setStatus("1");
                /* 249 */
                inss.setRecordType(BucketEnum.BC_QT.getCode());
                /* 250 */
                this.bussBucketInfoService.insertBussBucketInfo(inss);
                /* 251 */
                BussBucketDetails bussBucketDetails = new BussBucketDetails();
                /* 252 */
                bussBucketDetails.setCount(vo.getQtCount());
                /* 253 */
                bussBucketDetails.setArecordPk(ytId);
                /* 254 */
                bussBucketDetails.setBrandName(((HytProductVo) products.get(0)).getBrandPk());
                /* 255 */
                bussBucketDetails.setNo9(((HytProductVo) products.get(0)).getBrandName());
                /* 256 */
                bussBucketDetails.setOrderPk(info.getPk());
                /* 257 */
                this.bussBucketDetailsService.insertBussBucketDetails(bussBucketDetails);
            }
            /* 259 */
            if (vo.getYtCount().intValue() > 0) {

                /* 261 */
                String ytId = IdUtils.createOrderNo("YT");
                /* 262 */
                BussBucketInfo inss = new BussBucketInfo();
                /* 263 */
                BeanUtils.copyProperties(binfo, inss);
                /* 264 */
                inss.setPk(ytId);
                /* 265 */
                inss.setStatus("1");
                /* 266 */
                inss.setRecordType(BucketEnum.BC_YT.getCode());
                /* 267 */
                this.bussBucketInfoService.insertBussBucketInfo(inss);
                /* 268 */
                BussBucketDetails bussBucketDetails = new BussBucketDetails();
                /* 269 */
                bussBucketDetails.setCount(vo.getYtCount());
                /* 270 */
                bussBucketDetails.setArecordPk(ytId);
                /* 271 */
                bussBucketDetails.setBrandName(((HytProductVo) products.get(0)).getBrandPk());
                /* 272 */
                bussBucketDetails.setNo9(((HytProductVo) products.get(0)).getBrandName());
                /* 273 */
                bussBucketDetails.setOrderPk(info.getPk());
                /* 274 */
                this.bussBucketDetailsService.insertBussBucketDetails(bussBucketDetails);
            }
        }


        /* 279 */
        info.setOrderStatus(OrderEnum.ORDER_YWC.getCode());
        /* 280 */
        this.bussOrderInfoMapper.updateBussOrderInfo(info);

        /* 282 */
        calcPosterDispatchReocd(info);
        /* 283 */
        return RestResult.ok();
    }


    private String createHtRecord(BussBucketInfo binfo, int currentCount, int dds, List<HytProductVo> products) {
        /* 288 */
        String htId = IdUtils.createOrderNo("HT");
        /* 289 */
        BussBucketInfo ins = new BussBucketInfo();
        /* 290 */
        BeanUtils.copyProperties(binfo, ins);
        /* 291 */
        ins.setPk(htId);
        /* 292 */
        ins.setRecordType(BucketEnum.BC_TT.getCode());
        /* 293 */
        ins.setStatus("4");
        /* 294 */
        ins.setNo1(Integer.valueOf(currentCount));
        /* 295 */
        ins.setNo2(Integer.valueOf((currentCount >= dds) ? dds : currentCount));
        /* 296 */
        this.bussBucketInfoService.insertBussBucketInfo(ins);

        /* 298 */
        if (products != null && products.size() > 0) {
            /* 299 */
            products.forEach(iss -> {
                if (iss != null && "Y".equalsIgnoreCase(iss.getNo1()) && iss.getBucketCount().intValue() > 0) {
                    BussBucketDetails ddr = new BussBucketDetails();

                    ddr.setArecordPk(htId);
                    ddr.setCount(iss.getBucketCount());
                    ddr.setBrandName(iss.getBrandPk());
                    ddr.setNo9(iss.getBrandName());
                    ddr.setNo10(iss.getNo10());
                    ddr.setOrderPk(binfo.getOrderPk());
                    this.bussBucketDetailsService.insertBussBucketDetails(ddr);
                }
            });
        }
        /* 313 */
        return htId;
    }


    public void calcPosterDispatchReocd(BussOrderInfo info) {
        /* 323 */
        log.error("订单结束 开始计算业务提点................." + info.getPk());

        /* 325 */
        int count = this.bussOrderProductInfoService.queryOrderProductCount(info.getPk());
        /* 326 */
        if (count <= 0) {
            /* 327 */
            log.error("业务异常....订单中产品数量信息获取异常,订单ID:  " + info.getPk());
            /* 328 */
            throw new BusinessException("订单产品数量信息获取异常");
        }
        /* 330 */
        BussStationPoster poster = this.bussStationPosterService.selectBussStationPosterById(info.getNo5());
        /* 331 */
        if (poster == null) {
            /* 332 */
            log.error("业务异常....订单派送员信息获取异常,订单ID:  " + info.getPk());
            /* 333 */
            throw new BusinessException("订单派送员信息获取异常");
        }

        /* 336 */
        BussWaterStationInfo station = this.bussWaterStationInfoService.selectBussWaterStationInfoById(info.getStationId());
        /* 337 */
        if (station == null) {
            /* 338 */
            log.error("业务异常....订单归属水站信息获取异常,订单ID:  " + info.getPk());
            /* 339 */
            throw new BusinessException("订单归属水站信息获取异常");
        }

        /* 342 */
        BussReceiverMessage reci = this.bussReceiverMessageService.selectBussReceiverMessageById(info.getOrderAddressId());
        /* 343 */
        if (reci == null) {
            /* 344 */
            log.error("业务异常....订单用户地址信息获取异常,订单ID:  " + info.getPk());
            /* 345 */
            throw new BusinessException("订单用户地址信息获取异常");
        }

        /* 348 */
        calcUserReward((BaseOrder) info);

        /* 350 */
        if (station.getPosterFreeSingleUnit() != null) {
            /* 351 */
            BigDecimal tcAmount = station.getPosterFreeSingleUnit().multiply(new BigDecimal(count));
            /* 352 */
            if (tcAmount.compareTo(BigDecimal.ZERO) == 1) {
                /* 353 */
                BussPosterDispatchRewardRecord bussPosterDispatchRewardRecord = new BussPosterDispatchRewardRecord(info.getPk(), info.getNo5(), info.getNo5(), Integer.valueOf(count), tcAmount, BusinessConst.YSX, BusinessConst.SF01);
                /* 354 */
                this.bussPosterDispatchRewardRecordService.insertBussPosterDispatchRewardRecord(bussPosterDispatchRewardRecord);
            }
        }

        /* 358 */
        if (StringUtils.isNotBlank(poster.getParentPk())) {
            /* 360 */
            if (station.getPosterChildBussFree() != null) {
                /* 361 */
                BigDecimal ptAmount = station.getPosterChildBussFree().multiply(new BigDecimal(count));
                /* 362 */
                if (ptAmount.compareTo(BigDecimal.ZERO) == 1) {
                    /* 363 */
                    BussPosterDispatchRewardRecord rdd = new BussPosterDispatchRewardRecord(info.getPk(), poster.getParentPk(), poster.getParentPk(), Integer.valueOf(count), ptAmount, BusinessConst.YSX, BusinessConst.SF02);
                    /* 364 */
                    this.bussPosterDispatchRewardRecordService.insertBussPosterDispatchRewardRecord(rdd);
                }
            }
        }

        /* 369 */
        if (reci != null && "2".equalsIgnoreCase(reci.getBulidingType()) && reci.getFloorNum().intValue() >= 2) {

            /* 371 */
            BigDecimal pls = this.bussStationClimbFeeService.selectBussStationClimbSetUp(Integer.valueOf(1), reci.getFloorNum());
            /* 372 */
            if (pls.compareTo(BigDecimal.ZERO) == 1) {
                /* 373 */
                BigDecimal ptAmount = pls.multiply(new BigDecimal(count));
                /* 374 */
                BussPosterDispatchRewardRecord rdd = new BussPosterDispatchRewardRecord(info.getPk(), info.getNo5(), info.getNo5(), Integer.valueOf(count), ptAmount, BusinessConst.YSX, BusinessConst.SF04);
                /* 375 */
                this.bussPosterDispatchRewardRecordService.insertBussPosterDispatchRewardRecord(rdd);
            }
        }

        /* 379 */
        BussPosterDistanceDeduct distanceDeduct = new BussPosterDistanceDeduct();
        /* 380 */
        distanceDeduct.setStationId(String.valueOf(info.getStationId()));
        /* 381 */
        distanceDeduct.setPosterId(info.getNo5());
        /* 382 */
        distanceDeduct.setUserId(info.getOrderPersion());
        /* 383 */
        List<BussPosterDistanceDeduct> disst = this.bussPosterDistanceDeductService.selectBussPosterDistanceDeductList(distanceDeduct);
        /* 384 */
        if (CollectionUtils.isNotEmpty(disst)) {
            /* 385 */
            BigDecimal postAmount = ((BussPosterDistanceDeduct) disst.get(0)).getPostAmount();
            /* 386 */
            if (postAmount.compareTo(BigDecimal.ZERO) == 1) {
                /* 387 */
                BigDecimal jltcAmo = postAmount.multiply(new BigDecimal(count));
                /* 388 */
                BussPosterDispatchRewardRecord rdd = new BussPosterDispatchRewardRecord(info.getPk(), info.getNo5(), info.getNo5(), Integer.valueOf(count), jltcAmo, BusinessConst.YSX, BusinessConst.SF03);
                /* 389 */
                this.bussPosterDispatchRewardRecordService.insertBussPosterDispatchRewardRecord(rdd);
            }
        }
        /* 392 */
        log.error("订单结束 结束计算业务提点.................");
    }


    public void calcUserReward(BaseOrder info) {
        /* 397 */
        log.error("开始计算分销提成...................");

        /* 399 */
        SysUser user = this.sysUserService.selectUserById(info.getOrderPersion());

        /* 401 */
        Boolean flag = Boolean.valueOf(false);
        /* 402 */
        if (StringUtils.isNotBlank(user.getCloudPk())) {
            /* 403 */
            flag = this.bussWaterStationInfoService.checkStationIsOpenFenXiao(Long.valueOf(Long.parseLong(user.getCloudPk())));
        }
        /* 405 */
        if (flag.booleanValue() &&
                /* 406 */       user != null && StringUtils.isNotBlank(user.getUd9())) {


            /* 409 */
            BigDecimal multiply = (new BigDecimal(info.getNo12())).multiply(user.getFirstPercentage());

            /* 411 */
            BussPosterDispatchRewardRecord rdd = new BussPosterDispatchRewardRecord(info.getPk(), user.getUd9(), null, Integer.valueOf(info.getNo12()), multiply, BusinessConst.YSX, BusinessConst.SF05);
            /* 412 */
            this.bussPosterDispatchRewardRecordService.insertBussPosterDispatchRewardRecord(rdd);
            /* 413 */
            log.error("一级分销提成..金额:{} ,提成人ID:{}", multiply, user.getUd9());

            /* 415 */
            recordStationIncome(BigDecimal.ZERO, String.valueOf(info.getStationId()), multiply.negate(), multiply.negate(), info.getPk(), info.getNo5(), 3);


            /* 418 */
            SysUser yeye = this.sysUserService.selectUserById(user.getUd9());
            /* 419 */
            if (yeye != null && StringUtils.isNotBlank(yeye.getUd9())) {
                /* 420 */
                BigDecimal multiply2 = (new BigDecimal(info.getNo12())).multiply(yeye.getSecondPercentage());
                /* 421 */
                BussPosterDispatchRewardRecord rdd2 = new BussPosterDispatchRewardRecord(info.getPk(), yeye.getUd9(), null, Integer.valueOf(info.getNo12()), multiply2, BusinessConst.YSX, BusinessConst.SF05);
                /* 422 */
                this.bussPosterDispatchRewardRecordService.insertBussPosterDispatchRewardRecord(rdd2);
                /* 423 */
                log.error("二级分销提成..金额:{} ,提成人ID:{}", multiply2, yeye.getUd9());

                /* 425 */
                recordStationIncome(BigDecimal.ZERO, String.valueOf(info.getStationId()), multiply2.negate(), multiply2.negate(), info.getPk(), info.getNo5(), 3);
            }
        }



        /* 431 */
        BigDecimal tax = info.getRealMoney().multiply(Constants.SYSTEM_DEFAULT_TD);
        /* 432 */
        String stationId = String.valueOf(info.getStationId());
        /* 433 */
        BigDecimal sh = info.getRealMoney().subtract(tax).setScale(2, 4);

        /* 435 */
        BussOrderTransferRecord transf = this.bussOrderTransferRecordService.queryOrderTransferSource(info.getPk());
        /* 436 */
        if (transf != null) {
            /* 437 */
            log.error("开始处理转单费用..........Start");

            /* 439 */
            BigDecimal srf = (new BigDecimal(info.getNo12())).multiply(Constants.ORDER_TRANSFER_PAY);
            /* 440 */
            recordStationIncome(BigDecimal.ZERO, stationId, srf.negate(), srf.negate(), info.getPk(), info.getNo5(), 4);

            /* 442 */
            BigDecimal zrf = (new BigDecimal(info.getNo12())).multiply(Constants.ORDER_TRANSFER_PAY_SOURCE);
            /* 443 */
            recordStationIncome(BigDecimal.ZERO, transf.getStationId(), zrf, zrf, info.getPk(), transf.getCreateBy(), 4);

            /* 445 */
            BigDecimal pdf = (new BigDecimal(info.getNo12())).multiply(Constants.ORDER_TRANSFER_PAY_PT);
            /* 446 */
            recordStationIncome(BigDecimal.ZERO, Constants.SYSTEM_ADMIN_STATION_ID.toString(), pdf, pdf, info.getPk(), "PT", 4);
            /* 447 */
            log.error("开始处理转单费用..........End");
        }

        /* 450 */
        recordStationIncome(tax, stationId, info.getRealMoney(), sh, info.getPk(), info.getNo5(), 1);
        /* 451 */
        log.error("计算分销提成...................END");
    }


    public void recordStationIncome(BigDecimal tax, String stationId, BigDecimal moneynum, BigDecimal taxMoney, String orderId, String posterId, int type) {
        /* 456 */
        BussStationInountRecord rds = new BussStationInountRecord();
        /* 457 */
        rds.setStationId(stationId);
        /* 458 */
        rds.setMoneyNum(moneynum);
        /* 459 */
        rds.setMoneyTaxNum(taxMoney);
        /* 460 */
        rds.setNo1(MathUtils.getStringDecimal(tax));
        /* 461 */
        rds.setNo2(MathUtils.getStringDecimal(tax.multiply(Constants.SYSTEM_DEFAULT_PT_KD)));
        /* 462 */
        rds.setOrderId(orderId);
        /* 463 */
        rds.setPosterId(posterId);
        /* 464 */
        rds.setStatus(Integer.valueOf(1));
        /* 465 */
        rds.setSourceFrom(Integer.valueOf(type));
        /* 466 */
        rds.setRecordType(Integer.valueOf((type == 1) ? 1 : 2));
        /* 467 */
        this.bussStationInountRecordService.insertBussStationInountRecord(rds);

        /* 469 */
        this.bssStationInountService.updateStationInount(Long.valueOf(Long.parseLong(stationId)), moneynum.subtract(tax));
    }


    @Transactional(rollbackFor = {Exception.class})
    public RestResult complateOrderWithoutBucket(String oid) {
        /* 480 */
        BussOrderInfo info = this.bussOrderInfoMapper.selectBussOrderInfoById(oid);

        /* 482 */
        info.setOrderStatus(OrderEnum.ORDER_YWC.getCode());
        /* 483 */
        this.bussOrderInfoMapper.updateBussOrderInfo(info);

        /* 485 */
        calcPosterDispatchReocd(info);
        /* 486 */
        return RestResult.ok();
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\service\BussOrderInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */