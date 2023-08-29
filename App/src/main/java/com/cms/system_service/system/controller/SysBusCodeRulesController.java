 package com.cms.system_service.system.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.system_service.system.domain.SysBusCodeRules;
 import com.cms.system_service.system.service.SysBusCodeRulesService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/rules"})
 public class SysBusCodeRulesController
   extends BaseController
 {
   @Autowired
   private SysBusCodeRulesService sysBusCodeRulesService;
   
   @PreAuthor("system:rules:list")
   @GetMapping({"/list"})
   public TableDataInfo list(SysBusCodeRules sysBusCodeRules) {
/* 43 */     startPage();
/* 44 */     List<SysBusCodeRules> list = this.sysBusCodeRulesService.selectSysBusCodeRulesList(sysBusCodeRules);
/* 45 */     return getDataTable(list);
   }
 
 
 
   
   @PreAuthor("system:rules:export")
   @Log(title = "外部单据规则", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, SysBusCodeRules sysBusCodeRules) {
/* 55 */     List<SysBusCodeRules> list = this.sysBusCodeRulesService.selectSysBusCodeRulesList(sysBusCodeRules);
/* 56 */     ExcelUtil<SysBusCodeRules> util = new ExcelUtil(SysBusCodeRules.class);
/* 57 */     util.exportExcel(response, list, "外部单据规则数据");
   }
 
 
 
   
   @PreAuthor("system:rules:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") String pk) {
/* 66 */     return RestResult.ok(this.sysBusCodeRulesService.selectSysBusCodeRulesById(pk));
   }
 
 
 
   
   @PreAuthor("system:rules:add")
   @Log(title = "外部单据规则", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody SysBusCodeRules sysBusCodeRules) {
/* 76 */     return toAjax(this.sysBusCodeRulesService.insertSysBusCodeRules(sysBusCodeRules));
   }
 
 
 
   
   @PreAuthor("system:rules:edit")
   @Log(title = "外部单据规则", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody SysBusCodeRules sysBusCodeRules) {
/* 86 */     return toAjax(this.sysBusCodeRulesService.updateSysBusCodeRules(sysBusCodeRules));
   }
 
 
 
   
   @PreAuthor("system:rules:remove")
   @Log(title = "外部单据规则", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable String[] pks) {
/* 96 */     return toAjax(this.sysBusCodeRulesService.deleteSysBusCodeRulesByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysBusCodeRulesController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */