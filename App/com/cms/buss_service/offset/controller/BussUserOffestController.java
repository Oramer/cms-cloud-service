 package com.cms.buss_service.offset.controller;
 
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.offset.domain.BussUserOffest;
 import com.cms.buss_service.offset.service.BussUserOffestService;
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
 @RequestMapping({"/offest/info"})
 public class BussUserOffestController
   extends BaseController
 {
   @Autowired
   private BussUserOffestService bussUserOffestService;
   
   @PreAuthor("system:offest:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussUserOffest bussUserOffest) {
/* 45 */     startPage();
/* 46 */     List<BussUserOffest> list = this.bussUserOffestService.selectBussUserOffestList(bussUserOffest);
/* 47 */     return getDataTable(list);
   }
 
 
 
 
   
   @PreAuthor("system:offest:export")
   @Log(title = "用户抵用金", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussUserOffest bussUserOffest) {
/* 58 */     List<BussUserOffest> list = this.bussUserOffestService.selectBussUserOffestList(bussUserOffest);
/* 59 */     ExcelUtil<BussUserOffest> util = new ExcelUtil(BussUserOffest.class);
/* 60 */     util.exportExcel(response, list, "用户抵用金数据");
   }
 
 
 
   
   @PreAuthor("system:offest:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") String pk) {
/* 69 */     return RestResult.ok(this.bussUserOffestService.selectBussUserOffestById(pk));
   }
 
 
 
   
   @PreAuthor("system:offest:add")
   @Log(title = "用户抵用金", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussUserOffest bussUserOffest) {
/* 79 */     return toAjax(this.bussUserOffestService.insertBussUserOffest(bussUserOffest));
   }
 
 
 
   
   @PreAuthor("system:offest:edit")
   @Log(title = "用户抵用金", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussUserOffest bussUserOffest) {
/* 89 */     return toAjax(this.bussUserOffestService.updateBussUserOffest(bussUserOffest));
   }
 
 
 
   
   @PreAuthor("system:offest:remove")
   @Log(title = "用户抵用金", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable String[] pks) {
/* 99 */     return toAjax(this.bussUserOffestService.deleteBussUserOffestByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\offset\controller\BussUserOffestController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */