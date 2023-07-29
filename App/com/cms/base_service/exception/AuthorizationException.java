 package com.cms.base_service.exception;
 
 
 
 
 
 
 
 
 
 public class AuthorizationException
   extends RuntimeException
 {
   private static final long serialVersionUID = 1L;
   private String message;
   
   public AuthorizationException() {}
   
   public AuthorizationException(String message) {
/* 20 */     super(message);
/* 21 */     this.message = message;
   }
 
   
   public String getMessage() {
/* 26 */     return this.message;
   }
   
   public void setMessage(String message) {
/* 30 */     this.message = message;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\exception\AuthorizationException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */