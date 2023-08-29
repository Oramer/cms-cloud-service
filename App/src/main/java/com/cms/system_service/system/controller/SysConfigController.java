package com.cms.system_service.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.system_service.system.domain.SysConfig;
import com.cms.system_service.system.service.ISysConfigService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping({"/system/config"})
public class SysConfigController
  extends BaseController
{
  @Autowired
  private ISysConfigService configService;
  
  @PreAuthor("system:config:list")
  @GetMapping({"/list"})
  public TableDataInfo list(SysConfig config) {
/*  44 */     startPage();
/*  45 */     List<SysConfig> list = this.configService.selectConfigList(config);
/*  46 */     return getDataTable(list);
  }
  
  @Log(title = "参数管理", businessType = BusinessType.EXPORT)
  @PreAuthor("system:config:export")
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, SysConfig config) {
/*  53 */     List<SysConfig> list = this.configService.selectConfigList(config);
/*  54 */     ExcelUtil<SysConfig> util = new ExcelUtil(SysConfig.class);
/*  55 */     util.exportExcel(response, list, "参数数据");
  }



  
  @PreAuthor("system:config:query")
  @GetMapping({"/{configId}"})
  public RestResult getInfo(@PathVariable Long configId) {
/*  64 */     return RestResult.ok(this.configService.selectConfigById(configId));
  }



  
  @GetMapping({"/configKey/{configKey}"})
  public RestResult getConfigKey(@PathVariable String configKey) {
/*  72 */     return RestResult.ok(this.configService.selectConfigByKey(configKey));
  }



  
  @PreAuthor("system:config:add")
  @Log(title = "参数管理", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@Validated @RequestBody SysConfig config) {
/*  82 */     if ("1".equals(this.configService.checkConfigKeyUnique(config))) {
/*  83 */       return RestResult.fail("新增参数'" + config.getConfigName() + "'失败，参数键名已存在");
    }
/*  85 */     config.setCreateBy(getUsername());
/*  86 */     return toAjax(this.configService.insertConfig(config));
  }



  
  @PreAuthor("system:config:edit")
  @Log(title = "参数管理", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@Validated @RequestBody SysConfig config) {
/*  96 */     if ("1".equals(this.configService.checkConfigKeyUnique(config))) {
/*  97 */       return RestResult.fail("修改参数'" + config.getConfigName() + "'失败，参数键名已存在");
    }
/*  99 */     config.setUpdateBy(getUsername());
/* 100 */     return toAjax(this.configService.updateConfig(config));
  }



  
  @PreAuthor("system:config:remove")
  @Log(title = "参数管理", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{configIds}"})
  public RestResult remove(@PathVariable Long[] configIds) {
/* 110 */     this.configService.deleteConfigByIds(configIds);
/* 111 */     return success();
  }



  
  @PreAuthor("system:config:remove")
  @Log(title = "参数管理", businessType = BusinessType.CLEAN)
  @DeleteMapping({"/refreshCache"})
  public RestResult refreshCache() {
/* 121 */     this.configService.resetConfigCache();
/* 122 */     return RestResult.ok();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysConfigController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */