/*   */ package com.cms.base_service.common;
/*   */ 
/*   */ import java.math.BigDecimal;
/*   */ 
/*   */ public class MathUtils
/*   */ {
/*   */   public static String getStringDecimal(BigDecimal dc) {
/* 8 */     return String.format("%.2f", new Object[] { dc });
/*   */   }
/*   */ }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\MathUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */