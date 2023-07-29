package com.cms.system_service.system.service;

import com.cms.system_service.system.domain.SysRole;
import com.cms.system_service.system.domain.SysUserRole;
import java.util.List;
import java.util.Set;

public interface ISysRoleService {
  List<SysRole> selectRoleList(SysRole paramSysRole);
  
  List<SysRole> selectRolesByUserId(String paramString);
  
  Set<String> selectRolePermissionByUserId(String paramString);
  
  List<SysRole> selectRoleAll();
  
  List<Long> selectRoleListByUserId(Long paramLong);
  
  SysRole selectRoleById(Long paramLong);
  
  String checkRoleNameUnique(SysRole paramSysRole);
  
  String checkRoleKeyUnique(SysRole paramSysRole);
  
  void checkRoleAllowed(SysRole paramSysRole);
  
  void checkRoleDataScope(Long paramLong);
  
  int countUserRoleByRoleId(Long paramLong);
  
  int insertRole(SysRole paramSysRole);
  
  int updateRole(SysRole paramSysRole);
  
  int updateRoleStatus(SysRole paramSysRole);
  
  int authDataScope(SysRole paramSysRole);
  
  int deleteRoleById(Long paramLong);
  
  int deleteRoleByIds(Long[] paramArrayOfLong);
  
  int deleteAuthUser(SysUserRole paramSysUserRole);
  
  int deleteAuthUsers(Long paramLong, Long[] paramArrayOfLong);
  
  int insertAuthUsers(Long paramLong, String[] paramArrayOfString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\ISysRoleService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */