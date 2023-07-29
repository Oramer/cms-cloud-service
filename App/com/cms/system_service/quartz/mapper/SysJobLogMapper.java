package com.cms.system_service.quartz.mapper;

import com.cms.system_service.quartz.domain.SysJobLog;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysJobLogMapper {
  List<SysJobLog> selectJobLogList(SysJobLog paramSysJobLog);
  
  List<SysJobLog> selectJobLogAll();
  
  SysJobLog selectJobLogById(Long paramLong);
  
  int insertJobLog(SysJobLog paramSysJobLog);
  
  int deleteJobLogByIds(Long[] paramArrayOfLong);
  
  int deleteJobLogById(Long paramLong);
  
  void cleanJobLog();
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quartz\mapper\SysJobLogMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */