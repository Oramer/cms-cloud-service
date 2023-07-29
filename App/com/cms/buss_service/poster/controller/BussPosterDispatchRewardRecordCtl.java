package com.cms.buss_service.poster.controller;

import com.cms.base_service.annotation.BusinessType;
import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.Log;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.buss_service.poster.domain.BussPosterDispatchRewardRecord;
import com.cms.buss_service.poster.service.BussPosterDispatchRewardRecordService;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;












@RestController
@RequestMapping({"/buss/dispatch"})
public class BussPosterDispatchRewardRecordCtl
  extends BaseCtl
{
  @Autowired
  private BussPosterDispatchRewardRecordService bussPosterDispatchRewardRecordService;
  
  @DataScope
  @PreAuthor("buss:dispatch:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussPosterDispatchRewardRecord bussPosterDispatchRewardRecord) {
/*  46 */     startPage();
/*  47 */     List<BussPosterDispatchRewardRecord> list = this.bussPosterDispatchRewardRecordService.selectBussPosterDispatchRewardRecordList(bussPosterDispatchRewardRecord);
/*  48 */     return getDataTable(list);
  }



  
  @Log(businessType = BusinessType.EXPORT, title = "导出派单员提成信息记录列表")
  @PreAuthor("buss:dispatch:export")
  @GetMapping({"/export"})
  public void export(BussPosterDispatchRewardRecord bussPosterDispatchRewardRecord, HttpServletResponse response) {
/*  58 */     List<BussPosterDispatchRewardRecord> list = this.bussPosterDispatchRewardRecordService.selectBussPosterDispatchRewardRecordList(bussPosterDispatchRewardRecord);
/*  59 */     ExcelUtil<BussPosterDispatchRewardRecord> util = new ExcelUtil(BussPosterDispatchRewardRecord.class);
/*  60 */     util.exportExcel(response, list, "导出派单员提成信息记录列表数据");
  }



  
  @PreAuthor("buss:dispatch:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Integer id) {
/*  69 */     return RestResult.ok().setData(this.bussPosterDispatchRewardRecordService.selectBussPosterDispatchRewardRecordById(id));
  }



  
  @Log(businessType = BusinessType.INSERT, title = "新增派单员提成信息记录")
  @PreAuthor("buss:dispatch:add")
  @PostMapping({"/add"})
  public RestResult add(@RequestBody BussPosterDispatchRewardRecord bussPosterDispatchRewardRecord) {
/*  79 */     int rows = this.bussPosterDispatchRewardRecordService.insertBussPosterDispatchRewardRecord(bussPosterDispatchRewardRecord);
/*  80 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.UPDATE, title = "修改派单员提成信息记录")
  @PreAuthor("buss:dispatch:edit")
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody BussPosterDispatchRewardRecord bussPosterDispatchRewardRecord) {
/*  90 */     int rows = this.bussPosterDispatchRewardRecordService.updateBussPosterDispatchRewardRecord(bussPosterDispatchRewardRecord);
/*  91 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.DELETE, title = "删除派单员提成信息记录")
  @PreAuthor("buss:dispatch:remove")
  @PostMapping({"/{ids}"})
  public RestResult remove(@PathVariable Integer[] ids) {
/* 101 */     int rows = this.bussPosterDispatchRewardRecordService.deleteBussPosterDispatchRewardRecordByIds(ids);
/* 102 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\controller\BussPosterDispatchRewardRecordCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */