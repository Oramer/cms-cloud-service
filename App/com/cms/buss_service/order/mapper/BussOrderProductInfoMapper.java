package com.cms.buss_service.order.mapper;

import com.cms.buss_service.order.domain.BussOrderProductInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussOrderProductInfoMapper {
  BussOrderProductInfo selectBussOrderProductInfoById(Long paramLong);
  
  List<BussOrderProductInfo> selectBussOrderProductInfoList(BussOrderProductInfo paramBussOrderProductInfo);
  
  int insertBussOrderProductInfo(BussOrderProductInfo paramBussOrderProductInfo);
  
  int updateBussOrderProductInfo(BussOrderProductInfo paramBussOrderProductInfo);
  
  int deleteBussOrderProductInfoById(Long paramLong);
  
  int deleteBussOrderProductInfoByIds(Long[] paramArrayOfLong);
  
  int queryOrderProductCount(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\mapper\BussOrderProductInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */