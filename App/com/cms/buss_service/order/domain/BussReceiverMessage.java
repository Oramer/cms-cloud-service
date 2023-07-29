package com.cms.buss_service.order.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class BussReceiverMessage extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Excel(name = "用户信息")
    private String memberPk;
    @Excel(name = "收货人姓名")
    private String name;
    @Excel(name = "收货人电话")
    private String phone;
    @Excel(name = "省")
    private String province;
    @Excel(name = "市")
    private String city;
    @Excel(name = "县")
    private String county;
    @Excel(name = "收货人地址")
    private String detailes;
    @Excel(name = "地址标签")
    private String tags;
    @Excel(name = "是否默认地址(Y/N)")
    private String isDefault;
    @Excel(name = "是否删除(0/1)")
    private Long isDelete;
    @Excel(name = "地址类型(0：个人；1：企业)")
    private String addressType;

    /*  14 */
    public void setId(Long id) {
        this.id = id;
    }

    @Excel(name = "建筑类型(0：楼梯房；1：电梯房)")
    private String bulidingType;
    @Excel(name = "楼层号")
    private Integer floorNum;
    @Excel(name = "企业名称")
    private String companyName;
    @Excel(name = "乐观锁")
    private String reversion;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no1;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
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
    @Excel(name = "应急电话", readConverterExp = "$column.readConverterExp()")
    private String no10;

    public void setMemberPk(String memberPk) {
        this.memberPk = memberPk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setDetailes(String detailes) {
        this.detailes = detailes;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public void setBulidingType(String bulidingType) {
        this.bulidingType = bulidingType;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.order.domain.BussReceiverMessage)) return false;
        com.cms.buss_service.order.domain.BussReceiverMessage other = (com.cms.buss_service.order.domain.BussReceiverMessage) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$memberPk = getMemberPk(), other$memberPk = other.getMemberPk();
        if ((this$memberPk == null) ? (other$memberPk != null) : !this$memberPk.equals(other$memberPk)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$phone = getPhone(), other$phone = other.getPhone();
        if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone)) return false;
        Object this$province = getProvince(), other$province = other.getProvince();
        if ((this$province == null) ? (other$province != null) : !this$province.equals(other$province)) return false;
        Object this$city = getCity(), other$city = other.getCity();
        if ((this$city == null) ? (other$city != null) : !this$city.equals(other$city)) return false;
        Object this$county = getCounty(), other$county = other.getCounty();
        if ((this$county == null) ? (other$county != null) : !this$county.equals(other$county)) return false;
        Object this$detailes = getDetailes(), other$detailes = other.getDetailes();
        if ((this$detailes == null) ? (other$detailes != null) : !this$detailes.equals(other$detailes)) return false;
        Object this$tags = getTags(), other$tags = other.getTags();
        if ((this$tags == null) ? (other$tags != null) : !this$tags.equals(other$tags)) return false;
        Object this$isDefault = getIsDefault(), other$isDefault = other.getIsDefault();
        if ((this$isDefault == null) ? (other$isDefault != null) : !this$isDefault.equals(other$isDefault))
            return false;
        Object this$isDelete = getIsDelete(), other$isDelete = other.getIsDelete();
        if ((this$isDelete == null) ? (other$isDelete != null) : !this$isDelete.equals(other$isDelete)) return false;
        Object this$addressType = getAddressType(), other$addressType = other.getAddressType();
        if ((this$addressType == null) ? (other$addressType != null) : !this$addressType.equals(other$addressType))
            return false;
        Object this$bulidingType = getBulidingType(), other$bulidingType = other.getBulidingType();
        if ((this$bulidingType == null) ? (other$bulidingType != null) : !this$bulidingType.equals(other$bulidingType))
            return false;
        Object this$floorNum = getFloorNum(), other$floorNum = other.getFloorNum();
        if ((this$floorNum == null) ? (other$floorNum != null) : !this$floorNum.equals(other$floorNum)) return false;
        Object this$companyName = getCompanyName(), other$companyName = other.getCompanyName();
        if ((this$companyName == null) ? (other$companyName != null) : !this$companyName.equals(other$companyName))
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
        return !((this$no10 == null) ? (other$no10 != null) : !this$no10.equals(other$no10));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.order.domain.BussReceiverMessage;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $memberPk = getMemberPk();
        result = result * 59 + (($memberPk == null) ? 43 : $memberPk.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $phone = getPhone();
        result = result * 59 + (($phone == null) ? 43 : $phone.hashCode());
        Object $province = getProvince();
        result = result * 59 + (($province == null) ? 43 : $province.hashCode());
        Object $city = getCity();
        result = result * 59 + (($city == null) ? 43 : $city.hashCode());
        Object $county = getCounty();
        result = result * 59 + (($county == null) ? 43 : $county.hashCode());
        Object $detailes = getDetailes();
        result = result * 59 + (($detailes == null) ? 43 : $detailes.hashCode());
        Object $tags = getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        Object $isDefault = getIsDefault();
        result = result * 59 + (($isDefault == null) ? 43 : $isDefault.hashCode());
        Object $isDelete = getIsDelete();
        result = result * 59 + (($isDelete == null) ? 43 : $isDelete.hashCode());
        Object $addressType = getAddressType();
        result = result * 59 + (($addressType == null) ? 43 : $addressType.hashCode());
        Object $bulidingType = getBulidingType();
        result = result * 59 + (($bulidingType == null) ? 43 : $bulidingType.hashCode());
        Object $floorNum = getFloorNum();
        result = result * 59 + (($floorNum == null) ? 43 : $floorNum.hashCode());
        Object $companyName = getCompanyName();
        result = result * 59 + (($companyName == null) ? 43 : $companyName.hashCode());
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
        return result * 59 + (($no10 == null) ? 43 : $no10.hashCode());
    }
    @Override
    public String toString() {
        return "BussReceiverMessage(id=" + getId() + ", memberPk=" + getMemberPk() + ", name=" + getName() + ", phone=" + getPhone() + ", province=" + getProvince() + ", city=" + getCity() + ", county=" + getCounty() + ", detailes=" + getDetailes() + ", tags=" + getTags() + ", isDefault=" + getIsDefault() + ", isDelete=" + getIsDelete() + ", addressType=" + getAddressType() + ", bulidingType=" + getBulidingType() + ", floorNum=" + getFloorNum() + ", companyName=" + getCompanyName() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ")";
    }


    public Long getId() {
        /*  21 */
        return this.id;
    }


    public String getMemberPk() {
        /*  27 */
        return this.memberPk;
    }


    public String getName() {
        /*  33 */
        return this.name;
    }


    public String getPhone() {
        /*  39 */
        return this.phone;
    }


    public String getProvince() {
        /*  45 */
        return this.province;
    }


    public String getCity() {
        /*  51 */
        return this.city;
    }


    public String getCounty() {
        /*  57 */
        return this.county;
    }


    public String getDetailes() {
        /*  63 */
        return this.detailes;
    }


    public String getTags() {
        /*  69 */
        return this.tags;
    }


    public String getIsDefault() {
        /*  75 */
        return this.isDefault;
    }


    public Long getIsDelete() {
        /*  81 */
        return this.isDelete;
    }


    public String getAddressType() {
        /*  87 */
        return this.addressType;
    }


    public String getBulidingType() {
        /*  93 */
        return this.bulidingType;
    }


    public Integer getFloorNum() {
        /*  99 */
        return this.floorNum;
    }


    public String getCompanyName() {
        /* 105 */
        return this.companyName;
    }


    public String getReversion() {
        /* 111 */
        return this.reversion;
    }


    public String getNo1() {
        /* 117 */
        return this.no1;
    }


    public String getNo2() {
        /* 123 */
        return this.no2;
    }


    public String getNo3() {
        /* 129 */
        return this.no3;
    }


    public String getNo4() {
        /* 135 */
        return this.no4;
    }


    public String getNo5() {
        /* 141 */
        return this.no5;
    }


    public String getNo6() {
        /* 147 */
        return this.no6;
    }


    public String getNo7() {
        /* 153 */
        return this.no7;
    }


    public String getNo8() {
        /* 159 */
        return this.no8;
    }


    public String getNo9() {
        /* 165 */
        return this.no9;
    }


    public String getNo10() {
        /* 171 */
        return this.no10;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\domain\BussReceiverMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */