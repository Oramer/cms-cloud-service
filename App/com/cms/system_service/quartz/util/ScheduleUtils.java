package com.cms.system_service.quartz.util;

import com.cms.system_service.quartz.domain.SysJob;
import com.cms.system_service.quartz.util.QuartzDisallowConcurrentExecution;
import com.cms.system_service.quartz.util.QuartzJobExecution;
import com.cms.system_service.quartz.util.ScheduleConstants;
import com.cms.system_service.quartz.util.TaskException;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.ScheduleBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;


public class ScheduleUtils {
    private static Class<? extends Job> getQuartzJobClass(SysJob sysJob) {
        /* 28 */
        boolean isConcurrent = "0".equals(sysJob.getConcurrent());
        /* 29 */
        return isConcurrent ? (Class) QuartzJobExecution.class : (Class) QuartzDisallowConcurrentExecution.class;
    }


    public static TriggerKey getTriggerKey(Long jobId, String jobGroup) {
        /* 36 */
        return TriggerKey.triggerKey("TASK_CLASS_NAME" + jobId, jobGroup);
    }


    public static JobKey getJobKey(Long jobId, String jobGroup) {
        /* 43 */
        return JobKey.jobKey("TASK_CLASS_NAME" + jobId, jobGroup);
    }


    public static void createScheduleJob(Scheduler scheduler, SysJob job) throws Exception {
        /* 50 */
        Class<? extends Job> jobClass = getQuartzJobClass(job);

        /* 52 */
        Long jobId = job.getJobId();
        /* 53 */
        String jobGroup = job.getJobGroup();
        /* 54 */
        JobDetail jobDetail = JobBuilder.newJob(jobClass).withIdentity(getJobKey(jobId, jobGroup)).build();


        /* 57 */
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
        /* 58 */
        cronScheduleBuilder = handleCronScheduleMisfirePolicy(job, cronScheduleBuilder);



        /* 62 */
        CronTrigger trigger = (CronTrigger) TriggerBuilder.newTrigger().withIdentity(getTriggerKey(jobId, jobGroup)).withSchedule((ScheduleBuilder) cronScheduleBuilder).build();


        /* 65 */
        jobDetail.getJobDataMap().put("TASK_PROPERTIES", job);


        /* 68 */
        if (scheduler.checkExists(getJobKey(jobId, jobGroup))) {
            /* 70 */
            scheduler.deleteJob(getJobKey(jobId, jobGroup));
        }

        /* 73 */
        scheduler.scheduleJob(jobDetail, (Trigger) trigger);


        /* 76 */
//        if (job.getStatus().equals(ScheduleConstants.Status.PAUSE.getValue())) {
//            /* 77 */
//            scheduler.pauseJob(getJobKey(jobId, jobGroup));
//        }
    }


    public static CronScheduleBuilder handleCronScheduleMisfirePolicy(SysJob job, CronScheduleBuilder cb) throws Exception {
        /* 86 */
        switch (job.getMisfirePolicy()) {
            case "0":
                /* 88 */
                return cb;
            case "1":
                /* 90 */
                return cb.withMisfireHandlingInstructionIgnoreMisfires();
            case "2":
                /* 92 */
                return cb.withMisfireHandlingInstructionFireAndProceed();
            case "3":
                /* 94 */
                return cb.withMisfireHandlingInstructionDoNothing();
        }
        /* 96 */
        throw new Exception();
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quart\\util\ScheduleUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */