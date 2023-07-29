package com.cms.buss_service.station.mapper;

import com.cms.buss_service.station.domain.BussStationInount;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussStationInountMapper {
  BussStationInount selectBussStationInountById(Long paramLong);
  
  List<BussStationInount> selectBussStationInountList(BussStationInount paramBussStationInount);
  
  int insertBussStationInount(BussStationInount paramBussStationInount);
  
  int updateBussStationInount(BussStationInount paramBussStationInount);
  
  int deleteBussStationInountById(Integer paramInteger);
  
  int deleteBussStationInountByIds(Integer[] paramArrayOfInteger);
  
  BussStationInount selectBussStationInountByStationId(Long paramLong);
  
  BigDecimal queryStationIncome(Long paramLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\mapper\BussStationInountMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */