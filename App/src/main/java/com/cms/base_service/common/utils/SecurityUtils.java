package com.cms.base_service.common.utils;

import io.jsonwebtoken.Claims;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.redis.RedisCache;
import com.cms.system_service.system.domain.SysUser;

import javax.servlet.http.HttpServletRequest;

public class SecurityUtils {
    /*  13 */   private static final Logger log = LoggerFactory.getLogger(SecurityUtils.class);


    public static String getUserName() {
        /*  21 */
        HttpServletRequest request = ServletUtils.getRequest();
        /*  22 */
        String header = request.getHeader("Authorization");
        /*  23 */
        Claims claims = JwtUtils.parseJWT(header);

        /*  25 */
        return String.valueOf(claims.get("user_name"));
    }


    public static Boolean isAdmin() {
        /*  30 */
        return Boolean.valueOf("1128558726395985919,1128558726395985918".contains(getUid()));
    }

    public static Boolean isAdmin(String userId) {
        /*  34 */
        return Boolean.valueOf("1128558726395985919,1128558726395985918".contains(userId));
    }


    public static String getUid() {
        /*  44 */
        HttpServletRequest request = ServletUtils.getRequest();
        /*  45 */
        String header = request.getHeader("Authorization");
        /*  46 */
        Claims claims = JwtUtils.parseJWT(header);

        /*  48 */
        return String.valueOf(claims.get("userid"));
    }

    public static String getStationCharge() {
        /*  52 */
        HttpServletRequest request = ServletUtils.getRequest();
        /*  53 */
        String header = request.getHeader("Authorization");
        /*  54 */
        Claims claims = JwtUtils.parseJWT(header);

        /*  56 */
        return String.valueOf(claims.get("stationCharge"));
    }

    public static String getUid(HttpServletRequest request) {
        /*  60 */
        String header = request.getHeader("Authorization");
        /*  61 */
        Claims claims = JwtUtils.parseJWT(header);

        /*  63 */
        return String.valueOf(claims.get("userid"));
    }

    public static String getUserCropPk() {
        /*  67 */
        HttpServletRequest request = ServletUtils.getRequest();
        /*  68 */
        String header = request.getHeader("Authorization");
        /*  69 */
        Claims claims = JwtUtils.parseJWT(header);

        /*  71 */
        return String.valueOf(claims.get("dept_id"));
    }


    public static boolean matchesPassword(String username, String matchPass, String password) {
        /*  81 */
        if (StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password)) {
            /*  82 */
            String str = generatorPassword(password, username);
            /*  83 */
            if (matchPass.equalsIgnoreCase(str)) {
                /*  84 */
                return true;
            }
        }
        /*  87 */
        return false;
    }

    public static void main(String[] args) {
        /*  91 */
        System.out.println(MD5Util.generate("111111", "super"));
    }

    public static String generatorPassword(String password, String name) {
        /*  95 */
        return MD5Util.generate(password, name).toUpperCase();
    }


    public static String getUserName(HttpServletRequest request) {
        /* 100 */
        String authorization = request.getHeader("Authorization");
        /* 101 */
        Claims claims = JwtUtils.parseJWT(authorization);

        /* 103 */
        return String.valueOf(claims.get("user_name"));
    }

    public static Long getUserStationId() {
        /* 107 */
        HttpServletRequest request = ServletUtils.getRequest();
        /* 108 */
        String header = request.getHeader("Authorization");
        /* 109 */
        Claims claims = JwtUtils.parseJWT(header);

        /* 111 */
        String str = String.valueOf(claims.get("cloudPk"));
        /* 112 */
        return Long.valueOf((StringUtils.isNotEmpty(str) &&
                /* 113 */         !"null".equalsIgnoreCase(str) &&
                /* 114 */         !"undefined".equalsIgnoreCase(str)) ?
                /* 115 */         Long.parseLong(str) : Constants.SYSTEM_ADMIN_STATION_ID.longValue());
    }


    public static SysUser getLoginUser() {
        /* 120 */
        String uid = getUserName();
        /* 121 */
        SysUser user = (SysUser) ((RedisCache) ApplicationContextUtils.getBean(RedisCache.class)).getCacheObject("sys_login_user:" + uid);

        /* 123 */
        return user;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\SecurityUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */