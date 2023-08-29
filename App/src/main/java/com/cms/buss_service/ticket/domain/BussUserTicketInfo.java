package com.cms.buss_service.ticket.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.buss_service.product.domain.BussProductInfo;

public class BussUserTicketInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long pk;
    private String orderId;
    @Excel(name = "产品信息")
    private String productId;
    @Excel(name = "品牌")
    private String productBrand;
    @Excel(name = "卡券ID")
    private String ticketId;
    @Excel(name = "用户ID")
    private String userId;
    @Excel(name = "卡券数量")
    private Integer ticketAccount;
    private Integer zcCount;
    @Excel(name = "来源类型")
    private String sourceType;
    @Excel(name = "获得时间")
    private String getTime;
    @Excel(name = "过期时间")
    private String expiredTime;
    @Excel(name = "是否已使用")
    private String isUsed;
    @Excel(name = "乐观锁")
    private String reversion;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no1;

    /*  17 */
    public void setPk(Long pk) {
        this.pk = pk;
    }

    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no2;
    private String no3;
    private String no4;
    private String no5;
    private String no6;
    private String no7;
    private String no8;
    private String no9;
    private String no10;
    private String no11;
    private String no12;
    private String no13;
    private String no14;
    private String no15;
    private BussProductInfo info;
    private BussTicketInfo ticket;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTicketAccount(Integer ticketAccount) {
        this.ticketAccount = ticketAccount;
    }

    public void setZcCount(Integer zcCount) {
        this.zcCount = zcCount;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public void setReversion(String reversion) {
        this.reversion = reversion;
    }

    public void setNo1(String no1) {
        this.no1 = no1;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public void setNo3(String no3) {
        this.no3 = no3;
    }

    public void setNo4(String no4) {
        this.no4 = no4;
    }

    public void setNo5(String no5) {
        this.no5 = no5;
    }

    public void setNo6(String no6) {
        this.no6 = no6;
    }

    public void setNo7(String no7) {
        this.no7 = no7;
    }

    public void setNo8(String no8) {
        this.no8 = no8;
    }

    public void setNo9(String no9) {
        this.no9 = no9;
    }

    public void setNo10(String no10) {
        this.no10 = no10;
    }

    public void setNo11(String no11) {
        this.no11 = no11;
    }

    public void setNo12(String no12) {
        this.no12 = no12;
    }

    public void setNo13(String no13) {
        this.no13 = no13;
    }

    public void setNo14(String no14) {
        this.no14 = no14;
    }

    public void setNo15(String no15) {
        this.no15 = no15;
    }

    public void setInfo(BussProductInfo info) {
        this.info = info;
    }

    public void setTicket(BussTicketInfo ticket) {
        this.ticket = ticket;
    }
    @Override
    public String toString() {
        return "BussUserTicketInfo(pk=" + getPk() + ", orderId=" + getOrderId() + ", productId=" + getProductId() + ", productBrand=" + getProductBrand() + ", ticketId=" + getTicketId() + ", userId=" + getUserId() + ", ticketAccount=" + getTicketAccount() + ", zcCount=" + getZcCount() + ", sourceType=" + getSourceType() + ", getTime=" + getGetTime() + ", expiredTime=" + getExpiredTime() + ", isUsed=" + getIsUsed() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", no11=" + getNo11() + ", no12=" + getNo12() + ", no13=" + getNo13() + ", no14=" + getNo14() + ", no15=" + getNo15() + ", info=" + getInfo() + ", ticket=" + getTicket() + ")";
    }


    public Long getPk() {
        /*  24 */
        return this.pk;
    }

    public String getOrderId() {
        /*  25 */
        return this.orderId;
    }


    public String getProductId() {
        /*  31 */
        return this.productId;
    }


    public String getProductBrand() {
        /*  37 */
        return this.productBrand;
    }


    public String getTicketId() {
        /*  43 */
        return this.ticketId;
    }


    public String getUserId() {
        /*  49 */
        return this.userId;
    }


    public Integer getTicketAccount() {
        /*  55 */
        return this.ticketAccount;
    }

    public Integer getZcCount() {
        /*  58 */
        return this.zcCount;
    }


    public String getSourceType() {
        /*  64 */
        return this.sourceType;
    }


    public String getGetTime() {
        /*  70 */
        return this.getTime;
    }


    public String getExpiredTime() {
        /*  76 */
        return this.expiredTime;
    }


    public String getIsUsed() {
        /*  82 */
        return this.isUsed;
    }


    public String getReversion() {
        /*  88 */
        return this.reversion;
    }


    public String getNo1() {
        /*  94 */
        return this.no1;
    }


    public String getNo2() {
        /* 100 */
        return this.no2;
    }


    public String getNo3() {
        /* 105 */
        return this.no3;
    }


    public String getNo4() {
        /* 110 */
        return this.no4;
    }


    public String getNo5() {
        /* 115 */
        return this.no5;
    }


    public String getNo6() {
        /* 120 */
        return this.no6;
    }


    public String getNo7() {
        /* 125 */
        return this.no7;
    }


    public String getNo8() {
        /* 130 */
        return this.no8;
    }


    public String getNo9() {
        /* 135 */
        return this.no9;
    }


    public String getNo10() {
        /* 140 */
        return this.no10;
    }


    public String getNo11() {
        /* 145 */
        return this.no11;
    }


    public String getNo12() {
        /* 150 */
        return this.no12;
    }


    public String getNo13() {
        /* 155 */
        return this.no13;
    }


    public String getNo14() {
        /* 160 */
        return this.no14;
    }


    public String getNo15() {
        /* 165 */
        return this.no15;
    }

    public BussProductInfo getInfo() {
        /* 167 */
        return this.info;
    }

    public BussTicketInfo getTicket() {
        /* 169 */
        return this.ticket;
    }

    @Override
    public boolean equals(Object arg0) {
        /* 174 */
        BussUserTicketInfo p = (BussUserTicketInfo) arg0;
        /* 175 */
        return this.pk.equals(p.pk);
    }

    @Override
    public int hashCode() {
        /* 180 */
        return this.pk.hashCode();
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\domain\BussUserTicketInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */