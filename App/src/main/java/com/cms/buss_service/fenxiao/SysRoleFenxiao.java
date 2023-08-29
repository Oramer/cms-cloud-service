package com.cms.buss_service.fenxiao;

import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;

import java.math.BigDecimal;

public class SysRoleFenxiao extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Excel(name = "角色序号", cellType = Excel.ColumnType.NUMERIC)
    private Long roleId;
    @Excel(name = "角色名称")
    private String roleName;
    @Excel(name = "角色权限")
    private String roleKey;
    @Excel(name = "角色排序")
    private String roleSort;

    public void setRoleId(Long roleId) {
        /* 19 */
        this.roleId = roleId;
    }

    private String stationId;
    private BigDecimal firstPercentage;
    private BigDecimal secondPercentage;
    @Excel(name = "角色状态", readConverterExp = "0=正常,1=停用")
    private String status;
    private String delFlag;

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public void setRoleSort(String roleSort) {
        this.roleSort = roleSort;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setFirstPercentage(BigDecimal firstPercentage) {
        this.firstPercentage = firstPercentage;
    }

    public void setSecondPercentage(BigDecimal secondPercentage) {
        this.secondPercentage = secondPercentage;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SysRoleFenxiao)) return false;
        SysRoleFenxiao other = (SysRoleFenxiao) o;
        if (!other.canEqual(this)) return false;
        Object this$roleId = getRoleId(), other$roleId = other.getRoleId();
        if ((this$roleId == null) ? (other$roleId != null) : !this$roleId.equals(other$roleId)) return false;
        Object this$roleName = getRoleName(), other$roleName = other.getRoleName();
        if ((this$roleName == null) ? (other$roleName != null) : !this$roleName.equals(other$roleName)) return false;
        Object this$roleKey = getRoleKey(), other$roleKey = other.getRoleKey();
        if ((this$roleKey == null) ? (other$roleKey != null) : !this$roleKey.equals(other$roleKey)) return false;
        Object this$roleSort = getRoleSort(), other$roleSort = other.getRoleSort();
        if ((this$roleSort == null) ? (other$roleSort != null) : !this$roleSort.equals(other$roleSort)) return false;
        Object this$stationId = getStationId(), other$stationId = other.getStationId();
        if ((this$stationId == null) ? (other$stationId != null) : !this$stationId.equals(other$stationId))
            return false;
        Object this$firstPercentage = getFirstPercentage(), other$firstPercentage = other.getFirstPercentage();
        if ((this$firstPercentage == null) ? (other$firstPercentage != null) : !this$firstPercentage.equals(other$firstPercentage))
            return false;
        Object this$secondPercentage = getSecondPercentage(), other$secondPercentage = other.getSecondPercentage();
        if ((this$secondPercentage == null) ? (other$secondPercentage != null) : !this$secondPercentage.equals(other$secondPercentage))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$delFlag = getDelFlag(), other$delFlag = other.getDelFlag();
        return !((this$delFlag == null) ? (other$delFlag != null) : !this$delFlag.equals(other$delFlag));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SysRoleFenxiao;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $roleId = getRoleId();
        result = result * 59 + (($roleId == null) ? 43 : $roleId.hashCode());
        Object $roleName = getRoleName();
        result = result * 59 + (($roleName == null) ? 43 : $roleName.hashCode());
        Object $roleKey = getRoleKey();
        result = result * 59 + (($roleKey == null) ? 43 : $roleKey.hashCode());
        Object $roleSort = getRoleSort();
        result = result * 59 + (($roleSort == null) ? 43 : $roleSort.hashCode());
        Object $stationId = getStationId();
        result = result * 59 + (($stationId == null) ? 43 : $stationId.hashCode());
        Object $firstPercentage = getFirstPercentage();
        result = result * 59 + (($firstPercentage == null) ? 43 : $firstPercentage.hashCode());
        Object $secondPercentage = getSecondPercentage();
        result = result * 59 + (($secondPercentage == null) ? 43 : $secondPercentage.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $delFlag = getDelFlag();
        return result * 59 + (($delFlag == null) ? 43 : $delFlag.hashCode());
    }

    public String toString() {
        return "SysRoleFenxiao(roleId=" + getRoleId() + ", roleName=" + getRoleName() + ", roleKey=" + getRoleKey() + ", roleSort=" + getRoleSort() + ", stationId=" + getStationId() + ", firstPercentage=" + getFirstPercentage() + ", secondPercentage=" + getSecondPercentage() + ", status=" + getStatus() + ", delFlag=" + getDelFlag() + ")";
    }


    public Long getRoleId() {
        /* 27 */
        return this.roleId;
    }

    public String getRoleName() {
        /* 29 */
        return this.roleName;
    }

    public String getRoleKey() {
        /* 32 */
        return this.roleKey;
    }

    /* 35 */
    public String getRoleSort() {
        return this.roleSort;
    }

    /* 36 */
    public String getStationId() {
        return this.stationId;
    }

    public BigDecimal getFirstPercentage() {
        /* 37 */
        return this.firstPercentage;
    }

    public BigDecimal getSecondPercentage() {
        /* 39 */
        return this.secondPercentage;
    }

    public String getStatus() {
        /* 41 */
        return this.status;
    }


    public String getDelFlag() {
        /* 46 */
        return this.delFlag;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\fenxiao\SysRoleFenxiao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */