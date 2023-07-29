package com.cms.system_service.system.controller;
import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.model.LoginBody;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.redis.RedisCache;
import com.cms.base_service.common.utils.Base64;
import com.cms.base_service.common.utils.IdUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.system_service.system.domain.SysMenu;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.service.ISysConfigService;
import com.cms.system_service.system.service.ISysMenuService;
import com.cms.system_service.system.service.ISysUserService;
import com.cms.system_service.system.service.LoginService;
import com.cms.system_service.system.service.SysPermissionService;
import com.google.code.kaptcha.Producer;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FastByteArrayOutputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysLoginCtl {
/*  38 */   private static final Logger log = LoggerFactory.getLogger(com.cms.system_service.system.controller.SysLoginCtl.class);


  @Autowired
  private LoginService loginService;


  @Autowired(required = false)
  private RedisCache redisCache;


  @Resource(name = "captchaProducer")
  private Producer captchaProducer;

  @Resource(name = "captchaProducerMath")
  private Producer captchaProducerMath;

  @Autowired
  private ISysConfigService sysConfigService;

  @Autowired
  private ISysUserService sysUserService;

  @Autowired
  private ISysMenuService menuService;

  @Autowired
  private SysPermissionService permissionService;


  @PostMapping({"/login"})
  public RestResult login(@RequestBody LoginBody loginUser) {
/*  70 */     String token = this.loginService.login(loginUser);
/*  71 */     HashMap<String, Object> map = new HashMap<>();
/*  72 */     map.put("token", token);
/*  73 */     return RestResult.ok().setData(map);
  }






  @GetMapping({"/getInfo"})
  public RestResult getInfo() {
/*  83 */     SysUser user = this.sysUserService.selectUserById(SecurityUtils.getUid());

/*  85 */     Set<String> roles = this.permissionService.getRolePermission(user);

/*  87 */     Set<String> permissions = this.permissionService.getMenuPermission(user);
/*  88 */     user.setPermissionset(permissions);
/*  89 */     user.setRoleset(roles);
/*  90 */     this.redisCache.setCacheObject("sys_login_user:" + user.getUserName(), user, Long.valueOf(86400000L), TimeUnit.MINUTES);
/*  91 */     user.setIsSuperAdmin(SecurityUtils.isAdmin());
/*  92 */     Map<Object, Object> ajax = new HashMap<>();
/*  93 */     ajax.put("user", user);
/*  94 */     ajax.put("roles", roles);
/*  95 */     ajax.put("permissions", permissions);
/*  96 */     return RestResult.ok().setData(ajax);
  }






  @PostMapping({"/logout"})
  public RestResult logout() {
    try {
/* 107 */       this.redisCache.deleteObject("sys_login_user:" + SecurityUtils.getUid());
/* 108 */       this.redisCache.deleteObject(Constants.Login_USER_REFRESH_KEY + SecurityUtils.getUid());
/* 109 */     } catch (Exception e) {
/* 110 */       log.error((e.getCause() != null) ? e.getCause().toString() : "登出失败");
    }
/* 112 */     return RestResult.ok().setMsg("登出成功");
  }


  @GetMapping({"/captchaImage"})
  public RestResult getCode(HttpServletResponse response) throws IOException {
/* 118 */     HashMap<String, Object> map = new HashMap<>();
/* 119 */     String uuid = IdUtils.get();
/* 120 */     map.put("uuid", uuid);
/* 121 */     boolean captchaOnOff = this.sysConfigService.selectCaptchaOnOff();
/* 122 */     map.put("captchaOnOff", Boolean.valueOf(captchaOnOff));
/* 123 */     if (!captchaOnOff)
    {
/* 125 */       return RestResult.ok().setData(map);
    }


/* 129 */     String verifyKey = "captcha_codes:" + uuid;

/* 131 */     String capStr = null, code = null;
/* 132 */     BufferedImage image = null;


/* 135 */     String captchaType = this.sysConfigService.selectCaptchaType();
/* 136 */     if ("char".equals(captchaType)) {
/* 137 */       capStr = code = this.captchaProducer.createText();
/* 138 */       image = this.captchaProducer.createImage(capStr);
    } else {
/* 140 */       String capText = this.captchaProducerMath.createText();
/* 141 */       capStr = capText.substring(0, capText.lastIndexOf("@"));
/* 142 */       code = capText.substring(capText.lastIndexOf("@") + 1);
/* 143 */       image = this.captchaProducerMath.createImage(capStr);
    }

/* 146 */     this.redisCache.setCacheObject(verifyKey, code, Long.valueOf(2L), TimeUnit.MINUTES);
/* 147 */     FastByteArrayOutputStream os = new FastByteArrayOutputStream();
    try {
/* 149 */       ImageIO.write(image, "jpg", (OutputStream)os);
/* 150 */     } catch (IOException e) {
/* 151 */       return RestResult.fail().setMsg(e.getMessage());
    }
/* 153 */     map.put("uuid", uuid);
/* 154 */     map.put("img", Base64.encode(os.toByteArray()));
/* 155 */     return RestResult.ok().setData(map);
  }






  @GetMapping({"getRouters"})
  public RestResult getRouters() {
/* 165 */     String userId = SecurityUtils.getUid();
/* 166 */     List<SysMenu> menus = this.menuService.selectMenuTreeByUserId(userId);
/* 167 */     return RestResult.ok(this.menuService.buildMenus(menus));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysLoginCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */