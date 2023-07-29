package com.cms.system_service.system.mapper;

import com.cms.system_service.system.domain.SysLoginLog;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysLoginLogMapper {
  SysLoginLog selectSysLoginLogById(Long paramLong);
  
  List<SysLoginLog> selectSysLoginLogList(SysLoginLog paramSysLoginLog);
  
  int insertSysLoginLog(SysLoginLog paramSysLoginLog);
  
  int updateSysLoginLog(SysLoginLog paramSysLoginLog);
  
  int deleteSysLoginLogById(Long paramLong);
  
  int deleteSysLoginLogByIds(Long[] paramArrayOfLong);
  
  void cleanLog();
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysLoginLogMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */