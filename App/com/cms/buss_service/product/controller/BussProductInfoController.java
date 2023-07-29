 package com.cms.buss_service.product.controller;

 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.product.domain.BussProductInfo;
 import com.cms.buss_service.product.service.BussProductInfoService;
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
 @RequestMapping({"/product/info"})
 public class BussProductInfoController
   extends BaseController
 {
   @Autowired
   private BussProductInfoService bussProductInfoService;

   @PreAuthor("product:info:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussProductInfo bussProductInfo) {
/* 39 */     startPage();
/* 40 */     List<BussProductInfo> list = this.bussProductInfoService.selectBussProductInfoList(bussProductInfo);
/* 41 */     return getDataTable(list);
   }




   @PreAuthor("product:info:export")
   @Log(title = "产品信息", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussProductInfo bussProductInfo) {
/* 51 */     List<BussProductInfo> list = this.bussProductInfoService.selectBussProductInfoList(bussProductInfo);
/* 52 */     ExcelUtil<BussProductInfo> util = new ExcelUtil(BussProductInfo.class);
/* 53 */     util.exportExcel(response, list, "产品信息数据");
   }




   @PreAuthor("product:info:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") String pk) {
/* 62 */     return RestResult.ok(this.bussProductInfoService.selectBussProductInfoById(pk));
   }




   @PreAuthor("product:info:add")
   @Log(title = "产品信息", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussProductInfo bussProductInfo) {
/* 72 */     bussProductInfo.setStationId(SecurityUtils.getUserStationId());
/* 73 */     return toAjax(this.bussProductInfoService.insertBussProductInfo(bussProductInfo));
   }




   @PreAuthor("product:info:edit")
   @Log(title = "产品信息", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussProductInfo bussProductInfo) {
/* 83 */     return toAjax(this.bussProductInfoService.updateBussProductInfo(bussProductInfo));
   }




   @PreAuthor("product:info:remove")
   @Log(title = "产品信息", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable String[] pks) {
/* 93 */     return toAjax(this.bussProductInfoService.deleteBussProductInfoByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\controller\BussProductInfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */