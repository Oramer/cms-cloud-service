 package com.cms.buss_service.bucket.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.bucket.domain.BussBucketInfo;
 import com.cms.buss_service.bucket.mapper.BussBucketInfoMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussBucketInfoService
 {
   @Autowired(required = false)
   private BussBucketInfoMapper BussBucketInfoMapper;
   
   public BussBucketInfo selectBussBucketInfoById(String pk) {
/* 30 */     return this.BussBucketInfoMapper.selectBussBucketInfoById(pk);
   }
 
 
 
 
 
 
   
   public List<BussBucketInfo> selectBussBucketInfoList(BussBucketInfo bussBucketInfo) {
/* 40 */     return this.BussBucketInfoMapper.selectBussBucketInfoList(bussBucketInfo);
   }
 
 
 
 
 
 
   
   public int insertBussBucketInfo(BussBucketInfo bussBucketInfo) {
/* 50 */     bussBucketInfo.setCreateTime(DateUtils.getTime());
/* 51 */     return this.BussBucketInfoMapper.insertBussBucketInfo(bussBucketInfo);
   }
 
 
 
 
 
 
   
   public int updateBussBucketInfo(BussBucketInfo bussBucketInfo) {
/* 61 */     bussBucketInfo.setUpdateTime(DateUtils.getTime());
/* 62 */     return this.BussBucketInfoMapper.updateBussBucketInfo(bussBucketInfo);
   }
 
 
 
 
 
 
   
   public int deleteBussBucketInfoByIds(String[] pks) {
/* 72 */     return this.BussBucketInfoMapper.deleteBussBucketInfoByIds(pks);
   }
 
 
 
 
 
 
   
   public int deleteBussBucketInfoById(String pk) {
/* 82 */     return this.BussBucketInfoMapper.deleteBussBucketInfoById(pk);
   }
   
   public BussBucketInfo selectInfoByOrderIdQt(String orderId) {
/* 86 */     return this.BussBucketInfoMapper.selectInfoByOrderIdQt(orderId);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\service\BussBucketInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */