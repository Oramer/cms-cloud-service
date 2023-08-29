package com.cms.base_service.common.utils;

import com.alibaba.fastjson.JSONArray;
import com.cms.base_service.common.redis.RedisCache;
import com.cms.system_service.system.domain.SysDictData;

import java.util.Collection;
import java.util.List;














public class DictUtils
{
  public static final String SEPARATOR = ",";
  
  public static void setDictCache(String key, List<SysDictData> dictDatas) {
/*  29 */     ((RedisCache) SpringUtils.getBean(RedisCache.class)).setCacheObject(getCacheKey(key), dictDatas);
  }






  
  public static List<SysDictData> getDictCache(String key) {
/*  39 */     JSONArray arrayCache = (JSONArray)((RedisCache) SpringUtils.getBean(RedisCache.class)).getCacheObject(getCacheKey(key));
/*  40 */     if (StringUtils.isNotNull(arrayCache)) {
/*  41 */       arrayCache.toJavaList(SysDictData.class);
    }
/*  43 */     return null;
  }







  
  public static String getDictLabel(String dictType, String dictValue) {
/*  54 */     return getDictLabel(dictType, dictValue, ",");
  }







  
  public static String getDictValue(String dictType, String dictLabel) {
/*  65 */     return getDictValue(dictType, dictLabel, ",");
  }








  
  public static String getDictLabel(String dictType, String dictValue, String separator) {
/*  77 */     StringBuilder propertyString = new StringBuilder();
/*  78 */     List<SysDictData> datas = getDictCache(dictType);
    
/*  80 */     if (StringUtils.isNotEmpty(datas)) {
/*  81 */       if (StringUtils.containsAny(separator, dictValue)) {
/*  82 */         for (SysDictData dict : datas) {
/*  83 */           for (String value : dictValue.split(separator)) {
/*  84 */             if (value.equals(dict.getDictValue())) {
/*  85 */               propertyString.append(dict.getDictLabel()).append(separator);
              break;
            } 
          } 
        } 
      } else {
/*  91 */         for (SysDictData dict : datas) {
/*  92 */           if (dictValue.equals(dict.getDictValue())) {
/*  93 */             return dict.getDictLabel();
          }
        } 
      } 
    }
/*  98 */     return StringUtils.stripEnd(propertyString.toString(), separator);
  }








  
  public static String getDictValue(String dictType, String dictLabel, String separator) {
/* 110 */     StringBuilder propertyString = new StringBuilder();
/* 111 */     List<SysDictData> datas = getDictCache(dictType);
    
/* 113 */     if (StringUtils.containsAny(separator, dictLabel) && StringUtils.isNotEmpty(datas)) {
/* 114 */       for (SysDictData dict : datas) {
/* 115 */         for (String label : dictLabel.split(separator)) {
/* 116 */           if (label.equals(dict.getDictLabel())) {
/* 117 */             propertyString.append(dict.getDictValue()).append(separator);
            break;
          } 
        } 
      } 
    } else {
/* 123 */       for (SysDictData dict : datas) {
/* 124 */         if (dictLabel.equals(dict.getDictLabel())) {
/* 125 */           return dict.getDictValue();
        }
      } 
    } 
/* 129 */     return StringUtils.stripEnd(propertyString.toString(), separator);
  }





  
  public static void removeDictCache(String key) {
/* 138 */     ((RedisCache) SpringUtils.getBean(RedisCache.class)).deleteObject(getCacheKey(key));
  }



  
  public static void clearDictCache() {
/* 145 */     Collection<String> keys = ((RedisCache) SpringUtils.getBean(RedisCache.class)).keys("sys:dict*");
/* 146 */     ((RedisCache) SpringUtils.getBean(RedisCache.class)).deleteObject(keys);
  }






  
  public static String getCacheKey(String configKey) {
/* 156 */     return "sys:dict" + configKey;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\DictUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */