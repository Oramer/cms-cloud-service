 package com.cms.system_service.system.domain;

 import org.apache.commons.lang3.builder.ToStringBuilder;
 import org.apache.commons.lang3.builder.ToStringStyle;












 public class SysUserPost
 {
   private String userId;
   private Long postId;

   public String getUserId() {
/* 23 */     return this.userId;
   }

   public void setUserId(String userId) {
/* 27 */     this.userId = userId;
   }

   public Long getPostId() {
/* 31 */     return this.postId;
   }

   public void setPostId(Long postId) {
/* 35 */     this.postId = postId;
   }


   public String toString() {
/* 40 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 41 */       .append("userId", getUserId())
/* 42 */       .append("postId", getPostId())
/* 43 */       .toString();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysUserPost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */