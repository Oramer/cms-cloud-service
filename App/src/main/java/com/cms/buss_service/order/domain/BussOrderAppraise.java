package com.cms.buss_service.order.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.system_service.system.domain.SysUser;

public class BussOrderAppraise extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Excel(name = "订单信息")
    private String orderId;
    @Excel(name = "产品信息")
    private String productId;
    @Excel(name = "评价图片")
    private String appraisePic;
    @Excel(name = "评价详情")
    private String appraiseDesc;
    @Excel(name = "评价分数1-5*")
    private Integer appraiseStart;
    @Excel(name = "评价标签")
    private String appraiseTags;
    @Excel(name = "状态")
    private String status;
    @Excel(name = "乐观锁")
    private String reversion;

    /*  15 */
    public void setId(Long id) {
        this.id = id;
    }

    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no1;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no2;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no3;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no4;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no5;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no6;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no7;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no8;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no9;
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String no10;
    SysUser user;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setAppraisePic(String appraisePic) {
        this.appraisePic = appraisePic;
    }

    public void setAppraiseDesc(String appraiseDesc) {
        this.appraiseDesc = appraiseDesc;
    }

    public void setAppraiseStart(Integer appraiseStart) {
        this.appraiseStart = appraiseStart;
    }

    public void setAppraiseTags(String appraiseTags) {
        this.appraiseTags = appraiseTags;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReversion(String reversion) {
        this.reversion = reversion;
    }

    public void setNo1(String no1) {
        this.no1 = no1;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public void setNo3(String no3) {
        this.no3 = no3;
    }

    public void setNo4(String no4) {
        this.no4 = no4;
    }

    public void setNo5(String no5) {
        this.no5 = no5;
    }

    public void setNo6(String no6) {
        this.no6 = no6;
    }

    public void setNo7(String no7) {
        this.no7 = no7;
    }

    public void setNo8(String no8) {
        this.no8 = no8;
    }

    public void setNo9(String no9) {
        this.no9 = no9;
    }

    public void setNo10(String no10) {
        this.no10 = no10;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BussOrderAppraise)) return false;
        BussOrderAppraise other = (BussOrderAppraise) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$orderId = getOrderId(), other$orderId = other.getOrderId();
        if ((this$orderId == null) ? (other$orderId != null) : !this$orderId.equals(other$orderId)) return false;
        Object this$productId = getProductId(), other$productId = other.getProductId();
        if ((this$productId == null) ? (other$productId != null) : !this$productId.equals(other$productId))
            return false;
        Object this$appraisePic = getAppraisePic(), other$appraisePic = other.getAppraisePic();
        if ((this$appraisePic == null) ? (other$appraisePic != null) : !this$appraisePic.equals(other$appraisePic))
            return false;
        Object this$appraiseDesc = getAppraiseDesc(), other$appraiseDesc = other.getAppraiseDesc();
        if ((this$appraiseDesc == null) ? (other$appraiseDesc != null) : !this$appraiseDesc.equals(other$appraiseDesc))
            return false;
        Object this$appraiseStart = getAppraiseStart(), other$appraiseStart = other.getAppraiseStart();
        if ((this$appraiseStart == null) ? (other$appraiseStart != null) : !this$appraiseStart.equals(other$appraiseStart))
            return false;
        Object this$appraiseTags = getAppraiseTags(), other$appraiseTags = other.getAppraiseTags();
        if ((this$appraiseTags == null) ? (other$appraiseTags != null) : !this$appraiseTags.equals(other$appraiseTags))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$reversion = getReversion(), other$reversion = other.getReversion();
        if ((this$reversion == null) ? (other$reversion != null) : !this$reversion.equals(other$reversion))
            return false;
        Object this$no1 = getNo1(), other$no1 = other.getNo1();
        if ((this$no1 == null) ? (other$no1 != null) : !this$no1.equals(other$no1)) return false;
        Object this$no2 = getNo2(), other$no2 = other.getNo2();
        if ((this$no2 == null) ? (other$no2 != null) : !this$no2.equals(other$no2)) return false;
        Object this$no3 = getNo3(), other$no3 = other.getNo3();
        if ((this$no3 == null) ? (other$no3 != null) : !this$no3.equals(other$no3)) return false;
        Object this$no4 = getNo4(), other$no4 = other.getNo4();
        if ((this$no4 == null) ? (other$no4 != null) : !this$no4.equals(other$no4)) return false;
        Object this$no5 = getNo5(), other$no5 = other.getNo5();
        if ((this$no5 == null) ? (other$no5 != null) : !this$no5.equals(other$no5)) return false;
        Object this$no6 = getNo6(), other$no6 = other.getNo6();
        if ((this$no6 == null) ? (other$no6 != null) : !this$no6.equals(other$no6)) return false;
        Object this$no7 = getNo7(), other$no7 = other.getNo7();
        if ((this$no7 == null) ? (other$no7 != null) : !this$no7.equals(other$no7)) return false;
        Object this$no8 = getNo8(), other$no8 = other.getNo8();
        if ((this$no8 == null) ? (other$no8 != null) : !this$no8.equals(other$no8)) return false;
        Object this$no9 = getNo9(), other$no9 = other.getNo9();
        if ((this$no9 == null) ? (other$no9 != null) : !this$no9.equals(other$no9)) return false;
        Object this$no10 = getNo10(), other$no10 = other.getNo10();
        if ((this$no10 == null) ? (other$no10 != null) : !this$no10.equals(other$no10)) return false;
        Object this$user = getUser(), other$user = other.getUser();
        return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BussOrderAppraise;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $orderId = getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        Object $productId = getProductId();
        result = result * 59 + (($productId == null) ? 43 : $productId.hashCode());
        Object $appraisePic = getAppraisePic();
        result = result * 59 + (($appraisePic == null) ? 43 : $appraisePic.hashCode());
        Object $appraiseDesc = getAppraiseDesc();
        result = result * 59 + (($appraiseDesc == null) ? 43 : $appraiseDesc.hashCode());
        Object $appraiseStart = getAppraiseStart();
        result = result * 59 + (($appraiseStart == null) ? 43 : $appraiseStart.hashCode());
        Object $appraiseTags = getAppraiseTags();
        result = result * 59 + (($appraiseTags == null) ? 43 : $appraiseTags.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $reversion = getReversion();
        result = result * 59 + (($reversion == null) ? 43 : $reversion.hashCode());
        Object $no1 = getNo1();
        result = result * 59 + (($no1 == null) ? 43 : $no1.hashCode());
        Object $no2 = getNo2();
        result = result * 59 + (($no2 == null) ? 43 : $no2.hashCode());
        Object $no3 = getNo3();
        result = result * 59 + (($no3 == null) ? 43 : $no3.hashCode());
        Object $no4 = getNo4();
        result = result * 59 + (($no4 == null) ? 43 : $no4.hashCode());
        Object $no5 = getNo5();
        result = result * 59 + (($no5 == null) ? 43 : $no5.hashCode());
        Object $no6 = getNo6();
        result = result * 59 + (($no6 == null) ? 43 : $no6.hashCode());
        Object $no7 = getNo7();
        result = result * 59 + (($no7 == null) ? 43 : $no7.hashCode());
        Object $no8 = getNo8();
        result = result * 59 + (($no8 == null) ? 43 : $no8.hashCode());
        Object $no9 = getNo9();
        result = result * 59 + (($no9 == null) ? 43 : $no9.hashCode());
        Object $no10 = getNo10();
        result = result * 59 + (($no10 == null) ? 43 : $no10.hashCode());
        Object $user = getUser();
        return result * 59 + (($user == null) ? 43 : $user.hashCode());
    }

    public String toString() {
        return "BussOrderAppraise(id=" + getId() + ", orderId=" + getOrderId() + ", productId=" + getProductId() + ", appraisePic=" + getAppraisePic() + ", appraiseDesc=" + getAppraiseDesc() + ", appraiseStart=" + getAppraiseStart() + ", appraiseTags=" + getAppraiseTags() + ", status=" + getStatus() + ", reversion=" + getReversion() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ", user=" + getUser() + ")";
    }


    public Long getId() {
        /*  22 */
        return this.id;
    }


    public String getOrderId() {
        /*  28 */
        return this.orderId;
    }


    public String getProductId() {
        /*  34 */
        return this.productId;
    }


    public String getAppraisePic() {
        /*  40 */
        return this.appraisePic;
    }


    public String getAppraiseDesc() {
        /*  46 */
        return this.appraiseDesc;
    }


    public Integer getAppraiseStart() {
        /*  52 */
        return this.appraiseStart;
    }


    public String getAppraiseTags() {
        /*  58 */
        return this.appraiseTags;
    }


    public String getStatus() {
        /*  64 */
        return this.status;
    }


    public String getReversion() {
        /*  70 */
        return this.reversion;
    }


    public String getNo1() {
        /*  76 */
        return this.no1;
    }


    public String getNo2() {
        /*  82 */
        return this.no2;
    }


    public String getNo3() {
        /*  88 */
        return this.no3;
    }


    public String getNo4() {
        /*  94 */
        return this.no4;
    }


    public String getNo5() {
        /* 100 */
        return this.no5;
    }


    public String getNo6() {
        /* 106 */
        return this.no6;
    }


    public String getNo7() {
        /* 112 */
        return this.no7;
    }


    public String getNo8() {
        /* 118 */
        return this.no8;
    }


    public String getNo9() {
        /* 124 */
        return this.no9;
    }


    public String getNo10() {
        /* 130 */
        return this.no10;
    }

    public SysUser getUser() {
        /* 132 */
        return this.user;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\domain\BussOrderAppraise.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */