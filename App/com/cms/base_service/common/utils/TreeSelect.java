package com.cms.base_service.common.utils;

import com.cms.system_service.system.domain.SysDept;
import com.cms.system_service.system.domain.SysMenu;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class TreeSelect implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    /* 11 */
    public void setId(String id) {
        this.id = id;
    }

    private String label;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<com.cms.base_service.common.utils.TreeSelect> children;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setChildren(List<com.cms.base_service.common.utils.TreeSelect> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.base_service.common.utils.TreeSelect)) return false;
        com.cms.base_service.common.utils.TreeSelect other = (com.cms.base_service.common.utils.TreeSelect) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$label = getLabel(), other$label = other.getLabel();
        if ((this$label == null) ? (other$label != null) : !this$label.equals(other$label)) return false;
        Object this$children =  getChildren(), other$children =  other.getChildren();
        return !((this$children == null) ? (other$children != null) : !this$children.equals(other$children));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.base_service.common.utils.TreeSelect;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $label = getLabel();
        result = result * 59 + (($label == null) ? 43 : $label.hashCode());
        Object $children =  getChildren();
        return result * 59 + (($children == null) ? 43 : $children.hashCode());
    }
    @Override
    public String toString() {
        return "TreeSelect(id=" + getId() + ", label=" + getLabel() + ", children=" + getChildren() + ")";
    }


    public String getId() {
        /* 18 */
        return this.id;
    }


    public String getLabel() {
        /* 23 */
        return this.label;
    }


    public List<com.cms.base_service.common.utils.TreeSelect> getChildren() {
        /* 29 */
        return this.children;
    }


    public TreeSelect() {
    }

    public TreeSelect(SysDept dept) {
        /* 36 */
        this.id = dept.getDeptId();
        /* 37 */
        this.label = dept.getDeptName();
        /* 38 */
        this.children = (List<com.cms.base_service.common.utils.TreeSelect>) dept.getChildren().stream().map(com.cms.base_service.common.utils.TreeSelect::new).collect(Collectors.toList());
    }

    public TreeSelect(SysMenu menu) {
        /* 42 */
        this.id = menu.getMenuId();
        /* 43 */
        this.label = menu.getMenuName();
        /* 44 */
        this.children = (List<com.cms.base_service.common.utils.TreeSelect>) menu.getChildren().stream().map(com.cms.base_service.common.utils.TreeSelect::new).collect(Collectors.toList());
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\TreeSelect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */