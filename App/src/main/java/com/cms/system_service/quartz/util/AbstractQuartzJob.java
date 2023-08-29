 package com.cms.system_service.quartz.util;

 import org.quartz.Job;
 import org.quartz.JobExecutionContext;
 import org.quartz.JobExecutionException;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import com.cms.base_service.common.utils.BeanUtils;
 import com.cms.base_service.common.utils.ExceptionUtil;
 import com.cms.base_service.common.utils.SpringUtils;
 import com.cms.base_service.common.utils.StringUtils;
 import com.cms.system_service.quartz.domain.SysJob;
 import com.cms.system_service.quartz.domain.SysJobLog;
 import com.cms.system_service.quartz.service.SysJobLogService;

 import java.util.Date;


 public abstract class AbstractQuartzJob
   implements Job
 {
/* 25 */   private static final Logger log = LoggerFactory.getLogger(AbstractQuartzJob.class);
 
 
 
   
/* 30 */   private static ThreadLocal<Date> threadLocal = new ThreadLocal<>();
 
   
   public void execute(JobExecutionContext context) throws JobExecutionException {
/* 34 */     SysJob sysJob = new SysJob();
/* 35 */     BeanUtils.copyBeanProp(sysJob, context.getMergedJobDataMap().get("TASK_PROPERTIES"));
     try {
/* 37 */       before(context, sysJob);
/* 38 */       if (sysJob != null) {
/* 39 */         doExecute(context, sysJob);
       }
/* 41 */       after(context, sysJob, null);
/* 42 */     } catch (Exception e) {
/* 43 */       log.error("任务执行异常  - ：", e);
/* 44 */       after(context, sysJob, e);
     } 
   }
 
 
 
 
 
 
   
   protected void before(JobExecutionContext context, SysJob sysJob) {
/* 55 */     threadLocal.set(new Date());
   }
 
 
 
 
 
 
   
   protected void after(JobExecutionContext context, SysJob sysJob, Exception e) {
/* 65 */     Date startTime = threadLocal.get();
/* 66 */     threadLocal.remove();
     
/* 68 */     SysJobLog sysJobLog = new SysJobLog();
/* 69 */     sysJobLog.setJobName(sysJob.getJobName());
/* 70 */     sysJobLog.setJobGroup(sysJob.getJobGroup());
/* 71 */     sysJobLog.setInvokeTarget(sysJob.getInvokeTarget());
/* 72 */     sysJobLog.setStartTime(startTime);
/* 73 */     sysJobLog.setStopTime(new Date());
/* 74 */     long runMs = sysJobLog.getStopTime().getTime() - sysJobLog.getStartTime().getTime();
/* 75 */     sysJobLog.setJobMessage(sysJobLog.getJobName() + " 总共耗时：" + runMs + "毫秒");
/* 76 */     if (e != null) {
/* 77 */       sysJobLog.setStatus("204");
/* 78 */       String errorMsg = StringUtils.substring(ExceptionUtil.getExceptionMessage(e), 0, 2000);
/* 79 */       sysJobLog.setExceptionInfo(errorMsg);
     } else {
/* 81 */       sysJobLog.setStatus("200");
     } 
 
     
/* 85 */     ((SysJobLogService) SpringUtils.getBean(SysJobLogService.class)).addJobLog(sysJobLog);
   }
   
   protected abstract void doExecute(JobExecutionContext paramJobExecutionContext, SysJob paramSysJob) throws Exception;
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quart\\util\AbstractQuartzJob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */