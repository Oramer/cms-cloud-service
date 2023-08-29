package com.cms.buss_service.station.domain;

public class SearchUserVo {
    private String cloudPk;
    private Integer ocount;
    private Integer omoney;
    private Integer otime;
    private Integer urole;

    /*  5 */
    public void setCloudPk(String cloudPk) {
        this.cloudPk = cloudPk;
    }

    private Integer utime;
    private Integer utype;
    private String searchValue;
    private String userType;
    private String status;
    private String userId;

    public void setOcount(Integer ocount) {
        this.ocount = ocount;
    }

    public void setOmoney(Integer omoney) {
        this.omoney = omoney;
    }

    public void setOtime(Integer otime) {
        this.otime = otime;
    }

    public void setUrole(Integer urole) {
        this.urole = urole;
    }

    public void setUtime(Integer utime) {
        this.utime = utime;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SearchUserVo)) return false;
        SearchUserVo other = (SearchUserVo) o;
        if (!other.canEqual(this)) return false;
        Object this$cloudPk = getCloudPk(), other$cloudPk = other.getCloudPk();
        if ((this$cloudPk == null) ? (other$cloudPk != null) : !this$cloudPk.equals(other$cloudPk)) return false;
        Object this$ocount = getOcount(), other$ocount = other.getOcount();
        if ((this$ocount == null) ? (other$ocount != null) : !this$ocount.equals(other$ocount)) return false;
        Object this$omoney = getOmoney(), other$omoney = other.getOmoney();
        if ((this$omoney == null) ? (other$omoney != null) : !this$omoney.equals(other$omoney)) return false;
        Object this$otime = getOtime(), other$otime = other.getOtime();
        if ((this$otime == null) ? (other$otime != null) : !this$otime.equals(other$otime)) return false;
        Object this$urole = getUrole(), other$urole = other.getUrole();
        if ((this$urole == null) ? (other$urole != null) : !this$urole.equals(other$urole)) return false;
        Object this$utime = getUtime(), other$utime = other.getUtime();
        if ((this$utime == null) ? (other$utime != null) : !this$utime.equals(other$utime)) return false;
        Object this$utype = getUtype(), other$utype = other.getUtype();
        if ((this$utype == null) ? (other$utype != null) : !this$utype.equals(other$utype)) return false;
        Object this$searchValue = getSearchValue(), other$searchValue = other.getSearchValue();
        if ((this$searchValue == null) ? (other$searchValue != null) : !this$searchValue.equals(other$searchValue))
            return false;
        Object this$userType = getUserType(), other$userType = other.getUserType();
        if ((this$userType == null) ? (other$userType != null) : !this$userType.equals(other$userType)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$userId = getUserId(), other$userId = other.getUserId();
        return !((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SearchUserVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $cloudPk = getCloudPk();
        result = result * 59 + (($cloudPk == null) ? 43 : $cloudPk.hashCode());
        Object $ocount = getOcount();
        result = result * 59 + (($ocount == null) ? 43 : $ocount.hashCode());
        Object $omoney = getOmoney();
        result = result * 59 + (($omoney == null) ? 43 : $omoney.hashCode());
        Object $otime = getOtime();
        result = result * 59 + (($otime == null) ? 43 : $otime.hashCode());
        Object $urole = getUrole();
        result = result * 59 + (($urole == null) ? 43 : $urole.hashCode());
        Object $utime = getUtime();
        result = result * 59 + (($utime == null) ? 43 : $utime.hashCode());
        Object $utype = getUtype();
        result = result * 59 + (($utype == null) ? 43 : $utype.hashCode());
        Object $searchValue = getSearchValue();
        result = result * 59 + (($searchValue == null) ? 43 : $searchValue.hashCode());
        Object $userType = getUserType();
        result = result * 59 + (($userType == null) ? 43 : $userType.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $userId = getUserId();
        return result * 59 + (($userId == null) ? 43 : $userId.hashCode());
    }

    public String toString() {
        return "SearchUserVo(cloudPk=" + getCloudPk() + ", ocount=" + getOcount() + ", omoney=" + getOmoney() + ", otime=" + getOtime() + ", urole=" + getUrole() + ", utime=" + getUtime() + ", utype=" + getUtype() + ", searchValue=" + getSearchValue() + ", userType=" + getUserType() + ", status=" + getStatus() + ", userId=" + getUserId() + ")";
    }

    /*  7 */
    public String getCloudPk() {
        return this.cloudPk;
    }

    /*  8 */
    public Integer getOcount() {
        return this.ocount;
    }

    /*  9 */
    public Integer getOmoney() {
        return this.omoney;
    }

    /* 10 */
    public Integer getOtime() {
        return this.otime;
    }

    /* 11 */
    public Integer getUrole() {
        return this.urole;
    }

    /* 12 */
    public Integer getUtime() {
        return this.utime;
    }

    /* 13 */
    public Integer getUtype() {
        return this.utype;
    }

    /* 14 */
    public String getSearchValue() {
        return this.searchValue;
    }

    /* 15 */
    public String getUserType() {
        return this.userType;
    }

    /* 16 */
    public String getStatus() {
        return this.status;
    }

    public String getUserId() {
        /* 17 */
        return this.userId;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\domain\SearchUserVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */