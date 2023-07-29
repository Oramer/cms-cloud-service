package com.cms.system_service.system.domain;

import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

















































































public class SysBusCodeRules
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private String pk;
  @Excel(name = "单据编号(备用)")
  private String busBillNo;
  @Excel(name = "业务名称")
  private String busName;
  @Excel(name = "业务编码")
  private String busCode;
  @Excel(name = "单据前缀")
  private String noPrefix;
  @Excel(name = "时间戳格式")
  private String noDateType;
  @Excel(name = "流水号位数")
  private Integer noCount;
  @Excel(name = "流水号开始数")
  private String noStart;
  @Excel(name = "排序号")
  private String orderNum;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud1;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud2;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud3;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud4;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud5;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud6;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud7;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud8;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud9;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String ud10;

  public void setPk(String pk) {
/* 131 */     this.pk = pk;
  }

  public String getPk() {
/* 135 */     return this.pk;
  }

  public void setBusBillNo(String busBillNo) {
/* 139 */     this.busBillNo = busBillNo;
  }

  public String getBusBillNo() {
/* 143 */     return this.busBillNo;
  }

  public void setBusName(String busName) {
/* 147 */     this.busName = busName;
  }

  public String getBusName() {
/* 151 */     return this.busName;
  }

  public void setBusCode(String busCode) {
/* 155 */     this.busCode = busCode;
  }

  public String getBusCode() {
/* 159 */     return this.busCode;
  }

  public void setNoPrefix(String noPrefix) {
/* 163 */     this.noPrefix = noPrefix;
  }

  public String getNoPrefix() {
/* 167 */     return this.noPrefix;
  }

  public void setNoDateType(String noDateType) {
/* 171 */     this.noDateType = noDateType;
  }

  public String getNoDateType() {
/* 175 */     return this.noDateType;
  }

  public void setNoCount(Integer noCount) {
/* 179 */     this.noCount = noCount;
  }

  public Integer getNoCount() {
/* 183 */     return this.noCount;
  }

  public void setNoStart(String noStart) {
/* 187 */     this.noStart = noStart;
  }

  public String getNoStart() {
/* 191 */     return this.noStart;
  }

  public void setOrderNum(String orderNum) {
/* 195 */     this.orderNum = orderNum;
  }

  public String getOrderNum() {
/* 199 */     return this.orderNum;
  }

  public void setUd1(String ud1) {
/* 203 */     this.ud1 = ud1;
  }

  public String getUd1() {
/* 207 */     return this.ud1;
  }

  public void setUd2(String ud2) {
/* 211 */     this.ud2 = ud2;
  }

  public String getUd2() {
/* 215 */     return this.ud2;
  }

  public void setUd3(String ud3) {
/* 219 */     this.ud3 = ud3;
  }

  public String getUd3() {
/* 223 */     return this.ud3;
  }

  public void setUd4(String ud4) {
/* 227 */     this.ud4 = ud4;
  }

  public String getUd4() {
/* 231 */     return this.ud4;
  }

  public void setUd5(String ud5) {
/* 235 */     this.ud5 = ud5;
  }

  public String getUd5() {
/* 239 */     return this.ud5;
  }

  public void setUd6(String ud6) {
/* 243 */     this.ud6 = ud6;
  }

  public String getUd6() {
/* 247 */     return this.ud6;
  }

  public void setUd7(String ud7) {
/* 251 */     this.ud7 = ud7;
  }

  public String getUd7() {
/* 255 */     return this.ud7;
  }

  public void setUd8(String ud8) {
/* 259 */     this.ud8 = ud8;
  }

  public String getUd8() {
/* 263 */     return this.ud8;
  }

  public void setUd9(String ud9) {
/* 267 */     this.ud9 = ud9;
  }

  public String getUd9() {
/* 271 */     return this.ud9;
  }

  public void setUd10(String ud10) {
/* 275 */     this.ud10 = ud10;
  }

  public String getUd10() {
/* 279 */     return this.ud10;
  }


  public String toString() {
/* 284 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 285 */       .append("pk", getPk())
/* 286 */       .append("busBillNo", getBusBillNo())
/* 287 */       .append("busName", getBusName())
/* 288 */       .append("busCode", getBusCode())
/* 289 */       .append("noPrefix", getNoPrefix())
/* 290 */       .append("noDateType", getNoDateType())
/* 291 */       .append("noCount", getNoCount())
/* 292 */       .append("noStart", getNoStart())
/* 293 */       .append("orderNum", getOrderNum())
/* 294 */       .append("remark", getRemark())
/* 295 */       .append("createTime", getCreateTime())
/* 296 */       .append("createBy", getCreateBy())
/* 297 */       .append("updateTime", getUpdateTime())
/* 298 */       .append("updateBy", getUpdateBy())
/* 299 */       .append("ud1", getUd1())
/* 300 */       .append("ud2", getUd2())
/* 301 */       .append("ud3", getUd3())
/* 302 */       .append("ud4", getUd4())
/* 303 */       .append("ud5", getUd5())
/* 304 */       .append("ud6", getUd6())
/* 305 */       .append("ud7", getUd7())
/* 306 */       .append("ud8", getUd8())
/* 307 */       .append("ud9", getUd9())
/* 308 */       .append("ud10", getUd10())
/* 309 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysBusCodeRules.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */