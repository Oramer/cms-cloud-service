package com.cms.buss_service.invoice.domain;

import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;














































































public class BussUserInvoiceRecordDetails
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private Long id;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String invoiceRecordId;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String orderPk;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no1;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no2;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no3;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no4;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no5;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no6;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no7;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no8;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no9;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no10;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no11;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no12;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no13;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no14;
  @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
  private String no15;

  public void setId(Long id) {
/* 126 */     this.id = id;
  }

  public Long getId() {
/* 130 */     return this.id;
  }

  public void setInvoiceRecordId(String invoiceRecordId) {
/* 134 */     this.invoiceRecordId = invoiceRecordId;
  }

  public String getInvoiceRecordId() {
/* 138 */     return this.invoiceRecordId;
  }

  public void setOrderPk(String orderPk) {
/* 142 */     this.orderPk = orderPk;
  }

  public String getOrderPk() {
/* 146 */     return this.orderPk;
  }

  public void setNo1(String no1) {
/* 150 */     this.no1 = no1;
  }

  public String getNo1() {
/* 154 */     return this.no1;
  }

  public void setNo2(String no2) {
/* 158 */     this.no2 = no2;
  }

  public String getNo2() {
/* 162 */     return this.no2;
  }

  public void setNo3(String no3) {
/* 166 */     this.no3 = no3;
  }

  public String getNo3() {
/* 170 */     return this.no3;
  }

  public void setNo4(String no4) {
/* 174 */     this.no4 = no4;
  }

  public String getNo4() {
/* 178 */     return this.no4;
  }

  public void setNo5(String no5) {
/* 182 */     this.no5 = no5;
  }

  public String getNo5() {
/* 186 */     return this.no5;
  }

  public void setNo6(String no6) {
/* 190 */     this.no6 = no6;
  }

  public String getNo6() {
/* 194 */     return this.no6;
  }

  public void setNo7(String no7) {
/* 198 */     this.no7 = no7;
  }

  public String getNo7() {
/* 202 */     return this.no7;
  }

  public void setNo8(String no8) {
/* 206 */     this.no8 = no8;
  }

  public String getNo8() {
/* 210 */     return this.no8;
  }

  public void setNo9(String no9) {
/* 214 */     this.no9 = no9;
  }

  public String getNo9() {
/* 218 */     return this.no9;
  }

  public void setNo10(String no10) {
/* 222 */     this.no10 = no10;
  }

  public String getNo10() {
/* 226 */     return this.no10;
  }

  public void setNo11(String no11) {
/* 230 */     this.no11 = no11;
  }

  public String getNo11() {
/* 234 */     return this.no11;
  }

  public void setNo12(String no12) {
/* 238 */     this.no12 = no12;
  }

  public String getNo12() {
/* 242 */     return this.no12;
  }

  public void setNo13(String no13) {
/* 246 */     this.no13 = no13;
  }

  public String getNo13() {
/* 250 */     return this.no13;
  }

  public void setNo14(String no14) {
/* 254 */     this.no14 = no14;
  }

  public String getNo14() {
/* 258 */     return this.no14;
  }

  public void setNo15(String no15) {
/* 262 */     this.no15 = no15;
  }

  public String getNo15() {
/* 266 */     return this.no15;
  }


  public String toString() {
/* 271 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 272 */       .append("id", getId())
/* 273 */       .append("invoiceRecordId", getInvoiceRecordId())
/* 274 */       .append("orderPk", getOrderPk())
/* 275 */       .append("createBy", getCreateBy())
/* 276 */       .append("createTime", getCreateTime())
/* 277 */       .append("updateBy", getUpdateBy())
/* 278 */       .append("updateTime", getUpdateTime())
/* 279 */       .append("no1", getNo1())
/* 280 */       .append("no2", getNo2())
/* 281 */       .append("no3", getNo3())
/* 282 */       .append("no4", getNo4())
/* 283 */       .append("no5", getNo5())
/* 284 */       .append("no6", getNo6())
/* 285 */       .append("no7", getNo7())
/* 286 */       .append("no8", getNo8())
/* 287 */       .append("no9", getNo9())
/* 288 */       .append("no10", getNo10())
/* 289 */       .append("no11", getNo11())
/* 290 */       .append("no12", getNo12())
/* 291 */       .append("no13", getNo13())
/* 292 */       .append("no14", getNo14())
/* 293 */       .append("no15", getNo15())
/* 294 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\domain\BussUserInvoiceRecordDetails.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */