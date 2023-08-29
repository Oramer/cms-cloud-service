 package com.cms.base_service.common.filter;

 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.web.servlet.HandlerInterceptor;
 import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
 import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
 import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 import com.cms.base_service.framework.config.CmsConfig;

 import java.util.Arrays;
 import java.util.List;


 @Configuration
 public class LoginConfig
   implements WebMvcConfigurer
 {
/* 20 */   public static final List<String> EXCLUDE_PATH = Arrays.asList(new String[] { "/login", "/system/config/configKey/*", "/register", "/captchaImage", "/api/**", "/profile/**", "/api/profile", "/captchaImage", "/modeler/*", "*.js", "*.css", "*.ico", "/common/upload", "*.ico", "***/error", "/api/wechatPay/v3/wechatPayNotify" });




   @Bean
   public LoginFilter getFilter() {
/* 27 */     return new LoginFilter();
   }


   public void addInterceptors(InterceptorRegistry registry) {
/* 32 */     registry.addInterceptor((HandlerInterceptor)getFilter())
/* 33 */       .addPathPatterns(new String[] { "/**" }).excludePathPatterns(EXCLUDE_PATH);
   }



   public void addResourceHandlers(ResourceHandlerRegistry registry) {
/* 39 */     registry.addResourceHandler(new String[] { "/profile/*"
/* 40 */         }).addResourceLocations(new String[] { "file:" + CmsConfig.getProfile() + "/" });
/* 41 */     registry.addResourceHandler(new String[] { "/api/profile/*"
/* 42 */         }).addResourceLocations(new String[] { "file:" + CmsConfig.getProfile() + "/" });
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\filter\LoginConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */