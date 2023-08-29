package com.cms.buss_service.ticket.controller;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.annotation.BusinessType;
import com.cms.base_service.annotation.Log;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.buss_service.product.domain.BussProductInfo;
import com.cms.buss_service.ticket.domain.BussTicketInfo;
import com.cms.buss_service.ticket.domain.TicketVo;
import com.cms.buss_service.ticket.service.BussTicketInfoService;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping({"/ticket/info"})
public class BussTicketInfoController
  extends BaseCtl
{
  @Autowired
  private BussTicketInfoService bussTicketInfoService;

  @PreAuthor("ticket:info:add")
  @Log(title = "水票信息", businessType = BusinessType.INSERT)
  @PostMapping({"/batch"})
  public RestResult batchAddTicket(@RequestBody TicketVo vo) {
/*  49 */     List<BussProductInfo> products = vo.getProducts();

/*  51 */     List<BussTicketInfo> tickets = vo.getTickets();
/*  52 */     if (CollectionUtils.isEmpty(products) || CollectionUtils.isEmpty(tickets)) {
/*  53 */       return RestResult.fail().setMsg("参数异常,水票规则信息或产品信息为空");
    }
/*  55 */     products.forEach(is -> tickets.forEach((s1 ->{})));








/*  64 */     return RestResult.ok("水票信息添加成功");
  }




  @PreAuthor("ticket:info:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussTicketInfo bussTicketInfo) {
/*  73 */     bussTicketInfo.setNo1("N");
/*  74 */     startPage();
/*  75 */     List<BussTicketInfo> list = this.bussTicketInfoService.selectBussTicketInfoList(bussTicketInfo);
/*  76 */     return getDataTable(list);
  }





  @PreAuthor("ticket:info:export")
  @Log(title = "水票信息", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, BussTicketInfo bussTicketInfo) {
/*  87 */     List<BussTicketInfo> list = this.bussTicketInfoService.selectBussTicketInfoList(bussTicketInfo);
/*  88 */     ExcelUtil<BussTicketInfo> util = new ExcelUtil(BussTicketInfo.class);
/*  89 */     util.exportExcel(response, list, "水票信息数据");
  }




  @PreAuthor("ticket:info:query")
  @GetMapping({"/{pk}"})
  public RestResult getInfo(@PathVariable("pk") String pk) {
/*  98 */     return RestResult.ok(this.bussTicketInfoService.selectBussTicketInfoById(pk));
  }




  @PreAuthor("ticket:info:add")
  @Log(title = "水票信息", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody BussTicketInfo bussTicketInfo) {
/* 108 */     return toAjax(this.bussTicketInfoService.insertBussTicketInfo(bussTicketInfo));
  }




  @PreAuthor("ticket:info:edit")
  @Log(title = "水票信息", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@RequestBody BussTicketInfo bussTicketInfo) {
/* 118 */     return toAjax(this.bussTicketInfoService.updateBussTicketInfo(bussTicketInfo));
  }




  @PreAuthor("ticket:info:remove")
  @Log(title = "水票信息", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{pks}"})
  public RestResult remove(@PathVariable String[] pks) {
/* 128 */     if (pks != null && pks.length > 0) {
/* 129 */       Arrays.<String>asList(pks).forEach(ticketId -> {
            BussTicketInfo io = new BussTicketInfo();

            io.setPk(ticketId);
            io.setNo1("Y");
            this.bussTicketInfoService.updateBussTicketInfo(io);
          });
    }
/* 137 */     return RestResult.ok();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\ticket\controller\BussTicketInfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */