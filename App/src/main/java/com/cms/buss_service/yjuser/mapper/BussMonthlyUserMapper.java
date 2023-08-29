package com.cms.buss_service.yjuser.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.yjuser.domain.BussMonthlyUser;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface BussMonthlyUserMapper {
  BussMonthlyUser selectBussMonthlyUserById(Long paramLong);
  
  List<BussMonthlyUser> selectBussMonthlyUserList(BussMonthlyUser paramBussMonthlyUser);
  
  int insertBussMonthlyUser(BussMonthlyUser paramBussMonthlyUser);
  
  int updateBussMonthlyUser(BussMonthlyUser paramBussMonthlyUser);
  
  int deleteBussMonthlyUserById(Long paramLong);
  
  int deleteBussMonthlyUserByIds(Long[] paramArrayOfLong);
  
  BigDecimal selectUserYjOrderInfo(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\mapper\BussMonthlyUserMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */