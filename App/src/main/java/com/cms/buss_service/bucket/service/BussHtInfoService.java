 package com.cms.buss_service.bucket.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.bucket.domain.BussHtInfo;
 import com.cms.buss_service.bucket.mapper.BussHtInfoMapper;

 import java.util.List;


 @Service
 public class BussHtInfoService
 {
   @Autowired(required = false)
   private BussHtInfoMapper bussHtInfoMapper;
   
   public BussHtInfo selectBussHtInfoById(Long id) {
/* 28 */     return this.bussHtInfoMapper.selectBussHtInfoById(id);
   }
 
 
 
 
 
 
   
   public List<BussHtInfo> selectBussHtInfoList(BussHtInfo bussHtInfo) {
/* 38 */     return this.bussHtInfoMapper.selectBussHtInfoList(bussHtInfo);
   }
 
 
 
 
 
 
   
   public int insertBussHtInfo(BussHtInfo bussHtInfo) {
/* 48 */     bussHtInfo.setCreateTime(DateUtils.getNowDate());
/* 49 */     return this.bussHtInfoMapper.insertBussHtInfo(bussHtInfo);
   }
 
 
 
 
 
 
   
   public int updateBussHtInfo(BussHtInfo bussHtInfo) {
/* 59 */     bussHtInfo.setUpdateTime(DateUtils.getNowDate());
/* 60 */     return this.bussHtInfoMapper.updateBussHtInfo(bussHtInfo);
   }
 
 
 
 
 
 
   
   public int deleteBussHtInfoByIds(Long[] ids) {
/* 70 */     return this.bussHtInfoMapper.deleteBussHtInfoByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussHtInfoById(Long id) {
/* 80 */     return this.bussHtInfoMapper.deleteBussHtInfoById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\service\BussHtInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */