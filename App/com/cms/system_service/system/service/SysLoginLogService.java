 package com.cms.system_service.system.service;
 
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.system_service.system.domain.SysLoginLog;
 import com.cms.system_service.system.mapper.SysLoginLogMapper;
 import java.util.List;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 @Service
 public class SysLoginLogService
 {
/* 17 */   private static final Logger log = LoggerFactory.getLogger(com.cms.system_service.system.service.SysLoginLogService.class);
 
 
 
 
   
   @Autowired(required = false)
   private SysLoginLogMapper sysLoginLogMapper;
 
 
 
 
   
   public SysLoginLog selectSysLoginLogById(Long logId) {
/* 31 */     return this.sysLoginLogMapper.selectSysLoginLogById(logId);
   }
 
 
 
 
 
 
   
   public List<SysLoginLog> selectSysLoginLogList(SysLoginLog sysLoginLog) {
/* 41 */     return this.sysLoginLogMapper.selectSysLoginLogList(sysLoginLog);
   }
 
 
 
 
 
 
   
   public int insertSysLoginLog(SysLoginLog sysLoginLog) {
/* 51 */     sysLoginLog.setLoginTime(DateUtils.getNowDate());
/* 52 */     return this.sysLoginLogMapper.insertSysLoginLog(sysLoginLog);
   }
 
 
 
 
 
 
   
   public int updateSysLoginLog(SysLoginLog sysLoginLog) {
/* 62 */     return this.sysLoginLogMapper.updateSysLoginLog(sysLoginLog);
   }
 
 
 
 
 
 
   
   public int deleteSysLoginLogByIds(Long[] logIds) {
/* 72 */     return this.sysLoginLogMapper.deleteSysLoginLogByIds(logIds);
   }
 
 
 
 
 
 
   
   public int deleteSysLoginLogById(Long logId) {
/* 82 */     return this.sysLoginLogMapper.deleteSysLoginLogById(logId);
   }
   
   public void cleanLog() {
/* 86 */     this.sysLoginLogMapper.cleanLog();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\SysLoginLogService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */