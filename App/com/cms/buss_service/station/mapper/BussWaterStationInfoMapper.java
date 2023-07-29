package com.cms.buss_service.station.mapper;

import com.cms.buss_service.station.domain.BussWaterStationInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussWaterStationInfoMapper {
  BussWaterStationInfo selectBussWaterStationInfoById(Long paramLong);
  
  List<BussWaterStationInfo> selectBussWaterStationInfoList(BussWaterStationInfo paramBussWaterStationInfo);
  
  int insertBussWaterStationInfo(BussWaterStationInfo paramBussWaterStationInfo);
  
  int updateBussWaterStationInfo(BussWaterStationInfo paramBussWaterStationInfo);
  
  int deleteBussWaterStationInfoById(Long paramLong);
  
  int deleteBussWaterStationInfoByIds(Long[] paramArrayOfLong);
  
  BussWaterStationInfo queryMyStationInfo(BussWaterStationInfo paramBussWaterStationInfo);
  
  Integer checkIsStationManger(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\mapper\BussWaterStationInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */