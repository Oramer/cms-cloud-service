package com.cms.buss_service.message;

import com.cms.base_service.annotation.BusinessType;
import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.Log;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.buss_service.message.BussMessageInfo;
import com.cms.buss_service.message.BussMessageInfoService;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;










@RestController
@RequestMapping({"/mess/info"})
public class BussMessageInfoCtl
  extends BaseCtl
{
  @Autowired
  private BussMessageInfoService bussMessageInfoService;

  @DataScope
  @PreAuthor("cms:info:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussMessageInfo bussMessageInfo) {
/*  44 */     startPage();
/*  45 */     List<BussMessageInfo> list = this.bussMessageInfoService.selectBussMessageInfoList(bussMessageInfo);
/*  46 */     return getDataTable(list);
  }




  @Log(businessType = BusinessType.EXPORT, title = "导出消息通知列表")
  @PreAuthor("cms:info:export")
  @GetMapping({"/export"})
  public void export(BussMessageInfo bussMessageInfo, HttpServletResponse response) {
/*  56 */     List<BussMessageInfo> list = this.bussMessageInfoService.selectBussMessageInfoList(bussMessageInfo);
/*  57 */     ExcelUtil<BussMessageInfo> util = new ExcelUtil(BussMessageInfo.class);
/*  58 */     util.exportExcel(response, list, "导出消息通知列表");
  }




  @PreAuthor("cms:info:query")
  @GetMapping({"/{pk}"})
  public RestResult getInfo(@PathVariable("pk") Long pk) {
/*  67 */     return RestResult.ok().setData(this.bussMessageInfoService.selectBussMessageInfoById(pk));
  }




  @Log(businessType = BusinessType.INSERT, title = "新增消息通知")
  @PreAuthor("cms:info:add")
  @PostMapping({"/add"})
  public RestResult add(@RequestBody BussMessageInfo bussMessageInfo) {
/*  77 */     int rows = this.bussMessageInfoService.insertBussMessageInfo(bussMessageInfo);
/*  78 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }




  @Log(businessType = BusinessType.UPDATE, title = "修改消息通知")
  @PreAuthor("cms:info:edit")
  @PostMapping({"/edit"})
  public RestResult edit(@RequestBody BussMessageInfo bussMessageInfo) {
/*  88 */     int rows = this.bussMessageInfoService.updateBussMessageInfo(bussMessageInfo);
/*  89 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }




  @Log(businessType = BusinessType.DELETE, title = "删除消息通知")
  @PreAuthor("cms:info:remove")
  @PostMapping({"/{pks}"})
  public RestResult remove(@PathVariable Long[] pks) {
/*  99 */     int rows = this.bussMessageInfoService.deleteBussMessageInfoByIds(pks);
/* 100 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\message\BussMessageInfoCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */