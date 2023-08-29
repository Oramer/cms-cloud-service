 package com.cms.buss_service.order.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.ChartModel;
 import com.cms.buss_service.order.domain.BussOrderInfo;
 import com.cms.buss_service.order.mapper.BussOrderInfoMapper;
 import com.cms.system_service.system.domain.SysUser;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Map;


 @Service
 public class EchartService
 {
   @Autowired(required = false)
   private BussOrderInfoMapper bussOrderInfoMapper;
   
   public ChartModel queryStationOrderTjInfo(BussOrderInfo info) {
/* 21 */     List<Map<Object, Object>> res = this.bussOrderInfoMapper.queryStationOrderTjInfo(info);
     
/* 23 */     List<Object> set2 = new ArrayList();
/* 24 */     List<Object> set3 = new ArrayList();
/* 25 */     res.forEach(item -> {
           set2.add(item.get("name"));
           set3.add(item.get("value"));
         });
/* 29 */     ChartModel model = new ChartModel();
/* 30 */     model.setXData(set2);
/* 31 */     model.setYData(set3);
/* 32 */     return model;
   }
   
   public ChartModel queryStationOrderMoneyTjInfo(BussOrderInfo info) {
/* 36 */     List<Map<Object, Object>> res = this.bussOrderInfoMapper.queryStationOrderMoneyTjInfo(info);
     
/* 38 */     List<Object> set2 = new ArrayList();
/* 39 */     List<Object> set3 = new ArrayList();
/* 40 */     res.forEach(item -> {
           set2.add(item.get("name"));
           set3.add(item.get("value"));
         });
/* 44 */     ChartModel model = new ChartModel();
/* 45 */     model.setXData(set2);
/* 46 */     model.setYData(set3);
/* 47 */     return model;
   }
   
   public ChartModel queryStaionUserTjInfo(SysUser user) {
/* 51 */     List<Map<Object, Object>> res = this.bussOrderInfoMapper.queryStaionUserTjInfo(user);
     
/* 53 */     List<Object> set2 = new ArrayList();
/* 54 */     List<Object> set3 = new ArrayList();
/* 55 */     res.forEach(item -> {
           set2.add(item.get("name"));
           set3.add(item.get("value"));
         });
/* 59 */     ChartModel model = new ChartModel();
/* 60 */     model.setXData(set2);
/* 61 */     model.setYData(set3);
/* 62 */     return model;
   }
   
   public Map<String, Object> queryStaionHomeTj(BussOrderInfo info) {
/* 66 */     return this.bussOrderInfoMapper.queryStaionHomeTj(info);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\service\EchartService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */