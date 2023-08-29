 package com.cms.base_service.common.model;
 
 public enum OrderEnum
 {
/*  5 */   ORDER_DZF("待支付", Long.valueOf(1L)), ORDER_YZF("已支付", Long.valueOf(2L)), ORDER_YQX("已发货", Long.valueOf(3L)), ORDER_YCS("已超时", Long.valueOf(4L)), ORDER_YWC("已完成", Long.valueOf(5L));
   
   private Long code;
   private String label;
   
   OrderEnum(String label, Long code) {
/* 11 */     this.label = label;
/* 12 */     this.code = code;
   }
   
   public String getLabel() {
/* 16 */     return this.label;
   }
   
   public void setLabel(String label) {
/* 20 */     this.label = label;
   }
   
   public Long getCode() {
/* 24 */     return this.code;
   }
   
   public void setCode(Long code) {
/* 28 */     this.code = code;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\OrderEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */