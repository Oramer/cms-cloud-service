package com.cms.system_service.system.service.impl;

import com.aliyun.oss.ServiceException;
import com.cms.base_service.common.utils.DictUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.system_service.system.domain.SysDictData;
import com.cms.system_service.system.domain.SysDictType;
import com.cms.system_service.system.mapper.SysDictDataMapper;
import com.cms.system_service.system.mapper.SysDictTypeMapper;
import com.cms.system_service.system.service.ISysDictTypeService;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;










@Service
public class SysDictTypeServiceImpl
  implements ISysDictTypeService
{
  @Autowired(required = false)
  private SysDictTypeMapper dictTypeMapper;
  @Autowired(required = false)
  private SysDictDataMapper dictDataMapper;

  @PostConstruct
  public void init() {
/*  40 */     loadingDictCache();
  }








  public List<SysDictType> selectDictTypeList(SysDictType dictType) {
/*  51 */     return this.dictTypeMapper.selectDictTypeList(dictType);
  }







  public List<SysDictType> selectDictTypeAll() {
/*  61 */     return this.dictTypeMapper.selectDictTypeAll();
  }








  public List<SysDictData> selectDictDataByType(String dictType) {
/*  72 */     List<SysDictData> dictDatas = DictUtils.getDictCache(dictType);
/*  73 */     if (StringUtils.isNotEmpty(dictDatas)) {
/*  74 */       return dictDatas;
    }
/*  76 */     dictDatas = this.dictDataMapper.selectDictDataByType(dictType);
/*  77 */     if (StringUtils.isNotEmpty(dictDatas)) {
/*  78 */       DictUtils.setDictCache(dictType, dictDatas);
/*  79 */       return dictDatas;
    }
/*  81 */     return null;
  }








  public SysDictType selectDictTypeById(Long dictId) {
/*  92 */     return this.dictTypeMapper.selectDictTypeById(dictId);
  }








  public SysDictType selectDictTypeByType(String dictType) {
/* 103 */     return this.dictTypeMapper.selectDictTypeByType(dictType);
  }







  public void deleteDictTypeByIds(Long[] dictIds) {
/* 113 */     for (Long dictId : dictIds) {
/* 114 */       SysDictType dictType = selectDictTypeById(dictId);
/* 115 */       if (this.dictDataMapper.countDictDataByType(dictType.getDictType()) > 0) {
/* 116 */         throw new ServiceException(String.format("%1$s已分配,不能删除", new Object[] { dictType.getDictName() }));
      }
/* 118 */       this.dictTypeMapper.deleteDictTypeById(dictId);
/* 119 */       DictUtils.removeDictCache(dictType.getDictType());
    }
  }





  public void loadingDictCache() {
/* 128 */     SysDictData dictData = new SysDictData();
/* 129 */     dictData.setStatus("0");
/* 130 */     Map<String, List<SysDictData>> dictDataMap = (Map<String, List<SysDictData>>)this.dictDataMapper.selectDictDataList(dictData).stream().collect(Collectors.groupingBy(SysDictData::getDictType));
/* 131 */     for (Map.Entry<String, List<SysDictData>> entry : dictDataMap.entrySet()) {
/* 132 */       DictUtils.setDictCache(entry.getKey(), (List)((List)entry.getValue()).stream().sorted(Comparator.comparing(SysDictData::getDictSort)).collect(Collectors.toList()));
    }
  }





  public void clearDictCache() {
/* 141 */     DictUtils.clearDictCache();
  }





  public void resetDictCache() {
/* 149 */     clearDictCache();
/* 150 */     loadingDictCache();
  }








  public int insertDictType(SysDictType dict) {
/* 161 */     int row = this.dictTypeMapper.insertDictType(dict);
/* 162 */     if (row > 0) {
/* 163 */       DictUtils.setDictCache(dict.getDictType(), null);
    }
/* 165 */     return row;
  }








  @Transactional
  public int updateDictType(SysDictType dict) {
/* 177 */     SysDictType oldDict = this.dictTypeMapper.selectDictTypeById(dict.getDictId());
/* 178 */     this.dictDataMapper.updateDictDataType(oldDict.getDictType(), dict.getDictType());
/* 179 */     int row = this.dictTypeMapper.updateDictType(dict);
/* 180 */     if (row > 0) {
/* 181 */       List<SysDictData> dictDatas = this.dictDataMapper.selectDictDataByType(dict.getDictType());
/* 182 */       DictUtils.setDictCache(dict.getDictType(), dictDatas);
    }
/* 184 */     return row;
  }








  public String checkDictTypeUnique(SysDictType dict) {
/* 195 */     Long dictId = Long.valueOf(StringUtils.isNull(dict.getDictId()) ? -1L : dict.getDictId().longValue());
/* 196 */     SysDictType dictType = this.dictTypeMapper.checkDictTypeUnique(dict.getDictType());
/* 197 */     if (StringUtils.isNotNull(dictType) && dictType.getDictId().longValue() != dictId.longValue()) {
/* 198 */       return "1";
    }
/* 200 */     return "0";
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\impl\SysDictTypeServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */