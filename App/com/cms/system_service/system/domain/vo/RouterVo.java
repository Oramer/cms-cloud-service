package com.cms.system_service.system.domain.vo;

import com.cms.system_service.system.domain.vo.MetaVo;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;










































@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RouterVo
{
  private String name;
  private String path;
  private boolean hidden;
  private String redirect;
  private String component;
  private String query;
  private Boolean alwaysShow;
  private MetaVo meta;
  private List<com.cms.system_service.system.domain.vo.RouterVo> children;
  
  public String getName() {
/*  62 */     return this.name;
  }

  
  public void setName(String name) {
/*  67 */     this.name = name;
  }

  
  public String getPath() {
/*  72 */     return this.path;
  }

  
  public void setPath(String path) {
/*  77 */     this.path = path;
  }

  
  public boolean getHidden() {
/*  82 */     return this.hidden;
  }

  
  public void setHidden(boolean hidden) {
/*  87 */     this.hidden = hidden;
  }

  
  public String getRedirect() {
/*  92 */     return this.redirect;
  }

  
  public void setRedirect(String redirect) {
/*  97 */     this.redirect = redirect;
  }

  
  public String getComponent() {
/* 102 */     return this.component;
  }

  
  public void setComponent(String component) {
/* 107 */     this.component = component;
  }

  
  public String getQuery() {
/* 112 */     return this.query;
  }

  
  public void setQuery(String query) {
/* 117 */     this.query = query;
  }

  
  public Boolean getAlwaysShow() {
/* 122 */     return this.alwaysShow;
  }

  
  public void setAlwaysShow(Boolean alwaysShow) {
/* 127 */     this.alwaysShow = alwaysShow;
  }

  
  public MetaVo getMeta() {
/* 132 */     return this.meta;
  }

  
  public void setMeta(MetaVo meta) {
/* 137 */     this.meta = meta;
  }

  
  public List<com.cms.system_service.system.domain.vo.RouterVo> getChildren() {
/* 142 */     return this.children;
  }

  
  public void setChildren(List<com.cms.system_service.system.domain.vo.RouterVo> children) {
/* 147 */     this.children = children;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\vo\RouterVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */