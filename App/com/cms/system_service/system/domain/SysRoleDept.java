 package com.cms.system_service.system.domain;
 
 import org.apache.commons.lang3.builder.ToStringBuilder;
 import org.apache.commons.lang3.builder.ToStringStyle;
 
 
 
 
 
 
 
 
 
 
 
 
 public class SysRoleDept
 {
   private Long roleId;
   private Long deptId;
   
   public Long getRoleId() {
/* 23 */     return this.roleId;
   }
   
   public void setRoleId(Long roleId) {
/* 27 */     this.roleId = roleId;
   }
   
   public Long getDeptId() {
/* 31 */     return this.deptId;
   }
   
   public void setDeptId(Long deptId) {
/* 35 */     this.deptId = deptId;
   }
 
   
   public String toString() {
/* 40 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 41 */       .append("roleId", getRoleId())
/* 42 */       .append("deptId", getDeptId())
/* 43 */       .toString();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysRoleDept.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */