package com.cms.buss_service.coupon.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.coupon.domain.BussUserCouponRecord;

import java.util.List;

@Mapper
public interface BussUserCouponRecordMapper {
  BussUserCouponRecord selectBussUserCouponRecordById(Long paramLong);
  
  List<BussUserCouponRecord> selectBussUserCouponRecordList(BussUserCouponRecord paramBussUserCouponRecord);
  
  int insertBussUserCouponRecord(BussUserCouponRecord paramBussUserCouponRecord);
  
  int updateBussUserCouponRecord(BussUserCouponRecord paramBussUserCouponRecord);
  
  int deleteBussUserCouponRecordById(Long paramLong);
  
  int deleteBussUserCouponRecordByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\mapper\BussUserCouponRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */