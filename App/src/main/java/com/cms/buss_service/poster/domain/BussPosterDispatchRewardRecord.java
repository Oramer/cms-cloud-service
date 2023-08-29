package com.cms.buss_service.poster.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

import java.math.BigDecimal;

public class BussPosterDispatchRewardRecord extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Integer id;
    @Excel(name = "订单ID")
    private String orderId;
    @Excel(name = "用户ID")
    private String userId;
    @Excel(name = "配送员ID")
    private String posterId;
    @Excel(name = "产品件数")
    private Integer productsNum;
    @Excel(name = "提成金额")
    private BigDecimal deductNum;
    @Excel(name = "状态0预入账 1生效中 2已提现 ")
    private Integer status;
    @Excel(name = "提成来源 1订单配送 2下级配送 3距离提成 4爬楼费奖励 5分享奖励")
    private Integer sourceFrom;

    /* 14 */
    public void setId(Integer id) {
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

    public void setDeductNum(BigDecimal deductNum) {
        this.deductNum = deductNum;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setSourceFrom(Integer sourceFrom) {
        this.sourceFrom = sourceFrom;
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
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BussPosterDispatchRewardRecord)) return false;
        BussPosterDispatchRewardRecord other = (BussPosterDispatchRewardRecord) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$orderId = getOrderId(), other$orderId = other.getOrderId();
        if ((this$orderId == null) ? (other$orderId != null) : !this$orderId.equals(other$orderId)) return false;
        Object this$userId = getUserId(), other$userId = other.getUserId();
        if ((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId)) return false;
        Object this$posterId = getPosterId(), other$posterId = other.getPosterId();
        if ((this$posterId == null) ? (other$posterId != null) : !this$posterId.equals(other$posterId)) return false;
        Object this$productsNum = getProductsNum(), other$productsNum = other.getProductsNum();
        if ((this$productsNum == null) ? (other$productsNum != null) : !this$productsNum.equals(other$productsNum))
            return false;
        Object this$deductNum = getDeductNum(), other$deductNum = other.getDeductNum();
        if ((this$deductNum == null) ? (other$deductNum != null) : !this$deductNum.equals(other$deductNum))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$sourceFrom = getSourceFrom(), other$sourceFrom = other.getSourceFrom();
        if ((this$sourceFrom == null) ? (other$sourceFrom != null) : !this$sourceFrom.equals(other$sourceFrom))
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
        return !((this$no10 == null) ? (other$no10 != null) : !this$no10.equals(other$no10));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof BussPosterDispatchRewardRecord;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $orderId = getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        Object $userId = getUserId();
        result = result * 59 + (($userId == null) ? 43 : $userId.hashCode());
        Object $posterId = getPosterId();
        result = result * 59 + (($posterId == null) ? 43 : $posterId.hashCode());
        Object $productsNum = getProductsNum();
        result = result * 59 + (($productsNum == null) ? 43 : $productsNum.hashCode());
        Object $deductNum = getDeductNum();
        result = result * 59 + (($deductNum == null) ? 43 : $deductNum.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $sourceFrom = getSourceFrom();
        result = result * 59 + (($sourceFrom == null) ? 43 : $sourceFrom.hashCode());
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
        return result * 59 + (($no10 == null) ? 43 : $no10.hashCode());
    }
    @Override
    public String toString() {
        return "BussPosterDispatchRewardRecord(id=" + getId() + ", orderId=" + getOrderId() + ", userId=" + getUserId() + ", posterId=" + getPosterId() + ", productsNum=" + getProductsNum() + ", deductNum=" + getDeductNum() + ", status=" + getStatus() + ", sourceFrom=" + getSourceFrom() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ")";
    }


    public Integer getId() {
        /* 19 */
        return this.id;
    }

    public String getOrderId() {
        /* 23 */
        return this.orderId;
    }

    public String getUserId() {
        /* 27 */
        return this.userId;
    }

    public String getPosterId() {
        /* 31 */
        return this.posterId;
    }

    public Integer getProductsNum() {
        /* 35 */
        return this.productsNum;
    }

    public BigDecimal getDeductNum() {
        /* 39 */
        return this.deductNum;
    }

    public Integer getStatus() {
        /* 43 */
        return this.status;
    }

    public Integer getSourceFrom() {
        /* 47 */
        return this.sourceFrom;
    }

    public String getNo1() {
        /* 51 */
        return this.no1;
    }

    public String getNo2() {
        /* 55 */
        return this.no2;
    }

    public String getNo3() {
        /* 59 */
        return this.no3;
    }

    public String getNo4() {
        /* 63 */
        return this.no4;
    }

    public String getNo5() {
        /* 67 */
        return this.no5;
    }

    public String getNo6() {
        /* 71 */
        return this.no6;
    }

    public String getNo7() {
        /* 75 */
        return this.no7;
    }

    public String getNo8() {
        /* 79 */
        return this.no8;
    }

    public String getNo9() {
        /* 83 */
        return this.no9;
    }

    public String getNo10() {
        /* 87 */
        return this.no10;
    }

    public BussPosterDispatchRewardRecord() {
    }

    public BussPosterDispatchRewardRecord(String orderId, String userId, String posterId, Integer productsNum, BigDecimal deductNum, Integer status, Integer sourceFrom) {
        /* 93 */
        this.orderId = orderId;
        /* 94 */
        this.userId = userId;
        /* 95 */
        this.posterId = posterId;
        /* 96 */
        this.productsNum = productsNum;
        /* 97 */
        this.deductNum = deductNum;
        /* 98 */
        this.status = status;
        /* 99 */
        this.sourceFrom = sourceFrom;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\domain\BussPosterDispatchRewardRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */