 package com.cms.base_service.common.utils;

 import com.github.pagehelper.PageHelper;
 import com.cms.base_service.framework.web.page.PageDomain;
 import com.cms.base_service.framework.web.page.TableSupport;


 public class PageUtils
   extends PageHelper
 {
   public static void startPage() {
/* 17 */     PageDomain pageDomain = TableSupport.buildPageRequest();
/* 18 */     Integer pageNum = pageDomain.getPageNum();
/* 19 */     Integer pageSize = pageDomain.getPageSize();
/* 20 */     String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
/* 21 */     Boolean reasonable = pageDomain.getReasonable();
/* 22 */     PageHelper.startPage(pageNum.intValue(), pageSize.intValue(), orderBy).setReasonable(reasonable);
   }
 
 
 
   
   public static void clearPage() {
/* 29 */     PageHelper.clearPage();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\PageUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */