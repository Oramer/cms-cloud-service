package com.cms.buss_service.bucket.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.bucket.domain.BussBucketReturnRecord;

import java.util.List;

@Mapper
public interface BussBucketReturnRecordMapper {
  BussBucketReturnRecord selectBussBucketReturnRecordById(Long paramLong);
  
  List<BussBucketReturnRecord> selectBussBucketReturnRecordList(BussBucketReturnRecord paramBussBucketReturnRecord);
  
  int insertBussBucketReturnRecord(BussBucketReturnRecord paramBussBucketReturnRecord);
  
  int updateBussBucketReturnRecord(BussBucketReturnRecord paramBussBucketReturnRecord);
  
  int deleteBussBucketReturnRecordById(Long paramLong);
  
  int deleteBussBucketReturnRecordByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\mapper\BussBucketReturnRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */