 package com.cms.base_service.common.utils.file;
 
 
 
 
 
 
 
 
 
 
 public class MimeTypeUtils
 {
   public static final String IMAGE_PNG = "image/png";
   public static final String IMAGE_JPG = "image/jpg";
   public static final String IMAGE_JPEG = "image/jpeg";
   public static final String IMAGE_BMP = "image/bmp";
   public static final String IMAGE_GIF = "image/gif";
/* 19 */   public static final String[] IMAGE_EXTENSION = new String[] { "bmp", "gif", "jpg", "jpeg", "png" };
   
/* 21 */   public static final String[] FLASH_EXTENSION = new String[] { "swf", "flv" };
   
/* 23 */   public static final String[] MEDIA_EXTENSION = new String[] { "swf", "flv", "mp3", "wav", "wma", "wmv", "mid", "avi", "mpg", "asf", "rm", "rmvb" };
 
   
/* 26 */   public static final String[] DEFAULT_ALLOWED_EXTENSION = new String[] { "bmp", "gif", "jpg", "jpeg", "png", "doc", "docx", "xls", "xlsx", "ppt", "pptx", "html", "htm", "txt", "rar", "zip", "gz", "bz2", "bpmn", "bar", "pdf" };
 
 
 
 
 
 
 
 
 
   
/* 37 */   public static final String[] VIDEO_EXTENSION = new String[] { "mp4", "avi", "rmvb" };
   
   public static String getExtension(String prefix) {
/* 40 */     switch (prefix) {
       case "image/png":
/* 42 */         return "png";
       case "image/jpg":
/* 44 */         return "jpg";
       case "image/jpeg":
/* 46 */         return "jpeg";
       case "image/bmp":
/* 48 */         return "bmp";
       case "image/gif":
/* 50 */         return "gif";
     } 
/* 52 */     return "";
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\file\MimeTypeUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */