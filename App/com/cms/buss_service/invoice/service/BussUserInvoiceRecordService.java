 package com.cms.buss_service.invoice.service;

 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.invoice.domain.BussUserInvoiceRecord;
 import com.cms.buss_service.invoice.mapper.BussUserInvoiceRecordMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;












 @Service
 public class BussUserInvoiceRecordService
 {
   @Autowired(required = false)
   private BussUserInvoiceRecordMapper bussUserInvoiceRecordMapper;

   public BussUserInvoiceRecord selectBussUserInvoiceRecordById(Long id) {
/* 29 */     return this.bussUserInvoiceRecordMapper.selectBussUserInvoiceRecordById(id);
   }







   public List<BussUserInvoiceRecord> selectBussUserInvoiceRecordList(BussUserInvoiceRecord bussUserInvoiceRecord) {
/* 39 */     return this.bussUserInvoiceRecordMapper.selectBussUserInvoiceRecordList(bussUserInvoiceRecord);
   }







   public int insertBussUserInvoiceRecord(BussUserInvoiceRecord bussUserInvoiceRecord) {
/* 49 */     bussUserInvoiceRecord.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussUserInvoiceRecord.setCreateTime(DateUtils.getTime());
/* 51 */     return this.bussUserInvoiceRecordMapper.insertBussUserInvoiceRecord(bussUserInvoiceRecord);
   }







   public int updateBussUserInvoiceRecord(BussUserInvoiceRecord bussUserInvoiceRecord) {
/* 61 */     bussUserInvoiceRecord.setUpdateBy(SecurityUtils.getUid());
/* 62 */     bussUserInvoiceRecord.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussUserInvoiceRecordMapper.updateBussUserInvoiceRecord(bussUserInvoiceRecord);
   }







   public int deleteBussUserInvoiceRecordByIds(Long[] ids) {
/* 73 */     return this.bussUserInvoiceRecordMapper.deleteBussUserInvoiceRecordByIds(ids);
   }







   public int deleteBussUserInvoiceRecordById(Long id) {
/* 83 */     return this.bussUserInvoiceRecordMapper.deleteBussUserInvoiceRecordById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\service\BussUserInvoiceRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */