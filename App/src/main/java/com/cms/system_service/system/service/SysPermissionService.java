 package com.cms.system_service.system.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.system_service.system.domain.SysUser;

 import java.util.HashSet;
 import java.util.Set;


 @Component
 public class SysPermissionService
 {
   @Autowired
   private ISysRoleService roleService;
   @Autowired
   private ISysMenuService menuService;

   public Set<String> getRolePermission(SysUser user) {
/* 31 */     Set<String> roles = new HashSet<>();

/* 33 */     if (SecurityUtils.isAdmin(user.getUserId()).booleanValue()) {
/* 34 */       roles.add("admin");
     } else {
/* 36 */       roles.addAll(this.roleService.selectRolePermissionByUserId(user.getUserId()));
     }
/* 38 */     return roles;
   }







   public Set<String> getMenuPermission(SysUser user) {
/* 48 */     Set<String> perms = new HashSet<>();

/* 50 */     if (SecurityUtils.isAdmin(user.getUserId()).booleanValue()) {
/* 51 */       perms.add("*:*:*");
     } else {
/* 53 */       perms.addAll(this.menuService.selectMenuPermsByUserId(user.getUserId()));
     }
/* 55 */     return perms;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\SysPermissionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */