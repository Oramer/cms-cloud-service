package com.cms.system_service.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.annotation.BusinessType;
import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.Log;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.system_service.system.domain.SysLoginLog;
import com.cms.system_service.system.service.SysLoginLogService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping({"/system/login_record"})
public class SysLoginLogCtl
  extends BaseCtl
{
  @Autowired
  private SysLoginLogService sysLoginLogService;
  
  @DataScope
  @PreAuthor("system:login_record:list")
  @GetMapping({"/list"})
  public TableDataInfo list(SysLoginLog sysLoginLog) {
/*  44 */     startPage();
/*  45 */     List<SysLoginLog> list = this.sysLoginLogService.selectSysLoginLogList(sysLoginLog);
/*  46 */     return getDataTable(list);
  }



  
  @Log(businessType = BusinessType.EXPORT, title = "导出系统访问记录列表")
  @PreAuthor("system:login_record:export")
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, SysLoginLog sysLoginLog) {
/*  56 */     List<SysLoginLog> list = this.sysLoginLogService.selectSysLoginLogList(sysLoginLog);
/*  57 */     ExcelUtil<SysLoginLog> util = new ExcelUtil(SysLoginLog.class);
/*  58 */     util.exportExcel(response, list, "系统访问记录数据");
  }



  
  @PreAuthor("system:login_record:query")
  @GetMapping({"/{logId}"})
  public RestResult getInfo(@PathVariable("logId") Long logId) {
/*  67 */     return RestResult.ok().setData(this.sysLoginLogService.selectSysLoginLogById(logId));
  }



  
  @Log(businessType = BusinessType.INSERT, title = "新增系统访问记录")
  @PreAuthor("system:login_record:add")
  @PostMapping({"/add"})
  public RestResult add(@RequestBody SysLoginLog sysLoginLog) {
/*  77 */     int rows = this.sysLoginLogService.insertSysLoginLog(sysLoginLog);
/*  78 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.UPDATE, title = "修改系统访问记录")
  @PreAuthor("system:login_record:edit")
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody SysLoginLog sysLoginLog) {
/*  88 */     int rows = this.sysLoginLogService.updateSysLoginLog(sysLoginLog);
/*  89 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.DELETE, title = "删除系统访问记录")
  @PreAuthor("system:login_record:remove")
  @PostMapping({"/{logIds}"})
  public RestResult remove(@PathVariable Long[] logIds) {
/*  99 */     int rows = this.sysLoginLogService.deleteSysLoginLogByIds(logIds);
/* 100 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }
  
  @PreAuthor("system:login_record:remove")
  @PostMapping({"/clean"})
  public RestResult clean() {
/* 106 */     this.sysLoginLogService.cleanLog();
/* 107 */     return RestResult.ok();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysLoginLogCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */