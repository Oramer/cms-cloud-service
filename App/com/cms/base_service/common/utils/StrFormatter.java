 package com.cms.base_service.common.utils;
 
 import com.cms.base_service.common.utils.Convert;
 import com.cms.base_service.common.utils.StringUtils;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class StrFormatter
 {
   public static final String EMPTY_JSON = "{}";
   public static final char C_BACKSLASH = '\\';
   public static final char C_DELIM_START = '{';
   public static final char C_DELIM_END = '}';
   
   public static String format(String strPattern, Object... argArray) {
/* 29 */     if (StringUtils.isEmpty(strPattern) || StringUtils.isEmpty(argArray)) {
/* 30 */       return strPattern;
     }
/* 32 */     int strPatternLength = strPattern.length();
 
     
/* 35 */     StringBuilder sbuf = new StringBuilder(strPatternLength + 50);
     
/* 37 */     int handledPosition = 0;
     
/* 39 */     for (int argIndex = 0; argIndex < argArray.length; argIndex++) {
/* 40 */       int delimIndex = strPattern.indexOf("{}", handledPosition);
/* 41 */       if (delimIndex == -1) {
/* 42 */         if (handledPosition == 0) {
/* 43 */           return strPattern;
         }
/* 45 */         sbuf.append(strPattern, handledPosition, strPatternLength);
/* 46 */         return sbuf.toString();
       } 
       
/* 49 */       if (delimIndex > 0 && strPattern.charAt(delimIndex - 1) == '\\') {
/* 50 */         if (delimIndex > 1 && strPattern.charAt(delimIndex - 2) == '\\') {
           
/* 52 */           sbuf.append(strPattern, handledPosition, delimIndex - 1);
/* 53 */           sbuf.append(Convert.utf8Str(argArray[argIndex]));
/* 54 */           handledPosition = delimIndex + 2;
         } else {
           
/* 57 */           argIndex--;
/* 58 */           sbuf.append(strPattern, handledPosition, delimIndex - 1);
/* 59 */           sbuf.append('{');
/* 60 */           handledPosition = delimIndex + 1;
         } 
       } else {
         
/* 64 */         sbuf.append(strPattern, handledPosition, delimIndex);
/* 65 */         sbuf.append(Convert.utf8Str(argArray[argIndex]));
/* 66 */         handledPosition = delimIndex + 2;
       } 
     } 
 
     
/* 71 */     sbuf.append(strPattern, handledPosition, strPattern.length());
     
/* 73 */     return sbuf.toString();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\StrFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */