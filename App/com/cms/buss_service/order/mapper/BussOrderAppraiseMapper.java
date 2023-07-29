package com.cms.buss_service.order.mapper;

import com.cms.buss_service.order.domain.BussOrderAppraise;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussOrderAppraiseMapper {
  BussOrderAppraise selectBussOrderAppraiseById(Long paramLong);
  
  List<BussOrderAppraise> selectBussOrderAppraiseList(BussOrderAppraise paramBussOrderAppraise);
  
  int insertBussOrderAppraise(BussOrderAppraise paramBussOrderAppraise);
  
  int updateBussOrderAppraise(BussOrderAppraise paramBussOrderAppraise);
  
  int deleteBussOrderAppraiseById(Long paramLong);
  
  int deleteBussOrderAppraiseByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\mapper\BussOrderAppraiseMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */