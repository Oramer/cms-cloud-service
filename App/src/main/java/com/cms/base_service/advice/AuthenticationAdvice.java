 package com.cms.base_service.advice;

 import org.aspectj.lang.JoinPoint;
 import org.aspectj.lang.Signature;
 import org.aspectj.lang.annotation.Aspect;
 import org.aspectj.lang.annotation.Before;
 import org.aspectj.lang.reflect.MethodSignature;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.redis.RedisCache;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.base_service.exception.AuthorizationException;
 import com.cms.base_service.exception.BusinessException;
 import com.cms.system_service.system.domain.SysUser;

 import java.lang.reflect.Method;
 import java.util.Set;


 @Aspect
 @Component
 public class AuthenticationAdvice
 {
/* 33 */   private static final Logger log = LoggerFactory.getLogger(AuthenticationAdvice.class);




   @Autowired
   private RedisCache redisCache;





   @Before("@annotation(com.cms.base_service.annotation.PreAuthor)")
   public void beforeMethod(JoinPoint joinPoint) {
/* 47 */     PreAuthor author = getAnnotation(joinPoint);

/* 49 */     String auth = author.value();
/* 50 */     SysUser user = (SysUser)this.redisCache.getCacheObject("sys_login_user:" + SecurityUtils.getUserName());

/* 52 */     if (user != null && user.getPermissionset().size() > 0) {
/* 53 */       Set<String> permissionset = user.getPermissionset();

/* 55 */       if (!permissionset.contains(auth) && !permissionset.contains("*:*:*")) {
/* 56 */         throw new BusinessException("【鉴权异常】:当前无此权限--|" + auth);
       }
     } else {
/* 59 */       throw new AuthorizationException("【鉴权异常】:登录信息已过期或尚未登录");
     }
   }






   private static PreAuthor getAnnotation(JoinPoint joinPoint) {
/* 69 */     Signature signature = joinPoint.getSignature();
/* 70 */     MethodSignature methodSignature = (MethodSignature)signature;
/* 71 */     Method method = methodSignature.getMethod();
/* 72 */     if (method != null) {
/* 73 */       return method.<PreAuthor>getAnnotation(PreAuthor.class);
     }
/* 75 */     return null;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\advice\AuthenticationAdvice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */