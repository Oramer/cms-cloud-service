 package com.cms.buss_service.order.domain;


 public class BussOrderInfoTicket
   extends BaseOrder
 {
   public boolean equals(Object o) {
/* 18 */     if (o == this) return true;  if (!(o instanceof BussOrderInfoTicket)) return false;  BussOrderInfoTicket other = (BussOrderInfoTicket)o; return !!other.canEqual(this); } protected boolean canEqual(Object other) { return other instanceof BussOrderInfoTicket; } public int hashCode() { int result = 1; return 1; } public String toString() { return "BussOrderInfoTicket()"; }

 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\domain\BussOrderInfoTicket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */