package com.cms.system_service.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;


public class XxIntegrate
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private String pk;
  @Excel(name = "是否同步")
  private String issyn;
  @Excel(name = "接口地址")
  private String itfaddress;
  @Excel(name = "同步天数")
  private String syndays;
  @Excel(name = "NC考勤同步")
  private String nctbm;
  @Excel(name = "NC审批同步")
  private String ncapprove;
  @Excel(name = "同步方向")
  private String direction;
  @Excel(name = "钉钉(微信)corpid")
  private String corpid;
  @Excel(name = "钉钉(微信)appkey")
  private String appkey;
  @Excel(name = "钉钉(微信)appsecret")
  private String appsecret;
  @Excel(name = "钉钉(微信)agentId")
  private String agentid;
  @Excel(name = "删除标识(0否:1是)")
  private String deleteFlag;
  @Excel(name = "启用标识(N:Y)")
  private String enabledFlag;
  @Excel(name = "备用字段1")
  private String sdf01;
  @Excel(name = "备用字段2")
  private String sdf02;
  @Excel(name = "备用字段3")
  private String sdf03;
  @Excel(name = "备用字段4")
  private String sdf04;
  @Excel(name = "备用字段5")
  private String sdf05;
  @Excel(name = "备用字段6")
  private String sdf06;
  @Excel(name = "备用字段7")
  private String sdf07;
  @Excel(name = "备用字段8")
  private String sdf08;
  @Excel(name = "备用字段9")
  private String sdf09;
  @Excel(name = "备用字段10")
  private String sdf10;
  @Excel(name = "备用字段11")
  private String sdf11;
  @Excel(name = "备用字段12")
  private String sdf12;
  @Excel(name = "备用字段13")
  private String sdf13;
  @Excel(name = "备用字段14")
  private String sdf14;
  @Excel(name = "备用字段15")
  private String sdf15;
  @Excel(name = "备用字段16")
  private String sdf16;
  @Excel(name = "备用字段17")
  private String sdf17;
  @Excel(name = "备用字段18")
  private String sdf18;
  @Excel(name = "备用字段19")
  private String sdf19;
  @Excel(name = "备用字段20")
  private String sdf20;
  
  public void setPk(String pk) {
/* 215 */     this.pk = pk;
  }
  
  public String getPk() {
/* 219 */     return this.pk;
  }
  
  public void setIssyn(String issyn) {
/* 223 */     this.issyn = issyn;
  }
  
  public String getIssyn() {
/* 227 */     return this.issyn;
  }
  
  public void setItfaddress(String itfaddress) {
/* 231 */     this.itfaddress = itfaddress;
  }
  
  public String getItfaddress() {
/* 235 */     return this.itfaddress;
  }
  
  public void setSyndays(String syndays) {
/* 239 */     this.syndays = syndays;
  }
  
  public String getSyndays() {
/* 243 */     return this.syndays;
  }
  
  public void setNctbm(String nctbm) {
/* 247 */     this.nctbm = nctbm;
  }
  
  public String getNctbm() {
/* 251 */     return this.nctbm;
  }
  
  public void setNcapprove(String ncapprove) {
/* 255 */     this.ncapprove = ncapprove;
  }
  
  public String getNcapprove() {
/* 259 */     return this.ncapprove;
  }
  
  public void setDirection(String direction) {
/* 263 */     this.direction = direction;
  }
  
  public String getDirection() {
/* 267 */     return this.direction;
  }
  
  public void setCorpid(String corpid) {
/* 271 */     this.corpid = corpid;
  }
  
  public String getCorpid() {
/* 275 */     return this.corpid;
  }
  
  public void setAppkey(String appkey) {
/* 279 */     this.appkey = appkey;
  }
  
  public String getAppkey() {
/* 283 */     return this.appkey;
  }
  
  public void setAppsecret(String appsecret) {
/* 287 */     this.appsecret = appsecret;
  }
  
  public String getAppsecret() {
/* 291 */     return this.appsecret;
  }
  
  public void setAgentid(String agentid) {
/* 295 */     this.agentid = agentid;
  }
  
  public String getAgentid() {
/* 299 */     return this.agentid;
  }
  
  public void setDeleteFlag(String deleteFlag) {
/* 303 */     this.deleteFlag = deleteFlag;
  }
  
  public String getDeleteFlag() {
/* 307 */     return this.deleteFlag;
  }
  
  public void setEnabledFlag(String enabledFlag) {
/* 311 */     this.enabledFlag = enabledFlag;
  }
  
  public String getEnabledFlag() {
/* 315 */     return this.enabledFlag;
  }
  
  public void setSdf01(String sdf01) {
/* 319 */     this.sdf01 = sdf01;
  }
  
  public String getSdf01() {
/* 323 */     return this.sdf01;
  }
  
  public void setSdf02(String sdf02) {
/* 327 */     this.sdf02 = sdf02;
  }
  
  public String getSdf02() {
/* 331 */     return this.sdf02;
  }
  
  public void setSdf03(String sdf03) {
/* 335 */     this.sdf03 = sdf03;
  }
  
  public String getSdf03() {
/* 339 */     return this.sdf03;
  }
  
  public void setSdf04(String sdf04) {
/* 343 */     this.sdf04 = sdf04;
  }
  
  public String getSdf04() {
/* 347 */     return this.sdf04;
  }
  
  public void setSdf05(String sdf05) {
/* 351 */     this.sdf05 = sdf05;
  }
  
  public String getSdf05() {
/* 355 */     return this.sdf05;
  }
  
  public void setSdf06(String sdf06) {
/* 359 */     this.sdf06 = sdf06;
  }
  
  public String getSdf06() {
/* 363 */     return this.sdf06;
  }
  
  public void setSdf07(String sdf07) {
/* 367 */     this.sdf07 = sdf07;
  }
  
  public String getSdf07() {
/* 371 */     return this.sdf07;
  }
  
  public void setSdf08(String sdf08) {
/* 375 */     this.sdf08 = sdf08;
  }
  
  public String getSdf08() {
/* 379 */     return this.sdf08;
  }
  
  public void setSdf09(String sdf09) {
/* 383 */     this.sdf09 = sdf09;
  }
  
  public String getSdf09() {
/* 387 */     return this.sdf09;
  }
  
  public void setSdf10(String sdf10) {
/* 391 */     this.sdf10 = sdf10;
  }
  
  public String getSdf10() {
/* 395 */     return this.sdf10;
  }
  
  public void setSdf11(String sdf11) {
/* 399 */     this.sdf11 = sdf11;
  }
  
  public String getSdf11() {
/* 403 */     return this.sdf11;
  }
  
  public void setSdf12(String sdf12) {
/* 407 */     this.sdf12 = sdf12;
  }
  
  public String getSdf12() {
/* 411 */     return this.sdf12;
  }
  
  public void setSdf13(String sdf13) {
/* 415 */     this.sdf13 = sdf13;
  }
  
  public String getSdf13() {
/* 419 */     return this.sdf13;
  }
  
  public void setSdf14(String sdf14) {
/* 423 */     this.sdf14 = sdf14;
  }
  
  public String getSdf14() {
/* 427 */     return this.sdf14;
  }
  
  public void setSdf15(String sdf15) {
/* 431 */     this.sdf15 = sdf15;
  }
  
  public String getSdf15() {
/* 435 */     return this.sdf15;
  }
  
  public void setSdf16(String sdf16) {
/* 439 */     this.sdf16 = sdf16;
  }
  
  public String getSdf16() {
/* 443 */     return this.sdf16;
  }
  
  public void setSdf17(String sdf17) {
/* 447 */     this.sdf17 = sdf17;
  }
  
  public String getSdf17() {
/* 451 */     return this.sdf17;
  }
  
  public void setSdf18(String sdf18) {
/* 455 */     this.sdf18 = sdf18;
  }
  
  public String getSdf18() {
/* 459 */     return this.sdf18;
  }
  
  public void setSdf19(String sdf19) {
/* 463 */     this.sdf19 = sdf19;
  }
  
  public String getSdf19() {
/* 467 */     return this.sdf19;
  }
  
  public void setSdf20(String sdf20) {
/* 471 */     this.sdf20 = sdf20;
  }
  
  public String getSdf20() {
/* 475 */     return this.sdf20;
  }

  
  public String toString() {
/* 480 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 481 */       .append("pk", getPk())
/* 482 */       .append("issyn", getIssyn())
/* 483 */       .append("itfaddress", getItfaddress())
/* 484 */       .append("syndays", getSyndays())
/* 485 */       .append("nctbm", getNctbm())
/* 486 */       .append("ncapprove", getNcapprove())
/* 487 */       .append("direction", getDirection())
/* 488 */       .append("corpid", getCorpid())
/* 489 */       .append("appkey", getAppkey())
/* 490 */       .append("appsecret", getAppsecret())
/* 491 */       .append("agentid", getAgentid())
/* 492 */       .append("createTime", getCreateTime())
/* 493 */       .append("createBy", getCreateBy())
/* 494 */       .append("updateTime", getUpdateTime())
/* 495 */       .append("updateBy", getUpdateBy())
/* 496 */       .append("deleteFlag", getDeleteFlag())
/* 497 */       .append("enabledFlag", getEnabledFlag())
/* 498 */       .append("sdf01", getSdf01())
/* 499 */       .append("sdf02", getSdf02())
/* 500 */       .append("sdf03", getSdf03())
/* 501 */       .append("sdf04", getSdf04())
/* 502 */       .append("sdf05", getSdf05())
/* 503 */       .append("sdf06", getSdf06())
/* 504 */       .append("sdf07", getSdf07())
/* 505 */       .append("sdf08", getSdf08())
/* 506 */       .append("sdf09", getSdf09())
/* 507 */       .append("sdf10", getSdf10())
/* 508 */       .append("sdf11", getSdf11())
/* 509 */       .append("sdf12", getSdf12())
/* 510 */       .append("sdf13", getSdf13())
/* 511 */       .append("sdf14", getSdf14())
/* 512 */       .append("sdf15", getSdf15())
/* 513 */       .append("sdf16", getSdf16())
/* 514 */       .append("sdf17", getSdf17())
/* 515 */       .append("sdf18", getSdf18())
/* 516 */       .append("sdf19", getSdf19())
/* 517 */       .append("sdf20", getSdf20())
/* 518 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\XxIntegrate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */