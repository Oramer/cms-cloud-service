package com.cms.system_service.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.system_service.system.domain.SysBusCodeRules;

import java.util.List;

@Mapper
public interface SysBusCodeRulesMapper {
  SysBusCodeRules selectSysBusCodeRulesById(String paramString);
  
  List<SysBusCodeRules> selectSysBusCodeRulesList(SysBusCodeRules paramSysBusCodeRules);
  
  int insertSysBusCodeRules(SysBusCodeRules paramSysBusCodeRules);
  
  int updateSysBusCodeRules(SysBusCodeRules paramSysBusCodeRules);
  
  int deleteSysBusCodeRulesById(String paramString);
  
  int deleteSysBusCodeRulesByIds(String[] paramArrayOfString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysBusCodeRulesMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */