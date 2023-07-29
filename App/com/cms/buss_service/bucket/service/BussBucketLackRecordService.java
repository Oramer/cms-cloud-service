 package com.cms.buss_service.bucket.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.base_service.common.utils.StringUtils;
 import com.cms.buss_service.bucket.domain.BussBucketLackRecord;
 import com.cms.buss_service.bucket.mapper.BussBucketLackRecordMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussBucketLackRecordService
 {
   @Autowired(required = false)
   private BussBucketLackRecordMapper BussBucketLackRecordMapper;
   
   public BussBucketLackRecord selectBussBucketLackRecordById(Long pk) {
/* 30 */     return this.BussBucketLackRecordMapper.selectBussBucketLackRecordById(pk);
   }
 
 
 
 
 
 
   
   public List<BussBucketLackRecord> selectBussBucketLackRecordList(BussBucketLackRecord bussBucketLackRecord) {
/* 40 */     return this.BussBucketLackRecordMapper.selectBussBucketLackRecordList(bussBucketLackRecord);
   }
 
 
 
 
 
 
   
   public int insertBussBucketLackRecord(BussBucketLackRecord buss) {
/* 50 */     buss.setCreateBy(StringUtils.isNotBlank(buss.getCreateBy()) ? buss.getCreateBy() : SecurityUtils.getUid());
/* 51 */     buss.setCreateTime(DateUtils.getTime());
/* 52 */     return this.BussBucketLackRecordMapper.insertBussBucketLackRecord(buss);
   }
 
 
 
 
 
 
   
   public int updateBussBucketLackRecord(BussBucketLackRecord bussBucketLackRecord) {
/* 62 */     bussBucketLackRecord.setUpdateBy(SecurityUtils.getUid());
/* 63 */     bussBucketLackRecord.setUpdateTime(DateUtils.getTime());
/* 64 */     return this.BussBucketLackRecordMapper.updateBussBucketLackRecord(bussBucketLackRecord);
   }
 
 
 
 
 
 
   
   public int deleteBussBucketLackRecordByIds(Long[] pks) {
/* 74 */     return this.BussBucketLackRecordMapper.deleteBussBucketLackRecordByIds(pks);
   }
 
 
 
 
 
 
   
   public int deleteBussBucketLackRecordById(Long pk) {
/* 84 */     return this.BussBucketLackRecordMapper.deleteBussBucketLackRecordById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\service\BussBucketLackRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */