package com.cms.buss_service.wxpay;

public class BucketVo {
    private String pk;
    private String orderPk;
    private String userPk;
    private String stationPk;

    /*  5 */
    public void setPk(String pk) {
        this.pk = pk;
    }

    private String productPk;
    private String brandName;
    private String bucketCount;
    private String bucketSinglePrice;
    private String no1;

    public void setOrderPk(String orderPk) {
        this.orderPk = orderPk;
    }

    public void setUserPk(String userPk) {
        this.userPk = userPk;
    }

    public void setStationPk(String stationPk) {
        this.stationPk = stationPk;
    }

    public void setProductPk(String productPk) {
        this.productPk = productPk;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setBucketCount(String bucketCount) {
        this.bucketCount = bucketCount;
    }

    public void setBucketSinglePrice(String bucketSinglePrice) {
        this.bucketSinglePrice = bucketSinglePrice;
    }

    public void setNo1(String no1) {
        this.no1 = no1;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BucketVo)) return false;
        BucketVo other = (BucketVo) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$orderPk = getOrderPk(), other$orderPk = other.getOrderPk();
        if ((this$orderPk == null) ? (other$orderPk != null) : !this$orderPk.equals(other$orderPk)) return false;
        Object this$userPk = getUserPk(), other$userPk = other.getUserPk();
        if ((this$userPk == null) ? (other$userPk != null) : !this$userPk.equals(other$userPk)) return false;
        Object this$stationPk = getStationPk(), other$stationPk = other.getStationPk();
        if ((this$stationPk == null) ? (other$stationPk != null) : !this$stationPk.equals(other$stationPk))
            return false;
        Object this$productPk = getProductPk(), other$productPk = other.getProductPk();
        if ((this$productPk == null) ? (other$productPk != null) : !this$productPk.equals(other$productPk))
            return false;
        Object this$brandName = getBrandName(), other$brandName = other.getBrandName();
        if ((this$brandName == null) ? (other$brandName != null) : !this$brandName.equals(other$brandName))
            return false;
        Object this$bucketCount = getBucketCount(), other$bucketCount = other.getBucketCount();
        if ((this$bucketCount == null) ? (other$bucketCount != null) : !this$bucketCount.equals(other$bucketCount))
            return false;
        Object this$bucketSinglePrice = getBucketSinglePrice(), other$bucketSinglePrice = other.getBucketSinglePrice();
        if ((this$bucketSinglePrice == null) ? (other$bucketSinglePrice != null) : !this$bucketSinglePrice.equals(other$bucketSinglePrice))
            return false;
        Object this$no1 = getNo1(), other$no1 = other.getNo1();
        return !((this$no1 == null) ? (other$no1 != null) : !this$no1.equals(other$no1));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BucketVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $orderPk = getOrderPk();
        result = result * 59 + (($orderPk == null) ? 43 : $orderPk.hashCode());
        Object $userPk = getUserPk();
        result = result * 59 + (($userPk == null) ? 43 : $userPk.hashCode());
        Object $stationPk = getStationPk();
        result = result * 59 + (($stationPk == null) ? 43 : $stationPk.hashCode());
        Object $productPk = getProductPk();
        result = result * 59 + (($productPk == null) ? 43 : $productPk.hashCode());
        Object $brandName = getBrandName();
        result = result * 59 + (($brandName == null) ? 43 : $brandName.hashCode());
        Object $bucketCount = getBucketCount();
        result = result * 59 + (($bucketCount == null) ? 43 : $bucketCount.hashCode());
        Object $bucketSinglePrice = getBucketSinglePrice();
        result = result * 59 + (($bucketSinglePrice == null) ? 43 : $bucketSinglePrice.hashCode());
        Object $no1 = getNo1();
        return result * 59 + (($no1 == null) ? 43 : $no1.hashCode());
    }

    public String toString() {
        return "BucketVo(pk=" + getPk() + ", orderPk=" + getOrderPk() + ", userPk=" + getUserPk() + ", stationPk=" + getStationPk() + ", productPk=" + getProductPk() + ", brandName=" + getBrandName() + ", bucketCount=" + getBucketCount() + ", bucketSinglePrice=" + getBucketSinglePrice() + ", no1=" + getNo1() + ")";
    }

    /*  7 */
    public String getPk() {
        return this.pk;
    }

    /*  8 */
    public String getOrderPk() {
        return this.orderPk;
    }

    /*  9 */
    public String getUserPk() {
        return this.userPk;
    }

    /* 10 */
    public String getStationPk() {
        return this.stationPk;
    }

    /* 11 */
    public String getProductPk() {
        return this.productPk;
    }

    /* 12 */
    public String getBrandName() {
        return this.brandName;
    }

    /* 13 */
    public String getBucketCount() {
        return this.bucketCount;
    }

    /* 14 */
    public String getBucketSinglePrice() {
        return this.bucketSinglePrice;
    }

    public String getNo1() {
        /* 15 */
        return this.no1;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\BucketVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */