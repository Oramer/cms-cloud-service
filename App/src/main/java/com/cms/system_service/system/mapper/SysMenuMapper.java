package com.cms.system_service.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.cms.system_service.system.domain.SysMenu;

import java.util.List;

@Mapper
public interface SysMenuMapper {
  List<SysMenu> selectMenuList(SysMenu paramSysMenu);
  
  List<String> selectMenuPerms();
  
  List<SysMenu> selectMenuListByUserId(SysMenu paramSysMenu);
  
  List<String> selectMenuPermsByUserId(String paramString);
  
  List<SysMenu> selectMenuTreeAll();
  
  List<SysMenu> selectMenuTreeByUserId(String paramString);
  
  List<Long> selectMenuListByRoleId(@Param("roleId") Long paramLong, @Param("menuCheckStrictly") boolean paramBoolean);
  
  SysMenu selectMenuById(Long paramLong);
  
  int hasChildByMenuId(Long paramLong);
  
  int insertMenu(SysMenu paramSysMenu);
  
  int updateMenu(SysMenu paramSysMenu);
  
  int deleteMenuById(Long paramLong);
  
  SysMenu checkMenuNameUnique(@Param("menuName") String paramString1, @Param("parentId") String paramString2);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysMenuMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */