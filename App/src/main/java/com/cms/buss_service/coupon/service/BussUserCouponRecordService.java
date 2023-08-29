 package com.cms.buss_service.coupon.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.coupon.domain.BussUserCouponRecord;
 import com.cms.buss_service.coupon.mapper.BussUserCouponRecordMapper;

 import java.util.List;


 @Service
 public class BussUserCouponRecordService
 {
   @Autowired(required = false)
   private BussUserCouponRecordMapper bussUserCouponRecordMapper;

   public BussUserCouponRecord selectBussUserCouponRecordById(Long id) {
/* 28 */     return this.bussUserCouponRecordMapper.selectBussUserCouponRecordById(id);
   }







   public List<BussUserCouponRecord> selectBussUserCouponRecordList(BussUserCouponRecord bussUserCouponRecord) {
/* 38 */     return this.bussUserCouponRecordMapper.selectBussUserCouponRecordList(bussUserCouponRecord);
   }







   public int insertBussUserCouponRecord(BussUserCouponRecord bussUserCouponRecord) {
/* 48 */     bussUserCouponRecord.setCreateTime(DateUtils.getNowDate());
/* 49 */     return this.bussUserCouponRecordMapper.insertBussUserCouponRecord(bussUserCouponRecord);
   }







   public int updateBussUserCouponRecord(BussUserCouponRecord bussUserCouponRecord) {
/* 59 */     bussUserCouponRecord.setUpdateTime(DateUtils.getNowDate());
/* 60 */     return this.bussUserCouponRecordMapper.updateBussUserCouponRecord(bussUserCouponRecord);
   }







   public int deleteBussUserCouponRecordByIds(Long[] ids) {
/* 70 */     return this.bussUserCouponRecordMapper.deleteBussUserCouponRecordByIds(ids);
   }







   public int deleteBussUserCouponRecordById(Long id) {
/* 80 */     return this.bussUserCouponRecordMapper.deleteBussUserCouponRecordById(id);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\service\BussUserCouponRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */