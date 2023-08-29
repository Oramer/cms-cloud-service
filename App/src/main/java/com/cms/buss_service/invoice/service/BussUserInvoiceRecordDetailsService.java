 package com.cms.buss_service.invoice.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.invoice.domain.BussUserInvoiceRecordDetails;
 import com.cms.buss_service.invoice.mapper.BussUserInvoiceRecordDetailsMapper;

 import java.util.List;


 @Service
 public class BussUserInvoiceRecordDetailsService
 {
   @Autowired(required = false)
   private BussUserInvoiceRecordDetailsMapper bussUserInvoiceRecordDetailsMapper;

   public BussUserInvoiceRecordDetails selectBussUserInvoiceRecordDetailsById(Long id) {
/* 29 */     return this.bussUserInvoiceRecordDetailsMapper.selectBussUserInvoiceRecordDetailsById(id);
   }







   public List<BussUserInvoiceRecordDetails> selectBussUserInvoiceRecordDetailsList(BussUserInvoiceRecordDetails bussUserInvoiceRecordDetails) {
/* 39 */     return this.bussUserInvoiceRecordDetailsMapper.selectBussUserInvoiceRecordDetailsList(bussUserInvoiceRecordDetails);
   }







   public int insertBussUserInvoiceRecordDetails(BussUserInvoiceRecordDetails bussUserInvoiceRecordDetails) {
/* 49 */     bussUserInvoiceRecordDetails.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussUserInvoiceRecordDetails.setCreateTime(DateUtils.getTime());
/* 51 */     return this.bussUserInvoiceRecordDetailsMapper.insertBussUserInvoiceRecordDetails(bussUserInvoiceRecordDetails);
   }







   public int updateBussUserInvoiceRecordDetails(BussUserInvoiceRecordDetails bussUserInvoiceRecordDetails) {
/* 61 */     bussUserInvoiceRecordDetails.setUpdateBy(SecurityUtils.getUid());
/* 62 */     bussUserInvoiceRecordDetails.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussUserInvoiceRecordDetailsMapper.updateBussUserInvoiceRecordDetails(bussUserInvoiceRecordDetails);
   }







   public int deleteBussUserInvoiceRecordDetailsByIds(Long[] ids) {
/* 73 */     return this.bussUserInvoiceRecordDetailsMapper.deleteBussUserInvoiceRecordDetailsByIds(ids);
   }







   public int deleteBussUserInvoiceRecordDetailsById(Long id) {
/* 83 */     return this.bussUserInvoiceRecordDetailsMapper.deleteBussUserInvoiceRecordDetailsById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\service\BussUserInvoiceRecordDetailsService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */