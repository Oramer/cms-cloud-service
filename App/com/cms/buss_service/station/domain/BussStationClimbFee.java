package com.cms.buss_service.station.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

import java.math.BigDecimal;

public class BussStationClimbFee extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long pk;
    @Excel(name = "所属水站")
    private String stationPk;
    private String f1;
    @Excel(name = "2层费用")
    private BigDecimal f2;
    @Excel(name = "3层费用")
    private BigDecimal f3;
    @Excel(name = "4层费用")
    private BigDecimal f4;
    @Excel(name = "5层费用")
    private BigDecimal f5;
    @Excel(name = "6层费用")
    private BigDecimal f6;
    @Excel(name = "7层及以上费用")
    private BigDecimal f7;
    @Excel(name = "乐观锁")
    private String reversion;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no1;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no2;

    /*  18 */
    public void setPk(Long pk) {
        this.pk = pk;
    }

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
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no15;

    public void setStationPk(String stationPk) {
        this.stationPk = stationPk;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public void setF2(BigDecimal f2) {
        this.f2 = f2;
    }

    public void setF3(BigDecimal f3) {
        this.f3 = f3;
    }

    public void setF4(BigDecimal f4) {
        this.f4 = f4;
    }

    public void setF5(BigDecimal f5) {
        this.f5 = f5;
    }

    public void setF6(BigDecimal f6) {
        this.f6 = f6;
    }

    public void setF7(BigDecimal f7) {
        this.f7 = f7;
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
        if (!(o instanceof com.cms.buss_service.station.domain.BussStationClimbFee)) return false;
        com.cms.buss_service.station.domain.BussStationClimbFee other = (com.cms.buss_service.station.domain.BussStationClimbFee) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$stationPk = getStationPk(), other$stationPk = other.getStationPk();
        if ((this$stationPk == null) ? (other$stationPk != null) : !this$stationPk.equals(other$stationPk))
            return false;
        Object this$f1 = getF1(), other$f1 = other.getF1();
        if ((this$f1 == null) ? (other$f1 != null) : !this$f1.equals(other$f1)) return false;
        Object this$f2 = getF2(), other$f2 = other.getF2();
        if ((this$f2 == null) ? (other$f2 != null) : !this$f2.equals(other$f2)) return false;
        Object this$f3 = getF3(), other$f3 = other.getF3();
        if ((this$f3 == null) ? (other$f3 != null) : !this$f3.equals(other$f3)) return false;
        Object this$f4 = getF4(), other$f4 = other.getF4();
        if ((this$f4 == null) ? (other$f4 != null) : !this$f4.equals(other$f4)) return false;
        Object this$f5 = getF5(), other$f5 = other.getF5();
        if ((this$f5 == null) ? (other$f5 != null) : !this$f5.equals(other$f5)) return false;
        Object this$f6 = getF6(), other$f6 = other.getF6();
        if ((this$f6 == null) ? (other$f6 != null) : !this$f6.equals(other$f6)) return false;
        Object this$f7 = getF7(), other$f7 = other.getF7();
        if ((this$f7 == null) ? (other$f7 != null) : !this$f7.equals(other$f7)) return false;
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

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.station.domain.BussStationClimbFee;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $stationPk = getStationPk();
        result = result * 59 + (($stationPk == null) ? 43 : $stationPk.hashCode());
        Object $f1 = getF1();
        result = result * 59 + (($f1 == null) ? 43 : $f1.hashCode());
        Object $f2 = getF2();
        result = result * 59 + (($f2 == null) ? 43 : $f2.hashCode());
        Object $f3 = getF3();
        result = result * 59 + (($f3 == null) ? 43 : $f3.hashCode());
        Object $f4 = getF4();
        result = result * 59 + (($f4 == null) ? 43 : $f4.hashCode());
        Object $f5 = getF5();
        result = result * 59 + (($f5 == null) ? 43 : $f5.hashCode());
        Object $f6 = getF6();
        result = result * 59 + (($f6 == null) ? 43 : $f6.hashCode());
        Object $f7 = getF7();
        result = result * 59 + (($f7 == null) ? 43 : $f7.hashCode());
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
    @Override
    public String toString() {
        return "BussStationClimbFee(pk=" + getPk() + ", stationPk=" + getStationPk() + ", f1=" + getF1() + ", f2=" + getF2() + ", f3=" + getF3() + ", f4=" + getF4() + ", f5=" + getF5() + ", f6=" + getF6() + ", f7=" + getF7() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", no11=" + getNo11() + ", no12=" + getNo12() + ", no13=" + getNo13() + ", no14=" + getNo14() + ", no15=" + getNo15() + ")";
    }


    public Long getPk() {
        /*  25 */
        return this.pk;
    }


    public String getStationPk() {
        /*  31 */
        return this.stationPk;
    }


    public String getF1() {
        /*  36 */
        return this.f1;
    }


    public BigDecimal getF2() {
        /*  42 */
        return this.f2;
    }


    public BigDecimal getF3() {
        /*  48 */
        return this.f3;
    }


    public BigDecimal getF4() {
        /*  54 */
        return this.f4;
    }


    public BigDecimal getF5() {
        /*  60 */
        return this.f5;
    }


    public BigDecimal getF6() {
        /*  66 */
        return this.f6;
    }


    public BigDecimal getF7() {
        /*  72 */
        return this.f7;
    }


    public String getReversion() {
        /*  78 */
        return this.reversion;
    }


    public String getNo1() {
        /*  84 */
        return this.no1;
    }


    public String getNo2() {
        /*  90 */
        return this.no2;
    }


    public String getNo3() {
        /*  96 */
        return this.no3;
    }


    public String getNo4() {
        /* 102 */
        return this.no4;
    }


    public String getNo5() {
        /* 108 */
        return this.no5;
    }


    public String getNo6() {
        /* 114 */
        return this.no6;
    }


    public String getNo7() {
        /* 120 */
        return this.no7;
    }


    public String getNo8() {
        /* 126 */
        return this.no8;
    }


    public String getNo9() {
        /* 132 */
        return this.no9;
    }


    public String getNo10() {
        /* 138 */
        return this.no10;
    }


    public String getNo11() {
        /* 144 */
        return this.no11;
    }


    public String getNo12() {
        /* 150 */
        return this.no12;
    }


    public String getNo13() {
        /* 156 */
        return this.no13;
    }


    public String getNo14() {
        /* 162 */
        return this.no14;
    }


    public String getNo15() {
        /* 168 */
        return this.no15;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\domain\BussStationClimbFee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */