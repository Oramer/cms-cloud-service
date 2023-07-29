package com.cms.buss_service.wxpay;

import java.math.BigDecimal;
import java.util.List;

public class WechatTransferBatchesParam {
    private String batchId;
    private String title;
    private String remark;
    private BigDecimal totalMoney;
//    private List<transferDetail> transferDetailList;

    /* 13 */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

//    public void setTransferDetailList(List<transferDetail> transferDetailList) {
//        this.transferDetailList = transferDetailList;
//    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.wxpay.WechatTransferBatchesParam)) return false;
        com.cms.buss_service.wxpay.WechatTransferBatchesParam other = (com.cms.buss_service.wxpay.WechatTransferBatchesParam) o;
        if (!other.canEqual(this)) return false;
        Object this$batchId = getBatchId(), other$batchId = other.getBatchId();
        if ((this$batchId == null) ? (other$batchId != null) : !this$batchId.equals(other$batchId)) return false;
        Object this$title = getTitle(), other$title = other.getTitle();
        if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title)) return false;
        Object this$remark = getRemark(), other$remark = other.getRemark();
        if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;
        Object this$totalMoney = getTotalMoney(), other$totalMoney = other.getTotalMoney();
        if ((this$totalMoney == null) ? (other$totalMoney != null) : !this$totalMoney.equals(other$totalMoney))
            return false;
        Object this$transferDetailList = null,  other$transferDetailList =  null;
//        Object this$transferDetailList =  getTransferDetailList(), other$transferDetailList =  other.getTransferDetailList();
        return !((this$transferDetailList == null) ? (other$transferDetailList != null) : !this$transferDetailList.equals(other$transferDetailList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.wxpay.WechatTransferBatchesParam;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $batchId = getBatchId();
        result = result * 59 + (($batchId == null) ? 43 : $batchId.hashCode());
        Object $title = getTitle();
        result = result * 59 + (($title == null) ? 43 : $title.hashCode());
        Object $remark = getRemark();
        result = result * 59 + (($remark == null) ? 43 : $remark.hashCode());
        Object $totalMoney = getTotalMoney();
        result = result * 59 + (($totalMoney == null) ? 43 : $totalMoney.hashCode());
        Object $transferDetailList =  null;
//        Object $transferDetailList =  getTransferDetailList();
        return result * 59 + (($transferDetailList == null) ? 43 : $transferDetailList.hashCode());
    }
    @Override
    public String toString() {
        return "WechatTransferBatchesParam(batchId=" + getBatchId() + ", title=" + getTitle() + ", remark=" + getRemark() + ", totalMoney=" + getTotalMoney() + ")";
    }


    public String getBatchId() {
        /* 19 */
        return this.batchId;
    }


    public String getTitle() {
        /* 24 */
        return this.title;
    }


    public String getRemark() {
        /* 29 */
        return this.remark;
    }


    public BigDecimal getTotalMoney() {
        /* 34 */
        return this.totalMoney;
    }


//    public List<transferDetail> getTransferDetailList() {
//        /* 39 */
//        return this.transferDetailList;
//    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\WechatTransferBatchesParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */