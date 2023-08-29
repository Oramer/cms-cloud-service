package com.cms.buss_service.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.order.domain.BussOrderTransferRecord;

import java.util.List;

@Mapper
public interface BussOrderTransferRecordMapper {
  BussOrderTransferRecord selectBussOrderTransferRecordById(Long paramLong);
  
  List<BussOrderTransferRecord> selectBussOrderTransferRecordList(BussOrderTransferRecord paramBussOrderTransferRecord);
  
  int insertBussOrderTransferRecord(BussOrderTransferRecord paramBussOrderTransferRecord);
  
  int updateBussOrderTransferRecord(BussOrderTransferRecord paramBussOrderTransferRecord);
  
  int deleteBussOrderTransferRecordById(Long paramLong);
  
  int deleteBussOrderTransferRecordByIds(Long[] paramArrayOfLong);
  
  BussOrderTransferRecord queryOrderTransferSource(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\mapper\BussOrderTransferRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */