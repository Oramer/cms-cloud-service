package com.cms.buss_service.ticket.controller;

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
import com.cms.buss_service.ticket.domain.BussTicketUsedRecord;
import com.cms.buss_service.ticket.service.BussTicketUsedRecordService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping({"/cms/record"})
public class BussTicketUsedRecordCtl
  extends BaseCtl
{
  @Autowired
  private BussTicketUsedRecordService bussTicketUsedRecordService;
  
  @DataScope
  @PreAuthor("cms:record:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussTicketUsedRecord bussTicketUsedRecord) {
/*  46 */     startPage();
/*  47 */     List<BussTicketUsedRecord> list = this.bussTicketUsedRecordService.selectBussTicketUsedRecordList(bussTicketUsedRecord);
/*  48 */     return getDataTable(list);
  }



  
  @Log(businessType = BusinessType.EXPORT, title = "导出用户水票使用记录列表")
  @PreAuthor("cms:record:export")
  @GetMapping({"/export"})
  public void export(BussTicketUsedRecord bussTicketUsedRecord, HttpServletResponse response) {
/*  58 */     List<BussTicketUsedRecord> list = this.bussTicketUsedRecordService.selectBussTicketUsedRecordList(bussTicketUsedRecord);
/*  59 */     ExcelUtil<BussTicketUsedRecord> util = new ExcelUtil(BussTicketUsedRecord.class);
/*  60 */     util.exportExcel(response, list, "水票信息数据");
  }



  
  @PreAuthor("cms:record:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Integer id) {
/*  69 */     return RestResult.ok().setData(this.bussTicketUsedRecordService.selectBussTicketUsedRecordById(id));
  }



  
  @Log(businessType = BusinessType.INSERT, title = "新增用户水票使用记录")
  @PreAuthor("cms:record:add")
  @PostMapping({"/add"})
  public RestResult add(@RequestBody BussTicketUsedRecord bussTicketUsedRecord) {
/*  79 */     int rows = this.bussTicketUsedRecordService.insertBussTicketUsedRecord(bussTicketUsedRecord);
/*  80 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.UPDATE, title = "修改用户水票使用记录")
  @PreAuthor("cms:record:edit")
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody BussTicketUsedRecord bussTicketUsedRecord) {
/*  90 */     int rows = this.bussTicketUsedRecordService.updateBussTicketUsedRecord(bussTicketUsedRecord);
/*  91 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.DELETE, title = "删除用户水票使用记录")
  @PreAuthor("cms:record:remove")
  @PostMapping({"/{ids}"})
  public RestResult remove(@PathVariable Integer[] ids) {
/* 101 */     int rows = this.bussTicketUsedRecordService.deleteBussTicketUsedRecordByIds(ids);
/* 102 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\controller\BussTicketUsedRecordCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */