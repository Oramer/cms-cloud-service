 package com.cms.base_service.framework.web.page;
 
 import java.io.Serializable;
 import java.util.List;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class TableDataInfo
   implements Serializable
 {
   private static final long serialVersionUID = 1L;
   private long total;
   private long pages;
   private List<?> rows;
   private int code;
   private String msg;
   
   public TableDataInfo() {}
   
   public TableDataInfo(List<?> list, int total) {
/* 51 */     this.rows = list;
/* 52 */     this.total = total;
   }
   
   public long getPages() {
/* 56 */     return this.pages;
   }
   
   public void setPages(long pages) {
/* 60 */     this.pages = pages;
   }
   
   public long getTotal() {
/* 64 */     return this.total;
   }
   
   public void setTotal(long total) {
/* 68 */     this.total = total;
   }
   
   public List<?> getRows() {
/* 72 */     return this.rows;
   }
   
   public void setRows(List<?> rows) {
/* 76 */     this.rows = rows;
   }
   
   public int getCode() {
/* 80 */     return this.code;
   }
   
   public void setCode(int code) {
/* 84 */     this.code = code;
   }
   
   public String getMsg() {
/* 88 */     return this.msg;
   }
   
   public void setMsg(String msg) {
/* 92 */     this.msg = msg;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\web\page\TableDataInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */