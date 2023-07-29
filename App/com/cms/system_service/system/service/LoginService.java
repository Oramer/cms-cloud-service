 package com.cms.system_service.system.service;
 import com.cms.base_service.common.model.Constants;
 import com.cms.base_service.common.model.LoginBody;
 import com.cms.base_service.common.redis.RedisCache;
 import com.cms.base_service.common.thread.TimeTaskFactory;
 import com.cms.base_service.common.thread.TreadUtils;
 import com.cms.base_service.common.utils.JwtUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.base_service.common.utils.StringUtils;
 import com.cms.base_service.common.utils.ValidationUtil;
 import com.cms.base_service.exception.BusinessException;
 import com.cms.system_service.system.domain.SysUser;
 import com.cms.system_service.system.mapper.SysUserMapper;
 import java.util.concurrent.TimeUnit;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class LoginService {
/* 21 */   private static final Logger log = LoggerFactory.getLogger(com.cms.system_service.system.service.LoginService.class);
   
   @Autowired(required = false)
   private SysUserMapper sysUserMapper;
   
   @Autowired
   private RedisCache redisCache;
   @Autowired
   private ISysConfigService sysConfigService;
   
   public String login(LoginBody loginUser) {
/* 32 */     boolean captchaOnOff = this.sysConfigService.selectCaptchaOnOff();
/* 33 */     if (captchaOnOff) {
/* 34 */       String code_redis = (String)this.redisCache.getCacheObject("captcha_codes:" + loginUser.getUuid());
       
/* 36 */       if (StringUtils.isEmpty(code_redis) || !code_redis.equalsIgnoreCase(loginUser.getCode())) {
/* 37 */         loginUser.setReMess("【登录异常】:验证码错误");
/* 38 */         TreadUtils.me().execute(TimeTaskFactory.recordLoginOper(loginUser, "1"));
/* 39 */         throw new BusinessException("【登录异常】:验证码错误");
       } 
     } 
/* 42 */     ValidationUtil.validate(loginUser);
     
/* 44 */     SysUser user = this.sysUserMapper.selectUserByUserName(loginUser.getUsername());
/* 45 */     if (user == null) {
/* 46 */       loginUser.setReMess("【登录异常】:当前账户信息不存在");
/* 47 */       TreadUtils.me().execute(TimeTaskFactory.recordLoginOper(loginUser, "1"));
/* 48 */       throw new BusinessException("【登录异常】:当前账户信息不存在");
     } 
/* 50 */     if (!SecurityUtils.matchesPassword(user.getUserName(), user.getPassword(), loginUser.getPassword())) {
/* 51 */       loginUser.setReMess("【登录异常】:用户名或密码不正确");
/* 52 */       TreadUtils.me().execute(TimeTaskFactory.recordLoginOper(loginUser, "1"));
/* 53 */       throw new BusinessException("【登录异常】:用户名或密码不正确");
     } 
/* 55 */     String jwt = JwtUtils.create(user);
/* 56 */     this.redisCache.setCacheObject("sys_login_user:" + user.getUserName(), user, Long.valueOf(86400000L), TimeUnit.MINUTES);
/* 57 */     this.redisCache.setCacheObject(Constants.Login_USER_REFRESH_KEY + user.getUserName(), jwt, Long.valueOf(86400000L), TimeUnit.MINUTES);
/* 58 */     loginUser.setReMess("【登录成功】:login success");
/* 59 */     TreadUtils.me().execute(TimeTaskFactory.recordLoginOper(loginUser, "0"));
/* 60 */     return jwt;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\LoginService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */