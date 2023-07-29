package com.cms.buss_service.ticket.mapper;

import com.cms.buss_service.ticket.domain.BussTicketInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussTicketInfoMapper {
  BussTicketInfo selectBussTicketInfoById(String paramString);
  
  List<BussTicketInfo> selectBussTicketInfoList(BussTicketInfo paramBussTicketInfo);
  
  int insertBussTicketInfo(BussTicketInfo paramBussTicketInfo);
  
  int updateBussTicketInfo(BussTicketInfo paramBussTicketInfo);
  
  int deleteBussTicketInfoById(String paramString);
  
  int deleteBussTicketInfoByIds(String[] paramArrayOfString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\mapper\BussTicketInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */