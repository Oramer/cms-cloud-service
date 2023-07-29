 package com.cms.base_service.common.utils;

 import com.cms.base_service.common.utils.StringUtils;
 import java.io.PrintWriter;
 import java.io.StringWriter;
 import org.apache.commons.lang3.exception.ExceptionUtils;









 public class ExceptionUtil
 {
   public static String getExceptionMessage(Throwable e) {
/* 19 */     StringWriter sw = new StringWriter();
/* 20 */     e.printStackTrace(new PrintWriter(sw, true));
/* 21 */     String str = sw.toString();
/* 22 */     return str;
   }


   public static String getRootErrorMessage(Exception e) {
/* 27 */     Throwable root = ExceptionUtils.getRootCause(e);
/* 28 */     root = (root == null) ? e : root;
/* 29 */     if (root == null)
     {
/* 31 */       return "";
     }
/* 33 */     String msg = root.getMessage();
/* 34 */     if (msg == null)
     {
/* 36 */       return "null";
     }
/* 38 */     return StringUtils.defaultString(msg);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\ExceptionUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */