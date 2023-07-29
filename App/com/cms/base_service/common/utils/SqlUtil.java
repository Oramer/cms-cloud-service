 package com.cms.base_service.common.utils;
 
 import com.cms.base_service.common.utils.StringUtils;
 import com.cms.base_service.exception.BusinessException;
 
 
 
 
 
 
 
 
 public class SqlUtil
 {
/* 15 */   public static String SQL_REGEX = "select |insert |delete |update |drop |count |exec |chr |mid |master |truncate |char |and |declare ";
 
 
 
   
/* 20 */   public static String SQL_PATTERN = "[a-zA-Z0-9_\\ \\,\\.]+";
 
 
 
   
   public static String escapeOrderBySql(String value) {
/* 26 */     if (StringUtils.isNotEmpty(value) && !isValidOrderBySql(value)) {
/* 27 */       throw new BusinessException("参数不符合规范，不能进行查询");
     }
/* 29 */     return value;
   }
 
 
 
   
   public static boolean isValidOrderBySql(String value) {
/* 36 */     return value.matches(SQL_PATTERN);
   }
 
 
 
   
   public static void filterKeyword(String value) {
/* 43 */     if (StringUtils.isEmpty(value)) {
       return;
     }
/* 46 */     String[] sqlKeywords = StringUtils.split(SQL_REGEX, "\\|");
/* 47 */     for (String sqlKeyword : sqlKeywords) {
/* 48 */       if (StringUtils.indexOfIgnoreCase(value, sqlKeyword) > -1)
/* 49 */         throw new BusinessException("参数存在SQL注入风险"); 
     } 
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\SqlUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */