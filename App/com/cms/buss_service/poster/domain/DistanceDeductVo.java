package com.cms.buss_service.poster.domain;

import com.cms.system_service.system.domain.SysUser;

public class DistanceDeductVo extends BussPosterDistanceDeduct {
    private SysUser user;

    /*  6 */
    public void setUser(SysUser user) {
        this.user = user;
    }

    private SysUser poster;

    public void setPoster(SysUser poster) {
        this.poster = poster;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.poster.domain.DistanceDeductVo)) return false;
        com.cms.buss_service.poster.domain.DistanceDeductVo other = (com.cms.buss_service.poster.domain.DistanceDeductVo) o;
        if (!other.canEqual(this)) return false;
        Object this$user = getUser(), other$user = other.getUser();
        if ((this$user == null) ? (other$user != null) : !this$user.equals(other$user)) return false;
        Object this$poster = getPoster(), other$poster = other.getPoster();
        return !((this$poster == null) ? (other$poster != null) : !this$poster.equals(other$poster));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.poster.domain.DistanceDeductVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $user = getUser();
        result = result * 59 + (($user == null) ? 43 : $user.hashCode());
        Object $poster = getPoster();
        return result * 59 + (($poster == null) ? 43 : $poster.hashCode());
    }
    @Override
    public String toString() {
        return "DistanceDeductVo(user=" + getUser() + ", poster=" + getPoster() + ")";
    }


    /*  9 */
    public SysUser getUser() {
        return this.user;
    }

    public SysUser getPoster() {
        /* 10 */
        return this.poster;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\domain\DistanceDeductVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */