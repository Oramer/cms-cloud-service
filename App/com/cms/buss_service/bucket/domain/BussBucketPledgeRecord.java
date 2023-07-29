 package com.cms.buss_service.bucket.domain;
 
 import com.cms.buss_service.bucket.domain.BucketVo;
 
 public class BussBucketPledgeRecord
   extends BucketVo
 {
   private static final long serialVersionUID = 1L;
   
   public boolean equals(Object o) {
/* 11 */     if (o == this) return true;  if (!(o instanceof com.cms.buss_service.bucket.domain.BussBucketPledgeRecord)) return false;  com.cms.buss_service.bucket.domain.BussBucketPledgeRecord other = (com.cms.buss_service.bucket.domain.BussBucketPledgeRecord)o; return !!other.canEqual(this); } protected boolean canEqual(Object other) { return other instanceof com.cms.buss_service.bucket.domain.BussBucketPledgeRecord; } public int hashCode() { int result = 1; return 1; } public String toString() { return "BussBucketPledgeRecord()"; }
 
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\BussBucketPledgeRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */