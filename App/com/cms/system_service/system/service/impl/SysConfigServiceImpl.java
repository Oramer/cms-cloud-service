package com.cms.system_service.system.service.impl;

import com.aliyun.oss.ServiceException;
import com.cms.base_service.common.redis.RedisCache;
import com.cms.base_service.common.utils.Convert;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.system_service.system.domain.SysConfig;
import com.cms.system_service.system.mapper.SysConfigMapper;
import com.cms.system_service.system.service.ISysConfigService;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;










@Service
public class SysConfigServiceImpl
  implements ISysConfigService
{
  @Autowired
  private SysConfigMapper configMapper;
  @Autowired
  private RedisCache redisCache;
  
  @PostConstruct
  public void init() {
/*  36 */     loadingConfigCache();
  }







  
  public SysConfig selectConfigById(Long configId) {
/*  47 */     SysConfig config = new SysConfig();
/*  48 */     config.setConfigId(configId);
/*  49 */     return this.configMapper.selectConfig(config);
  }







  
  public String selectConfigByKey(String configKey) {
/*  60 */     String configValue = Convert.toStr(this.redisCache.getCacheObject(getCacheKey(configKey)));
/*  61 */     if (StringUtils.isNotEmpty(configValue)) {
/*  62 */       return configValue;
    }
/*  64 */     SysConfig config = new SysConfig();
/*  65 */     config.setConfigKey(configKey);
/*  66 */     SysConfig retConfig = this.configMapper.selectConfig(config);
/*  67 */     if (StringUtils.isNotNull(retConfig)) {
/*  68 */       this.redisCache.setCacheObject(getCacheKey(configKey), retConfig.getConfigValue());
/*  69 */       return retConfig.getConfigValue();
    } 
/*  71 */     return "";
  }






  
  public boolean selectCaptchaOnOff() {
/*  81 */     String captchaOnOff = selectConfigByKey("sys.account.captchaOnOff");
/*  82 */     if (StringUtils.isEmpty(captchaOnOff)) {
/*  83 */       return true;
    }
/*  85 */     return Convert.toBool(captchaOnOff).booleanValue();
  }







  
  public List<SysConfig> selectConfigList(SysConfig config) {
/*  96 */     return this.configMapper.selectConfigList(config);
  }







  
  public int insertConfig(SysConfig config) {
/* 107 */     int row = this.configMapper.insertConfig(config);
/* 108 */     if (row > 0) {
/* 109 */       this.redisCache.setCacheObject(getCacheKey(config.getConfigKey()), config.getConfigValue());
    }
/* 111 */     return row;
  }







  
  public int updateConfig(SysConfig config) {
/* 122 */     int row = this.configMapper.updateConfig(config);
/* 123 */     if (row > 0) {
/* 124 */       this.redisCache.setCacheObject(getCacheKey(config.getConfigKey()), config.getConfigValue());
    }
/* 126 */     return row;
  }






  
  public void deleteConfigByIds(Long[] configIds) {
/* 136 */     for (Long configId : configIds) {
/* 137 */       SysConfig config = selectConfigById(configId);
/* 138 */       if (StringUtils.equals("Y", config.getConfigType())) {
/* 139 */         throw new ServiceException(String.format("内置参数【%1$s】不能删除 ", new Object[] { config.getConfigKey() }));
      }
/* 141 */       this.configMapper.deleteConfigById(configId);
/* 142 */       this.redisCache.deleteObject(getCacheKey(config.getConfigKey()));
    } 
  }




  
  public void loadingConfigCache() {
/* 151 */     List<SysConfig> configsList = this.configMapper.selectConfigList(new SysConfig());
/* 152 */     for (SysConfig config : configsList) {
/* 153 */       this.redisCache.setCacheObject(getCacheKey(config.getConfigKey()), config.getConfigValue());
    }
  }




  
  public void clearConfigCache() {
/* 162 */     Collection<String> keys = this.redisCache.keys("system_config:*");
/* 163 */     this.redisCache.deleteObject(keys);
  }




  
  public void resetConfigCache() {
/* 171 */     clearConfigCache();
/* 172 */     loadingConfigCache();
  }







  
  public String checkConfigKeyUnique(SysConfig config) {
/* 183 */     Long configId = Long.valueOf(StringUtils.isNull(config.getConfigId()) ? -1L : config.getConfigId().longValue());
/* 184 */     SysConfig info = this.configMapper.checkConfigKeyUnique(config.getConfigKey());
/* 185 */     if (StringUtils.isNotNull(info) && info.getConfigId().longValue() != configId.longValue()) {
/* 186 */       return "1";
    }
/* 188 */     return "0";
  }






  
  private String getCacheKey(String configKey) {
/* 198 */     return "system_config:" + configKey;
  }





  
  public String selectCaptchaType() {
/* 207 */     String captchaType = selectConfigByKey("sys.account.captchaType");
/* 208 */     return StringUtils.isNotEmpty(captchaType) ? captchaType : null;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\impl\SysConfigServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */