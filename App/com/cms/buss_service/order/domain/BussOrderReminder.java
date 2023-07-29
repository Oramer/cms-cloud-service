package com.cms.buss_service.order.domain;


import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class BussOrderReminder extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    @Excel(name = "订单信息")
    private String orderId;
    @Excel(name = "备用字段")
    private String no1;

    /* 12 */
    public void setId(Long id) {
        this.id = id;
    }

    @Excel(name = "备用字段")
    private String no2;
    @Excel(name = "备用字段")
    private String no3;
    @Excel(name = "备用字段")
    private String no4;
    @Excel(name = "配送人")
    private String no5;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.order.domain.BussOrderReminder)) return false;
        com.cms.buss_service.order.domain.BussOrderReminder other = (com.cms.buss_service.order.domain.BussOrderReminder) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$orderId = getOrderId(), other$orderId = other.getOrderId();
        if ((this$orderId == null) ? (other$orderId != null) : !this$orderId.equals(other$orderId)) return false;
        Object this$no1 = getNo1(), other$no1 = other.getNo1();
        if ((this$no1 == null) ? (other$no1 != null) : !this$no1.equals(other$no1)) return false;
        Object this$no2 = getNo2(), other$no2 = other.getNo2();
        if ((this$no2 == null) ? (other$no2 != null) : !this$no2.equals(other$no2)) return false;
        Object this$no3 = getNo3(), other$no3 = other.getNo3();
        if ((this$no3 == null) ? (other$no3 != null) : !this$no3.equals(other$no3)) return false;
        Object this$no4 = getNo4(), other$no4 = other.getNo4();
        if ((this$no4 == null) ? (other$no4 != null) : !this$no4.equals(other$no4)) return false;
        Object this$no5 = getNo5(), other$no5 = other.getNo5();
        return !((this$no5 == null) ? (other$no5 != null) : !this$no5.equals(other$no5));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.order.domain.BussOrderReminder;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $orderId = getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        Object $no1 = getNo1();
        result = result * 59 + (($no1 == null) ? 43 : $no1.hashCode());
        Object $no2 = getNo2();
        result = result * 59 + (($no2 == null) ? 43 : $no2.hashCode());
        Object $no3 = getNo3();
        result = result * 59 + (($no3 == null) ? 43 : $no3.hashCode());
        Object $no4 = getNo4();
        result = result * 59 + (($no4 == null) ? 43 : $no4.hashCode());
        Object $no5 = getNo5();
        return result * 59 + (($no5 == null) ? 43 : $no5.hashCode());
    }
    @Override
    public String toString() {
        return "BussOrderReminder(id=" + getId() + ", orderId=" + getOrderId() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ")";
    }


    public Long getId() {
        /* 17 */
        return this.id;
    }

    public String getOrderId() {
        /* 21 */
        return this.orderId;
    }

    public String getNo1() {
        /* 25 */
        return this.no1;
    }

    public String getNo2() {
        /* 29 */
        return this.no2;
    }

    public String getNo3() {
        /* 33 */
        return this.no3;
    }

    public String getNo4() {
        /* 37 */
        return this.no4;
    }

    public String getNo5() {
        /* 41 */
        return this.no5;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\domain\BussOrderReminder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */