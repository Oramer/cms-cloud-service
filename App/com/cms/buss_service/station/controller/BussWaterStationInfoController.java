package com.cms.buss_service.station.controller;

import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.buss_service.poster.domain.BussStationPoster;
import com.cms.buss_service.poster.service.BussStationPosterService;
import com.cms.buss_service.station.domain.BussWaterStationInfo;
import com.cms.buss_service.station.service.BussWaterStationInfoService;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.service.ISysUserService;
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
@RequestMapping({"/station/info"})
public class BussWaterStationInfoController
  extends BaseController
{
  @Autowired
  private BussWaterStationInfoService bussWaterStationInfoService;
  @Autowired
  private BussStationPosterService bussStationPosterService;
  @Autowired
  ISysUserService sysUserService;
  
  @GetMapping({"/query_station_user/{stpk}"})
  public TableDataInfo queryStationUser(@PathVariable String stpk) {
/*  51 */     SysUser station = new SysUser();
/*  52 */     station.setCloudPk(stpk);
/*  53 */     startPage();
/*  54 */     List<SysUser> list = this.sysUserService.selectUserList(station);
/*  55 */     return getDataTable(list);
  }


  
  @PreAuthor("station:info:list")
  @GetMapping({"/list"})
  public TableDataInfo list(BussWaterStationInfo bussWaterStationInfo) {
/*  63 */     startPage();
/*  64 */     List<BussWaterStationInfo> list = this.bussWaterStationInfoService.selectBussWaterStationInfoList(bussWaterStationInfo);
/*  65 */     return getDataTable(list);
  }




  
  @PreAuthor("station:info:export")
  @Log(title = "水站信息", businessType = BusinessType.EXPORT)
  @PostMapping({"/export"})
  public void export(HttpServletResponse response, BussWaterStationInfo bussWaterStationInfo) {
/*  76 */     List<BussWaterStationInfo> list = this.bussWaterStationInfoService.selectBussWaterStationInfoList(bussWaterStationInfo);
/*  77 */     ExcelUtil<BussWaterStationInfo> util = new ExcelUtil(BussWaterStationInfo.class);
/*  78 */     util.exportExcel(response, list, "水站信息数据");
  }



  
  @PreAuthor("station:info:query")
  @GetMapping({"/{pk}"})
  public RestResult getInfo(@PathVariable("pk") Long pk) {
/*  87 */     return RestResult.ok(this.bussWaterStationInfoService.selectBussWaterStationInfoById(pk));
  }






  
  @PreAuthor("station:info:add")
  @Log(title = "水站信息", businessType = BusinessType.INSERT)
  @PostMapping
  public RestResult add(@RequestBody BussWaterStationInfo se) {
/* 100 */     this.bussWaterStationInfoService.createNewStation(se);
/* 101 */     return RestResult.ok();
  }



  
  @PreAuthor("station:info:edit")
  @Log(title = "水站信息", businessType = BusinessType.UPDATE)
  @PutMapping
  public RestResult edit(@RequestBody BussWaterStationInfo se) {
/* 111 */     int i = this.bussWaterStationInfoService.updateBussWaterStationInfo(se);
/* 112 */     if (StringUtils.isNotBlank(se.getStationCharge())) {
/* 113 */       BussStationPoster ps = this.bussStationPosterService.selectBussStationPosterById(se.getStationCharge());
/* 114 */       if (ps == null) {
/* 115 */         SysUser user = this.sysUserService.selectUserById(se.getStationCharge());
/* 116 */         ps = new BussStationPoster();
/* 117 */         ps.setPk(user.getUserId());
/* 118 */         ps.setUserPk(user.getUserId());
/* 119 */         ps.setStationPk(String.valueOf(se.getPk()));
/* 120 */         ps.setNickName(user.getNickName());
/* 121 */         ps.setPhonenumber(user.getPhonenumber());
/* 122 */         ps.setJoinTime(DateUtils.getTime());
/* 123 */         ps.setPosterStatus("2");
/* 124 */         this.bussStationPosterService.insertBussStationPoster(ps);
      } 
    } 
/* 127 */     return toAjax(i);
  }



  
  @PreAuthor("station:info:remove")
  @Log(title = "水站信息", businessType = BusinessType.DELETE)
  @DeleteMapping({"/{pks}"})
  public RestResult remove(@PathVariable Long[] pks) {
/* 137 */     return toAjax(this.bussWaterStationInfoService.deleteBussWaterStationInfoByIds(pks));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\controller\BussWaterStationInfoController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */