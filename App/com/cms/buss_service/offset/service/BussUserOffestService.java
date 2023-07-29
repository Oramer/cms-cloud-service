 package com.cms.buss_service.offset.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.IdUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.offset.domain.BussUserOffest;
 import com.cms.buss_service.offset.mapper.BussUserOffestMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussUserOffestService
 {
   @Autowired(required = false)
   private BussUserOffestMapper bussUserOffestMapper;
   
   public BussUserOffest selectBussUserOffestById(String pk) {
/* 30 */     return this.bussUserOffestMapper.selectBussUserOffestById(pk);
   }
 
 
 
 
 
 
   
   public List<BussUserOffest> selectBussUserOffestList(BussUserOffest bussUserOffest) {
/* 40 */     return this.bussUserOffestMapper.selectBussUserOffestList(bussUserOffest);
   }
 
 
 
 
 
 
   
   public int insertBussUserOffest(BussUserOffest bussUserOffest) {
/* 50 */     BussUserOffest of = new BussUserOffest();
/* 51 */     of.setCreateBy(SecurityUtils.getUid());
/* 52 */     List<BussUserOffest> ins = this.bussUserOffestMapper.selectBussUserOffestList(of);
/* 53 */     if (ins != null && ins.size() > 0) {
       
/* 55 */       BussUserOffest inss = ins.get(0);
/* 56 */       inss.getOffestAmount().add(bussUserOffest.getOffestAmount());
/* 57 */       return this.bussUserOffestMapper.updateBussUserOffest(inss);
     } 
     
/* 60 */     bussUserOffest.setPk(IdUtils.get());
/* 61 */     bussUserOffest.setCreateBy(SecurityUtils.getUid());
/* 62 */     bussUserOffest.setCreateTime(DateUtils.getTime());
/* 63 */     return this.bussUserOffestMapper.insertBussUserOffest(bussUserOffest);
   }
 
 
 
 
 
 
 
 
   
   public int updateBussUserOffest(BussUserOffest bussUserOffest) {
/* 75 */     bussUserOffest.setUpdateBy(SecurityUtils.getUid());
/* 76 */     bussUserOffest.setUpdateTime(DateUtils.getTime());
/* 77 */     return this.bussUserOffestMapper.updateBussUserOffest(bussUserOffest);
   }
 
 
 
 
 
 
   
   public int deleteBussUserOffestByIds(String[] pks) {
/* 87 */     return this.bussUserOffestMapper.deleteBussUserOffestByIds(pks);
   }
 
 
 
 
 
 
   
   public int deleteBussUserOffestById(String pk) {
/* 97 */     return this.bussUserOffestMapper.deleteBussUserOffestById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\offset\service\BussUserOffestService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */