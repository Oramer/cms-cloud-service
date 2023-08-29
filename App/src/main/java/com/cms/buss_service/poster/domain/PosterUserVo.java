package com.cms.buss_service.poster.domain;

import java.math.BigDecimal;

public class PosterUserVo {
    private String userIds;

    /*  6 */
    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    private String posterIds;
    private BigDecimal postAmount;

    public void setPosterIds(String posterIds) {
        this.posterIds = posterIds;
    }

    public void setPostAmount(BigDecimal postAmount) {
        this.postAmount = postAmount;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PosterUserVo)) return false;
        PosterUserVo other = (PosterUserVo) o;
        if (!other.canEqual(this)) return false;
        Object this$userIds = getUserIds(), other$userIds = other.getUserIds();
        if ((this$userIds == null) ? (other$userIds != null) : !this$userIds.equals(other$userIds)) return false;
        Object this$posterIds = getPosterIds(), other$posterIds = other.getPosterIds();
        if ((this$posterIds == null) ? (other$posterIds != null) : !this$posterIds.equals(other$posterIds))
            return false;
        Object this$postAmount = getPostAmount(), other$postAmount = other.getPostAmount();
        return !((this$postAmount == null) ? (other$postAmount != null) : !this$postAmount.equals(other$postAmount));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PosterUserVo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $userIds = getUserIds();
        result = result * 59 + (($userIds == null) ? 43 : $userIds.hashCode());
        Object $posterIds = getPosterIds();
        result = result * 59 + (($posterIds == null) ? 43 : $posterIds.hashCode());
        Object $postAmount = getPostAmount();
        return result * 59 + (($postAmount == null) ? 43 : $postAmount.hashCode());
    }
    @Override
    public String toString() {
        return "PosterUserVo(userIds=" + getUserIds() + ", posterIds=" + getPosterIds() + ", postAmount=" + getPostAmount() + ")";
    }


    /*  9 */
    public String getUserIds() {
        return this.userIds;
    }

    /* 10 */
    public String getPosterIds() {
        return this.posterIds;
    }

    public BigDecimal getPostAmount() {
        /* 11 */
        return this.postAmount;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\domain\PosterUserVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */