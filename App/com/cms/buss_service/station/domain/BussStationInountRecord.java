package com.cms.buss_service.station.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

import java.math.BigDecimal;

public class BussStationInountRecord extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Excel(name = "水站ID")
    private String stationId;
    @Excel(name = "订单ID")
    private String orderId;
    @Excel(name = "用户ID")
    private String userId;
    @Excel(name = "配送员ID")
    private String posterId;
    @Excel(name = "产品件数")
    private Integer productsNum;
    @Excel(name = "提成金额")
    private BigDecimal moneyNum;
    @Excel(name = "税后金额")
    private BigDecimal moneyTaxNum;
    @Excel(name = " 0预入账 1生效中 2已提现 3提现审核4提现拒绝 ")
    private Integer status;
    @Excel(name = "记录来源 1订单收入 2收入提现")
    private Integer sourceFrom;
    @Excel(name = "记录类型1 收入  2支出")
    private Integer recordType;

    /*  14 */
    public void setId(Long id) {
        this.id = id;
    }

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
    private String stationName;
    private String userName;
    private String posterName;

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPosterId(String posterId) {
        this.posterId = posterId;
    }

    public void setProductsNum(Integer productsNum) {
        this.productsNum = productsNum;
    }

    public void setMoneyNum(BigDecimal moneyNum) {
        this.moneyNum = moneyNum;
    }

    public void setMoneyTaxNum(BigDecimal moneyTaxNum) {
        this.moneyTaxNum = moneyTaxNum;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setSourceFrom(Integer sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
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

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.station.domain.BussStationInountRecord)) return false;
        com.cms.buss_service.station.domain.BussStationInountRecord other = (com.cms.buss_service.station.domain.BussStationInountRecord) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$stationId = getStationId(), other$stationId = other.getStationId();
        if ((this$stationId == null) ? (other$stationId != null) : !this$stationId.equals(other$stationId))
            return false;
        Object this$orderId = getOrderId(), other$orderId = other.getOrderId();
        if ((this$orderId == null) ? (other$orderId != null) : !this$orderId.equals(other$orderId)) return false;
        Object this$userId = getUserId(), other$userId = other.getUserId();
        if ((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId)) return false;
        Object this$posterId = getPosterId(), other$posterId = other.getPosterId();
        if ((this$posterId == null) ? (other$posterId != null) : !this$posterId.equals(other$posterId)) return false;
        Object this$productsNum = getProductsNum(), other$productsNum = other.getProductsNum();
        if ((this$productsNum == null) ? (other$productsNum != null) : !this$productsNum.equals(other$productsNum))
            return false;
        Object this$moneyNum = getMoneyNum(), other$moneyNum = other.getMoneyNum();
        if ((this$moneyNum == null) ? (other$moneyNum != null) : !this$moneyNum.equals(other$moneyNum)) return false;
        Object this$moneyTaxNum = getMoneyTaxNum(), other$moneyTaxNum = other.getMoneyTaxNum();
        if ((this$moneyTaxNum == null) ? (other$moneyTaxNum != null) : !this$moneyTaxNum.equals(other$moneyTaxNum))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$sourceFrom = getSourceFrom(), other$sourceFrom = other.getSourceFrom();
        if ((this$sourceFrom == null) ? (other$sourceFrom != null) : !this$sourceFrom.equals(other$sourceFrom))
            return false;
        Object this$recordType = getRecordType(), other$recordType = other.getRecordType();
        if ((this$recordType == null) ? (other$recordType != null) : !this$recordType.equals(other$recordType))
            return false;
        Object this$no1 = getNo1(), other$no1 = other.getNo1();
        if ((this$no1 == null) ? (other$no1 != null) : !this$no1.equals(other$no1)) return false;
        Object this$no2 = getNo2(), other$no2 = other.getNo2();
        if ((this$no2 == null) ? (other$no2 != null) : !this$no2.equals(other$no2)) return false;
        Object this$no3 = getNo3(), other$no3 = other.getNo3();
        if ((this$no3 == null) ? (other$no3 != null) : !this$no3.equals(other$no3)) return false;
        Object this$no4 = getNo4(), other$no4 = other.getNo4();
        if ((this$no4 == null) ? (other$no4 != null) : !this$no4.equals(other$no4)) return false;
        Object this$no5 = getNo5(), other$no5 = other.getNo5();
        if ((this$no5 == null) ? (other$no5 != null) : !this$no5.equals(other$no5)) return false;
        Object this$no6 = getNo6(), other$no6 = other.getNo6();
        if ((this$no6 == null) ? (other$no6 != null) : !this$no6.equals(other$no6)) return false;
        Object this$no7 = getNo7(), other$no7 = other.getNo7();
        if ((this$no7 == null) ? (other$no7 != null) : !this$no7.equals(other$no7)) return false;
        Object this$no8 = getNo8(), other$no8 = other.getNo8();
        if ((this$no8 == null) ? (other$no8 != null) : !this$no8.equals(other$no8)) return false;
        Object this$no9 = getNo9(), other$no9 = other.getNo9();
        if ((this$no9 == null) ? (other$no9 != null) : !this$no9.equals(other$no9)) return false;
        Object this$no10 = getNo10(), other$no10 = other.getNo10();
        if ((this$no10 == null) ? (other$no10 != null) : !this$no10.equals(other$no10)) return false;
        Object this$stationName = getStationName(), other$stationName = other.getStationName();
        if ((this$stationName == null) ? (other$stationName != null) : !this$stationName.equals(other$stationName))
            return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$posterName = getPosterName(), other$posterName = other.getPosterName();
        return !((this$posterName == null) ? (other$posterName != null) : !this$posterName.equals(other$posterName));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.station.domain.BussStationInountRecord;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $stationId = getStationId();
        result = result * 59 + (($stationId == null) ? 43 : $stationId.hashCode());
        Object $orderId = getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        Object $userId = getUserId();
        result = result * 59 + (($userId == null) ? 43 : $userId.hashCode());
        Object $posterId = getPosterId();
        result = result * 59 + (($posterId == null) ? 43 : $posterId.hashCode());
        Object $productsNum = getProductsNum();
        result = result * 59 + (($productsNum == null) ? 43 : $productsNum.hashCode());
        Object $moneyNum = getMoneyNum();
        result = result * 59 + (($moneyNum == null) ? 43 : $moneyNum.hashCode());
        Object $moneyTaxNum = getMoneyTaxNum();
        result = result * 59 + (($moneyTaxNum == null) ? 43 : $moneyTaxNum.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $sourceFrom = getSourceFrom();
        result = result * 59 + (($sourceFrom == null) ? 43 : $sourceFrom.hashCode());
        Object $recordType = getRecordType();
        result = result * 59 + (($recordType == null) ? 43 : $recordType.hashCode());
        Object $no1 = getNo1();
        result = result * 59 + (($no1 == null) ? 43 : $no1.hashCode());
        Object $no2 = getNo2();
        result = result * 59 + (($no2 == null) ? 43 : $no2.hashCode());
        Object $no3 = getNo3();
        result = result * 59 + (($no3 == null) ? 43 : $no3.hashCode());
        Object $no4 = getNo4();
        result = result * 59 + (($no4 == null) ? 43 : $no4.hashCode());
        Object $no5 = getNo5();
        result = result * 59 + (($no5 == null) ? 43 : $no5.hashCode());
        Object $no6 = getNo6();
        result = result * 59 + (($no6 == null) ? 43 : $no6.hashCode());
        Object $no7 = getNo7();
        result = result * 59 + (($no7 == null) ? 43 : $no7.hashCode());
        Object $no8 = getNo8();
        result = result * 59 + (($no8 == null) ? 43 : $no8.hashCode());
        Object $no9 = getNo9();
        result = result * 59 + (($no9 == null) ? 43 : $no9.hashCode());
        Object $no10 = getNo10();
        result = result * 59 + (($no10 == null) ? 43 : $no10.hashCode());
        Object $stationName = getStationName();
        result = result * 59 + (($stationName == null) ? 43 : $stationName.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $posterName = getPosterName();
        return result * 59 + (($posterName == null) ? 43 : $posterName.hashCode());
    }
    @Override
    public String toString() {
        return "BussStationInountRecord(id=" + getId() + ", stationId=" + getStationId() + ", orderId=" + getOrderId() + ", userId=" + getUserId() + ", posterId=" + getPosterId() + ", productsNum=" + getProductsNum() + ", moneyNum=" + getMoneyNum() + ", moneyTaxNum=" + getMoneyTaxNum() + ", status=" + getStatus() + ", sourceFrom=" + getSourceFrom() + ", recordType=" + getRecordType() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", stationName=" + getStationName() + ", userName=" + getUserName() + ", posterName=" + getPosterName() + ")";
    }


    public Long getId() {
        /*  21 */
        return this.id;
    }


    public String getStationId() {
        /*  27 */
        return this.stationId;
    }


    public String getOrderId() {
        /*  33 */
        return this.orderId;
    }


    public String getUserId() {
        /*  39 */
        return this.userId;
    }


    public String getPosterId() {
        /*  45 */
        return this.posterId;
    }


    public Integer getProductsNum() {
        /*  51 */
        return this.productsNum;
    }


    public BigDecimal getMoneyNum() {
        /*  57 */
        return this.moneyNum;
    }


    public BigDecimal getMoneyTaxNum() {
        /*  63 */
        return this.moneyTaxNum;
    }


    public Integer getStatus() {
        /*  69 */
        return this.status;
    }


    public Integer getSourceFrom() {
        /*  75 */
        return this.sourceFrom;
    }


    public Integer getRecordType() {
        /*  81 */
        return this.recordType;
    }


    public String getNo1() {
        /*  86 */
        return this.no1;
    }


    public String getNo2() {
        /*  92 */
        return this.no2;
    }


    public String getNo3() {
        /*  98 */
        return this.no3;
    }


    public String getNo4() {
        /* 104 */
        return this.no4;
    }


    public String getNo5() {
        /* 110 */
        return this.no5;
    }


    public String getNo6() {
        /* 116 */
        return this.no6;
    }


    public String getNo7() {
        /* 122 */
        return this.no7;
    }


    public String getNo8() {
        /* 128 */
        return this.no8;
    }


    public String getNo9() {
        /* 134 */
        return this.no9;
    }


    public String getNo10() {
        /* 140 */
        return this.no10;
    }

    public String getStationName() {
        /* 143 */
        return this.stationName;
    }

    public String getUserName() {
        /* 145 */
        return this.userName;
    }

    public String getPosterName() {
        /* 147 */
        return this.posterName;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\domain\BussStationInountRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */