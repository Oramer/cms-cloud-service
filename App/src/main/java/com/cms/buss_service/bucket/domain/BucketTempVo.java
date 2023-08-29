/*   */ package com.cms.buss_service.bucket.domain;
/*   */ 
/*   */ public class BucketTempVo {
/*   */   public boolean equals(Object o) {
/* 5 */     if (o == this) return true;  if (!(o instanceof BucketTempVo)) return false;  BucketTempVo other = (BucketTempVo)o; return !!other.canEqual(this); } protected boolean canEqual(Object other) { return other instanceof BucketTempVo; } public int hashCode() { int result = 1; return 1; } public String toString() { return "BucketTempVo()"; }
/*   */ 
/*   */ }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\domain\BucketTempVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */