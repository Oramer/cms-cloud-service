package com.cms.buss_service.order.domain;

public class ProductVo {
    private String productPk;
    private Integer chosecount;

    /*  5 */
    public void setProductPk(String productPk) {
        this.productPk = productPk;
    }

    public void setChosecount(Integer chosecount) {
        this.chosecount = chosecount;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.order.domain.ProductVo)) return false;
        com.cms.buss_service.order.domain.ProductVo other = (com.cms.buss_service.order.domain.ProductVo) o;
        if (!other.canEqual(this)) return false;
        Object this$productPk = getProductPk(), other$productPk = other.getProductPk();
        if ((this$productPk == null) ? (other$productPk != null) : !this$productPk.equals(other$productPk))
            return false;
        Object this$chosecount = getChosecount(), other$chosecount = other.getChosecount();
        return !((this$chosecount == null) ? (other$chosecount != null) : !this$chosecount.equals(other$chosecount));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.order.domain.ProductVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $productPk = getProductPk();
        result = result * 59 + (($productPk == null) ? 43 : $productPk.hashCode());
        Object $chosecount = getChosecount();
        return result * 59 + (($chosecount == null) ? 43 : $chosecount.hashCode());
    }

    public String toString() {
        return "ProductVo(productPk=" + getProductPk() + ", chosecount=" + getChosecount() + ")";
    }


    public String getProductPk() {
        /* 10 */
        return this.productPk;
    }

    public Integer getChosecount() {
        /* 14 */
        return this.chosecount;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\domain\ProductVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */