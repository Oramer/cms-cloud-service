 package com.cms.buss_service.product_type.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.product_type.domain.BussProductType;
 import com.cms.buss_service.product_type.service.BussProductTypeService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/buss/product_type"})
 public class BussProductTypeController
   extends BaseController
 {
   @Autowired
   private BussProductTypeService bussProductTypeService;
   
   @GetMapping({"/list"})
   public TableDataInfo list(BussProductType bussProductType) {
/* 43 */     startPage();
/* 44 */     List<BussProductType> list = this.bussProductTypeService.selectBussProductTypeList(bussProductType);
/* 45 */     return getDataTable(list);
   }
 
 
 
 
 
   
   @Log(title = "产品品类信息", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussProductType bussProductType) {
/* 56 */     List<BussProductType> list = this.bussProductTypeService.selectBussProductTypeList(bussProductType);
/* 57 */     ExcelUtil<BussProductType> util = new ExcelUtil(BussProductType.class);
/* 58 */     util.exportExcel(response, list, "产品品类信息数据");
   }
 
 
 
 
   
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") String pk) {
/* 67 */     return RestResult.ok(this.bussProductTypeService.selectBussProductTypeById(pk));
   }
 
 
 
 
   
   @Log(title = "产品品类信息", businessType = BusinessType.INSERT)
   @PostMapping({"/insert"})
   public RestResult add(@RequestBody BussProductType bussProductType) {
/* 77 */     bussProductType.setStationId(SecurityUtils.getUserStationId());
/* 78 */     return toAjax(this.bussProductTypeService.insertBussProductType(bussProductType));
   }
 
 
 
 
   
   @Log(title = "产品品类信息", businessType = BusinessType.UPDATE)
   @PostMapping({"/update"})
   public RestResult edit(@RequestBody BussProductType bussProductType) {
/* 88 */     return toAjax(this.bussProductTypeService.updateBussProductType(bussProductType));
   }
 
 
 
 
   
   @Log(title = "产品品类信息", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable String[] pks) {
/* 98 */     return toAjax(this.bussProductTypeService.deleteBussProductTypeByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product_type\controller\BussProductTypeController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */