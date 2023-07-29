package com.cms.buss_service.yjuser.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.system_service.system.domain.SysUser;

public class BussMonthlyUser extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long stationId;
    @Excel(name = "公司名称")
    private String cname;
    @Excel(name = "市")
    private String city;
    @Excel(name = "省")
    private String province;
    @Excel(name = "县")
    private String county;
    @Excel(name = "详细地址")
    private String cdetails;
    @Excel(name = "发票类型")
    private String fpType;
    @Excel(name = "意向品牌")
    private String xqBrand;
    @Excel(name = "月需求量")
    private String yxqCount;
    @Excel(name = "单次送水量")
    private String dcCount;

    /*  14 */
    public void setId(Long id) {
        this.id = id;
    }

    @Excel(name = "备注")
    private String remarks;
    @Excel(name = "状态0申请中 1 已通过 2 已作废")
    private Long status;
    @Excel(name = "数量统计")
    private Long no1;
    @Excel(name = "数量统计")
    private String no2;
    @Excel(name = "数量统计")
    private String no3;
    @Excel(name = "数量统计")
    private String no4;
    @Excel(name = "数量统计")
    private String no5;
    @Excel(name = "数量统计")
    private String no6;
    @Excel(name = "数量统计")
    private String no7;
    @Excel(name = "数量统计")
    private String no8;
    @Excel(name = "数量统计")
    private String no9;
    @Excel(name = "数量统计")
    private String no10;
    SysUser user;

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setCdetails(String cdetails) {
        this.cdetails = cdetails;
    }

    public void setFpType(String fpType) {
        this.fpType = fpType;
    }

    public void setXqBrand(String xqBrand) {
        this.xqBrand = xqBrand;
    }

    public void setYxqCount(String yxqCount) {
        this.yxqCount = yxqCount;
    }

    public void setDcCount(String dcCount) {
        this.dcCount = dcCount;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setNo1(Long no1) {
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

    public void setUser(SysUser user) {
        this.user = user;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.yjuser.domain.BussMonthlyUser)) return false;
        com.cms.buss_service.yjuser.domain.BussMonthlyUser other = (com.cms.buss_service.yjuser.domain.BussMonthlyUser) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$stationId = getStationId(), other$stationId = other.getStationId();
        if ((this$stationId == null) ? (other$stationId != null) : !this$stationId.equals(other$stationId))
            return false;
        Object this$cname = getCname(), other$cname = other.getCname();
        if ((this$cname == null) ? (other$cname != null) : !this$cname.equals(other$cname)) return false;
        Object this$city = getCity(), other$city = other.getCity();
        if ((this$city == null) ? (other$city != null) : !this$city.equals(other$city)) return false;
        Object this$province = getProvince(), other$province = other.getProvince();
        if ((this$province == null) ? (other$province != null) : !this$province.equals(other$province)) return false;
        Object this$county = getCounty(), other$county = other.getCounty();
        if ((this$county == null) ? (other$county != null) : !this$county.equals(other$county)) return false;
        Object this$cdetails = getCdetails(), other$cdetails = other.getCdetails();
        if ((this$cdetails == null) ? (other$cdetails != null) : !this$cdetails.equals(other$cdetails)) return false;
        Object this$fpType = getFpType(), other$fpType = other.getFpType();
        if ((this$fpType == null) ? (other$fpType != null) : !this$fpType.equals(other$fpType)) return false;
        Object this$xqBrand = getXqBrand(), other$xqBrand = other.getXqBrand();
        if ((this$xqBrand == null) ? (other$xqBrand != null) : !this$xqBrand.equals(other$xqBrand)) return false;
        Object this$yxqCount = getYxqCount(), other$yxqCount = other.getYxqCount();
        if ((this$yxqCount == null) ? (other$yxqCount != null) : !this$yxqCount.equals(other$yxqCount)) return false;
        Object this$dcCount = getDcCount(), other$dcCount = other.getDcCount();
        if ((this$dcCount == null) ? (other$dcCount != null) : !this$dcCount.equals(other$dcCount)) return false;
        Object this$remarks = getRemarks(), other$remarks = other.getRemarks();
        if ((this$remarks == null) ? (other$remarks != null) : !this$remarks.equals(other$remarks)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
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
        Object this$user = getUser(), other$user = other.getUser();
        return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.yjuser.domain.BussMonthlyUser;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $stationId = getStationId();
        result = result * 59 + (($stationId == null) ? 43 : $stationId.hashCode());
        Object $cname = getCname();
        result = result * 59 + (($cname == null) ? 43 : $cname.hashCode());
        Object $city = getCity();
        result = result * 59 + (($city == null) ? 43 : $city.hashCode());
        Object $province = getProvince();
        result = result * 59 + (($province == null) ? 43 : $province.hashCode());
        Object $county = getCounty();
        result = result * 59 + (($county == null) ? 43 : $county.hashCode());
        Object $cdetails = getCdetails();
        result = result * 59 + (($cdetails == null) ? 43 : $cdetails.hashCode());
        Object $fpType = getFpType();
        result = result * 59 + (($fpType == null) ? 43 : $fpType.hashCode());
        Object $xqBrand = getXqBrand();
        result = result * 59 + (($xqBrand == null) ? 43 : $xqBrand.hashCode());
        Object $yxqCount = getYxqCount();
        result = result * 59 + (($yxqCount == null) ? 43 : $yxqCount.hashCode());
        Object $dcCount = getDcCount();
        result = result * 59 + (($dcCount == null) ? 43 : $dcCount.hashCode());
        Object $remarks = getRemarks();
        result = result * 59 + (($remarks == null) ? 43 : $remarks.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
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
        Object $user = getUser();
        return result * 59 + (($user == null) ? 43 : $user.hashCode());
    }
    @Override
    public String toString() {
        return "BussMonthlyUser(id=" + getId() + ", stationId=" + getStationId() + ", cname=" + getCname() + ", city=" + getCity() + ", province=" + getProvince() + ", county=" + getCounty() + ", cdetails=" + getCdetails() + ", fpType=" + getFpType() + ", xqBrand=" + getXqBrand() + ", yxqCount=" + getYxqCount() + ", dcCount=" + getDcCount() + ", remarks=" + getRemarks() + ", status=" + getStatus() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", user=" + getUser() + ")";
    }


    public Long getId() {
        /*  19 */
        return this.id;
    }

    public Long getStationId() {
        /*  21 */
        return this.stationId;
    }

    public String getCname() {
        /*  24 */
        return this.cname;
    }

    public String getCity() {
        /*  28 */
        return this.city;
    }

    public String getProvince() {
        /*  32 */
        return this.province;
    }

    public String getCounty() {
        /*  36 */
        return this.county;
    }

    public String getCdetails() {
        /*  40 */
        return this.cdetails;
    }

    public String getFpType() {
        /*  44 */
        return this.fpType;
    }

    public String getXqBrand() {
        /*  48 */
        return this.xqBrand;
    }

    public String getYxqCount() {
        /*  52 */
        return this.yxqCount;
    }

    public String getDcCount() {
        /*  56 */
        return this.dcCount;
    }

    public String getRemarks() {
        /*  60 */
        return this.remarks;
    }

    public Long getStatus() {
        /*  64 */
        return this.status;
    }

    public Long getNo1() {
        /*  68 */
        return this.no1;
    }

    public String getNo2() {
        /*  72 */
        return this.no2;
    }

    public String getNo3() {
        /*  76 */
        return this.no3;
    }

    public String getNo4() {
        /*  80 */
        return this.no4;
    }

    public String getNo5() {
        /*  84 */
        return this.no5;
    }

    public String getNo6() {
        /*  88 */
        return this.no6;
    }

    public String getNo7() {
        /*  92 */
        return this.no7;
    }

    public String getNo8() {
        /*  96 */
        return this.no8;
    }

    public String getNo9() {
        /* 100 */
        return this.no9;
    }

    public String getNo10() {
        /* 104 */
        return this.no10;
    }

    public SysUser getUser() {
        /* 106 */
        return this.user;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\domain\BussMonthlyUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */