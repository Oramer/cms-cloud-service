package com.cms.buss_service.bucket.controller;

import com.cms.base_service.annotation.BusinessType;
import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.Log;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.buss_service.bucket.domain.BussBucketDetails;
import com.cms.buss_service.bucket.service.BussBucketDetailsService;
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
@RequestMapping({"/cms/details"})
public class BussBucketDetailsCtl
  extends BaseCtl
{
  @Autowired
  private BussBucketDetailsService bussBucketDetailsService;
  
  @DataScope
  @PreAuthor("cms:details:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussBucketDetails bussBucketDetails) {
/*  46 */     startPage();
/*  47 */     List<BussBucketDetails> list = this.bussBucketDetailsService.selectBussBucketDetailsList(bussBucketDetails);
/*  48 */     return getDataTable(list);
  }



  
  @Log(businessType = BusinessType.EXPORT, title = "导出桶操作详情列表")
  @PreAuthor("cms:details:export")
  @GetMapping({"/export"})
  public void export(BussBucketDetails bussBucketDetails, HttpServletResponse response) {
/*  58 */     List<BussBucketDetails> list = this.bussBucketDetailsService.selectBussBucketDetailsList(bussBucketDetails);
/*  59 */     ExcelUtil<BussBucketDetails> util = new ExcelUtil(BussBucketDetails.class);
/*  60 */     util.exportExcel(response, list, "水桶操作详情数据");
  }



  
  @PreAuthor("cms:details:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Long id) {
/*  69 */     return RestResult.ok().setData(this.bussBucketDetailsService.selectBussBucketDetailsById(id));
  }



  
  @Log(businessType = BusinessType.INSERT, title = "新增桶操作详情")
  @PreAuthor("cms:details:add")
  @PostMapping({"/add"})
  public RestResult add(@RequestBody BussBucketDetails bussBucketDetails) {
/*  79 */     int rows = this.bussBucketDetailsService.insertBussBucketDetails(bussBucketDetails);
/*  80 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.UPDATE, title = "修改桶操作详情")
  @PreAuthor("cms:details:edit")
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody BussBucketDetails bussBucketDetails) {
/*  90 */     int rows = this.bussBucketDetailsService.updateBussBucketDetails(bussBucketDetails);
/*  91 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.DELETE, title = "删除桶操作详情")
  @PreAuthor("cms:details:remove")
  @PostMapping({"/{ids}"})
  public RestResult remove(@PathVariable Long[] ids) {
/* 101 */     int rows = this.bussBucketDetailsService.deleteBussBucketDetailsByIds(ids);
/* 102 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\controller\BussBucketDetailsCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */