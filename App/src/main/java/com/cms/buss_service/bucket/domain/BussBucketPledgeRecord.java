 package com.cms.buss_service.bucket.domain;

 public class BussBucketPledgeRecord
   extends BucketVo
 {
   private static final long serialVersionUID = 1L;
   
   public boolean equals(Object o) {
/* 11 */     if (o == this) return true;  if (!(o instanceof BussBucketPledgeRecord)) return false;  BussBucketPledgeRecord other = (BussBucketPledgeRecord)o; return !!other.canEqual(this); } protected boolean canEqual(Object other) { return other instanceof BussBucketPledgeRecord; } public int hashCode() { int result = 1; return 1; } public String toString() { return "BussBucketPledgeRecord()"; }
 
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\BussBucketPledgeRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */