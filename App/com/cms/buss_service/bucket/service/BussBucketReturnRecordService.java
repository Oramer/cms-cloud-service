 package com.cms.buss_service.bucket.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.bucket.domain.BussBucketReturnRecord;
 import com.cms.buss_service.bucket.mapper.BussBucketReturnRecordMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussBucketReturnRecordService
 {
   @Autowired(required = false)
   private BussBucketReturnRecordMapper bussBucketReturnRecordMapper;
   
   public BussBucketReturnRecord selectBussBucketReturnRecordById(Long pk) {
/* 29 */     return this.bussBucketReturnRecordMapper.selectBussBucketReturnRecordById(pk);
   }
 
 
 
 
 
 
   
   public List<BussBucketReturnRecord> selectBussBucketReturnRecordList(BussBucketReturnRecord bussBucketReturnRecord) {
/* 39 */     return this.bussBucketReturnRecordMapper.selectBussBucketReturnRecordList(bussBucketReturnRecord);
   }
 
 
 
 
 
 
   
   public int insertBussBucketReturnRecord(BussBucketReturnRecord bussBucketReturnRecord) {
/* 49 */     bussBucketReturnRecord.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussBucketReturnRecord.setCreateTime(DateUtils.getTime());
/* 51 */     return this.bussBucketReturnRecordMapper.insertBussBucketReturnRecord(bussBucketReturnRecord);
   }
 
 
 
 
 
 
   
   public int updateBussBucketReturnRecord(BussBucketReturnRecord bussBucketReturnRecord) {
/* 61 */     bussBucketReturnRecord.setUpdateBy(SecurityUtils.getUid());
/* 62 */     bussBucketReturnRecord.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussBucketReturnRecordMapper.updateBussBucketReturnRecord(bussBucketReturnRecord);
   }
 
 
 
 
 
 
   
   public int deleteBussBucketReturnRecordByIds(Long[] pks) {
/* 73 */     return this.bussBucketReturnRecordMapper.deleteBussBucketReturnRecordByIds(pks);
   }
 
 
 
 
 
 
   
   public int deleteBussBucketReturnRecordById(Long pk) {
/* 83 */     return this.bussBucketReturnRecordMapper.deleteBussBucketReturnRecordById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\service\BussBucketReturnRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */