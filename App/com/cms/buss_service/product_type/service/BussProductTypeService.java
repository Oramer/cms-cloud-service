 package com.cms.buss_service.product_type.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.product_type.domain.BussProductType;
 import com.cms.buss_service.product_type.mapper.BussProductTypeMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussProductTypeService
 {
   @Autowired(required = false)
   private BussProductTypeMapper bussProductTypeMapper;
   
   public BussProductType selectBussProductTypeById(String pk) {
/* 30 */     return this.bussProductTypeMapper.selectBussProductTypeById(pk);
   }
 
 
 
 
 
 
   
   public List<BussProductType> selectBussProductTypeList(BussProductType bussProductType) {
/* 40 */     return this.bussProductTypeMapper.selectBussProductTypeList(bussProductType);
   }
 
 
 
 
 
 
   
   public int insertBussProductType(BussProductType bussProductType) {
/* 50 */     bussProductType.setCreateBy(SecurityUtils.getUid());
/* 51 */     bussProductType.setCreateTime(DateUtils.getTime());
/* 52 */     return this.bussProductTypeMapper.insertBussProductType(bussProductType);
   }
 
 
 
 
 
 
   
   public int updateBussProductType(BussProductType bussProductType) {
/* 62 */     bussProductType.setUpdateBy(SecurityUtils.getUid());
/* 63 */     bussProductType.setUpdateTime(DateUtils.getTime());
/* 64 */     return this.bussProductTypeMapper.updateBussProductType(bussProductType);
   }
 
 
 
 
 
 
   
   public int deleteBussProductTypeByIds(String[] pks) {
/* 74 */     return this.bussProductTypeMapper.deleteBussProductTypeByIds(pks);
   }
 
 
 
 
 
 
   
   public int deleteBussProductTypeById(String pk) {
/* 84 */     return this.bussProductTypeMapper.deleteBussProductTypeById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product_type\service\BussProductTypeService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */