 package com.cms.buss_service.bucket.domain;

 import com.cms.buss_service.bucket.domain.BucketVo;


 public class BussBucketReturnRecord
   extends BucketVo
 {
   private static final long serialVersionUID = 1L;

   public boolean equals(Object o) {
/* 12 */     if (o == this) return true;  if (!(o instanceof com.cms.buss_service.bucket.domain.BussBucketReturnRecord)) return false;  com.cms.buss_service.bucket.domain.BussBucketReturnRecord other = (com.cms.buss_service.bucket.domain.BussBucketReturnRecord)o; return !!other.canEqual(this); } protected boolean canEqual(Object other) { return other instanceof com.cms.buss_service.bucket.domain.BussBucketReturnRecord; } public int hashCode() { int result = 1; return 1; } public String toString() { return "BussBucketReturnRecord()"; }

 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\BussBucketReturnRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */