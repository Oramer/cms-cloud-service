package com.cms.base_service.annotation;

import com.cms.base_service.annotation.BusinessType;
import com.cms.base_service.annotation.OperatorType;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
  String title() default "";
  
  BusinessType businessType() default BusinessType.OTHER;
  
  OperatorType operatorType() default OperatorType.MANAGE;
  
  boolean isSaveRequestData() default true;
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\annotation\Log.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */