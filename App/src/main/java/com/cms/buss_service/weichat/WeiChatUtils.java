 package com.cms.buss_service.weichat;

 import com.alibaba.fastjson.JSON;
 import org.apache.commons.lang3.StringUtils;
 import com.cms.base_service.common.HttpUtils;

 import java.util.HashMap;


 public class WeiChatUtils
 {
   public static MapLocation getPointByAddress(String address) {
/* 16 */     String BAIDU_MAP_AK = "7NUYciESWAD9GZcCVlE0vpvBSFsjn8Mt";
/* 17 */     String url = "http://api.map.baidu.com/geocoding/v3/";
/* 18 */     HashMap<String, String> map = new HashMap<>();
/* 19 */     map.put("address", address);
/* 20 */     map.put("output", "json");
/* 21 */     map.put("ak", BAIDU_MAP_AK);
/* 22 */     String result = HttpUtils.sendGet(url, map);
/* 23 */     System.out.println(result);
/* 24 */     if (StringUtils.isNotBlank(result)) {
/* 25 */       MapPojo pojo = (MapPojo)JSON.parseObject(result, MapPojo.class);
/* 26 */       if (pojo != null && pojo.getStatus() == 0) {
/* 27 */         return pojo.getResult().getLocation();
       }
     }
/* 30 */     return null;
   }

   public static void main(String[] args) {}
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\weichat\WeiChatUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */