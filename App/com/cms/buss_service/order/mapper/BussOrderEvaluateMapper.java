package com.cms.buss_service.order.mapper;

import com.cms.buss_service.order.domain.BussOrderEvaluate;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussOrderEvaluateMapper {
  BussOrderEvaluate selectBussOrderEvaluateById(Long paramLong);
  
  List<BussOrderEvaluate> selectBussOrderEvaluateList(BussOrderEvaluate paramBussOrderEvaluate);
  
  int insertBussOrderEvaluate(BussOrderEvaluate paramBussOrderEvaluate);
  
  int updateBussOrderEvaluate(BussOrderEvaluate paramBussOrderEvaluate);
  
  int deleteBussOrderEvaluateById(Long paramLong);
  
  int deleteBussOrderEvaluateByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\mapper\BussOrderEvaluateMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */