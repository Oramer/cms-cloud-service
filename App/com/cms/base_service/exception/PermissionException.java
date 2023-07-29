 package com.cms.base_service.exception;




 public class PermissionException
   extends RuntimeException
 {
   private String msg;

   public PermissionException(String msg) {
/* 12 */     super(msg);
/* 13 */     this.msg = msg;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\exception\PermissionException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */