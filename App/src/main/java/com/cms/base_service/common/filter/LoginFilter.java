package com.cms.base_service.common.filter;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import com.cms.base_service.common.utils.JwtUtils;
import com.cms.base_service.exception.AuthorizationException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class LoginFilter
        implements HandlerInterceptor {
    /* 19 */   private static final Logger log = LoggerFactory.getLogger(LoginFilter.class);


    @Autowired
    JwtUtils jwtUtils;


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws AuthorizationException {
        /* 28 */
        log.error("当前请求路径为............................{}", request.getRequestURI());
        /* 29 */
        String token = request.getHeader("Authorization");
        /* 30 */
        if (StringUtils.isNotEmpty(token)) {
            /* 31 */
            boolean flag = this.jwtUtils.validateJWT(token).booleanValue();
            /* 32 */
            if (flag) {
                /* 33 */
                return true;
            }
        }
        /* 36 */
        throw new AuthorizationException("【鉴权异常】:登录信息已过期或尚未登录");
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\filter\LoginFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */