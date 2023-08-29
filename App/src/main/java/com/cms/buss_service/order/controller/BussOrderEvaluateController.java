 package com.cms.buss_service.order.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.order.domain.BussOrderEvaluate;
 import com.cms.buss_service.order.service.BussOrderEvaluateService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/order/evaluate"})
 public class BussOrderEvaluateController
   extends BaseController
 {
   @Autowired
   private BussOrderEvaluateService bussOrderEvaluateService;
   
   @PreAuthor("order:evaluate:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussOrderEvaluate bussOrderEvaluate) {
/* 38 */     startPage();
/* 39 */     List<BussOrderEvaluate> list = this.bussOrderEvaluateService.selectBussOrderEvaluateList(bussOrderEvaluate);
/* 40 */     return getDataTable(list);
   }
 
 
 
 
   
   @PreAuthor("order:evaluate:export")
   @Log(title = "订单评价", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussOrderEvaluate bussOrderEvaluate) {
/* 51 */     List<BussOrderEvaluate> list = this.bussOrderEvaluateService.selectBussOrderEvaluateList(bussOrderEvaluate);
/* 52 */     ExcelUtil<BussOrderEvaluate> util = new ExcelUtil(BussOrderEvaluate.class);
/* 53 */     util.exportExcel(response, list, "订单评价数据");
   }
 
 
 
   
   @PreAuthor("order:evaluate:query")
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") Long id) {
/* 62 */     return RestResult.ok(this.bussOrderEvaluateService.selectBussOrderEvaluateById(id));
   }
 
 
 
   
   @PreAuthor("order:evaluate:add")
   @Log(title = "订单评价", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussOrderEvaluate bussOrderEvaluate) {
/* 72 */     return toAjax(this.bussOrderEvaluateService.insertBussOrderEvaluate(bussOrderEvaluate));
   }
 
 
 
   
   @PreAuthor("order:evaluate:edit")
   @Log(title = "订单评价", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussOrderEvaluate bussOrderEvaluate) {
/* 82 */     return toAjax(this.bussOrderEvaluateService.updateBussOrderEvaluate(bussOrderEvaluate));
   }
 
 
 
   
   @PreAuthor("order:evaluate:remove")
   @Log(title = "订单评价", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{ids}"})
   public RestResult remove(@PathVariable Long[] ids) {
/* 92 */     return toAjax(this.bussOrderEvaluateService.deleteBussOrderEvaluateByIds(ids));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\controller\BussOrderEvaluateController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */