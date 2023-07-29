package com.cms.buss_service.offset.mapper;

import com.cms.buss_service.offset.domain.BussUserOffestDetails;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussUserOffestDetailsMapper {
  BussUserOffestDetails selectBussUserOffestDetailsById(Long paramLong);
  
  List<BussUserOffestDetails> selectBussUserOffestDetailsList(BussUserOffestDetails paramBussUserOffestDetails);
  
  int insertBussUserOffestDetails(BussUserOffestDetails paramBussUserOffestDetails);
  
  int updateBussUserOffestDetails(BussUserOffestDetails paramBussUserOffestDetails);
  
  int deleteBussUserOffestDetailsById(Long paramLong);
  
  int deleteBussUserOffestDetailsByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\offset\mapper\BussUserOffestDetailsMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */