 package com.cms.system_service.quartz.util;

 import org.quartz.JobExecutionContext;
 import com.cms.system_service.quartz.domain.SysJob;


 public class QuartzJobExecution
   extends AbstractQuartzJob
 {
   protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception {
/* 17 */     JobInvokeUtil.invokeMethod(sysJob);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quart\\util\QuartzJobExecution.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */