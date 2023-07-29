 package com.cms.buss_service.coupon.controller;

 import com.cms.base_service.annotation.DataScope;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.ExcelUtil;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.coupon.domain.BussCoupon;
 import com.cms.buss_service.coupon.service.BussCouponService;
 import java.util.List;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.DeleteMapping;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;





 @RestController
 @RequestMapping({"/coupon/info"})
 public class BussCouponController
   extends BaseController
 {
   @Autowired
   private BussCouponService bussCouponService;

   @DataScope
   @PreAuthor("buss:coupon:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussCoupon bussCoupon) {
/* 40 */     startPage();
/* 41 */     List<BussCoupon> list = this.bussCouponService.selectBussCouponList(bussCoupon);
/* 42 */     return getDataTable(list);
   }





   @PreAuthor("buss:coupon:export")
   @Log(title = "优惠卷", businessType = BusinessType.EXPORT)
   @PostMapping({"/export"})
   public void export(HttpServletResponse response, BussCoupon bussCoupon) {
/* 53 */     List<BussCoupon> list = this.bussCouponService.selectBussCouponList(bussCoupon);
/* 54 */     ExcelUtil<BussCoupon> util = new ExcelUtil(BussCoupon.class);
/* 55 */     util.exportExcel(response, list, "优惠卷数据");
   }




   @PreAuthor("buss:coupon:query")
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") String id) {
/* 64 */     return RestResult.ok(this.bussCouponService.selectBussCouponById(id));
   }




   @PreAuthor("buss:coupon:add")
   @Log(title = "优惠卷", businessType = BusinessType.INSERT)
   @PostMapping({"/add"})
   public RestResult add(@RequestBody BussCoupon bussCoupon) {
/* 74 */     return toAjax(this.bussCouponService.insertBussCoupon(bussCoupon));
   }




   @PreAuthor("buss:coupon:edit")
   @Log(title = "优惠卷", businessType = BusinessType.UPDATE)
   @PostMapping({"/edit"})
   public RestResult edit(@RequestBody BussCoupon bussCoupon) {
/* 84 */     return toAjax(this.bussCouponService.updateBussCoupon(bussCoupon));
   }




   @PreAuthor("buss:coupon:remove")
   @Log(title = "优惠卷", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{ids}"})
   public RestResult remove(@PathVariable String[] ids) {
/* 94 */     return toAjax(this.bussCouponService.deleteBussCouponByIds(ids));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\controller\BussCouponController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */