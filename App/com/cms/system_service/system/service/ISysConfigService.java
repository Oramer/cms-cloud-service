package com.cms.system_service.system.service;

import com.cms.system_service.system.domain.SysConfig;
import java.util.List;

public interface ISysConfigService {
  SysConfig selectConfigById(Long paramLong);
  
  String selectConfigByKey(String paramString);
  
  boolean selectCaptchaOnOff();
  
  List<SysConfig> selectConfigList(SysConfig paramSysConfig);
  
  int insertConfig(SysConfig paramSysConfig);
  
  int updateConfig(SysConfig paramSysConfig);
  
  void deleteConfigByIds(Long[] paramArrayOfLong);
  
  void loadingConfigCache();
  
  void clearConfigCache();
  
  void resetConfigCache();
  
  String checkConfigKeyUnique(SysConfig paramSysConfig);
  
  String selectCaptchaType();
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\ISysConfigService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */