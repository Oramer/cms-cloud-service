 package com.cms.base_service.common.model;
 
 import com.cms.base_service.common.utils.Convert;
 import com.cms.base_service.common.utils.ServletUtils;
 import com.cms.base_service.framework.web.page.PageDomain;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class TableSupport
 {
   public static final String PAGE_NUM = "pageNum";
   public static final String PAGE_SIZE = "pageSize";
   public static final String ORDER_BY_COLUMN = "orderByColumn";
   public static final String IS_ASC = "isAsc";
   public static final String REASONABLE = "reasonable";
   
   public static PageDomain getPageDomain() {
/* 42 */     PageDomain pageDomain = new PageDomain();
/* 43 */     pageDomain.setPageNum(Convert.toInt(ServletUtils.getParameter("pageNum"), Integer.valueOf(1)));
/* 44 */     pageDomain.setPageSize(Convert.toInt(ServletUtils.getParameter("pageSize"), Integer.valueOf(10)));
/* 45 */     pageDomain.setOrderByColumn(ServletUtils.getParameter("orderByColumn"));
/* 46 */     pageDomain.setIsAsc(ServletUtils.getParameter("isAsc"));
/* 47 */     pageDomain.setReasonable(ServletUtils.getParameterToBool("reasonable"));
/* 48 */     return pageDomain;
   }
   
   public static PageDomain buildPageRequest() {
/* 52 */     return getPageDomain();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\TableSupport.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */