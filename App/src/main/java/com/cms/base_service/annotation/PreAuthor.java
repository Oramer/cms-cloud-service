package com.cms.base_service.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PreAuthor {
  String value() default "";
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\annotation\PreAuthor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */