package com.cms.buss_service.station.controller;

import com.cms.base_service.annotation.BusinessType;
import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.Log;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.buss_service.station.domain.BussStationInountRecord;
import com.cms.buss_service.station.service.BussStationInountRecordService;
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
@RequestMapping({"/station/income"})
public class BussStationInountRecordCtl
  extends BaseCtl
{
  @Autowired
  private BussStationInountRecordService bussStationInountRecordService;
  
  @DataScope
  @PreAuthor("station:income:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussStationInountRecord bussStationInountRecord) {
/*  46 */     startPage();
/*  47 */     List<BussStationInountRecord> list = this.bussStationInountRecordService.selectBussStationInountRecordList(bussStationInountRecord);
/*  48 */     return getDataTable(list);
  }



  
  @Log(businessType = BusinessType.EXPORT, title = "导出水站收支记录表列表")
  @PreAuthor("station:srrecord:export")
  @GetMapping({"/export"})
  public void export(BussStationInountRecord bussStationInountRecord, HttpServletResponse response) {
/*  58 */     List<BussStationInountRecord> list = this.bussStationInountRecordService.selectBussStationInountRecordList(bussStationInountRecord);
/*  59 */     ExcelUtil<BussStationInountRecord> util = new ExcelUtil(BussStationInountRecord.class);
/*  60 */     util.exportExcel(response, list, "水站信息数据");
  }



  
  @PreAuthor("station:srrecord:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Long id) {
/*  69 */     return RestResult.ok().setData(this.bussStationInountRecordService.selectBussStationInountRecordById(id));
  }



  
  @Log(businessType = BusinessType.INSERT, title = "新增水站收支记录表")
  @PreAuthor("station:srrecord:add")
  @PostMapping({"/add"})
  public RestResult add(@RequestBody BussStationInountRecord bussStationInountRecord) {
/*  79 */     int rows = this.bussStationInountRecordService.insertBussStationInountRecord(bussStationInountRecord);
/*  80 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.UPDATE, title = "修改水站收支记录表")
  @PreAuthor("station:srrecord:edit")
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody BussStationInountRecord bussStationInountRecord) {
/*  90 */     int rows = this.bussStationInountRecordService.updateBussStationInountRecord(bussStationInountRecord);
/*  91 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.DELETE, title = "删除水站收支记录表")
  @PreAuthor("station:srrecord:remove")
  @PostMapping({"/{ids}"})
  public RestResult remove(@PathVariable Integer[] ids) {
/* 101 */     int rows = this.bussStationInountRecordService.deleteBussStationInountRecordByIds(ids);
/* 102 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\controller\BussStationInountRecordCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */