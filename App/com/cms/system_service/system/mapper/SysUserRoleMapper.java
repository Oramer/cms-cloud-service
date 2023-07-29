package com.cms.system_service.system.mapper;

import com.cms.system_service.system.domain.SysUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserRoleMapper {
  int deleteUserRoleByUserId(String paramString);
  
  int deleteUserRole(String[] paramArrayOfString);
  
  int countUserRoleByRoleId(Long paramLong);
  
  int batchUserRole(List<SysUserRole> paramList);
  
  int addUserRole(SysUserRole paramSysUserRole);
  
  int deleteUserRoleInfo(SysUserRole paramSysUserRole);
  
  int deleteUserRoleInfos(@Param("roleId") Long paramLong, @Param("userIds") Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysUserRoleMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */