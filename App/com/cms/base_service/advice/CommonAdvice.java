package com.cms.base_service.advice;

import com.cms.base_service.advice.AuthenticationAdvice;
import com.cms.base_service.advice.DataScopeAdvice;
import com.cms.base_service.advice.ExceptionAdvice;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

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