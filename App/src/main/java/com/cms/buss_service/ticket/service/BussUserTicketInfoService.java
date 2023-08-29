 package com.cms.buss_service.ticket.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.ticket.domain.BussUserTicketInfo;
 import com.cms.buss_service.ticket.mapper.BussUserTicketInfoMapper;

 import java.util.List;


 @Service
 public class BussUserTicketInfoService
 {
   @Autowired(required = false)
   private BussUserTicketInfoMapper bussUserTicketInfoMapper;

   public BussUserTicketInfo selectBussUserTicketInfoById(Long pk) {
/* 29 */     return this.bussUserTicketInfoMapper.selectBussUserTicketInfoById(pk);
   }







   public List<BussUserTicketInfo> selectBussUserTicketInfoList(BussUserTicketInfo bussUserTicketInfo) {
/* 39 */     return this.bussUserTicketInfoMapper.selectBussUserTicketInfoList(bussUserTicketInfo);
   }







   public int insertBussUserTicketInfo(BussUserTicketInfo bussUserTicketInfo) {
/* 49 */     bussUserTicketInfo.setCreateTime(DateUtils.getTime());
/* 50 */     bussUserTicketInfo.setGetTime(DateUtils.getDate());
/* 51 */     return this.bussUserTicketInfoMapper.insertBussUserTicketInfo(bussUserTicketInfo);
   }








   public int updateBussUserTicketInfo(BussUserTicketInfo bussUserTicketInfo) {
/* 62 */     bussUserTicketInfo.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussUserTicketInfoMapper.updateBussUserTicketInfo(bussUserTicketInfo);
   }







   public int deleteBussUserTicketInfoByIds(Long[] pks) {
/* 73 */     return this.bussUserTicketInfoMapper.deleteBussUserTicketInfoByIds(pks);
   }







   public int deleteBussUserTicketInfoById(Long pk) {
/* 83 */     return this.bussUserTicketInfoMapper.deleteBussUserTicketInfoById(pk);
   }

   public List<BussUserTicketInfo> queryYjGroupTicketInfo(String wtid) {
/* 87 */     return this.bussUserTicketInfoMapper.queryYjGroupTicketInfo(wtid);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\service\BussUserTicketInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */