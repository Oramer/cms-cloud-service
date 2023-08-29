package com.cms.buss_service.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.IdUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.buss_service.order.domain.BussOrderInfo;
import com.cms.buss_service.order.service.BussOrderInfoService;
import com.cms.buss_service.poster.domain.*;
import com.cms.buss_service.poster.mapper.BussStationPosterMapper;
import com.cms.buss_service.poster.service.BussPosterDistanceDeductService;
import com.cms.buss_service.poster.service.BussStationPosterService;
import com.cms.buss_service.station.domain.BussStationClimbFee;
import com.cms.buss_service.station.domain.BussStationInountRecord;
import com.cms.buss_service.station.service.BussStationClimbFeeService;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.mapper.SysUserMapper;
import com.cms.system_service.system.service.ISysUserService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
/*     */
/*     */

/*     */
@RestController
@RequestMapping({"/api"})
public class ApplicationPosterCtl extends BaseCtl {
/*  34 */   private static final Logger log = LoggerFactory.getLogger(ApplicationPosterCtl.class);

  @Autowired
  private BussStationPosterService bussStationPosterService;

  @Autowired
  private BussPosterDistanceDeductService bussPosterDistanceDeductService;

  @Autowired
  private BussStationClimbFeeService bussStationClimbFeeService;

  @Autowired
  private BussOrderInfoService bussOrderInfoService;

  @Autowired
  private ISysUserService userService;
  @Autowired(required = false)
  SysUserMapper sysUserMapper;
  @Autowired(required = false)
  BussStationPosterMapper bussStationPosterMapper;

  @GetMapping({"/buss/poster/sq"})
  public RestResult addPoster(BussStationPoster ps) {
/*  57 */     SysUser user = this.userService.selectUserById(SecurityUtils.getUid());
/*  58 */     ps.setUserPk(SecurityUtils.getUid());
/*  59 */     ps.setPk(SecurityUtils.getUid());
/*  60 */     ps.setStationPk(String.valueOf(SecurityUtils.getUserStationId()));
/*  61 */     ps.setAvatar((user != null) ? user.getAvatar() : "");
/*  62 */     this.bussStationPosterService.insertBussStationPoster(ps);
/*  63 */     return RestResult.ok().setData(SecurityUtils.getUid()).setMsg("申请信息提交成功,等待管理员审核");
  }






  @PostMapping({"/buss/poster/sq2"})
  public RestResult addPoster2(@RequestBody BussStationPoster ps) {
    try {
/*  74 */       String posterPk = IdUtils.get();
/*  75 */       SysUser user = this.sysUserMapper.checkPhoneUnique(ps.getPhonenumber());
/*  76 */       if (user == null) {
/*  77 */         SysUser user1 = new SysUser();
/*  78 */         user1.setUserName(ps.getPhonenumber());
/*  79 */         user1.setPhonenumber(ps.getPhonenumber());
/*  80 */         user1.setUserId(posterPk);
/*  81 */         user1.setCloudPk(String.valueOf(SecurityUtils.getUserStationId()));
/*  82 */         user1.setCreateTime(DateUtils.getTime());
/*  83 */         this.sysUserMapper.insertUser(user1);
      } else {
/*  85 */         posterPk = user.getUserId();
      }
/*  87 */       ps.setPk(posterPk);
/*  88 */       ps.setUserPk(posterPk);
/*  89 */       ps.setStationPk(String.valueOf(SecurityUtils.getUserStationId()));
/*  90 */       ps.setJoinTime(DateUtils.getTime());
/*  91 */       this.bussStationPosterMapper.insertBussStationPoster(ps);
/*  92 */       return RestResult.ok().setMsg("操作成功");
/*  93 */     } catch (DuplicateKeyException e) {
/*  94 */       log.error(e.getMessage());
/*  95 */       return RestResult.fail().setMsg("当前用户已是其他水站派单员,请勿重复添加");
    }
  }








  @GetMapping({"/buss/poster/list"})
  public TableDataInfo list(BussStationPoster bussStationPoster) {
/* 108 */     bussStationPoster.setStationPk(String.valueOf(SecurityUtils.getUserStationId()));
/* 109 */     startPage();
/* 110 */     List<BussStationPoster> list = this.bussStationPosterService.selectBussStationPosterList(bussStationPoster);
/* 111 */     return getDataTable(list);
  }







  @GetMapping({"/buss/poster/details"})
  public RestResult detailslist(BussStationPoster bussStationPoster) {
/* 122 */     startPage();
/* 123 */     PosterDetailsVo list = this.bussStationPosterService.selectPosterDetailsVo(bussStationPoster);
/* 124 */     return RestResult.ok(list);
  }







  @GetMapping({"/buss/poster/verify/{pid}"})
  public RestResult verify(@PathVariable String pid) {
/* 135 */     BussStationPoster ps = this.bussStationPosterService.selectBussStationPosterById(pid);
/* 136 */     if ("1".equalsIgnoreCase(ps.getPosterStatus())) {
/* 137 */       ps.setPosterStatus("2");
/* 138 */       this.bussStationPosterService.updateBussStationPoster(ps);
/* 139 */       return RestResult.ok();
    }
/* 141 */     return RestResult.fail("状态异常无法执行此操作");
  }







  @PostMapping({"/buss/poster_distance/add"})
  public RestResult add(@RequestBody PosterUserVo vo) {
/* 152 */     if (StringUtils.isEmpty(vo.getUserIds())) {
/* 153 */       return RestResult.fail("用户信息缺失");
    }
/* 155 */     if (StringUtils.isEmpty(vo.getPosterIds())) {
/* 156 */       return RestResult.fail("配送员信息缺失");
    }
/* 158 */     List<String> users = Arrays.asList(vo.getUserIds().split(","));
/* 159 */     List<String> posters = Arrays.asList(vo.getPosterIds().split(","));
/* 160 */     Long userStationId = SecurityUtils.getUserStationId();
/* 161 */     users.forEach(uss -> {
          if (StringUtils.isNotEmpty(uss)) {
              posters.forEach(poster ->{});
          }
        });









/* 175 */     return RestResult.ok("操作成功");
  }







  @GetMapping({"/buss/poster_distance/list"})
  public TableDataInfo poster_distance_list(DistanceDeductVo bussPosterDistanceDeduct) {
/* 186 */     bussPosterDistanceDeduct.setStationId(String.valueOf(SecurityUtils.getUserStationId()));
/* 187 */     startPage();
/* 188 */     List<DistanceDeductVo> list = this.bussPosterDistanceDeductService.selectBussPosterDistanceDeductMapList((BussPosterDistanceDeduct)bussPosterDistanceDeduct);
/* 189 */     return getDataTable(list);
  }

  @PostMapping({"/buss/poster_distance/update"})
  public RestResult poster_distance_update(@RequestBody DistanceDeductVo bussPosterDistanceDeduct) {
/* 194 */     this.bussPosterDistanceDeductService.updateBussPosterDistanceDeduct((BussPosterDistanceDeduct)bussPosterDistanceDeduct);
/* 195 */     return RestResult.ok().setMsg("修改成功");
  }








  @PostMapping({"/buss/climb_fee/add"})
  public RestResult add(@RequestBody BussStationClimbFee bussStationClimbFee) {
/* 207 */     return toAjax(this.bussStationClimbFeeService.insertBussStationClimbFee(bussStationClimbFee));
  }






  @GetMapping({"/buss/climb_fee/query"})
  public RestResult queryClimbFee() {
/* 217 */     return RestResult.ok(this.bussStationClimbFeeService.queryClimbFeeByStationPk(new BussStationClimbFee()));
  }


  @GetMapping({"/buss/poster/queryPosterTjInfo"})
  public RestResult queryPosterTjInfo(BussStationPoster po) {
/* 223 */     return RestResult.ok(this.bussStationPosterService.queryPosterTjInfo(po));
  }







  @GetMapping({"/buss/poster/queryUserIncome"})
  public RestResult queryUserIncome(BussStationInountRecord po) {
/* 234 */     return RestResult.ok(this.bussStationPosterService.queryUserIncome(po));
  }







  @GetMapping({"/my_tj_info"})
  public RestResult queryMyStationInTjInfo(BussOrderInfo info) {
/* 245 */     info.setCreateBy(SecurityUtils.getUid());
/* 246 */     Map<String, Object> om = this.bussOrderInfoService.queryPosterTjInfo(info);
/* 247 */     return RestResult.ok(om);
  }






  @GetMapping({"/buss/poster/my_child_details"})
  public RestResult queryMyChildPoster(BussStationPoster bussStationPoster) {
/* 257 */     startPage();
/* 258 */     List<Map<String, Object>> posterDetailsVos = this.bussStationPosterService.selectMyChildPoster(bussStationPoster);
/* 259 */     return RestResult.ok(posterDetailsVos);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationPosterCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */