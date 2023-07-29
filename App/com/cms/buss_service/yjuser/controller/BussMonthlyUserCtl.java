 package com.cms.buss_service.yjuser.controller;
 
 import com.cms.base_service.annotation.BusinessType;
 import com.cms.base_service.annotation.DataScope;
 import com.cms.base_service.annotation.Log;
 import com.cms.base_service.annotation.PreAuthor;
 import com.cms.base_service.common.model.BaseCtl;
 import com.cms.base_service.common.model.RestResult;
 import com.cms.base_service.common.model.TableDataInfo;
 import com.cms.buss_service.yjuser.domain.BussMonthlyUser;
 import com.cms.buss_service.yjuser.service.BussMonthlyUserService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
 
 
 
 
 
 
 
 
 
 
 @RestController
 @RequestMapping({"/yj/user"})
 public class BussMonthlyUserCtl
   extends BaseCtl
 {
   @Autowired
   private BussMonthlyUserService bussMonthlyUserService;
   
   @DataScope
   @PreAuthor("yj:user:list")
   @GetMapping({"/list"})
   public TableDataInfo list(BussMonthlyUser bussMonthlyUser) {
/* 42 */     startPage();
/* 43 */     List<BussMonthlyUser> list = this.bussMonthlyUserService.selectBussMonthlyUserList(bussMonthlyUser);
/* 44 */     return getDataTable(list);
   }
 
 
 
 
   
   @PreAuthor("yj:user:query")
   @GetMapping({"/{id}"})
   public RestResult getInfo(@PathVariable("id") Long id) {
/* 54 */     return RestResult.ok().setData(this.bussMonthlyUserService.selectBussMonthlyUserById(id));
   }
 
 
 
   
   @Log(businessType = BusinessType.INSERT, title = "新增月结用户信息")
   @PreAuthor("yj:user:add")
   @PostMapping({"/add"})
   public RestResult add(@RequestBody BussMonthlyUser bussMonthlyUser) {
/* 64 */     int rows = this.bussMonthlyUserService.insertBussMonthlyUser(bussMonthlyUser);
/* 65 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
   }
 
 
 
   
   @Log(businessType = BusinessType.UPDATE, title = "修改月结用户信息")
   @PreAuthor("yj:user:edit")
   @PostMapping({"/edit"})
   public RestResult edit(@RequestBody BussMonthlyUser bussMonthlyUser) {
/* 75 */     int rows = this.bussMonthlyUserService.updateBussMonthlyUser(bussMonthlyUser);
/* 76 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
   }
 
 
 
   
   @Log(businessType = BusinessType.DELETE, title = "删除月结用户信息")
   @PreAuthor("yj:user:remove")
   @PostMapping({"/{ids}"})
   public RestResult remove(@PathVariable Long[] ids) {
/* 86 */     int rows = this.bussMonthlyUserService.deleteBussMonthlyUserByIds(ids);
/* 87 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\controller\BussMonthlyUserCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */