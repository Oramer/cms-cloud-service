package com.cms.buss_service.station.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

import java.math.BigDecimal;

public class BussWaterStationInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long pk;
    @Excel(name = "水站名称")
    private String stationName;
    @Excel(name = "水站地址")
    private String stationAddr;
    @Excel(name = "水站描述")
    private String stationDesc;
    @Excel(name = "水站图文")
    private String stationPic;
    @Excel(name = "经度")
    private String stationLongitude;
    @Excel(name = "纬度")
    private String stationLatitude;
    @Excel(name = "负责人")
    private String stationCharge;
    @Excel(name = "电话")
    private String stationPhone;
    @Excel(name = "营业执照(图片)")
    private String stationLicense;
    @Excel(name = "三证合一执照号码")
    private String stationLicenseNo;
    @Excel(name = "收款账号")
    private String stationAccount;
    @Excel(name = "快递员每件提成数")
    private BigDecimal posterFreeSingleUnit;
    @Excel(name = "快递员下级提成量")
    private BigDecimal posterChildBussFree;
    @Excel(name = "乐观锁")
    /*  16 */ private String reversion;

    public void setPk(Long pk) {
        this.pk = pk;
    }

    @Excel(name = "水站类型")
    private String no1;
    @Excel(name = "营业时间", readConverterExp = "$column.readConverterExp()")
    private String no2;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no3;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no4;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no5;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no6;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no7;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no8;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no9;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no10;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no11;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no12;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no13;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no14;
    @Excel(name = "是否开通分销功能Y?N", readConverterExp = "$column.readConverterExp()")
    private String no15;
    private String chargeName;

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setStationAddr(String stationAddr) {
        this.stationAddr = stationAddr;
    }

    public void setStationDesc(String stationDesc) {
        this.stationDesc = stationDesc;
    }

    public void setStationPic(String stationPic) {
        this.stationPic = stationPic;
    }

    public void setStationLongitude(String stationLongitude) {
        this.stationLongitude = stationLongitude;
    }

    public void setStationLatitude(String stationLatitude) {
        this.stationLatitude = stationLatitude;
    }

    public void setStationCharge(String stationCharge) {
        this.stationCharge = stationCharge;
    }

    public void setStationPhone(String stationPhone) {
        this.stationPhone = stationPhone;
    }

    public void setStationLicense(String stationLicense) {
        this.stationLicense = stationLicense;
    }

    public void setStationLicenseNo(String stationLicenseNo) {
        this.stationLicenseNo = stationLicenseNo;
    }

    public void setStationAccount(String stationAccount) {
        this.stationAccount = stationAccount;
    }

    public void setPosterFreeSingleUnit(BigDecimal posterFreeSingleUnit) {
        this.posterFreeSingleUnit = posterFreeSingleUnit;
    }

    public void setPosterChildBussFree(BigDecimal posterChildBussFree) {
        this.posterChildBussFree = posterChildBussFree;
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

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.station.domain.BussWaterStationInfo)) return false;
        com.cms.buss_service.station.domain.BussWaterStationInfo other = (com.cms.buss_service.station.domain.BussWaterStationInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$stationName = getStationName(), other$stationName = other.getStationName();
        if ((this$stationName == null) ? (other$stationName != null) : !this$stationName.equals(other$stationName))
            return false;
        Object this$stationAddr = getStationAddr(), other$stationAddr = other.getStationAddr();
        if ((this$stationAddr == null) ? (other$stationAddr != null) : !this$stationAddr.equals(other$stationAddr))
            return false;
        Object this$stationDesc = getStationDesc(), other$stationDesc = other.getStationDesc();
        if ((this$stationDesc == null) ? (other$stationDesc != null) : !this$stationDesc.equals(other$stationDesc))
            return false;
        Object this$stationPic = getStationPic(), other$stationPic = other.getStationPic();
        if ((this$stationPic == null) ? (other$stationPic != null) : !this$stationPic.equals(other$stationPic))
            return false;
        Object this$stationLongitude = getStationLongitude(), other$stationLongitude = other.getStationLongitude();
        if ((this$stationLongitude == null) ? (other$stationLongitude != null) : !this$stationLongitude.equals(other$stationLongitude))
            return false;
        Object this$stationLatitude = getStationLatitude(), other$stationLatitude = other.getStationLatitude();
        if ((this$stationLatitude == null) ? (other$stationLatitude != null) : !this$stationLatitude.equals(other$stationLatitude))
            return false;
        Object this$stationCharge = getStationCharge(), other$stationCharge = other.getStationCharge();
        if ((this$stationCharge == null) ? (other$stationCharge != null) : !this$stationCharge.equals(other$stationCharge))
            return false;
        Object this$stationPhone = getStationPhone(), other$stationPhone = other.getStationPhone();
        if ((this$stationPhone == null) ? (other$stationPhone != null) : !this$stationPhone.equals(other$stationPhone))
            return false;
        Object this$stationLicense = getStationLicense(), other$stationLicense = other.getStationLicense();
        if ((this$stationLicense == null) ? (other$stationLicense != null) : !this$stationLicense.equals(other$stationLicense))
            return false;
        Object this$stationLicenseNo = getStationLicenseNo(), other$stationLicenseNo = other.getStationLicenseNo();
        if ((this$stationLicenseNo == null) ? (other$stationLicenseNo != null) : !this$stationLicenseNo.equals(other$stationLicenseNo))
            return false;
        Object this$stationAccount = getStationAccount(), other$stationAccount = other.getStationAccount();
        if ((this$stationAccount == null) ? (other$stationAccount != null) : !this$stationAccount.equals(other$stationAccount))
            return false;
        Object this$posterFreeSingleUnit = getPosterFreeSingleUnit(), other$posterFreeSingleUnit = other.getPosterFreeSingleUnit();
        if ((this$posterFreeSingleUnit == null) ? (other$posterFreeSingleUnit != null) : !this$posterFreeSingleUnit.equals(other$posterFreeSingleUnit))
            return false;
        Object this$posterChildBussFree = getPosterChildBussFree(), other$posterChildBussFree = other.getPosterChildBussFree();
        if ((this$posterChildBussFree == null) ? (other$posterChildBussFree != null) : !this$posterChildBussFree.equals(other$posterChildBussFree))
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
        Object this$chargeName = getChargeName(), other$chargeName = other.getChargeName();
        return !((this$chargeName == null) ? (other$chargeName != null) : !this$chargeName.equals(other$chargeName));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.station.domain.BussWaterStationInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $stationName = getStationName();
        result = result * 59 + (($stationName == null) ? 43 : $stationName.hashCode());
        Object $stationAddr = getStationAddr();
        result = result * 59 + (($stationAddr == null) ? 43 : $stationAddr.hashCode());
        Object $stationDesc = getStationDesc();
        result = result * 59 + (($stationDesc == null) ? 43 : $stationDesc.hashCode());
        Object $stationPic = getStationPic();
        result = result * 59 + (($stationPic == null) ? 43 : $stationPic.hashCode());
        Object $stationLongitude = getStationLongitude();
        result = result * 59 + (($stationLongitude == null) ? 43 : $stationLongitude.hashCode());
        Object $stationLatitude = getStationLatitude();
        result = result * 59 + (($stationLatitude == null) ? 43 : $stationLatitude.hashCode());
        Object $stationCharge = getStationCharge();
        result = result * 59 + (($stationCharge == null) ? 43 : $stationCharge.hashCode());
        Object $stationPhone = getStationPhone();
        result = result * 59 + (($stationPhone == null) ? 43 : $stationPhone.hashCode());
        Object $stationLicense = getStationLicense();
        result = result * 59 + (($stationLicense == null) ? 43 : $stationLicense.hashCode());
        Object $stationLicenseNo = getStationLicenseNo();
        result = result * 59 + (($stationLicenseNo == null) ? 43 : $stationLicenseNo.hashCode());
        Object $stationAccount = getStationAccount();
        result = result * 59 + (($stationAccount == null) ? 43 : $stationAccount.hashCode());
        Object $posterFreeSingleUnit = getPosterFreeSingleUnit();
        result = result * 59 + (($posterFreeSingleUnit == null) ? 43 : $posterFreeSingleUnit.hashCode());
        Object $posterChildBussFree = getPosterChildBussFree();
        result = result * 59 + (($posterChildBussFree == null) ? 43 : $posterChildBussFree.hashCode());
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
        Object $chargeName = getChargeName();
        return result * 59 + (($chargeName == null) ? 43 : $chargeName.hashCode());
    }

    public String toString() {
        return "BussWaterStationInfo(pk=" + getPk() + ", stationName=" + getStationName() + ", stationAddr=" + getStationAddr() + ", stationDesc=" + getStationDesc() + ", stationPic=" + getStationPic() + ", stationLongitude=" + getStationLongitude() + ", stationLatitude=" + getStationLatitude() + ", stationCharge=" + getStationCharge() + ", stationPhone=" + getStationPhone() + ", stationLicense=" + getStationLicense() + ", stationLicenseNo=" + getStationLicenseNo() + ", stationAccount=" + getStationAccount() + ", posterFreeSingleUnit=" + getPosterFreeSingleUnit() + ", posterChildBussFree=" + getPosterChildBussFree() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", no11=" + getNo11() + ", no12=" + getNo12() + ", no13=" + getNo13() + ", no14=" + getNo14() + ", no15=" + getNo15() + ", chargeName=" + getChargeName() + ")";
    }


    public Long getPk() {
        /*  23 */
        return this.pk;
    }


    public String getStationName() {
        /*  29 */
        return this.stationName;
    }


    public String getStationAddr() {
        /*  35 */
        return this.stationAddr;
    }


    public String getStationDesc() {
        /*  41 */
        return this.stationDesc;
    }


    public String getStationPic() {
        /*  47 */
        return this.stationPic;
    }


    public String getStationLongitude() {
        /*  53 */
        return this.stationLongitude;
    }


    public String getStationLatitude() {
        /*  59 */
        return this.stationLatitude;
    }


    public String getStationCharge() {
        /*  65 */
        return this.stationCharge;
    }


    public String getStationPhone() {
        /*  71 */
        return this.stationPhone;
    }


    public String getStationLicense() {
        /*  77 */
        return this.stationLicense;
    }


    public String getStationLicenseNo() {
        /*  83 */
        return this.stationLicenseNo;
    }


    public String getStationAccount() {
        /*  89 */
        return this.stationAccount;
    }


    public BigDecimal getPosterFreeSingleUnit() {
        /*  94 */
        return this.posterFreeSingleUnit;
    }

    public BigDecimal getPosterChildBussFree() {
        /*  98 */
        return this.posterChildBussFree;
    }


    public String getReversion() {
        /* 106 */
        return this.reversion;
    }


    public String getNo1() {
        /* 112 */
        return this.no1;
    }


    public String getNo2() {
        /* 118 */
        return this.no2;
    }


    public String getNo3() {
        /* 124 */
        return this.no3;
    }


    public String getNo4() {
        /* 130 */
        return this.no4;
    }


    public String getNo5() {
        /* 136 */
        return this.no5;
    }


    public String getNo6() {
        /* 142 */
        return this.no6;
    }


    public String getNo7() {
        /* 148 */
        return this.no7;
    }


    public String getNo8() {
        /* 154 */
        return this.no8;
    }


    public String getNo9() {
        /* 160 */
        return this.no9;
    }


    public String getNo10() {
        /* 166 */
        return this.no10;
    }


    public String getNo11() {
        /* 172 */
        return this.no11;
    }


    public String getNo12() {
        /* 178 */
        return this.no12;
    }


    public String getNo13() {
        /* 184 */
        return this.no13;
    }


    public String getNo14() {
        /* 190 */
        return this.no14;
    }


    public String getNo15() {
        /* 196 */
        return this.no15;
    }

    public String getChargeName() {
        /* 199 */
        return this.chargeName;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\domain\BussWaterStationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */