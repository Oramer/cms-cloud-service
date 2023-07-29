package com.cms.buss_service.invoice.controller;

import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.buss_service.invoice.domain.BussUserInvoiceInfo;
import com.cms.buss_service.invoice.service.BussUserInvoiceInfoService;
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
@RequestMapping({"/invoice/info"})
public class BussUserInvoiceInfoController
  extends BaseController
{
  @Autowired
  private BussUserInvoiceInfoService bussUserInvoiceInfoService;
  
  @DataScope
  @PreAuthor("invoice:info:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussUserInvoiceInfo bussUserInvoiceInfo) {
/*  47 */     startPage();
/*  48 */     List<BussUserInvoiceInfo> list = this.bussUserInvoiceInfoService.selectBussUserInvoiceInfoList(bussUserInvoiceInfo);
/*  49 */     return getDataTable(list);
  }




  
  @PreAuthor("invoice:info:export")
  @Log(title = "用户开票信息", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, BussUserInvoiceInfo bussUserInvoiceInfo) {
/*  60 */     List<BussUserInvoiceInfo> list = this.bussUserInvoiceInfoService.selectBussUserInvoiceInfoList(bussUserInvoiceInfo);
/*  61 */     ExcelUtil<BussUserInvoiceInfo> util = new ExcelUtil(BussUserInvoiceInfo.class);
/*  62 */     util.exportExcel(response, list, "用户开票信息数据");
  }



  
  @PreAuthor("invoice:info:query")
  @GetMapping({"/{id}"})
  public RestResult getInfo(@PathVariable("id") Long id) {
/*  71 */     return RestResult.ok(this.bussUserInvoiceInfoService.selectBussUserInvoiceInfoById(id));
  }



  
  @PreAuthor("invoice:info:add")
  @Log(title = "用户开票信息", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody BussUserInvoiceInfo bussUserInvoiceInfo) {
/*  81 */     return toAjax(this.bussUserInvoiceInfoService.insertBussUserInvoiceInfo(bussUserInvoiceInfo));
  }



  
  @PreAuthor("invoice:info:edit")
  @Log(title = "用户开票信息", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@RequestBody BussUserInvoiceInfo bussUserInvoiceInfo) {
/*  91 */     return toAjax(this.bussUserInvoiceInfoService.updateBussUserInvoiceInfo(bussUserInvoiceInfo));
  }



  
  @PreAuthor("invoice:info:remove")
  @Log(title = "用户开票信息", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{ids}"})
  public RestResult remove(@PathVariable Long[] ids) {
/* 101 */     return toAjax(this.bussUserInvoiceInfoService.deleteBussUserInvoiceInfoByIds(ids));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\invoice\controller\BussUserInvoiceInfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */