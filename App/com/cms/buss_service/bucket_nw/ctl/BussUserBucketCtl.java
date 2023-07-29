package com.cms.buss_service.bucket_nw.ctl;

import com.cms.base_service.annotation.BusinessType;
import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.Log;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.buss_service.bucket_nw.domain.BussUserBucket;
import com.cms.buss_service.bucket_nw.service.BussUserBucketService;
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
@RequestMapping({"/user/bucket"})
public class BussUserBucketCtl
  extends BaseCtl
{
  @Autowired
  private BussUserBucketService bussUserBucketService;
  
  @DataScope
  @PreAuthor("user:bucket:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussUserBucket bussUserBucket) {
/*  46 */     startPage();
/*  47 */     List<BussUserBucket> list = this.bussUserBucketService.selectBussUserBucketList(bussUserBucket);
/*  48 */     return getDataTable(list);
  }



  
  @Log(businessType = BusinessType.EXPORT, title = "导出用户桶信息列表")
  @PreAuthor("user:bucket:export")
  @GetMapping({"/export"})
  public void export(HttpServletResponse response, BussUserBucket bussUserBucket) {
/*  58 */     List<BussUserBucket> list = this.bussUserBucketService.selectBussUserBucketList(bussUserBucket);
/*  59 */     ExcelUtil<BussUserBucket> util = new ExcelUtil(BussUserBucket.class);
/*  60 */     util.exportExcel(response, list, "用户桶信息列表");
  }



  
  @PreAuthor("user:bucket:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Long id) {
/*  69 */     return RestResult.ok().setData(this.bussUserBucketService.selectBussUserBucketById(id));
  }



  
  @Log(businessType = BusinessType.INSERT, title = "新增用户桶信息")
  @PreAuthor("user:bucket:add")
  @PostMapping({"/add"})
  public RestResult add(@RequestBody BussUserBucket bussUserBucket) {
/*  79 */     int rows = this.bussUserBucketService.insertBussUserBucket(bussUserBucket);
/*  80 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.UPDATE, title = "修改用户桶信息")
  @PreAuthor("user:bucket:edit")
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody BussUserBucket bussUserBucket) {
/*  90 */     int rows = this.bussUserBucketService.updateBussUserBucket(bussUserBucket);
/*  91 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }



  
  @Log(businessType = BusinessType.DELETE, title = "删除用户桶信息")
  @PreAuthor("user:bucket:remove")
  @PostMapping({"/{ids}"})
  public RestResult remove(@PathVariable Long[] ids) {
/* 101 */     int rows = this.bussUserBucketService.deleteBussUserBucketByIds(ids);
/* 102 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket_nw\ctl\BussUserBucketCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */