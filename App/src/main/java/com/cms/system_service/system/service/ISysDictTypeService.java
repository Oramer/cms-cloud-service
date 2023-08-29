package com.cms.system_service.system.service;

import com.cms.system_service.system.domain.SysDictData;
import com.cms.system_service.system.domain.SysDictType;

import java.util.List;

public interface ISysDictTypeService {
  List<SysDictType> selectDictTypeList(SysDictType paramSysDictType);
  
  List<SysDictType> selectDictTypeAll();
  
  List<SysDictData> selectDictDataByType(String paramString);
  
  SysDictType selectDictTypeById(Long paramLong);
  
  SysDictType selectDictTypeByType(String paramString);
  
  void deleteDictTypeByIds(Long[] paramArrayOfLong);
  
  void loadingDictCache();
  
  void clearDictCache();
  
  void resetDictCache();
  
  int insertDictType(SysDictType paramSysDictType);
  
  int updateDictType(SysDictType paramSysDictType);
  
  String checkDictTypeUnique(SysDictType paramSysDictType);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\ISysDictTypeService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */