package com.cms.buss_service.bucket.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.bucket.domain.BussBucketDetails;

import java.util.List;

@Mapper
public interface BussBucketDetailsMapper {
  BussBucketDetails selectBussBucketDetailsById(Long paramLong);
  
  List<BussBucketDetails> selectBussBucketDetailsList(BussBucketDetails paramBussBucketDetails);
  
  int insertBussBucketDetails(BussBucketDetails paramBussBucketDetails);
  
  int updateBussBucketDetails(BussBucketDetails paramBussBucketDetails);
  
  int deleteBussBucketDetailsById(Long paramLong);
  
  int deleteBussBucketDetailsByIds(Long[] paramArrayOfLong);
  
  Integer selectDetailsCountByInfoId(String paramString);
  
  List<BussBucketDetails> selectDetailsByInfoId(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\mapper\BussBucketDetailsMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */