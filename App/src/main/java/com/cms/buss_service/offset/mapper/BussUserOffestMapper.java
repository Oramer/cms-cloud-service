package com.cms.buss_service.offset.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.offset.domain.BussUserOffest;

import java.util.List;

@Mapper
public interface BussUserOffestMapper {
  BussUserOffest selectBussUserOffestById(String paramString);
  
  List<BussUserOffest> selectBussUserOffestList(BussUserOffest paramBussUserOffest);
  
  int insertBussUserOffest(BussUserOffest paramBussUserOffest);
  
  int updateBussUserOffest(BussUserOffest paramBussUserOffest);
  
  int deleteBussUserOffestById(String paramString);
  
  int deleteBussUserOffestByIds(String[] paramArrayOfString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\offset\mapper\BussUserOffestMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */