package com.cms.system_service.quartz.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

























public class SysJobLog
  extends BaseEntity
{
  private static final long serialVersionUID = 1L;
  @Excel(name = "日志序号")
  private Long jobLogId;
  @Excel(name = "任务名称")
  private String jobName;
  @Excel(name = "任务组名")
  private String jobGroup;
  @Excel(name = "调用目标字符串")
  private String invokeTarget;
  @Excel(name = "日志信息")
  private String jobMessage;
  @Excel(name = "执行状态")
  private String status;
  @Excel(name = "异常信息")
  private String exceptionInfo;
  private Date startTime;
  private Date stopTime;
  
  public Long getJobLogId() {
/*  55 */     return this.jobLogId;
  }

  
  public void setJobLogId(Long jobLogId) {
/*  60 */     this.jobLogId = jobLogId;
  }

  
  public String getJobName() {
/*  65 */     return this.jobName;
  }

  
  public void setJobName(String jobName) {
/*  70 */     this.jobName = jobName;
  }

  
  public String getJobGroup() {
/*  75 */     return this.jobGroup;
  }

  
  public void setJobGroup(String jobGroup) {
/*  80 */     this.jobGroup = jobGroup;
  }

  
  public String getInvokeTarget() {
/*  85 */     return this.invokeTarget;
  }

  
  public void setInvokeTarget(String invokeTarget) {
/*  90 */     this.invokeTarget = invokeTarget;
  }

  
  public String getJobMessage() {
/*  95 */     return this.jobMessage;
  }

  
  public void setJobMessage(String jobMessage) {
/* 100 */     this.jobMessage = jobMessage;
  }

  
  public String getStatus() {
/* 105 */     return this.status;
  }

  
  public void setStatus(String status) {
/* 110 */     this.status = status;
  }

  
  public String getExceptionInfo() {
/* 115 */     return this.exceptionInfo;
  }

  
  public void setExceptionInfo(String exceptionInfo) {
/* 120 */     this.exceptionInfo = exceptionInfo;
  }

  
  public Date getStartTime() {
/* 125 */     return this.startTime;
  }

  
  public void setStartTime(Date startTime) {
/* 130 */     this.startTime = startTime;
  }

  
  public Date getStopTime() {
/* 135 */     return this.stopTime;
  }

  
  public void setStopTime(Date stopTime) {
/* 140 */     this.stopTime = stopTime;
  }

  
  public String toString() {
/* 145 */     return (new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE))
/* 146 */       .append("jobLogId", getJobLogId())
/* 147 */       .append("jobName", getJobName())
/* 148 */       .append("jobGroup", getJobGroup())
/* 149 */       .append("jobMessage", getJobMessage())
/* 150 */       .append("status", getStatus())
/* 151 */       .append("exceptionInfo", getExceptionInfo())
/* 152 */       .append("startTime", getStartTime())
/* 153 */       .append("stopTime", getStopTime())
/* 154 */       .toString();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quartz\domain\SysJobLog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */