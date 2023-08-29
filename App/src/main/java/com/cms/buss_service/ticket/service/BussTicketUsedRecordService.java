 package com.cms.buss_service.ticket.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.ticket.domain.BussTicketUsedRecord;
 import com.cms.buss_service.ticket.mapper.BussTicketUsedRecordMapper;

 import java.util.List;


 @Service
 public class BussTicketUsedRecordService
 {
   @Autowired(required = false)
   private BussTicketUsedRecordMapper bussTicketUsedRecordMapper;

   public BussTicketUsedRecord selectBussTicketUsedRecordById(Integer id) {
/* 28 */     return this.bussTicketUsedRecordMapper.selectBussTicketUsedRecordById(id);
   }







   public List<BussTicketUsedRecord> selectBussTicketUsedRecordList(BussTicketUsedRecord bussTicketUsedRecord) {
/* 38 */     return this.bussTicketUsedRecordMapper.selectBussTicketUsedRecordList(bussTicketUsedRecord);
   }







   public int insertBussTicketUsedRecord(BussTicketUsedRecord bussTicketUsedRecord) {
/* 48 */     bussTicketUsedRecord.setCreateTime(DateUtils.getNowDate());
/* 49 */     return this.bussTicketUsedRecordMapper.insertBussTicketUsedRecord(bussTicketUsedRecord);
   }







   public int updateBussTicketUsedRecord(BussTicketUsedRecord bussTicketUsedRecord) {
/* 59 */     bussTicketUsedRecord.setUpdateTime(DateUtils.getNowDate());
/* 60 */     return this.bussTicketUsedRecordMapper.updateBussTicketUsedRecord(bussTicketUsedRecord);
   }







   public int deleteBussTicketUsedRecordByIds(Integer[] ids) {
/* 70 */     return this.bussTicketUsedRecordMapper.deleteBussTicketUsedRecordByIds(ids);
   }







   public int deleteBussTicketUsedRecordById(Integer id) {
/* 80 */     return this.bussTicketUsedRecordMapper.deleteBussTicketUsedRecordById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\service\BussTicketUsedRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */