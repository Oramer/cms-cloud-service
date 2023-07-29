 package com.cms.base_service.common.utils;
 
 import org.springframework.beans.BeansException;
 import org.springframework.context.ApplicationContext;
 import org.springframework.context.ApplicationContextAware;
 import org.springframework.stereotype.Component;
 
 @Component
 public class SpringUtil
   implements ApplicationContextAware
 {
   private static ApplicationContext applicationContext;
   
   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
/* 15 */     if (com.cms.base_service.common.utils.SpringUtil.applicationContext == null) {
/* 16 */       com.cms.base_service.common.utils.SpringUtil.applicationContext = applicationContext;
     }
   }
 
   
   public static ApplicationContext getApplicationContext() {
/* 22 */     return applicationContext;
   }
 
   
   public static Object getBean(String name) {
/* 27 */     return getApplicationContext().getBean(name);
   }
 
   
   public static <T> T getBean(Class<T> clazz) {
/* 32 */     return (T)getApplicationContext().getBean(clazz);
   }
 
   
   public static <T> T getBean(String name, Class<T> clazz) {
/* 37 */     return (T)getApplicationContext().getBean(name, clazz);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\SpringUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */