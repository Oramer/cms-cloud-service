package com.cms.system_service.system.controller;

import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.redis.RedisCache;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.common.utils.file.FileUploadUtils;
import com.cms.base_service.common.utils.file.MimeTypeUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.config.CmsConfig;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.service.ISysUserService;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;









@RestController
@RequestMapping({"/system/user/profile"})
public class SysProfileController
  extends BaseController
{
  @Autowired
  private ISysUserService userService;
  @Autowired
  private RedisCache redisCache;
  
  @GetMapping
  public RestResult profile() {
/*  46 */     SysUser user = SecurityUtils.getLoginUser();
/*  47 */     HashMap<String, Object> map = new HashMap<>();
/*  48 */     map.put("roleGroup", this.userService.selectUserRoleGroup(user.getUserName()));
/*  49 */     map.put("postGroup", this.userService.selectUserPostGroup(user.getUserName()));
/*  50 */     map.put("user", user);
/*  51 */     RestResult ajax = RestResult.ok(map);
/*  52 */     return ajax;
  }



  
  @Log(title = "个人信息", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult updateProfile(@RequestBody SysUser user) {
/*  61 */     SysUser sysUser = SecurityUtils.getLoginUser();
/*  62 */     user.setUserName(sysUser.getUserName());
/*  63 */     if (StringUtils.isNotEmpty(user.getPhonenumber()) && "1"
/*  64 */       .equals(this.userService.checkPhoneUnique(user))) {
/*  65 */       return RestResult.fail("修改用户'" + user.getUserName() + "'失败，手机号码已存在");
    }
/*  67 */     if (StringUtils.isNotEmpty(user.getEmail()) && "1"
/*  68 */       .equals(this.userService.checkEmailUnique(user))) {
/*  69 */       return RestResult.fail("修改用户'" + user.getUserName() + "'失败，邮箱账号已存在");
    }
/*  71 */     user.setUserId(sysUser.getUserId());
/*  72 */     user.setPassword(null);
/*  73 */     if (this.userService.updateUserProfile(user) > 0) {
      
/*  75 */       sysUser.setNickName(user.getNickName());
/*  76 */       sysUser.setPhonenumber(user.getPhonenumber());
/*  77 */       sysUser.setEmail(user.getEmail());
/*  78 */       sysUser.setSex(user.getSex());
/*  79 */       this.redisCache.setCacheObject("sys_login_user:" + sysUser.getUserName(), user);
/*  80 */       return RestResult.ok();
    } 
/*  82 */     return RestResult.fail("修改个人信息异常，请联系管理员");
  }



  
  @Log(title = "个人信息", businessType = BusinessType.UPDATE)
  @PutMapping({"/updatePwd"})
  public RestResult updatePwd(String oldPassword, String newPassword) {
/*  91 */     SysUser loginUser = this.userService.selectUserById(SecurityUtils.getUid());
/*  92 */     String userName = loginUser.getUserName();
/*  93 */     String password = loginUser.getPassword();
/*  94 */     String generatorPassword_old = SecurityUtils.generatorPassword(oldPassword, loginUser.getUserName());
/*  95 */     String generatorPassword_new = SecurityUtils.generatorPassword(newPassword, loginUser.getUserName());
/*  96 */     if (!password.equalsIgnoreCase(generatorPassword_old)) {
/*  97 */       return RestResult.fail("修改密码失败，旧密码错误");
    }
/*  99 */     if (password.equalsIgnoreCase(generatorPassword_new)) {
/* 100 */       return RestResult.fail("修改密码失败，新密码不能和旧密码相同");
    }
/* 102 */     loginUser.setPassword(SecurityUtils.generatorPassword(newPassword, loginUser.getUserName()));
/* 103 */     this.userService.updateUser(loginUser);
    
/* 105 */     this.redisCache.deleteObject("sys_login_user:" + loginUser.getUserName());
/* 106 */     return RestResult.ok();
  }



  
  @Log(title = "用户头像", businessType = BusinessType.UPDATE)
  @PostMapping({"/avatar"})
  public RestResult avatar(@RequestParam("avatarfile") MultipartFile file) throws Exception {
/* 115 */     if (!file.isEmpty()) {
/* 116 */       SysUser loginUser = getLoginUser();
/* 117 */       String avatar = FileUploadUtils.upload(CmsConfig.getAvatarPath(), file, MimeTypeUtils.IMAGE_EXTENSION);
/* 118 */       if (this.userService.updateUserAvatar(loginUser.getUserName(), avatar)) {
/* 119 */         HashMap<String, Object> map = new HashMap<>();
/* 120 */         map.put("imgUrl", avatar);
/* 121 */         RestResult ajax = RestResult.ok(map);
        
/* 123 */         loginUser.setAvatar(avatar);
/* 124 */         this.redisCache.setCacheObject("sys_login_user:" + loginUser.getUserName(), loginUser);
/* 125 */         return ajax;
      } 
    } 
/* 128 */     return RestResult.fail("上传图片异常，请联系管理员");
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysProfileController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */