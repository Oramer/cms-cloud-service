 package com.cms.base_service.config;

 import com.cms.base_service.framework.config.CmsConfig;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
 import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;








 @Configuration
 public class ResourcesConfig
   implements WebMvcConfigurer
 {
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
/* 20 */     registry.addResourceHandler(new String[] { "/profile/**"
/* 21 */         }).addResourceLocations(new String[] { "file:" + CmsConfig.getProfile() + "/" });
/* 22 */     registry.addResourceHandler(new String[] { "/api/profile/**"
/* 23 */         }).addResourceLocations(new String[] { "file:" + CmsConfig.getProfile() + "/" });
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\config\ResourcesConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */