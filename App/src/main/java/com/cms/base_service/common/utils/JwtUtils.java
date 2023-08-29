package com.cms.base_service.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.redis.RedisCache;
import com.cms.system_service.system.domain.SysUser;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtils {
    /* 16 */   private static final Logger log = LoggerFactory.getLogger(JwtUtils.class);


    @Autowired
    private RedisCache redisCache;


    public static String create(SysUser user) {
        /* 27 */
        Long cloud = Long.valueOf(StringUtils.isNotEmpty(user.getCloudPk()) ? Long.parseLong(user.getCloudPk()) : Constants.SYSTEM_ADMIN_STATION_ID.longValue());

        /* 29 */
        Map<String, Object> claims = new HashMap<>();
        /* 30 */
        claims.put("userid", user.getUserId());
        /* 31 */
        claims.put("user_name", user.getUserName());
        /* 32 */
        claims.put("dept_id", user.getDeptId());
        /* 33 */
        claims.put("cloudPk", cloud);
        /* 34 */
        claims.put("stationCharge", user.getUd5());
        /* 35 */
        return buildJwt(claims);
    }


    public static String buildJwt(Map<String, Object> claims) {
        /* 40 */
        return Jwts.builder()
/* 41 */.setClaims(claims)
/* 42 */.signWith(SignatureAlgorithm.HS256, "nicaiwoshishui").compact();
    }


    public Boolean validateJWT(String jwtStr) {
        /* 52 */
        Claims body = parseJWT(jwtStr);
        /* 53 */
        String key = Constants.Login_USER_REFRESH_KEY + body.get("user_name");
        /* 54 */
        Long keyExp = this.redisCache.getKeyExp(key);



        /* 58 */
        if (keyExp.longValue() - System.currentTimeMillis() < 3600000L) {
            /* 59 */
            Calendar calendar = Calendar.getInstance();
            /* 60 */
            calendar.set(11, calendar.get(11) + 1);
            /* 61 */
            this.redisCache.updateKey(key, calendar.getTimeInMillis());
            /* 62 */
            log.info("Token 过期时间刷新成功...........:{},{}", this.redisCache.getKeyExp(key), keyExp);
        }
        /* 64 */
        return Boolean.valueOf(true);
    }


    public static Claims parseJWT(String jwt) {
        /* 77 */
        Claims body = (Claims) Jwts.parser().setSigningKey("nicaiwoshishui").parseClaimsJws(jwt).getBody();

        /* 79 */
        return body;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\JwtUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */