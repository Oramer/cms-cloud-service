package com.cms.system_service.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.system_service.system.domain.SysDictType;

import java.util.List;

@Mapper
public interface SysDictTypeMapper {
  List<SysDictType> selectDictTypeList(SysDictType paramSysDictType);
  
  List<SysDictType> selectDictTypeAll();
  
  SysDictType selectDictTypeById(Long paramLong);
  
  SysDictType selectDictTypeByType(String paramString);
  
  int deleteDictTypeById(Long paramLong);
  
  int deleteDictTypeByIds(Long[] paramArrayOfLong);
  
  int insertDictType(SysDictType paramSysDictType);
  
  int updateDictType(SysDictType paramSysDictType);
  
  SysDictType checkDictTypeUnique(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysDictTypeMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */