package com.cms.buss_service.coupon.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class BussUserCoupon extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Excel(name = "会员pk")
    private String userPk;
    @Excel(name = "优惠卷pk")
    private String couponPk;
    @Excel(name = "是否使用")
    private String whetherToUse;
    @Excel(name = "乐观锁")
    private String revision;
    @Excel(name = "备用字段")
    private String no1;
    @Excel(name = "备用字段")
    private String no2;

    /*  14 */
    public void setId(Long id) {
        this.id = id;
    }

    @Excel(name = "备用字段")
    private String no3;
    @Excel(name = "备用字段")
    private String no4;
    @Excel(name = "备用字段")
    private String no5;
    private String couponType;
    private String title;
    private String money;
    private String threshold;
    private String startDate;
    private String endDate;

    public void setUserPk(String userPk) {
        this.userPk = userPk;
    }

    public void setCouponPk(String couponPk) {
        this.couponPk = couponPk;
    }

    public void setWhetherToUse(String whetherToUse) {
        this.whetherToUse = whetherToUse;
    }

    public void setRevision(String revision) {
        this.revision = revision;
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

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.coupon.domain.BussUserCoupon)) return false;
        com.cms.buss_service.coupon.domain.BussUserCoupon other = (com.cms.buss_service.coupon.domain.BussUserCoupon) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$userPk = getUserPk(), other$userPk = other.getUserPk();
        if ((this$userPk == null) ? (other$userPk != null) : !this$userPk.equals(other$userPk)) return false;
        Object this$couponPk = getCouponPk(), other$couponPk = other.getCouponPk();
        if ((this$couponPk == null) ? (other$couponPk != null) : !this$couponPk.equals(other$couponPk)) return false;
        Object this$whetherToUse = getWhetherToUse(), other$whetherToUse = other.getWhetherToUse();
        if ((this$whetherToUse == null) ? (other$whetherToUse != null) : !this$whetherToUse.equals(other$whetherToUse))
            return false;
        Object this$revision = getRevision(), other$revision = other.getRevision();
        if ((this$revision == null) ? (other$revision != null) : !this$revision.equals(other$revision)) return false;
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
        Object this$couponType = getCouponType(), other$couponType = other.getCouponType();
        if ((this$couponType == null) ? (other$couponType != null) : !this$couponType.equals(other$couponType))
            return false;
        Object this$title = getTitle(), other$title = other.getTitle();
        if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title)) return false;
        Object this$money = getMoney(), other$money = other.getMoney();
        if ((this$money == null) ? (other$money != null) : !this$money.equals(other$money)) return false;
        Object this$threshold = getThreshold(), other$threshold = other.getThreshold();
        if ((this$threshold == null) ? (other$threshold != null) : !this$threshold.equals(other$threshold))
            return false;
        Object this$startDate = getStartDate(), other$startDate = other.getStartDate();
        if ((this$startDate == null) ? (other$startDate != null) : !this$startDate.equals(other$startDate))
            return false;
        Object this$endDate = getEndDate(), other$endDate = other.getEndDate();
        return !((this$endDate == null) ? (other$endDate != null) : !this$endDate.equals(other$endDate));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.coupon.domain.BussUserCoupon;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $userPk = getUserPk();
        result = result * 59 + (($userPk == null) ? 43 : $userPk.hashCode());
        Object $couponPk = getCouponPk();
        result = result * 59 + (($couponPk == null) ? 43 : $couponPk.hashCode());
        Object $whetherToUse = getWhetherToUse();
        result = result * 59 + (($whetherToUse == null) ? 43 : $whetherToUse.hashCode());
        Object $revision = getRevision();
        result = result * 59 + (($revision == null) ? 43 : $revision.hashCode());
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
        Object $couponType = getCouponType();
        result = result * 59 + (($couponType == null) ? 43 : $couponType.hashCode());
        Object $title = getTitle();
        result = result * 59 + (($title == null) ? 43 : $title.hashCode());
        Object $money = getMoney();
        result = result * 59 + (($money == null) ? 43 : $money.hashCode());
        Object $threshold = getThreshold();
        result = result * 59 + (($threshold == null) ? 43 : $threshold.hashCode());
        Object $startDate = getStartDate();
        result = result * 59 + (($startDate == null) ? 43 : $startDate.hashCode());
        Object $endDate = getEndDate();
        return result * 59 + (($endDate == null) ? 43 : $endDate.hashCode());
    }
    @Override
    public String toString() {
        return "BussUserCoupon(id=" + getId() + ", userPk=" + getUserPk() + ", couponPk=" + getCouponPk() + ", whetherToUse=" + getWhetherToUse() + ", revision=" + getRevision() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", couponType=" + getCouponType() + ", title=" + getTitle() + ", money=" + getMoney() + ", threshold=" + getThreshold() + ", startDate=" + getStartDate() + ", endDate=" + getEndDate() + ")";
    }


    public Long getId() {
        /*  21 */
        return this.id;
    }


    public String getUserPk() {
        /*  27 */
        return this.userPk;
    }


    public String getCouponPk() {
        /*  33 */
        return this.couponPk;
    }


    public String getWhetherToUse() {
        /*  39 */
        return this.whetherToUse;
    }


    public String getRevision() {
        /*  45 */
        return this.revision;
    }


    public String getNo1() {
        /*  51 */
        return this.no1;
    }


    public String getNo2() {
        /*  57 */
        return this.no2;
    }


    public String getNo3() {
        /*  63 */
        return this.no3;
    }


    public String getNo4() {
        /*  69 */
        return this.no4;
    }


    public String getNo5() {
        /*  75 */
        return this.no5;
    }


    public String getCouponType() {
        /*  80 */
        return this.couponType;
    }


    public String getTitle() {
        /*  85 */
        return this.title;
    }


    public String getMoney() {
        /*  90 */
        return this.money;
    }


    public String getThreshold() {
        /*  95 */
        return this.threshold;
    }


    public String getStartDate() {
        /* 100 */
        return this.startDate;
    }


    public String getEndDate() {
        /* 105 */
        return this.endDate;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\domain\BussUserCoupon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */