 package com.cms.buss_service.order.controller;
 
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.order.domain.BussOrderAppraise;
 import com.cms.buss_service.order.service.BussOrderAppraiseService;
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
 @RequestMapping({"/order/appraise"})
 public class BussOrderAppraiseController
   extends BaseController
 {
   @Autowired
   private BussOrderAppraiseService bussOrderAppraiseService;
   
   @PreAuthor("order:appraise:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussOrderAppraise bussOrderAppraise) {
/* 44 */     startPage();
/* 45 */     List<BussOrderAppraise> list = this.bussOrderAppraiseService.selectBussOrderAppraiseList(bussOrderAppraise);
/* 46 */     return getDataTable(list);
   }
 
 
 
 
   
   @PreAuthor("order:appraise:export")
   @Log(title = "订单产品评价", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussOrderAppraise bussOrderAppraise) {
/* 57 */     List<BussOrderAppraise> list = this.bussOrderAppraiseService.selectBussOrderAppraiseList(bussOrderAppraise);
/* 58 */     ExcelUtil<BussOrderAppraise> util = new ExcelUtil(BussOrderAppraise.class);
/* 59 */     util.exportExcel(response, list, "订单产品评价数据");
   }
 
 
 
   
   @PreAuthor("order:appraise:query")
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") Long id) {
/* 68 */     return RestResult.ok(this.bussOrderAppraiseService.selectBussOrderAppraiseById(id));
   }
 
 
 
   
   @PreAuthor("order:appraise:add")
   @Log(title = "订单产品评价", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussOrderAppraise bussOrderAppraise) {
/* 78 */     return toAjax(this.bussOrderAppraiseService.insertBussOrderAppraise(bussOrderAppraise));
   }
 
 
 
   
   @PreAuthor("order:appraise:edit")
   @Log(title = "订单产品评价", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussOrderAppraise bussOrderAppraise) {
/* 88 */     return toAjax(this.bussOrderAppraiseService.updateBussOrderAppraise(bussOrderAppraise));
   }
 
 
 
   
   @PreAuthor("order:appraise:remove")
   @Log(title = "订单产品评价", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{ids}"})
   public RestResult remove(@PathVariable Long[] ids) {
/* 98 */     return toAjax(this.bussOrderAppraiseService.deleteBussOrderAppraiseByIds(ids));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\controller\BussOrderAppraiseController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */