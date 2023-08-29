 package com.cms.base_service.config;

 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.web.cors.CorsConfiguration;
 import org.springframework.web.cors.CorsConfigurationSource;
 import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
 import org.springframework.web.filter.CorsFilter;
 
 @Configuration
 public class CorsConfig
 {
   @Bean
   public CorsFilter corsFilter() {
/* 15 */     CorsConfiguration config = new CorsConfiguration();
     
///* 17 */     config.addAllowedOriginPattern("*");
             config.addAllowedOrigin("*");
     
/* 19 */     config.setAllowCredentials(Boolean.valueOf(true));
     
/* 21 */     config.addAllowedMethod("*");
     
/* 23 */     config.addAllowedHeader("*");
/* 24 */     config.addExposedHeader("Content-Type");
/* 25 */     config.addExposedHeader("X-Requested-With");
/* 26 */     config.addExposedHeader("accept");
/* 27 */     config.addExposedHeader("Origin");
/* 28 */     config.addExposedHeader("Access-Control-Request-Method");
/* 29 */     config.addExposedHeader("Access-Control-Request-Headers");
     
/* 31 */     UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
/* 32 */     configSource.registerCorsConfiguration("/**", config);
 
     
/* 35 */     return new CorsFilter((CorsConfigurationSource)configSource);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\config\CorsConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */