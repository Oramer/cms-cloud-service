package com.cms.buss_service.banner.mapper;

import com.cms.buss_service.banner.domain.BussBannerInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussBannerInfoMapper {
  BussBannerInfo selectBussBannerInfoById(Long paramLong);
  
  List<BussBannerInfo> selectBussBannerInfoList(BussBannerInfo paramBussBannerInfo);
  
  int insertBussBannerInfo(BussBannerInfo paramBussBannerInfo);
  
  int updateBussBannerInfo(BussBannerInfo paramBussBannerInfo);
  
  int deleteBussBannerInfoById(Long paramLong);
  
  int deleteBussBannerInfoByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\banner\mapper\BussBannerInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */