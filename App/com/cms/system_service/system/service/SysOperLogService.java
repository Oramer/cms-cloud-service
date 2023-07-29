 package com.cms.system_service.system.service;
 
 import com.cms.system_service.system.domain.SysOperLog;
 import com.cms.system_service.system.mapper.SysOperLogMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 @Service
 public class SysOperLogService
 {
   @Autowired(required = false)
   private SysOperLogMapper operLogMapper;
   
   public void insertOperlog(SysOperLog operLog) {
/* 21 */     this.operLogMapper.insertOperlog(operLog);
   }
 
 
 
 
 
 
   
   public List<SysOperLog> selectOperLogList(SysOperLog operLog) {
/* 31 */     return this.operLogMapper.selectOperLogList(operLog);
   }
 
 
 
 
 
 
   
   public int deleteOperLogByIds(Long[] operIds) {
/* 41 */     return this.operLogMapper.deleteOperLogByIds(operIds);
   }
 
 
 
 
 
 
   
   public SysOperLog selectOperLogById(Long operId) {
/* 51 */     return this.operLogMapper.selectOperLogById(operId);
   }
 
 
 
   
   public void cleanOperLog() {
/* 58 */     this.operLogMapper.cleanOperLog();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\SysOperLogService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */