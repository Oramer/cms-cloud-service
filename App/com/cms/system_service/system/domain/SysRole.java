package com.cms.system_service.system.domain;

import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;























































public class SysRole
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  @Excel(name = "角色序号", cellType = Excel.ColumnType.NUMERIC)
  private Long roleId;
  @Excel(name = "角色名称")
  private String roleName;
  @Excel(name = "角色权限")
  private String roleKey;
  @Excel(name = "角色排序")
  private String roleSort;
  @Excel(name = "数据范围", readConverterExp = "1=所有数据权限,2=自定义数据权限,3=本部门数据权限,4=本部门及以下数据权限,5=仅本人数据权限")
  private String dataScope;
  private boolean menuCheckStrictly;
  private boolean deptCheckStrictly;
  @Excel(name = "角色状态", readConverterExp = "0=正常,1=停用")
  private String status;
  private String delFlag;
  private boolean flag = false;
  private Long[] menuIds;
  private Long[] deptIds;
  
  public SysRole() {}
  
  public SysRole(Long roleId) {
/*  90 */     this.roleId = roleId;
  }
  
  public Long getRoleId() {
/*  94 */     return this.roleId;
  }
  
  public void setRoleId(Long roleId) {
/*  98 */     this.roleId = roleId;
  }
  
  public boolean isAdmin() {
/* 102 */     return isAdmin(this.roleId);
  }
  
  public static boolean isAdmin(Long roleId) {
/* 106 */     return (roleId != null && 1L == roleId.longValue());
  }
  
  @NotBlank(message = "角色名称不能为空")
  @Size(min = 0, max = 30, message = "角色名称长度不能超过30个字符")
  public String getRoleName() {
/* 112 */     return this.roleName;
  }
  
  public void setRoleName(String roleName) {
/* 116 */     this.roleName = roleName;
  }
  
  @NotBlank(message = "权限字符不能为空")
  @Size(min = 0, max = 100, message = "权限字符长度不能超过100个字符")
  public String getRoleKey() {
/* 122 */     return this.roleKey;
  }
  
  public void setRoleKey(String roleKey) {
/* 126 */     this.roleKey = roleKey;
  }
  
  @NotBlank(message = "显示顺序不能为空")
  public String getRoleSort() {
/* 131 */     return this.roleSort;
  }
  
  public void setRoleSort(String roleSort) {
/* 135 */     this.roleSort = roleSort;
  }
  
  public String getDataScope() {
/* 139 */     return this.dataScope;
  }
  
  public void setDataScope(String dataScope) {
/* 143 */     this.dataScope = dataScope;
  }
  
  public boolean isMenuCheckStrictly() {
/* 147 */     return this.menuCheckStrictly;
  }
  
  public void setMenuCheckStrictly(boolean menuCheckStrictly) {
/* 151 */     this.menuCheckStrictly = menuCheckStrictly;
  }
  
  public boolean isDeptCheckStrictly() {
/* 155 */     return this.deptCheckStrictly;
  }
  
  public void setDeptCheckStrictly(boolean deptCheckStrictly) {
/* 159 */     this.deptCheckStrictly = deptCheckStrictly;
  }
  
  public String getStatus() {
/* 163 */     return this.status;
  }
  
  public void setStatus(String status) {
/* 167 */     this.status = status;
  }
  
  public String getDelFlag() {
/* 171 */     return this.delFlag;
  }
  
  public void setDelFlag(String delFlag) {
/* 175 */     this.delFlag = delFlag;
  }
  
  public boolean isFlag() {
/* 179 */     return this.flag;
  }
  
  public void setFlag(boolean flag) {
/* 183 */     this.flag = flag;
  }
  
  public Long[] getMenuIds() {
/* 187 */     return this.menuIds;
  }
  
  public void setMenuIds(Long[] menuIds) {
/* 191 */     this.menuIds = menuIds;
  }
  
  public Long[] getDeptIds() {
/* 195 */     return this.deptIds;
  }
  
  public void setDeptIds(Long[] deptIds) {
/* 199 */     this.deptIds = deptIds;
  }

  
  public String toString() {
/* 204 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 205 */       .append("roleId", getRoleId())
/* 206 */       .append("roleName", getRoleName())
/* 207 */       .append("roleKey", getRoleKey())
/* 208 */       .append("roleSort", getRoleSort())
/* 209 */       .append("dataScope", getDataScope())
/* 210 */       .append("menuCheckStrictly", isMenuCheckStrictly())
/* 211 */       .append("deptCheckStrictly", isDeptCheckStrictly())
/* 212 */       .append("status", getStatus())
/* 213 */       .append("delFlag", getDelFlag())
/* 214 */       .append("createBy", getCreateBy())
/* 215 */       .append("createTime", getCreateTime())
/* 216 */       .append("updateBy", getUpdateBy())
/* 217 */       .append("updateTime", getUpdateTime())
/* 218 */       .append("remark", getRemark())
/* 219 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysRole.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */