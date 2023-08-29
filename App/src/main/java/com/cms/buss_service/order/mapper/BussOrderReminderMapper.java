package com.cms.buss_service.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.order.domain.BussOrderReminder;

import java.util.List;

@Mapper
public interface BussOrderReminderMapper {
  BussOrderReminder selectBussOrderReminderById(Long paramLong);
  
  List<BussOrderReminder> selectBussOrderReminderList(BussOrderReminder paramBussOrderReminder);
  
  int insertBussOrderReminder(BussOrderReminder paramBussOrderReminder);
  
  int updateBussOrderReminder(BussOrderReminder paramBussOrderReminder);
  
  int deleteBussOrderReminderById(Long paramLong);
  
  int deleteBussOrderReminderByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\mapper\BussOrderReminderMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */