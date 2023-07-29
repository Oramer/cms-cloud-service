package com.cms.system_service.system.domain;

public class ZtreeVo {
    private String id;
    private String pid;
    private String name;

    /*  8 */
    public void setId(String id) {
        this.id = id;
    }

    private Boolean checked;
    private Boolean open;
    private String type;

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.system_service.system.domain.ZtreeVo)) return false;
        com.cms.system_service.system.domain.ZtreeVo other = (com.cms.system_service.system.domain.ZtreeVo) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$pid = getPid(), other$pid = other.getPid();
        if ((this$pid == null) ? (other$pid != null) : !this$pid.equals(other$pid)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$checked = getChecked(), other$checked = other.getChecked();
        if ((this$checked == null) ? (other$checked != null) : !this$checked.equals(other$checked)) return false;
        Object this$open = getOpen(), other$open = other.getOpen();
        if ((this$open == null) ? (other$open != null) : !this$open.equals(other$open)) return false;
        Object this$type = getType(), other$type = other.getType();
        return !((this$type == null) ? (other$type != null) : !this$type.equals(other$type));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.system_service.system.domain.ZtreeVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $pid = getPid();
        result = result * 59 + (($pid == null) ? 43 : $pid.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $checked = getChecked();
        result = result * 59 + (($checked == null) ? 43 : $checked.hashCode());
        Object $open = getOpen();
        result = result * 59 + (($open == null) ? 43 : $open.hashCode());
        Object $type = getType();
        return result * 59 + (($type == null) ? 43 : $type.hashCode());
    }

    public String toString() {
        return "ZtreeVo(id=" + getId() + ", pid=" + getPid() + ", name=" + getName() + ", checked=" + getChecked() + ", open=" + getOpen() + ", type=" + getType() + ")";
    }

    public String getId() {
        /* 11 */
        return this.id;
    }

    public String getPid() {
        /* 13 */
        return this.pid;
    }

    public String getName() {
        /* 15 */
        return this.name;
    }

    public Boolean getChecked() {
        /* 17 */
        return this.checked;
    }

    public Boolean getOpen() {
        /* 19 */
        return this.open;
    }

    public String getType() {
        /* 21 */
        return this.type;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\ZtreeVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */