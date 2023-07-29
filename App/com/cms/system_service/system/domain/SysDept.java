package com.cms.system_service.system.domain;

import com.cms.base_service.common.model.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class SysDept extends BaseEntity {
    private String deptId;
    private String parentId;
    private String ancestors;
    private String deptName;
    private String orderNum;
    private String leader;
    private String phone;
    private String email;
    private String status;
    private String delFlag;
    private String cropFlag;
    private String deptCode;
    private String parentName;

    /* 20 */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void setCropFlag(String cropFlag) {
        this.cropFlag = cropFlag;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setChildren(List<com.cms.system_service.system.domain.SysDept> children) {
        this.children = children;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.system_service.system.domain.SysDept)) return false;
        com.cms.system_service.system.domain.SysDept other = (com.cms.system_service.system.domain.SysDept) o;
        if (!other.canEqual(this)) return false;
        Object this$deptId = getDeptId(), other$deptId = other.getDeptId();
        if ((this$deptId == null) ? (other$deptId != null) : !this$deptId.equals(other$deptId)) return false;
        Object this$parentId = getParentId(), other$parentId = other.getParentId();
        if ((this$parentId == null) ? (other$parentId != null) : !this$parentId.equals(other$parentId)) return false;
        Object this$ancestors = getAncestors(), other$ancestors = other.getAncestors();
        if ((this$ancestors == null) ? (other$ancestors != null) : !this$ancestors.equals(other$ancestors))
            return false;
        Object this$deptName = getDeptName(), other$deptName = other.getDeptName();
        if ((this$deptName == null) ? (other$deptName != null) : !this$deptName.equals(other$deptName)) return false;
        Object this$orderNum = getOrderNum(), other$orderNum = other.getOrderNum();
        if ((this$orderNum == null) ? (other$orderNum != null) : !this$orderNum.equals(other$orderNum)) return false;
        Object this$leader = getLeader(), other$leader = other.getLeader();
        if ((this$leader == null) ? (other$leader != null) : !this$leader.equals(other$leader)) return false;
        Object this$phone = getPhone(), other$phone = other.getPhone();
        if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone)) return false;
        Object this$email = getEmail(), other$email = other.getEmail();
        if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$delFlag = getDelFlag(), other$delFlag = other.getDelFlag();
        if ((this$delFlag == null) ? (other$delFlag != null) : !this$delFlag.equals(other$delFlag)) return false;
        Object this$cropFlag = getCropFlag(), other$cropFlag = other.getCropFlag();
        if ((this$cropFlag == null) ? (other$cropFlag != null) : !this$cropFlag.equals(other$cropFlag)) return false;
        Object this$deptCode = getDeptCode(), other$deptCode = other.getDeptCode();
        if ((this$deptCode == null) ? (other$deptCode != null) : !this$deptCode.equals(other$deptCode)) return false;
        Object this$parentName = getParentName(), other$parentName = other.getParentName();
        if ((this$parentName == null) ? (other$parentName != null) : !this$parentName.equals(other$parentName))
            return false;
        Object this$children =  getChildren(), other$children =  other.getChildren();
        return !((this$children == null) ? (other$children != null) : !this$children.equals(other$children));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.system_service.system.domain.SysDept;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $deptId = getDeptId();
        result = result * 59 + (($deptId == null) ? 43 : $deptId.hashCode());
        Object $parentId = getParentId();
        result = result * 59 + (($parentId == null) ? 43 : $parentId.hashCode());
        Object $ancestors = getAncestors();
        result = result * 59 + (($ancestors == null) ? 43 : $ancestors.hashCode());
        Object $deptName = getDeptName();
        result = result * 59 + (($deptName == null) ? 43 : $deptName.hashCode());
        Object $orderNum = getOrderNum();
        result = result * 59 + (($orderNum == null) ? 43 : $orderNum.hashCode());
        Object $leader = getLeader();
        result = result * 59 + (($leader == null) ? 43 : $leader.hashCode());
        Object $phone = getPhone();
        result = result * 59 + (($phone == null) ? 43 : $phone.hashCode());
        Object $email = getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $delFlag = getDelFlag();
        result = result * 59 + (($delFlag == null) ? 43 : $delFlag.hashCode());
        Object $cropFlag = getCropFlag();
        result = result * 59 + (($cropFlag == null) ? 43 : $cropFlag.hashCode());
        Object $deptCode = getDeptCode();
        result = result * 59 + (($deptCode == null) ? 43 : $deptCode.hashCode());
        Object $parentName = getParentName();
        result = result * 59 + (($parentName == null) ? 43 : $parentName.hashCode());
        Object $children =  getChildren();
        return result * 59 + (($children == null) ? 43 : $children.hashCode());
    }
    @Override
    public String toString() {
        return "SysDept(deptId=" + getDeptId() + ", parentId=" + getParentId() + ", ancestors=" + getAncestors() + ", deptName=" + getDeptName() + ", orderNum=" + getOrderNum() + ", leader=" + getLeader() + ", phone=" + getPhone() + ", email=" + getEmail() + ", status=" + getStatus() + ", delFlag=" + getDelFlag() + ", cropFlag=" + getCropFlag() + ", deptCode=" + getDeptCode() + ", parentName=" + getParentName() + ", children=" + getChildren() + ")";
    }


    public String getDeptId() {
        /* 25 */
        return this.deptId;
    }


    public String getParentId() {
        /* 30 */
        return this.parentId;
    }


    public String getAncestors() {
        /* 35 */
        return this.ancestors;
    }


    public String getDeptName() {
        /* 40 */
        return this.deptName;
    }


    public String getOrderNum() {
        /* 45 */
        return this.orderNum;
    }


    public String getLeader() {
        /* 50 */
        return this.leader;
    }


    public String getPhone() {
        /* 55 */
        return this.phone;
    }


    public String getEmail() {
        /* 60 */
        return this.email;
    }


    public String getStatus() {
        /* 65 */
        return this.status;
    }


    public String getDelFlag() {
        /* 70 */
        return this.delFlag;
    }

    public String getCropFlag() {
        /* 74 */
        return this.cropFlag;
    }

    public String getDeptCode() {
        /* 78 */
        return this.deptCode;
    }


    public String getParentName() {
        /* 83 */
        return this.parentName;
    }


    /* 88 */   private List<com.cms.system_service.system.domain.SysDept> children = new ArrayList<>();

    public List<com.cms.system_service.system.domain.SysDept> getChildren() {
        return this.children;
    }

}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysDept.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */