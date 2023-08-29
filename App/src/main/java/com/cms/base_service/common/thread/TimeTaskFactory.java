 package com.cms.base_service.common.thread;

 import eu.bitwalker.useragentutils.UserAgent;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import com.cms.base_service.common.model.LoginBody;
 import com.cms.base_service.common.utils.IpUtils;
 import com.cms.base_service.common.utils.ServletUtils;
 import com.cms.base_service.common.utils.StringUtils;
 import com.cms.system_service.system.domain.SysOperLog;

 import java.util.TimerTask;


 public class TimeTaskFactory
 {
/* 20 */   private static final Logger log = LoggerFactory.getLogger(TimeTaskFactory.class);
 
   
   public static TimerTask recordOper(SysOperLog operLog) {
/* 24 */     return (TimerTask)new Object();
   }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
   
   public static TimerTask recordLoginOper(LoginBody loginUser, String status) {
/* 43 */     UserAgent userAgent = UserAgent.parseUserAgentString(ServletUtils.getRequest().getHeader("User-Agent"));
/* 44 */     String ip = IpUtils.getIpAddr(ServletUtils.getRequest());
/* 45 */     return (TimerTask)new Object();
///* 45 */     return (TimerTask)new Object(ip, userAgent, loginUser, status);
   }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
   
   public static TimerTask sendMessage(String receiver, String bussId) {
/* 70 */     if (StringUtils.isNotBlank(receiver) && StringUtils.isNotBlank(bussId)) {
/* 71 */       return (TimerTask)new Object();
///* 71 */       return (TimerTask)new Object(receiver, bussId);
     }
 
 
 
 
 
 
     
/* 80 */     return (TimerTask)new Object();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\thread\TimeTaskFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */