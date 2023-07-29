package com.cms.buss_service.ticket.mapper;

import com.cms.buss_service.ticket.domain.BussUserTicketInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussUserTicketInfoMapper {
  BussUserTicketInfo selectBussUserTicketInfoById(Long paramLong);
  
  List<BussUserTicketInfo> selectBussUserTicketInfoList(BussUserTicketInfo paramBussUserTicketInfo);
  
  int insertBussUserTicketInfo(BussUserTicketInfo paramBussUserTicketInfo);
  
  int updateBussUserTicketInfo(BussUserTicketInfo paramBussUserTicketInfo);
  
  int deleteBussUserTicketInfoById(Long paramLong);
  
  int deleteBussUserTicketInfoByIds(Long[] paramArrayOfLong);
  
  List<BussUserTicketInfo> queryYjGroupTicketInfo(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\mapper\BussUserTicketInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */