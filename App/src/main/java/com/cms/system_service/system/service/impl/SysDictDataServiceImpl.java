package com.cms.system_service.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.base_service.common.utils.DictUtils;
import com.cms.system_service.system.domain.SysDictData;
import com.cms.system_service.system.mapper.SysDictDataMapper;
import com.cms.system_service.system.service.ISysDictDataService;

import java.util.List;


@Service
public class SysDictDataServiceImpl
  implements ISysDictDataService
{
  @Autowired
  private SysDictDataMapper dictDataMapper;
  
  public List<SysDictData> selectDictDataList(SysDictData dictData) {
/*  30 */     return this.dictDataMapper.selectDictDataList(dictData);
  }








  
  public String selectDictLabel(String dictType, String dictValue) {
/*  42 */     return this.dictDataMapper.selectDictLabel(dictType, dictValue);
  }







  
  public SysDictData selectDictDataById(Long dictCode) {
/*  53 */     return this.dictDataMapper.selectDictDataById(dictCode);
  }






  
  public void deleteDictDataByIds(Long[] dictCodes) {
/*  63 */     for (Long dictCode : dictCodes) {
/*  64 */       SysDictData data = selectDictDataById(dictCode);
/*  65 */       this.dictDataMapper.deleteDictDataById(dictCode);
/*  66 */       List<SysDictData> dictDatas = this.dictDataMapper.selectDictDataByType(data.getDictType());
/*  67 */       DictUtils.setDictCache(data.getDictType(), dictDatas);
    } 
  }







  
  public int insertDictData(SysDictData data) {
/*  79 */     int row = this.dictDataMapper.insertDictData(data);
/*  80 */     if (row > 0) {
/*  81 */       List<SysDictData> dictDatas = this.dictDataMapper.selectDictDataByType(data.getDictType());
/*  82 */       DictUtils.setDictCache(data.getDictType(), dictDatas);
    } 
/*  84 */     return row;
  }







  
  public int updateDictData(SysDictData data) {
/*  95 */     int row = this.dictDataMapper.updateDictData(data);
/*  96 */     if (row > 0) {
/*  97 */       List<SysDictData> dictDatas = this.dictDataMapper.selectDictDataByType(data.getDictType());
/*  98 */       DictUtils.setDictCache(data.getDictType(), dictDatas);
    } 
/* 100 */     return row;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\impl\SysDictDataServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */