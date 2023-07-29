 package com.cms.buss_service.order.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.order.domain.BussOrderEvaluate;
 import com.cms.buss_service.order.mapper.BussOrderEvaluateMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussOrderEvaluateService
 {
   @Autowired(required = false)
   private BussOrderEvaluateMapper bussOrderEvaluateMapper;
   
   public BussOrderEvaluate selectBussOrderEvaluateById(Long id) {
/* 29 */     return this.bussOrderEvaluateMapper.selectBussOrderEvaluateById(id);
   }
 
 
 
 
 
 
   
   public List<BussOrderEvaluate> selectBussOrderEvaluateList(BussOrderEvaluate bussOrderEvaluate) {
/* 39 */     return this.bussOrderEvaluateMapper.selectBussOrderEvaluateList(bussOrderEvaluate);
   }
 
 
 
 
 
 
   
   public int insertBussOrderEvaluate(BussOrderEvaluate bussOrderEvaluate) {
/* 49 */     bussOrderEvaluate.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussOrderEvaluate.setCreateTime(DateUtils.getTime());
/* 51 */     return this.bussOrderEvaluateMapper.insertBussOrderEvaluate(bussOrderEvaluate);
   }
 
 
 
 
 
 
   
   public int updateBussOrderEvaluate(BussOrderEvaluate bussOrderEvaluate) {
/* 61 */     bussOrderEvaluate.setUpdateBy(SecurityUtils.getUid());
/* 62 */     bussOrderEvaluate.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussOrderEvaluateMapper.updateBussOrderEvaluate(bussOrderEvaluate);
   }
 
 
 
 
 
 
   
   public int deleteBussOrderEvaluateByIds(Long[] ids) {
/* 73 */     return this.bussOrderEvaluateMapper.deleteBussOrderEvaluateByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussOrderEvaluateById(Long id) {
/* 83 */     return this.bussOrderEvaluateMapper.deleteBussOrderEvaluateById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\service\BussOrderEvaluateService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */