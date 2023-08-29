package com.cms.buss_service.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.buss_service.card.domain.BussUserCard;
import com.cms.buss_service.card.service.BussUserCardService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping({"/buss/card/info"})
public class BussUserCardController
  extends BaseController
{
  @Autowired
  private BussUserCardService bussUserCardService;
  
  @PreAuthor("buss_service:banner:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussUserCard bussUserCard) {
/*  45 */     startPage();
/*  46 */     List<BussUserCard> list = this.bussUserCardService.selectBussUserCardList(bussUserCard);
/*  47 */     return getDataTable(list);
  }




  
  @PreAuthor("buss_service:banner:export")
  @Log(title = "购物车信息", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, BussUserCard bussUserCard) {
/*  58 */     List<BussUserCard> list = this.bussUserCardService.selectBussUserCardList(bussUserCard);
/*  59 */     ExcelUtil<BussUserCard> util = new ExcelUtil(BussUserCard.class);
/*  60 */     util.exportExcel(response, list, "购物车信息数据");
  }



  
  @PreAuthor("buss_service:banner:query")
  @GetMapping({"/{pk}"})
  public RestResult getInfo(@PathVariable("pk") Long pk) {
/*  69 */     return RestResult.ok(this.bussUserCardService.selectBussUserCardById(pk));
  }



  
  @PreAuthor("buss_service:banner:add")
  @Log(title = "购物车信息", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody BussUserCard bussUserCard) {
/*  79 */     this.bussUserCardService.insertBussUserCard(bussUserCard);
/*  80 */     return RestResult.ok();
  }



  
  @PreAuthor("buss_service:banner:edit")
  @Log(title = "购物车信息", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@RequestBody BussUserCard bussUserCard) {
/*  90 */     return toAjax(this.bussUserCardService.updateBussUserCard(bussUserCard));
  }



  
  @PreAuthor("buss_service:banner:remove")
  @Log(title = "购物车信息", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{pks}"})
  public RestResult remove(@PathVariable Long[] pks) {
/* 100 */     return toAjax(this.bussUserCardService.deleteBussUserCardByIds(pks));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\card\controller\BussUserCardController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */