 package com.cms.buss_service.order.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.order.domain.BussOrderAppraise;
 import com.cms.buss_service.order.mapper.BussOrderAppraiseMapper;

 import java.util.List;


 @Service
 public class BussOrderAppraiseService
 {
   @Autowired(required = false)
   private BussOrderAppraiseMapper bussOrderAppraiseMapper;
   
   public BussOrderAppraise selectBussOrderAppraiseById(Long id) {
/* 29 */     return this.bussOrderAppraiseMapper.selectBussOrderAppraiseById(id);
   }
 
 
 
 
 
 
   
   public List<BussOrderAppraise> selectBussOrderAppraiseList(BussOrderAppraise bussOrderAppraise) {
/* 39 */     return this.bussOrderAppraiseMapper.selectBussOrderAppraiseList(bussOrderAppraise);
   }
 
 
 
 
 
 
   
   public int insertBussOrderAppraise(BussOrderAppraise bussOrderAppraise) {
/* 49 */     bussOrderAppraise.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussOrderAppraise.setCreateTime(DateUtils.getTime());
/* 51 */     return this.bussOrderAppraiseMapper.insertBussOrderAppraise(bussOrderAppraise);
   }
 
 
 
 
 
 
   
   public int updateBussOrderAppraise(BussOrderAppraise bussOrderAppraise) {
/* 61 */     bussOrderAppraise.setUpdateBy(SecurityUtils.getUid());
/* 62 */     bussOrderAppraise.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussOrderAppraiseMapper.updateBussOrderAppraise(bussOrderAppraise);
   }
 
 
 
 
 
 
   
   public int deleteBussOrderAppraiseByIds(Long[] ids) {
/* 73 */     return this.bussOrderAppraiseMapper.deleteBussOrderAppraiseByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussOrderAppraiseById(Long id) {
/* 83 */     return this.bussOrderAppraiseMapper.deleteBussOrderAppraiseById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\service\BussOrderAppraiseService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */