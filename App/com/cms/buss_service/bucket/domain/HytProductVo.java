package com.cms.buss_service.bucket.domain;

public class HytProductVo {
    private String brandName;
    private Integer bucketCount;
    private String no1;
    private String no2;
    private String no9;
    private String no10;

    /*  5 */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    private String pk;
    private String productAmount;
    private String productLabel;
    private String productName;
    private String productPrice;
    private String productUnit;
    private String brandPk;

    public void setBucketCount(Integer bucketCount) {
        this.bucketCount = bucketCount;
    }

    public void setNo1(String no1) {
        this.no1 = no1;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public void setNo9(String no9) {
        this.no9 = no9;
    }

    public void setNo10(String no10) {
        this.no10 = no10;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }

    public void setProductLabel(String productLabel) {
        this.productLabel = productLabel;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public void setBrandPk(String brandPk) {
        this.brandPk = brandPk;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.bucket.domain.HytProductVo)) return false;
        com.cms.buss_service.bucket.domain.HytProductVo other = (com.cms.buss_service.bucket.domain.HytProductVo) o;
        if (!other.canEqual(this)) return false;
        Object this$brandName = getBrandName(), other$brandName = other.getBrandName();
        if ((this$brandName == null) ? (other$brandName != null) : !this$brandName.equals(other$brandName))
            return false;
        Object this$bucketCount = getBucketCount(), other$bucketCount = other.getBucketCount();
        if ((this$bucketCount == null) ? (other$bucketCount != null) : !this$bucketCount.equals(other$bucketCount))
            return false;
        Object this$no1 = getNo1(), other$no1 = other.getNo1();
        if ((this$no1 == null) ? (other$no1 != null) : !this$no1.equals(other$no1)) return false;
        Object this$no2 = getNo2(), other$no2 = other.getNo2();
        if ((this$no2 == null) ? (other$no2 != null) : !this$no2.equals(other$no2)) return false;
        Object this$no9 = getNo9(), other$no9 = other.getNo9();
        if ((this$no9 == null) ? (other$no9 != null) : !this$no9.equals(other$no9)) return false;
        Object this$no10 = getNo10(), other$no10 = other.getNo10();
        if ((this$no10 == null) ? (other$no10 != null) : !this$no10.equals(other$no10)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$productAmount = getProductAmount(), other$productAmount = other.getProductAmount();
        if ((this$productAmount == null) ? (other$productAmount != null) : !this$productAmount.equals(other$productAmount))
            return false;
        Object this$productLabel = getProductLabel(), other$productLabel = other.getProductLabel();
        if ((this$productLabel == null) ? (other$productLabel != null) : !this$productLabel.equals(other$productLabel))
            return false;
        Object this$productName = getProductName(), other$productName = other.getProductName();
        if ((this$productName == null) ? (other$productName != null) : !this$productName.equals(other$productName))
            return false;
        Object this$productPrice = getProductPrice(), other$productPrice = other.getProductPrice();
        if ((this$productPrice == null) ? (other$productPrice != null) : !this$productPrice.equals(other$productPrice))
            return false;
        Object this$productUnit = getProductUnit(), other$productUnit = other.getProductUnit();
        if ((this$productUnit == null) ? (other$productUnit != null) : !this$productUnit.equals(other$productUnit))
            return false;
        Object this$brandPk = getBrandPk(), other$brandPk = other.getBrandPk();
        return !((this$brandPk == null) ? (other$brandPk != null) : !this$brandPk.equals(other$brandPk));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.bucket.domain.HytProductVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $brandName = getBrandName();
        result = result * 59 + (($brandName == null) ? 43 : $brandName.hashCode());
        Object $bucketCount = getBucketCount();
        result = result * 59 + (($bucketCount == null) ? 43 : $bucketCount.hashCode());
        Object $no1 = getNo1();
        result = result * 59 + (($no1 == null) ? 43 : $no1.hashCode());
        Object $no2 = getNo2();
        result = result * 59 + (($no2 == null) ? 43 : $no2.hashCode());
        Object $no9 = getNo9();
        result = result * 59 + (($no9 == null) ? 43 : $no9.hashCode());
        Object $no10 = getNo10();
        result = result * 59 + (($no10 == null) ? 43 : $no10.hashCode());
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $productAmount = getProductAmount();
        result = result * 59 + (($productAmount == null) ? 43 : $productAmount.hashCode());
        Object $productLabel = getProductLabel();
        result = result * 59 + (($productLabel == null) ? 43 : $productLabel.hashCode());
        Object $productName = getProductName();
        result = result * 59 + (($productName == null) ? 43 : $productName.hashCode());
        Object $productPrice = getProductPrice();
        result = result * 59 + (($productPrice == null) ? 43 : $productPrice.hashCode());
        Object $productUnit = getProductUnit();
        result = result * 59 + (($productUnit == null) ? 43 : $productUnit.hashCode());
        Object $brandPk = getBrandPk();
        return result * 59 + (($brandPk == null) ? 43 : $brandPk.hashCode());
    }

    public String toString() {
        return "HytProductVo(brandName=" + getBrandName() + ", bucketCount=" + getBucketCount() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", pk=" + getPk() + ", productAmount=" + getProductAmount() + ", productLabel=" + getProductLabel() + ", productName=" + getProductName() + ", productPrice=" + getProductPrice() + ", productUnit=" + getProductUnit() + ", brandPk=" + getBrandPk() + ")";
    }

    /*  7 */
    public String getBrandName() {
        return this.brandName;
    }

    /*  8 */
    public Integer getBucketCount() {
        return this.bucketCount;
    }

    /*  9 */
    public String getNo1() {
        return this.no1;
    }

    /* 10 */
    public String getNo2() {
        return this.no2;
    }

    /* 11 */
    public String getNo9() {
        return this.no9;
    }

    /* 12 */
    public String getNo10() {
        return this.no10;
    }

    /* 13 */
    public String getPk() {
        return this.pk;
    }

    /* 14 */
    public String getProductAmount() {
        return this.productAmount;
    }

    /* 15 */
    public String getProductLabel() {
        return this.productLabel;
    }

    /* 16 */
    public String getProductName() {
        return this.productName;
    }

    /* 17 */
    public String getProductPrice() {
        return this.productPrice;
    }

    /* 18 */
    public String getProductUnit() {
        return this.productUnit;
    }

    public String getBrandPk() {
        /* 19 */
        return this.brandPk;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\HytProductVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */