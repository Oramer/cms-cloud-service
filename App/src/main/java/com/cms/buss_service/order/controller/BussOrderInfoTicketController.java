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
 import com.cms.buss_service.order.domain.BussOrderInfoTicket;
 import com.cms.buss_service.order.service.BussOrderInfoTicketService;

 import javax.servlet.http.HttpServletResponse;
 import java.util.List;


 @RestController
 @RequestMapping({"/order_ticket/info"})
 public class BussOrderInfoTicketController
   extends BaseController
 {
   @Autowired
   private BussOrderInfoTicketService bussOrderInfoTicketService;

   @PreAuthor("order_ticket:info:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussOrderInfoTicket bussOrderInfoTicket) {
/* 36 */     startPage();
/* 37 */     List<BussOrderInfoTicket> list = this.bussOrderInfoTicketService.selectBussOrderInfoTicketList(bussOrderInfoTicket);
/* 38 */     return getDataTable(list);
   }





   @PreAuthor("order_ticket:info:export")
   @Log(title = "订单信息", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussOrderInfoTicket bussOrderInfoTicket) {
/* 49 */     List<BussOrderInfoTicket> list = this.bussOrderInfoTicketService.selectBussOrderInfoTicketList(bussOrderInfoTicket);
/* 50 */     ExcelUtil<BussOrderInfoTicket> util = new ExcelUtil(BussOrderInfoTicket.class);
/* 51 */     util.exportExcel(response, list, "订单信息数据");
   }




   @PreAuthor("order_ticket:info:query")
   @GetMapping({"/{pk}"})
   public RestResult getInfo(@PathVariable("pk") String pk) {
/* 60 */     return RestResult.ok(this.bussOrderInfoTicketService.selectBussOrderInfoTicketById(pk));
   }




   @PreAuthor("order_ticket:info:add")
   @Log(title = "订单信息", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussOrderInfoTicket bussOrderInfoTicket) {
/* 70 */     return toAjax(this.bussOrderInfoTicketService.insertBussOrderInfoTicket(bussOrderInfoTicket));
   }




   @PreAuthor("order_ticket:info:edit")
   @Log(title = "订单信息", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussOrderInfoTicket bussOrderInfoTicket) {
/* 80 */     return toAjax(this.bussOrderInfoTicketService.updateBussOrderInfoTicket(bussOrderInfoTicket));
   }




   @PreAuthor("order_ticket:info:remove")
   @Log(title = "订单信息", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{pks}"})
   public RestResult remove(@PathVariable String[] pks) {
/* 90 */     return toAjax(this.bussOrderInfoTicketService.deleteBussOrderInfoTicketByIds(pks));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\controller\BussOrderInfoTicketController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */