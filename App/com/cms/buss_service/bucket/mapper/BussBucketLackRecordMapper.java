package com.cms.buss_service.bucket.mapper;

import com.cms.buss_service.bucket.domain.BussBucketLackRecord;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussBucketLackRecordMapper {
  BussBucketLackRecord selectBussBucketLackRecordById(Long paramLong);
  
  List<BussBucketLackRecord> selectBussBucketLackRecordList(BussBucketLackRecord paramBussBucketLackRecord);
  
  int insertBussBucketLackRecord(BussBucketLackRecord paramBussBucketLackRecord);
  
  int updateBussBucketLackRecord(BussBucketLackRecord paramBussBucketLackRecord);
  
  int deleteBussBucketLackRecordById(Long paramLong);
  
  int deleteBussBucketLackRecordByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\mapper\BussBucketLackRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */