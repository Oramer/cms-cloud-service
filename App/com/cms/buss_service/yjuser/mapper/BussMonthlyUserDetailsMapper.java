package com.cms.buss_service.yjuser.mapper;

import com.cms.buss_service.yjuser.domain.BussMonthlyUserDetails;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussMonthlyUserDetailsMapper {
  BussMonthlyUserDetails selectBussMonthlyUserDetailsById(Long paramLong);
  
  List<BussMonthlyUserDetails> selectBussMonthlyUserDetailsList(BussMonthlyUserDetails paramBussMonthlyUserDetails);
  
  int insertBussMonthlyUserDetails(BussMonthlyUserDetails paramBussMonthlyUserDetails);
  
  int updateBussMonthlyUserDetails(BussMonthlyUserDetails paramBussMonthlyUserDetails);
  
  int deleteBussMonthlyUserDetailsById(Long paramLong);
  
  int deleteBussMonthlyUserDetailsByIds(Long[] paramArrayOfLong);
  
  int queryUserIsSuperManger(String paramString);
  
  BussMonthlyUserDetails queryUserInfoByIdAndYjId(String paramString1, String paramString2);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\mapper\BussMonthlyUserDetailsMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */