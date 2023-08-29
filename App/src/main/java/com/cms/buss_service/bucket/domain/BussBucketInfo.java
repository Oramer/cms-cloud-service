package com.cms.buss_service.bucket.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

import java.util.List;

public class BussBucketInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private String pk;
    @Excel(name = "记录类型1欠桶 2压桶 3退桶 4回桶")
    private String recordType;
    @Excel(name = "水站主键")
    private String stationPk;
    @Excel(name = "配送主键")
    private String posterPk;
    @Excel(name = "用户主键")
    private String userPk;
    @Excel(name = "订单主键")
    private String orderPk;
    @Excel(name = "1待支付 2已支付 3已作废 ,4 已冲抵")
    private String status;
    @Excel(name = "乐观锁")
    private String reversion;
    @Excel(name = "数量信息")
    private Integer no1;
    private Integer no2;

    /*  15 */
    public void setPk(String pk) {
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
    @Excel(name = "用户发起了还桶信息--取件地址", readConverterExp = "$column.readConverterExp()")
    private String no9;
    @Excel(name = "用户发起了还桶信息标识", readConverterExp = "$column.readConverterExp()")
    private String no10;
    List<BussBucketDetails> bds;
    private String stationName;
    private String userName;

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public void setStationPk(String stationPk) {
        this.stationPk = stationPk;
    }

    public void setPosterPk(String posterPk) {
        this.posterPk = posterPk;
    }

    public void setUserPk(String userPk) {
        this.userPk = userPk;
    }

    public void setOrderPk(String orderPk) {
        this.orderPk = orderPk;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReversion(String reversion) {
        this.reversion = reversion;
    }

    public void setNo1(Integer no1) {
        this.no1 = no1;
    }

    public void setNo2(Integer no2) {
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

    public void setBds(List<BussBucketDetails> bds) {
        this.bds = bds;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BussBucketInfo)) return false;
        BussBucketInfo other = (BussBucketInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$recordType = getRecordType(), other$recordType = other.getRecordType();
        if ((this$recordType == null) ? (other$recordType != null) : !this$recordType.equals(other$recordType))
            return false;
        Object this$stationPk = getStationPk(), other$stationPk = other.getStationPk();
        if ((this$stationPk == null) ? (other$stationPk != null) : !this$stationPk.equals(other$stationPk))
            return false;
        Object this$posterPk = getPosterPk(), other$posterPk = other.getPosterPk();
        if ((this$posterPk == null) ? (other$posterPk != null) : !this$posterPk.equals(other$posterPk)) return false;
        Object this$userPk = getUserPk(), other$userPk = other.getUserPk();
        if ((this$userPk == null) ? (other$userPk != null) : !this$userPk.equals(other$userPk)) return false;
        Object this$orderPk = getOrderPk(), other$orderPk = other.getOrderPk();
        if ((this$orderPk == null) ? (other$orderPk != null) : !this$orderPk.equals(other$orderPk)) return false;
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
        Object this$bds =  getBds(), other$bds = other.getBds();
        if ((this$bds == null) ? (other$bds != null) : !this$bds.equals(other$bds)) return false;
        Object this$stationName = getStationName(), other$stationName = other.getStationName();
        if ((this$stationName == null) ? (other$stationName != null) : !this$stationName.equals(other$stationName))
            return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        return !((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof BussBucketInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $recordType = getRecordType();
        result = result * 59 + (($recordType == null) ? 43 : $recordType.hashCode());
        Object $stationPk = getStationPk();
        result = result * 59 + (($stationPk == null) ? 43 : $stationPk.hashCode());
        Object $posterPk = getPosterPk();
        result = result * 59 + (($posterPk == null) ? 43 : $posterPk.hashCode());
        Object $userPk = getUserPk();
        result = result * 59 + (($userPk == null) ? 43 : $userPk.hashCode());
        Object $orderPk = getOrderPk();
        result = result * 59 + (($orderPk == null) ? 43 : $orderPk.hashCode());
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
        Object $bds =  getBds();
        result = result * 59 + (($bds == null) ? 43 : $bds.hashCode());
        Object $stationName = getStationName();
        result = result * 59 + (($stationName == null) ? 43 : $stationName.hashCode());
        Object $userName = getUserName();
        return result * 59 + (($userName == null) ? 43 : $userName.hashCode());
    }
    @Override
    public String toString() {
        return "BussBucketInfo(pk=" + getPk() + ", recordType=" + getRecordType() + ", stationPk=" + getStationPk() + ", posterPk=" + getPosterPk() + ", userPk=" + getUserPk() + ", orderPk=" + getOrderPk() + ", status=" + getStatus() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", bds=" + getBds() + ", stationName=" + getStationName() + ", userName=" + getUserName() + ")";
    }


    public String getPk() {
        /*  22 */
        return this.pk;
    }


    public String getRecordType() {
        /*  28 */
        return this.recordType;
    }


    public String getStationPk() {
        /*  34 */
        return this.stationPk;
    }


    public String getPosterPk() {
        /*  40 */
        return this.posterPk;
    }


    public String getUserPk() {
        /*  46 */
        return this.userPk;
    }


    public String getOrderPk() {
        /*  52 */
        return this.orderPk;
    }


    public String getStatus() {
        /*  58 */
        return this.status;
    }


    public String getReversion() {
        /*  64 */
        return this.reversion;
    }


    public Integer getNo1() {
        /*  70 */
        return this.no1;
    }


    public Integer getNo2() {
        /*  75 */
        return this.no2;
    }


    public String getNo3() {
        /*  81 */
        return this.no3;
    }


    public String getNo4() {
        /*  87 */
        return this.no4;
    }


    public String getNo5() {
        /*  93 */
        return this.no5;
    }


    public String getNo6() {
        /*  99 */
        return this.no6;
    }


    public String getNo7() {
        /* 105 */
        return this.no7;
    }


    public String getNo8() {
        /* 111 */
        return this.no8;
    }


    public String getNo9() {
        /* 117 */
        return this.no9;
    }


    public String getNo10() {
        /* 123 */
        return this.no10;
    }

    public List<BussBucketDetails> getBds() {
        /* 125 */
        return this.bds;
    }

    public String getStationName() {
        /* 128 */
        return this.stationName;
    }

    public String getUserName() {
        /* 130 */
        return this.userName;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\BussBucketInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */