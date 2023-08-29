package com.cms.buss_service.wxpay;


public class ProductVo {
    private String productPk;
    private String brandPk;
    private String pay_count;
    private String needyt;

    public void setProductPk(String productPk) {
        /* 12 */
        this.productPk = productPk;
    }

    public void setBrandPk(String brandPk) {
        this.brandPk = brandPk;
    }

    public void setPay_count(String pay_count) {
        this.pay_count = pay_count;
    }

    public void setNeedyt(String needyt) {
        this.needyt = needyt;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductVo)) return false;
        ProductVo other = (ProductVo) o;
        if (!other.canEqual(this)) return false;
        Object this$productPk = getProductPk(), other$productPk = other.getProductPk();
        if ((this$productPk == null) ? (other$productPk != null) : !this$productPk.equals(other$productPk))
            return false;
        Object this$brandPk = getBrandPk(), other$brandPk = other.getBrandPk();
        if ((this$brandPk == null) ? (other$brandPk != null) : !this$brandPk.equals(other$brandPk)) return false;
        Object this$pay_count = getPay_count(), other$pay_count = other.getPay_count();
        if ((this$pay_count == null) ? (other$pay_count != null) : !this$pay_count.equals(other$pay_count))
            return false;
        Object this$needyt = getNeedyt(), other$needyt = other.getNeedyt();
        return !((this$needyt == null) ? (other$needyt != null) : !this$needyt.equals(other$needyt));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $productPk = getProductPk();
        result = result * 59 + (($productPk == null) ? 43 : $productPk.hashCode());
        Object $brandPk = getBrandPk();
        result = result * 59 + (($brandPk == null) ? 43 : $brandPk.hashCode());
        Object $pay_count = getPay_count();
        result = result * 59 + (($pay_count == null) ? 43 : $pay_count.hashCode());
        Object $needyt = getNeedyt();
        return result * 59 + (($needyt == null) ? 43 : $needyt.hashCode());
    }

    public String toString() {
        return "ProductVo(productPk=" + getProductPk() + ", brandPk=" + getBrandPk() + ", pay_count=" + getPay_count() + ", needyt=" + getNeedyt() + ")";
    }

    public String getProductPk() {
        /* 15 */
        return this.productPk;
    }

    public String getBrandPk() {
        /* 17 */
        return this.brandPk;
    }

    public String getPay_count() {
        /* 19 */
        return this.pay_count;
    }

    public String getNeedyt() {
        /* 21 */
        return this.needyt;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\ProductVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */