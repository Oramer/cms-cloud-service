package com.cms.system_service.system.domain;


import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
import com.cms.base_service.framework.aspectj.lang.annotation.Excels;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class SysUser extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Excel(name = "用户序号", cellType = Excel.ColumnType.NUMERIC, prompt = "用户编号")
    private String userId;
    private String orgId;
    @Excel(name = "部门编号", type = Excel.Type.IMPORT)
    private String deptId;
    private String cloudPk;
    @Excel(name = "登录名称")
    private String userName;
    @Excel(name = "用户名称")
    private String nickName;
    @Excel(name = "用户邮箱")
    private String email;
    @Excel(name = "手机号码")
    private String phonenumber;
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;
    private String avatar;
    private String password;
    @Excel(name = "帐号状态", readConverterExp = "0=正常,1=停用")
    private String status;
    private String delFlag;
    private String userType;
    @Excel(name = "最后登录IP", type = Excel.Type.EXPORT)
    private String loginIp;
    @Excel(name = "最后登录时间", width = 30.0D, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Excel.Type.EXPORT)
    private Date loginDate;
    private int isPoster;
    private int isManger;
    private int isQuser;
    private Boolean isSuperAdmin;
    private String stationCharge;
    @Excels({@Excel(name = "部门名称", targetAttr = "deptName", type = Excel.Type.EXPORT), @Excel(name = "部门负责人", targetAttr = "leader", type = Excel.Type.EXPORT)})
    private Long roleId;

    /*  20 */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String jtoken;
    private String no10;
    private String ud1;
    private String ud2;
    private Integer ud3;
    private String ud4;
    private String ud5;
    private String ud6;
    private String ud7;
    private String ud8;
    private String ud9;
    private String ud10;
    private SysDept dept;
    private List<SysRole> roles;
    private Long[] roleIds;
    private Long[] postIds;
    private Set<String> roleset;
    private Set<String> permissionset;
    private Integer orderCount;
    private BigDecimal orderMoney;
    private String fxRoleName;
    private BigDecimal firstPercentage;
    private BigDecimal secondPercentage;

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setCloudPk(String cloudPk) {
        this.cloudPk = cloudPk;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setIsPoster(int isPoster) {
        this.isPoster = isPoster;
    }

    public void setIsManger(int isManger) {
        this.isManger = isManger;
    }

    public void setIsQuser(int isQuser) {
        this.isQuser = isQuser;
    }

    public void setIsSuperAdmin(Boolean isSuperAdmin) {
        this.isSuperAdmin = isSuperAdmin;
    }

    public void setStationCharge(String stationCharge) {
        this.stationCharge = stationCharge;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setJtoken(String jtoken) {
        this.jtoken = jtoken;
    }

    public void setNo10(String no10) {
        this.no10 = no10;
    }

    public void setUd1(String ud1) {
        this.ud1 = ud1;
    }

    public void setUd2(String ud2) {
        this.ud2 = ud2;
    }

    public void setUd3(Integer ud3) {
        this.ud3 = ud3;
    }

    public void setUd4(String ud4) {
        this.ud4 = ud4;
    }

    public void setUd5(String ud5) {
        this.ud5 = ud5;
    }

    public void setUd6(String ud6) {
        this.ud6 = ud6;
    }

    public void setUd7(String ud7) {
        this.ud7 = ud7;
    }

    public void setUd8(String ud8) {
        this.ud8 = ud8;
    }

    public void setUd9(String ud9) {
        this.ud9 = ud9;
    }

    public void setUd10(String ud10) {
        this.ud10 = ud10;
    }

    public void setDept(SysDept dept) {
        this.dept = dept;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

    public void setRoleIds(Long[] roleIds) {
        this.roleIds = roleIds;
    }

    public void setPostIds(Long[] postIds) {
        this.postIds = postIds;
    }

    public void setRoleset(Set<String> roleset) {
        this.roleset = roleset;
    }

    public void setPermissionset(Set<String> permissionset) {
        this.permissionset = permissionset;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public void setFxRoleName(String fxRoleName) {
        this.fxRoleName = fxRoleName;
    }

    public void setFirstPercentage(BigDecimal firstPercentage) {
        this.firstPercentage = firstPercentage;
    }

    public void setSecondPercentage(BigDecimal secondPercentage) {
        this.secondPercentage = secondPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SysUser)) return false;
        SysUser other = (SysUser) o;
        if (!other.canEqual(this)) return false;
        Object this$userId = getUserId(), other$userId = other.getUserId();
        if ((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId)) return false;
        Object this$orgId = getOrgId(), other$orgId = other.getOrgId();
        if ((this$orgId == null) ? (other$orgId != null) : !this$orgId.equals(other$orgId)) return false;
        Object this$deptId = getDeptId(), other$deptId = other.getDeptId();
        if ((this$deptId == null) ? (other$deptId != null) : !this$deptId.equals(other$deptId)) return false;
        Object this$cloudPk = getCloudPk(), other$cloudPk = other.getCloudPk();
        if ((this$cloudPk == null) ? (other$cloudPk != null) : !this$cloudPk.equals(other$cloudPk)) return false;
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
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$delFlag = getDelFlag(), other$delFlag = other.getDelFlag();
        if ((this$delFlag == null) ? (other$delFlag != null) : !this$delFlag.equals(other$delFlag)) return false;
        Object this$userType = getUserType(), other$userType = other.getUserType();
        if ((this$userType == null) ? (other$userType != null) : !this$userType.equals(other$userType)) return false;
        Object this$loginIp = getLoginIp(), other$loginIp = other.getLoginIp();
        if ((this$loginIp == null) ? (other$loginIp != null) : !this$loginIp.equals(other$loginIp)) return false;
        Object this$loginDate = getLoginDate(), other$loginDate = other.getLoginDate();
        if ((this$loginDate == null) ? (other$loginDate != null) : !this$loginDate.equals(other$loginDate))
            return false;
        if (getIsPoster() != other.getIsPoster()) return false;
        if (getIsManger() != other.getIsManger()) return false;
        if (getIsQuser() != other.getIsQuser()) return false;
        Object this$isSuperAdmin = getIsSuperAdmin(), other$isSuperAdmin = other.getIsSuperAdmin();
        if ((this$isSuperAdmin == null) ? (other$isSuperAdmin != null) : !this$isSuperAdmin.equals(other$isSuperAdmin))
            return false;
        Object this$stationCharge = getStationCharge(), other$stationCharge = other.getStationCharge();
        if ((this$stationCharge == null) ? (other$stationCharge != null) : !this$stationCharge.equals(other$stationCharge))
            return false;
        Object this$roleId = getRoleId(), other$roleId = other.getRoleId();
        if ((this$roleId == null) ? (other$roleId != null) : !this$roleId.equals(other$roleId)) return false;
        Object this$jtoken = getJtoken(), other$jtoken = other.getJtoken();
        if ((this$jtoken == null) ? (other$jtoken != null) : !this$jtoken.equals(other$jtoken)) return false;
        Object this$no10 = getNo10(), other$no10 = other.getNo10();
        if ((this$no10 == null) ? (other$no10 != null) : !this$no10.equals(other$no10)) return false;
        Object this$ud1 = getUd1(), other$ud1 = other.getUd1();
        if ((this$ud1 == null) ? (other$ud1 != null) : !this$ud1.equals(other$ud1)) return false;
        Object this$ud2 = getUd2(), other$ud2 = other.getUd2();
        if ((this$ud2 == null) ? (other$ud2 != null) : !this$ud2.equals(other$ud2)) return false;
        Object this$ud3 = getUd3(), other$ud3 = other.getUd3();
        if ((this$ud3 == null) ? (other$ud3 != null) : !this$ud3.equals(other$ud3)) return false;
        Object this$ud4 = getUd4(), other$ud4 = other.getUd4();
        if ((this$ud4 == null) ? (other$ud4 != null) : !this$ud4.equals(other$ud4)) return false;
        Object this$ud5 = getUd5(), other$ud5 = other.getUd5();
        if ((this$ud5 == null) ? (other$ud5 != null) : !this$ud5.equals(other$ud5)) return false;
        Object this$ud6 = getUd6(), other$ud6 = other.getUd6();
        if ((this$ud6 == null) ? (other$ud6 != null) : !this$ud6.equals(other$ud6)) return false;
        Object this$ud7 = getUd7(), other$ud7 = other.getUd7();
        if ((this$ud7 == null) ? (other$ud7 != null) : !this$ud7.equals(other$ud7)) return false;
        Object this$ud8 = getUd8(), other$ud8 = other.getUd8();
        if ((this$ud8 == null) ? (other$ud8 != null) : !this$ud8.equals(other$ud8)) return false;
        Object this$ud9 = getUd9(), other$ud9 = other.getUd9();
        if ((this$ud9 == null) ? (other$ud9 != null) : !this$ud9.equals(other$ud9)) return false;
        Object this$ud10 = getUd10(), other$ud10 = other.getUd10();
        if ((this$ud10 == null) ? (other$ud10 != null) : !this$ud10.equals(other$ud10)) return false;
        Object this$dept = getDept(), other$dept = other.getDept();
        if ((this$dept == null) ? (other$dept != null) : !this$dept.equals(other$dept)) return false;
        Object this$roles =  getRoles(), other$roles =  other.getRoles();
        if ((this$roles == null) ? (other$roles != null) : !this$roles.equals(other$roles)) return false;
        if (!Arrays.deepEquals((Object[]) getRoleIds(), (Object[]) other.getRoleIds())) return false;
        if (!Arrays.deepEquals((Object[]) getPostIds(), (Object[]) other.getPostIds())) return false;
        Object this$roleset =  getRoleset(), other$roleset =  other.getRoleset();
        if ((this$roleset == null) ? (other$roleset != null) : !this$roleset.equals(other$roleset)) return false;
        Object this$permissionset =  getPermissionset(), other$permissionset =  other.getPermissionset();
        if ((this$permissionset == null) ? (other$permissionset != null) : !this$permissionset.equals(other$permissionset))
            return false;
        Object this$orderCount = getOrderCount(), other$orderCount = other.getOrderCount();
        if ((this$orderCount == null) ? (other$orderCount != null) : !this$orderCount.equals(other$orderCount))
            return false;
        Object this$orderMoney = getOrderMoney(), other$orderMoney = other.getOrderMoney();
        if ((this$orderMoney == null) ? (other$orderMoney != null) : !this$orderMoney.equals(other$orderMoney))
            return false;
        Object this$fxRoleName = getFxRoleName(), other$fxRoleName = other.getFxRoleName();
        if ((this$fxRoleName == null) ? (other$fxRoleName != null) : !this$fxRoleName.equals(other$fxRoleName))
            return false;
        Object this$firstPercentage = getFirstPercentage(), other$firstPercentage = other.getFirstPercentage();
        if ((this$firstPercentage == null) ? (other$firstPercentage != null) : !this$firstPercentage.equals(other$firstPercentage))
            return false;
        Object this$secondPercentage = getSecondPercentage(), other$secondPercentage = other.getSecondPercentage();
        return !((this$secondPercentage == null) ? (other$secondPercentage != null) : !this$secondPercentage.equals(other$secondPercentage));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SysUser;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $userId = getUserId();
        result = result * 59 + (($userId == null) ? 43 : $userId.hashCode());
        Object $orgId = getOrgId();
        result = result * 59 + (($orgId == null) ? 43 : $orgId.hashCode());
        Object $deptId = getDeptId();
        result = result * 59 + (($deptId == null) ? 43 : $deptId.hashCode());
        Object $cloudPk = getCloudPk();
        result = result * 59 + (($cloudPk == null) ? 43 : $cloudPk.hashCode());
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
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $delFlag = getDelFlag();
        result = result * 59 + (($delFlag == null) ? 43 : $delFlag.hashCode());
        Object $userType = getUserType();
        result = result * 59 + (($userType == null) ? 43 : $userType.hashCode());
        Object $loginIp = getLoginIp();
        result = result * 59 + (($loginIp == null) ? 43 : $loginIp.hashCode());
        Object $loginDate = getLoginDate();
        result = result * 59 + (($loginDate == null) ? 43 : $loginDate.hashCode());
        result = result * 59 + getIsPoster();
        result = result * 59 + getIsManger();
        result = result * 59 + getIsQuser();
        Object $isSuperAdmin = getIsSuperAdmin();
        result = result * 59 + (($isSuperAdmin == null) ? 43 : $isSuperAdmin.hashCode());
        Object $stationCharge = getStationCharge();
        result = result * 59 + (($stationCharge == null) ? 43 : $stationCharge.hashCode());
        Object $roleId = getRoleId();
        result = result * 59 + (($roleId == null) ? 43 : $roleId.hashCode());
        Object $jtoken = getJtoken();
        result = result * 59 + (($jtoken == null) ? 43 : $jtoken.hashCode());
        Object $no10 = getNo10();
        result = result * 59 + (($no10 == null) ? 43 : $no10.hashCode());
        Object $ud1 = getUd1();
        result = result * 59 + (($ud1 == null) ? 43 : $ud1.hashCode());
        Object $ud2 = getUd2();
        result = result * 59 + (($ud2 == null) ? 43 : $ud2.hashCode());
        Object $ud3 = getUd3();
        result = result * 59 + (($ud3 == null) ? 43 : $ud3.hashCode());
        Object $ud4 = getUd4();
        result = result * 59 + (($ud4 == null) ? 43 : $ud4.hashCode());
        Object $ud5 = getUd5();
        result = result * 59 + (($ud5 == null) ? 43 : $ud5.hashCode());
        Object $ud6 = getUd6();
        result = result * 59 + (($ud6 == null) ? 43 : $ud6.hashCode());
        Object $ud7 = getUd7();
        result = result * 59 + (($ud7 == null) ? 43 : $ud7.hashCode());
        Object $ud8 = getUd8();
        result = result * 59 + (($ud8 == null) ? 43 : $ud8.hashCode());
        Object $ud9 = getUd9();
        result = result * 59 + (($ud9 == null) ? 43 : $ud9.hashCode());
        Object $ud10 = getUd10();
        result = result * 59 + (($ud10 == null) ? 43 : $ud10.hashCode());
        Object $dept = getDept();
        result = result * 59 + (($dept == null) ? 43 : $dept.hashCode());
        Object $roles =  getRoles();
        result = result * 59 + (($roles == null) ? 43 : $roles.hashCode());
        result = result * 59 + Arrays.deepHashCode((Object[]) getRoleIds());
        result = result * 59 + Arrays.deepHashCode((Object[]) getPostIds());
        Object $roleset =  getRoleset();
        result = result * 59 + (($roleset == null) ? 43 : $roleset.hashCode());
        Object $permissionset =  getPermissionset();
        result = result * 59 + (($permissionset == null) ? 43 : $permissionset.hashCode());
        Object $orderCount = getOrderCount();
        result = result * 59 + (($orderCount == null) ? 43 : $orderCount.hashCode());
        Object $orderMoney = getOrderMoney();
        result = result * 59 + (($orderMoney == null) ? 43 : $orderMoney.hashCode());
        Object $fxRoleName = getFxRoleName();
        result = result * 59 + (($fxRoleName == null) ? 43 : $fxRoleName.hashCode());
        Object $firstPercentage = getFirstPercentage();
        result = result * 59 + (($firstPercentage == null) ? 43 : $firstPercentage.hashCode());
        Object $secondPercentage = getSecondPercentage();
        return result * 59 + (($secondPercentage == null) ? 43 : $secondPercentage.hashCode());
    }

    @Override
    public String toString() {
        return "SysUser(userId=" + getUserId() + ", orgId=" + getOrgId() + ", deptId=" + getDeptId() + ", cloudPk=" + getCloudPk() + ", userName=" + getUserName() + ", nickName=" + getNickName() + ", email=" + getEmail() + ", phonenumber=" + getPhonenumber() + ", sex=" + getSex() + ", avatar=" + getAvatar() + ", password=" + getPassword() + ", status=" + getStatus() + ", delFlag=" + getDelFlag() + ", userType=" + getUserType() + ", loginIp=" + getLoginIp() + ", loginDate=" + getLoginDate() + ", isPoster=" + getIsPoster() + ", isManger=" + getIsManger() + ", isQuser=" + getIsQuser() + ", isSuperAdmin=" + getIsSuperAdmin() + ", stationCharge=" + getStationCharge() + ", roleId=" + getRoleId() + ", jtoken=" + getJtoken() + ", no10=" + getNo10() + ", ud1=" + getUd1() + ", ud2=" + getUd2() + ", ud3=" + getUd3() + ", ud4=" + getUd4() + ", ud5=" + getUd5() + ", ud6=" + getUd6() + ", ud7=" + getUd7() + ", ud8=" + getUd8() + ", ud9=" + getUd9() + ", ud10=" + getUd10() + ", dept=" + getDept() + ", roles=" + getRoles() + ", roleIds=" + Arrays.deepToString((Object[]) getRoleIds()) + ", postIds=" + Arrays.deepToString((Object[]) getPostIds()) + ", roleset=" + getRoleset() + ", permissionset=" + getPermissionset() + ", orderCount=" + getOrderCount() + ", orderMoney=" + getOrderMoney() + ", fxRoleName=" + getFxRoleName() + ", firstPercentage=" + getFirstPercentage() + ", secondPercentage=" + getSecondPercentage() + ")";
    }


    public String getUserId() {
        /*  28 */
        return this.userId;
    }

    public String getOrgId() {
        /*  30 */
        return this.orgId;
    }


    public String getDeptId() {
        /*  36 */
        return this.deptId;
    }

    public String getCloudPk() {
        /*  40 */
        return this.cloudPk;
    }


    public String getUserName() {
        /*  46 */
        return this.userName;
    }


    public String getNickName() {
        /*  52 */
        return this.nickName;
    }


    public String getEmail() {
        /*  58 */
        return this.email;
    }


    public String getPhonenumber() {
        /*  64 */
        return this.phonenumber;
    }


    public String getSex() {
        /*  70 */
        return this.sex;
    }


    public String getAvatar() {
        /*  75 */
        return this.avatar;
    }


    public String getPassword() {
        /*  80 */
        return this.password;
    }


    public String getStatus() {
        /*  86 */
        return this.status;
    }


    public String getDelFlag() {
        /*  91 */
        return this.delFlag;
    }

    public String getUserType() {
        /*  93 */
        return this.userType;
    }


    public String getLoginIp() {
        /*  99 */
        return this.loginIp;
    }


    public Date getLoginDate() {
        /* 105 */
        return this.loginDate;
    }


    public int getIsPoster() {
        /* 110 */
        return this.isPoster;
    }

    public int getIsManger() {
        /* 114 */
        return this.isManger;
    }

    public int getIsQuser() {
        /* 118 */
        return this.isQuser;
    }

    public Boolean getIsSuperAdmin() {
        /* 121 */
        return this.isSuperAdmin;
    }

    public String getStationCharge() {
        /* 123 */
        return this.stationCharge;
    }


    public Long getRoleId() {
        /* 136 */
        return this.roleId;
    }

    public String getJtoken() {
        /* 138 */
        return this.jtoken;
    }

    /* 140 */
    public String getNo10() {
        return this.no10;
    }

    /* 141 */
    public String getUd1() {
        return this.ud1;
    }

    /* 142 */
    public String getUd2() {
        return this.ud2;
    }

    /* 143 */
    public Integer getUd3() {
        return this.ud3;
    }

    /* 144 */
    public String getUd4() {
        return this.ud4;
    }

    /* 145 */
    public String getUd5() {
        return this.ud5;
    }

    /* 146 */
    public String getUd6() {
        return this.ud6;
    }

    /* 147 */
    public String getUd7() {
        return this.ud7;
    }

    /* 148 */
    public String getUd8() {
        return this.ud8;
    }

    /* 149 */
    public String getUd9() {
        return this.ud9;
    }

    public String getUd10() {
        /* 150 */
        return this.ud10;
    }

    public SysDept getDept() {
        /* 152 */
        return this.dept;
    }


    public List<SysRole> getRoles() {
        /* 157 */
        return this.roles;
    }


    public Long[] getRoleIds() {
        /* 162 */
        return this.roleIds;
    }


    public Long[] getPostIds() {
        /* 167 */
        return this.postIds;
    }

    public Set<String> getRoleset() {
        /* 169 */
        return this.roleset;
    }

    public Set<String> getPermissionset() {
        /* 171 */
        return this.permissionset;
    }

    public Integer getOrderCount() {
        /* 174 */
        return this.orderCount;
    }

    public BigDecimal getOrderMoney() {
        /* 176 */
        return this.orderMoney;
    }

    public String getFxRoleName() {
        /* 178 */
        return this.fxRoleName;
    }

    public BigDecimal getFirstPercentage() {
        /* 180 */
        return this.firstPercentage;
    }

    public BigDecimal getSecondPercentage() {
        /* 182 */
        return this.secondPercentage;
    }

    public SysUser(String userId) {
    }

    public SysUser() {
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */