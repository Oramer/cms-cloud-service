package com.cms.system_service.system.domain;

import com.cms.base_service.common.model.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class SysMenu
        extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private String menuId;
    private String menuName;
    private String parentName;
    private String parentId;
    private Integer orderNum;
    private String path;
    private String component;

    public void setMenuId(String menuId) {
        /* 19 */
        this.menuId = menuId;
    }

    private String query;
    private String isFrame;
    private String isCache;
    private String menuType;
    private String visible;
    private String status;
    private String perms;
    private String icon;

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setIsFrame(String isFrame) {
        this.isFrame = isFrame;
    }

    public void setIsCache(String isCache) {
        this.isCache = isCache;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setChildren(List<com.cms.system_service.system.domain.SysMenu> children) {
        this.children = children;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.system_service.system.domain.SysMenu)) return false;
        com.cms.system_service.system.domain.SysMenu other = (com.cms.system_service.system.domain.SysMenu) o;
        if (!other.canEqual(this)) return false;
        Object this$menuId = getMenuId(), other$menuId = other.getMenuId();
        if ((this$menuId == null) ? (other$menuId != null) : !this$menuId.equals(other$menuId)) return false;
        Object this$menuName = getMenuName(), other$menuName = other.getMenuName();
        if ((this$menuName == null) ? (other$menuName != null) : !this$menuName.equals(other$menuName)) return false;
        Object this$parentName = getParentName(), other$parentName = other.getParentName();
        if ((this$parentName == null) ? (other$parentName != null) : !this$parentName.equals(other$parentName))
            return false;
        Object this$parentId = getParentId(), other$parentId = other.getParentId();
        if ((this$parentId == null) ? (other$parentId != null) : !this$parentId.equals(other$parentId)) return false;
        Object this$orderNum = getOrderNum(), other$orderNum = other.getOrderNum();
        if ((this$orderNum == null) ? (other$orderNum != null) : !this$orderNum.equals(other$orderNum)) return false;
        Object this$path = getPath(), other$path = other.getPath();
        if ((this$path == null) ? (other$path != null) : !this$path.equals(other$path)) return false;
        Object this$component = getComponent(), other$component = other.getComponent();
        if ((this$component == null) ? (other$component != null) : !this$component.equals(other$component))
            return false;
        Object this$query = getQuery(), other$query = other.getQuery();
        if ((this$query == null) ? (other$query != null) : !this$query.equals(other$query)) return false;
        Object this$isFrame = getIsFrame(), other$isFrame = other.getIsFrame();
        if ((this$isFrame == null) ? (other$isFrame != null) : !this$isFrame.equals(other$isFrame)) return false;
        Object this$isCache = getIsCache(), other$isCache = other.getIsCache();
        if ((this$isCache == null) ? (other$isCache != null) : !this$isCache.equals(other$isCache)) return false;
        Object this$menuType = getMenuType(), other$menuType = other.getMenuType();
        if ((this$menuType == null) ? (other$menuType != null) : !this$menuType.equals(other$menuType)) return false;
        Object this$visible = getVisible(), other$visible = other.getVisible();
        if ((this$visible == null) ? (other$visible != null) : !this$visible.equals(other$visible)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$perms = getPerms(), other$perms = other.getPerms();
        if ((this$perms == null) ? (other$perms != null) : !this$perms.equals(other$perms)) return false;
        Object this$icon = getIcon(), other$icon = other.getIcon();
        if ((this$icon == null) ? (other$icon != null) : !this$icon.equals(other$icon)) return false;
        Object this$children =  getChildren(), other$children = other.getChildren();
        return !((this$children == null) ? (other$children != null) : !this$children.equals(other$children));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.system_service.system.domain.SysMenu;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $menuId = getMenuId();
        result = result * 59 + (($menuId == null) ? 43 : $menuId.hashCode());
        Object $menuName = getMenuName();
        result = result * 59 + (($menuName == null) ? 43 : $menuName.hashCode());
        Object $parentName = getParentName();
        result = result * 59 + (($parentName == null) ? 43 : $parentName.hashCode());
        Object $parentId = getParentId();
        result = result * 59 + (($parentId == null) ? 43 : $parentId.hashCode());
        Object $orderNum = getOrderNum();
        result = result * 59 + (($orderNum == null) ? 43 : $orderNum.hashCode());
        Object $path = getPath();
        result = result * 59 + (($path == null) ? 43 : $path.hashCode());
        Object $component = getComponent();
        result = result * 59 + (($component == null) ? 43 : $component.hashCode());
        Object $query = getQuery();
        result = result * 59 + (($query == null) ? 43 : $query.hashCode());
        Object $isFrame = getIsFrame();
        result = result * 59 + (($isFrame == null) ? 43 : $isFrame.hashCode());
        Object $isCache = getIsCache();
        result = result * 59 + (($isCache == null) ? 43 : $isCache.hashCode());
        Object $menuType = getMenuType();
        result = result * 59 + (($menuType == null) ? 43 : $menuType.hashCode());
        Object $visible = getVisible();
        result = result * 59 + (($visible == null) ? 43 : $visible.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $perms = getPerms();
        result = result * 59 + (($perms == null) ? 43 : $perms.hashCode());
        Object $icon = getIcon();
        result = result * 59 + (($icon == null) ? 43 : $icon.hashCode());
        Object $children =  getChildren();
        return result * 59 + (($children == null) ? 43 : $children.hashCode());
    }

    public String toString() {
        return "SysMenu(menuId=" + getMenuId() + ", menuName=" + getMenuName() + ", parentName=" + getParentName() + ", parentId=" + getParentId() + ", orderNum=" + getOrderNum() + ", path=" + getPath() + ", component=" + getComponent() + ", query=" + getQuery() + ", isFrame=" + getIsFrame() + ", isCache=" + getIsCache() + ", menuType=" + getMenuType() + ", visible=" + getVisible() + ", status=" + getStatus() + ", perms=" + getPerms() + ", icon=" + getIcon() + ", children=" + getChildren() + ")";
    }


    public String getMenuId() {
        /* 25 */
        return this.menuId;
    }

    public String getMenuName() {
        /* 28 */
        return this.menuName;
    }

    public String getParentName() {
        /* 31 */
        return this.parentName;
    }

    public String getParentId() {
        /* 34 */
        return this.parentId;
    }

    public Integer getOrderNum() {
        /* 37 */
        return this.orderNum;
    }

    public String getPath() {
        /* 40 */
        return this.path;
    }

    public String getComponent() {
        /* 43 */
        return this.component;
    }

    public String getQuery() {
        /* 46 */
        return this.query;
    }

    public String getIsFrame() {
        /* 49 */
        return this.isFrame;
    }

    public String getIsCache() {
        /* 52 */
        return this.isCache;
    }

    public String getMenuType() {
        /* 55 */
        return this.menuType;
    }

    public String getVisible() {
        /* 58 */
        return this.visible;
    }

    public String getStatus() {
        /* 61 */
        return this.status;
    }

    public String getPerms() {
        /* 64 */
        return this.perms;
    }

    public String getIcon() {
        /* 67 */
        return this.icon;
    }

    /* 70 */   private List<com.cms.system_service.system.domain.SysMenu> children = new ArrayList<>();

    public List<com.cms.system_service.system.domain.SysMenu> getChildren() {
        return this.children;
    }

}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysMenu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */