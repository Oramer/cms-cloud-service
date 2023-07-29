 package com.cms.buss_service.app;
 
 import com.cms.base_service.common.model.BaseCtl;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.model.TableDataInfo;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.base_service.framework.aspectj.lang.annotation.Log;
 import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
 import com.cms.buss_service.coupon.domain.BussCoupon;
 import com.cms.buss_service.coupon.domain.BussUserCoupon;
 import com.cms.buss_service.coupon.service.BussCouponService;
 import com.cms.buss_service.coupon.service.BussUserCouponService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 
 @RestController
 @RequestMapping({"/api"})
 public class ApplicationCouponCtl extends BaseCtl {
   @Autowired
   private BussCouponService bussCouponService;
   @Autowired
   private BussUserCouponService BussUserCouponService;
   
   @GetMapping({"/coupon/info/list"})
   public TableDataInfo list(BussCoupon bussCoupon) {
/* 31 */     startPage();
/* 32 */     List<BussCoupon> list = this.bussCouponService.selectBussCouponList(bussCoupon);
/* 33 */     return getDataTable(list);
   }
 
 
 
   
   @GetMapping({"/usercoupon/list"})
   public RestResult list(BussUserCoupon buss) {
/* 41 */     buss.setUserPk(SecurityUtils.getUid());
/* 42 */     List<BussCoupon> list = this.BussUserCouponService.selectCoupList(buss);
/* 43 */     return RestResult.ok(list);
   }
   
   @GetMapping({"/usercoupon/list_my"})
   public RestResult list_my(BussUserCoupon buss) {
/* 48 */     buss.setUserPk(SecurityUtils.getUid());
/* 49 */     List<BussCoupon> list = this.BussUserCouponService.selectUserCoupList(buss);
/* 50 */     return RestResult.ok(list);
   }
 
 
 
   
   @Log(title = "会员优惠卷", businessType = BusinessType.INSERT)
   @PostMapping({"/usercoupon/add"})
   public RestResult add(@RequestBody BussUserCoupon bussUserCoupon) {
/* 59 */     bussUserCoupon.setUserPk(SecurityUtils.getUid());
/* 60 */     List<BussUserCoupon> list = this.BussUserCouponService.selectBussUserCouponList(bussUserCoupon);
/* 61 */     if (list != null && list.size() > 0) {
/* 62 */       return RestResult.fail("请勿重复领取,当前优惠券已经领用");
     }
/* 64 */     return toAjax(this.BussUserCouponService.insertBussUserCoupon(bussUserCoupon));
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationCouponCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */