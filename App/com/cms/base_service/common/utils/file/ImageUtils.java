 package com.cms.base_service.common.utils.file;
 
 import com.cms.base_service.framework.config.CmsConfig;
 import java.io.ByteArrayInputStream;
 import java.io.FileInputStream;
 import java.io.InputStream;
 import java.net.URL;
 import java.net.URLConnection;
 import java.util.Arrays;
 import org.apache.commons.lang3.StringUtils;
 import org.apache.poi.util.IOUtils;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 
 
 
 
 
 
 
 public class ImageUtils
 {
/* 23 */   private static final Logger log = LoggerFactory.getLogger(com.cms.base_service.common.utils.file.ImageUtils.class);
   
   public static byte[] getImage(String imagePath) {
/* 26 */     InputStream is = getFile(imagePath);
     try {
/* 28 */       return IOUtils.toByteArray(is);
/* 29 */     } catch (Exception e) {
/* 30 */       log.error("图片加载异常 {}", e);
/* 31 */       return null;
     } finally {
/* 33 */       IOUtils.closeQuietly(is);
     } 
   }
   
   public static InputStream getFile(String imagePath) {
     try {
/* 39 */       byte[] result = readFile(imagePath);
/* 40 */       result = Arrays.copyOf(result, result.length);
/* 41 */       return new ByteArrayInputStream(result);
/* 42 */     } catch (Exception e) {
/* 43 */       log.error("获取图片异常 {}", e);
       
/* 45 */       return null;
     } 
   }
 
 
 
 
 
   
   public static byte[] readFile(String url) {
/* 55 */     InputStream in = null;
     try {
/* 57 */       if (url.startsWith("http")) {
         
/* 59 */         URL urlObj = new URL(url);
/* 60 */         URLConnection urlConnection = urlObj.openConnection();
/* 61 */         urlConnection.setConnectTimeout(30000);
/* 62 */         urlConnection.setReadTimeout(60000);
/* 63 */         urlConnection.setDoInput(true);
/* 64 */         in = urlConnection.getInputStream();
       } else {
         
/* 67 */         String localPath = CmsConfig.getProfile();
/* 68 */         String downloadPath = localPath + StringUtils.substringAfter(url, String.valueOf("/profile"));
/* 69 */         in = new FileInputStream(downloadPath);
       } 
/* 71 */       return IOUtils.toByteArray(in);
/* 72 */     } catch (Exception e) {
/* 73 */       log.error("获取文件路径异常 {}", e);
/* 74 */       return null;
     } finally {
/* 76 */       IOUtils.closeQuietly(in);
     } 
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\file\ImageUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */