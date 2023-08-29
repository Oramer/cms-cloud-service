package com.cms.base_service.common.model;


import java.util.List;

public class TreeNode {
    private String id;

    /*  7 */
    public void setId(String id) {
        this.id = id;
    }

    private String label;
    private List<TreeNode> children;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TreeNode)) return false;
        TreeNode other = (TreeNode) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$label = getLabel(), other$label = other.getLabel();
        if ((this$label == null) ? (other$label != null) : !this$label.equals(other$label)) return false;
        Object this$children =  getChildren(), other$children =  other.getChildren();
        return !((this$children == null) ? (other$children != null) : !this$children.equals(other$children));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TreeNode;
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
        return "TreeNode(id=" + getId() + ", label=" + getLabel() + ", children=" + getChildren() + ")";
    }

    public String getId() {
        /* 10 */
        return this.id;
    }

    public String getLabel() {
        /* 12 */
        return this.label;
    }

    public List<TreeNode> getChildren() {
        /* 14 */
        return this.children;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\TreeNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */