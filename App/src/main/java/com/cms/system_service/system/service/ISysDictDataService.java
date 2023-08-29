package com.cms.system_service.system.service;

import com.cms.system_service.system.domain.SysDictData;

import java.util.List;

public interface ISysDictDataService {
  List<SysDictData> selectDictDataList(SysDictData paramSysDictData);
  
  String selectDictLabel(String paramString1, String paramString2);
  
  SysDictData selectDictDataById(Long paramLong);
  
  void deleteDictDataByIds(Long[] paramArrayOfLong);
  
  int insertDictData(SysDictData paramSysDictData);
  
  int updateDictData(SysDictData paramSysDictData);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\ISysDictDataService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */