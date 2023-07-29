package com.cms.base_service.common;

import java.io.Serializable;
import java.util.List;

public class DeptVo implements Serializable {
    private String id;
    private String name;
    private String name_en;
    private List<String> department_leader;

    /* 11 */
    public void setId(String id) {
        this.id = id;
    }

    private String parentid;
    private String order;
    private String sourceid;
    private String ancestors;
    private List<com.cms.base_service.common.DeptVo> children;

    public void setName(String name) {
        this.name = name;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public void setDepartment_leader(List<String> department_leader) {
        this.department_leader = department_leader;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public void setChildren(List<com.cms.base_service.common.DeptVo> children) {
        this.children = children;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.base_service.common.DeptVo)) return false;
        com.cms.base_service.common.DeptVo other = (com.cms.base_service.common.DeptVo) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$name_en = getName_en(), other$name_en = other.getName_en();
        if ((this$name_en == null) ? (other$name_en != null) : !this$name_en.equals(other$name_en)) return false;
        Object this$department_leader =  getDepartment_leader(), other$department_leader =  other.getDepartment_leader();
        if ((this$department_leader == null) ? (other$department_leader != null) : !this$department_leader.equals(other$department_leader))
            return false;
        Object this$parentid = getParentid(), other$parentid = other.getParentid();
        if ((this$parentid == null) ? (other$parentid != null) : !this$parentid.equals(other$parentid)) return false;
        Object this$order = getOrder(), other$order = other.getOrder();
        if ((this$order == null) ? (other$order != null) : !this$order.equals(other$order)) return false;
        Object this$sourceid = getSourceid(), other$sourceid = other.getSourceid();
        if ((this$sourceid == null) ? (other$sourceid != null) : !this$sourceid.equals(other$sourceid)) return false;
        Object this$ancestors = getAncestors(), other$ancestors = other.getAncestors();
        if ((this$ancestors == null) ? (other$ancestors != null) : !this$ancestors.equals(other$ancestors))
            return false;
        Object this$children =  getChildren(), other$children =  other.getChildren();
        return !((this$children == null) ? (other$children != null) : !this$children.equals(other$children));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.base_service.common.DeptVo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $name_en = getName_en();
        result = result * 59 + (($name_en == null) ? 43 : $name_en.hashCode());
        Object $department_leader =  getDepartment_leader();
        result = result * 59 + (($department_leader == null) ? 43 : $department_leader.hashCode());
        Object $parentid = getParentid();
        result = result * 59 + (($parentid == null) ? 43 : $parentid.hashCode());
        Object $order = getOrder();
        result = result * 59 + (($order == null) ? 43 : $order.hashCode());
        Object $sourceid = getSourceid();
        result = result * 59 + (($sourceid == null) ? 43 : $sourceid.hashCode());
        Object $ancestors = getAncestors();
        result = result * 59 + (($ancestors == null) ? 43 : $ancestors.hashCode());
        Object $children =  getChildren();
        return result * 59 + (($children == null) ? 43 : $children.hashCode());
    }
    @Override
    public String toString() {
        return "DeptVo(id=" + getId() + ", name=" + getName() + ", name_en=" + getName_en() + ", department_leader=" + getDepartment_leader() + ", parentid=" + getParentid() + ", order=" + getOrder() + ", sourceid=" + getSourceid() + ", ancestors=" + getAncestors() + ", children=" + getChildren() + ")";
    }

    public String getId() {
        /* 14 */
        return this.id;
    }

    public String getName() {
        /* 16 */
        return this.name;
    }

    public String getName_en() {
        /* 18 */
        return this.name_en;
    }

    public List<String> getDepartment_leader() {
        /* 20 */
        return this.department_leader;
    }

    public String getParentid() {
        /* 22 */
        return this.parentid;
    }

    public String getOrder() {
        /* 24 */
        return this.order;
    }

    public String getSourceid() {
        /* 26 */
        return this.sourceid;
    }

    public String getAncestors() {
        /* 28 */
        return this.ancestors;
    }

    public List<com.cms.base_service.common.DeptVo> getChildren() {
        /* 31 */
        return this.children;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\DeptVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */