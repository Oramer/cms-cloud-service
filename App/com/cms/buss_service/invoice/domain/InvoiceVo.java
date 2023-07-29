package com.cms.buss_service.invoice.domain;


import com.cms.buss_service.order.domain.BussOrderInfo;

import java.util.List;

public class InvoiceVo {
    private String invoiceId;
    private List<BussOrderInfo> infos;

    /*  8 */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setInfos(List<BussOrderInfo> infos) {
        this.infos = infos;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.invoice.domain.InvoiceVo)) return false;
        com.cms.buss_service.invoice.domain.InvoiceVo other = (com.cms.buss_service.invoice.domain.InvoiceVo) o;
        if (!other.canEqual(this)) return false;
        Object this$invoiceId = getInvoiceId(), other$invoiceId = other.getInvoiceId();
        if ((this$invoiceId == null) ? (other$invoiceId != null) : !this$invoiceId.equals(other$invoiceId))
            return false;
        Object this$infos =  getInfos(), other$infos =  other.getInfos();
        return !((this$infos == null) ? (other$infos != null) : !this$infos.equals(other$infos));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.invoice.domain.InvoiceVo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $invoiceId = getInvoiceId();
        result = result * 59 + (($invoiceId == null) ? 43 : $invoiceId.hashCode());
        Object $infos =  getInfos();
        return result * 59 + (($infos == null) ? 43 : $infos.hashCode());
    }
    @Override
    public String toString() {
        return "InvoiceVo(invoiceId=" + getInvoiceId() + ", infos=" + getInfos() + ")";
    }


    /* 11 */
    public String getInvoiceId() {
        return this.invoiceId;
    }

    public List<BussOrderInfo> getInfos() {
        /* 12 */
        return this.infos;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\domain\InvoiceVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */