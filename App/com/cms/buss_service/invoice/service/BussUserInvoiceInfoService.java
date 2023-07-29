 package com.cms.buss_service.invoice.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.invoice.domain.BussUserInvoiceInfo;
 import com.cms.buss_service.invoice.mapper.BussUserInvoiceInfoMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussUserInvoiceInfoService
 {
   @Autowired(required = false)
   private BussUserInvoiceInfoMapper bussUserInvoiceInfoMapper;
   
   public BussUserInvoiceInfo selectBussUserInvoiceInfoById(Long id) {
/* 29 */     return this.bussUserInvoiceInfoMapper.selectBussUserInvoiceInfoById(id);
   }
 
 
 
 
 
 
   
   public List<BussUserInvoiceInfo> selectBussUserInvoiceInfoList(BussUserInvoiceInfo bussUserInvoiceInfo) {
/* 39 */     return this.bussUserInvoiceInfoMapper.selectBussUserInvoiceInfoList(bussUserInvoiceInfo);
   }
 
 
 
 
 
 
   
   public int insertBussUserInvoiceInfo(BussUserInvoiceInfo bussUserInvoiceInfo) {
/* 49 */     bussUserInvoiceInfo.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussUserInvoiceInfo.setUserId(SecurityUtils.getUid());
/* 51 */     bussUserInvoiceInfo.setCreateTime(DateUtils.getTime());
/* 52 */     return this.bussUserInvoiceInfoMapper.insertBussUserInvoiceInfo(bussUserInvoiceInfo);
   }
 
 
 
 
 
 
   
   public int updateBussUserInvoiceInfo(BussUserInvoiceInfo bussUserInvoiceInfo) {
/* 62 */     bussUserInvoiceInfo.setUpdateBy(SecurityUtils.getUid());
/* 63 */     bussUserInvoiceInfo.setUpdateTime(DateUtils.getTime());
/* 64 */     return this.bussUserInvoiceInfoMapper.updateBussUserInvoiceInfo(bussUserInvoiceInfo);
   }
 
 
 
 
 
 
   
   public int deleteBussUserInvoiceInfoByIds(Long[] ids) {
/* 74 */     return this.bussUserInvoiceInfoMapper.deleteBussUserInvoiceInfoByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussUserInvoiceInfoById(Long id) {
/* 84 */     return this.bussUserInvoiceInfoMapper.deleteBussUserInvoiceInfoById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\service\BussUserInvoiceInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */