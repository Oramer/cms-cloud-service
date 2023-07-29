package com.cms.system_service.system.controller;

import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.system_service.system.domain.SysMenu;
import com.cms.system_service.system.service.ISysMenuService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;









@RestController
@RequestMapping({"/system/menu"})
public class SysMenuController
  extends BaseController
{
  @Autowired
  private ISysMenuService menuService;

  @PreAuthor("system:menu:list")
  @GetMapping({"/list"})
  public RestResult list(SysMenu menu) {
/*  43 */     List<SysMenu> menus = this.menuService.selectMenuList(menu, getUserId());
/*  44 */     return RestResult.ok(menus);
  }




  @PreAuthor("system:menu:query")
  @GetMapping({"/{menuId}"})
  public RestResult getInfo(@PathVariable Long menuId) {
/*  53 */     return RestResult.ok(this.menuService.selectMenuById(menuId));
  }




  @GetMapping({"/treeselect"})
  public RestResult treeselect(SysMenu menu) {
/*  61 */     List<SysMenu> menus = this.menuService.selectMenuList(menu, getUserId());
/*  62 */     return RestResult.ok(this.menuService.buildMenuTreeSelect(menus));
  }




  @GetMapping({"/roleMenuTreeselect/{roleId}"})
  public RestResult roleMenuTreeselect(@PathVariable("roleId") Long roleId) {
/*  70 */     List<SysMenu> menus = this.menuService.selectMenuList(getUserId());
/*  71 */     HashMap<String, Object> map = new HashMap<>();
/*  72 */     map.put("checkedKeys", this.menuService.selectMenuListByRoleId(roleId));
/*  73 */     map.put("menus", this.menuService.buildMenuTreeSelect(menus));
/*  74 */     RestResult ajax = RestResult.ok(map);
/*  75 */     return ajax;
  }




  @PreAuthor("system:menu:add")
  @Log(title = "菜单管理", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@Validated @RequestBody SysMenu menu) {
/*  85 */     if ("1".equals(this.menuService.checkMenuNameUnique(menu)))
/*  86 */       return RestResult.fail("新增菜单'" + menu.getMenuName() + "'失败，菜单名称已存在"); 
/*  87 */     if ("0".equals(menu.getIsFrame()) && !StringUtils.ishttp(menu.getPath())) {
/*  88 */       return RestResult.fail("新增菜单'" + menu.getMenuName() + "'失败，地址必须以http(s)://开头");
    }
/*  90 */     menu.setCreateBy(getUsername());
/*  91 */     return toAjax(this.menuService.insertMenu(menu));
  }




  @PreAuthor("system:menu:edit")
  @Log(title = "菜单管理", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@Validated @RequestBody SysMenu menu) {
/* 101 */     if ("1".equals(this.menuService.checkMenuNameUnique(menu)))
/* 102 */       return RestResult.fail("修改菜单'" + menu.getMenuName() + "'失败，菜单名称已存在"); 
/* 103 */     if ("0".equals(menu.getIsFrame()) && !StringUtils.ishttp(menu.getPath()))
/* 104 */       return RestResult.fail("修改菜单'" + menu.getMenuName() + "'失败，地址必须以http(s)://开头"); 
/* 105 */     if (menu.getMenuId() == menu.getParentId()) {
/* 106 */       return RestResult.fail("修改菜单'" + menu.getMenuName() + "'失败，上级菜单不能选择自己");
    }
/* 108 */     menu.setUpdateBy(getUsername());
/* 109 */     return toAjax(this.menuService.updateMenu(menu));
  }




  @PreAuthor("system:menu:remove")
  @Log(title = "菜单管理", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{menuId}"})
  public RestResult remove(@PathVariable("menuId") Long menuId) {
/* 119 */     if (this.menuService.hasChildByMenuId(menuId)) {
/* 120 */       return RestResult.fail("存在子菜单,不允许删除");
    }
/* 122 */     if (this.menuService.checkMenuExistRole(menuId)) {
/* 123 */       return RestResult.fail("菜单已分配,不允许删除");
    }
/* 125 */     return toAjax(this.menuService.deleteMenuById(menuId));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysMenuController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */