 package com.cms.buss_service.invoice.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.invoice.domain.BussUserInvoiceRecordDetails;
 import com.cms.buss_service.invoice.service.BussUserInvoiceRecordDetailsService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/system/details"})
 public class BussUserInvoiceRecordDetailsController
   extends BaseController
 {
   @Autowired
   private BussUserInvoiceRecordDetailsService bussUserInvoiceRecordDetailsService;
   
   @PreAuthor("system:details:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussUserInvoiceRecordDetails bussUserInvoiceRecordDetails) {
/* 45 */     startPage();
/* 46 */     List<BussUserInvoiceRecordDetails> list = this.bussUserInvoiceRecordDetailsService.selectBussUserInvoiceRecordDetailsList(bussUserInvoiceRecordDetails);
/* 47 */     return getDataTable(list);
   }
 
 
 
 
   
   @PreAuthor("system:details:export")
   @Log(title = "订单开票明细信息", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussUserInvoiceRecordDetails bussUserInvoiceRecordDetails) {
/* 58 */     List<BussUserInvoiceRecordDetails> list = this.bussUserInvoiceRecordDetailsService.selectBussUserInvoiceRecordDetailsList(bussUserInvoiceRecordDetails);
/* 59 */     ExcelUtil<BussUserInvoiceRecordDetails> util = new ExcelUtil(BussUserInvoiceRecordDetails.class);
/* 60 */     util.exportExcel(response, list, "订单开票明细信息数据");
   }
 
 
 
   
   @PreAuthor("system:details:query")
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") Long id) {
/* 69 */     return RestResult.ok(this.bussUserInvoiceRecordDetailsService.selectBussUserInvoiceRecordDetailsById(id));
   }
 
 
 
   
   @PreAuthor("system:details:add")
   @Log(title = "订单开票明细信息", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussUserInvoiceRecordDetails bussUserInvoiceRecordDetails) {
/* 79 */     return toAjax(this.bussUserInvoiceRecordDetailsService.insertBussUserInvoiceRecordDetails(bussUserInvoiceRecordDetails));
   }
 
 
 
   
   @PreAuthor("system:details:edit")
   @Log(title = "订单开票明细信息", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussUserInvoiceRecordDetails bussUserInvoiceRecordDetails) {
/* 89 */     return toAjax(this.bussUserInvoiceRecordDetailsService.updateBussUserInvoiceRecordDetails(bussUserInvoiceRecordDetails));
   }
 
 
 
   
   @PreAuthor("system:details:remove")
   @Log(title = "订单开票明细信息", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{ids}"})
   public RestResult remove(@PathVariable Long[] ids) {
/* 99 */     return toAjax(this.bussUserInvoiceRecordDetailsService.deleteBussUserInvoiceRecordDetailsByIds(ids));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\controller\BussUserInvoiceRecordDetailsController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */