 package com.cms.buss_service.order.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.order.domain.BussReceiverMessage;
 import com.cms.buss_service.order.service.BussReceiverMessageService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/order/message"})
 public class BussReceiverMessageController
   extends BaseController
 {
   @Autowired
   private BussReceiverMessageService bussReceiverMessageService;

   @PreAuthor("order:message:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussReceiverMessage bussReceiverMessage) {
/* 38 */     startPage();
/* 39 */     List<BussReceiverMessage> list = this.bussReceiverMessageService.selectBussReceiverMessageList(bussReceiverMessage);
/* 40 */     return getDataTable(list);
   }





   @PreAuthor("order:message:export")
   @Log(title = "收货地址信息", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussReceiverMessage bussReceiverMessage) {
/* 51 */     List<BussReceiverMessage> list = this.bussReceiverMessageService.selectBussReceiverMessageList(bussReceiverMessage);
/* 52 */     ExcelUtil<BussReceiverMessage> util = new ExcelUtil(BussReceiverMessage.class);
/* 53 */     util.exportExcel(response, list, "收货地址信息数据");
   }




   @PreAuthor("order:message:query")
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") Long id) {
/* 62 */     return RestResult.ok(this.bussReceiverMessageService.selectBussReceiverMessageById(id));
   }




   @PreAuthor("order:message:add")
   @Log(title = "收货地址信息", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussReceiverMessage bussReceiverMessage) {
/* 72 */     return toAjax(this.bussReceiverMessageService.insertBussReceiverMessage(bussReceiverMessage));
   }




   @PreAuthor("order:message:edit")
   @Log(title = "收货地址信息", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussReceiverMessage bussReceiverMessage) {
/* 82 */     return toAjax(this.bussReceiverMessageService.updateBussReceiverMessage(bussReceiverMessage));
   }




   @PreAuthor("order:message:remove")
   @Log(title = "收货地址信息", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{ids}"})
   public RestResult remove(@PathVariable Long[] ids) {
/* 92 */     return toAjax(this.bussReceiverMessageService.deleteBussReceiverMessageByIds(ids));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\controller\BussReceiverMessageController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */