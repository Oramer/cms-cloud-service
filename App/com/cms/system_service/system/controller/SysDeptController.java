package com.cms.system_service.system.controller;

import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.system_service.system.domain.SysDept;
import com.cms.system_service.system.service.ISysDeptService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
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
@RequestMapping({"/system/dept"})
public class SysDeptController
  extends BaseController
{
  @Autowired
  private ISysDeptService deptService;
  
  @PreAuthor("system:dept:list")
  @GetMapping({"/list"})
  public RestResult list(SysDept dept) {
/*  45 */     List<SysDept> depts = this.deptService.selectDeptList(dept);
/*  46 */     return RestResult.ok(depts);
  }



  
  @PreAuthor("system:dept:list")
  @GetMapping({"/list/exclude/{deptId}"})
  public RestResult excludeChild(@PathVariable(value = "deptId", required = false) String deptId) {
/*  55 */     List<SysDept> depts = this.deptService.selectDeptList(new SysDept());
/*  56 */     Iterator<SysDept> it = depts.iterator();
/*  57 */     while (it.hasNext()) {
/*  58 */       SysDept d = it.next();
/*  59 */       if (d.getDeptId().equalsIgnoreCase(deptId) || 
/*  60 */         ArrayUtils.contains((Object[])StringUtils.split(d.getAncestors(), ","), deptId + "")) {
/*  61 */         it.remove();
      }
    } 
/*  64 */     return RestResult.ok(depts);
  }



  
  @PreAuthor("system:dept:query")
  @GetMapping({"/{deptId}"})
  public RestResult getInfo(@PathVariable String deptId) {
/*  73 */     this.deptService.checkDeptDataScope(deptId);
/*  74 */     return RestResult.ok(this.deptService.selectDeptById(deptId));
  }



  
  @GetMapping({"/treeselect"})
  public RestResult treeselect(SysDept dept) {
/*  82 */     List<SysDept> depts = this.deptService.selectDeptList(dept);
/*  83 */     return RestResult.ok(this.deptService.buildDeptTreeSelect(depts));
  }



  
  @GetMapping({"/roleDeptTreeselect/{roleId}"})
  public RestResult roleDeptTreeselect(@PathVariable("roleId") Long roleId) {
/*  91 */     List<SysDept> depts = this.deptService.selectDeptList(new SysDept());
/*  92 */     HashMap<String, Object> map = new HashMap<>();
/*  93 */     map.put("checkedKeys", this.deptService.selectDeptListByRoleId(roleId));
/*  94 */     map.put("depts", this.deptService.buildDeptTreeSelect(depts));
/*  95 */     RestResult ajax = RestResult.ok(map);
/*  96 */     return ajax;
  }



  
  @PreAuthor("system:dept:add")
  @Log(title = "部门管理", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@Validated @RequestBody SysDept dept) {
/* 106 */     if ("1".equals(this.deptService.checkDeptNameUnique(dept))) {
/* 107 */       return RestResult.fail("新增部门'" + dept.getDeptName() + "'失败，部门名称已存在");
    }
/* 109 */     dept.setCreateBy(getUsername());
/* 110 */     return toAjax(this.deptService.insertDept(dept));
  }



  
  @PreAuthor("system:dept:edit")
  @Log(title = "部门管理", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@Validated @RequestBody SysDept dept) {
/* 120 */     String deptId = dept.getDeptId();
/* 121 */     this.deptService.checkDeptDataScope(deptId);
/* 122 */     if ("1".equals(this.deptService.checkDeptNameUnique(dept)))
/* 123 */       return RestResult.fail("修改部门'" + dept.getDeptName() + "'失败，部门名称已存在"); 
/* 124 */     if (dept.getParentId().equals(deptId))
/* 125 */       return RestResult.fail("修改部门'" + dept.getDeptName() + "'失败，上级部门不能是自己"); 
/* 126 */     if (StringUtils.equals("1", dept.getStatus()) && this.deptService.selectNormalChildrenDeptById(deptId) > 0) {
/* 127 */       return RestResult.fail("该部门包含未停用的子部门！");
    }
/* 129 */     dept.setUpdateBy(getUsername());
/* 130 */     return toAjax(this.deptService.updateDept(dept));
  }



  
  @PreAuthor("system:dept:remove")
  @Log(title = "部门管理", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{deptId}"})
  public RestResult remove(@PathVariable String deptId) {
/* 140 */     if (this.deptService.hasChildByDeptId(deptId)) {
/* 141 */       return RestResult.fail("存在下级部门,不允许删除");
    }
/* 143 */     if (this.deptService.checkDeptExistUser(deptId)) {
/* 144 */       return RestResult.fail("部门存在用户,不允许删除");
    }
/* 146 */     this.deptService.checkDeptDataScope(deptId);
/* 147 */     return toAjax(this.deptService.deleteDeptById(deptId));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysDeptController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */