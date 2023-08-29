package com.cms.buss_service.wxpay;

public class WxReturnVo {
    private String timeStamp;
    private String out_trade_no;
    private String paySign;

    /*  5 */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    private String appId;
    private String signType;
    private String nonceStr;
    private String wx_trade_no;

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public void setWx_trade_no(String wx_trade_no) {
        this.wx_trade_no = wx_trade_no;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof WxReturnVo)) return false;
        WxReturnVo other = (WxReturnVo) o;
        if (!other.canEqual(this)) return false;
        Object this$timeStamp = getTimeStamp(), other$timeStamp = other.getTimeStamp();
        if ((this$timeStamp == null) ? (other$timeStamp != null) : !this$timeStamp.equals(other$timeStamp))
            return false;
        Object this$out_trade_no = getOut_trade_no(), other$out_trade_no = other.getOut_trade_no();
        if ((this$out_trade_no == null) ? (other$out_trade_no != null) : !this$out_trade_no.equals(other$out_trade_no))
            return false;
        Object this$paySign = getPaySign(), other$paySign = other.getPaySign();
        if ((this$paySign == null) ? (other$paySign != null) : !this$paySign.equals(other$paySign)) return false;
        Object this$appId = getAppId(), other$appId = other.getAppId();
        if ((this$appId == null) ? (other$appId != null) : !this$appId.equals(other$appId)) return false;
        Object this$signType = getSignType(), other$signType = other.getSignType();
        if ((this$signType == null) ? (other$signType != null) : !this$signType.equals(other$signType)) return false;
        Object this$nonceStr = getNonceStr(), other$nonceStr = other.getNonceStr();
        if ((this$nonceStr == null) ? (other$nonceStr != null) : !this$nonceStr.equals(other$nonceStr)) return false;
        Object this$wx_trade_no = getWx_trade_no(), other$wx_trade_no = other.getWx_trade_no();
        return !((this$wx_trade_no == null) ? (other$wx_trade_no != null) : !this$wx_trade_no.equals(other$wx_trade_no));
    }

    protected boolean canEqual(Object other) {
        return other instanceof WxReturnVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $timeStamp = getTimeStamp();
        result = result * 59 + (($timeStamp == null) ? 43 : $timeStamp.hashCode());
        Object $out_trade_no = getOut_trade_no();
        result = result * 59 + (($out_trade_no == null) ? 43 : $out_trade_no.hashCode());
        Object $paySign = getPaySign();
        result = result * 59 + (($paySign == null) ? 43 : $paySign.hashCode());
        Object $appId = getAppId();
        result = result * 59 + (($appId == null) ? 43 : $appId.hashCode());
        Object $signType = getSignType();
        result = result * 59 + (($signType == null) ? 43 : $signType.hashCode());
        Object $nonceStr = getNonceStr();
        result = result * 59 + (($nonceStr == null) ? 43 : $nonceStr.hashCode());
        Object $wx_trade_no = getWx_trade_no();
        return result * 59 + (($wx_trade_no == null) ? 43 : $wx_trade_no.hashCode());
    }

    public String toString() {
        return "WxReturnVo(timeStamp=" + getTimeStamp() + ", out_trade_no=" + getOut_trade_no() + ", paySign=" + getPaySign() + ", appId=" + getAppId() + ", signType=" + getSignType() + ", nonceStr=" + getNonceStr() + ", wx_trade_no=" + getWx_trade_no() + ")";
    }

    /*  7 */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    /*  8 */
    public String getOut_trade_no() {
        return this.out_trade_no;
    }

    /*  9 */
    public String getPaySign() {
        return this.paySign;
    }

    /* 10 */
    public String getAppId() {
        return this.appId;
    }

    /* 11 */
    public String getSignType() {
        return this.signType;
    }

    /* 12 */
    public String getNonceStr() {
        return this.nonceStr;
    }

    public String getWx_trade_no() {
        /* 13 */
        return this.wx_trade_no;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\WxReturnVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */