 package com.cms.buss_service.bucket.service;

 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.base_service.common.utils.StringUtils;
 import com.cms.buss_service.bucket.domain.BussBucketPledgeRecord;
 import com.cms.buss_service.bucket.mapper.BussBucketPledgeRecordMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;












 @Service
 public class BussBucketPledgeRecordService
 {
   @Autowired(required = false)
   private BussBucketPledgeRecordMapper bussBucketPledgeRecordMapper;

   public BussBucketPledgeRecord selectBussBucketPledgeRecordById(Long pk) {
/* 30 */     return this.bussBucketPledgeRecordMapper.selectBussBucketPledgeRecordById(pk);
   }







   public List<BussBucketPledgeRecord> selectBussBucketPledgeRecordList(BussBucketPledgeRecord bussBucketPledgeRecord) {
/* 40 */     return this.bussBucketPledgeRecordMapper.selectBussBucketPledgeRecordList(bussBucketPledgeRecord);
   }







   public int insertBussBucketPledgeRecord(BussBucketPledgeRecord buss) {
/* 50 */     buss.setCreateBy(StringUtils.isNotBlank(buss.getCreateBy()) ? buss.getCreateBy() : SecurityUtils.getUid());
/* 51 */     buss.setCreateTime(DateUtils.getTime());
/* 52 */     return this.bussBucketPledgeRecordMapper.insertBussBucketPledgeRecord(buss);
   }







   public int updateBussBucketPledgeRecord(BussBucketPledgeRecord bussBucketPledgeRecord) {
/* 62 */     bussBucketPledgeRecord.setUpdateBy(SecurityUtils.getUid());
/* 63 */     bussBucketPledgeRecord.setUpdateTime(DateUtils.getTime());
/* 64 */     return this.bussBucketPledgeRecordMapper.updateBussBucketPledgeRecord(bussBucketPledgeRecord);
   }







   public int deleteBussBucketPledgeRecordByIds(Long[] pks) {
/* 74 */     return this.bussBucketPledgeRecordMapper.deleteBussBucketPledgeRecordByIds(pks);
   }







   public int deleteBussBucketPledgeRecordById(Long pk) {
/* 84 */     return this.bussBucketPledgeRecordMapper.deleteBussBucketPledgeRecordById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\service\BussBucketPledgeRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */