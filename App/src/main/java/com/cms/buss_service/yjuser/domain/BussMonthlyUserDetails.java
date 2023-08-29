package com.cms.buss_service.yjuser.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class BussMonthlyUserDetails
        extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;

    public void setId(Long id) {
        /* 12 */
        this.id = id;
    }

    @Excel(name = "用户ID")
    private String userId;
    @Excel(name = "月结用户ID")
    private String mouthUserId;
    private Integer isManger;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setMouthUserId(String mouthUserId) {
        this.mouthUserId = mouthUserId;
    }

    public void setIsManger(Integer isManger) {
        this.isManger = isManger;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BussMonthlyUserDetails)) return false;
        BussMonthlyUserDetails other = (BussMonthlyUserDetails) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$userId = getUserId(), other$userId = other.getUserId();
        if ((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId)) return false;
        Object this$mouthUserId = getMouthUserId(), other$mouthUserId = other.getMouthUserId();
        if ((this$mouthUserId == null) ? (other$mouthUserId != null) : !this$mouthUserId.equals(other$mouthUserId))
            return false;
        Object this$isManger = getIsManger(), other$isManger = other.getIsManger();
        return !((this$isManger == null) ? (other$isManger != null) : !this$isManger.equals(other$isManger));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BussMonthlyUserDetails;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $userId = getUserId();
        result = result * 59 + (($userId == null) ? 43 : $userId.hashCode());
        Object $mouthUserId = getMouthUserId();
        result = result * 59 + (($mouthUserId == null) ? 43 : $mouthUserId.hashCode());
        Object $isManger = getIsManger();
        return result * 59 + (($isManger == null) ? 43 : $isManger.hashCode());
    }

    public String toString() {
        return "BussMonthlyUserDetails(id=" + getId() + ", userId=" + getUserId() + ", mouthUserId=" + getMouthUserId() + ", isManger=" + getIsManger() + ")";
    }


    public Long getId() {
        /* 19 */
        return this.id;
    }


    public String getUserId() {
        /* 25 */
        return this.userId;
    }


    public String getMouthUserId() {
        /* 31 */
        return this.mouthUserId;
    }

    public Integer getIsManger() {
        /* 33 */
        return this.isManger;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\domain\BussMonthlyUserDetails.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */