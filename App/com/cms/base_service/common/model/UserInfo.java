package com.cms.base_service.common.model;

import com.cms.base_service.annotation.Excel;
import com.cms.system_service.system.domain.SysDept;
import com.cms.system_service.system.domain.SysRole;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class UserInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Excel(name = "用户ID")
    private String userId;
    @Excel(name = "部门ID")
    private String deptId;
    @Excel(name = "用户账号")
    private String userName;
    @Excel(name = "用户昵称")
    private String nickName;
    @Excel(name = "用户邮箱")
    private String email;
    @Excel(name = "手机号码")
    private String phonenumber;
    @Excel(name = "用户性别")
    private String sex;
    @Excel(name = "用户头像")
    private String avatar;
    private String password;
    private String salt;

    /*  17 */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String status;
    private String delFlag;
    private String loginIp;
    private Date loginDate;
    private SysDept dept;
    private List<SysRole> roles;
    private String[] roleIds;
    private String[] postIds;
    private String jtoken;
    private Set<String> roleset;
    private Set<String> permissionset;

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setDept(SysDept dept) {
        this.dept = dept;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

    public void setRoleIds(String[] roleIds) {
        this.roleIds = roleIds;
    }

    public void setPostIds(String[] postIds) {
        this.postIds = postIds;
    }

    public void setJtoken(String jtoken) {
        this.jtoken = jtoken;
    }

    public void setRoleset(Set<String> roleset) {
        this.roleset = roleset;
    }

    public void setPermissionset(Set<String> permissionset) {
        this.permissionset = permissionset;
    }
    @Override
    /*  18 */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.base_service.common.model.UserInfo)) return false;
        com.cms.base_service.common.model.UserInfo other = (com.cms.base_service.common.model.UserInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$userId = getUserId(), other$userId = other.getUserId();
        if ((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId)) return false;
        Object this$deptId = getDeptId(), other$deptId = other.getDeptId();
        if ((this$deptId == null) ? (other$deptId != null) : !this$deptId.equals(other$deptId)) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$nickName = getNickName(), other$nickName = other.getNickName();
        if ((this$nickName == null) ? (other$nickName != null) : !this$nickName.equals(other$nickName)) return false;
        Object this$email = getEmail(), other$email = other.getEmail();
        if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email)) return false;
        Object this$phonenumber = getPhonenumber(), other$phonenumber = other.getPhonenumber();
        if ((this$phonenumber == null) ? (other$phonenumber != null) : !this$phonenumber.equals(other$phonenumber))
            return false;
        Object this$sex = getSex(), other$sex = other.getSex();
        if ((this$sex == null) ? (other$sex != null) : !this$sex.equals(other$sex)) return false;
        Object this$avatar = getAvatar(), other$avatar = other.getAvatar();
        if ((this$avatar == null) ? (other$avatar != null) : !this$avatar.equals(other$avatar)) return false;
        Object this$password = getPassword(), other$password = other.getPassword();
        if ((this$password == null) ? (other$password != null) : !this$password.equals(other$password)) return false;
        Object this$salt = getSalt(), other$salt = other.getSalt();
        if ((this$salt == null) ? (other$salt != null) : !this$salt.equals(other$salt)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$delFlag = getDelFlag(), other$delFlag = other.getDelFlag();
        if ((this$delFlag == null) ? (other$delFlag != null) : !this$delFlag.equals(other$delFlag)) return false;
        Object this$loginIp = getLoginIp(), other$loginIp = other.getLoginIp();
        if ((this$loginIp == null) ? (other$loginIp != null) : !this$loginIp.equals(other$loginIp)) return false;
        Object this$loginDate = getLoginDate(), other$loginDate = other.getLoginDate();
        if ((this$loginDate == null) ? (other$loginDate != null) : !this$loginDate.equals(other$loginDate))
            return false;
        Object this$dept = getDept(), other$dept = other.getDept();
        if ((this$dept == null) ? (other$dept != null) : !this$dept.equals(other$dept)) return false;
        Object this$roles =  getRoles(), other$roles =  other.getRoles();
        if ((this$roles == null) ? (other$roles != null) : !this$roles.equals(other$roles)) return false;
        if (!Arrays.deepEquals((Object[]) getRoleIds(), (Object[]) other.getRoleIds())) return false;
        if (!Arrays.deepEquals((Object[]) getPostIds(), (Object[]) other.getPostIds())) return false;
        Object this$jtoken = getJtoken(), other$jtoken = other.getJtoken();
        if ((this$jtoken == null) ? (other$jtoken != null) : !this$jtoken.equals(other$jtoken)) return false;
        Object this$roleset =  getRoleset(), other$roleset =  other.getRoleset();
        if ((this$roleset == null) ? (other$roleset != null) : !this$roleset.equals(other$roleset)) return false;
        Object this$permissionset =  getPermissionset(), other$permissionset =  other.getPermissionset();
        return !((this$permissionset == null) ? (other$permissionset != null) : !this$permissionset.equals(other$permissionset));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.base_service.common.model.UserInfo;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $userId = getUserId();
        result = result * 59 + (($userId == null) ? 43 : $userId.hashCode());
        Object $deptId = getDeptId();
        result = result * 59 + (($deptId == null) ? 43 : $deptId.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $nickName = getNickName();
        result = result * 59 + (($nickName == null) ? 43 : $nickName.hashCode());
        Object $email = getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        Object $phonenumber = getPhonenumber();
        result = result * 59 + (($phonenumber == null) ? 43 : $phonenumber.hashCode());
        Object $sex = getSex();
        result = result * 59 + (($sex == null) ? 43 : $sex.hashCode());
        Object $avatar = getAvatar();
        result = result * 59 + (($avatar == null) ? 43 : $avatar.hashCode());
        Object $password = getPassword();
        result = result * 59 + (($password == null) ? 43 : $password.hashCode());
        Object $salt = getSalt();
        result = result * 59 + (($salt == null) ? 43 : $salt.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $delFlag = getDelFlag();
        result = result * 59 + (($delFlag == null) ? 43 : $delFlag.hashCode());
        Object $loginIp = getLoginIp();
        result = result * 59 + (($loginIp == null) ? 43 : $loginIp.hashCode());
        Object $loginDate = getLoginDate();
        result = result * 59 + (($loginDate == null) ? 43 : $loginDate.hashCode());
        Object $dept = getDept();
        result = result * 59 + (($dept == null) ? 43 : $dept.hashCode());
        Object $roles =  getRoles();
        result = result * 59 + (($roles == null) ? 43 : $roles.hashCode());
        result = result * 59 + Arrays.deepHashCode((Object[]) getRoleIds());
        result = result * 59 + Arrays.deepHashCode((Object[]) getPostIds());
        Object $jtoken = getJtoken();
        result = result * 59 + (($jtoken == null) ? 43 : $jtoken.hashCode());
        Object $roleset =  getRoleset();
        result = result * 59 + (($roleset == null) ? 43 : $roleset.hashCode());
        Object $permissionset =  getPermissionset();
        return result * 59 + (($permissionset == null) ? 43 : $permissionset.hashCode());
    }


    public String getUserId() {
        /*  26 */
        return this.userId;
    }


    public String getDeptId() {
        /*  32 */
        return this.deptId;
    }


    public String getUserName() {
        /*  38 */
        return this.userName;
    }


    public String getNickName() {
        /*  44 */
        return this.nickName;
    }


    public String getEmail() {
        /*  50 */
        return this.email;
    }


    public String getPhonenumber() {
        /*  56 */
        return this.phonenumber;
    }


    public String getSex() {
        /*  62 */
        return this.sex;
    }


    public String getAvatar() {
        /*  68 */
        return this.avatar;
    }


    public String getPassword() {
        /*  73 */
        return this.password;
    }


    public String getSalt() {
        /*  78 */
        return this.salt;
    }


    public String getStatus() {
        /*  83 */
        return this.status;
    }


    public String getDelFlag() {
        /*  88 */
        return this.delFlag;
    }


    public String getLoginIp() {
        /*  93 */
        return this.loginIp;
    }


    public Date getLoginDate() {
        /*  98 */
        return this.loginDate;
    }


    public SysDept getDept() {
        /* 103 */
        return this.dept;
    }


    public List<SysRole> getRoles() {
        /* 108 */
        return this.roles;
    }


    public String[] getRoleIds() {
        /* 113 */
        return this.roleIds;
    }


    public String[] getPostIds() {
        /* 118 */
        return this.postIds;
    }

    public String getJtoken() {
        /* 120 */
        return this.jtoken;
    }

    public Set<String> getRoleset() {
        /* 122 */
        return this.roleset;
    }

    public Set<String> getPermissionset() {
        /* 124 */
        return this.permissionset;
    }

    public UserInfo() {
    }

    public UserInfo(String userId) {
        /* 130 */
        this.userId = userId;
    }

    @Override
    public String toString() {
        /* 135 */
        return "UserInfo{userId='" + this.userId + '\'' + ", deptId='" + this.deptId + '\'' + ", userName='" + this.userName + '\'' + ", nickName='" + this.nickName + '\'' + ", email='" + this.email + '\'' + ", phonenumber='" + this.phonenumber + '\'' + ", sex='" + this.sex + '\'' + ", avatar='" + this.avatar + '\'' + ", password='" + this.password + '\'' + ", salt='" + this.salt + '\'' + ", status='" + this.status + '\'' + ", delFlag='" + this.delFlag + '\'' + ", loginIp='" + this.loginIp + '\'' + ", loginDate=" + this.loginDate + ", dept=" + this.dept + ", roles=" + this.roles + ", roleIds=" +
















                /* 152 */       Arrays.toString((Object[]) this.roleIds) + ", postIds=" +
                /* 153 */       Arrays.toString((Object[]) this.postIds) + ", jtoken='" + this.jtoken + '\'' + ", roleset=" + this.roleset + ", permissionset=" + this.permissionset + '}';
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\UserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */