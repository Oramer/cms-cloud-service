 package com.cms.base_service.framework.config;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class GenConfig
 {
   public static String author;
   public static String packageName;
   public static boolean autoRemovePre;
   public static String tablePrefix;
   
   public static String getAuthor() {
/* 29 */     return author;
   }
 
   
   public void setAuthor(String author) {
/* 34 */     GenConfig.author = author;
   }
 
   
   public static String getPackageName() {
/* 39 */     return packageName;
   }
 
   
   public void setPackageName(String packageName) {
/* 44 */     GenConfig.packageName = packageName;
   }
 
   
   public static boolean getAutoRemovePre() {
/* 49 */     return autoRemovePre;
   }
 
   
   public void setAutoRemovePre(boolean autoRemovePre) {
/* 54 */     GenConfig.autoRemovePre = autoRemovePre;
   }
 
   
   public static String getTablePrefix() {
/* 59 */     return tablePrefix;
   }
 
   
   public void setTablePrefix(String tablePrefix) {
/* 64 */     GenConfig.tablePrefix = tablePrefix;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\config\GenConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */