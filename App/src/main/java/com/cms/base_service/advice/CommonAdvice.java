package com.cms.base_service.advice;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({ExceptionAdvice.class, DataScopeAdvice.class, AuthenticationAdvice.class})
public @interface CommonAdvice {}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\advice\CommonAdvice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */