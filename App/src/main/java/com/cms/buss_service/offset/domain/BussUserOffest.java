package com.cms.buss_service.offset.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;

import java.math.BigDecimal;


public class BussUserOffest
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private String pk;
  @Excel(name = "用户信息")
  private String userPk;
  @Excel(name = "抵用金金额")
  private BigDecimal offestAmount;
  @Excel(name = "乐观锁")
  private String reversion;
  @Excel(name = "是否压桶")
  private String no1;
  @Excel(name = "压桶金额")
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

  public void setPk(String pk) {
/* 134 */     this.pk = pk;
  }

  public String getPk() {
/* 138 */     return this.pk;
  }

  public void setUserPk(String userPk) {
/* 142 */     this.userPk = userPk;
  }

  public String getUserPk() {
/* 146 */     return this.userPk;
  }

  public void setOffestAmount(BigDecimal offestAmount) {
/* 150 */     this.offestAmount = offestAmount;
  }

  public BigDecimal getOffestAmount() {
/* 154 */     return this.offestAmount;
  }

  public void setReversion(String reversion) {
/* 158 */     this.reversion = reversion;
  }

  public String getReversion() {
/* 162 */     return this.reversion;
  }

  public void setNo1(String no1) {
/* 166 */     this.no1 = no1;
  }

  public String getNo1() {
/* 170 */     return this.no1;
  }

  public void setNo2(String no2) {
/* 174 */     this.no2 = no2;
  }

  public String getNo2() {
/* 178 */     return this.no2;
  }

  public void setNo3(String no3) {
/* 182 */     this.no3 = no3;
  }

  public String getNo3() {
/* 186 */     return this.no3;
  }

  public void setNo4(String no4) {
/* 190 */     this.no4 = no4;
  }

  public String getNo4() {
/* 194 */     return this.no4;
  }

  public void setNo5(String no5) {
/* 198 */     this.no5 = no5;
  }

  public String getNo5() {
/* 202 */     return this.no5;
  }

  public void setNo6(String no6) {
/* 206 */     this.no6 = no6;
  }

  public String getNo6() {
/* 210 */     return this.no6;
  }

  public void setNo7(String no7) {
/* 214 */     this.no7 = no7;
  }

  public String getNo7() {
/* 218 */     return this.no7;
  }

  public void setNo8(String no8) {
/* 222 */     this.no8 = no8;
  }

  public String getNo8() {
/* 226 */     return this.no8;
  }

  public void setNo9(String no9) {
/* 230 */     this.no9 = no9;
  }

  public String getNo9() {
/* 234 */     return this.no9;
  }

  public void setNo10(String no10) {
/* 238 */     this.no10 = no10;
  }

  public String getNo10() {
/* 242 */     return this.no10;
  }

  public void setNo11(String no11) {
/* 246 */     this.no11 = no11;
  }

  public String getNo11() {
/* 250 */     return this.no11;
  }

  public void setNo12(String no12) {
/* 254 */     this.no12 = no12;
  }

  public String getNo12() {
/* 258 */     return this.no12;
  }

  public void setNo13(String no13) {
/* 262 */     this.no13 = no13;
  }

  public String getNo13() {
/* 266 */     return this.no13;
  }

  public void setNo14(String no14) {
/* 270 */     this.no14 = no14;
  }

  public String getNo14() {
/* 274 */     return this.no14;
  }

  public void setNo15(String no15) {
/* 278 */     this.no15 = no15;
  }

  public String getNo15() {
/* 282 */     return this.no15;
  }


  public String toString() {
/* 287 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 288 */       .append("pk", getPk())
/* 289 */       .append("userPk", getUserPk())
/* 290 */       .append("offestAmount", getOffestAmount())
/* 291 */       .append("reversion", getReversion())
/* 292 */       .append("createBy", getCreateBy())
/* 293 */       .append("createTime", getCreateTime())
/* 294 */       .append("updateBy", getUpdateBy())
/* 295 */       .append("updateTime", getUpdateTime())
/* 296 */       .append("no1", getNo1())
/* 297 */       .append("no2", getNo2())
/* 298 */       .append("no3", getNo3())
/* 299 */       .append("no4", getNo4())
/* 300 */       .append("no5", getNo5())
/* 301 */       .append("no6", getNo6())
/* 302 */       .append("no7", getNo7())
/* 303 */       .append("no8", getNo8())
/* 304 */       .append("no9", getNo9())
/* 305 */       .append("no10", getNo10())
/* 306 */       .append("no11", getNo11())
/* 307 */       .append("no12", getNo12())
/* 308 */       .append("no13", getNo13())
/* 309 */       .append("no14", getNo14())
/* 310 */       .append("no15", getNo15())
/* 311 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\offset\domain\BussUserOffest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */