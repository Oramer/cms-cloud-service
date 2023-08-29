package com.cms.buss_service.product.domain;

import java.math.BigDecimal;


public class BussProductInfoVo
        extends BussProductInfo {
    private String userPk;
    private BigDecimal adjustPrice;

    public void setUserPk(String userPk) {
        /* 15 */
        this.userPk = userPk;
    }

    public void setAdjustPrice(BigDecimal adjustPrice) {
        this.adjustPrice = adjustPrice;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BussProductInfoVo)) return false;
        BussProductInfoVo other = (BussProductInfoVo) o;
        if (!other.canEqual(this)) return false;
        Object this$userPk = getUserPk(), other$userPk = other.getUserPk();
        if ((this$userPk == null) ? (other$userPk != null) : !this$userPk.equals(other$userPk)) return false;
        Object this$adjustPrice = getAdjustPrice(), other$adjustPrice = other.getAdjustPrice();
        return !((this$adjustPrice == null) ? (other$adjustPrice != null) : !this$adjustPrice.equals(other$adjustPrice));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BussProductInfoVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $userPk = getUserPk();
        result = result * 59 + (($userPk == null) ? 43 : $userPk.hashCode());
        Object $adjustPrice = getAdjustPrice();
        return result * 59 + (($adjustPrice == null) ? 43 : $adjustPrice.hashCode());
    }

    public String toString() {
        return "BussProductInfoVo(userPk=" + getUserPk() + ", adjustPrice=" + getAdjustPrice() + ")";
    }

    public String getUserPk() {
        /* 18 */
        return this.userPk;
    }

    public BigDecimal getAdjustPrice() {
        /* 20 */
        return this.adjustPrice;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\domain\BussProductInfoVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */