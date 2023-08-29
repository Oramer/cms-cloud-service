package com.cms.base_service.advice;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.cms.base_service.annotation.Log;
import com.cms.base_service.common.thread.TimeTaskFactory;
import com.cms.base_service.common.thread.TreadUtils;
import com.cms.base_service.common.utils.IpUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.ServletUtils;
import com.cms.system_service.system.domain.SysOperLog;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@Aspect
@Component("logAspect")
public class CommonLogAdvice {
/*  29 */   private static final Logger log = LoggerFactory.getLogger(CommonLogAdvice.class);






  
  @Pointcut("@annotation(com.cms.base_service.annotation.Log)")
  public void logPointCut() {}





  
  @AfterReturning(pointcut = "logPointCut()", returning = "jsonResult")
  public void doAfterReturning(JoinPoint joinPoint, Object jsonResult) {
/*  47 */     handleLog(joinPoint, null, jsonResult);
  }
  
  @AfterThrowing(value = "logPointCut()", throwing = "e")
  public void doAfterThrowing(JoinPoint joinPoint, Exception e) {
/*  52 */     handleLog(joinPoint, e, null);
  }

  
  protected void handleLog(JoinPoint joinPoint, Exception e, Object jsonResult) {
/*  57 */     Log logasp = getAnnotationLog(joinPoint);
/*  58 */     if (logasp != null) {
/*  59 */       Object[] args = joinPoint.getArgs();
/*  60 */       HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
/*  61 */       SysOperLog operLog = new SysOperLog();
/*  62 */       operLog.setOperParam(JSON.toJSONString(args));
/*  63 */       operLog.setBusinessType(logasp.businessType().name());
/*  64 */       operLog.setStatus(Integer.valueOf(0));
      
/*  66 */       operLog.setOperIp(IpUtils.getIpAddr(request));
      
/*  68 */       operLog.setJsonResult(JSON.toJSONString(jsonResult));
/*  69 */       operLog.setTitle(logasp.title());
/*  70 */       operLog.setOperUrl(ServletUtils.getRequest().getRequestURI());
/*  71 */       operLog.setOperName(SecurityUtils.getUid(request));
/*  72 */       if (e != null) {
/*  73 */         operLog.setStatus(Integer.valueOf(1));
/*  74 */         operLog.setErrorMsg(StringUtils.substring(e.getMessage(), 0, 2000));
      } 
      
/*  77 */       operLog.setMethod(getOperName(joinPoint));
      
/*  79 */       operLog.setRequestMethod(ServletUtils.getRequest().getMethod());
/*  80 */       TreadUtils.me().execute(TimeTaskFactory.recordOper(operLog));
    } 
  }



  
  private static Log getAnnotationLog(JoinPoint joinPoint) {
/*  88 */     Signature signature = joinPoint.getSignature();
/*  89 */     MethodSignature methodSignature = (MethodSignature)signature;
/*  90 */     Method method = methodSignature.getMethod();
/*  91 */     if (method != null) {
/*  92 */       return method.<Log>getAnnotation(Log.class);
    }
/*  94 */     return null;
  }





  
  protected String getOperName(JoinPoint joinPoint) {
/* 103 */     String methodName = "";
/* 104 */     String className = joinPoint.getTarget().getClass().getName();
/* 105 */     String detName = joinPoint.getSignature().getName();
/* 106 */     methodName = StringUtils.isNotBlank(className) ? className.substring(className.lastIndexOf(".") + 1) : "-";
/* 107 */     return methodName + "." + detName + "()";
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\advice\CommonLogAdvice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */