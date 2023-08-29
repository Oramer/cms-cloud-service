package com.cms.buss_service.poster.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.poster.domain.BussPosterDispatchRewardRecord;

import java.util.List;

@Mapper
public interface BussPosterDispatchRewardRecordMapper {
  BussPosterDispatchRewardRecord selectBussPosterDispatchRewardRecordById(Integer paramInteger);
  
  List<BussPosterDispatchRewardRecord> selectBussPosterDispatchRewardRecordList(BussPosterDispatchRewardRecord paramBussPosterDispatchRewardRecord);
  
  int insertBussPosterDispatchRewardRecord(BussPosterDispatchRewardRecord paramBussPosterDispatchRewardRecord);
  
  int updateBussPosterDispatchRewardRecord(BussPosterDispatchRewardRecord paramBussPosterDispatchRewardRecord);
  
  int deleteBussPosterDispatchRewardRecordById(Integer paramInteger);
  
  int deleteBussPosterDispatchRewardRecordByIds(Integer[] paramArrayOfInteger);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\mapper\BussPosterDispatchRewardRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */