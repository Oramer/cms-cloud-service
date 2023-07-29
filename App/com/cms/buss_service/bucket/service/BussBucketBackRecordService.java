 package com.cms.buss_service.bucket.service;

 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.bucket.domain.BussBucketBackRecord;
 import com.cms.buss_service.bucket.mapper.BussBucketBackRecordMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;












 @Service
 public class BussBucketBackRecordService
 {
   @Autowired(required = false)
   private BussBucketBackRecordMapper bussBucketBackRecordMapper;

   public BussBucketBackRecord selectBussBucketBackRecordById(Long pk) {
/* 29 */     return this.bussBucketBackRecordMapper.selectBussBucketBackRecordById(pk);
   }







   public List<BussBucketBackRecord> selectBussBucketBackRecordList(BussBucketBackRecord bussBucketBackRecord) {
/* 39 */     return this.bussBucketBackRecordMapper.selectBussBucketBackRecordList(bussBucketBackRecord);
   }







   public int insertBussBucketBackRecord(BussBucketBackRecord bussBucketBackRecord) {
/* 49 */     bussBucketBackRecord.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussBucketBackRecord.setCreateTime(DateUtils.getTime());
/* 51 */     return this.bussBucketBackRecordMapper.insertBussBucketBackRecord(bussBucketBackRecord);
   }







   public int updateBussBucketBackRecord(BussBucketBackRecord bussBucketBackRecord) {
/* 61 */     bussBucketBackRecord.setUpdateBy(SecurityUtils.getUid());
/* 62 */     bussBucketBackRecord.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussBucketBackRecordMapper.updateBussBucketBackRecord(bussBucketBackRecord);
   }







   public int deleteBussBucketBackRecordByIds(Long[] pks) {
/* 73 */     return this.bussBucketBackRecordMapper.deleteBussBucketBackRecordByIds(pks);
   }







   public int deleteBussBucketBackRecordById(Long pk) {
/* 83 */     return this.bussBucketBackRecordMapper.deleteBussBucketBackRecordById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\service\BussBucketBackRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */