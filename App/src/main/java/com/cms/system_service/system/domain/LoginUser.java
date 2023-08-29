package com.cms.system_service.system.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Set;



















































public class LoginUser
{
  private static final long serialVersionUID = 1L;
  private String userId;
  private String deptId;
  private String token;
  private String mobile;
  private Long loginTime;
  private Long expireTime;
  private String ipaddr;
  private String loginLocation;
  private String browser;
  private String os;
  private Set<String> permissions;
  private SysUser user;
  
  public String getMobile() {
/*  74 */     return this.mobile;
  }
  
  public void setMobile(String mobile) {
/*  78 */     this.mobile = mobile;
  }
  
  public String getUserId() {
/*  82 */     return this.userId;
  }
  
  public void setUserId(String userId) {
/*  86 */     this.userId = userId;
  }
  
  public String getDeptId() {
/*  90 */     return this.deptId;
  }
  
  public void setDeptId(String deptId) {
/*  94 */     this.deptId = deptId;
  }
  
  public String getToken() {
/*  98 */     return this.token;
  }
  
  public void setToken(String token) {
/* 102 */     this.token = token;
  }

  
  public LoginUser() {}
  
  public LoginUser(SysUser user) {
/* 109 */     this.user = user;
  }
  
  public LoginUser(SysUser user, Set<String> permissions) {
/* 113 */     this.user = user;
/* 114 */     this.permissions = permissions;
  }
  
  public LoginUser(String userId, String deptId, SysUser user, Set<String> permissions) {
/* 118 */     this.userId = userId;
/* 119 */     this.deptId = deptId;
/* 120 */     this.user = user;
/* 121 */     this.permissions = permissions;
  }




  
  @JSONField(serialize = false)
  public boolean isAccountNonExpired() {
/* 130 */     return true;
  }





  
  @JSONField(serialize = false)
  public boolean isAccountNonLocked() {
/* 140 */     return true;
  }





  
  @JSONField(serialize = false)
  public boolean isCredentialsNonExpired() {
/* 150 */     return true;
  }





  
  @JSONField(serialize = false)
  public boolean isEnabled() {
/* 160 */     return true;
  }
  
  public Long getLoginTime() {
/* 164 */     return this.loginTime;
  }
  
  public void setLoginTime(Long loginTime) {
/* 168 */     this.loginTime = loginTime;
  }
  
  public String getIpaddr() {
/* 172 */     return this.ipaddr;
  }
  
  public void setIpaddr(String ipaddr) {
/* 176 */     this.ipaddr = ipaddr;
  }
  
  public String getLoginLocation() {
/* 180 */     return this.loginLocation;
  }
  
  public void setLoginLocation(String loginLocation) {
/* 184 */     this.loginLocation = loginLocation;
  }
  
  public String getBrowser() {
/* 188 */     return this.browser;
  }
  
  public void setBrowser(String browser) {
/* 192 */     this.browser = browser;
  }
  
  public String getOs() {
/* 196 */     return this.os;
  }
  
  public void setOs(String os) {
/* 200 */     this.os = os;
  }
  
  public Long getExpireTime() {
/* 204 */     return this.expireTime;
  }
  
  public void setExpireTime(Long expireTime) {
/* 208 */     this.expireTime = expireTime;
  }
  
  public Set<String> getPermissions() {
/* 212 */     return this.permissions;
  }
  
  public void setPermissions(Set<String> permissions) {
/* 216 */     this.permissions = permissions;
  }
  
  public SysUser getUser() {
/* 220 */     return this.user;
  }
  
  public void setUser(SysUser user) {
/* 224 */     this.user = user;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\LoginUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */