package com.cms.system_service.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;

import javax.validation.constraints.Size;


public class SysDictData
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  @Excel(name = "字典编码", cellType = Excel.ColumnType.NUMERIC)
  private Long dictCode;
  @Excel(name = "字典排序", cellType = Excel.ColumnType.NUMERIC)
  private Long dictSort;
  @Excel(name = "字典标签")
  private String dictLabel;
  @Excel(name = "字典键值")
  private String dictValue;
  @Excel(name = "字典类型")
  private String dictType;
  private String cssClass;
  private String listClass;
  @Excel(name = "是否默认", readConverterExp = "Y=是,N=否")
  private String isDefault;
  @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
  private String status;
  
  public Long getDictCode() {
/*  74 */     return this.dictCode;
  }
  
  public void setDictCode(Long dictCode) {
/*  78 */     this.dictCode = dictCode;
  }
  
  public Long getDictSort() {
/*  82 */     return this.dictSort;
  }
  
  public void setDictSort(Long dictSort) {
/*  86 */     this.dictSort = dictSort;
  }
  
  @NotBlank(message = "字典标签不能为空")
  @Size(min = 0, max = 100, message = "字典标签长度不能超过100个字符")
  public String getDictLabel() {
/*  92 */     return this.dictLabel;
  }
  
  public void setDictLabel(String dictLabel) {
/*  96 */     this.dictLabel = dictLabel;
  }
  
  @NotBlank(message = "字典键值不能为空")
  @Size(min = 0, max = 100, message = "字典键值长度不能超过100个字符")
  public String getDictValue() {
/* 102 */     return this.dictValue;
  }
  
  public void setDictValue(String dictValue) {
/* 106 */     this.dictValue = dictValue;
  }
  
  @NotBlank(message = "字典类型不能为空")
  @Size(min = 0, max = 100, message = "字典类型长度不能超过100个字符")
  public String getDictType() {
/* 112 */     return this.dictType;
  }
  
  public void setDictType(String dictType) {
/* 116 */     this.dictType = dictType;
  }
  
  @Size(min = 0, max = 100, message = "样式属性长度不能超过100个字符")
  public String getCssClass() {
/* 121 */     return this.cssClass;
  }
  
  public void setCssClass(String cssClass) {
/* 125 */     this.cssClass = cssClass;
  }
  
  public String getListClass() {
/* 129 */     return this.listClass;
  }
  
  public void setListClass(String listClass) {
/* 133 */     this.listClass = listClass;
  }
  
  public boolean getDefault() {
/* 137 */     return "Y".equals(this.isDefault);
  }
  
  public String getIsDefault() {
/* 141 */     return this.isDefault;
  }
  
  public void setIsDefault(String isDefault) {
/* 145 */     this.isDefault = isDefault;
  }
  
  public String getStatus() {
/* 149 */     return this.status;
  }
  
  public void setStatus(String status) {
/* 153 */     this.status = status;
  }

  
  public String toString() {
/* 158 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 159 */       .append("dictCode", getDictCode())
/* 160 */       .append("dictSort", getDictSort())
/* 161 */       .append("dictLabel", getDictLabel())
/* 162 */       .append("dictValue", getDictValue())
/* 163 */       .append("dictType", getDictType())
/* 164 */       .append("cssClass", getCssClass())
/* 165 */       .append("listClass", getListClass())
/* 166 */       .append("isDefault", getIsDefault())
/* 167 */       .append("status", getStatus())
/* 168 */       .append("createBy", getCreateBy())
/* 169 */       .append("createTime", getCreateTime())
/* 170 */       .append("updateBy", getUpdateBy())
/* 171 */       .append("updateTime", getUpdateTime())
/* 172 */       .append("remark", getRemark())
/* 173 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysDictData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */