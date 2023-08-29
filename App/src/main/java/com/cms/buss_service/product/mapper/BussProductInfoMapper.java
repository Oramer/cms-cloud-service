package com.cms.buss_service.product.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.product.domain.BussProductInfo;
import com.cms.buss_service.product.domain.BussProductInfoVo;

import java.util.List;

@Mapper
public interface BussProductInfoMapper {
  BussProductInfo selectBussProductInfoById(String paramString);
  
  List<BussProductInfo> selectBussProductInfoList(BussProductInfo paramBussProductInfo);
  
  int insertBussProductInfo(BussProductInfo paramBussProductInfo);
  
  int updateBussProductInfo(BussProductInfo paramBussProductInfo);
  
  int deleteBussProductInfoById(String paramString);
  
  int deleteBussProductInfoByIds(String[] paramArrayOfString);
  
  List<BussProductInfo> selectBussProductInfoByIds(String paramString);
  
  List<BussProductInfo> selectBussProductInfoListForWx(BussProductInfoVo paramBussProductInfoVo);
  
  List<BussProductInfo> queryProductByStationBrand(BussProductInfo paramBussProductInfo);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\mapper\BussProductInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */