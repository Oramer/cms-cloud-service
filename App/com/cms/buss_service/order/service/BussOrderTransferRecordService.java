 package com.cms.buss_service.order.service;

 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.order.domain.BussOrderTransferRecord;
 import com.cms.buss_service.order.mapper.BussOrderTransferRecordMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;












 @Service
 public class BussOrderTransferRecordService
 {
   @Autowired(required = false)
   private BussOrderTransferRecordMapper bussOrderTransferRecordMapper;

   public BussOrderTransferRecord selectBussOrderTransferRecordById(Long id) {
/* 29 */     return this.bussOrderTransferRecordMapper.selectBussOrderTransferRecordById(id);
   }







   public List<BussOrderTransferRecord> selectBussOrderTransferRecordList(BussOrderTransferRecord bussOrderTransferRecord) {
/* 39 */     return this.bussOrderTransferRecordMapper.selectBussOrderTransferRecordList(bussOrderTransferRecord);
   }







   public int insertBussOrderTransferRecord(BussOrderTransferRecord bussOrderTransferRecord) {
/* 49 */     bussOrderTransferRecord.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussOrderTransferRecord.setCreateTime(DateUtils.getTime());
/* 51 */     return this.bussOrderTransferRecordMapper.insertBussOrderTransferRecord(bussOrderTransferRecord);
   }







   public int updateBussOrderTransferRecord(BussOrderTransferRecord bussOrderTransferRecord) {
/* 61 */     bussOrderTransferRecord.setUpdateBy(SecurityUtils.getUid());
/* 62 */     bussOrderTransferRecord.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussOrderTransferRecordMapper.updateBussOrderTransferRecord(bussOrderTransferRecord);
   }







   public int deleteBussOrderTransferRecordByIds(Long[] ids) {
/* 73 */     return this.bussOrderTransferRecordMapper.deleteBussOrderTransferRecordByIds(ids);
   }







   public int deleteBussOrderTransferRecordById(Long id) {
/* 83 */     return this.bussOrderTransferRecordMapper.deleteBussOrderTransferRecordById(id);
   }







   public BussOrderTransferRecord queryOrderTransferSource(String orderId) {
/* 93 */     return this.bussOrderTransferRecordMapper.queryOrderTransferSource(orderId);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\service\BussOrderTransferRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */