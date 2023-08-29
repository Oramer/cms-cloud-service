 package com.cms.buss_service.poster.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.annotation.DataScope;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.poster.domain.BussStationPoster;
 import com.cms.buss_service.poster.service.BussStationPosterService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/buss/poster"})
 public class BussStationPosterController
   extends BaseController
 {
   @Autowired
   private BussStationPosterService bussStationPosterService;

   @DataScope
   @PreAuthor("buss:poster:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussStationPoster bussStationPoster) {
/* 45 */     startPage();
/* 46 */     List<BussStationPoster> list = this.bussStationPosterService.selectBussStationPosterList(bussStationPoster);
/* 47 */     return getDataTable(list);
   }





   @PreAuthor("buss:poster:export")
   @Log(title = "配送员信息主", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussStationPoster bussStationPoster) {
/* 58 */     List<BussStationPoster> list = this.bussStationPosterService.selectBussStationPosterList(bussStationPoster);
/* 59 */     ExcelUtil<BussStationPoster> util = new ExcelUtil(BussStationPoster.class);
/* 60 */     util.exportExcel(response, list, "配送员信息主数据");
   }




   @PreAuthor("buss:poster:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") String pk) {
/* 69 */     return RestResult.ok(this.bussStationPosterService.selectBussStationPosterById(pk));
   }




   @PreAuthor("buss:poster:add")
   @Log(title = "配送员信息主", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussStationPoster bussStationPoster) {
/* 79 */     return toAjax(this.bussStationPosterService.insertBussStationPoster(bussStationPoster));
   }




   @PreAuthor("buss:poster:edit")
   @Log(title = "配送员信息主", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussStationPoster bussStationPoster) {
/* 89 */     return toAjax(this.bussStationPosterService.updateBussStationPoster(bussStationPoster));
   }




   @PreAuthor("buss:poster:remove")
   @Log(title = "配送员信息主", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable String[] pks) {
/* 99 */     return toAjax(this.bussStationPosterService.deleteBussStationPosterByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\controller\BussStationPosterController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */