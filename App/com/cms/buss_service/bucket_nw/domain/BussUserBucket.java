package com.cms.buss_service.bucket_nw.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class BussUserBucket extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Excel(name = "归属用户")
    private String userId;
    @Excel(name = "水站信息")
    private String stationId;
    @Excel(name = "压桶数")
    private Long ytCount;
    @Excel(name = "欠桶数")
    private Long qtCount;
    @Excel(name = "回桶数")
    private Long htCount;
    @Excel(name = "回桶数")
    private String no1;

    /* 12 */
    public void setId(Long id) {
        this.id = id;
    }

    @Excel(name = "回桶数")
    private String no2;
    @Excel(name = "回桶数")
    private String no3;
    @Excel(name = "回桶数")
    private String no4;
    @Excel(name = "回桶数")
    private String no5;
    @Excel(name = "回桶数")
    private String no6;
    @Excel(name = "回桶数")
    private String no7;
    @Excel(name = "回桶数")
    private String no8;
    @Excel(name = "回桶数")
    private String no9;
    @Excel(name = "回桶数")
    private String no10;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setYtCount(Long ytCount) {
        this.ytCount = ytCount;
    }

    public void setQtCount(Long qtCount) {
        this.qtCount = qtCount;
    }

    public void setHtCount(Long htCount) {
        this.htCount = htCount;
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

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.bucket_nw.domain.BussUserBucket)) return false;
        com.cms.buss_service.bucket_nw.domain.BussUserBucket other = (com.cms.buss_service.bucket_nw.domain.BussUserBucket) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$userId = getUserId(), other$userId = other.getUserId();
        if ((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId)) return false;
        Object this$stationId = getStationId(), other$stationId = other.getStationId();
        if ((this$stationId == null) ? (other$stationId != null) : !this$stationId.equals(other$stationId))
            return false;
        Object this$ytCount = getYtCount(), other$ytCount = other.getYtCount();
        if ((this$ytCount == null) ? (other$ytCount != null) : !this$ytCount.equals(other$ytCount)) return false;
        Object this$qtCount = getQtCount(), other$qtCount = other.getQtCount();
        if ((this$qtCount == null) ? (other$qtCount != null) : !this$qtCount.equals(other$qtCount)) return false;
        Object this$htCount = getHtCount(), other$htCount = other.getHtCount();
        if ((this$htCount == null) ? (other$htCount != null) : !this$htCount.equals(other$htCount)) return false;
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
        return other instanceof com.cms.buss_service.bucket_nw.domain.BussUserBucket;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $userId = getUserId();
        result = result * 59 + (($userId == null) ? 43 : $userId.hashCode());
        Object $stationId = getStationId();
        result = result * 59 + (($stationId == null) ? 43 : $stationId.hashCode());
        Object $ytCount = getYtCount();
        result = result * 59 + (($ytCount == null) ? 43 : $ytCount.hashCode());
        Object $qtCount = getQtCount();
        result = result * 59 + (($qtCount == null) ? 43 : $qtCount.hashCode());
        Object $htCount = getHtCount();
        result = result * 59 + (($htCount == null) ? 43 : $htCount.hashCode());
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
        return "BussUserBucket(id=" + getId() + ", userId=" + getUserId() + ", stationId=" + getStationId() + ", ytCount=" + getYtCount() + ", qtCount=" + getQtCount() + ", htCount=" + getHtCount() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ")";
    }


    public Long getId() {
        /* 17 */
        return this.id;
    }

    public String getUserId() {
        /* 21 */
        return this.userId;
    }

    public String getStationId() {
        /* 25 */
        return this.stationId;
    }

    public Long getYtCount() {
        /* 29 */
        return this.ytCount;
    }

    public Long getQtCount() {
        /* 33 */
        return this.qtCount;
    }

    public Long getHtCount() {
        /* 37 */
        return this.htCount;
    }

    public String getNo1() {
        /* 41 */
        return this.no1;
    }

    public String getNo2() {
        /* 45 */
        return this.no2;
    }

    public String getNo3() {
        /* 49 */
        return this.no3;
    }

    public String getNo4() {
        /* 53 */
        return this.no4;
    }

    public String getNo5() {
        /* 57 */
        return this.no5;
    }

    public String getNo6() {
        /* 61 */
        return this.no6;
    }

    public String getNo7() {
        /* 65 */
        return this.no7;
    }

    public String getNo8() {
        /* 69 */
        return this.no8;
    }

    public String getNo9() {
        /* 73 */
        return this.no9;
    }

    public String getNo10() {
        /* 77 */
        return this.no10;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket_nw\domain\BussUserBucket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */