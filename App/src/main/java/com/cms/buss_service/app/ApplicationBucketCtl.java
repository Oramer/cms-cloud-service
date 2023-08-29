package com.cms.buss_service.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.BucketEnum;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.buss_service.order.domain.BussOrderInfo;
import com.cms.buss_service.order.service.BussOrderInfoService;
import com.cms.buss_service.order.service.BussOrderProductInfoService;
import com.cms.buss_service.order.service.BussReceiverMessageService;
import com.cms.buss_service.poster.service.BussPosterDispatchRewardRecordService;
import com.cms.buss_service.poster.service.BussPosterDistanceDeductService;
import com.cms.buss_service.station.service.BussStationClimbFeeService;
import com.cms.buss_service.station.service.BussStationInountRecordService;
import com.cms.buss_service.station.service.BussStationInountService;
import com.cms.buss_service.station.service.BussWaterStationInfoService;
import com.cms.system_service.system.service.ISysUserService;
import com.cms.buss_service.bucket.domain.*;
import com.cms.buss_service.bucket.service.*;

import java.util.List;

@RestController
@RequestMapping({"/api"})
public class ApplicationBucketCtl extends BaseCtl {
/*  41 */   private static final Logger log = LoggerFactory.getLogger(ApplicationBucketCtl.class);
  
  @Autowired
  private BussBucketLackRecordService bussBucketLackRecordService;
  
  @Autowired
  protected BussOrderProductInfoService bussOrderProductInfoService;
  
  @Autowired
  protected BussReceiverMessageService bussReceiverMessageService;
  @Autowired
  protected BussWaterStationInfoService bussWaterStationInfoService;
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
  private BussHtInfoService bussHtInfoService;
  @Autowired
  private BussOrderInfoService bussOrderInfoService;
  @Autowired
  private BussBucketBackRecordService bussBucketBackRecordService;
  @Autowired
  private BussBucketInfoService bussBucketInfoService;
  @Autowired
  private BussBucketDetailsService bussBucketDetailsService;
  
  @GetMapping({"/bucket_lack/list"})
  public TableDataInfo bucketList(BussBucketLackRecord lck) {
/*  78 */     lck.setUserPk(SecurityUtils.getUid());
/*  79 */     startPage();
/*  80 */     List<BussBucketLackRecord> list = this.bussBucketLackRecordService.selectBussBucketLackRecordList(lck);
/*  81 */     return getDataTable(list);
  }

  
  @GetMapping({"/bucket_info/query/{orderPk}"})
  public RestResult getInfo(@PathVariable String orderPk) {
/*  87 */     return RestResult.ok().setData(this.bussBucketInfoService.selectBussBucketInfoById(orderPk));
  }







  
  @GetMapping({"/bucket_lack/yt/list"})
  public TableDataInfo bucketList(BussOrderInfo lck) {
/*  99 */     lck.setStationId(SecurityUtils.getUserStationId());
/* 100 */     startPage();
/* 101 */     List<BussOrderInfo> list = this.bussOrderInfoService.queryBucketList(lck);
/* 102 */     return getDataTable(list);
  }




























  
  @PostMapping({"/bucket_return/add"})
  public RestResult confirmReturnBucket(BucketRetrunVo vo) {
/* 135 */     System.out.println(vo);
/* 136 */     return null;
  }








  
  @PostMapping({"/bucket_return_user/add"})
  public RestResult confirmReturnBucketForWeiChatUser(@RequestBody BussHtInfo htInfo) {
/* 149 */     return RestResult.ok(Integer.valueOf(this.bussHtInfoService.insertBussHtInfo(htInfo)));
  }






  
  @PostMapping({"/bucket_return_pd/update"})
  public RestResult confirmReturnBucketPdUser(@RequestBody BussHtInfo htInfo) {
/* 160 */     if (htInfo.getId() != null && StringUtils.isNotBlank(htInfo.getBucketOrderId())) {
/* 161 */       htInfo.setStatus(Integer.valueOf(2));
/* 162 */       this.bussHtInfoService.updateBussHtInfo(htInfo);
      
/* 164 */       BussBucketInfo bussBucketInfo = this.bussBucketInfoService.selectBussBucketInfoById(htInfo.getBucketOrderId());
/* 165 */       bussBucketInfo.setStatus("4");
/* 166 */       this.bussBucketInfoService.updateBussBucketInfo(bussBucketInfo);
/* 167 */       return RestResult.ok();
    } 
/* 169 */     return RestResult.fail("参数异常,回桶订单信息缺失");
  }














  
  @PostMapping({"/bucket/start_ht_new"})
  public RestResult startHtInfoNew(@RequestBody BucketVoForPd vo) {
/* 188 */     return this.bussOrderInfoService.complateOrder(vo);
  }




  
  @PostMapping({"/bucket/start_end_info/{oid}"})
  public RestResult noBucketOrder(@PathVariable String oid) {
/* 197 */     return this.bussOrderInfoService.complateOrderWithoutBucket(oid);
  }







  
  @Deprecated
  @PostMapping({"/bucket/start_ht_info"})
  public RestResult startHtInfo(@RequestBody BucketVoForPd vo) {
/* 210 */     this.bussOrderInfoService.complateOrder(vo);
/* 211 */     return RestResult.ok("操作成功");
  }















  
  @PostMapping({"/bucket_pd/cancel/{pledgeId}"})
  public RestResult cancelBucketPledge(@PathVariable String pledgeId) {
/* 231 */     BussBucketInfo bussBucketInfo = this.bussBucketInfoService.selectBussBucketInfoById(pledgeId);
/* 232 */     bussBucketInfo.setRecordType(BucketEnum.BC_QT.getCode());
/* 233 */     bussBucketInfo.setStatus("1");
/* 234 */     bussBucketInfo.setNo8("FROM撤销压桶");
/* 235 */     this.bussBucketInfoService.updateBussBucketInfo(bussBucketInfo);
/* 236 */     return RestResult.ok("撤销压桶操作成功");
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationBucketCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */