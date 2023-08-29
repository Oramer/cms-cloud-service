package com.cms.buss_service.poster.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.poster.domain.BussPosterDistanceDeduct;
import com.cms.buss_service.poster.domain.DistanceDeductVo;

import java.util.List;

@Mapper
public interface BussPosterDistanceDeductMapper {
  BussPosterDistanceDeduct selectBussPosterDistanceDeductById(Long paramLong);
  
  List<BussPosterDistanceDeduct> selectBussPosterDistanceDeductList(BussPosterDistanceDeduct paramBussPosterDistanceDeduct);
  
  int insertBussPosterDistanceDeduct(BussPosterDistanceDeduct paramBussPosterDistanceDeduct);
  
  int updateBussPosterDistanceDeduct(BussPosterDistanceDeduct paramBussPosterDistanceDeduct);
  
  int deleteBussPosterDistanceDeductById(Long paramLong);
  
  int deleteBussPosterDistanceDeductByIds(Long[] paramArrayOfLong);
  
  List<DistanceDeductVo> selectBussPosterDistanceDeductMapList(BussPosterDistanceDeduct paramBussPosterDistanceDeduct);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\mapper\BussPosterDistanceDeductMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */