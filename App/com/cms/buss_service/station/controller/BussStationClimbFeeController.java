 package com.cms.buss_service.station.controller;

 import com.cms.base_service.annotation.DataScope;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.station.domain.BussStationClimbFee;
 import com.cms.buss_service.station.service.BussStationClimbFeeService;
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
 @RequestMapping({"/buss/fee"})
 public class BussStationClimbFeeController
   extends BaseController
 {
   @Autowired
   private BussStationClimbFeeService bussStationClimbFeeService;

   @DataScope
   @PreAuthor("system:fee:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussStationClimbFee bussStationClimbFee) {
/* 45 */     startPage();
/* 46 */     List<BussStationClimbFee> list = this.bussStationClimbFeeService.selectBussStationClimbFeeList(bussStationClimbFee);
/* 47 */     return getDataTable(list);
   }





   @PreAuthor("system:fee:export")
   @Log(title = "水站爬楼费用", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussStationClimbFee bussStationClimbFee) {
/* 58 */     List<BussStationClimbFee> list = this.bussStationClimbFeeService.selectBussStationClimbFeeList(bussStationClimbFee);
/* 59 */     ExcelUtil<BussStationClimbFee> util = new ExcelUtil(BussStationClimbFee.class);
/* 60 */     util.exportExcel(response, list, "水站爬楼费用数据");
   }




   @PreAuthor("system:fee:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") String pk) {
/* 69 */     return RestResult.ok(this.bussStationClimbFeeService.selectBussStationClimbFeeById(pk));
   }




   @PreAuthor("system:fee:add")
   @Log(title = "水站爬楼费用", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussStationClimbFee bussStationClimbFee) {
/* 79 */     return toAjax(this.bussStationClimbFeeService.insertBussStationClimbFee(bussStationClimbFee));
   }




   @PreAuthor("system:fee:edit")
   @Log(title = "水站爬楼费用", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussStationClimbFee bussStationClimbFee) {
/* 89 */     return toAjax(this.bussStationClimbFeeService.updateBussStationClimbFee(bussStationClimbFee));
   }




   @PreAuthor("system:fee:remove")
   @Log(title = "水站爬楼费用", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable String[] pks) {
/* 99 */     return toAjax(this.bussStationClimbFeeService.deleteBussStationClimbFeeByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\controller\BussStationClimbFeeController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */