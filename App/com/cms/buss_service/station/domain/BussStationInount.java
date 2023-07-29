package com.cms.buss_service.station.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

import java.math.BigDecimal;

public class BussStationInount extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Integer id;
    @Excel(name = "水站ID")
    private Long stationId;
    @Excel(name = "总金额")
    private BigDecimal moneyNum;

    /* 14 */
    public void setId(Integer id) {
        this.id = id;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public void setMoneyNum(BigDecimal moneyNum) {
        this.moneyNum = moneyNum;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.station.domain.BussStationInount)) return false;
        com.cms.buss_service.station.domain.BussStationInount other = (com.cms.buss_service.station.domain.BussStationInount) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$stationId = getStationId(), other$stationId = other.getStationId();
        if ((this$stationId == null) ? (other$stationId != null) : !this$stationId.equals(other$stationId))
            return false;
        Object this$moneyNum = getMoneyNum(), other$moneyNum = other.getMoneyNum();
        return !((this$moneyNum == null) ? (other$moneyNum != null) : !this$moneyNum.equals(other$moneyNum));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.station.domain.BussStationInount;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $stationId = getStationId();
        result = result * 59 + (($stationId == null) ? 43 : $stationId.hashCode());
        Object $moneyNum = getMoneyNum();
        return result * 59 + (($moneyNum == null) ? 43 : $moneyNum.hashCode());
    }
    @Override
    public String toString() {
        return "BussStationInount(id=" + getId() + ", stationId=" + getStationId() + ", moneyNum=" + getMoneyNum() + ")";
    }


    public Integer getId() {
        /* 19 */
        return this.id;
    }

    public Long getStationId() {
        /* 23 */
        return this.stationId;
    }

    public BigDecimal getMoneyNum() {
        /* 27 */
        return this.moneyNum;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\domain\BussStationInount.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */