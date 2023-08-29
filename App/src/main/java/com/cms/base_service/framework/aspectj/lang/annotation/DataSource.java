package com.cms.base_service.framework.aspectj.lang.annotation;

import com.cms.base_service.framework.aspectj.lang.enums.DataSourceType;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
  DataSourceType value() default DataSourceType.MASTER;
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\aspectj\lang\annotation\DataSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */