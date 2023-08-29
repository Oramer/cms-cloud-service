 package com.cms.base_service.framework.config;

 import org.springframework.stereotype.Component;
 import com.cms.base_service.common.utils.ServletUtils;

 import javax.servlet.http.HttpServletRequest;


 @Component
 public class ServerConfig
 {
   public String getUrl() {
/* 21 */     HttpServletRequest request = ServletUtils.getRequest();
/* 22 */     return getDomain(request);
   }

   public static String getDomain(HttpServletRequest request) {
/* 26 */     StringBuffer url = request.getRequestURL();
/* 27 */     String contextPath = request.getServletContext().getContextPath();
/* 28 */     return url.delete(url.length() - request.getRequestURI().length(), url.length()).append(contextPath).toString();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\config\ServerConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */