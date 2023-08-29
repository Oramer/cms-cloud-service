 package com.cms.buss_service.product.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.product.domain.BussProductInfo;
 import com.cms.buss_service.product.domain.BussProductInfoVo;
 import com.cms.buss_service.product.mapper.BussProductInfoMapper;

 import java.util.List;


 @Service
 public class BussProductInfoService
 {
   @Autowired(required = false)
   private BussProductInfoMapper bussProductInfoMapper;
   
   public BussProductInfo selectBussProductInfoById(String pk) {
/* 31 */     return this.bussProductInfoMapper.selectBussProductInfoById(pk);
   }
 
 
 
 
 
 
   
   public List<BussProductInfo> selectBussProductInfoList(BussProductInfo bussProductInfo) {
/* 41 */     return this.bussProductInfoMapper.selectBussProductInfoList(bussProductInfo);
   }
 
 
 
 
 
 
 
   
   public int insertBussProductInfo(BussProductInfo bussProductInfo) {
/* 52 */     bussProductInfo.setCreateBy(SecurityUtils.getUid());
/* 53 */     bussProductInfo.setCreateTime(DateUtils.getTime());
/* 54 */     return this.bussProductInfoMapper.insertBussProductInfo(bussProductInfo);
   }
 
 
 
 
 
 
   
   public int updateBussProductInfo(BussProductInfo bussProductInfo) {
/* 64 */     bussProductInfo.setUpdateBy(SecurityUtils.getUid());
/* 65 */     bussProductInfo.setUpdateTime(DateUtils.getTime());
/* 66 */     return this.bussProductInfoMapper.updateBussProductInfo(bussProductInfo);
   }
 
 
 
 
 
 
   
   public int deleteBussProductInfoByIds(String[] pks) {
/* 76 */     return this.bussProductInfoMapper.deleteBussProductInfoByIds(pks);
   }
 
 
 
 
 
 
   
   public int deleteBussProductInfoById(String pk) {
/* 86 */     return this.bussProductInfoMapper.deleteBussProductInfoById(pk);
   }
   
   public List<BussProductInfo> selectBussProductInfoByIds(String ids) {
/* 90 */     return this.bussProductInfoMapper.selectBussProductInfoByIds(ids);
   }
   
   public List<BussProductInfo> selectBussProductInfoListForWx(BussProductInfoVo bussProductInfo) {
/* 94 */     return this.bussProductInfoMapper.selectBussProductInfoListForWx(bussProductInfo);
   }
   
   public List<BussProductInfo> queryProductByStationBrand(BussProductInfo info) {
/* 98 */     return this.bussProductInfoMapper.queryProductByStationBrand(info);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\service\BussProductInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */