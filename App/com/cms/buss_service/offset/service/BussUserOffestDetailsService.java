 package com.cms.buss_service.offset.service;

 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.offset.domain.BussUserOffestDetails;
 import com.cms.buss_service.offset.mapper.BussUserOffestDetailsMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;












 @Service
 public class BussUserOffestDetailsService
 {
   @Autowired(required = false)
   private BussUserOffestDetailsMapper bussUserOffestDetailsMapper;

   public BussUserOffestDetails selectBussUserOffestDetailsById(Long id) {
/* 29 */     return this.bussUserOffestDetailsMapper.selectBussUserOffestDetailsById(id);
   }







   public List<BussUserOffestDetails> selectBussUserOffestDetailsList(BussUserOffestDetails bussUserOffestDetails) {
/* 39 */     return this.bussUserOffestDetailsMapper.selectBussUserOffestDetailsList(bussUserOffestDetails);
   }







   public int insertBussUserOffestDetails(BussUserOffestDetails bussUserOffestDetails) {
/* 49 */     bussUserOffestDetails.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussUserOffestDetails.setCreateTime(DateUtils.getTime());
/* 51 */     return this.bussUserOffestDetailsMapper.insertBussUserOffestDetails(bussUserOffestDetails);
   }







   public int updateBussUserOffestDetails(BussUserOffestDetails bussUserOffestDetails) {
/* 61 */     bussUserOffestDetails.setUpdateBy(SecurityUtils.getUid());
/* 62 */     bussUserOffestDetails.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussUserOffestDetailsMapper.updateBussUserOffestDetails(bussUserOffestDetails);
   }







   public int deleteBussUserOffestDetailsByIds(Long[] ids) {
/* 73 */     return this.bussUserOffestDetailsMapper.deleteBussUserOffestDetailsByIds(ids);
   }







   public int deleteBussUserOffestDetailsById(Long id) {
/* 83 */     return this.bussUserOffestDetailsMapper.deleteBussUserOffestDetailsById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\offset\service\BussUserOffestDetailsService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */