 package com.cms.buss_service.app;
 import com.cms.base_service.common.ChartModel;
 import com.cms.base_service.common.model.BaseCtl;
 import com.cms.buss_service.order.domain.BussOrderInfo;
 import com.cms.buss_service.order.service.EchartService;
 import com.cms.system_service.system.domain.SysUser;
 import java.util.Map;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

 @RestController
 @RequestMapping({"/api"})
 public class ApplicationChartCtl extends BaseCtl {
/* 16 */   private static final Logger log = LoggerFactory.getLogger(com.cms.buss_service.app.ApplicationChartCtl.class);




   @Autowired
   private EchartService echartService;




   @GetMapping({"/chart/station_order"})
   public ChartModel queryStationOrderTjInfo(BussOrderInfo info) {
/* 29 */     return this.echartService.queryStationOrderTjInfo(info);
   }








   @GetMapping({"/chart/station_order_money"})
   public ChartModel queryStationOrderMoneyTjInfo(BussOrderInfo info) {
/* 41 */     return this.echartService.queryStationOrderMoneyTjInfo(info);
   }







   @GetMapping({"/chart/station_user"})
   public ChartModel queryStationUserTjInfo(SysUser user) {
/* 52 */     return this.echartService.queryStaionUserTjInfo(user);
   }







   @GetMapping({"/chart/query_tj"})
   public Map<String, Object> queryStaionHomeTj(BussOrderInfo info) {
/* 63 */     return this.echartService.queryStaionHomeTj(info);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationChartCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */