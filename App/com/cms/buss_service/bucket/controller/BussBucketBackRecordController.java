package com.cms.buss_service.bucket.controller;

import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.buss_service.bucket.domain.BucketVo;
import com.cms.buss_service.bucket.domain.BussBucketBackRecord;
import com.cms.buss_service.bucket.domain.BussBucketLackRecord;
import com.cms.buss_service.bucket.domain.BussBucketPledgeRecord;
import com.cms.buss_service.bucket.domain.BussBucketReturnRecord;
import com.cms.buss_service.bucket.service.BussBucketBackRecordService;
import com.cms.buss_service.bucket.service.BussBucketLackRecordService;
import com.cms.buss_service.bucket.service.BussBucketPledgeRecordService;
import com.cms.buss_service.bucket.service.BussBucketReturnRecordService;
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
@RequestMapping({"/bucket/record"})
public class BussBucketBackRecordController
  extends BaseController
{
  @Autowired
  private BussBucketLackRecordService bussBucketLackRecordService;
  @Autowired
  private BussBucketBackRecordService bussBucketBackRecordService;
  @Autowired
  private BussBucketReturnRecordService bussBucketReturnRecordService;
  @Autowired
  private BussBucketPledgeRecordService bussBucketPledgeRecordService;

  @PreAuthor("bucket:record:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussBucketBackRecord bussBucketBackRecord) {
/*  62 */     if (StringUtils.isBlank(bussBucketBackRecord.getOpType())) {
/*  63 */       return null;
    }
/*  65 */     if ("first".equalsIgnoreCase(bussBucketBackRecord.getOpType())) {
/*  66 */       startPage();
/*  67 */       List<BussBucketLackRecord> list1 = this.bussBucketLackRecordService.selectBussBucketLackRecordList(new BussBucketLackRecord());
/*  68 */       return getDataTable(list1);
/*  69 */     }  if ("second".equalsIgnoreCase(bussBucketBackRecord.getOpType())) {
/*  70 */       startPage();
/*  71 */       List<BussBucketReturnRecord> list1 = this.bussBucketReturnRecordService.selectBussBucketReturnRecordList(new BussBucketReturnRecord());
/*  72 */       return getDataTable(list1);
    }
/*  74 */     startPage();
/*  75 */     List<BussBucketBackRecord> list = this.bussBucketBackRecordService.selectBussBucketBackRecordList(new BussBucketBackRecord());
/*  76 */     return getDataTable(list);
  }






  @PreAuthor("bucket:record:export")
  @Log(title = "水桶记录", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, BussBucketBackRecord bussBucketBackRecord) {
/*  88 */     List<BussBucketBackRecord> list = this.bussBucketBackRecordService.selectBussBucketBackRecordList(bussBucketBackRecord);
/*  89 */     ExcelUtil<BussBucketBackRecord> util = new ExcelUtil(BussBucketBackRecord.class);
/*  90 */     util.exportExcel(response, list, "水桶记录数据");
  }








  @PreAuthor("bucket:record:query")
  @GetMapping({"/{pk}/{opType}"})
  public RestResult getInfo(@PathVariable("pk") Long pk, @PathVariable("opType") String opType) {
/* 103 */     if ("first".equalsIgnoreCase(opType))
/* 104 */       return RestResult.ok(this.bussBucketPledgeRecordService.selectBussBucketPledgeRecordById(pk)); 
/* 105 */     if ("second".equalsIgnoreCase(opType)) {
/* 106 */       return RestResult.ok(this.bussBucketReturnRecordService.selectBussBucketReturnRecordById(pk));
    }
/* 108 */     return RestResult.ok(this.bussBucketBackRecordService.selectBussBucketBackRecordById(pk));
  }






  @PreAuthor("bucket:record:add")
  @Log(title = "水桶记录", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody BucketVo vo) {
/* 120 */     int i = 0;
/* 121 */     if ("first".equalsIgnoreCase(vo.getOpType())) {
/* 122 */       i = this.bussBucketPledgeRecordService.insertBussBucketPledgeRecord((BussBucketPledgeRecord)vo);
/* 123 */     } else if ("second".equalsIgnoreCase(vo.getOpType())) {
/* 124 */       i = this.bussBucketReturnRecordService.insertBussBucketReturnRecord((BussBucketReturnRecord)vo);
    } else {
/* 126 */       i = this.bussBucketBackRecordService.insertBussBucketBackRecord((BussBucketBackRecord)vo);
    }
/* 128 */     return toAjax(i);
  }





  @PreAuthor("bucket:record:edit")
  @Log(title = "水桶记录", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@RequestBody BucketVo vo) {
/* 139 */     int i = 0;
/* 140 */     if ("first".equalsIgnoreCase(vo.getOpType())) {
/* 141 */       i = this.bussBucketPledgeRecordService.updateBussBucketPledgeRecord((BussBucketPledgeRecord)vo);
/* 142 */     } else if ("second".equalsIgnoreCase(vo.getOpType())) {
/* 143 */       i = this.bussBucketReturnRecordService.updateBussBucketReturnRecord((BussBucketReturnRecord)vo);
    } else {
/* 145 */       i = this.bussBucketBackRecordService.updateBussBucketBackRecord((BussBucketBackRecord)vo);
    }
/* 147 */     return toAjax(i);
  }








  @PreAuthor("bucket:record:remove")
  @Log(title = "水桶记录", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{pks}/{opType}"})
  public RestResult remove(@PathVariable Long[] pks, @PathVariable String opType) {
/* 161 */     int i = 0;
/* 162 */     if ("first".equalsIgnoreCase(opType)) {
/* 163 */       i = this.bussBucketPledgeRecordService.deleteBussBucketPledgeRecordByIds(pks);
/* 164 */     } else if ("second".equalsIgnoreCase(opType)) {
/* 165 */       i = this.bussBucketReturnRecordService.deleteBussBucketReturnRecordByIds(pks);
    } else {
/* 167 */       i = this.bussBucketBackRecordService.deleteBussBucketBackRecordByIds(pks);
    }
/* 169 */     return toAjax(i);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\bucket\controller\BussBucketBackRecordController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */