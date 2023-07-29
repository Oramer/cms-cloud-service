package com.cms.system_service.system.controller;

import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.system_service.system.domain.SysRole;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.domain.SysUserRole;
import com.cms.system_service.system.service.ISysRoleService;
import com.cms.system_service.system.service.ISysUserService;
import com.cms.system_service.system.service.SysPermissionService;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
@RequestMapping({"/system/role"})
public class SysRoleController
  extends BaseController
{
  @Autowired
  private ISysRoleService roleService;
  @Autowired
  private SysPermissionService permissionService;
  @Autowired
  private ISysUserService userService;

  @PreAuthor("system:role:list")
  @GetMapping({"/list"})
  public TableDataInfo list(SysRole role) {
/*  55 */     startPage();
/*  56 */     List<SysRole> list = this.roleService.selectRoleList(role);
/*  57 */     return getDataTable(list);
  }

  @Log(title = "角色管理", businessType = BusinessType.EXPORT)
  @PreAuthor("system:role:export")
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, SysRole role) {
/*  64 */     List<SysRole> list = this.roleService.selectRoleList(role);
/*  65 */     ExcelUtil<SysRole> util = new ExcelUtil(SysRole.class);
/*  66 */     util.exportExcel(response, list, "角色数据");
  }




  @PreAuthor("system:role:query")
  @GetMapping({"/{roleId}"})
  public RestResult getInfo(@PathVariable Long roleId) {
/*  75 */     this.roleService.checkRoleDataScope(roleId);
/*  76 */     return RestResult.ok(this.roleService.selectRoleById(roleId));
  }




  @PreAuthor("system:role:add")
  @Log(title = "角色管理", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@Validated @RequestBody SysRole role) {
/*  86 */     if ("1".equals(this.roleService.checkRoleNameUnique(role)))
/*  87 */       return RestResult.fail("新增角色'" + role.getRoleName() + "'失败，角色名称已存在"); 
/*  88 */     if ("1".equals(this.roleService.checkRoleKeyUnique(role))) {
/*  89 */       return RestResult.fail("新增角色'" + role.getRoleName() + "'失败，角色权限标识已存在");
    }
/*  91 */     role.setCreateBy(getUsername());
/*  92 */     return toAjax(this.roleService.insertRole(role));
  }





  @PreAuthor("system:role:edit")
  @Log(title = "角色管理", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@Validated @RequestBody SysRole role) {
/* 103 */     this.roleService.checkRoleAllowed(role);
/* 104 */     this.roleService.checkRoleDataScope(role.getRoleId());
/* 105 */     if ("1".equals(this.roleService.checkRoleNameUnique(role)))
/* 106 */       return RestResult.fail("修改角色'" + role.getRoleName() + "'失败，角色名称已存在"); 
/* 107 */     if ("1".equals(this.roleService.checkRoleKeyUnique(role))) {
/* 108 */       return RestResult.fail("修改角色'" + role.getRoleName() + "'失败，角色权限标识已存在");
    }
/* 110 */     role.setUpdateBy(getUsername());

/* 112 */     if (this.roleService.updateRole(role) > 0) {

/* 114 */       SysUser loginUser = SecurityUtils.getLoginUser();
/* 115 */       if (loginUser != null && !SecurityUtils.isAdmin(loginUser.getUserId()).booleanValue()) {
/* 116 */         loginUser.setPermissionset(this.permissionService.getMenuPermission(loginUser));
      }
/* 118 */       return RestResult.ok();
    }
/* 120 */     return RestResult.fail("修改角色'" + role.getRoleName() + "'失败，请联系管理员");
  }




  @PreAuthor("system:role:edit")
  @Log(title = "角色管理", businessType = BusinessType.UPDATE)
  @PutMapping({"/dataScope"})
  public RestResult dataScope(@RequestBody SysRole role) {
/* 130 */     this.roleService.checkRoleAllowed(role);
/* 131 */     this.roleService.checkRoleDataScope(role.getRoleId());
/* 132 */     return toAjax(this.roleService.authDataScope(role));
  }




  @PreAuthor("system:role:edit")
  @Log(title = "角色管理", businessType = BusinessType.UPDATE)
  @PostMapping({"/changeStatus"})
  public RestResult changeStatus(@RequestBody SysRole role) {
/* 142 */     this.roleService.checkRoleAllowed(role);
/* 143 */     this.roleService.checkRoleDataScope(role.getRoleId());
/* 144 */     role.setUpdateBy(getUsername());
/* 145 */     return toAjax(this.roleService.updateRoleStatus(role));
  }




  @PreAuthor("system:role:remove")
  @Log(title = "角色管理", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{roleIds}"})
  public RestResult remove(@PathVariable Long[] roleIds) {
/* 155 */     return toAjax(this.roleService.deleteRoleByIds(roleIds));
  }




  @PreAuthor("system:role:query")
  @GetMapping({"/optionselect"})
  public RestResult optionselect() {
/* 164 */     return RestResult.ok(this.roleService.selectRoleAll());
  }




  @PreAuthor("system:role:list")
  @GetMapping({"/authUser/allocatedList"})
  public TableDataInfo allocatedList(SysUser user) {
/* 173 */     startPage();
/* 174 */     List<SysUser> list = this.userService.selectAllocatedList(user);
/* 175 */     return getDataTable(list);
  }




  @PreAuthor("system:role:list")
  @GetMapping({"/authUser/unallocatedList"})
  public TableDataInfo unallocatedList(SysUser user) {
/* 184 */     startPage();
/* 185 */     List<SysUser> list = this.userService.selectUnallocatedList(user);
/* 186 */     return getDataTable(list);
  }




  @PreAuthor("system:role:edit")
  @Log(title = "角色管理", businessType = BusinessType.GRANT)
  @PutMapping({"/authUser/cancel"})
  public RestResult cancelAuthUser(@RequestBody SysUserRole userRole) {
/* 196 */     return toAjax(this.roleService.deleteAuthUser(userRole));
  }




  @PreAuthor("system:role:edit")
  @Log(title = "角色管理", businessType = BusinessType.GRANT)
  @PutMapping({"/authUser/cancelAll"})
  public RestResult cancelAuthUserAll(Long roleId, Long[] userIds) {
/* 206 */     return toAjax(this.roleService.deleteAuthUsers(roleId, userIds));
  }




  @PreAuthor("system:role:edit")
  @Log(title = "角色管理", businessType = BusinessType.GRANT)
  @PutMapping({"/authUser/selectAll"})
  public RestResult selectAuthUserAll(Long roleId, String[] userIds) {
/* 216 */     this.roleService.checkRoleDataScope(roleId);
/* 217 */     return toAjax(this.roleService.insertAuthUsers(roleId, userIds));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysRoleController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */