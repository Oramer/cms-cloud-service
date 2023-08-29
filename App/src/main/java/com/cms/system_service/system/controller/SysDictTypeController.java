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
import com.cms.system_service.system.domain.SysDictType;
import com.cms.system_service.system.service.ISysDictTypeService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping({"/system/dict/type"})
public class SysDictTypeController
  extends BaseController
{
  @Autowired
  private ISysDictTypeService dictTypeService;

  @PreAuthor("system:dict:list")
  @GetMapping({"/list"})
  public TableDataInfo list(SysDictType dictType) {
/*  41 */     startPage();
/*  42 */     List<SysDictType> list = this.dictTypeService.selectDictTypeList(dictType);
/*  43 */     return getDataTable(list);
  }

  @Log(title = "字典类型", businessType = BusinessType.EXPORT)
  @PreAuthor("system:dict:export")
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, SysDictType dictType) {
/*  50 */     List<SysDictType> list = this.dictTypeService.selectDictTypeList(dictType);
/*  51 */     ExcelUtil<SysDictType> util = new ExcelUtil(SysDictType.class);
/*  52 */     util.exportExcel(response, list, "字典类型");
  }




  @PreAuthor("system:dict:query")
  @GetMapping({"/{dictId}"})
  public RestResult getInfo(@PathVariable Long dictId) {
/*  61 */     return RestResult.ok(this.dictTypeService.selectDictTypeById(dictId));
  }




  @PreAuthor("system:dict:add")
  @Log(title = "字典类型", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@Validated @RequestBody SysDictType dict) {
/*  71 */     if ("1".equals(this.dictTypeService.checkDictTypeUnique(dict))) {
/*  72 */       return RestResult.fail("新增字典'" + dict.getDictName() + "'失败，字典类型已存在");
    }
/*  74 */     dict.setCreateBy(getUsername());
/*  75 */     return toAjax(this.dictTypeService.insertDictType(dict));
  }




  @PreAuthor("system:dict:edit")
  @Log(title = "字典类型", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@Validated @RequestBody SysDictType dict) {
/*  85 */     if ("1".equals(this.dictTypeService.checkDictTypeUnique(dict))) {
/*  86 */       return RestResult.fail("修改字典'" + dict.getDictName() + "'失败，字典类型已存在");
    }
/*  88 */     dict.setUpdateBy(getUsername());
/*  89 */     return toAjax(this.dictTypeService.updateDictType(dict));
  }




  @PreAuthor("system:dict:remove")
  @Log(title = "字典类型", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{dictIds}"})
  public RestResult remove(@PathVariable Long[] dictIds) {
/*  99 */     this.dictTypeService.deleteDictTypeByIds(dictIds);
/* 100 */     return success();
  }




  @PreAuthor("system:dict:remove")
  @Log(title = "字典类型", businessType = BusinessType.CLEAN)
  @DeleteMapping({"/refreshCache"})
  public RestResult refreshCache() {
/* 110 */     this.dictTypeService.resetDictCache();
/* 111 */     return RestResult.ok();
  }




  @GetMapping({"/optionselect"})
  public RestResult optionselect() {
/* 119 */     List<SysDictType> dictTypes = this.dictTypeService.selectDictTypeAll();
/* 120 */     return RestResult.ok(dictTypes);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysDictTypeController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */