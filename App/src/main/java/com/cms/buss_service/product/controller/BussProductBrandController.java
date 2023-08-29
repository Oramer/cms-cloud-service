 package com.cms.buss_service.product.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.product.domain.BussProductBrand;
 import com.cms.buss_service.product.service.BussProductBrandService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/product/brand"})
 public class BussProductBrandController
   extends BaseController
 {
   @Autowired
   private BussProductBrandService bussProductBrandService;

   @PreAuthor("product:brand:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussProductBrand bussProductBrand) {
/* 38 */     startPage();
/* 39 */     List<BussProductBrand> list = this.bussProductBrandService.selectBussProductBrandList(bussProductBrand);
/* 40 */     return getDataTable(list);
   }





   @PreAuthor("product:brand:export")
   @Log(title = "产品品牌信息", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussProductBrand bussProductBrand) {
/* 51 */     List<BussProductBrand> list = this.bussProductBrandService.selectBussProductBrandList(bussProductBrand);
/* 52 */     ExcelUtil<BussProductBrand> util = new ExcelUtil(BussProductBrand.class);
/* 53 */     util.exportExcel(response, list, "产品品牌信息数据");
   }




   @PreAuthor("product:brand:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") Long pk) {
/* 62 */     return RestResult.ok(this.bussProductBrandService.selectBussProductBrandById(pk));
   }




   @PreAuthor("product:brand:add")
   @Log(title = "产品品牌信息", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussProductBrand bussProductBrand) {
/* 72 */     bussProductBrand.setStationId(SecurityUtils.getUserStationId());
/* 73 */     return toAjax(this.bussProductBrandService.insertBussProductBrand(bussProductBrand));
   }




   @PreAuthor("product:brand:edit")
   @Log(title = "产品品牌信息", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussProductBrand bussProductBrand) {
/* 83 */     return toAjax(this.bussProductBrandService.updateBussProductBrand(bussProductBrand));
   }




   @PreAuthor("product:brand:remove")
   @Log(title = "产品品牌信息", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable Long[] pks) {
/* 93 */     return toAjax(this.bussProductBrandService.deleteBussProductBrandByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\controller\BussProductBrandController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */