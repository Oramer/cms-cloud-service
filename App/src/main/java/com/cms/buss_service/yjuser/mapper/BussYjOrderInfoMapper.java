package com.cms.buss_service.yjuser.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.yjuser.domain.BussYjOrderInfo;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface BussYjOrderInfoMapper {
  BussYjOrderInfo selectBussYjOrderInfoById(String paramString);
  
  List<BussYjOrderInfo> selectBussYjOrderInfoList(BussYjOrderInfo paramBussYjOrderInfo);
  
  int insertBussYjOrderInfo(BussYjOrderInfo paramBussYjOrderInfo);
  
  int updateBussYjOrderInfo(BussYjOrderInfo paramBussYjOrderInfo);
  
  int deleteBussYjOrderInfoById(String paramString);
  
  int deleteBussYjOrderInfoByIds(String[] paramArrayOfString);
  
  BigDecimal queryYjDaiZhifuInfo(BussYjOrderInfo paramBussYjOrderInfo);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\mapper\BussYjOrderInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */