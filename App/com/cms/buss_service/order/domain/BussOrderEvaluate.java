package com.cms.buss_service.order.domain;

import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


























































































public class BussOrderEvaluate
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private Long id;
  @Excel(name = "订单主键")
  private String orderPk;
  @Excel(name = "评价内容")
  private String evaluateContent;
  @Excel(name = "评价分数")
  private Long evaluateRate;
  @Excel(name = "评价图片")
  private String evaluateImage;
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
  
  public void setId(Long id) {
/* 144 */     this.id = id;
  }
  
  public Long getId() {
/* 148 */     return this.id;
  }
  
  public void setOrderPk(String orderPk) {
/* 152 */     this.orderPk = orderPk;
  }
  
  public String getOrderPk() {
/* 156 */     return this.orderPk;
  }
  
  public void setEvaluateContent(String evaluateContent) {
/* 160 */     this.evaluateContent = evaluateContent;
  }
  
  public String getEvaluateContent() {
/* 164 */     return this.evaluateContent;
  }
  
  public void setEvaluateRate(Long evaluateRate) {
/* 168 */     this.evaluateRate = evaluateRate;
  }
  
  public Long getEvaluateRate() {
/* 172 */     return this.evaluateRate;
  }
  
  public void setEvaluateImage(String evaluateImage) {
/* 176 */     this.evaluateImage = evaluateImage;
  }
  
  public String getEvaluateImage() {
/* 180 */     return this.evaluateImage;
  }
  
  public void setReversion(String reversion) {
/* 184 */     this.reversion = reversion;
  }
  
  public String getReversion() {
/* 188 */     return this.reversion;
  }
  
  public void setNo1(String no1) {
/* 192 */     this.no1 = no1;
  }
  
  public String getNo1() {
/* 196 */     return this.no1;
  }
  
  public void setNo2(String no2) {
/* 200 */     this.no2 = no2;
  }
  
  public String getNo2() {
/* 204 */     return this.no2;
  }
  
  public void setNo3(String no3) {
/* 208 */     this.no3 = no3;
  }
  
  public String getNo3() {
/* 212 */     return this.no3;
  }
  
  public void setNo4(String no4) {
/* 216 */     this.no4 = no4;
  }
  
  public String getNo4() {
/* 220 */     return this.no4;
  }
  
  public void setNo5(String no5) {
/* 224 */     this.no5 = no5;
  }
  
  public String getNo5() {
/* 228 */     return this.no5;
  }
  
  public void setNo6(String no6) {
/* 232 */     this.no6 = no6;
  }
  
  public String getNo6() {
/* 236 */     return this.no6;
  }
  
  public void setNo7(String no7) {
/* 240 */     this.no7 = no7;
  }
  
  public String getNo7() {
/* 244 */     return this.no7;
  }
  
  public void setNo8(String no8) {
/* 248 */     this.no8 = no8;
  }
  
  public String getNo8() {
/* 252 */     return this.no8;
  }
  
  public void setNo9(String no9) {
/* 256 */     this.no9 = no9;
  }
  
  public String getNo9() {
/* 260 */     return this.no9;
  }
  
  public void setNo10(String no10) {
/* 264 */     this.no10 = no10;
  }
  
  public String getNo10() {
/* 268 */     return this.no10;
  }
  
  public void setNo11(String no11) {
/* 272 */     this.no11 = no11;
  }
  
  public String getNo11() {
/* 276 */     return this.no11;
  }
  
  public void setNo12(String no12) {
/* 280 */     this.no12 = no12;
  }
  
  public String getNo12() {
/* 284 */     return this.no12;
  }
  
  public void setNo13(String no13) {
/* 288 */     this.no13 = no13;
  }
  
  public String getNo13() {
/* 292 */     return this.no13;
  }
  
  public void setNo14(String no14) {
/* 296 */     this.no14 = no14;
  }
  
  public String getNo14() {
/* 300 */     return this.no14;
  }
  
  public void setNo15(String no15) {
/* 304 */     this.no15 = no15;
  }
  
  public String getNo15() {
/* 308 */     return this.no15;
  }

  
  public String toString() {
/* 313 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 314 */       .append("id", getId())
/* 315 */       .append("orderPk", getOrderPk())
/* 316 */       .append("evaluateContent", getEvaluateContent())
/* 317 */       .append("evaluateRate", getEvaluateRate())
/* 318 */       .append("evaluateImage", getEvaluateImage())
/* 319 */       .append("reversion", getReversion())
/* 320 */       .append("createBy", getCreateBy())
/* 321 */       .append("createTime", getCreateTime())
/* 322 */       .append("updateBy", getUpdateBy())
/* 323 */       .append("updateTime", getUpdateTime())
/* 324 */       .append("no1", getNo1())
/* 325 */       .append("no2", getNo2())
/* 326 */       .append("no3", getNo3())
/* 327 */       .append("no4", getNo4())
/* 328 */       .append("no5", getNo5())
/* 329 */       .append("no6", getNo6())
/* 330 */       .append("no7", getNo7())
/* 331 */       .append("no8", getNo8())
/* 332 */       .append("no9", getNo9())
/* 333 */       .append("no10", getNo10())
/* 334 */       .append("no11", getNo11())
/* 335 */       .append("no12", getNo12())
/* 336 */       .append("no13", getNo13())
/* 337 */       .append("no14", getNo14())
/* 338 */       .append("no15", getNo15())
/* 339 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\domain\BussOrderEvaluate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */