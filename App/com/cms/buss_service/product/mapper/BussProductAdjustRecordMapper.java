package com.cms.buss_service.product.mapper;

import com.cms.buss_service.product.domain.BussProductAdjustRecord;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussProductAdjustRecordMapper {
  BussProductAdjustRecord selectBussProductAdjustRecordById(Long paramLong);
  
  List<BussProductAdjustRecord> selectBussProductAdjustRecordList(BussProductAdjustRecord paramBussProductAdjustRecord);
  
  int insertBussProductAdjustRecord(BussProductAdjustRecord paramBussProductAdjustRecord);
  
  int updateBussProductAdjustRecord(BussProductAdjustRecord paramBussProductAdjustRecord);
  
  int deleteBussProductAdjustRecordById(Long paramLong);
  
  int deleteBussProductAdjustRecordByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\mapper\BussProductAdjustRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */