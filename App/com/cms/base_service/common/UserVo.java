package com.cms.base_service.common;

import java.util.List;

public class UserVo {
    private String userid;
    private String name;
    private List<String> department;
    private String position;
    private String mobile;
    private String gender;
    private String email;
    private String avatar;
    private int status;

    /* 10 */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    private int enable;
    private int isleader;
    private int hide_mobile;
    private String telephone;
    private List<String> order;
    private int main_department;
    private String alias;
    private String address;
    private String thumb_avatar;
    private List<String> direct_leader;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(List<String> department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public void setIsleader(int isleader) {
        this.isleader = isleader;
    }

    public void setHide_mobile(int hide_mobile) {
        this.hide_mobile = hide_mobile;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setOrder(List<String> order) {
        this.order = order;
    }

    public void setMain_department(int main_department) {
        this.main_department = main_department;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setThumb_avatar(String thumb_avatar) {
        this.thumb_avatar = thumb_avatar;
    }

    public void setDirect_leader(List<String> direct_leader) {
        this.direct_leader = direct_leader;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.base_service.common.UserVo)) return false;
        com.cms.base_service.common.UserVo other = (com.cms.base_service.common.UserVo) o;
        if (!other.canEqual(this)) return false;
        Object this$userid = getUserid(), other$userid = other.getUserid();
        if ((this$userid == null) ? (other$userid != null) : !this$userid.equals(other$userid)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$department =  getDepartment(), other$department =  other.getDepartment();
        if ((this$department == null) ? (other$department != null) : !this$department.equals(other$department))
            return false;
        Object this$position = getPosition(), other$position = other.getPosition();
        if ((this$position == null) ? (other$position != null) : !this$position.equals(other$position)) return false;
        Object this$mobile = getMobile(), other$mobile = other.getMobile();
        if ((this$mobile == null) ? (other$mobile != null) : !this$mobile.equals(other$mobile)) return false;
        Object this$gender = getGender(), other$gender = other.getGender();
        if ((this$gender == null) ? (other$gender != null) : !this$gender.equals(other$gender)) return false;
        Object this$email = getEmail(), other$email = other.getEmail();
        if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email)) return false;
        Object this$avatar = getAvatar(), other$avatar = other.getAvatar();
        if ((this$avatar == null) ? (other$avatar != null) : !this$avatar.equals(other$avatar)) return false;
        if (getStatus() != other.getStatus()) return false;
        if (getEnable() != other.getEnable()) return false;
        if (getIsleader() != other.getIsleader()) return false;
        if (getHide_mobile() != other.getHide_mobile()) return false;
        Object this$telephone = getTelephone(), other$telephone = other.getTelephone();
        if ((this$telephone == null) ? (other$telephone != null) : !this$telephone.equals(other$telephone))
            return false;
        Object this$order =  getOrder(), other$order =  other.getOrder();
        if ((this$order == null) ? (other$order != null) : !this$order.equals(other$order)) return false;
        if (getMain_department() != other.getMain_department()) return false;
        Object this$alias = getAlias(), other$alias = other.getAlias();
        if ((this$alias == null) ? (other$alias != null) : !this$alias.equals(other$alias)) return false;
        Object this$address = getAddress(), other$address = other.getAddress();
        if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address)) return false;
        Object this$thumb_avatar = getThumb_avatar(), other$thumb_avatar = other.getThumb_avatar();
        if ((this$thumb_avatar == null) ? (other$thumb_avatar != null) : !this$thumb_avatar.equals(other$thumb_avatar))
            return false;
        Object this$direct_leader =  getDirect_leader(), other$direct_leader =  other.getDirect_leader();
        return !((this$direct_leader == null) ? (other$direct_leader != null) : !this$direct_leader.equals(other$direct_leader));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.base_service.common.UserVo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $userid = getUserid();
        result = result * 59 + (($userid == null) ? 43 : $userid.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $department =  getDepartment();
        result = result * 59 + (($department == null) ? 43 : $department.hashCode());
        Object $position = getPosition();
        result = result * 59 + (($position == null) ? 43 : $position.hashCode());
        Object $mobile = getMobile();
        result = result * 59 + (($mobile == null) ? 43 : $mobile.hashCode());
        Object $gender = getGender();
        result = result * 59 + (($gender == null) ? 43 : $gender.hashCode());
        Object $email = getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        Object $avatar = getAvatar();
        result = result * 59 + (($avatar == null) ? 43 : $avatar.hashCode());
        result = result * 59 + getStatus();
        result = result * 59 + getEnable();
        result = result * 59 + getIsleader();
        result = result * 59 + getHide_mobile();
        Object $telephone = getTelephone();
        result = result * 59 + (($telephone == null) ? 43 : $telephone.hashCode());
        Object $order =  getOrder();
        result = result * 59 + (($order == null) ? 43 : $order.hashCode());
        result = result * 59 + getMain_department();
        Object $alias = getAlias();
        result = result * 59 + (($alias == null) ? 43 : $alias.hashCode());
        Object $address = getAddress();
        result = result * 59 + (($address == null) ? 43 : $address.hashCode());
        Object $thumb_avatar = getThumb_avatar();
        result = result * 59 + (($thumb_avatar == null) ? 43 : $thumb_avatar.hashCode());
        Object $direct_leader =  getDirect_leader();
        return result * 59 + (($direct_leader == null) ? 43 : $direct_leader.hashCode());
    }
    @Override
    public String toString() {
        return "UserVo(userid=" + getUserid() + ", name=" + getName() + ", department=" + getDepartment() + ", position=" + getPosition() + ", mobile=" + getMobile() + ", gender=" + getGender() + ", email=" + getEmail() + ", avatar=" + getAvatar() + ", status=" + getStatus() + ", enable=" + getEnable() + ", isleader=" + getIsleader() + ", hide_mobile=" + getHide_mobile() + ", telephone=" + getTelephone() + ", order=" + getOrder() + ", main_department=" + getMain_department() + ", alias=" + getAlias() + ", address=" + getAddress() + ", thumb_avatar=" + getThumb_avatar() + ", direct_leader=" + getDirect_leader() + ")";
    }

    public String getUserid() {
        /* 13 */
        return this.userid;
    }

    public String getName() {
        /* 15 */
        return this.name;
    }

    public List<String> getDepartment() {
        /* 17 */
        return this.department;
    }

    public String getPosition() {
        /* 19 */
        return this.position;
    }

    public String getMobile() {
        /* 21 */
        return this.mobile;
    }

    public String getGender() {
        /* 23 */
        return this.gender;
    }

    public String getEmail() {
        /* 25 */
        return this.email;
    }

    public String getAvatar() {
        /* 27 */
        return this.avatar;
    }

    public int getStatus() {
        /* 29 */
        return this.status;
    }

    public int getEnable() {
        /* 31 */
        return this.enable;
    }

    /* 33 */
    public int getIsleader() {
        return this.isleader;
    }

    /* 34 */
    public int getHide_mobile() {
        return this.hide_mobile;
    }

    /* 35 */
    public String getTelephone() {
        return this.telephone;
    }

    public List<String> getOrder() {
        /* 36 */
        return this.order;
    }

    /* 38 */
    public int getMain_department() {
        return this.main_department;
    }

    public String getAlias() {
        /* 39 */
        return this.alias;
    }

    /* 41 */
    public String getAddress() {
        return this.address;
    }

    public String getThumb_avatar() {
        /* 42 */
        return this.thumb_avatar;
    }

    public List<String> getDirect_leader() {
        /* 44 */
        return this.direct_leader;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\UserVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */