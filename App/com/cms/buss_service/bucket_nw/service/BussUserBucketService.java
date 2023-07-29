 package com.cms.buss_service.bucket_nw.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.bucket_nw.domain.BussUserBucket;
 import com.cms.buss_service.bucket_nw.mapper.BussUserBucketMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussUserBucketService
 {
   @Autowired(required = false)
   private BussUserBucketMapper bussUserBucketMapper;
   
   public BussUserBucket selectBussUserBucketById(Long id) {
/* 28 */     return this.bussUserBucketMapper.selectBussUserBucketById(id);
   }
 
 
 
 
 
 
   
   public List<BussUserBucket> selectBussUserBucketList(BussUserBucket bussUserBucket) {
/* 38 */     return this.bussUserBucketMapper.selectBussUserBucketList(bussUserBucket);
   }
 
 
 
 
 
 
   
   public int insertBussUserBucket(BussUserBucket bussUserBucket) {
/* 48 */     bussUserBucket.setCreateTime(DateUtils.getNowDate());
/* 49 */     return this.bussUserBucketMapper.insertBussUserBucket(bussUserBucket);
   }
 
 
 
 
 
 
   
   public int updateBussUserBucket(BussUserBucket bussUserBucket) {
/* 59 */     bussUserBucket.setUpdateTime(DateUtils.getNowDate());
/* 60 */     return this.bussUserBucketMapper.updateBussUserBucket(bussUserBucket);
   }
 
 
 
 
 
 
   
   public int deleteBussUserBucketByIds(Long[] ids) {
/* 70 */     return this.bussUserBucketMapper.deleteBussUserBucketByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussUserBucketById(Long id) {
/* 80 */     return this.bussUserBucketMapper.deleteBussUserBucketById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket_nw\service\BussUserBucketService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */