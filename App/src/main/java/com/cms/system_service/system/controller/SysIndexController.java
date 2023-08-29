 package com.cms.system_service.system.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 import com.cms.base_service.common.utils.StringUtils;


 @RestController
 public class SysIndexController
 {
   @Autowired
   private com.cms.base_service.framework.config.CmsConfig CmsConfig;

   @RequestMapping({"/"})
   public String index() {
/* 27 */     return StringUtils.format("欢迎使用{}后台管理框架，当前版本：v{}，请通过前端地址访问。", new Object[] { this.CmsConfig.getName(), this.CmsConfig.getVersion() });
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysIndexController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */