package com.cms.buss_service.bucket.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.buss_service.poster.domain.BussStationPoster;
import com.cms.system_service.system.domain.SysUser;

import java.math.BigDecimal;

public class BucketVo extends BaseEntity {
    private Long pk;
    @Excel(name = "配送员信息")
    private String posterPk;
    @Excel(name = "订单信息")
    private String orderPk;
    @Excel(name = "归属用户")
    private String userPk;
    @Excel(name = "水站信息")
    private String stationPk;
    @Excel(name = "产品信息")
    private String productPk;
    @Excel(name = "品牌名称")
    private String brandName;
    @Excel(name = "桶数量")
    private String bucketCount;
    @Excel(name = "桶单价")
    private BigDecimal bucketSinglePrice;
    @Excel(name = "总价信息")
    private BigDecimal bucketTotalPrice;
    @Excel(name = "类型")
    private String opType;
    @Excel(name = "状态")
    private String status;
    @Excel(name = "乐观锁")
    private String reversion;
    @Excel(name = "支付标识")
    /*  15 */ private String no1;
    private String no2;

    public void setPk(Long pk) {
        this.pk = pk;
    }

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
    private SysUser user;
    private BussStationPoster poster;
    private Integer queryType;

    public void setPosterPk(String posterPk) {
        this.posterPk = posterPk;
    }

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

    public void setBucketSinglePrice(BigDecimal bucketSinglePrice) {
        this.bucketSinglePrice = bucketSinglePrice;
    }

    public void setBucketTotalPrice(BigDecimal bucketTotalPrice) {
        this.bucketTotalPrice = bucketTotalPrice;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReversion(String reversion) {
        this.reversion = reversion;
    }

    public void setNo1(String no1) {
        this.no1 = no1;
    }

    public void setNo2(String no2) {
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

    public void setUser(SysUser user) {
        this.user = user;
    }

    public void setPoster(BussStationPoster poster) {
        this.poster = poster;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BucketVo)) return false;
        BucketVo other = (BucketVo) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$posterPk = getPosterPk(), other$posterPk = other.getPosterPk();
        if ((this$posterPk == null) ? (other$posterPk != null) : !this$posterPk.equals(other$posterPk)) return false;
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
        Object this$bucketTotalPrice = getBucketTotalPrice(), other$bucketTotalPrice = other.getBucketTotalPrice();
        if ((this$bucketTotalPrice == null) ? (other$bucketTotalPrice != null) : !this$bucketTotalPrice.equals(other$bucketTotalPrice))
            return false;
        Object this$opType = getOpType(), other$opType = other.getOpType();
        if ((this$opType == null) ? (other$opType != null) : !this$opType.equals(other$opType)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
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
        Object this$user = getUser(), other$user = other.getUser();
        if ((this$user == null) ? (other$user != null) : !this$user.equals(other$user)) return false;
        Object this$poster = getPoster(), other$poster = other.getPoster();
        if ((this$poster == null) ? (other$poster != null) : !this$poster.equals(other$poster)) return false;
        Object this$queryType = getQueryType(), other$queryType = other.getQueryType();
        return !((this$queryType == null) ? (other$queryType != null) : !this$queryType.equals(other$queryType));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BucketVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $posterPk = getPosterPk();
        result = result * 59 + (($posterPk == null) ? 43 : $posterPk.hashCode());
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
        Object $bucketTotalPrice = getBucketTotalPrice();
        result = result * 59 + (($bucketTotalPrice == null) ? 43 : $bucketTotalPrice.hashCode());
        Object $opType = getOpType();
        result = result * 59 + (($opType == null) ? 43 : $opType.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
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
        Object $user = getUser();
        result = result * 59 + (($user == null) ? 43 : $user.hashCode());
        Object $poster = getPoster();
        result = result * 59 + (($poster == null) ? 43 : $poster.hashCode());
        Object $queryType = getQueryType();
        return result * 59 + (($queryType == null) ? 43 : $queryType.hashCode());
    }

    public String toString() {
        return "BucketVo(pk=" + getPk() + ", posterPk=" + getPosterPk() + ", orderPk=" + getOrderPk() + ", userPk=" + getUserPk() + ", stationPk=" + getStationPk() + ", productPk=" + getProductPk() + ", brandName=" + getBrandName() + ", bucketCount=" + getBucketCount() + ", bucketSinglePrice=" + getBucketSinglePrice() + ", bucketTotalPrice=" + getBucketTotalPrice() + ", opType=" + getOpType() + ", status=" + getStatus() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", no11=" + getNo11() + ", no12=" + getNo12() + ", no13=" + getNo13() + ", no14=" + getNo14() + ", no15=" + getNo15() + ", user=" + getUser() + ", poster=" + getPoster() + ", queryType=" + getQueryType() + ")";
    }


    public Long getPk() {
        /*  26 */
        return this.pk;
    }


    public String getPosterPk() {
        /*  31 */
        return this.posterPk;
    }


    public String getOrderPk() {
        /*  37 */
        return this.orderPk;
    }


    public String getUserPk() {
        /*  43 */
        return this.userPk;
    }


    public String getStationPk() {
        /*  49 */
        return this.stationPk;
    }


    public String getProductPk() {
        /*  55 */
        return this.productPk;
    }


    public String getBrandName() {
        /*  61 */
        return this.brandName;
    }


    public String getBucketCount() {
        /*  67 */
        return this.bucketCount;
    }


    public BigDecimal getBucketSinglePrice() {
        /*  73 */
        return this.bucketSinglePrice;
    }


    public BigDecimal getBucketTotalPrice() {
        /*  79 */
        return this.bucketTotalPrice;
    }


    public String getOpType() {
        /*  85 */
        return this.opType;
    }


    public String getStatus() {
        /*  91 */
        return this.status;
    }


    public String getReversion() {
        /*  97 */
        return this.reversion;
    }

    public String getNo1() {
        /* 100 */
        return this.no1;
    }

    public String getNo2() {
        /* 102 */
        return this.no2;
    }

    public String getNo3() {
        /* 104 */
        return this.no3;
    }

    public String getNo4() {
        /* 106 */
        return this.no4;
    }

    public String getNo5() {
        /* 108 */
        return this.no5;
    }

    public String getNo6() {
        /* 110 */
        return this.no6;
    }

    public String getNo7() {
        /* 112 */
        return this.no7;
    }

    public String getNo8() {
        /* 114 */
        return this.no8;
    }

    public String getNo9() {
        /* 116 */
        return this.no9;
    }

    public String getNo10() {
        /* 118 */
        return this.no10;
    }

    public String getNo11() {
        /* 120 */
        return this.no11;
    }

    public String getNo12() {
        /* 122 */
        return this.no12;
    }

    public String getNo13() {
        /* 124 */
        return this.no13;
    }

    public String getNo14() {
        /* 126 */
        return this.no14;
    }

    public String getNo15() {
        /* 128 */
        return this.no15;
    }

    public SysUser getUser() {
        /* 130 */
        return this.user;
    }

    public BussStationPoster getPoster() {
        /* 132 */
        return this.poster;
    }

    public Integer getQueryType() {
        /* 134 */
        return this.queryType;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\BucketVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */