package com.cms.buss_service.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.IdUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.buss_service.invoice.domain.BussUserInvoiceInfo;
import com.cms.buss_service.invoice.domain.BussUserInvoiceRecord;
import com.cms.buss_service.invoice.domain.BussUserInvoiceRecordDetails;
import com.cms.buss_service.invoice.domain.InvoiceVo;
import com.cms.buss_service.invoice.service.BussUserInvoiceInfoService;
import com.cms.buss_service.invoice.service.BussUserInvoiceRecordDetailsService;
import com.cms.buss_service.invoice.service.BussUserInvoiceRecordService;
import com.cms.buss_service.order.domain.BussOrderInfo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/api"})
public class ApplicationInvoiceCtl
  extends BaseController
{
  @Autowired
  private BussUserInvoiceInfoService bussUserInvoiceInfoService;
  @Autowired
  private BussUserInvoiceRecordService bussUserInvoiceRecordService;
  @Autowired
  private BussUserInvoiceRecordDetailsService bussUserInvoiceRecordDetailsService;

  @PostMapping({"/invoice/record/add"})
  public RestResult addInvoiceRecord(@RequestBody InvoiceVo vo) {
/*  43 */     String rid = IdUtils.get();
/*  44 */     if (StringUtils.isBlank(vo.getInvoiceId())) {
/*  45 */       return RestResult.fail("开票信息缺失");
    }
/*  47 */     if (vo.getInfos().size() <= 0) {
/*  48 */       return RestResult.fail("开票订单信息缺失");
    }
/*  50 */     BigDecimal total = new BigDecimal(0.0D);
/*  51 */     List<BussOrderInfo> infos = vo.getInfos();
/*  52 */     List<BussUserInvoiceRecordDetails> als = new ArrayList<>();
/*  53 */     for (int i = 0; i < infos.size(); i++) {
/*  54 */       BigDecimal amountofmoney = ((BussOrderInfo)infos.get(i)).getAmountofmoney();
/*  55 */       total = total.add(amountofmoney);
/*  56 */       BussUserInvoiceRecordDetails rdd = new BussUserInvoiceRecordDetails();
/*  57 */       rdd.setInvoiceRecordId(rid);
/*  58 */       rdd.setOrderPk(((BussOrderInfo)infos.get(i)).getPk());
/*  59 */       rdd.setNo1(String.valueOf(amountofmoney));
/*  60 */       als.add(rdd);
    }
/*  62 */     if (total.compareTo(new BigDecimal(200)) < 0) {
/*  63 */       return RestResult.fail("订单金额小于200");
    }
/*  65 */     BussUserInvoiceRecord rd = new BussUserInvoiceRecord();
/*  66 */     rd.setId(rid);
/*  67 */     rd.setInvoiceAmount(total);
/*  68 */     rd.setInvoiceInfoId(vo.getInvoiceId());
/*  69 */     als.forEach(is -> this.bussUserInvoiceRecordDetailsService.insertBussUserInvoiceRecordDetails(is));


/*  72 */     return toAjax(this.bussUserInvoiceRecordService.insertBussUserInvoiceRecord(rd));
  }







  @GetMapping({"/invoice/record/list"})
  public TableDataInfo listInvoice(BussUserInvoiceRecord bussUserInvoiceRecord) {
/*  83 */     bussUserInvoiceRecord.setCreateBy(SecurityUtils.getUid());
/*  84 */     startPage();
/*  85 */     List<BussUserInvoiceRecord> list = this.bussUserInvoiceRecordService.selectBussUserInvoiceRecordList(bussUserInvoiceRecord);
/*  86 */     return getDataTable(list);
  }

  @GetMapping({"/invoice/info/{id}"})
  public RestResult getInvoiceInfo(@PathVariable("id") Long id) {
/*  91 */     return RestResult.ok(this.bussUserInvoiceInfoService.selectBussUserInvoiceInfoById(id));
  }







  @PostMapping({"/invoice/record/doinvoice"})
  public RestResult doinvoice(@RequestBody BussUserInvoiceRecord bussUserInvoiceRecord) {
/* 102 */     if (StringUtils.isBlank(bussUserInvoiceRecord.getInvoiceNo())) {
/* 103 */       return RestResult.fail("发票号信息缺失");
    }
/* 105 */     bussUserInvoiceRecord.setNo2("Y");
/* 106 */     bussUserInvoiceRecord.setNo4(DateUtils.getTime());
/* 107 */     return toAjax(this.bussUserInvoiceRecordService.updateBussUserInvoiceRecord(bussUserInvoiceRecord));
  }







  @PostMapping({"/invoice/record/complate"})
  public RestResult docomplate(@RequestBody BussUserInvoiceRecord bussUserInvoiceRecord) {
/* 118 */     if (StringUtils.isBlank(bussUserInvoiceRecord.getInvoiceNo())) {
/* 119 */       return RestResult.fail("发票号信息缺失");
    }
/* 121 */     if (StringUtils.isBlank(bussUserInvoiceRecord.getNo2()) || !"Y".equalsIgnoreCase(bussUserInvoiceRecord.getNo2())) {
/* 122 */       return RestResult.fail("发票状态信息异常");
    }
/* 124 */     bussUserInvoiceRecord.setNo2("C");
/* 125 */     bussUserInvoiceRecord.setNo3(DateUtils.getTime());
/* 126 */     return toAjax(this.bussUserInvoiceRecordService.updateBussUserInvoiceRecord(bussUserInvoiceRecord));
  }







  @GetMapping({"/invoice/info/list"})
  public TableDataInfo listMyInvoice(BussUserInvoiceInfo bussUserInvoiceInfo) {
/* 137 */     bussUserInvoiceInfo.setUserId(SecurityUtils.getUid());
/* 138 */     startPage();
/* 139 */     List<BussUserInvoiceInfo> list = this.bussUserInvoiceInfoService.selectBussUserInvoiceInfoList(bussUserInvoiceInfo);
/* 140 */     return getDataTable(list);
  }




  @PostMapping({"/invoice/info/add"})
  public RestResult addInvoice(@RequestBody BussUserInvoiceInfo bussUserInvoiceInfo) {
/* 148 */     return toAjax(this.bussUserInvoiceInfoService.insertBussUserInvoiceInfo(bussUserInvoiceInfo));
  }




  @PostMapping({"/invoice/info/edit"})
  public RestResult editInvoice(@RequestBody BussUserInvoiceInfo bussUserInvoiceInfo) {
/* 156 */     return toAjax(this.bussUserInvoiceInfoService.updateBussUserInvoiceInfo(bussUserInvoiceInfo));
  }

  @PostMapping({"/invoice/info/{ids}"})
  public RestResult removeInvoice(@PathVariable Long[] ids) {
/* 161 */     return toAjax(this.bussUserInvoiceInfoService.deleteBussUserInvoiceInfoByIds(ids));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationInvoiceCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */