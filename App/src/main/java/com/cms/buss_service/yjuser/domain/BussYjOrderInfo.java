package com.cms.buss_service.yjuser.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

import java.math.BigDecimal;

public class BussYjOrderInfo extends BaseEntity {
    private String pk;
    @Excel(name = "订单号(交易流水号)")
    private String batchNo;
    @Excel(name = "下单时间")
    private String orderTime;
    @Excel(name = "下单人")
    private String orderPersion;
    @Excel(name = "归属水站")
    private Long stationId;
    @Excel(name = "月结归属年份")
    private Integer oyear;
    @Excel(name = "产品数量")
    private Long amount;
    private Integer omouth;
    @Excel(name = "产品总价")
    private BigDecimal amountofmoney;
    @Excel(name = "产品单价")
    private BigDecimal singlePrice;
    @Excel(name = "快递费用")
    private BigDecimal expressFee;
    @Excel(name = "是否超时")
    private String isOvertime;
    @Excel(name = "超时时间")
    private String overtimeTime;
    @Excel(name = "订单备注")
    private String orderRemark;
    @Excel(name = "订单支付时间")
    private String orderPayTime;
    @Excel(name = "订单完成时间")
    private String completeTime;
    @Excel(name = "订单类型")
    private String orderType;
    @Excel(name = "订单状态(1待支付2已支付3已取消4已超时)")
    /*  16 */ private Long orderStatus;

    public void setPk(String pk) {
        this.pk = pk;
    }

    @Excel(name = "支付类型")
    private String payType;
    @Excel(name = "是否抵押桶")
    private String needMortgage;
    private String delFlag;
    @Excel(name = "取消原因;")
    private String cancelReason;
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
    private String no15;

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setOrderPersion(String orderPersion) {
        this.orderPersion = orderPersion;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public void setOyear(Integer oyear) {
        this.oyear = oyear;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setOmouth(Integer omouth) {
        this.omouth = omouth;
    }

    public void setAmountofmoney(BigDecimal amountofmoney) {
        this.amountofmoney = amountofmoney;
    }

    public void setSinglePrice(BigDecimal singlePrice) {
        this.singlePrice = singlePrice;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }

    public void setIsOvertime(String isOvertime) {
        this.isOvertime = isOvertime;
    }

    public void setOvertimeTime(String overtimeTime) {
        this.overtimeTime = overtimeTime;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public void setOrderPayTime(String orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public void setNeedMortgage(String needMortgage) {
        this.needMortgage = needMortgage;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
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
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BussYjOrderInfo)) return false;
        BussYjOrderInfo other = (BussYjOrderInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$batchNo = getBatchNo(), other$batchNo = other.getBatchNo();
        if ((this$batchNo == null) ? (other$batchNo != null) : !this$batchNo.equals(other$batchNo)) return false;
        Object this$orderTime = getOrderTime(), other$orderTime = other.getOrderTime();
        if ((this$orderTime == null) ? (other$orderTime != null) : !this$orderTime.equals(other$orderTime))
            return false;
        Object this$orderPersion = getOrderPersion(), other$orderPersion = other.getOrderPersion();
        if ((this$orderPersion == null) ? (other$orderPersion != null) : !this$orderPersion.equals(other$orderPersion))
            return false;
        Object this$stationId = getStationId(), other$stationId = other.getStationId();
        if ((this$stationId == null) ? (other$stationId != null) : !this$stationId.equals(other$stationId))
            return false;
        Object this$oyear = getOyear(), other$oyear = other.getOyear();
        if ((this$oyear == null) ? (other$oyear != null) : !this$oyear.equals(other$oyear)) return false;
        Object this$amount = getAmount(), other$amount = other.getAmount();
        if ((this$amount == null) ? (other$amount != null) : !this$amount.equals(other$amount)) return false;
        Object this$omouth = getOmouth(), other$omouth = other.getOmouth();
        if ((this$omouth == null) ? (other$omouth != null) : !this$omouth.equals(other$omouth)) return false;
        Object this$amountofmoney = getAmountofmoney(), other$amountofmoney = other.getAmountofmoney();
        if ((this$amountofmoney == null) ? (other$amountofmoney != null) : !this$amountofmoney.equals(other$amountofmoney))
            return false;
        Object this$singlePrice = getSinglePrice(), other$singlePrice = other.getSinglePrice();
        if ((this$singlePrice == null) ? (other$singlePrice != null) : !this$singlePrice.equals(other$singlePrice))
            return false;
        Object this$expressFee = getExpressFee(), other$expressFee = other.getExpressFee();
        if ((this$expressFee == null) ? (other$expressFee != null) : !this$expressFee.equals(other$expressFee))
            return false;
        Object this$isOvertime = getIsOvertime(), other$isOvertime = other.getIsOvertime();
        if ((this$isOvertime == null) ? (other$isOvertime != null) : !this$isOvertime.equals(other$isOvertime))
            return false;
        Object this$overtimeTime = getOvertimeTime(), other$overtimeTime = other.getOvertimeTime();
        if ((this$overtimeTime == null) ? (other$overtimeTime != null) : !this$overtimeTime.equals(other$overtimeTime))
            return false;
        Object this$orderRemark = getOrderRemark(), other$orderRemark = other.getOrderRemark();
        if ((this$orderRemark == null) ? (other$orderRemark != null) : !this$orderRemark.equals(other$orderRemark))
            return false;
        Object this$orderPayTime = getOrderPayTime(), other$orderPayTime = other.getOrderPayTime();
        if ((this$orderPayTime == null) ? (other$orderPayTime != null) : !this$orderPayTime.equals(other$orderPayTime))
            return false;
        Object this$completeTime = getCompleteTime(), other$completeTime = other.getCompleteTime();
        if ((this$completeTime == null) ? (other$completeTime != null) : !this$completeTime.equals(other$completeTime))
            return false;
        Object this$orderType = getOrderType(), other$orderType = other.getOrderType();
        if ((this$orderType == null) ? (other$orderType != null) : !this$orderType.equals(other$orderType))
            return false;
        Object this$orderStatus = getOrderStatus(), other$orderStatus = other.getOrderStatus();
        if ((this$orderStatus == null) ? (other$orderStatus != null) : !this$orderStatus.equals(other$orderStatus))
            return false;
        Object this$payType = getPayType(), other$payType = other.getPayType();
        if ((this$payType == null) ? (other$payType != null) : !this$payType.equals(other$payType)) return false;
        Object this$needMortgage = getNeedMortgage(), other$needMortgage = other.getNeedMortgage();
        if ((this$needMortgage == null) ? (other$needMortgage != null) : !this$needMortgage.equals(other$needMortgage))
            return false;
        Object this$delFlag = getDelFlag(), other$delFlag = other.getDelFlag();
        if ((this$delFlag == null) ? (other$delFlag != null) : !this$delFlag.equals(other$delFlag)) return false;
        Object this$cancelReason = getCancelReason(), other$cancelReason = other.getCancelReason();
        if ((this$cancelReason == null) ? (other$cancelReason != null) : !this$cancelReason.equals(other$cancelReason))
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
        Object this$no11 = getNo11(), other$no11 = other.getNo11();
        if ((this$no11 == null) ? (other$no11 != null) : !this$no11.equals(other$no11)) return false;
        Object this$no12 = getNo12(), other$no12 = other.getNo12();
        if ((this$no12 == null) ? (other$no12 != null) : !this$no12.equals(other$no12)) return false;
        Object this$no13 = getNo13(), other$no13 = other.getNo13();
        if ((this$no13 == null) ? (other$no13 != null) : !this$no13.equals(other$no13)) return false;
        Object this$no14 = getNo14(), other$no14 = other.getNo14();
        if ((this$no14 == null) ? (other$no14 != null) : !this$no14.equals(other$no14)) return false;
        Object this$no15 = getNo15(), other$no15 = other.getNo15();
        return !((this$no15 == null) ? (other$no15 != null) : !this$no15.equals(other$no15));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof BussYjOrderInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $batchNo = getBatchNo();
        result = result * 59 + (($batchNo == null) ? 43 : $batchNo.hashCode());
        Object $orderTime = getOrderTime();
        result = result * 59 + (($orderTime == null) ? 43 : $orderTime.hashCode());
        Object $orderPersion = getOrderPersion();
        result = result * 59 + (($orderPersion == null) ? 43 : $orderPersion.hashCode());
        Object $stationId = getStationId();
        result = result * 59 + (($stationId == null) ? 43 : $stationId.hashCode());
        Object $oyear = getOyear();
        result = result * 59 + (($oyear == null) ? 43 : $oyear.hashCode());
        Object $amount = getAmount();
        result = result * 59 + (($amount == null) ? 43 : $amount.hashCode());
        Object $omouth = getOmouth();
        result = result * 59 + (($omouth == null) ? 43 : $omouth.hashCode());
        Object $amountofmoney = getAmountofmoney();
        result = result * 59 + (($amountofmoney == null) ? 43 : $amountofmoney.hashCode());
        Object $singlePrice = getSinglePrice();
        result = result * 59 + (($singlePrice == null) ? 43 : $singlePrice.hashCode());
        Object $expressFee = getExpressFee();
        result = result * 59 + (($expressFee == null) ? 43 : $expressFee.hashCode());
        Object $isOvertime = getIsOvertime();
        result = result * 59 + (($isOvertime == null) ? 43 : $isOvertime.hashCode());
        Object $overtimeTime = getOvertimeTime();
        result = result * 59 + (($overtimeTime == null) ? 43 : $overtimeTime.hashCode());
        Object $orderRemark = getOrderRemark();
        result = result * 59 + (($orderRemark == null) ? 43 : $orderRemark.hashCode());
        Object $orderPayTime = getOrderPayTime();
        result = result * 59 + (($orderPayTime == null) ? 43 : $orderPayTime.hashCode());
        Object $completeTime = getCompleteTime();
        result = result * 59 + (($completeTime == null) ? 43 : $completeTime.hashCode());
        Object $orderType = getOrderType();
        result = result * 59 + (($orderType == null) ? 43 : $orderType.hashCode());
        Object $orderStatus = getOrderStatus();
        result = result * 59 + (($orderStatus == null) ? 43 : $orderStatus.hashCode());
        Object $payType = getPayType();
        result = result * 59 + (($payType == null) ? 43 : $payType.hashCode());
        Object $needMortgage = getNeedMortgage();
        result = result * 59 + (($needMortgage == null) ? 43 : $needMortgage.hashCode());
        Object $delFlag = getDelFlag();
        result = result * 59 + (($delFlag == null) ? 43 : $delFlag.hashCode());
        Object $cancelReason = getCancelReason();
        result = result * 59 + (($cancelReason == null) ? 43 : $cancelReason.hashCode());
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
        Object $no11 = getNo11();
        result = result * 59 + (($no11 == null) ? 43 : $no11.hashCode());
        Object $no12 = getNo12();
        result = result * 59 + (($no12 == null) ? 43 : $no12.hashCode());
        Object $no13 = getNo13();
        result = result * 59 + (($no13 == null) ? 43 : $no13.hashCode());
        Object $no14 = getNo14();
        result = result * 59 + (($no14 == null) ? 43 : $no14.hashCode());
        Object $no15 = getNo15();
        return result * 59 + (($no15 == null) ? 43 : $no15.hashCode());
    }
    @Override
    public String toString() {
        return "BussYjOrderInfo(pk=" + getPk() + ", batchNo=" + getBatchNo() + ", orderTime=" + getOrderTime() + ", orderPersion=" + getOrderPersion() + ", stationId=" + getStationId() + ", oyear=" + getOyear() + ", amount=" + getAmount() + ", omouth=" + getOmouth() + ", amountofmoney=" + getAmountofmoney() + ", singlePrice=" + getSinglePrice() + ", expressFee=" + getExpressFee() + ", isOvertime=" + getIsOvertime() + ", overtimeTime=" + getOvertimeTime() + ", orderRemark=" + getOrderRemark() + ", orderPayTime=" + getOrderPayTime() + ", completeTime=" + getCompleteTime() + ", orderType=" + getOrderType() + ", orderStatus=" + getOrderStatus() + ", payType=" + getPayType() + ", needMortgage=" + getNeedMortgage() + ", delFlag=" + getDelFlag() + ", cancelReason=" + getCancelReason() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", no11=" + getNo11() + ", no12=" + getNo12() + ", no13=" + getNo13() + ", no14=" + getNo14() + ", no15=" + getNo15() + ")";
    }


    public String getPk() {
        /*  23 */
        return this.pk;
    }


    public String getBatchNo() {
        /*  29 */
        return this.batchNo;
    }


    public String getOrderTime() {
        /*  35 */
        return this.orderTime;
    }


    public String getOrderPersion() {
        /*  41 */
        return this.orderPersion;
    }


    public Long getStationId() {
        /*  47 */
        return this.stationId;
    }


    public Integer getOyear() {
        /*  53 */
        return this.oyear;
    }


    public Long getAmount() {
        /*  59 */
        return this.amount;
    }

    public Integer getOmouth() {
        /*  63 */
        return this.omouth;
    }


    public BigDecimal getAmountofmoney() {
        /*  68 */
        return this.amountofmoney;
    }


    public BigDecimal getSinglePrice() {
        /*  74 */
        return this.singlePrice;
    }


    public BigDecimal getExpressFee() {
        /*  80 */
        return this.expressFee;
    }


    public String getIsOvertime() {
        /*  86 */
        return this.isOvertime;
    }


    public String getOvertimeTime() {
        /*  92 */
        return this.overtimeTime;
    }


    public String getOrderRemark() {
        /*  98 */
        return this.orderRemark;
    }


    public String getOrderPayTime() {
        /* 104 */
        return this.orderPayTime;
    }


    public String getCompleteTime() {
        /* 110 */
        return this.completeTime;
    }


    public String getOrderType() {
        /* 116 */
        return this.orderType;
    }


    public Long getOrderStatus() {
        /* 122 */
        return this.orderStatus;
    }


    public String getPayType() {
        /* 128 */
        return this.payType;
    }


    public String getNeedMortgage() {
        /* 134 */
        return this.needMortgage;
    }


    public String getDelFlag() {
        /* 139 */
        return this.delFlag;
    }


    public String getCancelReason() {
        /* 145 */
        return this.cancelReason;
    }


    public String getNo1() {
        /* 151 */
        return this.no1;
    }


    public String getNo2() {
        /* 157 */
        return this.no2;
    }


    public String getNo3() {
        /* 163 */
        return this.no3;
    }


    public String getNo4() {
        /* 169 */
        return this.no4;
    }


    public String getNo5() {
        /* 175 */
        return this.no5;
    }


    public String getNo6() {
        /* 181 */
        return this.no6;
    }


    public String getNo7() {
        /* 187 */
        return this.no7;
    }


    public String getNo8() {
        /* 193 */
        return this.no8;
    }


    public String getNo9() {
        /* 199 */
        return this.no9;
    }


    public String getNo10() {
        /* 205 */
        return this.no10;
    }


    public String getNo11() {
        /* 211 */
        return this.no11;
    }


    public String getNo12() {
        /* 217 */
        return this.no12;
    }


    public String getNo13() {
        /* 223 */
        return this.no13;
    }


    public String getNo14() {
        /* 229 */
        return this.no14;
    }


    public String getNo15() {
        /* 235 */
        return this.no15;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\domain\BussYjOrderInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */