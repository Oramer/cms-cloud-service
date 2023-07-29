package com.cms.buss_service.message;

import com.cms.buss_service.message.BussMessageInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussMessageInfoMapper {
  BussMessageInfo selectBussMessageInfoById(Long paramLong);
  
  List<BussMessageInfo> selectBussMessageInfoList(BussMessageInfo paramBussMessageInfo);
  
  int insertBussMessageInfo(BussMessageInfo paramBussMessageInfo);
  
  int updateBussMessageInfo(BussMessageInfo paramBussMessageInfo);
  
  int deleteBussMessageInfoById(Long paramLong);
  
  int deleteBussMessageInfoByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\message\BussMessageInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */