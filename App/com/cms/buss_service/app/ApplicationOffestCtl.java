 package com.cms.buss_service.app;
 
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.base_service.framework.web.controller.BaseController;
 import com.cms.base_service.framework.web.page.TableDataInfo;
 import com.cms.buss_service.offset.domain.BussUserOffest;
 import com.cms.buss_service.offset.domain.BussUserOffestDetails;
 import com.cms.buss_service.offset.service.BussUserOffestDetailsService;
 import com.cms.buss_service.offset.service.BussUserOffestService;
 import java.math.BigDecimal;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 
 
 
 
 
 
 
 
 
 @RestController
 @RequestMapping({"/api"})
 public class ApplicationOffestCtl
   extends BaseController
 {
   @Autowired
   private BussUserOffestService bussUserOffestService;
   @Autowired
   private BussUserOffestDetailsService bussUserOffestDetailsService;
   
   @GetMapping({"/offest/info/my"})
   public RestResult list(BussUserOffest bussUserOffest) {
/* 38 */     bussUserOffest.setUserPk(SecurityUtils.getUid());
/* 39 */     List<BussUserOffest> list = this.bussUserOffestService.selectBussUserOffestList(bussUserOffest);
/* 40 */     if (list != null && list.size() > 0) {
/* 41 */       return RestResult.ok(((BussUserOffest)list.get(0)).getOffestAmount());
     }
/* 43 */     return RestResult.ok(new BigDecimal(0.0D));
   }
 
 
 
 
 
 
   
   @GetMapping({"/offest/details/list"})
   public TableDataInfo list(BussUserOffestDetails bussUserOffestDetails) {
/* 54 */     bussUserOffestDetails.setUserPk(SecurityUtils.getUid());
/* 55 */     startPage();
/* 56 */     List<BussUserOffestDetails> list = this.bussUserOffestDetailsService.selectBussUserOffestDetailsList(bussUserOffestDetails);
/* 57 */     return getDataTable(list);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationOffestCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */