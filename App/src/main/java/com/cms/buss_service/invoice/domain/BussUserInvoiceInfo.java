package com.cms.buss_service.invoice.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;


public class BussUserInvoiceInfo
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private Long id;
  @Excel(name = "所属用户")
  private String userId;
  @Excel(name = "所属组织")
  private String groupId;
  @Excel(name = "发票类型")
  private String txtype;
  @Excel(name = "抬头类型")
  private String hdtype;
  @Excel(name = "名称")
  private String tname;
  @Excel(name = "纳税人识别号")
  private String taxno;
  @Excel(name = "地址电话")
  private String taxpad;
  @Excel(name = "开户行及账号")
  private String taxaccount;
  @Excel(name = "是否默认")
  private String defaultd;
  @Excel(name = "邮箱")
  private String email;
  @Excel(name = "地址")
  private String address;
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
/* 186 */     this.id = id;
  }

  public Long getId() {
/* 190 */     return this.id;
  }

  public void setUserId(String userId) {
/* 194 */     this.userId = userId;
  }

  public String getUserId() {
/* 198 */     return this.userId;
  }

  public void setGroupId(String groupId) {
/* 202 */     this.groupId = groupId;
  }

  public String getGroupId() {
/* 206 */     return this.groupId;
  }

  public void setTxtype(String txtype) {
/* 210 */     this.txtype = txtype;
  }

  public String getTxtype() {
/* 214 */     return this.txtype;
  }

  public void setHdtype(String hdtype) {
/* 218 */     this.hdtype = hdtype;
  }

  public String getHdtype() {
/* 222 */     return this.hdtype;
  }

  public void setTname(String tname) {
/* 226 */     this.tname = tname;
  }

  public String getTname() {
/* 230 */     return this.tname;
  }

  public void setTaxno(String taxno) {
/* 234 */     this.taxno = taxno;
  }

  public String getTaxno() {
/* 238 */     return this.taxno;
  }

  public void setTaxpad(String taxpad) {
/* 242 */     this.taxpad = taxpad;
  }

  public String getTaxpad() {
/* 246 */     return this.taxpad;
  }

  public void setTaxaccount(String taxaccount) {
/* 250 */     this.taxaccount = taxaccount;
  }

  public String getTaxaccount() {
/* 254 */     return this.taxaccount;
  }

  public void setDefaultd(String defaultd) {
/* 258 */     this.defaultd = defaultd;
  }

  public String getDefaultd() {
/* 262 */     return this.defaultd;
  }

  public void setEmail(String email) {
/* 266 */     this.email = email;
  }

  public String getEmail() {
/* 270 */     return this.email;
  }

  public void setAddress(String address) {
/* 274 */     this.address = address;
  }

  public String getAddress() {
/* 278 */     return this.address;
  }

  public void setReversion(String reversion) {
/* 282 */     this.reversion = reversion;
  }

  public String getReversion() {
/* 286 */     return this.reversion;
  }

  public void setNo1(String no1) {
/* 290 */     this.no1 = no1;
  }

  public String getNo1() {
/* 294 */     return this.no1;
  }

  public void setNo2(String no2) {
/* 298 */     this.no2 = no2;
  }

  public String getNo2() {
/* 302 */     return this.no2;
  }

  public void setNo3(String no3) {
/* 306 */     this.no3 = no3;
  }

  public String getNo3() {
/* 310 */     return this.no3;
  }

  public void setNo4(String no4) {
/* 314 */     this.no4 = no4;
  }

  public String getNo4() {
/* 318 */     return this.no4;
  }

  public void setNo5(String no5) {
/* 322 */     this.no5 = no5;
  }

  public String getNo5() {
/* 326 */     return this.no5;
  }

  public void setNo6(String no6) {
/* 330 */     this.no6 = no6;
  }

  public String getNo6() {
/* 334 */     return this.no6;
  }

  public void setNo7(String no7) {
/* 338 */     this.no7 = no7;
  }

  public String getNo7() {
/* 342 */     return this.no7;
  }

  public void setNo8(String no8) {
/* 346 */     this.no8 = no8;
  }

  public String getNo8() {
/* 350 */     return this.no8;
  }

  public void setNo9(String no9) {
/* 354 */     this.no9 = no9;
  }

  public String getNo9() {
/* 358 */     return this.no9;
  }

  public void setNo10(String no10) {
/* 362 */     this.no10 = no10;
  }

  public String getNo10() {
/* 366 */     return this.no10;
  }

  public void setNo11(String no11) {
/* 370 */     this.no11 = no11;
  }

  public String getNo11() {
/* 374 */     return this.no11;
  }

  public void setNo12(String no12) {
/* 378 */     this.no12 = no12;
  }

  public String getNo12() {
/* 382 */     return this.no12;
  }

  public void setNo13(String no13) {
/* 386 */     this.no13 = no13;
  }

  public String getNo13() {
/* 390 */     return this.no13;
  }

  public void setNo14(String no14) {
/* 394 */     this.no14 = no14;
  }

  public String getNo14() {
/* 398 */     return this.no14;
  }

  public void setNo15(String no15) {
/* 402 */     this.no15 = no15;
  }

  public String getNo15() {
/* 406 */     return this.no15;
  }


  public String toString() {
/* 411 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 412 */       .append("id", getId())
/* 413 */       .append("userId", getUserId())
/* 414 */       .append("groupId", getGroupId())
/* 415 */       .append("txtype", getTxtype())
/* 416 */       .append("hdtype", getHdtype())
/* 417 */       .append("tname", getTname())
/* 418 */       .append("taxno", getTaxno())
/* 419 */       .append("taxpad", getTaxpad())
/* 420 */       .append("taxaccount", getTaxaccount())
/* 421 */       .append("defaultd", getDefaultd())
/* 422 */       .append("email", getEmail())
/* 423 */       .append("address", getAddress())
/* 424 */       .append("reversion", getReversion())
/* 425 */       .append("createBy", getCreateBy())
/* 426 */       .append("createTime", getCreateTime())
/* 427 */       .append("updateBy", getUpdateBy())
/* 428 */       .append("updateTime", getUpdateTime())
/* 429 */       .append("no1", getNo1())
/* 430 */       .append("no2", getNo2())
/* 431 */       .append("no3", getNo3())
/* 432 */       .append("no4", getNo4())
/* 433 */       .append("no5", getNo5())
/* 434 */       .append("no6", getNo6())
/* 435 */       .append("no7", getNo7())
/* 436 */       .append("no8", getNo8())
/* 437 */       .append("no9", getNo9())
/* 438 */       .append("no10", getNo10())
/* 439 */       .append("no11", getNo11())
/* 440 */       .append("no12", getNo12())
/* 441 */       .append("no13", getNo13())
/* 442 */       .append("no14", getNo14())
/* 443 */       .append("no15", getNo15())
/* 444 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\domain\BussUserInvoiceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */