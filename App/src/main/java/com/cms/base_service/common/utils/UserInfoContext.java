package com.cms.base_service.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cms.base_service.common.model.UserInfo;

public class UserInfoContext {
    /*  6 */   private static final Logger log = LoggerFactory.getLogger(UserInfoContext.class);

    /*  8 */   private static ThreadLocal<UserInfo> userInfo = new ThreadLocal<>();


    public static UserInfo getUser() {
        /* 15 */
        return userInfo.get();
    }

    public static void setUser(UserInfo user) {
        /* 19 */
        userInfo.set(user);
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\UserInfoContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */