package com.cms.buss_service.fenxiao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.domain.SysUserRole;
import com.cms.system_service.system.service.ISysUserService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping({"/fenxiao/role"})
public class SysRoleFenxiaoController
  extends BaseController {
  @Autowired
  private SysRoleFenxiaoService roleService;
  
  @GetMapping({"/list"})
  public TableDataInfo list(SysRoleFenxiao role) {
/*  36 */     startPage();
/*  37 */     List<SysRoleFenxiao> list = this.roleService.selectRoleList(role);
/*  38 */     return getDataTable(list);
  } @Autowired
  private ISysUserService userService;
  @Log(title = "角色管理", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, SysRoleFenxiao role) {
/*  44 */     List<SysRoleFenxiao> list = this.roleService.selectRoleList(role);
/*  45 */     ExcelUtil<SysRoleFenxiao> util = new ExcelUtil(SysRoleFenxiao.class);
/*  46 */     util.exportExcel(response, list, "角色数据");
  }



  
  @GetMapping({"/{roleId}"})
  public RestResult getInfo(@PathVariable Long roleId) {
/*  54 */     this.roleService.checkRoleDataScope(roleId);
/*  55 */     return RestResult.ok(this.roleService.selectRoleById(roleId));
  }



  
  @Log(title = "角色管理", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@Validated @RequestBody SysRoleFenxiao role) {
/*  64 */     role.setCreateBy(getUsername());
/*  65 */     return toAjax(this.roleService.insertRole(role));
  }




  
  @Log(title = "角色管理", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@Validated @RequestBody SysRoleFenxiao role) {
/*  75 */     return RestResult.ok(Integer.valueOf(this.roleService.updateRole(role)));
  }




  
  @Log(title = "角色管理", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{roleIds}"})
  public RestResult remove(@PathVariable Long[] roleIds) {
/*  85 */     return toAjax(this.roleService.deleteRoleByIds(roleIds));
  }



  
  @GetMapping({"/optionselect"})
  public RestResult optionselect() {
/*  93 */     return RestResult.ok(this.roleService.selectRoleAll());
  }



  
  @GetMapping({"/authUser/allocatedList"})
  public TableDataInfo allocatedList(SysUser user) {
/* 101 */     startPage();
/* 102 */     List<SysUser> list = this.userService.selectAllocatedList(user);
/* 103 */     return getDataTable(list);
  }



  
  @GetMapping({"/authUser/unallocatedList"})
  public TableDataInfo unallocatedList(SysUser user) {
/* 111 */     startPage();
/* 112 */     List<SysUser> list = this.userService.selectUnallocatedList(user);
/* 113 */     return getDataTable(list);
  }



  
  @Log(title = "角色管理", businessType = BusinessType.GRANT)
  @PutMapping({"/authUser/cancel"})
  public RestResult cancelAuthUser(@RequestBody SysUserRole userRole) {
/* 122 */     return toAjax(this.roleService.deleteAuthUser(userRole));
  }



  
  @Log(title = "角色管理", businessType = BusinessType.GRANT)
  @PutMapping({"/authUser/cancelAll"})
  public RestResult cancelAuthUserAll(Long roleId, Long[] userIds) {
/* 131 */     return toAjax(this.roleService.deleteAuthUsers(roleId, userIds));
  }



  
  @Log(title = "角色管理", businessType = BusinessType.GRANT)
  @PutMapping({"/authUser/selectAll"})
  public RestResult selectAuthUserAll(Long roleId, String[] userIds) {
/* 140 */     this.roleService.checkRoleDataScope(roleId);
/* 141 */     return toAjax(this.roleService.insertAuthUsers(roleId, userIds));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\fenxiao\SysRoleFenxiaoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */