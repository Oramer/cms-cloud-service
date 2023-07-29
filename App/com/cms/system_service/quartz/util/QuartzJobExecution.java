 package com.cms.system_service.quartz.util;
 
 import com.cms.system_service.quartz.domain.SysJob;
 import com.cms.system_service.quartz.util.AbstractQuartzJob;
 import com.cms.system_service.quartz.util.JobInvokeUtil;
 import org.quartz.JobExecutionContext;
 
 
 
 
 
 
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