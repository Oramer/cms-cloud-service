package com.cms.system_service.system.mapper;

import com.cms.system_service.system.domain.SysRole;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleMapper {
  List<SysRole> selectRoleList(SysRole paramSysRole);
  
  List<SysRole> selectRolePermissionByUserId(String paramString);
  
  List<SysRole> selectRoleAll();
  
  List<Long> selectRoleListByUserId(Long paramLong);
  
  SysRole selectRoleById(Long paramLong);
  
  List<SysRole> selectRolesByUserName(String paramString);
  
  SysRole checkRoleNameUnique(String paramString);
  
  SysRole checkRoleKeyUnique(String paramString);
  
  int updateRole(SysRole paramSysRole);
  
  int insertRole(SysRole paramSysRole);
  
  int deleteRoleById(Long paramLong);
  
  int deleteRoleByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysRoleMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */