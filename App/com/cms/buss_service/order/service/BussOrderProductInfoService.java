 package com.cms.buss_service.order.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.order.domain.BussOrderProductInfo;
 import com.cms.buss_service.order.mapper.BussOrderProductInfoMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussOrderProductInfoService
 {
   @Autowired(required = false)
   private BussOrderProductInfoMapper bussOrderProductInfoMapper;
   
   public BussOrderProductInfo selectBussOrderProductInfoById(Long pk) {
/* 29 */     return this.bussOrderProductInfoMapper.selectBussOrderProductInfoById(pk);
   }
 
 
 
 
 
 
   
   public List<BussOrderProductInfo> selectBussOrderProductInfoList(BussOrderProductInfo bussOrderProductInfo) {
/* 39 */     return this.bussOrderProductInfoMapper.selectBussOrderProductInfoList(bussOrderProductInfo);
   }
 
 
 
 
 
 
   
   public int insertBussOrderProductInfo(BussOrderProductInfo bussOrderProductInfo) {
/* 49 */     bussOrderProductInfo.setCreateBy(SecurityUtils.getUid());
/* 50 */     bussOrderProductInfo.setCreateTime(DateUtils.getTime());
/* 51 */     return this.bussOrderProductInfoMapper.insertBussOrderProductInfo(bussOrderProductInfo);
   }
 
 
 
 
 
 
   
   public int updateBussOrderProductInfo(BussOrderProductInfo bussOrderProductInfo) {
/* 61 */     bussOrderProductInfo.setUpdateBy(SecurityUtils.getUid());
/* 62 */     bussOrderProductInfo.setUpdateTime(DateUtils.getTime());
/* 63 */     return this.bussOrderProductInfoMapper.updateBussOrderProductInfo(bussOrderProductInfo);
   }
 
 
 
 
 
 
   
   public int deleteBussOrderProductInfoByIds(Long[] pks) {
/* 73 */     return this.bussOrderProductInfoMapper.deleteBussOrderProductInfoByIds(pks);
   }
 
 
 
 
 
 
   
   public int deleteBussOrderProductInfoById(Long pk) {
/* 83 */     return this.bussOrderProductInfoMapper.deleteBussOrderProductInfoById(pk);
   }
   
   public int queryOrderProductCount(String orderPk) {
/* 87 */     return this.bussOrderProductInfoMapper.queryOrderProductCount(orderPk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\service\BussOrderProductInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */