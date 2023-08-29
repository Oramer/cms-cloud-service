package com.cms.base_service.common.model;


public class RestResult
{
  private Boolean success;
  private String msg;
  private Object data;
  private Integer code;
  public static RestResult instance;
  
  public Boolean getSuccess() {
/*  33 */     return this.success;
  }
  
  public RestResult setSuccess(Boolean success) {
/*  37 */     this.success = success;
/*  38 */     return this;
  }
  
  public String getMsg() {
/*  42 */     return this.msg;
  }
  
  public RestResult setMsg(String msg) {
/*  46 */     this.msg = msg;
/*  47 */     return this;
  }
  
  public Object getData() {
/*  51 */     return this.data;
  }
  
  public RestResult setData(Object data) {
/*  55 */     this.data = data;
/*  56 */     return this;
  }
  
  public Integer getCode() {
/*  60 */     return this.code;
  }
  
  public RestResult setCode(Integer code) {
/*  64 */     this.code = code;
/*  65 */     return this;
  }
  
  public static RestResult ok() {
/*  69 */     synchronized (RestResult.class) {
/*  70 */       instance = new RestResult(Boolean.valueOf(true), "操作成功!", Constants.BUSSINESS_SUCCESS_CODE);
    } 
/*  72 */     return instance;
  }
  public static RestResult ok(String msg) {
/*  75 */     synchronized (RestResult.class) {
/*  76 */       instance = new RestResult(Boolean.valueOf(true), msg, Constants.BUSSINESS_SUCCESS_CODE);
    } 
/*  78 */     return instance;
  }
  public static RestResult ok(String msg, Object data) {
/*  81 */     synchronized (RestResult.class) {
/*  82 */       instance = new RestResult(Boolean.valueOf(true), msg, Constants.BUSSINESS_SUCCESS_CODE);
/*  83 */       instance.setData(data);
    } 
/*  85 */     return instance;
  }
  public static RestResult ok(Object data) {
/*  88 */     synchronized (RestResult.class) {
/*  89 */       instance = new RestResult(Boolean.valueOf(true), "操作成功!", Constants.BUSSINESS_SUCCESS_CODE);
/*  90 */       instance.setData(data);
    } 
/*  92 */     return instance;
  }
  
  public static RestResult fail() {
/*  96 */     synchronized (RestResult.class) {
/*  97 */       instance = new RestResult(Boolean.valueOf(false), "操作失败!", Constants.BUSSINESS_EXCEPTION_CODE);
    } 
/*  99 */     return instance;
  }
  public static RestResult fail(String msg) {
/* 102 */     synchronized (RestResult.class) {
/* 103 */       instance = new RestResult(Boolean.valueOf(false), msg, Constants.BUSSINESS_EXCEPTION_CODE);
    } 
/* 105 */     return instance;
  }
  
  private RestResult(Boolean success, String msg, Integer code) {
/* 109 */     this.success = success;
/* 110 */     this.msg = msg;
/* 111 */     this.code = code;
  }
  
  private RestResult() {}
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\RestResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */