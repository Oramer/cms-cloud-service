 package com.cms.system_service.quartz.controller;
 
 import com.cms.base_service.common.model.BaseCtl;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.model.TableDataInfo;
 import com.cms.system_service.quartz.domain.SysJobLog;
 import com.cms.system_service.quartz.service.SysJobLogService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 
 
 
 
 
 
 
 
 @RestController
 @RequestMapping({"/monitor/jobLog"})
 public class SysJobLogCtl
   extends BaseCtl
 {
   @Autowired
   private SysJobLogService jobLogService;
   
   @GetMapping({"/list"})
   public TableDataInfo list(SysJobLog sysJobLog) {
/* 33 */     startPage();
/* 34 */     List<SysJobLog> list = this.jobLogService.selectJobLogList(sysJobLog);
/* 35 */     return getDataTable(list);
   }
 
 
 
   
   @GetMapping({"/export"})
   public RestResult export(SysJobLog sysJobLog) {
/* 43 */     return null;
   }
 
 
 
   
   @GetMapping({"/{configId}"})
   public RestResult getInfo(@PathVariable Long jobLogId) {
/* 51 */     return RestResult.ok().setData(this.jobLogService.selectJobLogById(jobLogId));
   }
 
 
 
 
   
   @PostMapping({"/{jobLogIds}"})
   public RestResult remove(@PathVariable Long[] jobLogIds) {
/* 60 */     return toAjax(this.jobLogService.deleteJobLogByIds(jobLogIds));
   }
 
 
 
   
   @PostMapping({"/clean"})
   public RestResult clean() {
/* 68 */     this.jobLogService.cleanJobLog();
/* 69 */     return RestResult.ok();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quartz\controller\SysJobLogCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */