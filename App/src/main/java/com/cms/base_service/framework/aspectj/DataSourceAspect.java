 package com.cms.base_service.framework.aspectj;

 import org.aspectj.lang.ProceedingJoinPoint;
 import org.aspectj.lang.annotation.Around;
 import org.aspectj.lang.annotation.Aspect;
 import org.aspectj.lang.annotation.Pointcut;
 import org.aspectj.lang.reflect.MethodSignature;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.core.annotation.AnnotationUtils;
 import org.springframework.core.annotation.Order;
 import org.springframework.stereotype.Component;
 import com.cms.base_service.common.utils.StringUtils;
 import com.cms.base_service.framework.aspectj.lang.annotation.DataSource;
 import com.cms.base_service.framework.datasource.DynamicDataSourceContextHolder;

 import java.util.Objects;


 @Aspect
 @Order(1)
 @Component
 public class DataSourceAspect
 {
/* 29 */   protected Logger logger = LoggerFactory.getLogger(getClass());
 
 
 
   
   @Pointcut("@annotation(com.cms.base_service.framework.aspectj.lang.annotation.DataSource)|| @within(com.cms.base_service.framework.aspectj.lang.annotation.DataSource)")
   public void dsPointCut() {}
 
 
   
   @Around("dsPointCut()")
   public Object around(ProceedingJoinPoint point) throws Throwable {
/* 41 */     DataSource dataSource = getDataSource(point);
     
/* 43 */     if (StringUtils.isNotNull(dataSource))
     {
/* 45 */       DynamicDataSourceContextHolder.setDataSourceType(dataSource.value().name());
     }
 
     
     try {
/* 50 */       return point.proceed();
     
     }
     finally {
       
/* 55 */       DynamicDataSourceContextHolder.clearDataSourceType();
     } 
   }
 
 
 
 
   
   public DataSource getDataSource(ProceedingJoinPoint point) {
/* 64 */     MethodSignature signature = (MethodSignature)point.getSignature();
/* 65 */     DataSource dataSource = (DataSource)AnnotationUtils.findAnnotation(signature.getMethod(), DataSource.class);
/* 66 */     if (Objects.nonNull(dataSource))
     {
/* 68 */       return dataSource;
     }
     
/* 71 */     return (DataSource)AnnotationUtils.findAnnotation(signature.getDeclaringType(), DataSource.class);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\aspectj\DataSourceAspect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */