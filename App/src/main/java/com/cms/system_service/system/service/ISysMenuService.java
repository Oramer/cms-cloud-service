package com.cms.system_service.system.service;

import com.cms.base_service.common.utils.TreeSelect;
import com.cms.system_service.system.domain.SysMenu;
import com.cms.system_service.system.domain.vo.RouterVo;

import java.util.List;
import java.util.Set;

public interface ISysMenuService {
  List<SysMenu> selectMenuList(String paramString);
  
  List<SysMenu> selectMenuList(SysMenu paramSysMenu, String paramString);
  
  Set<String> selectMenuPermsByUserId(String paramString);
  
  List<SysMenu> selectMenuTreeByUserId(String paramString);
  
  List<Long> selectMenuListByRoleId(Long paramLong);
  
  List<RouterVo> buildMenus(List<SysMenu> paramList);
  
  List<SysMenu> buildMenuTree(List<SysMenu> paramList);
  
  List<TreeSelect> buildMenuTreeSelect(List<SysMenu> paramList);
  
  SysMenu selectMenuById(Long paramLong);
  
  boolean hasChildByMenuId(Long paramLong);
  
  boolean checkMenuExistRole(Long paramLong);
  
  int insertMenu(SysMenu paramSysMenu);
  
  int updateMenu(SysMenu paramSysMenu);
  
  int deleteMenuById(Long paramLong);
  
  String checkMenuNameUnique(SysMenu paramSysMenu);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\ISysMenuService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */