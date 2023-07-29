package com.cms.system_service.system.mapper;

import com.cms.system_service.system.domain.SysDictData;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysDictDataMapper {
  List<SysDictData> selectDictDataList(SysDictData paramSysDictData);
  
  List<SysDictData> selectDictDataByType(String paramString);
  
  String selectDictLabel(@Param("dictType") String paramString1, @Param("dictValue") String paramString2);
  
  SysDictData selectDictDataById(Long paramLong);
  
  int countDictDataByType(String paramString);
  
  int deleteDictDataById(Long paramLong);
  
  int deleteDictDataByIds(Long[] paramArrayOfLong);
  
  int insertDictData(SysDictData paramSysDictData);
  
  int updateDictData(SysDictData paramSysDictData);
  
  int updateDictDataType(@Param("oldDictType") String paramString1, @Param("newDictType") String paramString2);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysDictDataMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */