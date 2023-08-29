package com.cms.buss_service.ticket.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.ticket.domain.BussTicketUsedRecord;

import java.util.List;

@Mapper
public interface BussTicketUsedRecordMapper {
  BussTicketUsedRecord selectBussTicketUsedRecordById(Integer paramInteger);
  
  List<BussTicketUsedRecord> selectBussTicketUsedRecordList(BussTicketUsedRecord paramBussTicketUsedRecord);
  
  int insertBussTicketUsedRecord(BussTicketUsedRecord paramBussTicketUsedRecord);
  
  int updateBussTicketUsedRecord(BussTicketUsedRecord paramBussTicketUsedRecord);
  
  int deleteBussTicketUsedRecordById(Integer paramInteger);
  
  int deleteBussTicketUsedRecordByIds(Integer[] paramArrayOfInteger);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\mapper\BussTicketUsedRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */