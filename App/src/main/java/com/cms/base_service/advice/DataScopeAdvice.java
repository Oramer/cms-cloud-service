package com.cms.base_service.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.common.redis.RedisCache;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.system_service.system.domain.SysRole;
import com.cms.system_service.system.domain.SysUser;

import java.lang.reflect.Method;


@Aspect
@Component
public class DataScopeAdvice
{
/*  29 */   private static final Logger log = LoggerFactory.getLogger(DataScopeAdvice.class);


  
  @Autowired
  private RedisCache redisCache;


  
  public static final String DATA_SCOPE_ALL = "1";


  
  public static final String DATA_SCOPE_CUSTOM = "2";


  
  public static final String DATA_SCOPE_DEPT = "3";


  
  public static final String DATA_SCOPE_DEPT_AND_CHILD = "4";


  
  public static final String DATA_SCOPE_SELF = "5";


  
  public static final String DEFAULT_USER_ALIAS = "u";


  
  public static final String DEFAULT_DEPT_ALIAS = "d";



  
  @Pointcut("@annotation(com.cms.base_service.annotation.DataScope)")
  public void dataScopePointCut() {}



  
  @Before("dataScopePointCut()")
  public void doBefore(JoinPoint point) throws Throwable {
/*  75 */     handleDataScope(point);
  }

  
  protected void handleDataScope(JoinPoint joinPoint) {
/*  80 */     DataScope controllerDataScope = getAnnotationLog(joinPoint);
/*  81 */     if (controllerDataScope == null) {
      return;
    }
    
/*  85 */     String uid = SecurityUtils.getUserName(((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest());
    
/*  87 */     SysUser user = (SysUser)this.redisCache.getCacheObject("sys_login_user:" + uid);
/*  88 */     if (user != null)
    {
/*  90 */       if (!SecurityUtils.isAdmin().booleanValue()) {
/*  91 */         dataScopeFilter(joinPoint, user, controllerDataScope.deptAlias(), controllerDataScope
/*  92 */             .userAlias());
      }
    }
  }






  
  public static void dataScopeFilter(JoinPoint joinPoint, SysUser user, String deptAlias, String userAlias) {
/* 104 */     StringBuilder sqlString = new StringBuilder();
/* 105 */     deptAlias = StringUtils.isBlank(deptAlias) ? "d" : deptAlias;
/* 106 */     userAlias = StringUtils.isBlank(userAlias) ? "u" : userAlias;
    
/* 108 */     for (SysRole role : user.getRoles()) {
/* 109 */       String dataScope = role.getDataScope();
/* 110 */       if ("1".equals(dataScope)) {
/* 111 */         if (SecurityUtils.isAdmin().booleanValue()) {
/* 112 */           sqlString = new StringBuilder();
          break;
        } 
/* 115 */         sqlString.append(StringUtils.format(" OR {}.dept_id IN ( SELECT dept_id FROM sys_dept WHERE dept_id = '{}' or FIND_IN_SET( '{}' , ancestors ) )", new Object[] { deptAlias, user
/* 116 */                 .getDeptId(), user.getDeptId() })); continue;
      } 
/* 118 */       if ("2".equals(dataScope)) {
/* 119 */         sqlString.append(StringUtils.format(" OR {}.dept_id IN ( SELECT dept_id FROM sys_role_dept WHERE role_id = '{}' ) ", new Object[] { deptAlias, role
                
/* 121 */                 .getRoleId() })); continue;
/* 122 */       }  if ("3".equals(dataScope)) {
/* 123 */         sqlString.append(StringUtils.format(" OR {}.dept_id = '{}' ", new Object[] { deptAlias, user.getDeptId() })); continue;
/* 124 */       }  if ("4".equals(dataScope)) {
/* 125 */         sqlString.append(StringUtils.format(" OR {}.dept_id IN ( SELECT dept_id FROM sys_dept WHERE dept_id = '{}' or FIND_IN_SET( '{}' , ancestors ) )", new Object[] { deptAlias, user
/* 126 */                 .getDeptId(), user.getDeptId() })); continue;
/* 127 */       }  if ("5".equals(dataScope)) {
/* 128 */         sqlString.append(StringUtils.format(" OR {}.user_id = '{}' ", new Object[] { userAlias, user.getUserId() }));
      }
    } 
    
/* 132 */     if (StringUtils.isNotBlank(sqlString.toString()) &&
/* 133 */       joinPoint.getArgs() != null && (joinPoint.getArgs()).length > 0) {
/* 134 */       BaseEntity baseEntity = (BaseEntity)joinPoint.getArgs()[0];
/* 135 */       baseEntity.setDataScope(" AND (" + sqlString.substring(4) + ")");
    } 
  }




  
  private DataScope getAnnotationLog(JoinPoint joinPoint) {
/* 144 */     Signature signature = joinPoint.getSignature();
/* 145 */     MethodSignature methodSignature = (MethodSignature)signature;
/* 146 */     Method method = methodSignature.getMethod();
    
/* 148 */     if (method != null) {
/* 149 */       return method.<DataScope>getAnnotation(DataScope.class);
    }
/* 151 */     return null;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\advice\DataScopeAdvice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */