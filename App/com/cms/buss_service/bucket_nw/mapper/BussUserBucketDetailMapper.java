package com.cms.buss_service.bucket_nw.mapper;

import com.cms.buss_service.bucket_nw.domain.BussUserBucketDetail;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussUserBucketDetailMapper {
  BussUserBucketDetail selectBussUserBucketDetailById(Long paramLong);
  
  List<BussUserBucketDetail> selectBussUserBucketDetailList(BussUserBucketDetail paramBussUserBucketDetail);
  
  int insertBussUserBucketDetail(BussUserBucketDetail paramBussUserBucketDetail);
  
  int updateBussUserBucketDetail(BussUserBucketDetail paramBussUserBucketDetail);
  
  int deleteBussUserBucketDetailById(Long paramLong);
  
  int deleteBussUserBucketDetailByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket_nw\mapper\BussUserBucketDetailMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */