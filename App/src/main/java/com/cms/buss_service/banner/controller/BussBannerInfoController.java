package com.cms.buss_service.banner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.buss_service.banner.domain.BussBannerInfo;
import com.cms.buss_service.banner.service.BussBannerInfoService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping({"/banner/info"})
public class BussBannerInfoController
  extends BaseController
{
  @Autowired
  private BussBannerInfoService bussBannerInfoService;
  
  @PreAuthor("banner:info:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussBannerInfo bussBannerInfo) {
/*  48 */     startPage();
/*  49 */     List<BussBannerInfo> list = this.bussBannerInfoService.selectBussBannerInfoList(bussBannerInfo);
/*  50 */     return getDataTable(list);
  }




  
  @PreAuthor("banner:info:export")
  @Log(title = "Banner图信息", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, BussBannerInfo bussBannerInfo) {
/*  61 */     List<BussBannerInfo> list = this.bussBannerInfoService.selectBussBannerInfoList(bussBannerInfo);
/*  62 */     ExcelUtil<BussBannerInfo> util = new ExcelUtil(BussBannerInfo.class);
/*  63 */     util.exportExcel(response, list, "Banner图信息数据");
  }



  
  @PreAuthor("banner:info:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Long id) {
/*  72 */     return RestResult.ok(this.bussBannerInfoService.selectBussBannerInfoById(id));
  }



  
  @PreAuthor("banner:info:add")
  @Log(title = "Banner图信息", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody BussBannerInfo bussBannerInfo) {
/*  82 */     bussBannerInfo.setNo1(SecurityUtils.getUserStationId().toString());
/*  83 */     return toAjax(this.bussBannerInfoService.insertBussBannerInfo(bussBannerInfo));
  }




  
  @PreAuthor("banner:info:edit")
  @Log(title = "Banner图信息", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@RequestBody BussBannerInfo bussBannerInfo) {
/*  94 */     return toAjax(this.bussBannerInfoService.updateBussBannerInfo(bussBannerInfo));
  }



  
  @PreAuthor("banner:info:remove")
  @Log(title = "Banner图信息", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{ids}"})
  public RestResult remove(@PathVariable Long[] ids) {
/* 104 */     return toAjax(this.bussBannerInfoService.deleteBussBannerInfoByIds(ids));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\banner\controller\BussBannerInfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */