package com.cms.system_service.system.service;

import com.cms.buss_service.station.domain.SearchUserVo;
import com.cms.buss_service.station.domain.SysUserVo;
import com.cms.system_service.system.domain.SysUser;

import java.util.List;
import java.util.Map;

public interface ISysUserService {
  List<SysUser> selectUserList(SysUser paramSysUser);
  
  List<SysUser> selectAllocatedList(SysUser paramSysUser);
  
  List<SysUser> selectUnallocatedList(SysUser paramSysUser);
  
  SysUser selectUserByUserName(String paramString);
  
  SysUser selectUserById(String paramString);
  
  String selectUserRoleGroup(String paramString);
  
  String selectUserPostGroup(String paramString);
  
  String checkUserNameUnique(String paramString);
  
  String checkPhoneUnique(SysUser paramSysUser);
  
  String checkEmailUnique(SysUser paramSysUser);
  
  void checkUserAllowed(SysUser paramSysUser);
  
  void checkUserDataScope(String paramString);
  
  int insertUser(SysUser paramSysUser);
  
  boolean registerUser(SysUser paramSysUser);
  
  int updateUser(SysUser paramSysUser);
  
  void insertUserAuth(String paramString, Long[] paramArrayOfLong);
  
  int updateUserStatus(SysUser paramSysUser);
  
  int updateUserProfile(SysUser paramSysUser);
  
  boolean updateUserAvatar(String paramString1, String paramString2);
  
  int resetPwd(SysUser paramSysUser);
  
  int resetUserPwd(String paramString1, String paramString2);
  
  int deleteUserById(String paramString);
  
  int deleteUserByIds(String[] paramArrayOfString);
  
  String importUser(List<SysUser> paramList, Boolean paramBoolean, String paramString);
  
  List<Map<String, Object>> selectUserOption(SysUser paramSysUser);
  
  Map<String, Object> queryUserInfoCount(String paramString);
  
  List<SysUserVo> selectUserListByHoverCondition(SearchUserVo paramSearchUserVo);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\ISysUserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */