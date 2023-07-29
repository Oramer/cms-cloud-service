package com.cms.buss_service.ticket.domain;

import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
import java.math.BigDecimal;










































































































public class BussTicketInfo
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  private String pk;
  @Excel(name = "水站信息")
  private String stationPk;
  private String stationName;
  @Excel(name = "产品信息")
  private String productPk;
  @Excel(name = "产品单价")
  private BigDecimal productPrice;
  @Excel(name = "满赠起点")
  private Integer pBasic;
  @Excel(name = "加赠数量")
  private Integer pBonus;
  @Excel(name = "规则名称")
  private String ruleName;
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
  
  public Integer getpBasic() {
/* 164 */     return this.pBasic;
  }
  
  public void setpBasic(Integer pBasic) {
/* 168 */     this.pBasic = pBasic;
  }
  
  public String getStationName() {
/* 172 */     return this.stationName;
  }
  
  public void setStationName(String stationName) {
/* 176 */     this.stationName = stationName;
  }
  
  public String getPk() {
/* 180 */     return this.pk;
  }
  
  public void setPk(String pk) {
/* 184 */     this.pk = pk;
  }
  
  public String getStationPk() {
/* 188 */     return this.stationPk;
  }
  
  public void setStationPk(String stationPk) {
/* 192 */     this.stationPk = stationPk;
  }
  
  public String getProductPk() {
/* 196 */     return this.productPk;
  }
  
  public void setProductPk(String productPk) {
/* 200 */     this.productPk = productPk;
  }
  
  public BigDecimal getProductPrice() {
/* 204 */     return this.productPrice;
  }
  
  public void setProductPrice(BigDecimal productPrice) {
/* 208 */     this.productPrice = productPrice;
  }
  
  public Integer getpBonus() {
/* 212 */     return this.pBonus;
  }
  
  public void setpBonus(Integer pBonus) {
/* 216 */     this.pBonus = pBonus;
  }
  
  public String getRuleName() {
/* 220 */     return this.ruleName;
  }
  
  public void setRuleName(String ruleName) {
/* 224 */     this.ruleName = ruleName;
  }
  
  public String getReversion() {
/* 228 */     return this.reversion;
  }
  
  public void setReversion(String reversion) {
/* 232 */     this.reversion = reversion;
  }
  
  public String getNo1() {
/* 236 */     return this.no1;
  }
  
  public void setNo1(String no1) {
/* 240 */     this.no1 = no1;
  }
  
  public String getNo2() {
/* 244 */     return this.no2;
  }
  
  public void setNo2(String no2) {
/* 248 */     this.no2 = no2;
  }
  
  public String getNo3() {
/* 252 */     return this.no3;
  }
  
  public void setNo3(String no3) {
/* 256 */     this.no3 = no3;
  }
  
  public String getNo4() {
/* 260 */     return this.no4;
  }
  
  public void setNo4(String no4) {
/* 264 */     this.no4 = no4;
  }
  
  public String getNo5() {
/* 268 */     return this.no5;
  }
  
  public void setNo5(String no5) {
/* 272 */     this.no5 = no5;
  }
  
  public String getNo6() {
/* 276 */     return this.no6;
  }
  
  public void setNo6(String no6) {
/* 280 */     this.no6 = no6;
  }
  
  public String getNo7() {
/* 284 */     return this.no7;
  }
  
  public void setNo7(String no7) {
/* 288 */     this.no7 = no7;
  }
  
  public String getNo8() {
/* 292 */     return this.no8;
  }
  
  public void setNo8(String no8) {
/* 296 */     this.no8 = no8;
  }
  
  public String getNo9() {
/* 300 */     return this.no9;
  }
  
  public void setNo9(String no9) {
/* 304 */     this.no9 = no9;
  }
  
  public String getNo10() {
/* 308 */     return this.no10;
  }
  
  public void setNo10(String no10) {
/* 312 */     this.no10 = no10;
  }
  
  public String getNo11() {
/* 316 */     return this.no11;
  }
  
  public void setNo11(String no11) {
/* 320 */     this.no11 = no11;
  }
  
  public String getNo12() {
/* 324 */     return this.no12;
  }
  
  public void setNo12(String no12) {
/* 328 */     this.no12 = no12;
  }
  
  public String getNo13() {
/* 332 */     return this.no13;
  }
  
  public void setNo13(String no13) {
/* 336 */     this.no13 = no13;
  }
  
  public String getNo14() {
/* 340 */     return this.no14;
  }
  
  public void setNo14(String no14) {
/* 344 */     this.no14 = no14;
  }
  
  public String getNo15() {
/* 348 */     return this.no15;
  }
  
  public void setNo15(String no15) {
/* 352 */     this.no15 = no15;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\domain\BussTicketInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */