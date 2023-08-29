package com.cms.base_service.framework.aspectj.lang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Excels {
  Excel[] value();
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\aspectj\lang\annotation\Excels.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */