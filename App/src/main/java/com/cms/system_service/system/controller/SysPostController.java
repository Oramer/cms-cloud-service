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
import com.cms.system_service.system.domain.SysPost;
import com.cms.system_service.system.service.ISysPostService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping({"/system/post"})
public class SysPostController
  extends BaseController
{
  @Autowired
  private ISysPostService postService;

  @PreAuthor("system:post:list')")
  @GetMapping({"/list"})
  public TableDataInfo list(SysPost post) {
/*  44 */     startPage();
/*  45 */     List<SysPost> list = this.postService.selectPostList(post);
/*  46 */     return getDataTable(list);
  }

  @Log(title = "岗位管理", businessType = BusinessType.EXPORT)
  @PreAuthor("system:post:export')")
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, SysPost post) {
/*  53 */     List<SysPost> list = this.postService.selectPostList(post);
/*  54 */     ExcelUtil<SysPost> util = new ExcelUtil(SysPost.class);
/*  55 */     util.exportExcel(response, list, "岗位数据");
  }




  @PreAuthor("system:post:query')")
  @GetMapping({"/{postId}"})
  public RestResult getInfo(@PathVariable String postId) {
/*  64 */     return RestResult.ok(this.postService.selectPostById(postId));
  }




  @PreAuthor("system:post:add')")
  @Log(title = "岗位管理", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@Validated @RequestBody SysPost post) {
/*  74 */     if ("1".equals(this.postService.checkPostNameUnique(post)))
/*  75 */       return RestResult.fail("新增岗位'" + post.getPostName() + "'失败，岗位名称已存在");
/*  76 */     if ("1".equals(this.postService.checkPostCodeUnique(post))) {
/*  77 */       return RestResult.fail("新增岗位'" + post.getPostName() + "'失败，岗位编码已存在");
    }
/*  79 */     post.setCreateBy(getUsername());
/*  80 */     return toAjax(this.postService.insertPost(post));
  }




  @PreAuthor("system:post:edit')")
  @Log(title = "岗位管理", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@Validated @RequestBody SysPost post) {
/*  90 */     if ("1".equals(this.postService.checkPostNameUnique(post)))
/*  91 */       return RestResult.fail("修改岗位'" + post.getPostName() + "'失败，岗位名称已存在");
/*  92 */     if ("1".equals(this.postService.checkPostCodeUnique(post))) {
/*  93 */       return RestResult.fail("修改岗位'" + post.getPostName() + "'失败，岗位编码已存在");
    }
/*  95 */     post.setUpdateBy(getUsername());
/*  96 */     return toAjax(this.postService.updatePost(post));
  }




  @PreAuthor("system:post:remove')")
  @Log(title = "岗位管理", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{postIds}"})
  public RestResult remove(@PathVariable String[] postIds) {
/* 106 */     return toAjax(this.postService.deletePostByIds(postIds));
  }




  @GetMapping({"/optionselect"})
  public RestResult optionselect() {
/* 114 */     List<SysPost> posts = this.postService.selectPostAll();
/* 115 */     return RestResult.ok(posts);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysPostController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */