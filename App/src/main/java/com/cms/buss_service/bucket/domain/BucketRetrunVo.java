package com.cms.buss_service.bucket.domain;

import java.math.BigDecimal;
import java.util.List;

public class BucketRetrunVo {
    private Integer returnCount;
    private BigDecimal freeAmount;
    private BigDecimal depreAmount;

    /*  8 */
    public void setReturnCount(Integer returnCount) {
        this.returnCount = returnCount;
    }

    private BigDecimal canReturnAmount;
    private String returnAddr;
    List<BussBucketReturnRecord> red;

    public void setFreeAmount(BigDecimal freeAmount) {
        this.freeAmount = freeAmount;
    }

    public void setDepreAmount(BigDecimal depreAmount) {
        this.depreAmount = depreAmount;
    }

    public void setCanReturnAmount(BigDecimal canReturnAmount) {
        this.canReturnAmount = canReturnAmount;
    }

    public void setReturnAddr(String returnAddr) {
        this.returnAddr = returnAddr;
    }

    public void setRed(List<BussBucketReturnRecord> red) {
        this.red = red;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BucketRetrunVo)) return false;
        BucketRetrunVo other = (BucketRetrunVo) o;
        if (!other.canEqual(this)) return false;
        Object this$returnCount = getReturnCount(), other$returnCount = other.getReturnCount();
        if ((this$returnCount == null) ? (other$returnCount != null) : !this$returnCount.equals(other$returnCount))
            return false;
        Object this$freeAmount = getFreeAmount(), other$freeAmount = other.getFreeAmount();
        if ((this$freeAmount == null) ? (other$freeAmount != null) : !this$freeAmount.equals(other$freeAmount))
            return false;
        Object this$depreAmount = getDepreAmount(), other$depreAmount = other.getDepreAmount();
        if ((this$depreAmount == null) ? (other$depreAmount != null) : !this$depreAmount.equals(other$depreAmount))
            return false;
        Object this$canReturnAmount = getCanReturnAmount(), other$canReturnAmount = other.getCanReturnAmount();
        if ((this$canReturnAmount == null) ? (other$canReturnAmount != null) : !this$canReturnAmount.equals(other$canReturnAmount))
            return false;
        Object this$returnAddr = getReturnAddr(), other$returnAddr = other.getReturnAddr();
        if ((this$returnAddr == null) ? (other$returnAddr != null) : !this$returnAddr.equals(other$returnAddr))
            return false;
        Object this$red =  getRed(), other$red =  other.getRed();
        return !((this$red == null) ? (other$red != null) : !this$red.equals(other$red));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BucketRetrunVo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $returnCount = getReturnCount();
        result = result * 59 + (($returnCount == null) ? 43 : $returnCount.hashCode());
        Object $freeAmount = getFreeAmount();
        result = result * 59 + (($freeAmount == null) ? 43 : $freeAmount.hashCode());
        Object $depreAmount = getDepreAmount();
        result = result * 59 + (($depreAmount == null) ? 43 : $depreAmount.hashCode());
        Object $canReturnAmount = getCanReturnAmount();
        result = result * 59 + (($canReturnAmount == null) ? 43 : $canReturnAmount.hashCode());
        Object $returnAddr = getReturnAddr();
        result = result * 59 + (($returnAddr == null) ? 43 : $returnAddr.hashCode());
        Object $red =  getRed();
        return result * 59 + (($red == null) ? 43 : $red.hashCode());
    }
    @Override
    public String toString() {
        return "BucketRetrunVo(returnCount=" + getReturnCount() + ", freeAmount=" + getFreeAmount() + ", depreAmount=" + getDepreAmount() + ", canReturnAmount=" + getCanReturnAmount() + ", returnAddr=" + getReturnAddr() + ", red=" + getRed() + ")";
    }

    /* 10 */
    public Integer getReturnCount() {
        return this.returnCount;
    }

    /* 11 */
    public BigDecimal getFreeAmount() {
        return this.freeAmount;
    }

    /* 12 */
    public BigDecimal getDepreAmount() {
        return this.depreAmount;
    }

    /* 13 */
    public BigDecimal getCanReturnAmount() {
        return this.canReturnAmount;
    }

    /* 14 */
    public String getReturnAddr() {
        return this.returnAddr;
    }

    public List<BussBucketReturnRecord> getRed() {
        /* 15 */
        return this.red;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\BucketRetrunVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */