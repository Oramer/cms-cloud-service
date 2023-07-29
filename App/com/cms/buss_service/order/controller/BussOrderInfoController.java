 package com.cms.buss_service.order.controller;

 import com.cms.base_service.annotation.DataScope;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.order.domain.BussOrderInfo;
 import com.cms.buss_service.order.service.BussOrderInfoService;
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
 @RequestMapping({"/order/info"})
 public class BussOrderInfoController
   extends BaseController
 {
   @Autowired
   private BussOrderInfoService bussOrderInfoService;

   @DataScope
   @PreAuthor("order:info:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussOrderInfo bussOrderInfo) {
/* 40 */     startPage();
/* 41 */     List<BussOrderInfo> list = this.bussOrderInfoService.selectBussOrderInfoList(bussOrderInfo);
/* 42 */     return getDataTable(list);
   }





   @PreAuthor("order:info:export")
   @Log(title = "订单信息", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussOrderInfo bussOrderInfo) {
/* 53 */     List<BussOrderInfo> list = this.bussOrderInfoService.selectBussOrderInfoList(bussOrderInfo);
/* 54 */     ExcelUtil<BussOrderInfo> util = new ExcelUtil(BussOrderInfo.class);
/* 55 */     util.exportExcel(response, list, "订单信息数据");
   }




   @PreAuthor("order:info:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") String pk) {
/* 64 */     return RestResult.ok(this.bussOrderInfoService.selectBussOrderInfoById(pk));
   }




   @PreAuthor("order:info:add")
   @Log(title = "订单信息", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussOrderInfo bussOrderInfo) {
/* 74 */     return toAjax(this.bussOrderInfoService.insertBussOrderInfo(bussOrderInfo));
   }




   @PreAuthor("order:info:edit")
   @Log(title = "订单信息", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussOrderInfo bussOrderInfo) {
/* 84 */     return toAjax(this.bussOrderInfoService.updateBussOrderInfo(bussOrderInfo));
   }




   @PreAuthor("order:info:remove")
   @Log(title = "订单信息", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable String[] pks) {
/* 94 */     return toAjax(this.bussOrderInfoService.deleteBussOrderInfoByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\controller\BussOrderInfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */