 package com.cms.buss_service.poster.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.poster.domain.BussPosterDistanceDeduct;
 import com.cms.buss_service.poster.service.BussPosterDistanceDeductService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/buss/deduct"})
 public class BussPosterDistanceDeductController
   extends BaseController
 {
   @Autowired
   private BussPosterDistanceDeductService bussPosterDistanceDeductService;

   @PreAuthor("buss:deduct:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussPosterDistanceDeduct bussPosterDistanceDeduct) {
/* 43 */     startPage();
/* 44 */     List<BussPosterDistanceDeduct> list = this.bussPosterDistanceDeductService.selectBussPosterDistanceDeductList(bussPosterDistanceDeduct);
/* 45 */     return getDataTable(list);
   }





   @PreAuthor("buss:deduct:export")
   @Log(title = "配送员距离提成", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussPosterDistanceDeduct bussPosterDistanceDeduct) {
/* 56 */     List<BussPosterDistanceDeduct> list = this.bussPosterDistanceDeductService.selectBussPosterDistanceDeductList(bussPosterDistanceDeduct);
/* 57 */     ExcelUtil<BussPosterDistanceDeduct> util = new ExcelUtil(BussPosterDistanceDeduct.class);
/* 58 */     util.exportExcel(response, list, "配送员距离提成数据");
   }




   @PreAuthor("buss:deduct:query")
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") Long id) {
/* 67 */     return RestResult.ok(this.bussPosterDistanceDeductService.selectBussPosterDistanceDeductById(id));
   }




   @PreAuthor("buss:deduct:add")
   @Log(title = "配送员距离提成", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussPosterDistanceDeduct bussPosterDistanceDeduct) {
/* 77 */     return toAjax(this.bussPosterDistanceDeductService.insertBussPosterDistanceDeduct(bussPosterDistanceDeduct));
   }




   @PreAuthor("buss:deduct:edit")
   @Log(title = "配送员距离提成", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussPosterDistanceDeduct bussPosterDistanceDeduct) {
/* 87 */     return toAjax(this.bussPosterDistanceDeductService.updateBussPosterDistanceDeduct(bussPosterDistanceDeduct));
   }




   @PreAuthor("buss:deduct:remove")
   @Log(title = "配送员距离提成", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{ids}"})
   public RestResult remove(@PathVariable Long[] ids) {
/* 97 */     return toAjax(this.bussPosterDistanceDeductService.deleteBussPosterDistanceDeductByIds(ids));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\controller\BussPosterDistanceDeductController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */