package com.cms.system_service.system.domain;

import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;




















public class SysPost
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  @Excel(name = "岗位序号", cellType = Excel.ColumnType.NUMERIC)
  private String postId;
  @Excel(name = "岗位编码")
  private String postCode;
  @Excel(name = "岗位名称")
  private String postName;
  @Excel(name = "岗位排序")
  private String postSort;
  @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
  private String status;
  private boolean flag = false;
  
  public String getPostId() {
/*  46 */     return this.postId;
  }

  
  public void setPostId(String postId) {
/*  51 */     this.postId = postId;
  }

  
  @NotBlank(message = "岗位编码不能为空")
  @Size(min = 0, max = 64, message = "岗位编码长度不能超过64个字符")
  public String getPostCode() {
/*  58 */     return this.postCode;
  }

  
  public void setPostCode(String postCode) {
/*  63 */     this.postCode = postCode;
  }

  
  @NotBlank(message = "岗位名称不能为空")
  @Size(min = 0, max = 50, message = "岗位名称长度不能超过50个字符")
  public String getPostName() {
/*  70 */     return this.postName;
  }

  
  public void setPostName(String postName) {
/*  75 */     this.postName = postName;
  }

  
  @NotBlank(message = "显示顺序不能为空")
  public String getPostSort() {
/*  81 */     return this.postSort;
  }

  
  public void setPostSort(String postSort) {
/*  86 */     this.postSort = postSort;
  }

  
  public String getStatus() {
/*  91 */     return this.status;
  }

  
  public void setStatus(String status) {
/*  96 */     this.status = status;
  }

  
  public boolean isFlag() {
/* 101 */     return this.flag;
  }

  
  public void setFlag(boolean flag) {
/* 106 */     this.flag = flag;
  }

  
  public String toString() {
/* 111 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 112 */       .append("postId", getPostId())
/* 113 */       .append("postCode", getPostCode())
/* 114 */       .append("postName", getPostName())
/* 115 */       .append("postSort", getPostSort())
/* 116 */       .append("status", getStatus())
/* 117 */       .append("createBy", getCreateBy())
/* 118 */       .append("createTime", getCreateTime())
/* 119 */       .append("updateBy", getUpdateBy())
/* 120 */       .append("updateTime", getUpdateTime())
/* 121 */       .append("remark", getRemark())
/* 122 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysPost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */