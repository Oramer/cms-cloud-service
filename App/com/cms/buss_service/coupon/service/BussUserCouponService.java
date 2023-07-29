 package com.cms.buss_service.coupon.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.coupon.domain.BussCoupon;
 import com.cms.buss_service.coupon.domain.BussUserCoupon;
 import com.cms.buss_service.coupon.mapper.BussUserCouponMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class BussUserCouponService
 {
   @Autowired(required = false)
   private BussUserCouponMapper bussUserCouponMapper;
   
   public BussUserCoupon selectBussUserCouponById(Long id) {
/* 30 */     return this.bussUserCouponMapper.selectBussUserCouponById(id);
   }
 
 
 
 
 
 
   
   public List<BussUserCoupon> selectBussUserCouponList(BussUserCoupon bussUserCoupon) {
/* 40 */     return this.bussUserCouponMapper.selectBussUserCouponList(bussUserCoupon);
   }
 
 
 
 
 
 
   
   public int insertBussUserCoupon(BussUserCoupon bussUserCoupon) {
/* 50 */     bussUserCoupon.setCreateBy(SecurityUtils.getUid());
/* 51 */     bussUserCoupon.setCreateTime(DateUtils.getNowDate());
/* 52 */     return this.bussUserCouponMapper.insertBussUserCoupon(bussUserCoupon);
   }
 
 
 
 
 
 
   
   public int updateBussUserCoupon(BussUserCoupon bussUserCoupon) {
/* 62 */     bussUserCoupon.setUpdateBy(SecurityUtils.getUid());
/* 63 */     bussUserCoupon.setUpdateTime(DateUtils.getNowDate());
/* 64 */     return this.bussUserCouponMapper.updateBussUserCoupon(bussUserCoupon);
   }
 
 
 
 
 
 
   
   public int deleteBussUserCouponByIds(Long[] ids) {
/* 74 */     return this.bussUserCouponMapper.deleteBussUserCouponByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussUserCouponById(Long id) {
/* 84 */     return this.bussUserCouponMapper.deleteBussUserCouponById(id);
   }
   
   public List<BussCoupon> selectUserCoupList(BussUserCoupon bussUserCoupon) {
/* 88 */     return this.bussUserCouponMapper.selectUserCoupList(bussUserCoupon);
   }
   
   public List<BussCoupon> selectCoupList(BussUserCoupon buss) {
/* 92 */     return this.bussUserCouponMapper.selectCoupList(buss);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\service\BussUserCouponService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */