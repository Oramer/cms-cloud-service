package com.cms.buss_service.coupon.mapper;

import com.cms.buss_service.coupon.domain.BussCoupon;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussCouponMapper {
  BussCoupon selectBussCouponById(String paramString);
  
  List<BussCoupon> selectBussCouponList(BussCoupon paramBussCoupon);
  
  int insertBussCoupon(BussCoupon paramBussCoupon);
  
  int updateBussCoupon(BussCoupon paramBussCoupon);
  
  int deleteBussCouponById(String paramString);
  
  int deleteBussCouponByIds(String[] paramArrayOfString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\mapper\BussCouponMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */