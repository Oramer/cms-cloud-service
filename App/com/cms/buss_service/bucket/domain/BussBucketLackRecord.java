 package com.cms.buss_service.bucket.domain;
 
 import com.cms.buss_service.bucket.domain.BucketVo;
 
 public class BussBucketLackRecord
   extends BucketVo
 {
   private static final long serialVersionUID = 1L;
   
   public boolean equals(Object o) {
/* 11 */     if (o == this) return true;  if (!(o instanceof com.cms.buss_service.bucket.domain.BussBucketLackRecord)) return false;  com.cms.buss_service.bucket.domain.BussBucketLackRecord other = (com.cms.buss_service.bucket.domain.BussBucketLackRecord)o; return !!other.canEqual(this); } protected boolean canEqual(Object other) { return other instanceof com.cms.buss_service.bucket.domain.BussBucketLackRecord; } public int hashCode() { int result = 1; return 1; } public String toString() { return "BussBucketLackRecord()"; }
 
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\BussBucketLackRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */