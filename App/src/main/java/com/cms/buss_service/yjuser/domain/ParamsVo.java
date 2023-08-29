package com.cms.buss_service.yjuser.domain;

public class ParamsVo {
    private String nickName;
    private String phonenumber;

    /*  5 */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ParamsVo)) return false;
        ParamsVo other = (ParamsVo) o;
        if (!other.canEqual(this)) return false;
        Object this$nickName = getNickName(), other$nickName = other.getNickName();
        if ((this$nickName == null) ? (other$nickName != null) : !this$nickName.equals(other$nickName)) return false;
        Object this$phonenumber = getPhonenumber(), other$phonenumber = other.getPhonenumber();
        return !((this$phonenumber == null) ? (other$phonenumber != null) : !this$phonenumber.equals(other$phonenumber));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ParamsVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $nickName = getNickName();
        result = result * 59 + (($nickName == null) ? 43 : $nickName.hashCode());
        Object $phonenumber = getPhonenumber();
        return result * 59 + (($phonenumber == null) ? 43 : $phonenumber.hashCode());
    }

    public String toString() {
        return "ParamsVo(nickName=" + getNickName() + ", phonenumber=" + getPhonenumber() + ")";
    }


    public String getNickName() {
        /* 10 */
        return this.nickName;
    }


    public String getPhonenumber() {
        /* 15 */
        return this.phonenumber;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\domain\ParamsVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */