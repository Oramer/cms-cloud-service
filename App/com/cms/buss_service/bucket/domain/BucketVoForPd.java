package com.cms.buss_service.bucket.domain;

import java.util.List;

public class BucketVoForPd {
    List<BussBucketBackRecord> bvo;
    Integer ytValue;
    String ytBrandName;
    String ytPk;

    /*  7 */
    public void setBvo(List<BussBucketBackRecord> bvo) {
        this.bvo = bvo;
    }

    String orderId;
    Integer ytCount;
    Integer qtCount;
    List<HytProductVo> products;

    public void setYtValue(Integer ytValue) {
        this.ytValue = ytValue;
    }

    public void setYtBrandName(String ytBrandName) {
        this.ytBrandName = ytBrandName;
    }

    public void setYtPk(String ytPk) {
        this.ytPk = ytPk;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setYtCount(Integer ytCount) {
        this.ytCount = ytCount;
    }

    public void setQtCount(Integer qtCount) {
        this.qtCount = qtCount;
    }

    public void setProducts(List<HytProductVo> products) {
        this.products = products;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.bucket.domain.BucketVoForPd)) return false;
        com.cms.buss_service.bucket.domain.BucketVoForPd other = (com.cms.buss_service.bucket.domain.BucketVoForPd) o;
        if (!other.canEqual(this)) return false;
        Object this$bvo =  getBvo(), other$bvo =  other.getBvo();
        if ((this$bvo == null) ? (other$bvo != null) : !this$bvo.equals(other$bvo)) return false;
        Object this$ytValue = getYtValue(), other$ytValue = other.getYtValue();
        if ((this$ytValue == null) ? (other$ytValue != null) : !this$ytValue.equals(other$ytValue)) return false;
        Object this$ytBrandName = getYtBrandName(), other$ytBrandName = other.getYtBrandName();
        if ((this$ytBrandName == null) ? (other$ytBrandName != null) : !this$ytBrandName.equals(other$ytBrandName))
            return false;
        Object this$ytPk = getYtPk(), other$ytPk = other.getYtPk();
        if ((this$ytPk == null) ? (other$ytPk != null) : !this$ytPk.equals(other$ytPk)) return false;
        Object this$orderId = getOrderId(), other$orderId = other.getOrderId();
        if ((this$orderId == null) ? (other$orderId != null) : !this$orderId.equals(other$orderId)) return false;
        Object this$ytCount = getYtCount(), other$ytCount = other.getYtCount();
        if ((this$ytCount == null) ? (other$ytCount != null) : !this$ytCount.equals(other$ytCount)) return false;
        Object this$qtCount = getQtCount(), other$qtCount = other.getQtCount();
        if ((this$qtCount == null) ? (other$qtCount != null) : !this$qtCount.equals(other$qtCount)) return false;
        Object this$products =  getProducts(), other$products =  other.getProducts();
        return !((this$products == null) ? (other$products != null) : !this$products.equals(other$products));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.bucket.domain.BucketVoForPd;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $bvo =  getBvo();
        result = result * 59 + (($bvo == null) ? 43 : $bvo.hashCode());
        Object $ytValue = getYtValue();
        result = result * 59 + (($ytValue == null) ? 43 : $ytValue.hashCode());
        Object $ytBrandName = getYtBrandName();
        result = result * 59 + (($ytBrandName == null) ? 43 : $ytBrandName.hashCode());
        Object $ytPk = getYtPk();
        result = result * 59 + (($ytPk == null) ? 43 : $ytPk.hashCode());
        Object $orderId = getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        Object $ytCount = getYtCount();
        result = result * 59 + (($ytCount == null) ? 43 : $ytCount.hashCode());
        Object $qtCount = getQtCount();
        result = result * 59 + (($qtCount == null) ? 43 : $qtCount.hashCode());
        Object $products =  getProducts();
        return result * 59 + (($products == null) ? 43 : $products.hashCode());
    }
    @Override
    public String toString() {
        return "BucketVoForPd(bvo=" + getBvo() + ", ytValue=" + getYtValue() + ", ytBrandName=" + getYtBrandName() + ", ytPk=" + getYtPk() + ", orderId=" + getOrderId() + ", ytCount=" + getYtCount() + ", qtCount=" + getQtCount() + ", products=" + getProducts() + ")";
    }

    public List<BussBucketBackRecord> getBvo() {
        /* 10 */
        return this.bvo;
    }

    public Integer getYtValue() {
        /* 12 */
        return this.ytValue;
    }

    public String getYtBrandName() {
        /* 14 */
        return this.ytBrandName;
    }

    public String getYtPk() {
        /* 16 */
        return this.ytPk;
    }

    public String getOrderId() {
        /* 18 */
        return this.orderId;
    }

    public Integer getYtCount() {
        /* 20 */
        return this.ytCount;
    }

    public Integer getQtCount() {
        /* 22 */
        return this.qtCount;
    }

    public List<HytProductVo> getProducts() {
        /* 24 */
        return this.products;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\BucketVoForPd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */