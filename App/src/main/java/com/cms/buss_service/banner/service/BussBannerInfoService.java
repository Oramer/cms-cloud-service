 package com.cms.buss_service.banner.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.banner.domain.BussBannerInfo;
 import com.cms.buss_service.banner.mapper.BussBannerInfoMapper;

 import java.util.List;


 @Service
 public class BussBannerInfoService
 {
   @Autowired(required = false)
   private BussBannerInfoMapper bussBannerInfoMapper;

   public BussBannerInfo selectBussBannerInfoById(Long id) {
/* 30 */     return this.bussBannerInfoMapper.selectBussBannerInfoById(id);
   }







   public List<BussBannerInfo> selectBussBannerInfoList(BussBannerInfo bussBannerInfo) {
/* 40 */     return this.bussBannerInfoMapper.selectBussBannerInfoList(bussBannerInfo);
   }







   public int insertBussBannerInfo(BussBannerInfo bussBannerInfo) {
/* 50 */     bussBannerInfo.setCreateBy(SecurityUtils.getUid());
/* 51 */     bussBannerInfo.setCreateTime(DateUtils.getTime());
/* 52 */     return this.bussBannerInfoMapper.insertBussBannerInfo(bussBannerInfo);
   }







   public int updateBussBannerInfo(BussBannerInfo bussBannerInfo) {
/* 62 */     bussBannerInfo.setUpdateBy(SecurityUtils.getUid());
/* 63 */     bussBannerInfo.setUpdateTime(DateUtils.getTime());
/* 64 */     return this.bussBannerInfoMapper.updateBussBannerInfo(bussBannerInfo);
   }







   public int deleteBussBannerInfoByIds(Long[] ids) {
/* 74 */     return this.bussBannerInfoMapper.deleteBussBannerInfoByIds(ids);
   }







   public int deleteBussBannerInfoById(Long id) {
/* 84 */     return this.bussBannerInfoMapper.deleteBussBannerInfoById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\banner\service\BussBannerInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */