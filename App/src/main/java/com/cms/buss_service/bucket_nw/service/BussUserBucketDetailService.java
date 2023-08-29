 package com.cms.buss_service.bucket_nw.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.bucket_nw.domain.BussUserBucketDetail;
 import com.cms.buss_service.bucket_nw.mapper.BussUserBucketDetailMapper;

 import java.util.List;


 @Service
 public class BussUserBucketDetailService
 {
   @Autowired(required = false)
   private BussUserBucketDetailMapper bussUserBucketDetailMapper;
   
   public BussUserBucketDetail selectBussUserBucketDetailById(Long id) {
/* 28 */     return this.bussUserBucketDetailMapper.selectBussUserBucketDetailById(id);
   }
 
 
 
 
 
 
   
   public List<BussUserBucketDetail> selectBussUserBucketDetailList(BussUserBucketDetail bussUserBucketDetail) {
/* 38 */     return this.bussUserBucketDetailMapper.selectBussUserBucketDetailList(bussUserBucketDetail);
   }
 
 
 
 
 
 
   
   public int insertBussUserBucketDetail(BussUserBucketDetail bussUserBucketDetail) {
/* 48 */     bussUserBucketDetail.setCreateTime(DateUtils.getNowDate());
/* 49 */     return this.bussUserBucketDetailMapper.insertBussUserBucketDetail(bussUserBucketDetail);
   }
 
 
 
 
 
 
   
   public int updateBussUserBucketDetail(BussUserBucketDetail bussUserBucketDetail) {
/* 59 */     bussUserBucketDetail.setUpdateTime(DateUtils.getNowDate());
/* 60 */     return this.bussUserBucketDetailMapper.updateBussUserBucketDetail(bussUserBucketDetail);
   }
 
 
 
 
 
 
   
   public int deleteBussUserBucketDetailByIds(Long[] ids) {
/* 70 */     return this.bussUserBucketDetailMapper.deleteBussUserBucketDetailByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussUserBucketDetailById(Long id) {
/* 80 */     return this.bussUserBucketDetailMapper.deleteBussUserBucketDetailById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket_nw\service\BussUserBucketDetailService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */