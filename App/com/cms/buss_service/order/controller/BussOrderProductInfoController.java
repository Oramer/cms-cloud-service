 package com.cms.buss_service.order.controller;

 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.order.domain.BussOrderProductInfo;
 import com.cms.buss_service.order.service.BussOrderProductInfoService;
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
 @RequestMapping({"/order/product_info"})
 public class BussOrderProductInfoController
   extends BaseController
 {
   @Autowired
   private BussOrderProductInfoService bussOrderProductInfoService;

   @PreAuthor("order:product_info:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussOrderProductInfo bussOrderProductInfo) {
/* 38 */     startPage();
/* 39 */     List<BussOrderProductInfo> list = this.bussOrderProductInfoService.selectBussOrderProductInfoList(bussOrderProductInfo);
/* 40 */     return getDataTable(list);
   }





   @PreAuthor("order:product_info:export")
   @Log(title = "订单产品信息(子)", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussOrderProductInfo bussOrderProductInfo) {
/* 51 */     List<BussOrderProductInfo> list = this.bussOrderProductInfoService.selectBussOrderProductInfoList(bussOrderProductInfo);
/* 52 */     ExcelUtil<BussOrderProductInfo> util = new ExcelUtil(BussOrderProductInfo.class);
/* 53 */     util.exportExcel(response, list, "订单产品信息(子)数据");
   }




   @PreAuthor("order:product_info:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") Long pk) {
/* 62 */     return RestResult.ok(this.bussOrderProductInfoService.selectBussOrderProductInfoById(pk));
   }




   @PreAuthor("order:product_info:add")
   @Log(title = "订单产品信息(子)", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussOrderProductInfo bussOrderProductInfo) {
/* 72 */     return toAjax(this.bussOrderProductInfoService.insertBussOrderProductInfo(bussOrderProductInfo));
   }




   @PreAuthor("order:product_info:edit")
   @Log(title = "订单产品信息(子)", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussOrderProductInfo bussOrderProductInfo) {
/* 82 */     return toAjax(this.bussOrderProductInfoService.updateBussOrderProductInfo(bussOrderProductInfo));
   }




   @PreAuthor("order:product_info:remove")
   @Log(title = "订单产品信息(子)", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable Long[] pks) {
/* 92 */     return toAjax(this.bussOrderProductInfoService.deleteBussOrderProductInfoByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\controller\BussOrderProductInfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */