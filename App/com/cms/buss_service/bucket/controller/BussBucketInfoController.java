package com.cms.buss_service.bucket.controller;

import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.buss_service.bucket.domain.BussBucketInfo;
import com.cms.buss_service.bucket.service.BussBucketInfoService;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;











@RestController
@RequestMapping({"/buss/bucket/arecord"})
public class BussBucketInfoController
  extends BaseController
{
  @Autowired
  private BussBucketInfoService BussBucketInfoService;
  
  @DataScope
  @PreAuthor("bucket:record:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussBucketInfo bussBucketInfo) {
/*  47 */     startPage();
/*  48 */     List<BussBucketInfo> list = this.BussBucketInfoService.selectBussBucketInfoList(bussBucketInfo);
/*  49 */     return getDataTable(list);
  }




  
  @PreAuthor("bucket:record:export")
  @Log(title = "水桶操作主信息", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, BussBucketInfo bussBucketInfo) {
/*  60 */     List<BussBucketInfo> list = this.BussBucketInfoService.selectBussBucketInfoList(bussBucketInfo);
/*  61 */     ExcelUtil<BussBucketInfo> util = new ExcelUtil(BussBucketInfo.class);
/*  62 */     util.exportExcel(response, list, "水桶操作主信息数据");
  }



  
  @PreAuthor("bucket:record:query")
  @GetMapping({"/{pk}"})
  public RestResult getInfo(@PathVariable("pk") String pk) {
/*  71 */     return RestResult.ok(this.BussBucketInfoService.selectBussBucketInfoById(pk));
  }



  
  @PreAuthor("bucket:record:add")
  @Log(title = "水桶操作主信息", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody BussBucketInfo bussBucketInfo) {
/*  81 */     return toAjax(this.BussBucketInfoService.insertBussBucketInfo(bussBucketInfo));
  }



  
  @PreAuthor("bucket:record:edit")
  @Log(title = "水桶操作主信息", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@RequestBody BussBucketInfo bussBucketInfo) {
/*  91 */     return toAjax(this.BussBucketInfoService.updateBussBucketInfo(bussBucketInfo));
  }



  
  @PreAuthor("bucket:record:remove")
  @Log(title = "水桶操作主信息", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{pks}"})
  public RestResult remove(@PathVariable String[] pks) {
/* 101 */     return toAjax(this.BussBucketInfoService.deleteBussBucketInfoByIds(pks));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\controller\BussBucketInfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */