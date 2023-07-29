 package com.cms.base_service.framework.web.page;
 
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
/* 41 */     PageDomain pageDomain = new PageDomain();
/* 42 */     pageDomain.setPageNum(Convert.toInt(ServletUtils.getParameter("pageNum"), Integer.valueOf(1)));
/* 43 */     pageDomain.setPageSize(Convert.toInt(ServletUtils.getParameter("pageSize"), Integer.valueOf(10)));
/* 44 */     pageDomain.setOrderByColumn(ServletUtils.getParameter("orderByColumn"));
/* 45 */     pageDomain.setIsAsc(ServletUtils.getParameter("isAsc"));
     
/* 47 */     return pageDomain;
   }
   
   public static PageDomain buildPageRequest() {
/* 51 */     return getPageDomain();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\web\page\TableSupport.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */