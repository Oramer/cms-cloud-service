package com.cms.buss_service.order.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;

import java.math.BigDecimal;


public class BussOrderProductInfo
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private Long pk;
  @Excel(name = "订单主键")
  private String orderInfoPk;
  @Excel(name = "产品主键")
  private String productPk;
  @Excel(name = "产品数量")
  private Long productAmount;
  @Excel(name = "产品单价")
  private BigDecimal productSignPrice;
  @Excel(name = "产品优惠价")
  private BigDecimal productFavorablePrice;
  @Excel(name = "总价")
  private BigDecimal amountPrice;
  @Excel(name = "扣减价")
  private BigDecimal reducePrice;
  @Excel(name = "实际总价")
  private BigDecimal realPrice;
  @Excel(name = "快照")
  private String snapshot;
  @Excel(name = "乐观锁")
  private String reversion;
  @Excel(name = "备用字段")
  private String no1;
  @Excel(name = "备用字段")
  private String no2;
  @Excel(name = "备用字段")
  private String no3;
  @Excel(name = "备用字段")
  private String no4;
  @Excel(name = "备用字段")
  private String no5;
  @Excel(name = "备用字段")
  private String no6;
  @Excel(name = "备用字段")
  private String no7;
  @Excel(name = "备用字段")
  private String no8;
  @Excel(name = "备用字段")
  private String no9;
  @Excel(name = "备用字段")
  private String no10;
  @Excel(name = "备用字段")
  private String no11;
  @Excel(name = "备用字段")
  private String no12;
  @Excel(name = "备用字段")
  private String no13;
  @Excel(name = "备用字段")
  private String no14;
  @Excel(name = "备用字段")
  private String no15no8;
  
  public void setPk(Long pk) {
/* 176 */     this.pk = pk;
  }
  
  public Long getPk() {
/* 180 */     return this.pk;
  }
  
  public void setOrderInfoPk(String orderInfoPk) {
/* 184 */     this.orderInfoPk = orderInfoPk;
  }
  
  public String getOrderInfoPk() {
/* 188 */     return this.orderInfoPk;
  }
  
  public void setProductPk(String productPk) {
/* 192 */     this.productPk = productPk;
  }
  
  public String getProductPk() {
/* 196 */     return this.productPk;
  }
  
  public void setProductAmount(Long productAmount) {
/* 200 */     this.productAmount = productAmount;
  }
  
  public Long getProductAmount() {
/* 204 */     return this.productAmount;
  }
  
  public void setProductSignPrice(BigDecimal productSignPrice) {
/* 208 */     this.productSignPrice = productSignPrice;
  }
  
  public BigDecimal getProductSignPrice() {
/* 212 */     return this.productSignPrice;
  }
  
  public void setProductFavorablePrice(BigDecimal productFavorablePrice) {
/* 216 */     this.productFavorablePrice = productFavorablePrice;
  }
  
  public BigDecimal getProductFavorablePrice() {
/* 220 */     return this.productFavorablePrice;
  }
  
  public void setAmountPrice(BigDecimal amountPrice) {
/* 224 */     this.amountPrice = amountPrice;
  }
  
  public BigDecimal getAmountPrice() {
/* 228 */     return this.amountPrice;
  }
  
  public void setReducePrice(BigDecimal reducePrice) {
/* 232 */     this.reducePrice = reducePrice;
  }
  
  public BigDecimal getReducePrice() {
/* 236 */     return this.reducePrice;
  }
  
  public void setRealPrice(BigDecimal realPrice) {
/* 240 */     this.realPrice = realPrice;
  }
  
  public BigDecimal getRealPrice() {
/* 244 */     return this.realPrice;
  }
  
  public void setSnapshot(String snapshot) {
/* 248 */     this.snapshot = snapshot;
  }
  
  public String getSnapshot() {
/* 252 */     return this.snapshot;
  }
  
  public void setReversion(String reversion) {
/* 256 */     this.reversion = reversion;
  }
  
  public String getReversion() {
/* 260 */     return this.reversion;
  }
  
  public void setNo1(String no1) {
/* 264 */     this.no1 = no1;
  }
  
  public String getNo1() {
/* 268 */     return this.no1;
  }
  
  public void setNo2(String no2) {
/* 272 */     this.no2 = no2;
  }
  
  public String getNo2() {
/* 276 */     return this.no2;
  }
  
  public void setNo3(String no3) {
/* 280 */     this.no3 = no3;
  }
  
  public String getNo3() {
/* 284 */     return this.no3;
  }
  
  public void setNo4(String no4) {
/* 288 */     this.no4 = no4;
  }
  
  public String getNo4() {
/* 292 */     return this.no4;
  }
  
  public void setNo5(String no5) {
/* 296 */     this.no5 = no5;
  }
  
  public String getNo5() {
/* 300 */     return this.no5;
  }
  
  public void setNo6(String no6) {
/* 304 */     this.no6 = no6;
  }
  
  public String getNo6() {
/* 308 */     return this.no6;
  }
  
  public void setNo7(String no7) {
/* 312 */     this.no7 = no7;
  }
  
  public String getNo7() {
/* 316 */     return this.no7;
  }
  
  public void setNo8(String no8) {
/* 320 */     this.no8 = no8;
  }
  
  public String getNo8() {
/* 324 */     return this.no8;
  }
  
  public void setNo9(String no9) {
/* 328 */     this.no9 = no9;
  }
  
  public String getNo9() {
/* 332 */     return this.no9;
  }
  
  public void setNo10(String no10) {
/* 336 */     this.no10 = no10;
  }
  
  public String getNo10() {
/* 340 */     return this.no10;
  }
  
  public void setNo11(String no11) {
/* 344 */     this.no11 = no11;
  }
  
  public String getNo11() {
/* 348 */     return this.no11;
  }
  
  public void setNo12(String no12) {
/* 352 */     this.no12 = no12;
  }
  
  public String getNo12() {
/* 356 */     return this.no12;
  }
  
  public void setNo13(String no13) {
/* 360 */     this.no13 = no13;
  }
  
  public String getNo13() {
/* 364 */     return this.no13;
  }
  
  public void setNo14(String no14) {
/* 368 */     this.no14 = no14;
  }
  
  public String getNo14() {
/* 372 */     return this.no14;
  }
  
  public void setNo15no8(String no15no8) {
/* 376 */     this.no15no8 = no15no8;
  }
  
  public String getNo15no8() {
/* 380 */     return this.no15no8;
  }

  
  public String toString() {
/* 385 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 386 */       .append("pk", getPk())
/* 387 */       .append("orderInfoPk", getOrderInfoPk())
/* 388 */       .append("productPk", getProductPk())
/* 389 */       .append("productAmount", getProductAmount())
/* 390 */       .append("productSignPrice", getProductSignPrice())
/* 391 */       .append("productFavorablePrice", getProductFavorablePrice())
/* 392 */       .append("amountPrice", getAmountPrice())
/* 393 */       .append("reducePrice", getReducePrice())
/* 394 */       .append("realPrice", getRealPrice())
/* 395 */       .append("snapshot", getSnapshot())
/* 396 */       .append("reversion", getReversion())
/* 397 */       .append("createBy", getCreateBy())
/* 398 */       .append("createTime", getCreateTime())
/* 399 */       .append("updateBy", getUpdateBy())
/* 400 */       .append("updateTime", getUpdateTime())
/* 401 */       .append("no1", getNo1())
/* 402 */       .append("no2", getNo2())
/* 403 */       .append("no3", getNo3())
/* 404 */       .append("no4", getNo4())
/* 405 */       .append("no5", getNo5())
/* 406 */       .append("no6", getNo6())
/* 407 */       .append("no7", getNo7())
/* 408 */       .append("no8", getNo8())
/* 409 */       .append("no9", getNo9())
/* 410 */       .append("no10", getNo10())
/* 411 */       .append("no11", getNo11())
/* 412 */       .append("no12", getNo12())
/* 413 */       .append("no13", getNo13())
/* 414 */       .append("no14", getNo14())
/* 415 */       .append("no15no8", getNo15no8())
/* 416 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\domain\BussOrderProductInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */