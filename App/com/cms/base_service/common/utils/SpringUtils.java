package com.cms.base_service.common.utils;

import com.cms.base_service.common.utils.StringUtils;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;








@Component
public final class SpringUtils
  implements BeanFactoryPostProcessor, ApplicationContextAware
{
  private static ConfigurableListableBeanFactory beanFactory;
  private static ApplicationContext applicationContext;
  
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
/*  28 */     com.cms.base_service.common.utils.SpringUtils.beanFactory = beanFactory;
  }


  
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
/*  34 */     com.cms.base_service.common.utils.SpringUtils.applicationContext = applicationContext;
  }










  
  public static <T> T getBean(String name) throws BeansException {
/*  48 */     return (T)beanFactory.getBean(name);
  }









  
  public static <T> T getBean(Class<T> clz) throws BeansException {
/*  61 */     T result = (T)beanFactory.getBean(clz);
/*  62 */     return result;
  }







  
  public static boolean containsBean(String name) {
/*  73 */     return beanFactory.containsBean(name);
  }









  
  public static boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
/*  86 */     return beanFactory.isSingleton(name);
  }







  
  public static Class<?> getType(String name) throws NoSuchBeanDefinitionException {
/*  97 */     return beanFactory.getType(name);
  }









  
  public static String[] getAliases(String name) throws NoSuchBeanDefinitionException {
/* 110 */     return beanFactory.getAliases(name);
  }








  
  public static <T> T getAopProxy(T invoker) {
/* 122 */     return (T)AopContext.currentProxy();
  }






  
  public static String[] getActiveProfiles() {
/* 132 */     return applicationContext.getEnvironment().getActiveProfiles();
  }






  
  public static String getActiveProfile() {
/* 142 */     String[] activeProfiles = getActiveProfiles();
/* 143 */     return StringUtils.isNotEmpty((Object[])activeProfiles) ? activeProfiles[0] : null;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\SpringUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */