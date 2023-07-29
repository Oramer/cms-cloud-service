package com.cms.buss_service.bucket_nw.mapper;

import com.cms.buss_service.bucket_nw.domain.BussUserBucket;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussUserBucketMapper {
  BussUserBucket selectBussUserBucketById(Long paramLong);
  
  List<BussUserBucket> selectBussUserBucketList(BussUserBucket paramBussUserBucket);
  
  int insertBussUserBucket(BussUserBucket paramBussUserBucket);
  
  int updateBussUserBucket(BussUserBucket paramBussUserBucket);
  
  int deleteBussUserBucketById(Long paramLong);
  
  int deleteBussUserBucketByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket_nw\mapper\BussUserBucketMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */