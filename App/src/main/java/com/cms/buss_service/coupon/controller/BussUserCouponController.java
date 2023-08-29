 package com.cms.buss_service.coupon.controller;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.buss_service.coupon.domain.BussUserCoupon;

 import java.util.List;


 @RestController
 @RequestMapping({"/usercoupon"})
 public class BussUserCouponController
   extends BaseController
 {
   @Autowired
   private com.cms.buss_service.coupon.service.BussUserCouponService BussUserCouponService;
   
   @GetMapping({"/list"})
   public RestResult list(BussUserCoupon bussUserCoupon) {
/* 31 */     List<BussUserCoupon> list = this.BussUserCouponService.selectBussUserCouponList(bussUserCoupon);
/* 32 */     return RestResult.ok(list);
   }
 
 
 
 
   
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") Long id) {
/* 41 */     return RestResult.ok(this.BussUserCouponService.selectBussUserCouponById(id));
   }
 
 
 
   
   @Log(title = "会员优惠卷", businessType = BusinessType.INSERT)
   @PostMapping({"/add"})
   public RestResult add(@RequestBody BussUserCoupon bussUserCoupon) {
/* 50 */     List<BussUserCoupon> list = this.BussUserCouponService.selectBussUserCouponList(bussUserCoupon);
/* 51 */     if (list != null && list.size() > 0) {
/* 52 */       return RestResult.ok();
     }
/* 54 */     return toAjax(this.BussUserCouponService.insertBussUserCoupon(bussUserCoupon));
   }
 
 
 
 
 
   
   @Log(title = "会员优惠卷", businessType = BusinessType.UPDATE)
   @PostMapping({"/edit"})
   public RestResult edit(@RequestBody BussUserCoupon bussUserCoupon) {
/* 65 */     return toAjax(this.BussUserCouponService.updateBussUserCoupon(bussUserCoupon));
   }
 
 
 
   
   @Log(title = "会员优惠卷", businessType = BusinessType.DELETE)
   @DeleteMapping({"/{ids}"})
   public RestResult remove(@PathVariable Long[] ids) {
/* 74 */     return toAjax(this.BussUserCouponService.deleteBussUserCouponByIds(ids));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\coupon\controller\BussUserCouponController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */