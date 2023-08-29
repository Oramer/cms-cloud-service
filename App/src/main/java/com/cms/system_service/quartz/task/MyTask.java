 package com.cms.system_service.quartz.task;

 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
 import com.cms.base_service.common.model.OrderEnum;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.StringUtils;
 import com.cms.buss_service.order.domain.BussOrderInfo;
 import com.cms.buss_service.order.mapper.BussOrderInfoMapper;
 import com.cms.buss_service.yjuser.service.BussMonthlyUserService;

 import java.util.List;


 @Component("myTask")
 public class MyTask
 {
/* 20 */   private static final Logger log = LoggerFactory.getLogger(MyTask.class);
   
   @Autowired(required = false)
   BussOrderInfoMapper bussOrderInfoMapper;
   
   @Autowired(required = false)
   BussMonthlyUserService bussMonthlyUserService;
   
   public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i) {
/* 29 */     System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", new Object[] { s, b, l, d, i }));
   }
   
   public void ryParams(String params) {
/* 33 */     System.out.println("执行有参方法：" + params);
   }
   
   public void ryNoParams() {
/* 37 */     System.out.println("执行无参方法");
   }
 
   
   public void cleanOrder() {
/* 42 */     List<BussOrderInfo> ords = this.bussOrderInfoMapper.selectUnPayOrderInfo();
     
/* 44 */     if (ords != null && ords.size() > 0) {
/* 45 */       ords.forEach(is -> {
             is.setOrderStatus(OrderEnum.ORDER_YCS.getCode());
             is.setIsOvertime("Y");
             is.setNo15("-1");
             is.setUpdateBy("system_auto");
             is.setUpdateTime(DateUtils.getTime());
             this.bussOrderInfoMapper.updateBussOrderInfo(is);
           });
     }
   }
 
 
 
 
 
   
   public void createYueJieOrder() {
/* 62 */     this.bussMonthlyUserService.createYjOrderInfo();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quartz\task\MyTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */