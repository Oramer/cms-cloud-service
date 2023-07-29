package com.cms.system_service.system.service.impl;

import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.common.utils.TreeSelect;
import com.cms.system_service.system.domain.SysMenu;
import com.cms.system_service.system.domain.SysRole;
import com.cms.system_service.system.domain.vo.MetaVo;
import com.cms.system_service.system.domain.vo.RouterVo;
import com.cms.system_service.system.mapper.SysMenuMapper;
import com.cms.system_service.system.mapper.SysRoleMapper;
import com.cms.system_service.system.mapper.SysRoleMenuMapper;
import com.cms.system_service.system.service.ISysMenuService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;









@Service
public class SysMenuServiceImpl
  implements ISysMenuService
{
  public static final String PREMISSION_STRING = "perms[\"{0}\"]";
  @Autowired(required = false)
  private SysMenuMapper menuMapper;
  @Autowired(required = false)
  private SysRoleMapper roleMapper;
  @Autowired(required = false)
  private SysRoleMenuMapper roleMenuMapper;
  
  public List<SysMenu> selectMenuList(String userId) {
/*  47 */     return selectMenuList(new SysMenu(), userId);
  }







  
  public List<SysMenu> selectMenuList(SysMenu menu, String userId) {
/*  58 */     List<SysMenu> menuList = null;
    
/*  60 */     if (SecurityUtils.isAdmin(userId).booleanValue()) {
/*  61 */       menuList = this.menuMapper.selectMenuList(menu);
    } else {
/*  63 */       menu.getParams().put("userId", userId);
/*  64 */       menuList = this.menuMapper.selectMenuListByUserId(menu);
    } 
/*  66 */     return menuList;
  }







  
  public Set<String> selectMenuPermsByUserId(String userId) {
/*  77 */     List<String> perms = this.menuMapper.selectMenuPermsByUserId(userId);
/*  78 */     Set<String> permsSet = new HashSet<>();
/*  79 */     for (String perm : perms) {
/*  80 */       if (StringUtils.isNotEmpty(perm)) {
/*  81 */         permsSet.addAll(Arrays.asList(perm.trim().split(",")));
      }
    } 
/*  84 */     return permsSet;
  }







  
  public List<SysMenu> selectMenuTreeByUserId(String userId) {
/*  95 */     List<SysMenu> menus = null;
/*  96 */     if (SecurityUtils.isAdmin(userId).booleanValue()) {
/*  97 */       menus = this.menuMapper.selectMenuTreeAll();
    } else {
/*  99 */       menus = this.menuMapper.selectMenuTreeByUserId(userId);
    } 
/* 101 */     return getChildPerms(menus, "0");
  }







  
  public List<Long> selectMenuListByRoleId(Long roleId) {
/* 112 */     SysRole role = this.roleMapper.selectRoleById(roleId);
/* 113 */     return this.menuMapper.selectMenuListByRoleId(roleId, role.isMenuCheckStrictly());
  }







  
  public List<RouterVo> buildMenus(List<SysMenu> menus) {
/* 124 */     List<RouterVo> routers = new LinkedList<>();
/* 125 */     for (SysMenu menu : menus) {
/* 126 */       RouterVo router = new RouterVo();
/* 127 */       router.setHidden("1".equals(menu.getVisible()));
/* 128 */       router.setName(getRouteName(menu));
/* 129 */       router.setPath(getRouterPath(menu));
/* 130 */       router.setComponent(getComponent(menu));
/* 131 */       router.setQuery(menu.getQuery());
/* 132 */       router.setMeta(new MetaVo(menu.getMenuName(), menu.getIcon(), StringUtils.equals("1", menu.getIsCache()), menu.getPath()));
/* 133 */       List<SysMenu> cMenus = menu.getChildren();
/* 134 */       if (!cMenus.isEmpty() && cMenus.size() > 0 && "M".equals(menu.getMenuType())) {
/* 135 */         router.setAlwaysShow(Boolean.valueOf(true));
/* 136 */         router.setRedirect("noRedirect");
/* 137 */         router.setChildren(buildMenus(cMenus));
/* 138 */       } else if (isMenuFrame(menu)) {
/* 139 */         router.setMeta(null);
/* 140 */         List<RouterVo> childrenList = new ArrayList<>();
/* 141 */         RouterVo children = new RouterVo();
/* 142 */         children.setPath(menu.getPath());
/* 143 */         children.setComponent(menu.getComponent());
/* 144 */         children.setName(StringUtils.capitalize(menu.getPath()));
/* 145 */         children.setMeta(new MetaVo(menu.getMenuName(), menu.getIcon(), StringUtils.equals("1", menu.getIsCache()), menu.getPath()));
/* 146 */         children.setQuery(menu.getQuery());
/* 147 */         childrenList.add(children);
/* 148 */         router.setChildren(childrenList);
/* 149 */       } else if ("0".equalsIgnoreCase(menu.getParentId()) && isInnerLink(menu)) {
/* 150 */         router.setMeta(new MetaVo(menu.getMenuName(), menu.getIcon()));
/* 151 */         router.setPath("/");
/* 152 */         List<RouterVo> childrenList = new ArrayList<>();
/* 153 */         RouterVo children = new RouterVo();
/* 154 */         String routerPath = innerLinkReplaceEach(menu.getPath());
/* 155 */         children.setPath(routerPath);
/* 156 */         children.setComponent("InnerLink");
/* 157 */         children.setName(StringUtils.capitalize(routerPath));
/* 158 */         children.setMeta(new MetaVo(menu.getMenuName(), menu.getIcon(), menu.getPath()));
/* 159 */         childrenList.add(children);
/* 160 */         router.setChildren(childrenList);
      } 
/* 162 */       routers.add(router);
    } 
/* 164 */     return routers;
  }







  
  public List<SysMenu> buildMenuTree(List<SysMenu> menus) {
/* 175 */     List<SysMenu> returnList = new ArrayList<>();
/* 176 */     List<String> tempList = new ArrayList<>();
/* 177 */     for (SysMenu dept : menus) {
/* 178 */       tempList.add(dept.getMenuId());
    }
/* 180 */     for (Iterator<SysMenu> iterator = menus.iterator(); iterator.hasNext(); ) {
/* 181 */       SysMenu menu = iterator.next();
      
/* 183 */       if (null != menu.getParentId() && !tempList.contains(menu.getParentId())) {
/* 184 */         recursionFn(menus, menu);
/* 185 */         returnList.add(menu);
      } 
    } 
/* 188 */     if (returnList.isEmpty()) {
/* 189 */       returnList = menus;
    }
/* 191 */     return returnList;
  }







  
  public List<TreeSelect> buildMenuTreeSelect(List<SysMenu> menus) {
/* 202 */     List<SysMenu> menuTrees = buildMenuTree(menus);
/* 203 */     return (List<TreeSelect>)menuTrees.stream().map(TreeSelect::new).collect(Collectors.toList());
  }







  
  public SysMenu selectMenuById(Long menuId) {
/* 214 */     return this.menuMapper.selectMenuById(menuId);
  }







  
  public boolean hasChildByMenuId(Long menuId) {
/* 225 */     int result = this.menuMapper.hasChildByMenuId(menuId);
/* 226 */     return (result > 0);
  }







  
  public boolean checkMenuExistRole(Long menuId) {
/* 237 */     int result = this.roleMenuMapper.checkMenuExistRole(menuId);
/* 238 */     return (result > 0);
  }







  
  public int insertMenu(SysMenu menu) {
/* 249 */     return this.menuMapper.insertMenu(menu);
  }







  
  public int updateMenu(SysMenu menu) {
/* 260 */     return this.menuMapper.updateMenu(menu);
  }







  
  public int deleteMenuById(Long menuId) {
/* 271 */     return this.menuMapper.deleteMenuById(menuId);
  }







  
  public String checkMenuNameUnique(SysMenu menu) {
/* 282 */     String menuId = StringUtils.isNull(menu.getMenuId()) ? "-1" : menu.getMenuId();
/* 283 */     SysMenu info = this.menuMapper.checkMenuNameUnique(menu.getMenuName(), menu.getParentId());
/* 284 */     if (StringUtils.isNotNull(info) && !info.getMenuId().equalsIgnoreCase(menuId)) {
/* 285 */       return "1";
    }
/* 287 */     return "0";
  }






  
  public String getRouteName(SysMenu menu) {
/* 297 */     String routerName = StringUtils.capitalize(menu.getPath());
    
/* 299 */     if (isMenuFrame(menu)) {
/* 300 */       routerName = "";
    }
/* 302 */     return routerName;
  }






  
  public String getRouterPath(SysMenu menu) {
/* 312 */     String routerPath = menu.getPath();
    
/* 314 */     if (!"0".equalsIgnoreCase(menu.getParentId()) && isInnerLink(menu)) {
/* 315 */       routerPath = innerLinkReplaceEach(routerPath);
    }
    
/* 318 */     if ("0".equalsIgnoreCase(menu.getParentId()) && "M".equals(menu.getMenuType()) && "1"
/* 319 */       .equals(menu.getIsFrame())) {
/* 320 */       routerPath = "/" + menu.getPath();
    
    }
/* 323 */     else if (isMenuFrame(menu)) {
/* 324 */       routerPath = "/";
    } 
/* 326 */     return routerPath;
  }






  
  public String getComponent(SysMenu menu) {
/* 336 */     String component = "Layout";
/* 337 */     if (StringUtils.isNotEmpty(menu.getComponent()) && !isMenuFrame(menu)) {
/* 338 */       component = menu.getComponent();
/* 339 */     } else if (StringUtils.isEmpty(menu.getComponent()) && !"0".equalsIgnoreCase(menu.getParentId()) && isInnerLink(menu)) {
/* 340 */       component = "InnerLink";
/* 341 */     } else if (StringUtils.isEmpty(menu.getComponent()) && isParentView(menu)) {
/* 342 */       component = "ParentView";
    } 
/* 344 */     return component;
  }






  
  public boolean isMenuFrame(SysMenu menu) {
/* 354 */     return ("0".equalsIgnoreCase(menu.getParentId()) && "C".equals(menu.getMenuType()) && menu
/* 355 */       .getIsFrame().equals("1"));
  }






  
  public boolean isParentView(SysMenu menu) {
/* 365 */     return (!"0".equalsIgnoreCase(menu.getParentId()) && "M".equals(menu.getMenuType()));
  }






  
  public boolean isInnerLink(SysMenu menu) {
/* 375 */     return (menu.getIsFrame().equals("1") && StringUtils.ishttp(menu.getPath()));
  }







  
  public List<SysMenu> getChildPerms(List<SysMenu> list, String parentId) {
/* 386 */     List<SysMenu> returnList = new ArrayList<>();
/* 387 */     for (Iterator<SysMenu> iterator = list.iterator(); iterator.hasNext(); ) {
/* 388 */       SysMenu t = iterator.next();
      
/* 390 */       if (null != t.getParentId() && t.getParentId().equalsIgnoreCase(parentId)) {
/* 391 */         recursionFn(list, t);
/* 392 */         returnList.add(t);
      } 
    } 
/* 395 */     return returnList;
  }







  
  private void recursionFn(List<SysMenu> list, SysMenu t) {
/* 406 */     List<SysMenu> childList = getChildList(list, t);
/* 407 */     t.setChildren(childList);
/* 408 */     for (SysMenu tChild : childList) {
/* 409 */       if (hasChild(list, tChild)) {
/* 410 */         recursionFn(list, tChild);
      }
    } 
  }



  
  private List<SysMenu> getChildList(List<SysMenu> list, SysMenu t) {
/* 419 */     List<SysMenu> tlist = new ArrayList<>();
/* 420 */     Iterator<SysMenu> it = list.iterator();
/* 421 */     while (it.hasNext()) {
/* 422 */       SysMenu n = it.next();
/* 423 */       if (null != n.getParentId() && n.getParentId().equalsIgnoreCase(t.getMenuId())) {
/* 424 */         tlist.add(n);
      }
    } 
/* 427 */     return tlist;
  }



  
  private boolean hasChild(List<SysMenu> list, SysMenu t) {
/* 434 */     return (getChildList(list, t).size() > 0);
  }





  
  public String innerLinkReplaceEach(String path) {
/* 443 */     return StringUtils.replaceEach(path, new String[] { "http://", "https://" }, new String[] { "", "" });
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\impl\SysMenuServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */