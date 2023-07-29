 package com.cms.buss_service.ticket.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.IdUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.ticket.domain.BussTicketInfo;
 import com.cms.buss_service.ticket.mapper.BussTicketInfoMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussTicketInfoService
 {
   @Autowired(required = false)
   private BussTicketInfoMapper bussTicketInfoMapper;
   
   public BussTicketInfo selectBussTicketInfoById(String pk) {
/* 30 */     return this.bussTicketInfoMapper.selectBussTicketInfoById(pk);
   }
 
 
 
 
 
 
   
   public List<BussTicketInfo> selectBussTicketInfoList(BussTicketInfo bussTicketInfo) {
/* 40 */     return this.bussTicketInfoMapper.selectBussTicketInfoList(bussTicketInfo);
   }
 
 
 
 
 
 
   
   public int insertBussTicketInfo(BussTicketInfo bussTicketInfo) {
/* 50 */     bussTicketInfo.setPk(IdUtils.get());
/* 51 */     bussTicketInfo.setStationPk(String.valueOf(SecurityUtils.getUserStationId()));
/* 52 */     bussTicketInfo.setCreateBy(SecurityUtils.getUid());
/* 53 */     bussTicketInfo.setCreateTime(DateUtils.getTime());
/* 54 */     return this.bussTicketInfoMapper.insertBussTicketInfo(bussTicketInfo);
   }
 
 
 
 
 
 
   
   public int updateBussTicketInfo(BussTicketInfo bussTicketInfo) {
/* 64 */     bussTicketInfo.setUpdateBy(SecurityUtils.getUid());
/* 65 */     bussTicketInfo.setUpdateTime(DateUtils.getTime());
/* 66 */     return this.bussTicketInfoMapper.updateBussTicketInfo(bussTicketInfo);
   }
 
 
 
 
 
 
   
   public int deleteBussTicketInfoByIds(String[] pks) {
/* 76 */     return this.bussTicketInfoMapper.deleteBussTicketInfoByIds(pks);
   }
 
 
 
 
 
 
   
   public int deleteBussTicketInfoById(String pk) {
/* 86 */     return this.bussTicketInfoMapper.deleteBussTicketInfoById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\service\BussTicketInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */