package com.cms.buss_service.app;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cms.base_service.common.HttpUtils;
import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.redis.RedisCache;
import com.cms.base_service.common.utils.*;
import com.cms.buss_service.poster.service.BussStationPosterService;
import com.cms.buss_service.station.service.BussWaterStationInfoService;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.mapper.SysUserMapper;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

@RestController
@RequestMapping({"/api/wx"})
public class WeiChatLoginCtl extends AppCtl {
    /*  29 */   private static final Logger log = LoggerFactory.getLogger(WeiChatLoginCtl.class);


    @Autowired(required = false)
    private SysUserMapper userMapper;


    @Autowired(required = false)
    private BussStationPosterService bussStationPosterService;


    @Autowired(required = false)
    private BussWaterStationInfoService bussWaterStationInfoService;


    @Autowired
    private RedisCache redisCache;


    @RequestMapping({"/initwxlogin"})
    public RestResult ResultBeaninitWxLogin(String code) throws JSONException {
        try {
            /*  54 */
            String param = "appid=wx578320de8ea6562e&secret=0f9981962adfc9a73f1042919a195627&js_code=" + code + "&grant_type=authorization_code";
            /*  55 */
            String jsonString = HttpUtils.sendGet("https://api.weixin.qq.com/sns/jscode2session", param);

            /*  57 */
            JSONObject json = JSONObject.parseObject(jsonString);
            /*  58 */
            JSONObject data = new JSONObject();
            /*  59 */
            data.put("sessionKey", json.getString("session_key"));
            /*  60 */
            data.put("openId", json.getString("openid"));

            /*  62 */
            return RestResult.ok(data);
            /*  63 */
        } catch (Exception e) {
            /*  64 */
            return RestResult.fail("登录信息异常,Code已过期");
        }
    }


    @RequestMapping({"/decodeUserInfo"})
    public RestResult getUserInfo(String encryptedData, String sessionKey, String iv, String openId, String cloudPk, String shareInfo) {
        try {
            /*  80 */
            String account = getLoginPhone(encryptedData, sessionKey, iv);
            /*  81 */
            SysUser user = this.userMapper.checkPhoneUnique(account);
            /*  82 */
            if (user == null) {
                /*  83 */
                user = createLoginBody(account, openId, cloudPk, shareInfo);
                /*  84 */
                this.userMapper.insertUser(user);
            }

            /*  87 */
            this.redisCache.setCacheObject("user:temp:pwd" + user.getUserName(), user.getPassword());

            /*  89 */
            String token = JwtUtils.create(user);
            /*  90 */
            user.setJtoken(token);
            /*  91 */
            user.setPassword(null);
            /*  92 */
            return RestResult.ok(user);
            /*  93 */
        } catch (Exception e) {
            /*  94 */
            e.printStackTrace();

            /*  96 */
            return RestResult.fail("登录失败");
        }
    }

    @RequestMapping({"/refresh/{phonenumber}"})
    public RestResult refreshUserRole(@PathVariable String phonenumber) {
        /* 101 */
        SysUser user = this.userMapper.checkPhoneUnique(phonenumber);








        /* 110 */
        return RestResult.ok(user);
    }


    public String getLoginPhone(String encryptedData, String sessionKey, String iv) throws Exception {
        /* 124 */
        String result = "";

        /* 126 */
        byte[] dataByte = Base64.decodeBase64(encryptedData);

        /* 128 */
        byte[] keyByte = Base64.decodeBase64(sessionKey);

        /* 130 */
        byte[] ivByte = Base64.decodeBase64(iv);

        /* 132 */
        int base = 16;
        /* 133 */
        if (keyByte.length % base != 0) {
            /* 134 */
            int groups = keyByte.length / base + ((keyByte.length % base != 0) ? 1 : 0);

            /* 136 */
            byte[] temp = new byte[groups * base];
            /* 137 */
            Arrays.fill(temp, (byte) 0);
            /* 138 */
            System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
            /* 139 */
            keyByte = temp;
        }

        /* 142 */
        Security.addProvider((Provider) new BouncyCastleProvider());

        /* 144 */
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
        /* 145 */
        SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");

        /* 147 */
        AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
        /* 148 */
        parameters.init(new IvParameterSpec(ivByte));
        /* 149 */
        cipher.init(2, spec, parameters);
        /* 150 */
        byte[] resultByte = cipher.doFinal(dataByte);
        /* 151 */
        result = new String(resultByte, "UTF-8");
        /* 152 */
        JSONObject obj = JSONObject.parseObject(result);
        /* 153 */
        log.error("微信登录结果 .....|" + result);
        /* 154 */
        return (String) obj.get("purePhoneNumber");
    }


    public SysUser createLoginBody(String account, String openId, String cloudPk, String shareInfo) {
        /* 166 */
        SysUser user = new SysUser();
        /* 167 */
        String pwd = SecurityUtils.generatorPassword(account.substring(0, 6), account);
        /* 168 */
        user.setUserName(account);
        /* 169 */
        user.setNickName("微信用户");
        /* 170 */
        user.setUserId(IdUtils.get());
        /* 171 */
        user.setPhonenumber(account);
        /* 172 */
        user.setCreateTime(DateUtils.getTime());
        /* 173 */
        user.setPassword(pwd);
        /* 174 */
        user.setUd9(shareInfo);
        /* 175 */
        user.setUd10(openId);

        /* 177 */
        user.setCloudPk(StringUtils.isNotBlank(cloudPk) ? cloudPk : String.valueOf(Constants.SYSTEM_ADMIN_STATION_ID));
        /* 178 */
        return user;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\WeiChatLoginCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */