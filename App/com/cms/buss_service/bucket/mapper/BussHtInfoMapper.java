package com.cms.buss_service.bucket.mapper;

import com.cms.buss_service.bucket.domain.BussHtInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussHtInfoMapper {
  BussHtInfo selectBussHtInfoById(Long paramLong);
  
  List<BussHtInfo> selectBussHtInfoList(BussHtInfo paramBussHtInfo);
  
  int insertBussHtInfo(BussHtInfo paramBussHtInfo);
  
  int updateBussHtInfo(BussHtInfo paramBussHtInfo);
  
  int deleteBussHtInfoById(Long paramLong);
  
  int deleteBussHtInfoByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\mapper\BussHtInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */