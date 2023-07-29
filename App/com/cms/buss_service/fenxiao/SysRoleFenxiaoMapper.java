package com.cms.buss_service.fenxiao;

import com.cms.buss_service.fenxiao.SysRoleFenxiao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleFenxiaoMapper {
  List<SysRoleFenxiao> selectRoleList(SysRoleFenxiao paramSysRoleFenxiao);
  
  List<SysRoleFenxiao> selectRolePermissionByUserId(String paramString);
  
  List<SysRoleFenxiao> selectRoleAll();
  
  List<Long> selectRoleListByUserId(Long paramLong);
  
  SysRoleFenxiao selectRoleById(Long paramLong);
  
  List<SysRoleFenxiao> selectRolesByUserName(String paramString);
  
  SysRoleFenxiao checkRoleNameUnique(String paramString);
  
  SysRoleFenxiao checkRoleKeyUnique(String paramString);
  
  int updateRole(SysRoleFenxiao paramSysRoleFenxiao);
  
  int insertRole(SysRoleFenxiao paramSysRoleFenxiao);
  
  int deleteRoleById(Long paramLong);
  
  int deleteRoleByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\fenxiao\SysRoleFenxiaoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */