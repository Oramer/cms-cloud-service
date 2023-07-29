package com.cms.buss_service.banner.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class BussBannerInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Excel(name = "banner图片")
    private String bannerPic;
    @Excel(name = "banner显文")
    private String bannerDesc;
    @Excel(name = "banner内链")
    private String bannerLink;
    @Excel(name = "内链类型")
    private String linkType;
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

    /*  16 */
    public void setId(Long id) {
        this.id = id;
    }

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
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no15;

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public void setBannerDesc(String bannerDesc) {
        this.bannerDesc = bannerDesc;
    }

    public void setBannerLink(String bannerLink) {
        this.bannerLink = bannerLink;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
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
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.banner.domain.BussBannerInfo)) return false;
        com.cms.buss_service.banner.domain.BussBannerInfo other = (com.cms.buss_service.banner.domain.BussBannerInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$bannerPic = getBannerPic(), other$bannerPic = other.getBannerPic();
        if ((this$bannerPic == null) ? (other$bannerPic != null) : !this$bannerPic.equals(other$bannerPic))
            return false;
        Object this$bannerDesc = getBannerDesc(), other$bannerDesc = other.getBannerDesc();
        if ((this$bannerDesc == null) ? (other$bannerDesc != null) : !this$bannerDesc.equals(other$bannerDesc))
            return false;
        Object this$bannerLink = getBannerLink(), other$bannerLink = other.getBannerLink();
        if ((this$bannerLink == null) ? (other$bannerLink != null) : !this$bannerLink.equals(other$bannerLink))
            return false;
        Object this$linkType = getLinkType(), other$linkType = other.getLinkType();
        if ((this$linkType == null) ? (other$linkType != null) : !this$linkType.equals(other$linkType)) return false;
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
        return !((this$no15 == null) ? (other$no15 != null) : !this$no15.equals(other$no15));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.banner.domain.BussBannerInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $bannerPic = getBannerPic();
        result = result * 59 + (($bannerPic == null) ? 43 : $bannerPic.hashCode());
        Object $bannerDesc = getBannerDesc();
        result = result * 59 + (($bannerDesc == null) ? 43 : $bannerDesc.hashCode());
        Object $bannerLink = getBannerLink();
        result = result * 59 + (($bannerLink == null) ? 43 : $bannerLink.hashCode());
        Object $linkType = getLinkType();
        result = result * 59 + (($linkType == null) ? 43 : $linkType.hashCode());
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
        return result * 59 + (($no15 == null) ? 43 : $no15.hashCode());
    }

    public String toString() {
        return "BussBannerInfo(id=" + getId() + ", bannerPic=" + getBannerPic() + ", bannerDesc=" + getBannerDesc() + ", bannerLink=" + getBannerLink() + ", linkType=" + getLinkType() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", no11=" + getNo11() + ", no12=" + getNo12() + ", no13=" + getNo13() + ", no14=" + getNo14() + ", no15=" + getNo15() + ")";
    }


    public Long getId() {
        /*  23 */
        return this.id;
    }


    public String getBannerPic() {
        /*  29 */
        return this.bannerPic;
    }


    public String getBannerDesc() {
        /*  35 */
        return this.bannerDesc;
    }


    public String getBannerLink() {
        /*  41 */
        return this.bannerLink;
    }


    public String getLinkType() {
        /*  47 */
        return this.linkType;
    }


    public String getReversion() {
        /*  53 */
        return this.reversion;
    }


    public String getNo1() {
        /*  59 */
        return this.no1;
    }


    public String getNo2() {
        /*  65 */
        return this.no2;
    }


    public String getNo3() {
        /*  71 */
        return this.no3;
    }


    public String getNo4() {
        /*  77 */
        return this.no4;
    }


    public String getNo5() {
        /*  83 */
        return this.no5;
    }


    public String getNo6() {
        /*  89 */
        return this.no6;
    }


    public String getNo7() {
        /*  95 */
        return this.no7;
    }


    public String getNo8() {
        /* 101 */
        return this.no8;
    }


    public String getNo9() {
        /* 107 */
        return this.no9;
    }


    public String getNo10() {
        /* 113 */
        return this.no10;
    }


    public String getNo11() {
        /* 119 */
        return this.no11;
    }


    public String getNo12() {
        /* 125 */
        return this.no12;
    }


    public String getNo13() {
        /* 131 */
        return this.no13;
    }


    public String getNo14() {
        /* 137 */
        return this.no14;
    }


    public String getNo15() {
        /* 143 */
        return this.no15;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\banner\domain\BussBannerInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */