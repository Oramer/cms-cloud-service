package com.cms.buss_service.order.mapper;

import com.cms.buss_service.order.domain.BussOrderInfoTicket;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussOrderInfoTicketMapper {
  BussOrderInfoTicket selectBussOrderInfoTicketById(String paramString);
  
  List<BussOrderInfoTicket> selectBussOrderInfoTicketList(BussOrderInfoTicket paramBussOrderInfoTicket);
  
  int insertBussOrderInfoTicket(BussOrderInfoTicket paramBussOrderInfoTicket);
  
  int updateBussOrderInfoTicket(BussOrderInfoTicket paramBussOrderInfoTicket);
  
  int deleteBussOrderInfoTicketById(String paramString);
  
  int deleteBussOrderInfoTicketByIds(String[] paramArrayOfString);
  
  List<BussOrderInfoTicket> selectBussOrderInvoiceList(BussOrderInfoTicket paramBussOrderInfoTicket);
  
  Map<String, Object> queryUserLastOrderInfo(String paramString);
  
  List<BussOrderInfoTicket> selectUnPayOrderInfo();
  
  Map<String, Object> queryMyStationInTjInfo(BussOrderInfoTicket paramBussOrderInfoTicket);
  
  List<BussOrderInfoTicket> selectUserReminderList(BussOrderInfoTicket paramBussOrderInfoTicket);
  
  Map<String, Object> queryPosterTjInfo(BussOrderInfoTicket paramBussOrderInfoTicket);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\mapper\BussOrderInfoTicketMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */