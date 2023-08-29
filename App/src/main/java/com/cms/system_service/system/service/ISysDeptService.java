package com.cms.system_service.system.service;

import com.cms.base_service.common.utils.TreeSelect;
import com.cms.system_service.system.domain.SysDept;

import java.util.List;

public interface ISysDeptService {
  List<SysDept> selectDeptList(SysDept paramSysDept);
  
  List<SysDept> buildDeptTree(List<SysDept> paramList);
  
  List<TreeSelect> buildDeptTreeSelect(List<SysDept> paramList);
  
  List<Long> selectDeptListByRoleId(Long paramLong);
  
  SysDept selectDeptById(String paramString);
  
  int selectNormalChildrenDeptById(String paramString);
  
  boolean hasChildByDeptId(String paramString);
  
  boolean checkDeptExistUser(String paramString);
  
  String checkDeptNameUnique(SysDept paramSysDept);
  
  void checkDeptDataScope(String paramString);
  
  int insertDept(SysDept paramSysDept);
  
  int updateDept(SysDept paramSysDept);
  
  int deleteDeptById(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\ISysDeptService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */