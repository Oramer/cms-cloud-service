package com.cms.buss_service.coupon.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.coupon.domain.BussCoupon;
import com.cms.buss_service.coupon.domain.BussUserCoupon;

import java.util.List;

@Mapper
public interface BussUserCouponMapper {
  BussUserCoupon selectBussUserCouponById(Long paramLong);
  
  List<BussUserCoupon> selectBussUserCouponList(BussUserCoupon paramBussUserCoupon);
  
  int insertBussUserCoupon(BussUserCoupon paramBussUserCoupon);
  
  int updateBussUserCoupon(BussUserCoupon paramBussUserCoupon);
  
  int deleteBussUserCouponById(Long paramLong);
  
  int deleteBussUserCouponByIds(Long[] paramArrayOfLong);
  
  List<BussCoupon> selectUserCoupList(BussUserCoupon paramBussUserCoupon);
  
  List<BussCoupon> selectCoupList(BussUserCoupon paramBussUserCoupon);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\mapper\BussUserCouponMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */