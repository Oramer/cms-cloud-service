package com.cms.buss_service.product_type.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.product_type.domain.BussProductType;

import java.util.List;

@Mapper
public interface BussProductTypeMapper {
  BussProductType selectBussProductTypeById(String paramString);
  
  List<BussProductType> selectBussProductTypeList(BussProductType paramBussProductType);
  
  int insertBussProductType(BussProductType paramBussProductType);
  
  int updateBussProductType(BussProductType paramBussProductType);
  
  int deleteBussProductTypeById(String paramString);
  
  int deleteBussProductTypeByIds(String[] paramArrayOfString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product_type\mapper\BussProductTypeMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */