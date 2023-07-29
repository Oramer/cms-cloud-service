package com.cms.buss_service.product.controller;

import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.framework.aspectj.lang.annotation.DataScope;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.buss_service.product.domain.BussProductAdjustRecord;
import com.cms.buss_service.product.service.BussProductAdjustRecordService;
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
@RequestMapping({"/product/record"})
public class BussProductAdjustRecordController
  extends BaseController
{
  @Autowired
  private BussProductAdjustRecordService bussProductAdjustRecordService;
  
  @DataScope
  @PreAuthor("product:record:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussProductAdjustRecord bussProductAdjustRecord) {
/*  38 */     startPage();
/*  39 */     List<BussProductAdjustRecord> list = this.bussProductAdjustRecordService.selectBussProductAdjustRecordList(bussProductAdjustRecord);
/*  40 */     return getDataTable(list);
  }




  
  @DataScope
  @PreAuthor("product:record:export")
  @Log(title = "产品调价记录", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, BussProductAdjustRecord bussProductAdjustRecord) {
/*  52 */     List<BussProductAdjustRecord> list = this.bussProductAdjustRecordService.selectBussProductAdjustRecordList(bussProductAdjustRecord);
/*  53 */     ExcelUtil<BussProductAdjustRecord> util = new ExcelUtil(BussProductAdjustRecord.class);
/*  54 */     util.exportExcel(response, list, "产品调价记录数据");
  }



  
  @PreAuthor("product:record:query")
  @GetMapping({"/{pk}"})
  public RestResult getInfo(@PathVariable("pk") Long pk) {
/*  63 */     return RestResult.ok(this.bussProductAdjustRecordService.selectBussProductAdjustRecordById(pk));
  }



  
  @PreAuthor("product:record:add")
  @Log(title = "产品调价记录", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody BussProductAdjustRecord bussProductAdjustRecord) {
/*  73 */     return toAjax(this.bussProductAdjustRecordService.insertBussProductAdjustRecord(bussProductAdjustRecord));
  }

  
  @PreAuthor("product:record:adjust")
  @Log(title = "产品批量调价", businessType = BusinessType.INSERT)
  @PostMapping({"/adjust"})
  public RestResult batchadd(@RequestBody List<BussProductAdjustRecord> bis) {
/*  81 */     if (bis != null && bis.size() > 0) {
/*  82 */       bis.forEach(it -> this.bussProductAdjustRecordService.insertBussProductAdjustRecord(it));

      
/*  85 */       return toAjax(bis.size());
    } 
/*  87 */     return toAjax(false);
  }




  
  @PreAuthor("product:record:edit")
  @Log(title = "产品调价记录", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@RequestBody BussProductAdjustRecord bussProductAdjustRecord) {
/*  98 */     return toAjax(this.bussProductAdjustRecordService.updateBussProductAdjustRecord(bussProductAdjustRecord));
  }



  
  @PreAuthor("product:record:remove")
  @Log(title = "产品调价记录", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{pks}"})
  public RestResult remove(@PathVariable Long[] pks) {
/* 108 */     return toAjax(this.bussProductAdjustRecordService.deleteBussProductAdjustRecordByIds(pks));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\controller\BussProductAdjustRecordController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */