package com.cms.system_service.quartz.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;
import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.system_service.quartz.util.CronUtils;

import javax.validation.constraints.Size;
import java.util.Date;


public class SysJob
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  @Excel(name = "任务序号")
  private Long jobId;
  @Excel(name = "任务名称")
  private String jobName;
  @Excel(name = "任务组名")
  private String jobGroup;
  @Excel(name = "调用目标字符串")
  private String invokeTarget;
  @Excel(name = "执行表达式 ")
  private String cronExpression;
  @Excel(name = "计划策略 ")
  private String misfirePolicy;
  @Excel(name = "并发执行")
  private String concurrent;
  @Excel(name = "任务状态")
  private String status;

  public Long getJobId() {
/*  70 */     return this.jobId;
  }

  public void setJobId(Long jobId) {
/*  74 */     this.jobId = jobId;
  }

  @NotBlank(message = "任务名称不能为空")
  @Size(min = 0, max = 64, message = "任务名称不能超过64个字符")
  public String getJobName() {
/*  80 */     return this.jobName;
  }

  public void setJobName(String jobName) {
/*  84 */     this.jobName = jobName;
  }

  public String getJobGroup() {
/*  88 */     return this.jobGroup;
  }

  public void setJobGroup(String jobGroup) {
/*  92 */     this.jobGroup = jobGroup;
  }

  @NotBlank(message = "调用目标字符串不能为空")
  @Size(min = 0, max = 500, message = "调用目标字符串长度不能超过500个字符")
  public String getInvokeTarget() {
/*  98 */     return this.invokeTarget;
  }

  public void setInvokeTarget(String invokeTarget) {
/* 102 */     this.invokeTarget = invokeTarget;
  }

  @NotBlank(message = "Cron执行表达式不能为空")
  @Size(min = 0, max = 255, message = "Cron执行表达式不能超过255个字符")
  public String getCronExpression() {
/* 108 */     return this.cronExpression;
  }

  public void setCronExpression(String cronExpression) {
/* 112 */     this.cronExpression = cronExpression;
  }

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  public Date getNextValidTime() {
/* 117 */     if (StringUtils.isNotEmpty(this.cronExpression)) {
/* 118 */       return CronUtils.getNextExecution(this.cronExpression);
    }
/* 120 */     return null;
  }

  public String getMisfirePolicy() {
/* 124 */     return this.misfirePolicy;
  }

  public void setMisfirePolicy(String misfirePolicy) {
/* 128 */     this.misfirePolicy = misfirePolicy;
  }

  public String getConcurrent() {
/* 132 */     return this.concurrent;
  }

  public void setConcurrent(String concurrent) {
/* 136 */     this.concurrent = concurrent;
  }

  public String getStatus() {
/* 140 */     return this.status;
  }

  public void setStatus(String status) {
/* 144 */     this.status = status;
  }


  public String toString() {
/* 149 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 150 */       .append("jobId", getJobId())
/* 151 */       .append("jobName", getJobName())
/* 152 */       .append("jobGroup", getJobGroup())
/* 153 */       .append("cronExpression", getCronExpression())
/* 154 */       .append("nextValidTime", getNextValidTime())
/* 155 */       .append("misfirePolicy", getMisfirePolicy())
/* 156 */       .append("concurrent", getConcurrent())
/* 157 */       .append("status", getStatus())
/* 158 */       .append("createBy", getCreateBy())
/* 159 */       .append("createTime", getCreateTime())
/* 160 */       .append("updateBy", getUpdateBy())
/* 161 */       .append("updateTime", getUpdateTime())
/* 162 */       .append("remark", getRemark())
/* 163 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quartz\domain\SysJob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */