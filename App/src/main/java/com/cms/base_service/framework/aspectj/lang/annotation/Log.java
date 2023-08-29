package com.cms.base_service.framework.aspectj.lang.annotation;

import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.aspectj.lang.enums.OperatorType;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
  String title() default "";
  
  BusinessType businessType() default BusinessType.OTHER;
  
  OperatorType operatorType() default OperatorType.MANAGE;
  
  boolean isSaveRequestData() default true;
  
  boolean isSaveResponseData() default true;
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\aspectj\lang\annotation\Log.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */