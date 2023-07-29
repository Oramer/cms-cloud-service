package com.cms.buss_service.order.domain;

public class ProductInfoVo {
    private String pk;
    private String productName;
    private String productPrice;
    private String productUnit;
    private String productLabel;

    /*  5 */
    public void setPk(String pk) {
        this.pk = pk;
    }

    private String productAmount;
    private String no2;
    private String no1;
    private String brandName;
    private String brandPk;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public void setProductLabel(String productLabel) {
        this.productLabel = productLabel;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public void setNo1(String no1) {
        this.no1 = no1;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setBrandPk(String brandPk) {
        this.brandPk = brandPk;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.order.domain.ProductInfoVo)) return false;
        com.cms.buss_service.order.domain.ProductInfoVo other = (com.cms.buss_service.order.domain.ProductInfoVo) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$productName = getProductName(), other$productName = other.getProductName();
        if ((this$productName == null) ? (other$productName != null) : !this$productName.equals(other$productName))
            return false;
        Object this$productPrice = getProductPrice(), other$productPrice = other.getProductPrice();
        if ((this$productPrice == null) ? (other$productPrice != null) : !this$productPrice.equals(other$productPrice))
            return false;
        Object this$productUnit = getProductUnit(), other$productUnit = other.getProductUnit();
        if ((this$productUnit == null) ? (other$productUnit != null) : !this$productUnit.equals(other$productUnit))
            return false;
        Object this$productLabel = getProductLabel(), other$productLabel = other.getProductLabel();
        if ((this$productLabel == null) ? (other$productLabel != null) : !this$productLabel.equals(other$productLabel))
            return false;
        Object this$productAmount = getProductAmount(), other$productAmount = other.getProductAmount();
        if ((this$productAmount == null) ? (other$productAmount != null) : !this$productAmount.equals(other$productAmount))
            return false;
        Object this$no2 = getNo2(), other$no2 = other.getNo2();
        if ((this$no2 == null) ? (other$no2 != null) : !this$no2.equals(other$no2)) return false;
        Object this$no1 = getNo1(), other$no1 = other.getNo1();
        if ((this$no1 == null) ? (other$no1 != null) : !this$no1.equals(other$no1)) return false;
        Object this$brandName = getBrandName(), other$brandName = other.getBrandName();
        if ((this$brandName == null) ? (other$brandName != null) : !this$brandName.equals(other$brandName))
            return false;
        Object this$brandPk = getBrandPk(), other$brandPk = other.getBrandPk();
        return !((this$brandPk == null) ? (other$brandPk != null) : !this$brandPk.equals(other$brandPk));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.order.domain.ProductInfoVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $productName = getProductName();
        result = result * 59 + (($productName == null) ? 43 : $productName.hashCode());
        Object $productPrice = getProductPrice();
        result = result * 59 + (($productPrice == null) ? 43 : $productPrice.hashCode());
        Object $productUnit = getProductUnit();
        result = result * 59 + (($productUnit == null) ? 43 : $productUnit.hashCode());
        Object $productLabel = getProductLabel();
        result = result * 59 + (($productLabel == null) ? 43 : $productLabel.hashCode());
        Object $productAmount = getProductAmount();
        result = result * 59 + (($productAmount == null) ? 43 : $productAmount.hashCode());
        Object $no2 = getNo2();
        result = result * 59 + (($no2 == null) ? 43 : $no2.hashCode());
        Object $no1 = getNo1();
        result = result * 59 + (($no1 == null) ? 43 : $no1.hashCode());
        Object $brandName = getBrandName();
        result = result * 59 + (($brandName == null) ? 43 : $brandName.hashCode());
        Object $brandPk = getBrandPk();
        return result * 59 + (($brandPk == null) ? 43 : $brandPk.hashCode());
    }

    public String toString() {
        return "ProductInfoVo(pk=" + getPk() + ", productName=" + getProductName() + ", productPrice=" + getProductPrice() + ", productUnit=" + getProductUnit() + ", productLabel=" + getProductLabel() + ", productAmount=" + getProductAmount() + ", no2=" + getNo2() + ", no1=" + getNo1() + ", brandName=" + getBrandName() + ", brandPk=" + getBrandPk() + ")";
    }


    public String getPk() {
        /* 10 */
        return this.pk;
    }


    public String getProductName() {
        /* 15 */
        return this.productName;
    }


    public String getProductPrice() {
        /* 20 */
        return this.productPrice;
    }


    public String getProductUnit() {
        /* 25 */
        return this.productUnit;
    }


    public String getProductLabel() {
        /* 30 */
        return this.productLabel;
    }


    public String getProductAmount() {
        /* 35 */
        return this.productAmount;
    }


    public String getNo2() {
        /* 40 */
        return this.no2;
    }

    public String getNo1() {
        /* 44 */
        return this.no1;
    }

    public String getBrandName() {
        /* 48 */
        return this.brandName;
    }

    public String getBrandPk() {
        /* 51 */
        return this.brandPk;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\domain\ProductInfoVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */