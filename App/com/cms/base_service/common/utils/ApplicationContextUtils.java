 package com.cms.base_service.common.utils;
 
 import org.springframework.beans.BeansException;
 import org.springframework.context.ApplicationContext;
 import org.springframework.context.ApplicationContextAware;
 import org.springframework.stereotype.Component;
 
 
 
 @Component
 public class ApplicationContextUtils
   implements ApplicationContextAware
 {
   private static ApplicationContext applicationContext;
   
   public void setApplicationContext(ApplicationContext context) throws BeansException {
/* 17 */     applicationContext = context;
   }
   
   public static <T> T getBean(Class<T> beanClass) {
/* 21 */     return (T)applicationContext.getBean(beanClass);
   }
   
   public static <T> T getBean(String beanName, Class<T> beanClass) {
/* 25 */     return (T)applicationContext.getBean(beanName, beanClass);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\ApplicationContextUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */