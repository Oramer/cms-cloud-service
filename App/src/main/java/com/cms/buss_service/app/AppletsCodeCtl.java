package com.cms.buss_service.app;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cms.base_service.common.HttpUtils;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.redis.RedisCache;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.framework.config.CmsConfig;
import com.cms.system_service.system.domain.SysUser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping({"/api"})
public class AppletsCodeCtl {
    /*  26 */   private static final Logger log = LoggerFactory.getLogger(AppletsCodeCtl.class);


    @Autowired
    private RedisCache redisCache;


    public RestResult getWxAcesstoken() {
        /*  38 */
        log.info("活跃accesstoken：appid=wx578320de8ea6562e");
        /*  39 */
        String tokenUrl = "https://api.weixin.qq.com/cgi-bin/token";
        /*  40 */
        String param = "grant_type=client_credential&appid=wx578320de8ea6562e&secret=0f9981962adfc9a73f1042919a195627";
        /*  41 */
        if (this.redisCache.ifExist("wxaccesstoken_wx578320de8ea6562e").booleanValue()) {
            /*  42 */
            return RestResult.ok("ok", this.redisCache.getCacheObject("wxaccesstoken_wx578320de8ea6562e"));
        }
        try {
            /*  45 */
            String jsonstr = HttpUtils.sendGet(tokenUrl, param);
            /*  46 */
            JSONObject jsonObject = JSON.parseObject(jsonstr);
            /*  47 */
            if (jsonObject.containsKey("access_token")) {
                /*  48 */
                String accesstoken = jsonObject.getString("access_token");
                /*  49 */
                this.redisCache.setCacheObject("wxaccesstoken_wx578320de8ea6562e", accesstoken, Long.valueOf(7150L), TimeUnit.SECONDS);
                /*  50 */
                return RestResult.ok("ok", accesstoken);
            }
            /*  52 */
            return RestResult.fail("未获取到token");

        }
        /*  55 */ catch (Exception e) {
            /*  56 */
            log.error("获取token异常：", e);
            /*  57 */
            return RestResult.fail(e.getLocalizedMessage());
        }
    }


    @GetMapping({"/getQrcode"})
    public RestResult getWXCode() {
        try {
            /*  68 */
            RestResult wxAcesstoken = getWxAcesstoken();
            /*  69 */
            if (wxAcesstoken.getCode().intValue() != 200) {
                /*  70 */
                return wxAcesstoken;
            }
            /*  72 */
            String access_token = (String) wxAcesstoken.getData();
            /*  73 */
            String url = "https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=" + access_token;
            /*  74 */
            Map<String, String> param = new HashMap<>();
            /*  75 */
            param.put("scene", SecurityUtils.getUid());
            /*  76 */
            param.put("page", "pages/home/home");

            /*  78 */
            String json = JSON.toJSONString(param);
            /*  79 */
            ByteArrayInputStream inputStream = HttpUtils.sendPostByte(url, json);

            /*  81 */
            if (inputStream.available() <= 200) {
                /*  82 */
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

                /*  84 */
                byte[] arrayOfByte = new byte[200];
                int j;
                /*  85 */
                while ((j = inputStream.read(arrayOfByte)) != -1) {
                    /*  86 */
                    byteArrayOutputStream.write(arrayOfByte, 0, j);
                }
                /*  88 */
                String str = new String(byteArrayOutputStream.toByteArray());

                /*  90 */
                JSONObject jsonObject = JSONObject.parseObject(str);
                /*  91 */
                if ("41030".equals(jsonObject.getString("errcode")))
                    /*  92 */ return RestResult.fail("所传page页面不存在，或者小程序没有发布");
                /*  93 */
                if ("45009".equals(jsonObject.getString("errcode"))) {
                    /*  94 */
                    return RestResult.fail("调用分钟频率受限");
                }
                /*  96 */
                byteArrayOutputStream.close();
            }
            /*  98 */
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            /*  99 */
            String fileName = "/noilCode_" + SecurityUtils.getUid() + "_" + sdf.format(new Date()) + ".jpeg";

            /* 101 */
            String filePath = CmsConfig.getUploadPath() + fileName;

            /* 103 */
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);

            /* 105 */
            byte[] buffer = new byte[200];
            int i;
            /* 106 */
            while ((i = inputStream.read(buffer)) != -1) {
                /* 107 */
                fileOutputStream.write(buffer, 0, i);
            }
            /* 109 */
            fileOutputStream.flush();
            /* 110 */
            fileOutputStream.close();
            /* 111 */
            inputStream.close();
            /* 112 */
            SysUser sysUser = new SysUser();
            /* 113 */
            sysUser.setUserId(SecurityUtils.getUid());
            /* 114 */
            sysUser.setNo10("/profile/upload" + fileName);
            /* 115 */
            return RestResult.ok("ok", "/profile/upload" + fileName);
            /* 116 */
        } catch (Exception e) {
            log.error(e.getMessage(),e);
            /* 117 */
            return RestResult.fail("获取葵花码异常");
        }
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\AppletsCodeCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */