package com.cms.system_service.system.domain;

import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.framework.aspectj.lang.annotation.Excel;

public class SysDictType extends BaseEntity {
    @Excel(name = "字典主键")
    private Long dictId;
    @Excel(name = "字典名称")
    private String dictName;
    @Excel(name = "字典类型")
    private String dictType;
    @Excel(name = "字典分组(S系统字典 U用户字典)")
    private String dictGroup;
    @Excel(name = "字典状态")
    private String status;

    public void setDictId(Long dictId) {
        /* 19 */
        this.dictId = dictId;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public void setDictGroup(String dictGroup) {
        this.dictGroup = dictGroup;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SysDictType)) return false;
        SysDictType other = (SysDictType) o;
        if (!other.canEqual(this)) return false;
        Object this$dictId = getDictId(), other$dictId = other.getDictId();
        if ((this$dictId == null) ? (other$dictId != null) : !this$dictId.equals(other$dictId)) return false;
        Object this$dictName = getDictName(), other$dictName = other.getDictName();
        if ((this$dictName == null) ? (other$dictName != null) : !this$dictName.equals(other$dictName)) return false;
        Object this$dictType = getDictType(), other$dictType = other.getDictType();
        if ((this$dictType == null) ? (other$dictType != null) : !this$dictType.equals(other$dictType)) return false;
        Object this$dictGroup = getDictGroup(), other$dictGroup = other.getDictGroup();
        if ((this$dictGroup == null) ? (other$dictGroup != null) : !this$dictGroup.equals(other$dictGroup))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SysDictType;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $dictId = getDictId();
        result = result * 59 + (($dictId == null) ? 43 : $dictId.hashCode());
        Object $dictName = getDictName();
        result = result * 59 + (($dictName == null) ? 43 : $dictName.hashCode());
        Object $dictType = getDictType();
        result = result * 59 + (($dictType == null) ? 43 : $dictType.hashCode());
        Object $dictGroup = getDictGroup();
        result = result * 59 + (($dictGroup == null) ? 43 : $dictGroup.hashCode());
        Object $status = getStatus();
        return result * 59 + (($status == null) ? 43 : $status.hashCode());
    }

    public String toString() {
        return "SysDictType(dictId=" + getDictId() + ", dictName=" + getDictName() + ", dictType=" + getDictType() + ", dictGroup=" + getDictGroup() + ", status=" + getStatus() + ")";
    }


    public Long getDictId() {
        /* 25 */
        return this.dictId;
    }


    public String getDictName() {
        /* 31 */
        return this.dictName;
    }


    public String getDictType() {
        /* 37 */
        return this.dictType;
    }

    public String getDictGroup() {
        /* 41 */
        return this.dictGroup;
    }


    public String getStatus() {
        /* 47 */
        return this.status;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysDictType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */