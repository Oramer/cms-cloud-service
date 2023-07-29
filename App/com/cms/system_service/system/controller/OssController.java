 package com.cms.system_service.system.controller;
 
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.oss.OssUtils;
 import java.io.IOException;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.multipart.MultipartFile;
 
 
 
 
 
 @RequestMapping({"/oss"})
 @RestController
 public class OssController
 {
   @Autowired
   private OssUtils ossUtils;
   
   @RequestMapping({"/upload"})
   public RestResult uploadFile(@RequestParam MultipartFile file, String type) throws IOException {
/* 25 */     return this.ossUtils.uploadFile(file, type);
   }
 
 
 
 
 
 
   
   @RequestMapping({"/delete"})
   public RestResult deleteFile(String filePath) {
/* 36 */     return this.ossUtils.deleteFile(filePath);
   }
   
   public static void main(String[] args) {}
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\OssController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */