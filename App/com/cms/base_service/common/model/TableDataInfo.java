package com.cms.base_service.common.model;

import java.io.Serializable;
import java.util.List;

































public class TableDataInfo
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private Boolean success;
  private long total;
  private long pages;
  private List<?> rows;
  private int code;
  private String msg;

  public TableDataInfo() {}

  public TableDataInfo(List<?> list, int total) {
/*  52 */     this.rows = list;
/*  53 */     this.total = total;
  }

  public Boolean getSuccess() {
/*  57 */     return this.success;
  }

  public void setSuccess(Boolean success) {
/*  61 */     this.success = success;
  }

  public long getPages() {
/*  65 */     return this.pages;
  }

  public void setPages(long pages) {
/*  69 */     this.pages = pages;
  }

  public long getTotal() {
/*  73 */     return this.total;
  }

  public void setTotal(long total) {
/*  77 */     this.total = total;
  }

  public List<?> getRows() {
/*  81 */     return this.rows;
  }

  public void setRows(List<?> rows) {
/*  85 */     this.rows = rows;
  }

  public int getCode() {
/*  89 */     return this.code;
  }

  public void setCode(int code) {
/*  93 */     this.code = code;
  }

  public String getMsg() {
/*  97 */     return this.msg;
  }

  public void setMsg(String msg) {
/* 101 */     this.msg = msg;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\TableDataInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */