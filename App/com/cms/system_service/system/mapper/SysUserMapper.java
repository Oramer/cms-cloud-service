package com.cms.system_service.system.mapper;

import com.cms.buss_service.station.domain.SearchUserVo;
import com.cms.buss_service.station.domain.SysUserVo;
import com.cms.system_service.system.domain.SysUser;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper {
  List<SysUser> selectUserList(SysUser paramSysUser);
  
  List<SysUser> selectAllocatedList(SysUser paramSysUser);
  
  List<SysUser> selectUnallocatedList(SysUser paramSysUser);
  
  SysUser selectUserByUserName(String paramString);
  
  SysUser selectUserById(String paramString);
  
  int insertUser(SysUser paramSysUser);
  
  int updateUser(SysUser paramSysUser);
  
  int updateUserAvatar(@Param("userName") String paramString1, @Param("avatar") String paramString2);
  
  int resetUserPwd(@Param("userName") String paramString1, @Param("password") String paramString2);
  
  int deleteUserById(String paramString);
  
  int deleteUserByIds(String[] paramArrayOfString);
  
  int checkUserNameUnique(String paramString);
  
  SysUser checkPhoneUnique(String paramString);
  
  SysUser checkEmailUnique(String paramString);
  
  List<Map<String, Object>> selectUserOption(SysUser paramSysUser);
  
  Map<String, Object> queryUserInfoCount(String paramString);
  
  List<SysUserVo> selectUserListByHoverCondition(SearchUserVo paramSearchUserVo);
  
  List<SysUser> queryMyGroupUser(String paramString);
  
  String queryUserGroupId(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysUserMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */