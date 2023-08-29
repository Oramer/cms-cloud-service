package com.cms.buss_service.bucket.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.bucket.domain.BussBucketBackRecord;

import java.util.List;

@Mapper
public interface BussBucketBackRecordMapper {
  BussBucketBackRecord selectBussBucketBackRecordById(Long paramLong);
  
  List<BussBucketBackRecord> selectBussBucketBackRecordList(BussBucketBackRecord paramBussBucketBackRecord);
  
  int insertBussBucketBackRecord(BussBucketBackRecord paramBussBucketBackRecord);
  
  int updateBussBucketBackRecord(BussBucketBackRecord paramBussBucketBackRecord);
  
  int deleteBussBucketBackRecordById(Long paramLong);
  
  int deleteBussBucketBackRecordByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\mapper\BussBucketBackRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */