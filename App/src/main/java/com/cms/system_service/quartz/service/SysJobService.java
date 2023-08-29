package com.cms.system_service.quartz.service;

import org.quartz.JobDataMap;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cms.system_service.quartz.domain.SysJob;
import com.cms.system_service.quartz.mapper.SysJobMapper;
import com.cms.system_service.quartz.util.CronUtils;
import com.cms.system_service.quartz.util.ScheduleUtils;
import com.cms.system_service.quartz.util.TaskException;

import javax.annotation.PostConstruct;
import java.util.List;


@Service
public class SysJobService {
    @Autowired
    private Scheduler scheduler;
    @Autowired(required = false)
    private SysJobMapper jobMapper;

    @PostConstruct
    public void init() throws SchedulerException, TaskException {
        /*  36 */
        this.scheduler.clear();
        /*  37 */
        List<SysJob> jobList = this.jobMapper.selectJobAll();
        /*  38 */
        for (SysJob job : jobList) {
            /*  39 */
            try {
                ScheduleUtils.createScheduleJob(this.scheduler, job);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


    public List<SysJob> selectJobList(SysJob job) {
        /*  50 */
        return this.jobMapper.selectJobList(job);
    }


    public SysJob selectJobById(Long jobId) {
        /*  60 */
        return this.jobMapper.selectJobById(jobId);
    }


    @Transactional(rollbackFor = {Exception.class})
    public int pauseJob(SysJob job) throws SchedulerException {
        /*  70 */
        Long jobId = job.getJobId();
        /*  71 */
        String jobGroup = job.getJobGroup();
///*  72 */     job.setStatus(ScheduleConstants.Status.PAUSE.getValue());
        /*  73 */
        int rows = this.jobMapper.updateJob(job);
        /*  74 */
        if (rows > 0) {
            /*  75 */
            this.scheduler.pauseJob(ScheduleUtils.getJobKey(jobId, jobGroup));
        }
        /*  77 */
        return rows;
    }


    @Transactional(rollbackFor = {Exception.class})
    public int resumeJob(SysJob job) throws SchedulerException {
        /*  87 */
        Long jobId = job.getJobId();
        /*  88 */
        String jobGroup = job.getJobGroup();
///*  89 */     job.setStatus(ScheduleConstants.Status.NORMAL.getValue());
        /*  90 */
        int rows = this.jobMapper.updateJob(job);
        /*  91 */
        if (rows > 0) {
            /*  92 */
            this.scheduler.resumeJob(ScheduleUtils.getJobKey(jobId, jobGroup));
        }
        /*  94 */
        return rows;
    }


    @Transactional(rollbackFor = {Exception.class})
    public int deleteJob(SysJob job) throws SchedulerException {
        /* 104 */
        Long jobId = job.getJobId();
        /* 105 */
        String jobGroup = job.getJobGroup();
        /* 106 */
        int rows = this.jobMapper.deleteJobById(jobId);
        /* 107 */
        if (rows > 0) {
            /* 108 */
            this.scheduler.deleteJob(ScheduleUtils.getJobKey(jobId, jobGroup));
        }
        /* 110 */
        return rows;
    }


    @Transactional(rollbackFor = {Exception.class})
    public void deleteJobByIds(Long[] jobIds) throws SchedulerException {
        /* 121 */
        for (Long jobId : jobIds) {
            /* 122 */
            SysJob job = this.jobMapper.selectJobById(jobId);
            /* 123 */
            deleteJob(job);
        }
    }


    @Transactional(rollbackFor = {Exception.class})
    public int changeStatus(SysJob job) throws SchedulerException {
        /* 134 */
        int rows = 0;
        /* 135 */
        String status = job.getStatus();
        /* 136 */
        if ("0".equals(status)) {
            /* 137 */
            rows = resumeJob(job);
            /* 138 */
        } else if ("1".equals(status)) {
            /* 139 */
            rows = pauseJob(job);
        }
        /* 141 */
        return rows;
    }


    @Transactional(rollbackFor = {Exception.class})
    public void run(SysJob job) throws SchedulerException {
        /* 151 */
        Long jobId = job.getJobId();
        /* 152 */
        String jobGroup = job.getJobGroup();
        /* 153 */
        SysJob properties = selectJobById(job.getJobId());

        /* 155 */
        JobDataMap dataMap = new JobDataMap();
        /* 156 */
        dataMap.put("TASK_PROPERTIES", properties);
        /* 157 */
        this.scheduler.triggerJob(ScheduleUtils.getJobKey(jobId, jobGroup), dataMap);
    }


    @Transactional(rollbackFor = {Exception.class})
    public int insertJob(SysJob job) throws Exception {
        /* 167 */
        job.setStatus("0");
        /* 168 */
        int rows = this.jobMapper.insertJob(job);
        /* 169 */
        if (rows > 0) {
            /* 170 */
            ScheduleUtils.createScheduleJob(this.scheduler, job);
        }
        /* 172 */
        return rows;
    }


    @Transactional(rollbackFor = {Exception.class})
    public int updateJob(SysJob job) throws SchedulerException, TaskException {
        /* 182 */
        SysJob properties = selectJobById(job.getJobId());
        /* 183 */
        int rows = this.jobMapper.updateJob(job);
        /* 184 */
        if (rows > 0) {
            /* 185 */
            try {
                updateSchedulerJob(job, properties.getJobGroup());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        /* 187 */
        return rows;
    }


    public void updateSchedulerJob(SysJob job, String jobGroup) throws Exception {
        /* 197 */
        Long jobId = job.getJobId();

        /* 199 */
        JobKey jobKey = ScheduleUtils.getJobKey(jobId, jobGroup);
        /* 200 */
        if (this.scheduler.checkExists(jobKey)) {
            /* 202 */
            this.scheduler.deleteJob(jobKey);
        }
        /* 204 */
        ScheduleUtils.createScheduleJob(this.scheduler, job);
    }


    public boolean checkCronExpressionIsValid(String cronExpression) {
        /* 214 */
        return CronUtils.isValid(cronExpression);
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quartz\service\SysJobService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */