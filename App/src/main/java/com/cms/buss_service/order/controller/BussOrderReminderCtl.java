package com.cms.buss_service.order.controller;

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
import com.cms.buss_service.order.domain.BussOrderReminder;
import com.cms.buss_service.order.service.BussOrderReminderService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping({"/cms/reminder"})
public class BussOrderReminderCtl
  extends BaseCtl
{
  @Autowired
  private BussOrderReminderService bussOrderReminderService;
  
  @DataScope
  @PreAuthor("cms:reminder:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussOrderReminder bussOrderReminder) {
/*  45 */     startPage();
/*  46 */     List<BussOrderReminder> list = this.bussOrderReminderService.selectBussOrderReminderList(bussOrderReminder);
/*  47 */     return getDataTable(list);
  }



  
  @Log(businessType = BusinessType.EXPORT, title = "导出订单催单信息列表")
  @PreAuthor("cms:reminder:export")
  @GetMapping({"/export"})
  public void export(BussOrderReminder bussOrderReminder, HttpServletResponse response) {
/*  57 */     List<BussOrderReminder> list = this.bussOrderReminderService.selectBussOrderReminderList(bussOrderReminder);
/*  58 */     ExcelUtil<BussOrderReminder> util = new ExcelUtil(BussOrderReminder.class);
/*  59 */     util.exportExcel(response, list, "催单信息列表数据");
  }



  
  @PreAuthor("cms:reminder:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Long id) {
/*  68 */     return RestResult.ok().setData(this.bussOrderReminderService.selectBussOrderReminderById(id));
  }



  
  @Log(businessType = BusinessType.INSERT, title = "新增订单催单信息")
  @PreAuthor("cms:reminder:add")
  @PostMapping({"/add"})
  public RestResult add(@RequestBody BussOrderReminder bussOrderReminder) {
/*  78 */     int rows = this.bussOrderReminderService.insertBussOrderReminder(bussOrderReminder);
/*  79 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.UPDATE, title = "修改订单催单信息")
  @PreAuthor("cms:reminder:edit")
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody BussOrderReminder bussOrderReminder) {
/*  89 */     int rows = this.bussOrderReminderService.updateBussOrderReminder(bussOrderReminder);
/*  90 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.DELETE, title = "删除订单催单信息")
  @PreAuthor("cms:reminder:remove")
  @PostMapping({"/{ids}"})
  public RestResult remove(@PathVariable Long[] ids) {
/* 100 */     int rows = this.bussOrderReminderService.deleteBussOrderReminderByIds(ids);
/* 101 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\controller\BussOrderReminderCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */