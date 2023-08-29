 package com.cms.buss_service.bucket.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.bucket.domain.BussBucketDetails;
 import com.cms.buss_service.bucket.mapper.BussBucketDetailsMapper;

 import java.util.List;


 @Service
 public class BussBucketDetailsService
 {
   @Autowired(required = false)
   private BussBucketDetailsMapper bussBucketDetailsMapper;

   public BussBucketDetails selectBussBucketDetailsById(Long id) {
/* 28 */     return this.bussBucketDetailsMapper.selectBussBucketDetailsById(id);
   }







   public List<BussBucketDetails> selectBussBucketDetailsList(BussBucketDetails bussBucketDetails) {
/* 38 */     return this.bussBucketDetailsMapper.selectBussBucketDetailsList(bussBucketDetails);
   }







   public int insertBussBucketDetails(BussBucketDetails bussBucketDetails) {
/* 48 */     bussBucketDetails.setCreateTime(DateUtils.getNowDate());
/* 49 */     return this.bussBucketDetailsMapper.insertBussBucketDetails(bussBucketDetails);
   }







   public int updateBussBucketDetails(BussBucketDetails bussBucketDetails) {
/* 59 */     bussBucketDetails.setUpdateTime(DateUtils.getNowDate());
/* 60 */     return this.bussBucketDetailsMapper.updateBussBucketDetails(bussBucketDetails);
   }







   public int deleteBussBucketDetailsByIds(Long[] ids) {
/* 70 */     return this.bussBucketDetailsMapper.deleteBussBucketDetailsByIds(ids);
   }







   public int deleteBussBucketDetailsById(Long id) {
/* 80 */     return this.bussBucketDetailsMapper.deleteBussBucketDetailsById(id);
   }

   public Integer selectDetailsCountByInfoId(String infoId) {
/* 84 */     return this.bussBucketDetailsMapper.selectDetailsCountByInfoId(infoId);
   }

   public List<BussBucketDetails> selectDetailsByInfoId(String orderPk) {
/* 88 */     return this.bussBucketDetailsMapper.selectDetailsByInfoId(orderPk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\service\BussBucketDetailsService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */