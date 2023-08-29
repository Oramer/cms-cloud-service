package com.cms.buss_service.ticket.domain;

import com.cms.buss_service.product.domain.BussProductInfo;

import java.util.List;

public class TicketVo {
    protected List<BussProductInfo> products;

    /*  8 */
    public void setProducts(List<BussProductInfo> products) {
        this.products = products;
    }

    protected List<BussTicketInfo> tickets;

    public void setTickets(List<BussTicketInfo> tickets) {
        this.tickets = tickets;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TicketVo)) {
            return false;
        }
        TicketVo other = (TicketVo) o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object this$products =  getProducts(), other$products =  other.getProducts();
        if ((this$products == null) ? (other$products != null) : !this$products.equals(other$products)) {
            return false;
        }
        Object this$tickets =  getTickets(), other$tickets =  other.getTickets();
        return !((this$tickets == null) ? (other$tickets != null) : !this$tickets.equals(other$tickets));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TicketVo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $products =  getProducts();
        result = result * 59 + (($products == null) ? 43 : $products.hashCode());
        Object $tickets = getTickets();
        return result * 59 + (($tickets == null) ? 43 : $tickets.hashCode());
    }
    @Override
    public String toString() {
        return "TicketVo(products=" + getProducts() + ", tickets=" + getTickets() + ")";
    }

    /* 10 */
    public List<BussProductInfo> getProducts() {
        return this.products;
    }

    public List<BussTicketInfo> getTickets() {
        /* 11 */
        return this.tickets;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\domain\TicketVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */