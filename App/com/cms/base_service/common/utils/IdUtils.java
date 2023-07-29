package com.cms.base_service.common.utils;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IdUtils {
    /*  8 */   private static final Logger log = LoggerFactory.getLogger(com.cms.base_service.common.utils.IdUtils.class);

    /* 10 */   public static Sequence sequence = new Sequence(30L, 21L);

    public static String get() {
        /* 13 */
        return sequence.nextId()+"";
    }

    public static String createOrderNo(String prefix) {
        /* 17 */
        return prefix + sequence.nextId();
    }


    public static String getUuid() {
        /* 22 */
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\IdUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */