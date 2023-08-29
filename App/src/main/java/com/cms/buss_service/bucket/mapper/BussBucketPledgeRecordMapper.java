package com.cms.buss_service.bucket.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.bucket.domain.BussBucketPledgeRecord;

import java.util.List;

@Mapper
public interface BussBucketPledgeRecordMapper {
  BussBucketPledgeRecord selectBussBucketPledgeRecordById(Long paramLong);
  
  List<BussBucketPledgeRecord> selectBussBucketPledgeRecordList(BussBucketPledgeRecord paramBussBucketPledgeRecord);
  
  int insertBussBucketPledgeRecord(BussBucketPledgeRecord paramBussBucketPledgeRecord);
  
  int updateBussBucketPledgeRecord(BussBucketPledgeRecord paramBussBucketPledgeRecord);
  
  int deleteBussBucketPledgeRecordById(Long paramLong);
  
  int deleteBussBucketPledgeRecordByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\mapper\BussBucketPledgeRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */