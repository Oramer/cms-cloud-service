package com.cms.system_service.system.mapper;

import com.cms.system_service.system.domain.SysDept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysDeptMapper {
  List<SysDept> selectDeptList(SysDept paramSysDept);
  
  List<Long> selectDeptListByRoleId(@Param("roleId") Long paramLong, @Param("deptCheckStrictly") boolean paramBoolean);
  
  SysDept selectDeptById(String paramString);
  
  List<SysDept> selectChildrenDeptById(String paramString);
  
  int selectNormalChildrenDeptById(String paramString);
  
  int hasChildByDeptId(String paramString);
  
  int checkDeptExistUser(String paramString);
  
  SysDept checkDeptNameUnique(@Param("deptName") String paramString1, @Param("parentId") String paramString2);
  
  int insertDept(SysDept paramSysDept);
  
  int updateDept(SysDept paramSysDept);
  
  void updateDeptStatusNormal(Long[] paramArrayOfLong);
  
  int updateDeptChildren(@Param("depts") List<SysDept> paramList);
  
  int deleteDeptById(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysDeptMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */