package com.cms.buss_service.coupon.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class BussCoupon extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private String pk;
    @Excel(name = "用户范围")
    private String userRange;
    @Excel(name = "类型(无门槛；满减;领水券)")
    private String couponType;
    @Excel(name = "名称")
    private String title;
    @Excel(name = "金额")
    private String money;
    @Excel(name = "满足门槛")
    private String threshold;
    @Excel(name = "开始有效期")
    private String startDate;
    @Excel(name = "结束有效期")
    private String endDate;
    @Excel(name = "是否有效")
    private String validOrNot;
    @Excel(name = "数量")
    private String quantity;
    @Excel(name = "可使用商品")
    private String scopeOfUses;
    @Excel(name = "乐观锁")
    private String revision;
    @Excel(name = "备用字段")
    private String no1;
    @Excel(name = "备用字段")
    private String no2;
    @Excel(name = "备用字段")
    /*  14 */ private String no3;

    public void setPk(String pk) {
        this.pk = pk;
    }

    @Excel(name = "备用字段")
    private String no4;
    @Excel(name = "备用字段")
    private String no5;
    @Excel(name = "备用字段")
    private String no6;
    @Excel(name = "备用字段")
    private String no7;
    @Excel(name = "备用字段")
    private String no8;
    @Excel(name = "备用字段")
    private String no9;
    @Excel(name = "备用字段")
    private String no10;
    @Excel(name = "备用字段")
    private String no11;
    @Excel(name = "备用字段")
    private String no12;
    @Excel(name = "备用字段")
    private String no13;
    @Excel(name = "备用字段")
    private String no14;
    @Excel(name = "备用字段")
    private String no15;
    @Excel(name = "备用字段")
    private String no16;
    @Excel(name = "备用字段")
    private String no17;
    @Excel(name = "备用字段")
    private String no18;
    @Excel(name = "备用字段")
    private String no19;
    @Excel(name = "备用字段")
    private String no20;

    public void setUserRange(String userRange) {
        this.userRange = userRange;
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

    public void setValidOrNot(String validOrNot) {
        this.validOrNot = validOrNot;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setScopeOfUses(String scopeOfUses) {
        this.scopeOfUses = scopeOfUses;
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

    public void setNo16(String no16) {
        this.no16 = no16;
    }

    public void setNo17(String no17) {
        this.no17 = no17;
    }

    public void setNo18(String no18) {
        this.no18 = no18;
    }

    public void setNo19(String no19) {
        this.no19 = no19;
    }

    public void setNo20(String no20) {
        this.no20 = no20;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BussCoupon)) return false;
        BussCoupon other = (BussCoupon) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$userRange = getUserRange(), other$userRange = other.getUserRange();
        if ((this$userRange == null) ? (other$userRange != null) : !this$userRange.equals(other$userRange))
            return false;
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
        if ((this$endDate == null) ? (other$endDate != null) : !this$endDate.equals(other$endDate)) return false;
        Object this$validOrNot = getValidOrNot(), other$validOrNot = other.getValidOrNot();
        if ((this$validOrNot == null) ? (other$validOrNot != null) : !this$validOrNot.equals(other$validOrNot))
            return false;
        Object this$quantity = getQuantity(), other$quantity = other.getQuantity();
        if ((this$quantity == null) ? (other$quantity != null) : !this$quantity.equals(other$quantity)) return false;
        Object this$scopeOfUses = getScopeOfUses(), other$scopeOfUses = other.getScopeOfUses();
        if ((this$scopeOfUses == null) ? (other$scopeOfUses != null) : !this$scopeOfUses.equals(other$scopeOfUses))
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
        Object this$no16 = getNo16(), other$no16 = other.getNo16();
        if ((this$no16 == null) ? (other$no16 != null) : !this$no16.equals(other$no16)) return false;
        Object this$no17 = getNo17(), other$no17 = other.getNo17();
        if ((this$no17 == null) ? (other$no17 != null) : !this$no17.equals(other$no17)) return false;
        Object this$no18 = getNo18(), other$no18 = other.getNo18();
        if ((this$no18 == null) ? (other$no18 != null) : !this$no18.equals(other$no18)) return false;
        Object this$no19 = getNo19(), other$no19 = other.getNo19();
        if ((this$no19 == null) ? (other$no19 != null) : !this$no19.equals(other$no19)) return false;
        Object this$no20 = getNo20(), other$no20 = other.getNo20();
        return !((this$no20 == null) ? (other$no20 != null) : !this$no20.equals(other$no20));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof BussCoupon;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $userRange = getUserRange();
        result = result * 59 + (($userRange == null) ? 43 : $userRange.hashCode());
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
        result = result * 59 + (($endDate == null) ? 43 : $endDate.hashCode());
        Object $validOrNot = getValidOrNot();
        result = result * 59 + (($validOrNot == null) ? 43 : $validOrNot.hashCode());
        Object $quantity = getQuantity();
        result = result * 59 + (($quantity == null) ? 43 : $quantity.hashCode());
        Object $scopeOfUses = getScopeOfUses();
        result = result * 59 + (($scopeOfUses == null) ? 43 : $scopeOfUses.hashCode());
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
        Object $no16 = getNo16();
        result = result * 59 + (($no16 == null) ? 43 : $no16.hashCode());
        Object $no17 = getNo17();
        result = result * 59 + (($no17 == null) ? 43 : $no17.hashCode());
        Object $no18 = getNo18();
        result = result * 59 + (($no18 == null) ? 43 : $no18.hashCode());
        Object $no19 = getNo19();
        result = result * 59 + (($no19 == null) ? 43 : $no19.hashCode());
        Object $no20 = getNo20();
        return result * 59 + (($no20 == null) ? 43 : $no20.hashCode());
    }
    @Override
    public String toString() {
        return "BussCoupon(pk=" + getPk() + ", userRange=" + getUserRange() + ", couponType=" + getCouponType() + ", title=" + getTitle() + ", money=" + getMoney() + ", threshold=" + getThreshold() + ", startDate=" + getStartDate() + ", endDate=" + getEndDate() + ", validOrNot=" + getValidOrNot() + ", quantity=" + getQuantity() + ", scopeOfUses=" + getScopeOfUses() + ", revision=" + getRevision() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", no11=" + getNo11() + ", no12=" + getNo12() + ", no13=" + getNo13() + ", no14=" + getNo14() + ", no15=" + getNo15() + ", no16=" + getNo16() + ", no17=" + getNo17() + ", no18=" + getNo18() + ", no19=" + getNo19() + ", no20=" + getNo20() + ")";
    }


    public String getPk() {
        /*  21 */
        return this.pk;
    }


    public String getUserRange() {
        /*  27 */
        return this.userRange;
    }


    public String getCouponType() {
        /*  33 */
        return this.couponType;
    }


    public String getTitle() {
        /*  39 */
        return this.title;
    }


    public String getMoney() {
        /*  45 */
        return this.money;
    }


    public String getThreshold() {
        /*  51 */
        return this.threshold;
    }


    public String getStartDate() {
        /*  57 */
        return this.startDate;
    }


    public String getEndDate() {
        /*  63 */
        return this.endDate;
    }


    public String getValidOrNot() {
        /*  69 */
        return this.validOrNot;
    }


    public String getQuantity() {
        /*  75 */
        return this.quantity;
    }


    public String getScopeOfUses() {
        /*  81 */
        return this.scopeOfUses;
    }


    public String getRevision() {
        /*  87 */
        return this.revision;
    }


    public String getNo1() {
        /*  93 */
        return this.no1;
    }


    public String getNo2() {
        /*  99 */
        return this.no2;
    }


    public String getNo3() {
        /* 105 */
        return this.no3;
    }


    public String getNo4() {
        /* 111 */
        return this.no4;
    }


    public String getNo5() {
        /* 117 */
        return this.no5;
    }


    public String getNo6() {
        /* 123 */
        return this.no6;
    }


    public String getNo7() {
        /* 129 */
        return this.no7;
    }


    public String getNo8() {
        /* 135 */
        return this.no8;
    }


    public String getNo9() {
        /* 141 */
        return this.no9;
    }


    public String getNo10() {
        /* 147 */
        return this.no10;
    }


    public String getNo11() {
        /* 153 */
        return this.no11;
    }


    public String getNo12() {
        /* 159 */
        return this.no12;
    }


    public String getNo13() {
        /* 165 */
        return this.no13;
    }


    public String getNo14() {
        /* 171 */
        return this.no14;
    }


    public String getNo15() {
        /* 177 */
        return this.no15;
    }


    public String getNo16() {
        /* 183 */
        return this.no16;
    }


    public String getNo17() {
        /* 189 */
        return this.no17;
    }


    public String getNo18() {
        /* 195 */
        return this.no18;
    }


    public String getNo19() {
        /* 201 */
        return this.no19;
    }


    public String getNo20() {
        /* 207 */
        return this.no20;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\domain\BussCoupon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */