package com.cms.buss_service.invoice.mapper;

import com.cms.buss_service.invoice.domain.BussUserInvoiceRecord;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussUserInvoiceRecordMapper {
  BussUserInvoiceRecord selectBussUserInvoiceRecordById(Long paramLong);
  
  List<BussUserInvoiceRecord> selectBussUserInvoiceRecordList(BussUserInvoiceRecord paramBussUserInvoiceRecord);
  
  int insertBussUserInvoiceRecord(BussUserInvoiceRecord paramBussUserInvoiceRecord);
  
  int updateBussUserInvoiceRecord(BussUserInvoiceRecord paramBussUserInvoiceRecord);
  
  int deleteBussUserInvoiceRecordById(Long paramLong);
  
  int deleteBussUserInvoiceRecordByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\mapper\BussUserInvoiceRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */