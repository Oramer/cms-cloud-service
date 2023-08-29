package com.cms.buss_service.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.file.FileUploadUtils;
import com.cms.base_service.common.utils.file.FileUtils;
import com.cms.base_service.framework.config.CmsConfig;
import com.cms.base_service.framework.config.ServerConfig;
import com.cms.buss_service.banner.domain.BussBannerInfo;
import com.cms.buss_service.banner.service.BussBannerInfoService;
import com.cms.buss_service.order.domain.BussReceiverMessage;
import com.cms.buss_service.order.mapper.BussReceiverMessageMapper;
import com.cms.buss_service.poster.domain.BussStationPoster;
import com.cms.buss_service.product.domain.BussProductInfo;
import com.cms.buss_service.station.domain.BussWaterStationInfo;
import com.cms.buss_service.station.domain.SearchUserVo;
import com.cms.buss_service.station.domain.SysUserVo;
import com.cms.buss_service.station.service.BussStationClimbFeeService;
import com.cms.buss_service.station.service.BussWaterStationInfoService;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.service.ISysUserService;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping({"/api"})
public class AppCtl extends BaseCtl {
  @Autowired
  private ISysUserService userService;
  @Autowired
  private BussBannerInfoService bussBannerInfoService;
  @Autowired
  private ServerConfig serverConfig;
  @Autowired
  private BussStationClimbFeeService bussStationClimbFeeService;
  @Autowired
  protected BussWaterStationInfoService bussWaterStationInfoService;
  @Autowired(required = false)
  BussReceiverMessageMapper bussReceiverMessageMapper;
  
  @GetMapping({"/banner/info/list"})
  public TableDataInfo bannerlist(BussBannerInfo bussBannerInfo) {
/*  54 */     startPage();
/*  55 */     List<BussBannerInfo> list = this.bussBannerInfoService.selectBussBannerInfoList(bussBannerInfo);
/*  56 */     return getDataTable(list);
  }






  
  @PostMapping({"/user/info/edit"})
  public RestResult editUser(@RequestBody SysUser user) {
/*  67 */     return toAjax(this.userService.updateUser(user));
  }





  
  @GetMapping({"/myinfo/querycount"})
  public RestResult queryUserInfoCount() {
/*  77 */     return RestResult.ok(this.userService.queryUserInfoCount(SecurityUtils.getUid()));
  }







  
  @PostMapping({"/common/upload"})
  public RestResult avatar(@RequestParam("file") MultipartFile file) throws Exception {
/*  89 */     if (!file.isEmpty()) {


      
/*  93 */       String filePath = CmsConfig.getUploadPath();
      
/*  95 */       String fileName = FileUploadUtils.upload(filePath, file);
/*  96 */       String url = this.serverConfig.getUrl() + fileName;
/*  97 */       RestResult ajax = RestResult.ok();
/*  98 */       HashMap<String, Object> ajaxs = new HashMap<>();
/*  99 */       ajaxs.put("url", url);
/* 100 */       ajaxs.put("fileName", fileName);
/* 101 */       ajaxs.put("newFileName", FileUtils.getName(fileName));
/* 102 */       ajaxs.put("originalFilename", file.getOriginalFilename());
/* 103 */       return RestResult.ok(ajaxs);
    } 
/* 105 */     return RestResult.fail("上传图片异常，请联系管理员");
  }






  
  @GetMapping({"/buss/user/list"})
  public TableDataInfo list(SysUser user) {
/* 116 */     user.setCloudPk(String.valueOf(SecurityUtils.getUserStationId()));
/* 117 */     user.setUserType("00");
/* 118 */     startPage();
/* 119 */     List<SysUser> list = this.userService.selectUserList(user);
/* 120 */     return getDataTable(list);
  }






  
  @GetMapping({"/buss/user/list_b"})
  public TableDataInfo list_b(SearchUserVo user) {
/* 131 */     user.setUserType("00");
/* 132 */     startPage();
/* 133 */     List<SysUserVo> list = this.userService.selectUserListByHoverCondition(user);
/* 134 */     return getDataTable(list);
  }









  
  @GetMapping({"/buss/station/clim_free/{floornum}"})
  public RestResult queryClimFree(@PathVariable Integer floornum) {
/* 148 */     return RestResult.ok(this.bussStationClimbFeeService.selectBussStationClimbSetUp(Integer.valueOf(2), floornum));
  }






  
  @GetMapping({"/buss/station/clim_free_psy/{floornum}"})
  public RestResult queryClimFreePsy(@PathVariable Integer floornum) {
/* 159 */     return RestResult.ok(this.bussStationClimbFeeService.selectBussStationClimbSetUp(Integer.valueOf(1), floornum));
  }



  
  @GetMapping({"/buss/station/info/{pk}"})
  public RestResult getInfo(@PathVariable("pk") Long pk) {
/* 167 */     return RestResult.ok(this.bussWaterStationInfoService.selectBussWaterStationInfoById(pk));
  }






  
  @PostMapping({"/buss/station/info/update"})
  public RestResult add(@RequestBody BussWaterStationInfo bussWaterStationInfo) {
/* 178 */     if (bussWaterStationInfo.getPk() != null) {
/* 179 */       return toAjax(this.bussWaterStationInfoService.updateBussWaterStationInfo(bussWaterStationInfo));
    }
/* 181 */     this.bussWaterStationInfoService.insertBussWaterStationInfo(bussWaterStationInfo);
/* 182 */     return toAjax(1);
  }










  
  @PostMapping({"/wb/sent"})
  public void sentMessage(String userId, String message) {}









  
  @GetMapping({"/tj/info/user_list"})
  public TableDataInfo queryUserTjInfo(BussReceiverMessage rec) {
/* 209 */     startPage();
/* 210 */     return getDataTable(this.bussReceiverMessageMapper.queryUserTjInfoForPT(rec));
  }




  
  @GetMapping({"/tj/info/product_list"})
  public TableDataInfo queryProductTjInfo(BussProductInfo rec) {
/* 219 */     startPage();
/* 220 */     return getDataTable(this.bussReceiverMessageMapper.queryProductSaleInfoForPT(rec));
  }




  
  @GetMapping({"/tj/info/poster_list"})
  public TableDataInfo queryProductTjInfo(BussStationPoster rec) {
/* 229 */     startPage();
/* 230 */     return getDataTable(this.bussReceiverMessageMapper.queryPosterTjForPT(rec));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\AppCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */