 package com.cms.base_service.common.utils;
 
 import java.io.ByteArrayInputStream;
 import java.io.ByteArrayOutputStream;
 import java.io.InputStream;
 import java.net.URL;
 import java.net.URLConnection;
 import java.util.Arrays;
 import org.apache.poi.util.IOUtils;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 
 
 
 
 public class ImageUtils
 {
/* 18 */   private static final Logger log = LoggerFactory.getLogger(com.cms.base_service.common.utils.ImageUtils.class);
 
   
   public static byte[] getImage(String imagePath) {
/* 22 */     InputStream is = getFile(imagePath);
     try {
/* 24 */       return IOUtils.toByteArray(is);
/* 25 */     } catch (Exception e) {
/* 26 */       log.error("图片加载异常 {}", e);
/* 27 */       return null;
     } finally {
/* 29 */       IOUtils.closeQuietly(is);
     } 
   }
   
   public static InputStream getFile(String imagePath) {
     try {
/* 35 */       byte[] result = readFile(imagePath);
/* 36 */       result = Arrays.copyOf(result, result.length);
/* 37 */       return new ByteArrayInputStream(result);
/* 38 */     } catch (Exception e) {
/* 39 */       log.error("获取图片异常 {}", e);
       
/* 41 */       return null;
     } 
   }
 
 
 
 
   
   public static byte[] readFile(String url) {
/* 50 */     InputStream in = null;
/* 51 */     ByteArrayOutputStream baos = null;
     try {
/* 53 */       if (url.startsWith("http")) {
         
/* 55 */         URL urlObj = new URL(url);
/* 56 */         URLConnection urlConnection = urlObj.openConnection();
/* 57 */         urlConnection.setConnectTimeout(30000);
/* 58 */         urlConnection.setReadTimeout(60000);
/* 59 */         urlConnection.setDoInput(true);
/* 60 */         in = urlConnection.getInputStream();
       } 
 
       
/* 64 */       return IOUtils.toByteArray(in);
/* 65 */     } catch (Exception e) {
/* 66 */       log.error("获取文件路径异常 {}", e);
/* 67 */       return null;
     } finally {
/* 69 */       IOUtils.closeQuietly(baos);
     } 
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\ImageUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */