 package com.cms.buss_service.ticket.controller;
 
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.ticket.domain.BussUserTicketInfo;
 import com.cms.buss_service.ticket.service.BussUserTicketInfoService;
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
 @RequestMapping({"/system/info"})
 public class BussUserTicketInfoController
   extends BaseController
 {
   @Autowired
   private BussUserTicketInfoService bussUserTicketInfoService;
   
   @PreAuthor("system:info:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussUserTicketInfo bussUserTicketInfo) {
/* 43 */     startPage();
/* 44 */     List<BussUserTicketInfo> list = this.bussUserTicketInfoService.selectBussUserTicketInfoList(bussUserTicketInfo);
/* 45 */     return getDataTable(list);
   }
 
 
 
 
   
   @PreAuthor("system:info:export")
   @Log(title = "用户卡券信息", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussUserTicketInfo bussUserTicketInfo) {
/* 56 */     List<BussUserTicketInfo> list = this.bussUserTicketInfoService.selectBussUserTicketInfoList(bussUserTicketInfo);
/* 57 */     ExcelUtil<BussUserTicketInfo> util = new ExcelUtil(BussUserTicketInfo.class);
/* 58 */     util.exportExcel(response, list, "用户卡券信息数据");
   }
 
 
 
   
   @PreAuthor("system:info:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") Long pk) {
/* 67 */     return RestResult.ok(this.bussUserTicketInfoService.selectBussUserTicketInfoById(pk));
   }
 
 
 
   
   @PreAuthor("system:info:add")
   @Log(title = "用户卡券信息", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussUserTicketInfo bussUserTicketInfo) {
/* 77 */     return toAjax(this.bussUserTicketInfoService.insertBussUserTicketInfo(bussUserTicketInfo));
   }
 
 
 
   
   @PreAuthor("system:info:edit")
   @Log(title = "用户卡券信息", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussUserTicketInfo bussUserTicketInfo) {
/* 87 */     return toAjax(this.bussUserTicketInfoService.updateBussUserTicketInfo(bussUserTicketInfo));
   }
 
 
 
   
   @PreAuthor("system:info:remove")
   @Log(title = "用户卡券信息", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable Long[] pks) {
/* 97 */     return toAjax(this.bussUserTicketInfoService.deleteBussUserTicketInfoByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\controller\BussUserTicketInfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */