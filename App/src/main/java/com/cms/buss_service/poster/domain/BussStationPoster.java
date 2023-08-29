package com.cms.buss_service.poster.domain;

import org.hibernate.validator.constraints.NotBlank;
import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.system_service.system.domain.SysUser;

public class BussStationPoster extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private String pk;
    @Excel(name = "用户PK")
    private String userPk;
    @Excel(name = "归属水站")
    private String stationPk;
    @Excel(name = "上级PK")
    private String parentPk;
    @Excel(name = "入驻时间")
    private String joinTime;
    @NotBlank(message = "派单员名称不能为空")
    private String nickName;
    @NotBlank(message = "联系方式不能为空")
    @Excel(name = "联系方式")
    private String phonenumber;
    private String avatar;
    @Excel(name = "联系地址")
    private String concatAddr;
    @Excel(name = "配送区域")
    private String postarea;
    @Excel(name = "经度")
    private String lnt;
    @Excel(name = "纬度")
    private String lat;
    @Excel(name = "身份证正面")
    private String cardPicA;
    @Excel(name = "身份证反面")
    private String cardPicB;
    @Excel(name = "状态 1审核中 2正常 3 已离职")
    private String posterStatus;
    @Excel(name = "乐观锁")
    private String reversion;

    /*  19 */
    public void setPk(String pk) {
        this.pk = pk;
    }

    private String no1;
    private String no2;
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
    private String stationName;
    protected String searchValue;

    public void setUserPk(String userPk) {
        this.userPk = userPk;
    }

    public void setStationPk(String stationPk) {
        this.stationPk = stationPk;
    }

    public void setParentPk(String parentPk) {
        this.parentPk = parentPk;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setConcatAddr(String concatAddr) {
        this.concatAddr = concatAddr;
    }

    public void setPostarea(String postarea) {
        this.postarea = postarea;
    }

    public void setLnt(String lnt) {
        this.lnt = lnt;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setCardPicA(String cardPicA) {
        this.cardPicA = cardPicA;
    }

    public void setCardPicB(String cardPicB) {
        this.cardPicB = cardPicB;
    }

    public void setPosterStatus(String posterStatus) {
        this.posterStatus = posterStatus;
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

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BussStationPoster)) return false;
        BussStationPoster other = (BussStationPoster) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$userPk = getUserPk(), other$userPk = other.getUserPk();
        if ((this$userPk == null) ? (other$userPk != null) : !this$userPk.equals(other$userPk)) return false;
        Object this$stationPk = getStationPk(), other$stationPk = other.getStationPk();
        if ((this$stationPk == null) ? (other$stationPk != null) : !this$stationPk.equals(other$stationPk))
            return false;
        Object this$parentPk = getParentPk(), other$parentPk = other.getParentPk();
        if ((this$parentPk == null) ? (other$parentPk != null) : !this$parentPk.equals(other$parentPk)) return false;
        Object this$joinTime = getJoinTime(), other$joinTime = other.getJoinTime();
        if ((this$joinTime == null) ? (other$joinTime != null) : !this$joinTime.equals(other$joinTime)) return false;
        Object this$nickName = getNickName(), other$nickName = other.getNickName();
        if ((this$nickName == null) ? (other$nickName != null) : !this$nickName.equals(other$nickName)) return false;
        Object this$phonenumber = getPhonenumber(), other$phonenumber = other.getPhonenumber();
        if ((this$phonenumber == null) ? (other$phonenumber != null) : !this$phonenumber.equals(other$phonenumber))
            return false;
        Object this$avatar = getAvatar(), other$avatar = other.getAvatar();
        if ((this$avatar == null) ? (other$avatar != null) : !this$avatar.equals(other$avatar)) return false;
        Object this$concatAddr = getConcatAddr(), other$concatAddr = other.getConcatAddr();
        if ((this$concatAddr == null) ? (other$concatAddr != null) : !this$concatAddr.equals(other$concatAddr))
            return false;
        Object this$postarea = getPostarea(), other$postarea = other.getPostarea();
        if ((this$postarea == null) ? (other$postarea != null) : !this$postarea.equals(other$postarea)) return false;
        Object this$lnt = getLnt(), other$lnt = other.getLnt();
        if ((this$lnt == null) ? (other$lnt != null) : !this$lnt.equals(other$lnt)) return false;
        Object this$lat = getLat(), other$lat = other.getLat();
        if ((this$lat == null) ? (other$lat != null) : !this$lat.equals(other$lat)) return false;
        Object this$cardPicA = getCardPicA(), other$cardPicA = other.getCardPicA();
        if ((this$cardPicA == null) ? (other$cardPicA != null) : !this$cardPicA.equals(other$cardPicA)) return false;
        Object this$cardPicB = getCardPicB(), other$cardPicB = other.getCardPicB();
        if ((this$cardPicB == null) ? (other$cardPicB != null) : !this$cardPicB.equals(other$cardPicB)) return false;
        Object this$posterStatus = getPosterStatus(), other$posterStatus = other.getPosterStatus();
        if ((this$posterStatus == null) ? (other$posterStatus != null) : !this$posterStatus.equals(other$posterStatus))
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
        Object this$user = getUser(), other$user = other.getUser();
        if ((this$user == null) ? (other$user != null) : !this$user.equals(other$user)) return false;
        Object this$stationName = getStationName(), other$stationName = other.getStationName();
        if ((this$stationName == null) ? (other$stationName != null) : !this$stationName.equals(other$stationName))
            return false;
        Object this$searchValue = getSearchValue(), other$searchValue = other.getSearchValue();
        return !((this$searchValue == null) ? (other$searchValue != null) : !this$searchValue.equals(other$searchValue));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BussStationPoster;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $userPk = getUserPk();
        result = result * 59 + (($userPk == null) ? 43 : $userPk.hashCode());
        Object $stationPk = getStationPk();
        result = result * 59 + (($stationPk == null) ? 43 : $stationPk.hashCode());
        Object $parentPk = getParentPk();
        result = result * 59 + (($parentPk == null) ? 43 : $parentPk.hashCode());
        Object $joinTime = getJoinTime();
        result = result * 59 + (($joinTime == null) ? 43 : $joinTime.hashCode());
        Object $nickName = getNickName();
        result = result * 59 + (($nickName == null) ? 43 : $nickName.hashCode());
        Object $phonenumber = getPhonenumber();
        result = result * 59 + (($phonenumber == null) ? 43 : $phonenumber.hashCode());
        Object $avatar = getAvatar();
        result = result * 59 + (($avatar == null) ? 43 : $avatar.hashCode());
        Object $concatAddr = getConcatAddr();
        result = result * 59 + (($concatAddr == null) ? 43 : $concatAddr.hashCode());
        Object $postarea = getPostarea();
        result = result * 59 + (($postarea == null) ? 43 : $postarea.hashCode());
        Object $lnt = getLnt();
        result = result * 59 + (($lnt == null) ? 43 : $lnt.hashCode());
        Object $lat = getLat();
        result = result * 59 + (($lat == null) ? 43 : $lat.hashCode());
        Object $cardPicA = getCardPicA();
        result = result * 59 + (($cardPicA == null) ? 43 : $cardPicA.hashCode());
        Object $cardPicB = getCardPicB();
        result = result * 59 + (($cardPicB == null) ? 43 : $cardPicB.hashCode());
        Object $posterStatus = getPosterStatus();
        result = result * 59 + (($posterStatus == null) ? 43 : $posterStatus.hashCode());
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
        Object $stationName = getStationName();
        result = result * 59 + (($stationName == null) ? 43 : $stationName.hashCode());
        Object $searchValue = getSearchValue();
        return result * 59 + (($searchValue == null) ? 43 : $searchValue.hashCode());
    }

    public String toString() {
        return "BussStationPoster(pk=" + getPk() + ", userPk=" + getUserPk() + ", stationPk=" + getStationPk() + ", parentPk=" + getParentPk() + ", joinTime=" + getJoinTime() + ", nickName=" + getNickName() + ", phonenumber=" + getPhonenumber() + ", avatar=" + getAvatar() + ", concatAddr=" + getConcatAddr() + ", postarea=" + getPostarea() + ", lnt=" + getLnt() + ", lat=" + getLat() + ", cardPicA=" + getCardPicA() + ", cardPicB=" + getCardPicB() + ", posterStatus=" + getPosterStatus() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", no11=" + getNo11() + ", no12=" + getNo12() + ", no13=" + getNo13() + ", no14=" + getNo14() + ", no15=" + getNo15() + ", user=" + getUser() + ", stationName=" + getStationName() + ", searchValue=" + getSearchValue() + ")";
    }


    public String getPk() {
        /*  26 */
        return this.pk;
    }


    public String getUserPk() {
        /*  32 */
        return this.userPk;
    }


    public String getStationPk() {
        /*  38 */
        return this.stationPk;
    }


    public String getParentPk() {
        /*  44 */
        return this.parentPk;
    }


    public String getJoinTime() {
        /*  50 */
        return this.joinTime;
    }


    public String getNickName() {
        /*  55 */
        return this.nickName;
    }


    public String getPhonenumber() {
        /*  62 */
        return this.phonenumber;
    }

    public String getAvatar() {
        /*  65 */
        return this.avatar;
    }


    public String getConcatAddr() {
        /*  71 */
        return this.concatAddr;
    }


    public String getPostarea() {
        /*  77 */
        return this.postarea;
    }


    public String getLnt() {
        /*  83 */
        return this.lnt;
    }


    public String getLat() {
        /*  89 */
        return this.lat;
    }


    public String getCardPicA() {
        /*  95 */
        return this.cardPicA;
    }


    public String getCardPicB() {
        /* 101 */
        return this.cardPicB;
    }


    public String getPosterStatus() {
        /* 107 */
        return this.posterStatus;
    }


    public String getReversion() {
        /* 113 */
        return this.reversion;
    }


    public String getNo1() {
        /* 118 */
        return this.no1;
    }


    public String getNo2() {
        /* 123 */
        return this.no2;
    }


    public String getNo3() {
        /* 128 */
        return this.no3;
    }


    public String getNo4() {
        /* 133 */
        return this.no4;
    }


    public String getNo5() {
        /* 138 */
        return this.no5;
    }


    public String getNo6() {
        /* 143 */
        return this.no6;
    }


    public String getNo7() {
        /* 148 */
        return this.no7;
    }


    public String getNo8() {
        /* 153 */
        return this.no8;
    }


    public String getNo9() {
        /* 158 */
        return this.no9;
    }


    public String getNo10() {
        /* 163 */
        return this.no10;
    }


    public String getNo11() {
        /* 168 */
        return this.no11;
    }


    public String getNo12() {
        /* 173 */
        return this.no12;
    }


    public String getNo13() {
        /* 178 */
        return this.no13;
    }


    public String getNo14() {
        /* 183 */
        return this.no14;
    }


    public String getNo15() {
        /* 188 */
        return this.no15;
    }

    public SysUser getUser() {
        /* 190 */
        return this.user;
    }

    /* 192 */
    public String getStationName() {
        return this.stationName;
    }

    public String getSearchValue() {
        /* 193 */
        return this.searchValue;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\domain\BussStationPoster.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */