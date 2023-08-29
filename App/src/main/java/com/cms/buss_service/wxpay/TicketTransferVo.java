package com.cms.buss_service.wxpay;


import com.cms.buss_service.ticket.domain.BussUserTicketInfo;

import java.util.List;

public class TicketTransferVo {
    private List<BussUserTicketInfo> tickets;
    private String targetUser;

    /*  8 */
    public void setTickets(List<BussUserTicketInfo> tickets) {
        this.tickets = tickets;
    }

    public void setTargetUser(String targetUser) {
        this.targetUser = targetUser;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TicketTransferVo)) return false;
        TicketTransferVo other = (TicketTransferVo) o;
        if (!other.canEqual(this)) return false;
        Object this$tickets =  getTickets(), other$tickets =  other.getTickets();
        if ((this$tickets == null) ? (other$tickets != null) : !this$tickets.equals(other$tickets)) return false;
        Object this$targetUser = getTargetUser(), other$targetUser = other.getTargetUser();
        return !((this$targetUser == null) ? (other$targetUser != null) : !this$targetUser.equals(other$targetUser));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TicketTransferVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $tickets =  getTickets();
        result = result * 59 + (($tickets == null) ? 43 : $tickets.hashCode());
        Object $targetUser = getTargetUser();
        return result * 59 + (($targetUser == null) ? 43 : $targetUser.hashCode());
    }
    @Override
    public String toString() {
        return "TicketTransferVo(tickets=" + getTickets() + ", targetUser=" + getTargetUser() + ")";
    }

    public List<BussUserTicketInfo> getTickets() {
        /* 11 */
        return this.tickets;
    }

    public String getTargetUser() {
        /* 13 */
        return this.targetUser;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\TicketTransferVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */