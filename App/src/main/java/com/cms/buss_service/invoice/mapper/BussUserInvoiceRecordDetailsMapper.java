package com.cms.buss_service.invoice.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.invoice.domain.BussUserInvoiceRecordDetails;

import java.util.List;

@Mapper
public interface BussUserInvoiceRecordDetailsMapper {
  BussUserInvoiceRecordDetails selectBussUserInvoiceRecordDetailsById(Long paramLong);
  
  List<BussUserInvoiceRecordDetails> selectBussUserInvoiceRecordDetailsList(BussUserInvoiceRecordDetails paramBussUserInvoiceRecordDetails);
  
  int insertBussUserInvoiceRecordDetails(BussUserInvoiceRecordDetails paramBussUserInvoiceRecordDetails);
  
  int updateBussUserInvoiceRecordDetails(BussUserInvoiceRecordDetails paramBussUserInvoiceRecordDetails);
  
  int deleteBussUserInvoiceRecordDetailsById(Long paramLong);
  
  int deleteBussUserInvoiceRecordDetailsByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\mapper\BussUserInvoiceRecordDetailsMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */