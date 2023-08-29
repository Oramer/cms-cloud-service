package com.cms.buss_service.station.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.station.domain.BussStationClimbFee;

import java.util.List;

@Mapper
public interface BussStationClimbFeeMapper {
  BussStationClimbFee selectBussStationClimbFeeById(String paramString);
  
  List<BussStationClimbFee> selectBussStationClimbFeeList(BussStationClimbFee paramBussStationClimbFee);
  
  int insertBussStationClimbFee(BussStationClimbFee paramBussStationClimbFee);
  
  int updateBussStationClimbFee(BussStationClimbFee paramBussStationClimbFee);
  
  int deleteBussStationClimbFeeById(String paramString);
  
  int deleteBussStationClimbFeeByIds(String[] paramArrayOfString);
  
  BussStationClimbFee queryClimbFeeByStationPk(BussStationClimbFee paramBussStationClimbFee);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\mapper\BussStationClimbFeeMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */