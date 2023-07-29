 package com.cms.base_service.common.utils;

 import com.alibaba.fastjson.JSON;
 import com.cms.base_service.common.model.Constants;
 import java.io.PrintWriter;
 import java.util.HashMap;
 import java.util.Map;
 import javax.servlet.ServletResponse;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;




 public class ResultUtil
 {
/* 17 */   private static final Logger log = LoggerFactory.getLogger(com.cms.base_service.common.utils.ResultUtil.class);














   public static void responseJson(ServletResponse response, Map<String, Object> resultMap) {
/* 33 */     PrintWriter out = null;
     try {
/* 35 */       response.setCharacterEncoding("UTF-8");
/* 36 */       response.setContentType("application/json");
/* 37 */       out = response.getWriter();
/* 38 */       out.println(JSON.toJSONString(resultMap));
/* 39 */     } catch (Exception e) {
/* 40 */       log.error("【JSON输出异常】" + e);
     } finally {
/* 42 */       if (out != null) {
/* 43 */         out.flush();
/* 44 */         out.close();
       }
     }
   }







   public static Map<String, Object> resultSuccess(Map<String, Object> resultMap) {
/* 56 */     resultMap.put("message", "操作成功");
/* 57 */     resultMap.put("code", Constants.BUSSINESS_SUCCESS_CODE);
/* 58 */     return resultMap;
   }







   public static Map<String, Object> resultError(Map<String, Object> resultMap) {
/* 68 */     resultMap.put("message", "操作失败");
/* 69 */     resultMap.put("code", Integer.valueOf(500));
/* 70 */     return resultMap;
   }








   public static Map<String, Object> resultCode(Integer code, String msg) {
/* 81 */     Map<String, Object> resultMap = new HashMap<>();
/* 82 */     resultMap.put("message", msg);
/* 83 */     resultMap.put("code", code);
/* 84 */     return resultMap;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\ResultUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */