package com.cms.buss_service.yjuser.domain;

import java.math.BigDecimal;

public class PrepareYueJieVo {
    private String orderId;
    private String openid;
    private String out_trade_no;
    private BigDecimal amount;
    private String wx_trade_no;
    private String userId;
    private String stationId;
    private String stationUser;
    private String orderRemark;
    private String prepareInfo;

    public void setOrderId(String orderId) {
        /* 19 */
        this.orderId = orderId;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setWx_trade_no(String wx_trade_no) {
        this.wx_trade_no = wx_trade_no;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setStationUser(String stationUser) {
        this.stationUser = stationUser;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public void setPrepareInfo(String prepareInfo) {
        this.prepareInfo = prepareInfo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.yjuser.domain.PrepareYueJieVo)) return false;
        com.cms.buss_service.yjuser.domain.PrepareYueJieVo other = (com.cms.buss_service.yjuser.domain.PrepareYueJieVo) o;
        if (!other.canEqual(this)) return false;
        Object this$orderId = getOrderId(), other$orderId = other.getOrderId();
        if ((this$orderId == null) ? (other$orderId != null) : !this$orderId.equals(other$orderId)) return false;
        Object this$openid = getOpenid(), other$openid = other.getOpenid();
        if ((this$openid == null) ? (other$openid != null) : !this$openid.equals(other$openid)) return false;
        Object this$out_trade_no = getOut_trade_no(), other$out_trade_no = other.getOut_trade_no();
        if ((this$out_trade_no == null) ? (other$out_trade_no != null) : !this$out_trade_no.equals(other$out_trade_no))
            return false;
        Object this$amount = getAmount(), other$amount = other.getAmount();
        if ((this$amount == null) ? (other$amount != null) : !this$amount.equals(other$amount)) return false;
        Object this$wx_trade_no = getWx_trade_no(), other$wx_trade_no = other.getWx_trade_no();
        if ((this$wx_trade_no == null) ? (other$wx_trade_no != null) : !this$wx_trade_no.equals(other$wx_trade_no))
            return false;
        Object this$userId = getUserId(), other$userId = other.getUserId();
        if ((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId)) return false;
        Object this$stationId = getStationId(), other$stationId = other.getStationId();
        if ((this$stationId == null) ? (other$stationId != null) : !this$stationId.equals(other$stationId))
            return false;
        Object this$stationUser = getStationUser(), other$stationUser = other.getStationUser();
        if ((this$stationUser == null) ? (other$stationUser != null) : !this$stationUser.equals(other$stationUser))
            return false;
        Object this$orderRemark = getOrderRemark(), other$orderRemark = other.getOrderRemark();
        if ((this$orderRemark == null) ? (other$orderRemark != null) : !this$orderRemark.equals(other$orderRemark))
            return false;
        Object this$prepareInfo = getPrepareInfo(), other$prepareInfo = other.getPrepareInfo();
        return !((this$prepareInfo == null) ? (other$prepareInfo != null) : !this$prepareInfo.equals(other$prepareInfo));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.yjuser.domain.PrepareYueJieVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $orderId = getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        Object $openid = getOpenid();
        result = result * 59 + (($openid == null) ? 43 : $openid.hashCode());
        Object $out_trade_no = getOut_trade_no();
        result = result * 59 + (($out_trade_no == null) ? 43 : $out_trade_no.hashCode());
        Object $amount = getAmount();
        result = result * 59 + (($amount == null) ? 43 : $amount.hashCode());
        Object $wx_trade_no = getWx_trade_no();
        result = result * 59 + (($wx_trade_no == null) ? 43 : $wx_trade_no.hashCode());
        Object $userId = getUserId();
        result = result * 59 + (($userId == null) ? 43 : $userId.hashCode());
        Object $stationId = getStationId();
        result = result * 59 + (($stationId == null) ? 43 : $stationId.hashCode());
        Object $stationUser = getStationUser();
        result = result * 59 + (($stationUser == null) ? 43 : $stationUser.hashCode());
        Object $orderRemark = getOrderRemark();
        result = result * 59 + (($orderRemark == null) ? 43 : $orderRemark.hashCode());
        Object $prepareInfo = getPrepareInfo();
        return result * 59 + (($prepareInfo == null) ? 43 : $prepareInfo.hashCode());
    }

    public String toString() {
        return "PrepareYueJieVo(orderId=" + getOrderId() + ", openid=" + getOpenid() + ", out_trade_no=" + getOut_trade_no() + ", amount=" + getAmount() + ", wx_trade_no=" + getWx_trade_no() + ", userId=" + getUserId() + ", stationId=" + getStationId() + ", stationUser=" + getStationUser() + ", orderRemark=" + getOrderRemark() + ", prepareInfo=" + getPrepareInfo() + ")";
    }

    public String getOrderId() {
        /* 21 */
        return this.orderId;
    }

    public String getOpenid() {
        /* 23 */
        return this.openid;
    }

    public String getOut_trade_no() {
        /* 25 */
        return this.out_trade_no;
    }

    public BigDecimal getAmount() {
        /* 27 */
        return this.amount;
    }

    public String getWx_trade_no() {
        /* 29 */
        return this.wx_trade_no;
    }

    public String getUserId() {
        /* 31 */
        return this.userId;
    }

    public String getStationId() {
        /* 33 */
        return this.stationId;
    }

    public String getStationUser() {
        /* 35 */
        return this.stationUser;
    }

    public String getOrderRemark() {
        /* 37 */
        return this.orderRemark;
    }

    public String getPrepareInfo() {
        /* 39 */
        return this.prepareInfo;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\domain\PrepareYueJieVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */