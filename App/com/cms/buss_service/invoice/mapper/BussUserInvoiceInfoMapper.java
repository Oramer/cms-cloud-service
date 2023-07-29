package com.cms.buss_service.invoice.mapper;

import com.cms.buss_service.invoice.domain.BussUserInvoiceInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussUserInvoiceInfoMapper {
  BussUserInvoiceInfo selectBussUserInvoiceInfoById(Long paramLong);
  
  List<BussUserInvoiceInfo> selectBussUserInvoiceInfoList(BussUserInvoiceInfo paramBussUserInvoiceInfo);
  
  int insertBussUserInvoiceInfo(BussUserInvoiceInfo paramBussUserInvoiceInfo);
  
  int updateBussUserInvoiceInfo(BussUserInvoiceInfo paramBussUserInvoiceInfo);
  
  int deleteBussUserInvoiceInfoById(Long paramLong);
  
  int deleteBussUserInvoiceInfoByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\mapper\BussUserInvoiceInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */