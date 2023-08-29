package com.cms.base_service.common.model;

import java.io.Serializable;
import java.util.Map;

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String searchValue;
    protected String createBy;
    protected String createTime;
    protected String updateBy;
    protected String updateTime;
    protected String remark;

    /*  8 */
    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    protected String dataScope;
    public String beginTime;
    public String endTime;
    public String searchStart;
    public String searchEnd;
    public String quickSearch;
    protected String isTicket;
    public Map<String, Object> params;

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setSearchStart(String searchStart) {
        this.searchStart = searchStart;
    }

    public void setSearchEnd(String searchEnd) {
        this.searchEnd = searchEnd;
    }

    public void setQuickSearch(String quickSearch) {
        this.quickSearch = quickSearch;
    }

    public void setIsTicket(String isTicket) {
        this.isTicket = isTicket;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity other = (BaseEntity) o;
        if (!other.canEqual(this)) return false;
        Object this$searchValue = getSearchValue(), other$searchValue = other.getSearchValue();
        if ((this$searchValue == null) ? (other$searchValue != null) : !this$searchValue.equals(other$searchValue))
            return false;
        Object this$createBy = getCreateBy(), other$createBy = other.getCreateBy();
        if ((this$createBy == null) ? (other$createBy != null) : !this$createBy.equals(other$createBy)) return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        if ((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime))
            return false;
        Object this$updateBy = getUpdateBy(), other$updateBy = other.getUpdateBy();
        if ((this$updateBy == null) ? (other$updateBy != null) : !this$updateBy.equals(other$updateBy)) return false;
        Object this$updateTime = getUpdateTime(), other$updateTime = other.getUpdateTime();
        if ((this$updateTime == null) ? (other$updateTime != null) : !this$updateTime.equals(other$updateTime))
            return false;
        Object this$remark = getRemark(), other$remark = other.getRemark();
        if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;
        Object this$dataScope = getDataScope(), other$dataScope = other.getDataScope();
        if ((this$dataScope == null) ? (other$dataScope != null) : !this$dataScope.equals(other$dataScope))
            return false;
        Object this$beginTime = getBeginTime(), other$beginTime = other.getBeginTime();
        if ((this$beginTime == null) ? (other$beginTime != null) : !this$beginTime.equals(other$beginTime))
            return false;
        Object this$endTime = getEndTime(), other$endTime = other.getEndTime();
        if ((this$endTime == null) ? (other$endTime != null) : !this$endTime.equals(other$endTime)) return false;
        Object this$searchStart = getSearchStart(), other$searchStart = other.getSearchStart();
        if ((this$searchStart == null) ? (other$searchStart != null) : !this$searchStart.equals(other$searchStart))
            return false;
        Object this$searchEnd = getSearchEnd(), other$searchEnd = other.getSearchEnd();
        if ((this$searchEnd == null) ? (other$searchEnd != null) : !this$searchEnd.equals(other$searchEnd))
            return false;
        Object this$quickSearch = getQuickSearch(), other$quickSearch = other.getQuickSearch();
        if ((this$quickSearch == null) ? (other$quickSearch != null) : !this$quickSearch.equals(other$quickSearch))
            return false;
        Object this$isTicket = getIsTicket(), other$isTicket = other.getIsTicket();
        if ((this$isTicket == null) ? (other$isTicket != null) : !this$isTicket.equals(other$isTicket)) return false;
        Object this$params = getParams(), other$params = other.getParams();
        return !((this$params == null) ? (other$params != null) : !this$params.equals(other$params));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseEntity;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $searchValue = getSearchValue();
        result = result * 59 + (($searchValue == null) ? 43 : $searchValue.hashCode());
        Object $createBy = getCreateBy();
        result = result * 59 + (($createBy == null) ? 43 : $createBy.hashCode());
        Object $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Object $updateBy = getUpdateBy();
        result = result * 59 + (($updateBy == null) ? 43 : $updateBy.hashCode());
        Object $updateTime = getUpdateTime();
        result = result * 59 + (($updateTime == null) ? 43 : $updateTime.hashCode());
        Object $remark = getRemark();
        result = result * 59 + (($remark == null) ? 43 : $remark.hashCode());
        Object $dataScope = getDataScope();
        result = result * 59 + (($dataScope == null) ? 43 : $dataScope.hashCode());
        Object $beginTime = getBeginTime();
        result = result * 59 + (($beginTime == null) ? 43 : $beginTime.hashCode());
        Object $endTime = getEndTime();
        result = result * 59 + (($endTime == null) ? 43 : $endTime.hashCode());
        Object $searchStart = getSearchStart();
        result = result * 59 + (($searchStart == null) ? 43 : $searchStart.hashCode());
        Object $searchEnd = getSearchEnd();
        result = result * 59 + (($searchEnd == null) ? 43 : $searchEnd.hashCode());
        Object $quickSearch = getQuickSearch();
        result = result * 59 + (($quickSearch == null) ? 43 : $quickSearch.hashCode());
        Object $isTicket = getIsTicket();
        result = result * 59 + (($isTicket == null) ? 43 : $isTicket.hashCode());
        Object $params = getParams();
        return result * 59 + (($params == null) ? 43 : $params.hashCode());
    }
    @Override
    public String toString() {
        return "BaseEntity(searchValue=" + getSearchValue() + ", createBy=" + getCreateBy() + ", createTime=" + getCreateTime() + ", updateBy=" + getUpdateBy() + ", updateTime=" + getUpdateTime() + ", remark=" + getRemark() + ", dataScope=" + getDataScope() + ", beginTime=" + getBeginTime() + ", endTime=" + getEndTime() + ", searchStart=" + getSearchStart() + ", searchEnd=" + getSearchEnd() + ", quickSearch=" + getQuickSearch() + ", isTicket=" + getIsTicket() + ", params=" + getParams() + ")";
    }


    public String getSearchValue() {
        /* 15 */
        return this.searchValue;
    }


    public String getCreateBy() {
        /* 20 */
        return this.createBy;
    }


    public String getCreateTime() {
        /* 25 */
        return this.createTime;
    }


    public String getUpdateBy() {
        /* 30 */
        return this.updateBy;
    }


    public String getUpdateTime() {
        /* 35 */
        return this.updateTime;
    }


    public String getRemark() {
        /* 40 */
        return this.remark;
    }


    public String getDataScope() {
        /* 45 */
        return this.dataScope;
    }


    public String getBeginTime() {
        /* 50 */
        return this.beginTime;
    }


    public String getEndTime() {
        /* 55 */
        return this.endTime;
    }

    /* 57 */
    public String getSearchStart() {
        return this.searchStart;
    }

    public String getSearchEnd() {
        /* 58 */
        return this.searchEnd;
    }

    public String getQuickSearch() {
        /* 60 */
        return this.quickSearch;
    }

    public String getIsTicket() {
        /* 62 */
        return this.isTicket;
    }


    public Map<String, Object> getParams() {
        /* 67 */
        return this.params;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\BaseEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */