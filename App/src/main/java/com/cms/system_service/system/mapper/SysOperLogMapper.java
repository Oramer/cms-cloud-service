package com.cms.system_service.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.system_service.system.domain.SysOperLog;

import java.util.List;

@Mapper
public interface SysOperLogMapper {
  void insertOperlog(SysOperLog paramSysOperLog);
  
  List<SysOperLog> selectOperLogList(SysOperLog paramSysOperLog);
  
  int deleteOperLogByIds(Long[] paramArrayOfLong);
  
  SysOperLog selectOperLogById(Long paramLong);
  
  void cleanOperLog();
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysOperLogMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */