package com.cms.buss_service.bucket.mapper;

import com.cms.buss_service.bucket.domain.BussBucketInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussBucketInfoMapper {
  BussBucketInfo selectBussBucketInfoById(String paramString);
  
  List<BussBucketInfo> selectBussBucketInfoList(BussBucketInfo paramBussBucketInfo);
  
  int insertBussBucketInfo(BussBucketInfo paramBussBucketInfo);
  
  int updateBussBucketInfo(BussBucketInfo paramBussBucketInfo);
  
  int deleteBussBucketInfoById(String paramString);
  
  int deleteBussBucketInfoByIds(String[] paramArrayOfString);
  
  BussBucketInfo selectInfoByOrderIdQt(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\mapper\BussBucketInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */