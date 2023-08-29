package com.cms.system_service.quartz.controller;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.annotation.BusinessType;
import com.cms.base_service.annotation.Log;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.system_service.quartz.domain.SysJob;
import com.cms.system_service.quartz.service.SysJobService;
import com.cms.system_service.quartz.util.CronUtils;
import com.cms.system_service.quartz.util.TaskException;

import java.util.List;


@RestController
@RequestMapping({"/monitor/job"})
public class SysJobCtl
  extends BaseCtl
{
  @Autowired(required = false)
  private SysJobService jobService;
  
  @PreAuthor("monitor:job:list")
  @GetMapping({"/list"})
  public TableDataInfo list(SysJob sysJob) {
/*  45 */     startPage();
/*  46 */     List<SysJob> list = this.jobService.selectJobList(sysJob);
/*  47 */     return getDataTable(list);
  }



  
  @PreAuthor("monitor:job:export")
  @Log(title = "定时任务", businessType = BusinessType.EXPORT)
  @GetMapping({"/export"})
  public List<SysJob> export(SysJob sysJob) {
/*  57 */     List<SysJob> list = this.jobService.selectJobList(sysJob);

    
/*  60 */     return list;
  }



  
  @GetMapping({"/{jobId}"})
  public RestResult getInfo(@PathVariable("jobId") Long jobId) {
/*  68 */     return RestResult.ok().setData(this.jobService.selectJobById(jobId));
  }



  
  @PreAuthor("monitor:job:add")
  @Log(title = "定时任务", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody SysJob job) throws Exception {
/*  78 */     if (!CronUtils.isValid(job.getCronExpression()))
/*  79 */       return RestResult.fail().setMsg("新增任务'" + job.getJobName() + "'失败，Cron表达式不正确");
/*  80 */     if (StringUtils.containsIgnoreCase(job.getInvokeTarget(), "rmi://"))
/*  81 */       return RestResult.fail().setMsg("新增任务'" + job.getJobName() + "'失败，目标字符串不允许'rmi://'调用");
/*  82 */     if (StringUtils.containsIgnoreCase(job.getInvokeTarget(), "ldap://"))
/*  83 */       return RestResult.fail().setMsg("新增任务'" + job.getJobName() + "'失败，目标字符串不允许'ldap://'调用");
/*  84 */     if (StringUtils.containsAnyIgnoreCase(job.getInvokeTarget(), (CharSequence[])new String[] { "http://", "https://" }))
/*  85 */       return RestResult.fail().setMsg("新增任务'" + job.getJobName() + "'失败，目标字符串不允许'http(s)//'调用");
/*  86 */     if (StringUtils.containsAnyIgnoreCase(job.getInvokeTarget(), (CharSequence[]) Constants.JOB_ERROR_STR)) {
/*  87 */       return RestResult.fail().setMsg("新增任务'" + job.getJobName() + "'失败，目标字符串存在违规");
    }
/*  89 */     job.setCreateBy(SecurityUtils.getUid());
/*  90 */     return toAjax(this.jobService.insertJob(job));
  }



  
  @PreAuthor("monitor:job:edit")
  @Log(title = "定时任务", businessType = BusinessType.UPDATE)
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody SysJob job) throws SchedulerException, TaskException {
/* 100 */     if (!CronUtils.isValid(job.getCronExpression()))
/* 101 */       return RestResult.fail().setMsg("修改任务'" + job.getJobName() + "'失败，Cron表达式不正确");
/* 102 */     if (StringUtils.containsIgnoreCase(job.getInvokeTarget(), "rmi://"))
/* 103 */       return RestResult.fail().setMsg("修改任务'" + job.getJobName() + "'失败，目标字符串不允许'rmi://'调用");
/* 104 */     if (StringUtils.containsIgnoreCase(job.getInvokeTarget(), "ldap://"))
/* 105 */       return RestResult.fail().setMsg("修改任务'" + job.getJobName() + "'失败，目标字符串不允许'ldap://'调用");
/* 106 */     if (StringUtils.containsAnyIgnoreCase(job.getInvokeTarget(), (CharSequence[])new String[] { "http://", "https://" }))
/* 107 */       return RestResult.fail().setMsg("修改任务'" + job.getJobName() + "'失败，目标字符串不允许'http(s)//'调用");
/* 108 */     if (StringUtils.containsAnyIgnoreCase(job.getInvokeTarget(), (CharSequence[]) Constants.JOB_ERROR_STR)) {
/* 109 */       return RestResult.fail().setMsg("修改任务'" + job.getJobName() + "'失败，目标字符串存在违规");
    }
/* 111 */     job.setUpdateBy(SecurityUtils.getUid());
/* 112 */     return toAjax(this.jobService.updateJob(job));
  }



  
  @PreAuthor("monitor:job:changeStatus")
  @Log(title = "定时任务", businessType = BusinessType.UPDATE)
  @PostMapping({"/changeStatus"})
  public RestResult changeStatus(@RequestBody SysJob job) throws SchedulerException {
/* 122 */     SysJob newJob = this.jobService.selectJobById(job.getJobId());
/* 123 */     newJob.setStatus(job.getStatus());
/* 124 */     this.jobService.changeStatus(newJob);
/* 125 */     return RestResult.ok();
  }



  
  @PreAuthor("monitor:job:run")
  @Log(title = "定时任务", businessType = BusinessType.UPDATE)
  @PostMapping({"/run"})
  public RestResult run(@RequestBody SysJob job) throws SchedulerException {
/* 135 */     this.jobService.run(job);
/* 136 */     return RestResult.ok();
  }



  
  @PreAuthor("monitor:job:remove")
  @Log(title = "定时任务", businessType = BusinessType.DELETE)
  @PostMapping({"/{jobIds}"})
  public RestResult remove(@PathVariable Long[] jobIds) throws SchedulerException, TaskException {
/* 146 */     this.jobService.deleteJobByIds(jobIds);
/* 147 */     return RestResult.ok();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quartz\controller\SysJobCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */