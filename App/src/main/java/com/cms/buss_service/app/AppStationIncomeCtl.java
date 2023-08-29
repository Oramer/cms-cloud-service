 package com.cms.buss_service.app;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.common.model.BaseCtl;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.station.domain.BussStationInountRecord;
 import com.cms.buss_service.station.service.BussStationInountRecordService;
 import com.cms.buss_service.station.service.BussStationInountService;

 @RestController
 @RequestMapping({"/api"})
 public class AppStationIncomeCtl
   extends BaseCtl
 {
   @Autowired
   private BussStationInountService bussStationInountService;
   @Autowired
   private BussStationInountRecordService bussStationInountRecordService;

   @GetMapping({"/station_income"})
   public RestResult getStationIncome(BussStationInountRecord ins) {
/* 28 */     return this.bussStationInountRecordService.queryStationIncomeForTx(ins);
   }






   @PostMapping({"/station_income/submit"})
   public RestResult submit(@RequestBody BussStationInountRecord ins) {
/* 38 */     ins.setStationId(String.valueOf(SecurityUtils.getUserStationId()));
/* 39 */     return this.bussStationInountRecordService.submitTixian(ins);
   }





   @PostMapping({"/station_income/confirm_sq"})
   public RestResult confirmTxianSq(@RequestBody BussStationInountRecord ins) {
/* 48 */     return this.bussStationInountRecordService.confirmTxianSq(ins);
   }






   @GetMapping({"/station_income/queryTxDetails"})
   public RestResult queryTxDetails(BussStationInountRecord ins) {
/* 58 */     ins.setStationId(String.valueOf(SecurityUtils.getUserStationId()));
/* 59 */     return this.bussStationInountRecordService.queryStationTxDetails(ins);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\AppStationIncomeCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */