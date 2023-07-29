 package com.cms.buss_service.coupon.service;

 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.IdUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.coupon.domain.BussCoupon;
 import com.cms.buss_service.coupon.mapper.BussCouponMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;












 @Service
 public class BussCouponService
 {
   @Autowired(required = false)
   private BussCouponMapper bussCouponMapper;

   public BussCoupon selectBussCouponById(String pk) {
/* 30 */     return this.bussCouponMapper.selectBussCouponById(pk);
   }







   public List<BussCoupon> selectBussCouponList(BussCoupon bussCoupon) {
/* 40 */     return this.bussCouponMapper.selectBussCouponList(bussCoupon);
   }







   public int insertBussCoupon(BussCoupon bussCoupon) {
/* 50 */     bussCoupon.setPk(IdUtils.get ());
/* 51 */     bussCoupon.setCreateBy(SecurityUtils.getUid());
/* 52 */     bussCoupon.setCreateTime(DateUtils.getNowDate());
/* 53 */     return this.bussCouponMapper.insertBussCoupon(bussCoupon);
   }







   public int updateBussCoupon(BussCoupon bussCoupon) {
/* 63 */     bussCoupon.setUpdateBy(SecurityUtils.getUid());
/* 64 */     bussCoupon.setUpdateTime(DateUtils.getNowDate());
/* 65 */     return this.bussCouponMapper.updateBussCoupon(bussCoupon);
   }







   public int deleteBussCouponByIds(String[] pks) {
/* 75 */     return this.bussCouponMapper.deleteBussCouponByIds(pks);
   }







   public int deleteBussCouponById(String pk) {
/* 85 */     return this.bussCouponMapper.deleteBussCouponById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\service\BussCouponService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */