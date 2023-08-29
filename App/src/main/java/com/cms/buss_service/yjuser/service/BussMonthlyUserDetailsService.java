 package com.cms.buss_service.yjuser.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.buss_service.yjuser.domain.BussMonthlyUserDetails;
 import com.cms.buss_service.yjuser.mapper.BussMonthlyUserDetailsMapper;

 import java.util.List;


 @Service
 public class BussMonthlyUserDetailsService
 {
   @Autowired(required = false)
   private BussMonthlyUserDetailsMapper bussMonthlyUserDetailsMapper;
   
   public BussMonthlyUserDetails selectBussMonthlyUserDetailsById(Long id) {
/* 27 */     return this.bussMonthlyUserDetailsMapper.selectBussMonthlyUserDetailsById(id);
   }
 
 
 
 
 
 
   
   public List<BussMonthlyUserDetails> selectBussMonthlyUserDetailsList(BussMonthlyUserDetails bussMonthlyUserDetails) {
/* 37 */     return this.bussMonthlyUserDetailsMapper.selectBussMonthlyUserDetailsList(bussMonthlyUserDetails);
   }
 
 
 
 
 
 
   
   public int insertBussMonthlyUserDetails(BussMonthlyUserDetails bussMonthlyUserDetails) {
/* 47 */     return this.bussMonthlyUserDetailsMapper.insertBussMonthlyUserDetails(bussMonthlyUserDetails);
   }
 
 
 
 
 
 
   
   public int updateBussMonthlyUserDetails(BussMonthlyUserDetails bussMonthlyUserDetails) {
/* 57 */     return this.bussMonthlyUserDetailsMapper.updateBussMonthlyUserDetails(bussMonthlyUserDetails);
   }
 
 
 
 
 
 
   
   public int deleteBussMonthlyUserDetailsByIds(Long[] ids) {
/* 67 */     return this.bussMonthlyUserDetailsMapper.deleteBussMonthlyUserDetailsByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussMonthlyUserDetailsById(Long id) {
/* 77 */     return this.bussMonthlyUserDetailsMapper.deleteBussMonthlyUserDetailsById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\service\BussMonthlyUserDetailsService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */