 package com.cms.buss_service.order.controller;

 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.order.domain.BussOrderTransferRecord;
 import com.cms.buss_service.order.service.BussOrderTransferRecordService;
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
 @RequestMapping({"/system/record"})
 public class BussOrderTransferRecordController
   extends BaseController
 {
   @Autowired
   private BussOrderTransferRecordService bussOrderTransferRecordService;

   @PreAuthor("system:record:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussOrderTransferRecord bussOrderTransferRecord) {
/* 45 */     startPage();
/* 46 */     List<BussOrderTransferRecord> list = this.bussOrderTransferRecordService.selectBussOrderTransferRecordList(bussOrderTransferRecord);
/* 47 */     return getDataTable(list);
   }





   @PreAuthor("system:record:export")
   @Log(title = "订单转单记录", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussOrderTransferRecord bussOrderTransferRecord) {
/* 58 */     List<BussOrderTransferRecord> list = this.bussOrderTransferRecordService.selectBussOrderTransferRecordList(bussOrderTransferRecord);
/* 59 */     ExcelUtil<BussOrderTransferRecord> util = new ExcelUtil(BussOrderTransferRecord.class);
/* 60 */     util.exportExcel(response, list, "订单转单记录数据");
   }




   @PreAuthor("system:record:query")
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") Long id) {
/* 69 */     return RestResult.ok(this.bussOrderTransferRecordService.selectBussOrderTransferRecordById(id));
   }




   @PreAuthor("system:record:add")
   @Log(title = "订单转单记录", businessType = BusinessType.INSERT)
   @PostMapping
   public RestResult add(@RequestBody BussOrderTransferRecord bussOrderTransferRecord) {
/* 79 */     return toAjax(this.bussOrderTransferRecordService.insertBussOrderTransferRecord(bussOrderTransferRecord));
   }




   @PreAuthor("system:record:edit")
   @Log(title = "订单转单记录", businessType = BusinessType.UPDATE)
   @PutMapping
   public RestResult edit(@RequestBody BussOrderTransferRecord bussOrderTransferRecord) {
/* 89 */     return toAjax(this.bussOrderTransferRecordService.updateBussOrderTransferRecord(bussOrderTransferRecord));
   }




   @PreAuthor("system:record:remove")
   @Log(title = "订单转单记录", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{ids}"})
   public RestResult remove(@PathVariable Long[] ids) {
/* 99 */     return toAjax(this.bussOrderTransferRecordService.deleteBussOrderTransferRecordByIds(ids));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\controller\BussOrderTransferRecordController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */