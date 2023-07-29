 package com.cms.system_service.system.service;

 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.system_service.system.domain.SysBusCodeRules;
 import com.cms.system_service.system.mapper.SysBusCodeRulesMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;












 @Service
 public class SysBusCodeRulesService
 {
   @Autowired(required = false)
   private SysBusCodeRulesMapper sysBusCodeRulesMapper;

   public SysBusCodeRules selectSysBusCodeRulesById(String pk) {
/* 28 */     return this.sysBusCodeRulesMapper.selectSysBusCodeRulesById(pk);
   }







   public List<SysBusCodeRules> selectSysBusCodeRulesList(SysBusCodeRules sysBusCodeRules) {
/* 38 */     return this.sysBusCodeRulesMapper.selectSysBusCodeRulesList(sysBusCodeRules);
   }







   public int insertSysBusCodeRules(SysBusCodeRules sysBusCodeRules) {
/* 48 */     sysBusCodeRules.setCreateTime(DateUtils.getTime());
/* 49 */     return this.sysBusCodeRulesMapper.insertSysBusCodeRules(sysBusCodeRules);
   }







   public int updateSysBusCodeRules(SysBusCodeRules sysBusCodeRules) {
/* 59 */     sysBusCodeRules.setUpdateTime(DateUtils.getTime());
/* 60 */     return this.sysBusCodeRulesMapper.updateSysBusCodeRules(sysBusCodeRules);
   }







   public int deleteSysBusCodeRulesByIds(String[] pks) {
/* 70 */     return this.sysBusCodeRulesMapper.deleteSysBusCodeRulesByIds(pks);
   }







   public int deleteSysBusCodeRulesById(String pk) {
/* 80 */     return this.sysBusCodeRulesMapper.deleteSysBusCodeRulesById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\SysBusCodeRulesService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */