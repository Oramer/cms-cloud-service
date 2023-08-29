package com.cms.buss_service.poster.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;

import java.math.BigDecimal;


public class BussPosterDistanceDeduct
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private Long id;
  @Excel(name = "水站信息")
  private String stationId;
  @Excel(name = "快递员信息")
  private String posterId;
  @Excel(name = "用户信息")
  private String userId;
  @Excel(name = "距离提成")
  private BigDecimal postAmount;
  @Excel(name = "乐观锁")
  private String reversion;
  @Excel(name = "是否压桶")
  private String no1;
  @Excel(name = "压桶金额")
  private BigDecimal no2;
  @Excel(name = "产品状态0上架 1下架 ")
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
/* 146 */     this.id = id;
  }
  
  public Long getId() {
/* 150 */     return this.id;
  }
  
  public void setStationId(String stationId) {
/* 154 */     this.stationId = stationId;
  }
  
  public String getStationId() {
/* 158 */     return this.stationId;
  }
  
  public void setPosterId(String posterId) {
/* 162 */     this.posterId = posterId;
  }
  
  public String getPosterId() {
/* 166 */     return this.posterId;
  }
  
  public void setUserId(String userId) {
/* 170 */     this.userId = userId;
  }
  
  public String getUserId() {
/* 174 */     return this.userId;
  }
  
  public void setPostAmount(BigDecimal postAmount) {
/* 178 */     this.postAmount = postAmount;
  }
  
  public BigDecimal getPostAmount() {
/* 182 */     return this.postAmount;
  }
  
  public void setReversion(String reversion) {
/* 186 */     this.reversion = reversion;
  }
  
  public String getReversion() {
/* 190 */     return this.reversion;
  }
  
  public void setNo1(String no1) {
/* 194 */     this.no1 = no1;
  }
  
  public String getNo1() {
/* 198 */     return this.no1;
  }
  
  public void setNo2(BigDecimal no2) {
/* 202 */     this.no2 = no2;
  }
  
  public BigDecimal getNo2() {
/* 206 */     return this.no2;
  }
  
  public void setNo3(String no3) {
/* 210 */     this.no3 = no3;
  }
  
  public String getNo3() {
/* 214 */     return this.no3;
  }
  
  public void setNo4(String no4) {
/* 218 */     this.no4 = no4;
  }
  
  public String getNo4() {
/* 222 */     return this.no4;
  }
  
  public void setNo5(String no5) {
/* 226 */     this.no5 = no5;
  }
  
  public String getNo5() {
/* 230 */     return this.no5;
  }
  
  public void setNo6(String no6) {
/* 234 */     this.no6 = no6;
  }
  
  public String getNo6() {
/* 238 */     return this.no6;
  }
  
  public void setNo7(String no7) {
/* 242 */     this.no7 = no7;
  }
  
  public String getNo7() {
/* 246 */     return this.no7;
  }
  
  public void setNo8(String no8) {
/* 250 */     this.no8 = no8;
  }
  
  public String getNo8() {
/* 254 */     return this.no8;
  }
  
  public void setNo9(String no9) {
/* 258 */     this.no9 = no9;
  }
  
  public String getNo9() {
/* 262 */     return this.no9;
  }
  
  public void setNo10(String no10) {
/* 266 */     this.no10 = no10;
  }
  
  public String getNo10() {
/* 270 */     return this.no10;
  }
  
  public void setNo11(String no11) {
/* 274 */     this.no11 = no11;
  }
  
  public String getNo11() {
/* 278 */     return this.no11;
  }
  
  public void setNo12(String no12) {
/* 282 */     this.no12 = no12;
  }
  
  public String getNo12() {
/* 286 */     return this.no12;
  }
  
  public void setNo13(String no13) {
/* 290 */     this.no13 = no13;
  }
  
  public String getNo13() {
/* 294 */     return this.no13;
  }
  
  public void setNo14(String no14) {
/* 298 */     this.no14 = no14;
  }
  
  public String getNo14() {
/* 302 */     return this.no14;
  }
  
  public void setNo15(String no15) {
/* 306 */     this.no15 = no15;
  }
  
  public String getNo15() {
/* 310 */     return this.no15;
  }

  
  public String toString() {
/* 315 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 316 */       .append("id", getId())
/* 317 */       .append("stationId", getStationId())
/* 318 */       .append("posterId", getPosterId())
/* 319 */       .append("userId", getUserId())
/* 320 */       .append("postAmount", getPostAmount())
/* 321 */       .append("reversion", getReversion())
/* 322 */       .append("createBy", getCreateBy())
/* 323 */       .append("createTime", getCreateTime())
/* 324 */       .append("updateBy", getUpdateBy())
/* 325 */       .append("updateTime", getUpdateTime())
/* 326 */       .append("no1", getNo1())
/* 327 */       .append("no2", getNo2())
/* 328 */       .append("no3", getNo3())
/* 329 */       .append("no4", getNo4())
/* 330 */       .append("no5", getNo5())
/* 331 */       .append("no6", getNo6())
/* 332 */       .append("no7", getNo7())
/* 333 */       .append("no8", getNo8())
/* 334 */       .append("no9", getNo9())
/* 335 */       .append("no10", getNo10())
/* 336 */       .append("no11", getNo11())
/* 337 */       .append("no12", getNo12())
/* 338 */       .append("no13", getNo13())
/* 339 */       .append("no14", getNo14())
/* 340 */       .append("no15", getNo15())
/* 341 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\domain\BussPosterDistanceDeduct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */