package com.cms.buss_service.order.service;

import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.buss_service.order.domain.BussOrderInfoTicket;
import com.cms.buss_service.order.mapper.BussOrderInfoTicketMapper;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;












@Service
public class BussOrderInfoTicketService
{
  @Autowired(required = false)
  private BussOrderInfoTicketMapper bussOrderInfoTicketMapper;
  
  public BussOrderInfoTicket selectBussOrderInfoTicketById(String pk) {
/*  30 */     return this.bussOrderInfoTicketMapper.selectBussOrderInfoTicketById(pk);
  }






  
  public List<BussOrderInfoTicket> selectBussOrderInfoTicketList(BussOrderInfoTicket bussOrderInfoTicket) {
/*  40 */     return this.bussOrderInfoTicketMapper.selectBussOrderInfoTicketList(bussOrderInfoTicket);
  }







  
  public int insertBussOrderInfoTicket(BussOrderInfoTicket bussOrderInfoTicket) {
/*  51 */     bussOrderInfoTicket.setCreateBy(SecurityUtils.getUid());
/*  52 */     bussOrderInfoTicket.setCreateTime(DateUtils.getTime());
/*  53 */     return this.bussOrderInfoTicketMapper.insertBussOrderInfoTicket(bussOrderInfoTicket);
  }







  
  public int updateBussOrderInfoTicket(BussOrderInfoTicket bussOrderInfoTicket) {
/*  64 */     bussOrderInfoTicket.setUpdateTime(DateUtils.getTime());
/*  65 */     return this.bussOrderInfoTicketMapper.updateBussOrderInfoTicket(bussOrderInfoTicket);
  }






  
  public int deleteBussOrderInfoTicketByIds(String[] pks) {
/*  75 */     return this.bussOrderInfoTicketMapper.deleteBussOrderInfoTicketByIds(pks);
  }






  
  public int deleteBussOrderInfoTicketById(String pk) {
/*  85 */     return this.bussOrderInfoTicketMapper.deleteBussOrderInfoTicketById(pk);
  }
  
  public List<BussOrderInfoTicket> selectBussOrderInvoiceList(BussOrderInfoTicket bussOrderInfoTicket) {
/*  89 */     return this.bussOrderInfoTicketMapper.selectBussOrderInvoiceList(bussOrderInfoTicket);
  }
  
  public Map<String, Object> queryUserLastOrderInfo(String userPk) {
/*  93 */     return this.bussOrderInfoTicketMapper.queryUserLastOrderInfo(userPk);
  }
  
  public Map<String, Object> queryMyStationInTjInfo(BussOrderInfoTicket info) {
/*  97 */     return this.bussOrderInfoTicketMapper.queryMyStationInTjInfo(info);
  }
  
  public List<BussOrderInfoTicket> selectUserReminderList(BussOrderInfoTicket bussOrderInfoTicket) {
/* 101 */     return this.bussOrderInfoTicketMapper.selectUserReminderList(bussOrderInfoTicket);
  }
  
  public Map<String, Object> queryPosterTjInfo(BussOrderInfoTicket info) {
/* 105 */     return this.bussOrderInfoTicketMapper.queryPosterTjInfo(info);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\service\BussOrderInfoTicketService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */