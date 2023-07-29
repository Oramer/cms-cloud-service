 package com.cms.buss_service.poster.service;

 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.poster.domain.BussPosterDispatchRewardRecord;
 import com.cms.buss_service.poster.mapper.BussPosterDispatchRewardRecordMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;












 @Service
 public class BussPosterDispatchRewardRecordService
 {
   @Autowired(required = false)
   private BussPosterDispatchRewardRecordMapper bussPosterDispatchRewardRecordMapper;

   public BussPosterDispatchRewardRecord selectBussPosterDispatchRewardRecordById(Integer id) {
/* 28 */     return this.bussPosterDispatchRewardRecordMapper.selectBussPosterDispatchRewardRecordById(id);
   }







   public List<BussPosterDispatchRewardRecord> selectBussPosterDispatchRewardRecordList(BussPosterDispatchRewardRecord bussPosterDispatchRewardRecord) {
/* 38 */     return this.bussPosterDispatchRewardRecordMapper.selectBussPosterDispatchRewardRecordList(bussPosterDispatchRewardRecord);
   }







   public int insertBussPosterDispatchRewardRecord(BussPosterDispatchRewardRecord bussPosterDispatchRewardRecord) {
/* 48 */     bussPosterDispatchRewardRecord.setCreateTime(DateUtils.getNowDate());
/* 49 */     return this.bussPosterDispatchRewardRecordMapper.insertBussPosterDispatchRewardRecord(bussPosterDispatchRewardRecord);
   }







   public int updateBussPosterDispatchRewardRecord(BussPosterDispatchRewardRecord bussPosterDispatchRewardRecord) {
/* 59 */     bussPosterDispatchRewardRecord.setUpdateTime(DateUtils.getNowDate());
/* 60 */     return this.bussPosterDispatchRewardRecordMapper.updateBussPosterDispatchRewardRecord(bussPosterDispatchRewardRecord);
   }







   public int deleteBussPosterDispatchRewardRecordByIds(Integer[] ids) {
/* 70 */     return this.bussPosterDispatchRewardRecordMapper.deleteBussPosterDispatchRewardRecordByIds(ids);
   }







   public int deleteBussPosterDispatchRewardRecordById(Integer id) {
/* 80 */     return this.bussPosterDispatchRewardRecordMapper.deleteBussPosterDispatchRewardRecordById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\service\BussPosterDispatchRewardRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */