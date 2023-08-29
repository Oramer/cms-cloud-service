 package com.cms.system_service.quartz.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.system_service.quartz.domain.SysJobLog;
 import com.cms.system_service.quartz.mapper.SysJobLogMapper;

 import java.util.List;


 @Service
 public class SysJobLogService
 {
   @Autowired(required = false)
   private SysJobLogMapper jobLogMapper;
   
   public List<SysJobLog> selectJobLogList(SysJobLog jobLog) {
/* 27 */     return this.jobLogMapper.selectJobLogList(jobLog);
   }
 
 
 
 
 
 
   
   public SysJobLog selectJobLogById(Long jobLogId) {
/* 37 */     return this.jobLogMapper.selectJobLogById(jobLogId);
   }
 
 
 
 
 
   
   public void addJobLog(SysJobLog jobLog) {
/* 46 */     this.jobLogMapper.insertJobLog(jobLog);
   }
 
 
 
 
 
 
   
   public int deleteJobLogByIds(Long[] logIds) {
/* 56 */     return this.jobLogMapper.deleteJobLogByIds(logIds);
   }
 
 
 
 
 
   
   public int deleteJobLogById(Long jobId) {
/* 65 */     return this.jobLogMapper.deleteJobLogById(jobId);
   }
 
 
 
   
   public void cleanJobLog() {
/* 72 */     this.jobLogMapper.cleanJobLog();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quartz\service\SysJobLogService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */