package com.cms.system_service.system.controller;

import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.system_service.system.domain.SysDictData;
import com.cms.system_service.system.service.ISysDictDataService;
import com.cms.system_service.system.service.ISysDictTypeService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping({"/system/dict/data"})
public class SysDictDataController
  extends BaseController
{
  @Autowired
  private ISysDictDataService dictDataService;
  @Autowired
  private ISysDictTypeService dictTypeService;
  
  @PreAuthor("system:dict:list")
  @GetMapping({"/list"})
  public TableDataInfo list(SysDictData dictData) {
/*  46 */     startPage();
/*  47 */     List<SysDictData> list = this.dictDataService.selectDictDataList(dictData);
/*  48 */     return getDataTable(list);
  }
  
  @Log(title = "字典数据", businessType = BusinessType.EXPORT)
  @PreAuthor("system:dict:export")
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, SysDictData dictData) {
/*  55 */     List<SysDictData> list = this.dictDataService.selectDictDataList(dictData);
/*  56 */     ExcelUtil<SysDictData> util = new ExcelUtil(SysDictData.class);
/*  57 */     util.exportExcel(response, list, "字典数据");
  }



  
  @PreAuthor("system:dict:query")
  @GetMapping({"/{dictCode}"})
  public RestResult getInfo(@PathVariable Long dictCode) {
/*  66 */     return RestResult.ok(this.dictDataService.selectDictDataById(dictCode));
  }



  
  @GetMapping({"/type/{dictType}"})
  public RestResult dictType(@PathVariable String dictType) {
/*  74 */     List<SysDictData> data = this.dictTypeService.selectDictDataByType(dictType);
/*  75 */     if (StringUtils.isNull(data)) {
/*  76 */       data = new ArrayList<>();
    }
/*  78 */     return RestResult.ok(data);
  }



  
  @PreAuthor("system:dict:add")
  @Log(title = "字典数据", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@Validated @RequestBody SysDictData dict) {
/*  88 */     dict.setCreateBy(getUsername());
/*  89 */     return toAjax(this.dictDataService.insertDictData(dict));
  }



  
  @PreAuthor("system:dict:edit")
  @Log(title = "字典数据", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@Validated @RequestBody SysDictData dict) {
/*  99 */     dict.setUpdateBy(getUsername());
/* 100 */     return toAjax(this.dictDataService.updateDictData(dict));
  }



  
  @PreAuthor("system:dict:remove")
  @Log(title = "字典类型", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{dictCodes}"})
  public RestResult remove(@PathVariable Long[] dictCodes) {
/* 110 */     this.dictDataService.deleteDictDataByIds(dictCodes);
/* 111 */     return success();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysDictDataController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */