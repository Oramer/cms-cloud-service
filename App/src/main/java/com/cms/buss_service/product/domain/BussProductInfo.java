package com.cms.buss_service.product.domain;

import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
import com.cms.buss_service.order.domain.BussOrderAppraise;
import com.cms.buss_service.ticket.domain.BussTicketInfo;

import java.math.BigDecimal;
import java.util.List;

public class BussProductInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long pk;
    private Long stationId;
    @Excel(name = "产品品牌")
    private Long productBrand;
    @Excel(name = "产品名称")
    private String productName;
    @Excel(name = "产品单位")
    private String productUnit;
    @Excel(name = "产品规格")
    private String productSpecs;
    @Excel(name = "产品类型")
    private Long productType;
    @Excel(name = "产品单价")
    private BigDecimal productPrice;
    @Excel(name = "产品标题")
    private String productTitle;
    @Excel(name = "产品描述")
    private String productDesc;
    @Excel(name = "产品主图")
    private String productMainImage;
    @Excel(name = "产品图文")
    private String productImage;
    @Excel(name = "产品标签")
    private String productTag;
    @Excel(name = "配送费用")
    private BigDecimal productDeliveryCost;
    @Excel(name = "乐观锁")
    private String reversion;
    @Excel(name = "是否压桶")
    private String no1;

    /*  19 */
    public void setPk(Long pk) {
        this.pk = pk;
    }

    @Excel(name = "压桶单价")
    private BigDecimal no2;
    @Excel(name = "产品状态")
    private String no3;
    private String no4;
    private String no5;
    private String no6;
    private String no7;
    private String no8;
    private String no9;
    private String no10;
    private String no11;
    private String no12;
    private String no13;
    private String no14;
    private String no15;
    private List<BussTicketInfo> tickets;
    private List<BussOrderAppraise> appraise;
    private BussProductBrand brand;

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public void setProductBrand(Long productBrand) {
        this.productBrand = productBrand;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public void setProductSpecs(String productSpecs) {
        this.productSpecs = productSpecs;
    }

    public void setProductType(Long productType) {
        this.productType = productType;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public void setProductMainImage(String productMainImage) {
        this.productMainImage = productMainImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public void setProductTag(String productTag) {
        this.productTag = productTag;
    }

    public void setProductDeliveryCost(BigDecimal productDeliveryCost) {
        this.productDeliveryCost = productDeliveryCost;
    }

    public void setReversion(String reversion) {
        this.reversion = reversion;
    }

    public void setNo1(String no1) {
        this.no1 = no1;
    }

    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    public void setNo3(String no3) {
        this.no3 = no3;
    }

    public void setNo4(String no4) {
        this.no4 = no4;
    }

    public void setNo5(String no5) {
        this.no5 = no5;
    }

    public void setNo6(String no6) {
        this.no6 = no6;
    }

    public void setNo7(String no7) {
        this.no7 = no7;
    }

    public void setNo8(String no8) {
        this.no8 = no8;
    }

    public void setNo9(String no9) {
        this.no9 = no9;
    }

    public void setNo10(String no10) {
        this.no10 = no10;
    }

    public void setNo11(String no11) {
        this.no11 = no11;
    }

    public void setNo12(String no12) {
        this.no12 = no12;
    }

    public void setNo13(String no13) {
        this.no13 = no13;
    }

    public void setNo14(String no14) {
        this.no14 = no14;
    }

    public void setNo15(String no15) {
        this.no15 = no15;
    }

    public void setTickets(List<BussTicketInfo> tickets) {
        this.tickets = tickets;
    }

    public void setAppraise(List<BussOrderAppraise> appraise) {
        this.appraise = appraise;
    }

    public void setBrand(BussProductBrand brand) {
        this.brand = brand;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BussProductInfo)) return false;
        BussProductInfo other = (BussProductInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$stationId = getStationId(), other$stationId = other.getStationId();
        if ((this$stationId == null) ? (other$stationId != null) : !this$stationId.equals(other$stationId))
            return false;
        Object this$productBrand = getProductBrand(), other$productBrand = other.getProductBrand();
        if ((this$productBrand == null) ? (other$productBrand != null) : !this$productBrand.equals(other$productBrand))
            return false;
        Object this$productName = getProductName(), other$productName = other.getProductName();
        if ((this$productName == null) ? (other$productName != null) : !this$productName.equals(other$productName))
            return false;
        Object this$productUnit = getProductUnit(), other$productUnit = other.getProductUnit();
        if ((this$productUnit == null) ? (other$productUnit != null) : !this$productUnit.equals(other$productUnit))
            return false;
        Object this$productSpecs = getProductSpecs(), other$productSpecs = other.getProductSpecs();
        if ((this$productSpecs == null) ? (other$productSpecs != null) : !this$productSpecs.equals(other$productSpecs))
            return false;
        Object this$productType = getProductType(), other$productType = other.getProductType();
        if ((this$productType == null) ? (other$productType != null) : !this$productType.equals(other$productType))
            return false;
        Object this$productPrice = getProductPrice(), other$productPrice = other.getProductPrice();
        if ((this$productPrice == null) ? (other$productPrice != null) : !this$productPrice.equals(other$productPrice))
            return false;
        Object this$productTitle = getProductTitle(), other$productTitle = other.getProductTitle();
        if ((this$productTitle == null) ? (other$productTitle != null) : !this$productTitle.equals(other$productTitle))
            return false;
        Object this$productDesc = getProductDesc(), other$productDesc = other.getProductDesc();
        if ((this$productDesc == null) ? (other$productDesc != null) : !this$productDesc.equals(other$productDesc))
            return false;
        Object this$productMainImage = getProductMainImage(), other$productMainImage = other.getProductMainImage();
        if ((this$productMainImage == null) ? (other$productMainImage != null) : !this$productMainImage.equals(other$productMainImage))
            return false;
        Object this$productImage = getProductImage(), other$productImage = other.getProductImage();
        if ((this$productImage == null) ? (other$productImage != null) : !this$productImage.equals(other$productImage))
            return false;
        Object this$productTag = getProductTag(), other$productTag = other.getProductTag();
        if ((this$productTag == null) ? (other$productTag != null) : !this$productTag.equals(other$productTag))
            return false;
        Object this$productDeliveryCost = getProductDeliveryCost(), other$productDeliveryCost = other.getProductDeliveryCost();
        if ((this$productDeliveryCost == null) ? (other$productDeliveryCost != null) : !this$productDeliveryCost.equals(other$productDeliveryCost))
            return false;
        Object this$reversion = getReversion(), other$reversion = other.getReversion();
        if ((this$reversion == null) ? (other$reversion != null) : !this$reversion.equals(other$reversion))
            return false;
        Object this$no1 = getNo1(), other$no1 = other.getNo1();
        if ((this$no1 == null) ? (other$no1 != null) : !this$no1.equals(other$no1)) return false;
        Object this$no2 = getNo2(), other$no2 = other.getNo2();
        if ((this$no2 == null) ? (other$no2 != null) : !this$no2.equals(other$no2)) return false;
        Object this$no3 = getNo3(), other$no3 = other.getNo3();
        if ((this$no3 == null) ? (other$no3 != null) : !this$no3.equals(other$no3)) return false;
        Object this$no4 = getNo4(), other$no4 = other.getNo4();
        if ((this$no4 == null) ? (other$no4 != null) : !this$no4.equals(other$no4)) return false;
        Object this$no5 = getNo5(), other$no5 = other.getNo5();
        if ((this$no5 == null) ? (other$no5 != null) : !this$no5.equals(other$no5)) return false;
        Object this$no6 = getNo6(), other$no6 = other.getNo6();
        if ((this$no6 == null) ? (other$no6 != null) : !this$no6.equals(other$no6)) return false;
        Object this$no7 = getNo7(), other$no7 = other.getNo7();
        if ((this$no7 == null) ? (other$no7 != null) : !this$no7.equals(other$no7)) return false;
        Object this$no8 = getNo8(), other$no8 = other.getNo8();
        if ((this$no8 == null) ? (other$no8 != null) : !this$no8.equals(other$no8)) return false;
        Object this$no9 = getNo9(), other$no9 = other.getNo9();
        if ((this$no9 == null) ? (other$no9 != null) : !this$no9.equals(other$no9)) return false;
        Object this$no10 = getNo10(), other$no10 = other.getNo10();
        if ((this$no10 == null) ? (other$no10 != null) : !this$no10.equals(other$no10)) return false;
        Object this$no11 = getNo11(), other$no11 = other.getNo11();
        if ((this$no11 == null) ? (other$no11 != null) : !this$no11.equals(other$no11)) return false;
        Object this$no12 = getNo12(), other$no12 = other.getNo12();
        if ((this$no12 == null) ? (other$no12 != null) : !this$no12.equals(other$no12)) return false;
        Object this$no13 = getNo13(), other$no13 = other.getNo13();
        if ((this$no13 == null) ? (other$no13 != null) : !this$no13.equals(other$no13)) return false;
        Object this$no14 = getNo14(), other$no14 = other.getNo14();
        if ((this$no14 == null) ? (other$no14 != null) : !this$no14.equals(other$no14)) return false;
        Object this$no15 = getNo15(), other$no15 = other.getNo15();
        if ((this$no15 == null) ? (other$no15 != null) : !this$no15.equals(other$no15)) return false;
        Object this$tickets =  getTickets(), other$tickets =  other.getTickets();
        if ((this$tickets == null) ? (other$tickets != null) : !this$tickets.equals(other$tickets)) return false;
        Object this$appraise =  getAppraise(), other$appraise =  other.getAppraise();
        if ((this$appraise == null) ? (other$appraise != null) : !this$appraise.equals(other$appraise)) return false;
        Object this$brand = getBrand(), other$brand = other.getBrand();
        return !((this$brand == null) ? (other$brand != null) : !this$brand.equals(other$brand));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BussProductInfo;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $stationId = getStationId();
        result = result * 59 + (($stationId == null) ? 43 : $stationId.hashCode());
        Object $productBrand = getProductBrand();
        result = result * 59 + (($productBrand == null) ? 43 : $productBrand.hashCode());
        Object $productName = getProductName();
        result = result * 59 + (($productName == null) ? 43 : $productName.hashCode());
        Object $productUnit = getProductUnit();
        result = result * 59 + (($productUnit == null) ? 43 : $productUnit.hashCode());
        Object $productSpecs = getProductSpecs();
        result = result * 59 + (($productSpecs == null) ? 43 : $productSpecs.hashCode());
        Object $productType = getProductType();
        result = result * 59 + (($productType == null) ? 43 : $productType.hashCode());
        Object $productPrice = getProductPrice();
        result = result * 59 + (($productPrice == null) ? 43 : $productPrice.hashCode());
        Object $productTitle = getProductTitle();
        result = result * 59 + (($productTitle == null) ? 43 : $productTitle.hashCode());
        Object $productDesc = getProductDesc();
        result = result * 59 + (($productDesc == null) ? 43 : $productDesc.hashCode());
        Object $productMainImage = getProductMainImage();
        result = result * 59 + (($productMainImage == null) ? 43 : $productMainImage.hashCode());
        Object $productImage = getProductImage();
        result = result * 59 + (($productImage == null) ? 43 : $productImage.hashCode());
        Object $productTag = getProductTag();
        result = result * 59 + (($productTag == null) ? 43 : $productTag.hashCode());
        Object $productDeliveryCost = getProductDeliveryCost();
        result = result * 59 + (($productDeliveryCost == null) ? 43 : $productDeliveryCost.hashCode());
        Object $reversion = getReversion();
        result = result * 59 + (($reversion == null) ? 43 : $reversion.hashCode());
        Object $no1 = getNo1();
        result = result * 59 + (($no1 == null) ? 43 : $no1.hashCode());
        Object $no2 = getNo2();
        result = result * 59 + (($no2 == null) ? 43 : $no2.hashCode());
        Object $no3 = getNo3();
        result = result * 59 + (($no3 == null) ? 43 : $no3.hashCode());
        Object $no4 = getNo4();
        result = result * 59 + (($no4 == null) ? 43 : $no4.hashCode());
        Object $no5 = getNo5();
        result = result * 59 + (($no5 == null) ? 43 : $no5.hashCode());
        Object $no6 = getNo6();
        result = result * 59 + (($no6 == null) ? 43 : $no6.hashCode());
        Object $no7 = getNo7();
        result = result * 59 + (($no7 == null) ? 43 : $no7.hashCode());
        Object $no8 = getNo8();
        result = result * 59 + (($no8 == null) ? 43 : $no8.hashCode());
        Object $no9 = getNo9();
        result = result * 59 + (($no9 == null) ? 43 : $no9.hashCode());
        Object $no10 = getNo10();
        result = result * 59 + (($no10 == null) ? 43 : $no10.hashCode());
        Object $no11 = getNo11();
        result = result * 59 + (($no11 == null) ? 43 : $no11.hashCode());
        Object $no12 = getNo12();
        result = result * 59 + (($no12 == null) ? 43 : $no12.hashCode());
        Object $no13 = getNo13();
        result = result * 59 + (($no13 == null) ? 43 : $no13.hashCode());
        Object $no14 = getNo14();
        result = result * 59 + (($no14 == null) ? 43 : $no14.hashCode());
        Object $no15 = getNo15();
        result = result * 59 + (($no15 == null) ? 43 : $no15.hashCode());
        Object $tickets =  getTickets();
        result = result * 59 + (($tickets == null) ? 43 : $tickets.hashCode());
        Object $appraise =  getAppraise();
        result = result * 59 + (($appraise == null) ? 43 : $appraise.hashCode());
        Object $brand = getBrand();
        return result * 59 + (($brand == null) ? 43 : $brand.hashCode());
    }

    @Override
    public String toString() {
        return "BussProductInfo(pk=" + getPk() + ", stationId=" + getStationId() + ", productBrand=" + getProductBrand() + ", productName=" + getProductName() + ", productUnit=" + getProductUnit() + ", productSpecs=" + getProductSpecs() + ", productType=" + getProductType() + ", productPrice=" + getProductPrice() + ", productTitle=" + getProductTitle() + ", productDesc=" + getProductDesc() + ", productMainImage=" + getProductMainImage() + ", productImage=" + getProductImage() + ", productTag=" + getProductTag() + ", productDeliveryCost=" + getProductDeliveryCost() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", no11=" + getNo11() + ", no12=" + getNo12() + ", no13=" + getNo13() + ", no14=" + getNo14() + ", no15=" + getNo15() + ", tickets=" + getTickets() + ", appraise=" + getAppraise() + ", brand=" + getBrand() + ")";
    }


    public Long getPk() {
        /*  26 */
        return this.pk;
    }

    public Long getStationId() {
        /*  28 */
        return this.stationId;
    }


    public Long getProductBrand() {
        /*  34 */
        return this.productBrand;
    }


    public String getProductName() {
        /*  40 */
        return this.productName;
    }


    public String getProductUnit() {
        /*  46 */
        return this.productUnit;
    }


    public String getProductSpecs() {
        /*  52 */
        return this.productSpecs;
    }


    public Long getProductType() {
        /*  58 */
        return this.productType;
    }


    public BigDecimal getProductPrice() {
        /*  64 */
        return this.productPrice;
    }


    public String getProductTitle() {
        /*  70 */
        return this.productTitle;
    }


    public String getProductDesc() {
        /*  76 */
        return this.productDesc;
    }


    public String getProductMainImage() {
        /*  82 */
        return this.productMainImage;
    }


    public String getProductImage() {
        /*  88 */
        return this.productImage;
    }


    public String getProductTag() {
        /*  94 */
        return this.productTag;
    }


    public BigDecimal getProductDeliveryCost() {
        /* 100 */
        return this.productDeliveryCost;
    }


    public String getReversion() {
        /* 106 */
        return this.reversion;
    }


    public String getNo1() {
        /* 112 */
        return this.no1;
    }


    public BigDecimal getNo2() {
        /* 118 */
        return this.no2;
    }


    public String getNo3() {
        /* 124 */
        return this.no3;
    }


    public String getNo4() {
        /* 129 */
        return this.no4;
    }


    public String getNo5() {
        /* 134 */
        return this.no5;
    }


    public String getNo6() {
        /* 139 */
        return this.no6;
    }


    public String getNo7() {
        /* 144 */
        return this.no7;
    }


    public String getNo8() {
        /* 149 */
        return this.no8;
    }


    public String getNo9() {
        /* 154 */
        return this.no9;
    }


    public String getNo10() {
        /* 159 */
        return this.no10;
    }


    public String getNo11() {
        /* 164 */
        return this.no11;
    }


    public String getNo12() {
        /* 169 */
        return this.no12;
    }


    public String getNo13() {
        /* 174 */
        return this.no13;
    }


    public String getNo14() {
        /* 179 */
        return this.no14;
    }


    public String getNo15() {
        /* 184 */
        return this.no15;
    }


    public List<BussTicketInfo> getTickets() {
        /* 189 */
        return this.tickets;
    }

    public List<BussOrderAppraise> getAppraise() {
        /* 193 */
        return this.appraise;
    }

    public BussProductBrand getBrand() {
        /* 197 */
        return this.brand;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\domain\BussProductInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */