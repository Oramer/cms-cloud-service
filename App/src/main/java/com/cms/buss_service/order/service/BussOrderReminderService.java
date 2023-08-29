 package com.cms.buss_service.order.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.order.domain.BussOrderReminder;
 import com.cms.buss_service.order.mapper.BussOrderReminderMapper;

 import java.util.List;


 @Service
 public class BussOrderReminderService
 {
   @Autowired(required = false)
   private BussOrderReminderMapper bussOrderReminderMapper;
   
   public BussOrderReminder selectBussOrderReminderById(Long id) {
/* 28 */     return this.bussOrderReminderMapper.selectBussOrderReminderById(id);
   }
 
 
 
 
 
 
   
   public List<BussOrderReminder> selectBussOrderReminderList(BussOrderReminder bussOrderReminder) {
/* 38 */     return this.bussOrderReminderMapper.selectBussOrderReminderList(bussOrderReminder);
   }
 
 
 
 
 
 
   
   public int insertBussOrderReminder(BussOrderReminder bussOrderReminder) {
/* 48 */     bussOrderReminder.setCreateTime(DateUtils.getNowDate());
/* 49 */     return this.bussOrderReminderMapper.insertBussOrderReminder(bussOrderReminder);
   }
 
 
 
 
 
 
   
   public int updateBussOrderReminder(BussOrderReminder bussOrderReminder) {
/* 59 */     bussOrderReminder.setUpdateTime(DateUtils.getNowDate());
/* 60 */     return this.bussOrderReminderMapper.updateBussOrderReminder(bussOrderReminder);
   }
 
 
 
 
 
 
   
   public int deleteBussOrderReminderByIds(Long[] ids) {
/* 70 */     return this.bussOrderReminderMapper.deleteBussOrderReminderByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussOrderReminderById(Long id) {
/* 80 */     return this.bussOrderReminderMapper.deleteBussOrderReminderById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\service\BussOrderReminderService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */