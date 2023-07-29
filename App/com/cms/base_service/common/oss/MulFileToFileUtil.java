 package com.cms.base_service.common.oss;

 import java.io.File;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.OutputStream;
 import org.springframework.web.multipart.MultipartFile;











 public class MulFileToFileUtil
 {
   public static File multipartFileToFile(MultipartFile file) {
     try {
/* 24 */       if (file != null && file.getSize() > 0L) {
/* 25 */         InputStream ins = null;
/* 26 */         ins = file.getInputStream();
/* 27 */         File toFile = new File(file.getOriginalFilename());
/* 28 */         inputStreamToFile(ins, toFile);
/* 29 */         ins.close();
/* 30 */         return toFile;
       }
/* 32 */       return null;
/* 33 */     } catch (IOException e) {
/* 34 */       e.printStackTrace();
/* 35 */       return null;
     }
   }







   public static void inputStreamToFile(InputStream ins, File file) {
     try {
/* 47 */       OutputStream os = new FileOutputStream(file);

/* 49 */       byte[] buffer = new byte[8192]; int bytesRead;
/* 50 */       while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
/* 51 */         os.write(buffer, 0, bytesRead);
       }
/* 53 */       os.close();
/* 54 */       ins.close();
/* 55 */     } catch (Exception e) {
/* 56 */       e.printStackTrace();
     }
   }






   public static void deleteTempFile(File file) {
/* 66 */     if (file != null) {
/* 67 */       File del = new File(file.toURI());
/* 68 */       del.delete();
     }
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\oss\MulFileToFileUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */