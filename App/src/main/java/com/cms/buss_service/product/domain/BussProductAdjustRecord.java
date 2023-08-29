package com.cms.buss_service.product.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;

import java.math.BigDecimal;


public class BussProductAdjustRecord
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private Long pk;
  private String productPk;
  @Excel(name = "调整后价格")
  private BigDecimal adjustPrice;
  @Excel(name = "调价目标人")
  private String targetPk;
  @Excel(name = "乐观锁")
  private String reversion;
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
  
  public void setPk(Long pk) {
/* 140 */     this.pk = pk;
  }
  
  public Long getPk() {
/* 144 */     return this.pk;
  }
  
  public void setProductPk(String productPk) {
/* 148 */     this.productPk = productPk;
  }
  
  public String getProductPk() {
/* 152 */     return this.productPk;
  }
  
  public void setAdjustPrice(BigDecimal adjustPrice) {
/* 156 */     this.adjustPrice = adjustPrice;
  }
  
  public BigDecimal getAdjustPrice() {
/* 160 */     return this.adjustPrice;
  }
  
  public void setTargetPk(String targetPk) {
/* 164 */     this.targetPk = targetPk;
  }
  
  public String getTargetPk() {
/* 168 */     return this.targetPk;
  }
  
  public void setReversion(String reversion) {
/* 172 */     this.reversion = reversion;
  }
  
  public String getReversion() {
/* 176 */     return this.reversion;
  }
  
  public void setNo1(String no1) {
/* 180 */     this.no1 = no1;
  }
  
  public String getNo1() {
/* 184 */     return this.no1;
  }
  
  public void setNo2(String no2) {
/* 188 */     this.no2 = no2;
  }
  
  public String getNo2() {
/* 192 */     return this.no2;
  }
  
  public void setNo3(String no3) {
/* 196 */     this.no3 = no3;
  }
  
  public String getNo3() {
/* 200 */     return this.no3;
  }
  
  public void setNo4(String no4) {
/* 204 */     this.no4 = no4;
  }
  
  public String getNo4() {
/* 208 */     return this.no4;
  }
  
  public void setNo5(String no5) {
/* 212 */     this.no5 = no5;
  }
  
  public String getNo5() {
/* 216 */     return this.no5;
  }
  
  public void setNo6(String no6) {
/* 220 */     this.no6 = no6;
  }
  
  public String getNo6() {
/* 224 */     return this.no6;
  }
  
  public void setNo7(String no7) {
/* 228 */     this.no7 = no7;
  }
  
  public String getNo7() {
/* 232 */     return this.no7;
  }
  
  public void setNo8(String no8) {
/* 236 */     this.no8 = no8;
  }
  
  public String getNo8() {
/* 240 */     return this.no8;
  }
  
  public void setNo9(String no9) {
/* 244 */     this.no9 = no9;
  }
  
  public String getNo9() {
/* 248 */     return this.no9;
  }
  
  public void setNo10(String no10) {
/* 252 */     this.no10 = no10;
  }
  
  public String getNo10() {
/* 256 */     return this.no10;
  }
  
  public void setNo11(String no11) {
/* 260 */     this.no11 = no11;
  }
  
  public String getNo11() {
/* 264 */     return this.no11;
  }
  
  public void setNo12(String no12) {
/* 268 */     this.no12 = no12;
  }
  
  public String getNo12() {
/* 272 */     return this.no12;
  }
  
  public void setNo13(String no13) {
/* 276 */     this.no13 = no13;
  }
  
  public String getNo13() {
/* 280 */     return this.no13;
  }
  
  public void setNo14(String no14) {
/* 284 */     this.no14 = no14;
  }
  
  public String getNo14() {
/* 288 */     return this.no14;
  }
  
  public void setNo15(String no15) {
/* 292 */     this.no15 = no15;
  }
  
  public String getNo15() {
/* 296 */     return this.no15;
  }

  
  public String toString() {
/* 301 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 302 */       .append("pk", getPk())
/* 303 */       .append("productPk", getProductPk())
/* 304 */       .append("adjustPrice", getAdjustPrice())
/* 305 */       .append("targetPk", getTargetPk())
/* 306 */       .append("reversion", getReversion())
/* 307 */       .append("createBy", getCreateBy())
/* 308 */       .append("createTime", getCreateTime())
/* 309 */       .append("updateBy", getUpdateBy())
/* 310 */       .append("updateTime", getUpdateTime())
/* 311 */       .append("no1", getNo1())
/* 312 */       .append("no2", getNo2())
/* 313 */       .append("no3", getNo3())
/* 314 */       .append("no4", getNo4())
/* 315 */       .append("no5", getNo5())
/* 316 */       .append("no6", getNo6())
/* 317 */       .append("no7", getNo7())
/* 318 */       .append("no8", getNo8())
/* 319 */       .append("no9", getNo9())
/* 320 */       .append("no10", getNo10())
/* 321 */       .append("no11", getNo11())
/* 322 */       .append("no12", getNo12())
/* 323 */       .append("no13", getNo13())
/* 324 */       .append("no14", getNo14())
/* 325 */       .append("no15", getNo15())
/* 326 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\domain\BussProductAdjustRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */