 package com.cms.system_service.system.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.multipart.MultipartFile;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.file.FileUploadUtils;
 import com.cms.base_service.common.utils.file.FileUtils;
 import com.cms.base_service.framework.config.CmsConfig;
 import com.cms.base_service.framework.config.ServerConfig;

 import java.util.HashMap;


 @RestController
 public class NativeUploadCtl
 {
   @Autowired
   private ServerConfig serverConfig;

   @PostMapping({"/common/upload"})
   public RestResult avatar(@RequestParam("file") MultipartFile file) throws Exception {
/* 29 */     if (!file.isEmpty()) {



/* 33 */       String filePath = CmsConfig.getUploadPath();

/* 35 */       String fileName = FileUploadUtils.upload(filePath, file);
/* 36 */       String url = this.serverConfig.getUrl() + fileName;
/* 37 */       RestResult ajax = RestResult.ok();
/* 38 */       HashMap<String, Object> ajaxs = new HashMap<>();
/* 39 */       ajaxs.put("url", url);
/* 40 */       ajaxs.put("fileName", fileName);
/* 41 */       ajaxs.put("newFileName", FileUtils.getName(fileName));
/* 42 */       ajaxs.put("originalFilename", file.getOriginalFilename());
/* 43 */       return RestResult.ok(ajaxs);
     }
/* 45 */     return RestResult.fail("上传图片异常，请联系管理员");
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\NativeUploadCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */