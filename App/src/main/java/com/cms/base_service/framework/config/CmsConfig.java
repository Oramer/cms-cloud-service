package com.cms.base_service.framework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;




























@Component
@ConfigurationProperties(prefix = "cms")
public class CmsConfig
{
  private String name;
  private String version;
  private String copyrightYear;
  private boolean demoEnabled;
  private static String profile;
  private static boolean addressEnabled;
  
  public String getName() {
/*  45 */     return this.name;
  }
  
  public void setName(String name) {
/*  49 */     this.name = name;
  }
  
  public String getVersion() {
/*  53 */     return this.version;
  }
  
  public void setVersion(String version) {
/*  57 */     this.version = version;
  }
  
  public String getCopyrightYear() {
/*  61 */     return this.copyrightYear;
  }
  
  public void setCopyrightYear(String copyrightYear) {
/*  65 */     this.copyrightYear = copyrightYear;
  }
  
  public boolean isDemoEnabled() {
/*  69 */     return this.demoEnabled;
  }
  
  public void setDemoEnabled(boolean demoEnabled) {
/*  73 */     this.demoEnabled = demoEnabled;
  }
  
  public static String getProfile() {
/*  77 */     return profile;
  }
  
  public void setProfile(String profile) {
/*  81 */     CmsConfig.profile = profile;
  }
  
  public static boolean isAddressEnabled() {
/*  85 */     return addressEnabled;
  }
  
  public void setAddressEnabled(boolean addressEnabled) {
/*  89 */     CmsConfig.addressEnabled = addressEnabled;
  }



  
  public static String getImportPath() {
/*  96 */     return getProfile() + "/import";
  }



  
  public static String getAvatarPath() {
/* 103 */     return getProfile() + "/avatar";
  }



  
  public static String getDownloadPath() {
/* 110 */     return getProfile() + "/download/";
  }



  
  public static String getUploadPath() {
/* 117 */     return getProfile() + "/upload";
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\config\CmsConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */