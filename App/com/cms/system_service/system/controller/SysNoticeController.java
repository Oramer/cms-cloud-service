 package com.cms.system_service.system.controller;

 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.system_service.system.domain.SysNotice;
 import com.cms.system_service.system.service.ISysNoticeService;
 import java.util.List;
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
 @RequestMapping({"/system/notice"})
 public class SysNoticeController
   extends BaseController
 {
   @Autowired
   private ISysNoticeService noticeService;

   @PreAuthor("system:notice:list")
   @GetMapping({"/list"})
   public TableDataInfo list(SysNotice notice) {
/* 43 */     startPage();
/* 44 */     List<SysNotice> list = this.noticeService.selectNoticeList(notice);
/* 45 */     return getDataTable(list);
   }





   @PreAuthor("system:notice:query")
   @GetMapping({"/{noticeId}"})
   public RestResult getInfo(@PathVariable Long noticeId) {
/* 55 */     return RestResult.ok(this.noticeService.selectNoticeById(noticeId));
   }





   @PreAuthor("system:notice:add")
   @Log(title = "通知公告", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@Validated @RequestBody SysNotice notice) {
/* 66 */     notice.setCreateBy(getUsername());
/* 67 */     return toAjax(this.noticeService.insertNotice(notice));
   }





   @PreAuthor("system:notice:edit")
   @Log(title = "通知公告", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@Validated @RequestBody SysNotice notice) {
/* 78 */     notice.setUpdateBy(getUsername());
/* 79 */     return toAjax(this.noticeService.updateNotice(notice));
   }





   @PreAuthor("system:notice:remove")
   @Log(title = "通知公告", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{noticeIds}"})
   public RestResult remove(@PathVariable Long[] noticeIds) {
/* 90 */     return toAjax(this.noticeService.deleteNoticeByIds(noticeIds));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysNoticeController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */