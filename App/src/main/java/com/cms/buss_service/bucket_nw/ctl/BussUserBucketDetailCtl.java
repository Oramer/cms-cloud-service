package com.cms.buss_service.bucket_nw.ctl;

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
import com.cms.buss_service.bucket_nw.domain.BussUserBucketDetail;
import com.cms.buss_service.bucket_nw.service.BussUserBucketDetailService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping({"/user/detail"})
public class BussUserBucketDetailCtl
  extends BaseCtl
{
  @Autowired
  private BussUserBucketDetailService bussUserBucketDetailService;
  
  @DataScope
  @PreAuthor("user:detail:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussUserBucketDetail bussUserBucketDetail) {
/*  45 */     startPage();
/*  46 */     List<BussUserBucketDetail> list = this.bussUserBucketDetailService.selectBussUserBucketDetailList(bussUserBucketDetail);
/*  47 */     return getDataTable(list);
  }



  
  @Log(businessType = BusinessType.EXPORT, title = "导出用户桶操作详情列表")
  @PreAuthor("user:detail:export")
  @GetMapping({"/export"})
  public void export(HttpServletResponse response, BussUserBucketDetail bussUserBucketDetail) {
/*  57 */     List<BussUserBucketDetail> list = this.bussUserBucketDetailService.selectBussUserBucketDetailList(bussUserBucketDetail);
/*  58 */     ExcelUtil<BussUserBucketDetail> util = new ExcelUtil(BussUserBucketDetail.class);
/*  59 */     util.exportExcel(response, list, "用户桶操作详情列表");
  }



  
  @PreAuthor("user:detail:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Long id) {
/*  68 */     return RestResult.ok().setData(this.bussUserBucketDetailService.selectBussUserBucketDetailById(id));
  }



  
  @Log(businessType = BusinessType.INSERT, title = "新增用户桶操作详情")
  @PreAuthor("user:detail:add")
  @PostMapping({"/add"})
  public RestResult add(@RequestBody BussUserBucketDetail bussUserBucketDetail) {
/*  78 */     int rows = this.bussUserBucketDetailService.insertBussUserBucketDetail(bussUserBucketDetail);
/*  79 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.UPDATE, title = "修改用户桶操作详情")
  @PreAuthor("user:detail:edit")
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody BussUserBucketDetail bussUserBucketDetail) {
/*  89 */     int rows = this.bussUserBucketDetailService.updateBussUserBucketDetail(bussUserBucketDetail);
/*  90 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.DELETE, title = "删除用户桶操作详情")
  @PreAuthor("user:detail:remove")
  @PostMapping({"/{ids}"})
  public RestResult remove(@PathVariable Long[] ids) {
/* 100 */     int rows = this.bussUserBucketDetailService.deleteBussUserBucketDetailByIds(ids);
/* 101 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket_nw\ctl\BussUserBucketDetailCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */