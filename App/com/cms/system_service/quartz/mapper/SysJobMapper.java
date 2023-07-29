package com.cms.system_service.quartz.mapper;

import com.cms.system_service.quartz.domain.SysJob;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysJobMapper {
  List<SysJob> selectJobList(SysJob paramSysJob);
  
  List<SysJob> selectJobAll();
  
  SysJob selectJobById(Long paramLong);
  
  int deleteJobById(Long paramLong);
  
  int deleteJobByIds(Long[] paramArrayOfLong);
  
  int updateJob(SysJob paramSysJob);
  
  int insertJob(SysJob paramSysJob);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quartz\mapper\SysJobMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */