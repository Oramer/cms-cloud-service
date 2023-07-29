 package com.cms.base_service.common.model;
 
 public enum BucketEnum
 {
/*  5 */   BC_QT("欠桶", "1"), BC_YT("压桶", "2"), BC_TT("退桶", "3"), BC_HT("回桶", "4");
   
   private String code;
   
   private String label;
 
   
   BucketEnum(String label, String code) {
/* 13 */     this.label = label;
/* 14 */     this.code = code;
   }
   
   public String getLabel() {
/* 18 */     return this.label;
   }
   
   public void setLabel(String label) {
/* 22 */     this.label = label;
   }
   
   public String getCode() {
/* 26 */     return this.code;
   }
   
   public void setCode(String code) {
/* 30 */     this.code = code;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\BucketEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */