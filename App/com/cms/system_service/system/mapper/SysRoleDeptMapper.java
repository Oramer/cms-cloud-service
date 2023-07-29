package com.cms.system_service.system.mapper;

import com.cms.system_service.system.domain.SysRoleDept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleDeptMapper {
  int deleteRoleDeptByRoleId(Long paramLong);
  
  int deleteRoleDept(Long[] paramArrayOfLong);
  
  int selectCountRoleDeptByDeptId(Long paramLong);
  
  int batchRoleDept(List<SysRoleDept> paramList);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysRoleDeptMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */