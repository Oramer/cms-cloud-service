package com.cms.buss_service.wxpay;

import com.cms.buss_service.bucket.domain.BussBucketDetails;
import com.cms.buss_service.coupon.domain.BussCoupon;
import com.cms.buss_service.order.domain.BussReceiverMessage;
import com.cms.buss_service.ticket.domain.BussTicketInfo;
import com.cms.buss_service.ticket.domain.BussUserTicketInfo;

import java.math.BigDecimal;
import java.util.List;

public class PrepareVo {
    private String openid;
    private List<ProductVo> vo;
    private List<BussBucketDetails> bvo;
    private List<BussUserTicketInfo> tvos;
    private BussTicketInfo tvo;
    private BussReceiverMessage address;
    private BussCoupon conpon;
    private String orderAddressId;
    private String out_trade_no;
    private BigDecimal amount;
    private BigDecimal psFree;
    private String memberPk;
    private String couponInfoId;
    private String prepareInfo;

    /* 19 */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    private String orderType;
    private String wx_trade_no;
    private BigDecimal plFree;
    private String userId;
    private String stationId;
    private String stationUser;
    private String orderRemark;
    private Boolean choseYt;
    private BigDecimal ytFree;
    private BigDecimal yhFree;
    private BigDecimal cbFree;
    private String ytOrderPk;
    private BigDecimal varifyFree;
    private BigDecimal totalJs;

    public void setVo(List<ProductVo> vo) {
        this.vo = vo;
    }

    public void setBvo(List<BussBucketDetails> bvo) {
        this.bvo = bvo;
    }

    public void setTvos(List<BussUserTicketInfo> tvos) {
        this.tvos = tvos;
    }

    public void setTvo(BussTicketInfo tvo) {
        this.tvo = tvo;
    }

    public void setAddress(BussReceiverMessage address) {
        this.address = address;
    }

    public void setConpon(BussCoupon conpon) {
        this.conpon = conpon;
    }

    public void setOrderAddressId(String orderAddressId) {
        this.orderAddressId = orderAddressId;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setPsFree(BigDecimal psFree) {
        this.psFree = psFree;
    }

    public void setMemberPk(String memberPk) {
        this.memberPk = memberPk;
    }

    public void setCouponInfoId(String couponInfoId) {
        this.couponInfoId = couponInfoId;
    }

    public void setPrepareInfo(String prepareInfo) {
        this.prepareInfo = prepareInfo;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setWx_trade_no(String wx_trade_no) {
        this.wx_trade_no = wx_trade_no;
    }

    public void setPlFree(BigDecimal plFree) {
        this.plFree = plFree;
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

    public void setChoseYt(Boolean choseYt) {
        this.choseYt = choseYt;
    }

    public void setYtFree(BigDecimal ytFree) {
        this.ytFree = ytFree;
    }

    public void setYhFree(BigDecimal yhFree) {
        this.yhFree = yhFree;
    }

    public void setCbFree(BigDecimal cbFree) {
        this.cbFree = cbFree;
    }

    public void setYtOrderPk(String ytOrderPk) {
        this.ytOrderPk = ytOrderPk;
    }

    public void setVarifyFree(BigDecimal varifyFree) {
        this.varifyFree = varifyFree;
    }

    public void setTotalJs(BigDecimal totalJs) {
        this.totalJs = totalJs;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PrepareVo)) return false;
        PrepareVo other = (PrepareVo) o;
        if (!other.canEqual(this)) return false;
        Object this$openid = getOpenid(), other$openid = other.getOpenid();
        if ((this$openid == null) ? (other$openid != null) : !this$openid.equals(other$openid)) return false;
        Object this$vo =  getVo(), other$vo =  other.getVo();
        if ((this$vo == null) ? (other$vo != null) : !this$vo.equals(other$vo)) return false;
        Object this$bvo =  getBvo(), other$bvo =  other.getBvo();
        if ((this$bvo == null) ? (other$bvo != null) : !this$bvo.equals(other$bvo)) return false;
        Object this$tvos =  getTvos(), other$tvos =  other.getTvos();
        if ((this$tvos == null) ? (other$tvos != null) : !this$tvos.equals(other$tvos)) return false;
        Object this$tvo = getTvo(), other$tvo = other.getTvo();
        if ((this$tvo == null) ? (other$tvo != null) : !this$tvo.equals(other$tvo)) return false;
        Object this$address = getAddress(), other$address = other.getAddress();
        if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address)) return false;
        Object this$conpon = getConpon(), other$conpon = other.getConpon();
        if ((this$conpon == null) ? (other$conpon != null) : !this$conpon.equals(other$conpon)) return false;
        Object this$orderAddressId = getOrderAddressId(), other$orderAddressId = other.getOrderAddressId();
        if ((this$orderAddressId == null) ? (other$orderAddressId != null) : !this$orderAddressId.equals(other$orderAddressId))
            return false;
        Object this$out_trade_no = getOut_trade_no(), other$out_trade_no = other.getOut_trade_no();
        if ((this$out_trade_no == null) ? (other$out_trade_no != null) : !this$out_trade_no.equals(other$out_trade_no))
            return false;
        Object this$amount = getAmount(), other$amount = other.getAmount();
        if ((this$amount == null) ? (other$amount != null) : !this$amount.equals(other$amount)) return false;
        Object this$psFree = getPsFree(), other$psFree = other.getPsFree();
        if ((this$psFree == null) ? (other$psFree != null) : !this$psFree.equals(other$psFree)) return false;
        Object this$memberPk = getMemberPk(), other$memberPk = other.getMemberPk();
        if ((this$memberPk == null) ? (other$memberPk != null) : !this$memberPk.equals(other$memberPk)) return false;
        Object this$couponInfoId = getCouponInfoId(), other$couponInfoId = other.getCouponInfoId();
        if ((this$couponInfoId == null) ? (other$couponInfoId != null) : !this$couponInfoId.equals(other$couponInfoId))
            return false;
        Object this$prepareInfo = getPrepareInfo(), other$prepareInfo = other.getPrepareInfo();
        if ((this$prepareInfo == null) ? (other$prepareInfo != null) : !this$prepareInfo.equals(other$prepareInfo))
            return false;
        Object this$orderType = getOrderType(), other$orderType = other.getOrderType();
        if ((this$orderType == null) ? (other$orderType != null) : !this$orderType.equals(other$orderType))
            return false;
        Object this$wx_trade_no = getWx_trade_no(), other$wx_trade_no = other.getWx_trade_no();
        if ((this$wx_trade_no == null) ? (other$wx_trade_no != null) : !this$wx_trade_no.equals(other$wx_trade_no))
            return false;
        Object this$plFree = getPlFree(), other$plFree = other.getPlFree();
        if ((this$plFree == null) ? (other$plFree != null) : !this$plFree.equals(other$plFree)) return false;
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
        Object this$choseYt = getChoseYt(), other$choseYt = other.getChoseYt();
        if ((this$choseYt == null) ? (other$choseYt != null) : !this$choseYt.equals(other$choseYt)) return false;
        Object this$ytFree = getYtFree(), other$ytFree = other.getYtFree();
        if ((this$ytFree == null) ? (other$ytFree != null) : !this$ytFree.equals(other$ytFree)) return false;
        Object this$yhFree = getYhFree(), other$yhFree = other.getYhFree();
        if ((this$yhFree == null) ? (other$yhFree != null) : !this$yhFree.equals(other$yhFree)) return false;
        Object this$cbFree = getCbFree(), other$cbFree = other.getCbFree();
        if ((this$cbFree == null) ? (other$cbFree != null) : !this$cbFree.equals(other$cbFree)) return false;
        Object this$ytOrderPk = getYtOrderPk(), other$ytOrderPk = other.getYtOrderPk();
        if ((this$ytOrderPk == null) ? (other$ytOrderPk != null) : !this$ytOrderPk.equals(other$ytOrderPk))
            return false;
        Object this$varifyFree = getVarifyFree(), other$varifyFree = other.getVarifyFree();
        if ((this$varifyFree == null) ? (other$varifyFree != null) : !this$varifyFree.equals(other$varifyFree))
            return false;
        Object this$totalJs = getTotalJs(), other$totalJs = other.getTotalJs();
        return !((this$totalJs == null) ? (other$totalJs != null) : !this$totalJs.equals(other$totalJs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PrepareVo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $openid = getOpenid();
        result = result * 59 + (($openid == null) ? 43 : $openid.hashCode());
        Object $vo =  getVo();
        result = result * 59 + (($vo == null) ? 43 : $vo.hashCode());
        Object $bvo =  getBvo();
        result = result * 59 + (($bvo == null) ? 43 : $bvo.hashCode());
        Object $tvos =  getTvos();
        result = result * 59 + (($tvos == null) ? 43 : $tvos.hashCode());
        Object $tvo = getTvo();
        result = result * 59 + (($tvo == null) ? 43 : $tvo.hashCode());
        Object $address = getAddress();
        result = result * 59 + (($address == null) ? 43 : $address.hashCode());
        Object $conpon = getConpon();
        result = result * 59 + (($conpon == null) ? 43 : $conpon.hashCode());
        Object $orderAddressId = getOrderAddressId();
        result = result * 59 + (($orderAddressId == null) ? 43 : $orderAddressId.hashCode());
        Object $out_trade_no = getOut_trade_no();
        result = result * 59 + (($out_trade_no == null) ? 43 : $out_trade_no.hashCode());
        Object $amount = getAmount();
        result = result * 59 + (($amount == null) ? 43 : $amount.hashCode());
        Object $psFree = getPsFree();
        result = result * 59 + (($psFree == null) ? 43 : $psFree.hashCode());
        Object $memberPk = getMemberPk();
        result = result * 59 + (($memberPk == null) ? 43 : $memberPk.hashCode());
        Object $couponInfoId = getCouponInfoId();
        result = result * 59 + (($couponInfoId == null) ? 43 : $couponInfoId.hashCode());
        Object $prepareInfo = getPrepareInfo();
        result = result * 59 + (($prepareInfo == null) ? 43 : $prepareInfo.hashCode());
        Object $orderType = getOrderType();
        result = result * 59 + (($orderType == null) ? 43 : $orderType.hashCode());
        Object $wx_trade_no = getWx_trade_no();
        result = result * 59 + (($wx_trade_no == null) ? 43 : $wx_trade_no.hashCode());
        Object $plFree = getPlFree();
        result = result * 59 + (($plFree == null) ? 43 : $plFree.hashCode());
        Object $userId = getUserId();
        result = result * 59 + (($userId == null) ? 43 : $userId.hashCode());
        Object $stationId = getStationId();
        result = result * 59 + (($stationId == null) ? 43 : $stationId.hashCode());
        Object $stationUser = getStationUser();
        result = result * 59 + (($stationUser == null) ? 43 : $stationUser.hashCode());
        Object $orderRemark = getOrderRemark();
        result = result * 59 + (($orderRemark == null) ? 43 : $orderRemark.hashCode());
        Object $choseYt = getChoseYt();
        result = result * 59 + (($choseYt == null) ? 43 : $choseYt.hashCode());
        Object $ytFree = getYtFree();
        result = result * 59 + (($ytFree == null) ? 43 : $ytFree.hashCode());
        Object $yhFree = getYhFree();
        result = result * 59 + (($yhFree == null) ? 43 : $yhFree.hashCode());
        Object $cbFree = getCbFree();
        result = result * 59 + (($cbFree == null) ? 43 : $cbFree.hashCode());
        Object $ytOrderPk = getYtOrderPk();
        result = result * 59 + (($ytOrderPk == null) ? 43 : $ytOrderPk.hashCode());
        Object $varifyFree = getVarifyFree();
        result = result * 59 + (($varifyFree == null) ? 43 : $varifyFree.hashCode());
        Object $totalJs = getTotalJs();
        return result * 59 + (($totalJs == null) ? 43 : $totalJs.hashCode());
    }
    @Override
    public String toString() {
        return "PrepareVo(openid=" + getOpenid() + ", vo=" + getVo() + ", bvo=" + getBvo() + ", tvos=" + getTvos() + ", tvo=" + getTvo() + ", address=" + getAddress() + ", conpon=" + getConpon() + ", orderAddressId=" + getOrderAddressId() + ", out_trade_no=" + getOut_trade_no() + ", amount=" + getAmount() + ", psFree=" + getPsFree() + ", memberPk=" + getMemberPk() + ", couponInfoId=" + getCouponInfoId() + ", prepareInfo=" + getPrepareInfo() + ", orderType=" + getOrderType() + ", wx_trade_no=" + getWx_trade_no() + ", plFree=" + getPlFree() + ", userId=" + getUserId() + ", stationId=" + getStationId() + ", stationUser=" + getStationUser() + ", orderRemark=" + getOrderRemark() + ", choseYt=" + getChoseYt() + ", ytFree=" + getYtFree() + ", yhFree=" + getYhFree() + ", cbFree=" + getCbFree() + ", ytOrderPk=" + getYtOrderPk() + ", varifyFree=" + getVarifyFree() + ", totalJs=" + getTotalJs() + ")";
    }

    public String getOpenid() {
        /* 22 */
        return this.openid;
    }

    public List<ProductVo> getVo() {
        /* 24 */
        return this.vo;
    }

    public List<BussBucketDetails> getBvo() {
        /* 26 */
        return this.bvo;
    }

    public List<BussUserTicketInfo> getTvos() {
        /* 28 */
        return this.tvos;
    }

    public BussTicketInfo getTvo() {
        /* 30 */
        return this.tvo;
    }

    public BussReceiverMessage getAddress() {
        /* 32 */
        return this.address;
    }

    public BussCoupon getConpon() {
        /* 34 */
        return this.conpon;
    }

    public String getOrderAddressId() {
        /* 36 */
        return this.orderAddressId;
    }

    public String getOut_trade_no() {
        /* 38 */
        return this.out_trade_no;
    }

    public BigDecimal getAmount() {
        /* 40 */
        return this.amount;
    }

    public BigDecimal getPsFree() {
        /* 42 */
        return this.psFree;
    }

    public String getMemberPk() {
        /* 44 */
        return this.memberPk;
    }

    public String getCouponInfoId() {
        /* 46 */
        return this.couponInfoId;
    }

    public String getPrepareInfo() {
        /* 48 */
        return this.prepareInfo;
    }

    public String getOrderType() {
        /* 50 */
        return this.orderType;
    }

    public String getWx_trade_no() {
        /* 52 */
        return this.wx_trade_no;
    }

    public BigDecimal getPlFree() {
        /* 54 */
        return this.plFree;
    }

    public String getUserId() {
        /* 56 */
        return this.userId;
    }

    public String getStationId() {
        /* 58 */
        return this.stationId;
    }

    public String getStationUser() {
        /* 60 */
        return this.stationUser;
    }

    public String getOrderRemark() {
        /* 62 */
        return this.orderRemark;
    }

    public Boolean getChoseYt() {
        /* 64 */
        return this.choseYt;
    }

    public BigDecimal getYtFree() {
        /* 67 */
        return this.ytFree;
    }

    /* 69 */
    public BigDecimal getYhFree() {
        return this.yhFree;
    }

    public BigDecimal getCbFree() {
        /* 70 */
        return this.cbFree;
    }

    public String getYtOrderPk() {
        /* 73 */
        return this.ytOrderPk;
    }

    public BigDecimal getVarifyFree() {
        /* 76 */
        return this.varifyFree;
    }

    public BigDecimal getTotalJs() {
        /* 78 */
        return this.totalJs;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\PrepareVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */