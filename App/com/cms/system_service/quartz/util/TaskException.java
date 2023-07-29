 package com.cms.system_service.quartz.util;


 import org.aspectj.apache.bcel.classfile.Code;

 public class TaskException
   extends Exception
 {
   private static final long serialVersionUID = 1L;
   private Code code;

   public TaskException(String msg, Code code) {
/* 14 */     this(msg, code, null);
   }

   public TaskException(String msg, Code code, Exception nestedEx) {
/* 18 */     super(msg, nestedEx);
/* 19 */     this.code = code;
   }

   public Code getCode() {
/* 23 */     return this.code;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quart\\util\TaskException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */