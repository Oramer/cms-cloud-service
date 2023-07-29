package com.cms.base_service.common.model;

import com.cms.base_service.common.utils.StringUtils;

public class PageDomain {
    private Integer pageNum;
    private Integer pageSize;
    private String orderByColumn;
    private String isAsc;

    /*  9 */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public void setIsAsc(String isAsc) {
        this.isAsc = isAsc;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.base_service.common.model.PageDomain)) return false;
        com.cms.base_service.common.model.PageDomain other = (com.cms.base_service.common.model.PageDomain) o;
        if (!other.canEqual(this)) return false;
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize)) return false;
        Object this$orderByColumn = getOrderByColumn(), other$orderByColumn = other.getOrderByColumn();
        if ((this$orderByColumn == null) ? (other$orderByColumn != null) : !this$orderByColumn.equals(other$orderByColumn))
            return false;
        Object this$isAsc = getIsAsc(), other$isAsc = other.getIsAsc();
        return !((this$isAsc == null) ? (other$isAsc != null) : !this$isAsc.equals(other$isAsc));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.base_service.common.model.PageDomain;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $pageSize = getPageSize();
        result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
        Object $orderByColumn = getOrderByColumn();
        result = result * 59 + (($orderByColumn == null) ? 43 : $orderByColumn.hashCode());
        Object $isAsc = getIsAsc();
        return result * 59 + (($isAsc == null) ? 43 : $isAsc.hashCode());
    }

    public String toString() {
        return "PageDomain(pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ", orderByColumn=" + getOrderByColumn() + ", isAsc=" + getIsAsc() + ")";
    }


    public Integer getPageNum() {
        /* 14 */
        return this.pageNum;
    }

    public Integer getPageSize() {
        /* 18 */
        return this.pageSize;
    }

    public String getOrderByColumn() {
        /* 22 */
        return this.orderByColumn;
    }

    public String getIsAsc() {
        /* 26 */
        return this.isAsc;
    }

    public String getOrderBy() {
        /* 29 */
        if (StringUtils.isEmpty(this.orderByColumn)) {
            /* 30 */
            return "";
        }
        /* 32 */
        return StringUtils.toUnderScoreCase(this.orderByColumn) + " " + this.isAsc;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\PageDomain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */