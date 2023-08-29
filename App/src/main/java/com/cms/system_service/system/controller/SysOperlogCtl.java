 package com.cms.system_service.system.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.BaseCtl;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.model.TableDataInfo;
 import com.cms.system_service.system.domain.SysOperLog;
 import com.cms.system_service.system.service.SysOperLogService;

 import java.util.List;


 @RestController
 @RequestMapping({"/system/log"})
 public class SysOperlogCtl
   extends BaseCtl
 {
   @Autowired
   private SysOperLogService operLogService;
   
   @PreAuthor("system:log:list")
   @GetMapping({"/list"})
   public TableDataInfo list(SysOperLog operLog) {
/* 29 */     startPage();
/* 30 */     List<SysOperLog> list = this.operLogService.selectOperLogList(operLog);
/* 31 */     return getDataTable(list);
   }
   
   @PreAuthor("system:log:export")
   @GetMapping({"/export"})
   public void export(SysOperLog operLog) {
/* 37 */     List<SysOperLog> list = this.operLogService.selectOperLogList(operLog);
   }
 
 
   
   @GetMapping({"/{operId}"})
   public RestResult getInfo(@PathVariable Long operId) {
/* 44 */     return RestResult.ok().setData(this.operLogService.selectOperLogById(operId));
   }
   
   @PreAuthor("system:log:remove")
   @PostMapping({"/{operIds}"})
   public RestResult remove(@PathVariable Long[] operIds) {
/* 50 */     return toAjax(this.operLogService.deleteOperLogByIds(operIds));
   }
   
   @PreAuthor("system:log:remove")
   @PostMapping({"/clean"})
   public RestResult clean() {
/* 56 */     this.operLogService.cleanOperLog();
/* 57 */     return RestResult.ok();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysOperlogCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */