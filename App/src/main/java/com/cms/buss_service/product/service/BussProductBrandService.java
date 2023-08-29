 package com.cms.buss_service.product.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.product.domain.BussProductBrand;
 import com.cms.buss_service.product.domain.BussProductBrandVo;
 import com.cms.buss_service.product.mapper.BussProductBrandMapper;

 import java.util.List;


 @Service
 public class BussProductBrandService
 {
   @Autowired(required = false)
   private BussProductBrandMapper bussProductBrandMapper;

   public BussProductBrand selectBussProductBrandById(Long pk) {
/* 30 */     return this.bussProductBrandMapper.selectBussProductBrandById(pk);
   }







   public List<BussProductBrand> selectBussProductBrandList(BussProductBrand bussProductBrand) {
/* 40 */     return this.bussProductBrandMapper.selectBussProductBrandList(bussProductBrand);
   }








   public int insertBussProductBrand(BussProductBrand bussProductBrand) {
/* 51 */     bussProductBrand.setCreateBy(SecurityUtils.getUid());
/* 52 */     bussProductBrand.setCreateTime(DateUtils.getTime());
/* 53 */     return this.bussProductBrandMapper.insertBussProductBrand(bussProductBrand);
   }







   public int updateBussProductBrand(BussProductBrand bussProductBrand) {
/* 63 */     bussProductBrand.setUpdateBy(SecurityUtils.getUid());
/* 64 */     bussProductBrand.setUpdateTime(DateUtils.getTime());
/* 65 */     return this.bussProductBrandMapper.updateBussProductBrand(bussProductBrand);
   }







   public int deleteBussProductBrandByIds(Long[] pks) {
/* 75 */     return this.bussProductBrandMapper.deleteBussProductBrandByIds(pks);
   }







   public int deleteBussProductBrandById(Long pk) {
/* 85 */     return this.bussProductBrandMapper.deleteBussProductBrandById(pk);
   }

   public List<BussProductBrandVo> selectBrandChildProduct(BussProductBrandVo brand) {
/* 89 */     return this.bussProductBrandMapper.selectBrandChildProduct(brand);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\service\BussProductBrandService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */