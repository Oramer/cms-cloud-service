package com.cms.buss_service.invoice.controller;

import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.buss_service.invoice.domain.BussUserInvoiceRecord;
import com.cms.buss_service.invoice.service.BussUserInvoiceRecordService;
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
@RequestMapping({"/invoice/record"})
public class BussUserInvoiceRecordController
  extends BaseController
{
  @Autowired
  private BussUserInvoiceRecordService bussUserInvoiceRecordService;
  
  @DataScope
  @PreAuthor("invoice:record:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussUserInvoiceRecord bussUserInvoiceRecord) {
/*  49 */     startPage();
/*  50 */     List<BussUserInvoiceRecord> list = this.bussUserInvoiceRecordService.selectBussUserInvoiceRecordList(bussUserInvoiceRecord);
/*  51 */     return getDataTable(list);
  }




  
  @PreAuthor("invoice:record:export")
  @Log(title = "用户开票记录", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, BussUserInvoiceRecord bussUserInvoiceRecord) {
/*  62 */     List<BussUserInvoiceRecord> list = this.bussUserInvoiceRecordService.selectBussUserInvoiceRecordList(bussUserInvoiceRecord);
/*  63 */     ExcelUtil<BussUserInvoiceRecord> util = new ExcelUtil(BussUserInvoiceRecord.class);
/*  64 */     util.exportExcel(response, list, "用户开票记录数据");
  }



  
  @PreAuthor("invoice:record:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Long id) {
/*  73 */     return RestResult.ok(this.bussUserInvoiceRecordService.selectBussUserInvoiceRecordById(id));
  }



  
  @PreAuthor("invoice:record:add")
  @Log(title = "用户开票记录", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody BussUserInvoiceRecord bussUserInvoiceRecord) {
/*  83 */     return toAjax(this.bussUserInvoiceRecordService.insertBussUserInvoiceRecord(bussUserInvoiceRecord));
  }



  
  @PreAuthor("invoice:record:edit")
  @Log(title = "用户开票记录", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@RequestBody BussUserInvoiceRecord bussUserInvoiceRecord) {
/*  93 */     if (StringUtils.isNotBlank(bussUserInvoiceRecord.getInvoiceNo())) {
/*  94 */       bussUserInvoiceRecord.setInvoiceNo("");
    }
/*  96 */     return toAjax(this.bussUserInvoiceRecordService.updateBussUserInvoiceRecord(bussUserInvoiceRecord));
  }
  
  @PreAuthor("invoice:record:doinvoice")
  @Log(title = "执行开票", businessType = BusinessType.UPDATE)
  @PostMapping({"/doinvoice"})
  public RestResult doinvoice(@RequestBody BussUserInvoiceRecord bussUserInvoiceRecord) {
/* 103 */     if (StringUtils.isBlank(bussUserInvoiceRecord.getInvoiceNo())) {
/* 104 */       return RestResult.fail("发票号信息缺失");
    }
/* 106 */     bussUserInvoiceRecord.setNo2("Y");
/* 107 */     bussUserInvoiceRecord.setNo4(DateUtils.getTime());
/* 108 */     return toAjax(this.bussUserInvoiceRecordService.updateBussUserInvoiceRecord(bussUserInvoiceRecord));
  }



  
  @PreAuthor("invoice:record:remove")
  @Log(title = "用户开票记录", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{ids}"})
  public RestResult remove(@PathVariable Long[] ids) {
/* 118 */     return toAjax(this.bussUserInvoiceRecordService.deleteBussUserInvoiceRecordByIds(ids));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\controller\BussUserInvoiceRecordController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */