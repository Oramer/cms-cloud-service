package com.cms.system_service.system.mapper;

import com.cms.system_service.system.domain.SysConfig;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysConfigMapper {
  SysConfig selectConfig(SysConfig paramSysConfig);
  
  List<SysConfig> selectConfigList(SysConfig paramSysConfig);
  
  SysConfig checkConfigKeyUnique(String paramString);
  
  int insertConfig(SysConfig paramSysConfig);
  
  int updateConfig(SysConfig paramSysConfig);
  
  int deleteConfigById(Long paramLong);
  
  int deleteConfigByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysConfigMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */