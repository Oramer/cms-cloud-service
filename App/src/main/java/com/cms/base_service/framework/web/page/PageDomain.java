 package com.cms.base_service.framework.web.page;

 import com.cms.base_service.common.utils.StringUtils;


 public class PageDomain
 {
   private Integer pageNum;
   private Integer pageSize;
   private String orderByColumn;
/* 29 */   private String isAsc = "asc";
 
 
 
   
/* 34 */   private Boolean reasonable = Boolean.valueOf(true);
   
   public String getOrderBy() {
/* 37 */     if (StringUtils.isEmpty(this.orderByColumn)) {
/* 38 */       return "";
     }
/* 40 */     return StringUtils.toUnderScoreCase(this.orderByColumn) + " " + this.isAsc;
   }
   
   public Integer getPageNum() {
/* 44 */     return this.pageNum;
   }
   
   public void setPageNum(Integer pageNum) {
/* 48 */     this.pageNum = pageNum;
   }
   
   public Integer getPageSize() {
/* 52 */     return this.pageSize;
   }
   
   public void setPageSize(Integer pageSize) {
/* 56 */     this.pageSize = pageSize;
   }
   
   public String getOrderByColumn() {
/* 60 */     return this.orderByColumn;
   }
   
   public void setOrderByColumn(String orderByColumn) {
/* 64 */     this.orderByColumn = orderByColumn;
   }
   
   public String getIsAsc() {
/* 68 */     return this.isAsc;
   }
   
   public void setIsAsc(String isAsc) {
/* 72 */     if (StringUtils.isNotEmpty(isAsc)) {
       
/* 74 */       if ("ascending".equals(isAsc)) {
/* 75 */         isAsc = "asc";
/* 76 */       } else if ("descending".equals(isAsc)) {
/* 77 */         isAsc = "desc";
       } 
/* 79 */       this.isAsc = isAsc;
     } 
   }
   
   public Boolean getReasonable() {
/* 84 */     if (StringUtils.isNull(this.reasonable)) {
/* 85 */       return Boolean.TRUE;
     }
/* 87 */     return this.reasonable;
   }
   
   public void setReasonable(Boolean reasonable) {
/* 91 */     this.reasonable = reasonable;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\web\page\PageDomain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */