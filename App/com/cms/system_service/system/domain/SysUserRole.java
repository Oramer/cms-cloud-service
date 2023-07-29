 package com.cms.system_service.system.domain;
 
 import org.apache.commons.lang3.builder.ToStringBuilder;
 import org.apache.commons.lang3.builder.ToStringStyle;
 
 
 
 
 
 
 
 
 
 
 
 
 public class SysUserRole
 {
   private String userId;
   private Long roleId;
   
   public String getUserId() {
/* 23 */     return this.userId;
   }
   
   public void setUserId(String userId) {
/* 27 */     this.userId = userId;
   }
   
   public Long getRoleId() {
/* 31 */     return this.roleId;
   }
   
   public void setRoleId(Long roleId) {
/* 35 */     this.roleId = roleId;
   }
 
   
   public String toString() {
/* 40 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 41 */       .append("userId", getUserId())
/* 42 */       .append("roleId", getRoleId())
/* 43 */       .toString();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysUserRole.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */