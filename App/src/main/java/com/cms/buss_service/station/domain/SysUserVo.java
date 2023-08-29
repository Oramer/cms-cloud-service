package com.cms.buss_service.station.domain;

import java.math.BigDecimal;

public class SysUserVo {
    private String userId;
    private String cloudPk;
    private String userName;
    private String nickName;

    public void setUserId(String userId) {
        /* 12 */
        this.userId = userId;
    }

    private String phonenumber;
    private String avatar;
    private Integer orderCount;
    private BigDecimal orderMoney;
    private String lastOrderTime;

    public void setCloudPk(String cloudPk) {
        this.cloudPk = cloudPk;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public void setLastOrderTime(String lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SysUserVo)) return false;
        SysUserVo other = (SysUserVo) o;
        if (!other.canEqual(this)) return false;
        Object this$userId = getUserId(), other$userId = other.getUserId();
        if ((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId)) return false;
        Object this$cloudPk = getCloudPk(), other$cloudPk = other.getCloudPk();
        if ((this$cloudPk == null) ? (other$cloudPk != null) : !this$cloudPk.equals(other$cloudPk)) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$nickName = getNickName(), other$nickName = other.getNickName();
        if ((this$nickName == null) ? (other$nickName != null) : !this$nickName.equals(other$nickName)) return false;
        Object this$phonenumber = getPhonenumber(), other$phonenumber = other.getPhonenumber();
        if ((this$phonenumber == null) ? (other$phonenumber != null) : !this$phonenumber.equals(other$phonenumber))
            return false;
        Object this$avatar = getAvatar(), other$avatar = other.getAvatar();
        if ((this$avatar == null) ? (other$avatar != null) : !this$avatar.equals(other$avatar)) return false;
        Object this$orderCount = getOrderCount(), other$orderCount = other.getOrderCount();
        if ((this$orderCount == null) ? (other$orderCount != null) : !this$orderCount.equals(other$orderCount))
            return false;
        Object this$orderMoney = getOrderMoney(), other$orderMoney = other.getOrderMoney();
        if ((this$orderMoney == null) ? (other$orderMoney != null) : !this$orderMoney.equals(other$orderMoney))
            return false;
        Object this$lastOrderTime = getLastOrderTime(), other$lastOrderTime = other.getLastOrderTime();
        return !((this$lastOrderTime == null) ? (other$lastOrderTime != null) : !this$lastOrderTime.equals(other$lastOrderTime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SysUserVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $userId = getUserId();
        result = result * 59 + (($userId == null) ? 43 : $userId.hashCode());
        Object $cloudPk = getCloudPk();
        result = result * 59 + (($cloudPk == null) ? 43 : $cloudPk.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $nickName = getNickName();
        result = result * 59 + (($nickName == null) ? 43 : $nickName.hashCode());
        Object $phonenumber = getPhonenumber();
        result = result * 59 + (($phonenumber == null) ? 43 : $phonenumber.hashCode());
        Object $avatar = getAvatar();
        result = result * 59 + (($avatar == null) ? 43 : $avatar.hashCode());
        Object $orderCount = getOrderCount();
        result = result * 59 + (($orderCount == null) ? 43 : $orderCount.hashCode());
        Object $orderMoney = getOrderMoney();
        result = result * 59 + (($orderMoney == null) ? 43 : $orderMoney.hashCode());
        Object $lastOrderTime = getLastOrderTime();
        return result * 59 + (($lastOrderTime == null) ? 43 : $lastOrderTime.hashCode());
    }

    public String toString() {
        return "SysUserVo(userId=" + getUserId() + ", cloudPk=" + getCloudPk() + ", userName=" + getUserName() + ", nickName=" + getNickName() + ", phonenumber=" + getPhonenumber() + ", avatar=" + getAvatar() + ", orderCount=" + getOrderCount() + ", orderMoney=" + getOrderMoney() + ", lastOrderTime=" + getLastOrderTime() + ")";
    }

    /* 14 */
    public String getUserId() {
        return this.userId;
    }

    /* 15 */
    public String getCloudPk() {
        return this.cloudPk;
    }

    /* 16 */
    public String getUserName() {
        return this.userName;
    }

    /* 17 */
    public String getNickName() {
        return this.nickName;
    }

    /* 18 */
    public String getPhonenumber() {
        return this.phonenumber;
    }

    /* 19 */
    public String getAvatar() {
        return this.avatar;
    }

    /* 20 */
    public Integer getOrderCount() {
        return this.orderCount;
    }

    /* 21 */
    public BigDecimal getOrderMoney() {
        return this.orderMoney;
    }

    public String getLastOrderTime() {
        /* 22 */
        return this.lastOrderTime;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\domain\SysUserVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */