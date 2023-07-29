package com.cms.buss_service.product.mapper;

import com.cms.buss_service.product.domain.BussProductBrand;
import com.cms.buss_service.product.domain.BussProductBrandVo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussProductBrandMapper {
  BussProductBrand selectBussProductBrandById(Long paramLong);
  
  List<BussProductBrand> selectBussProductBrandList(BussProductBrand paramBussProductBrand);
  
  int insertBussProductBrand(BussProductBrand paramBussProductBrand);
  
  int updateBussProductBrand(BussProductBrand paramBussProductBrand);
  
  int deleteBussProductBrandById(Long paramLong);
  
  int deleteBussProductBrandByIds(Long[] paramArrayOfLong);
  
  List<BussProductBrandVo> selectBrandChildProduct(BussProductBrandVo paramBussProductBrandVo);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\mapper\BussProductBrandMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */