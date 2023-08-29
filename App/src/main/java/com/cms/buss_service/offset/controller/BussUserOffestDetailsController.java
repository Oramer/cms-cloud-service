 package com.cms.buss_service.offset.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.offset.domain.BussUserOffestDetails;
 import com.cms.buss_service.offset.service.BussUserOffestDetailsService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/offest/details"})
 public class BussUserOffestDetailsController
   extends BaseController
 {
   @Autowired
   private BussUserOffestDetailsService bussUserOffestDetailsService;
   
   @PreAuthor("system:details:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussUserOffestDetails bussUserOffestDetails) {
/* 45 */     startPage();
/* 46 */     List<BussUserOffestDetails> list = this.bussUserOffestDetailsService.selectBussUserOffestDetailsList(bussUserOffestDetails);
/* 47 */     return getDataTable(list);
   }
 
 
 
 
   
   @PreAuthor("system:details:export")
   @Log(title = "抵用金明细信息", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussUserOffestDetails bussUserOffestDetails) {
/* 58 */     List<BussUserOffestDetails> list = this.bussUserOffestDetailsService.selectBussUserOffestDetailsList(bussUserOffestDetails);
/* 59 */     ExcelUtil<BussUserOffestDetails> util = new ExcelUtil(BussUserOffestDetails.class);
/* 60 */     util.exportExcel(response, list, "抵用金明细信息数据");
   }
 
 
 
   
   @PreAuthor("system:details:query")
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") Long id) {
/* 69 */     return RestResult.ok(this.bussUserOffestDetailsService.selectBussUserOffestDetailsById(id));
   }
 
 
 
   
   @PreAuthor("system:details:add")
   @Log(title = "抵用金明细信息", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussUserOffestDetails bussUserOffestDetails) {
/* 79 */     return toAjax(this.bussUserOffestDetailsService.insertBussUserOffestDetails(bussUserOffestDetails));
   }
 
 
 
   
   @PreAuthor("system:details:edit")
   @Log(title = "抵用金明细信息", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussUserOffestDetails bussUserOffestDetails) {
/* 89 */     return toAjax(this.bussUserOffestDetailsService.updateBussUserOffestDetails(bussUserOffestDetails));
   }
 
 
 
   
   @PreAuthor("system:details:remove")
   @Log(title = "抵用金明细信息", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{ids}"})
   public RestResult remove(@PathVariable Long[] ids) {
/* 99 */     return toAjax(this.bussUserOffestDetailsService.deleteBussUserOffestDetailsByIds(ids));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\offset\controller\BussUserOffestDetailsController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */