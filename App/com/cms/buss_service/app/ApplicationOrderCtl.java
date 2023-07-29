package com.cms.buss_service.app;
import com.alibaba.fastjson.JSON;
import com.cms.base_service.common.model.*;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.buss_service.bucket.domain.BussBucketDetails;
import com.cms.buss_service.bucket.domain.BussBucketInfo;
import com.cms.buss_service.card.domain.BussUserCard;
import com.cms.buss_service.card.service.BussUserCardService;
import com.cms.buss_service.order.domain.BussOrderAppraise;
import com.cms.buss_service.order.domain.BussOrderInfo;
import com.cms.buss_service.order.domain.BussOrderReminder;
import com.cms.buss_service.order.domain.BussOrderTransferRecord;
import com.cms.buss_service.order.domain.BussReceiverMessage;
import com.cms.buss_service.order.domain.ProductVo;
import com.cms.buss_service.order.service.*;
import com.cms.buss_service.poster.domain.BussStationPoster;
import com.cms.buss_service.poster.mapper.BussStationPosterMapper;
import com.cms.buss_service.poster.service.BussStationPosterService;
import com.cms.buss_service.station.domain.BussWaterStationInfo;
import com.cms.buss_service.station.service.BussWaterStationInfoService;
import com.cms.buss_service.weichat.MapLocation;
import com.cms.buss_service.weichat.WeiChatUtils;
import com.cms.buss_service.yjuser.domain.BussYjOrderInfo;
import com.cms.buss_service.yjuser.service.BussYjOrderInfoService;
import com.cms.system_service.system.domain.SysUser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cms.system_service.system.service.ISysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/api"})
public class ApplicationOrderCtl extends BaseCtl {
/*  40 */   private static final Logger log = LoggerFactory.getLogger(com.cms.buss_service.app.ApplicationOrderCtl.class);
  
  @Autowired
  private BussUserCardService bussUserCardService;
  
  @Autowired
  private BussOrderInfoService bussOrderInfoService;
  
  @Autowired
  private BussReceiverMessageService bussReceiverMessageService;
  
  @Autowired
  private BussWaterStationInfoService bussWaterStationInfoService;
  
  @Autowired
  private BussOrderTransferRecordService bussOrderTransferRecordService;
  
  @Autowired
  private BussOrderAppraiseService bussOrderAppraiseService;
  
  @Autowired
  private BussOrderReminderService bussOrderReminderService;
  
  @Autowired
  private ISysUserService sysUserService;
  @Autowired(required = false)
  BussStationPosterMapper bussStationPosterMapper;
  @Autowired
  BussYjOrderInfoService bussYjOrderInfoService;
  @Autowired
  private BussStationPosterService bussStationPosterService;
  
  @GetMapping({"/user/lastorder"})
  public RestResult queryUserLastOrderInfo() {
/*  74 */     return RestResult.ok(this.bussOrderInfoService.queryUserLastOrderInfo(SecurityUtils.getUid()));
  }



  
  @PostMapping({"/buss/card/add/{productId}"})
  public RestResult addcard(@PathVariable String productId) {
/*  82 */     BussUserCard bussUserCard = new BussUserCard();
/*  83 */     bussUserCard.setProductPk(productId);
/*  84 */     bussUserCard.setUserPk(SecurityUtils.getUid());
/*  85 */     this.bussUserCardService.insertBussUserCard(bussUserCard);
/*  86 */     return RestResult.ok();
  }






  
  @GetMapping({"/buss/card/list"})
  public TableDataInfo listcard(BussUserCard bussUserCard) {
/*  97 */     bussUserCard.setUserPk(SecurityUtils.getUid());
/*  98 */     List<Map<String, Object>> list = this.bussUserCardService.selectBussUserCardProductInfoList(bussUserCard);
/*  99 */     return getDataTable(list);
  }
  
  @PostMapping({"/buss/card/update"})
  public RestResult updateCollection(@RequestBody BussUserCard bussUserCard) {
/* 104 */     return RestResult.ok().setData(Integer.valueOf(this.bussUserCardService.updateBussUserCard(bussUserCard)));
  }






  
  @GetMapping({"/buss/card/romove/{pks}"})
  public RestResult remove(@PathVariable String pks) {
/* 115 */     BussUserCard cd = new BussUserCard();
/* 116 */     cd.setUserPk(SecurityUtils.getUid());
/* 117 */     cd.setProductPk(pks);
/* 118 */     return toAjax(this.bussUserCardService.deleteBussUserCardByPj(cd));
  }





  
  @PostMapping({"/order/info/add"})
  public RestResult addORder(@RequestParam String vo) {
/* 128 */     List<ProductVo> vos = JSON.parseArray(vo, ProductVo.class);
/* 129 */     vos.forEach(is -> log.error(is.getProductPk() + ".........." + is.getChosecount()));





    
/* 136 */     return null;
  }






  
  @PostMapping({"/order/info/pd_poster"})
  public RestResult updateOrderPoster(@RequestBody BussOrderInfo info) {
/* 147 */     if (StringUtils.isBlank(info.getPk())) {
/* 148 */       return RestResult.fail("订单信息不存在");
    }
/* 150 */     if (StringUtils.isBlank(info.getNo5())) {
/* 151 */       return RestResult.fail("派单员信息缺失");
    }
/* 153 */     BussStationPoster poster1 = this.bussStationPosterMapper.selectBussStationPosterById(info.getNo5());
/* 154 */     if (poster1 == null) {
/* 155 */       log.error("开始添加派单员............." + info.getNo5());
/* 156 */       SysUser user = this.sysUserService.selectUserById(StringUtils.isNotBlank(info.getNo5()) ? info.getNo5() : SecurityUtils.getUid());
/* 157 */       log.error("开始添加派单员............." + user.getUserId());
/* 158 */       if (user != null) {
/* 159 */         BussStationPoster poster = new BussStationPoster();
/* 160 */         poster.setPk(user.getUserId());
/* 161 */         poster.setUserPk(user.getUserId());
/* 162 */         poster.setStationPk(String.valueOf(info.getStationId()));
/* 163 */         poster.setNickName(user.getNickName());
/* 164 */         poster.setPhonenumber(user.getPhonenumber());
/* 165 */         poster.setJoinTime(DateUtils.getTime());
/* 166 */         poster.setPosterStatus("2");
/* 167 */         this.bussStationPosterMapper.insertBussStationPoster(poster);
      } else {
/* 169 */         return RestResult.fail("派单员信息异常");
      } 
    } 

    
/* 174 */     info.setOrderStatus(OrderEnum.ORDER_YQX.getCode());
/* 175 */     return RestResult.ok(Integer.valueOf(this.bussOrderInfoService.updateBussOrderInfo(info)));
  }






  
  @GetMapping({"/order/address/list"})
  public TableDataInfo listAddr(BussReceiverMessage bussReceiverMessage) {
/* 186 */     startPage();
/* 187 */     List<BussReceiverMessage> list = this.bussReceiverMessageService.selectBussReceiverMessageList(bussReceiverMessage);
/* 188 */     return getDataTable(list);
  }
  
  @PostMapping({"/order/address/add"})
  public RestResult addAddr(@RequestBody BussReceiverMessage msg) {
/* 193 */     MapLocation loc = WeiChatUtils.getPointByAddress(msg.getProvince() + msg.getCity() + msg.getCounty() + msg.getDetailes());
/* 194 */     System.out.println(loc.getLat() + "--loc.ge" + loc.getLng());
/* 195 */     msg.setNo3(loc.getLat());
/* 196 */     msg.setNo4(loc.getLng());
/* 197 */     return toAjax(this.bussReceiverMessageService.insertBussReceiverMessage(msg));
  }

  
  @PostMapping({"/order/address/delete/{oid}"})
  public RestResult addAddr(@PathVariable Long oid) {
/* 203 */     return toAjax(this.bussReceiverMessageService.deleteBussReceiverMessageById(oid));
  }



  
  @PostMapping({"/order/address/edit"})
  public RestResult editAddr(@RequestBody BussReceiverMessage msg) {
/* 211 */     MapLocation loc = WeiChatUtils.getPointByAddress(msg.getProvince() + msg.getCity() + msg.getCounty() + msg.getDetailes());
/* 212 */     System.out.println(loc.getLat() + "--loc.ge" + loc.getLng());
/* 213 */     msg.setNo3(loc.getLat());
/* 214 */     msg.setNo4(loc.getLng());
/* 215 */     return toAjax(this.bussReceiverMessageService.updateBussReceiverMessage(msg));
  }






  
  @GetMapping({"/order/address/{id}"})
  public RestResult getInfoAddr(@PathVariable("id") Long id) {
/* 226 */     return RestResult.ok(this.bussReceiverMessageService.selectBussReceiverMessageById(id));
  }






  
  @GetMapping({"/order/info/list"})
  public TableDataInfo orderlist(BussOrderInfo bussOrderInfo) {
/* 237 */     startPage();
/* 238 */     List<BussOrderInfo> list = this.bussOrderInfoService.selectBussOrderInfoList(bussOrderInfo);
/* 239 */     return getDataTable(list);
  }






  
  @GetMapping({"/order/info/yj_list/{yjId}"})
  public TableDataInfo yj_list(@PathVariable String yjId) {
/* 250 */     BussYjOrderInfo is = this.bussYjOrderInfoService.selectBussYjOrderInfoById(yjId);
/* 251 */     startPage();
/* 252 */     List<BussOrderInfo> list = this.bussOrderInfoService.selectBussOrderInfoListForYj(is);
/* 253 */     return getDataTable(list);
  }
  
  @GetMapping({"/user/bucket_info/{userId}"})
  public RestResult queryUserQytInfo(@PathVariable String userId) {
/* 258 */     BussBucketInfo bd = new BussBucketInfo();
/* 259 */     bd.setUserPk(userId);
/* 260 */     List<BussBucketDetails> bprds = this.bussOrderInfoService.queryUserYtInfo(bd);
/* 261 */     List<BussBucketDetails> blrds = this.bussOrderInfoService.queryUserQtInfo(bd);
/* 262 */     HashMap<String, Object> map = new HashMap<>();
/* 263 */     map.put("bprds", bprds);
/* 264 */     map.put("blrds", blrds);
/* 265 */     return RestResult.ok(map);
  }

  
  @GetMapping({"/order/info/cancelpd/{orderId}"})
  public RestResult cancelOrderPd(@PathVariable String orderId) {
/* 271 */     BussOrderInfo info = this.bussOrderInfoService.selectBussOrderInfoById(orderId);
/* 272 */     if (!info.getOrderStatus().equals(OrderEnum.ORDER_YQX.getCode())) {
/* 273 */       return RestResult.fail("当前订单状态不允许取消派单");
    }
    
/* 276 */     this.bussOrderInfoService.cancelOrderPd(info);
/* 277 */     return RestResult.ok();
  }







  
  @GetMapping({"/order/info/cdlist"})
  public TableDataInfo orderCdlist(BussOrderInfo bussOrderInfo) {
/* 289 */     startPage();
/* 290 */     List<BussOrderInfo> list = this.bussOrderInfoService.selectUserReminderList(bussOrderInfo);
/* 291 */     return getDataTable(list);
  }





  
  @GetMapping({"/order/info/transfer/{orderPk}"})
  public RestResult transfer(@PathVariable String orderPk) {
/* 301 */     BussOrderInfo info = this.bussOrderInfoService.selectBussOrderInfoById(orderPk);
/* 302 */     if (info.getOrderStatus().longValue() > 2L) {
/* 303 */       return RestResult.fail("订单状态不支持转单");
    }
/* 305 */     BussOrderTransferRecord rd = new BussOrderTransferRecord();
/* 306 */     rd.setOrderId(orderPk);
/* 307 */     rd.setStationId(String.valueOf(info.getStationId()));
/* 308 */     this.bussOrderTransferRecordService.insertBussOrderTransferRecord(rd);

    
/* 311 */     info.setStationId(Long.valueOf(-1L));
/* 312 */     this.bussOrderInfoService.updateBussOrderInfo(info);




    
/* 318 */     return RestResult.ok();
  }
  
  @GetMapping({"/order/info/orderCount"})
  public RestResult queryOrderCount(BussOrderInfo info) {
/* 323 */     return RestResult.ok(this.bussOrderInfoService.queryOrderCount(info));
  }





  
  @GetMapping({"/mystation_tj"})
  public RestResult queryMyStationInTjInfo(BussOrderInfo info) {
/* 333 */     info.setStationId(SecurityUtils.getUserStationId());
/* 334 */     info.setNo5(SecurityUtils.getUid());
/* 335 */     Map<String, Object> om = this.bussOrderInfoService.queryMyStationInTjInfo(info);
/* 336 */     return RestResult.ok(om);
  }









  
  @GetMapping({"/order/info/transfer_confirm/{orderPk}"})
  public RestResult transfer_confirm(@PathVariable String orderPk) {
/* 350 */     BussOrderInfo info = this.bussOrderInfoService.selectBussOrderInfoById(orderPk);
    
/* 352 */     SysUser user = this.sysUserService.selectUserById(info.getOrderPersion());
/* 353 */     Boolean ba = this.bussWaterStationInfoService.checkIsStationManger(user.getUserId());
/* 354 */     Boolean bb = this.bussStationPosterService.checkIsPoster(user.getUserId());
/* 355 */     if (!ba.booleanValue() && !bb.booleanValue()) {
/* 356 */       user.setCloudPk(String.valueOf(SecurityUtils.getUserStationId()));
/* 357 */       this.sysUserService.updateUser(user);
    } 
    
/* 360 */     if (info.getOrderStatus().longValue() > 2L) {
/* 361 */       return RestResult.fail("订单状态不支持接单");
    }



    
/* 367 */     info.setStationId(SecurityUtils.getUserStationId());
/* 368 */     this.bussOrderInfoService.updateBussOrderInfo(info);
    
/* 370 */     return RestResult.ok();
  }
  
  @GetMapping({"/order/info/{orderPk}"})
  public RestResult orderlist(@PathVariable String orderPk) {
/* 375 */     BussOrderInfo list = this.bussOrderInfoService.selectBussOrderInfoById(orderPk);
/* 376 */     return RestResult.ok(list);
  }






  
  @PostMapping({"/order/info/group"})
  public RestResult updateOrdert(@RequestBody BussOrderInfo info) {
/* 387 */     if (StringUtils.isBlank(info.getPk()) && StringUtils.isBlank(info.getNo6())) {
/* 388 */       return RestResult.fail("分组失败,参数缺失");
    }
/* 390 */     this.bussOrderInfoService.updateBussOrderInfo(info);
/* 391 */     return RestResult.ok().setMsg("订单分组成功");
  }
  
  @GetMapping({"/station/info/my"})
  public RestResult queryMyStation(BussWaterStationInfo bussWaterStationInfo) {
/* 396 */     if (bussWaterStationInfo.getPk() == null) {
/* 397 */       bussWaterStationInfo.setPk(Constants.SYSTEM_ADMIN_STATION_ID);
    }
/* 399 */     bussWaterStationInfo.setNo1("1");
/* 400 */     BussWaterStationInfo list = this.bussWaterStationInfoService.queryMyStationInfo(bussWaterStationInfo);
/* 401 */     return RestResult.ok(list);
  }







  
  @GetMapping({"/order/invoiceinfo/list"})
  public TableDataInfo orderInvoicelist(BussOrderInfo bussOrderInfo) {
/* 413 */     bussOrderInfo.setOrderPersion(SecurityUtils.getUid());
/* 414 */     startPage();
/* 415 */     List<BussOrderInfo> list = this.bussOrderInfoService.selectBussOrderInvoiceList(bussOrderInfo);
/* 416 */     return getDataTable(list);
  }



  
  @GetMapping({"/order/appraise/list"})
  public TableDataInfo list(BussOrderAppraise bussOrderAppraise) {
/* 424 */     bussOrderAppraise.setNo5(SecurityUtils.getUid());
/* 425 */     startPage();
/* 426 */     List<BussOrderAppraise> list = this.bussOrderAppraiseService.selectBussOrderAppraiseList(bussOrderAppraise);
/* 427 */     return getDataTable(list);
  }






  
  @PostMapping({"/order/reminder/add"})
  public RestResult add(@RequestBody BussOrderReminder bussOrderReminder) {
/* 438 */     int rows = this.bussOrderReminderService.insertBussOrderReminder(bussOrderReminder);
/* 439 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }






  
  @GetMapping({"/order/group_count"})
  public RestResult queryOrderGroupInfo(BussOrderInfo info) {
/* 450 */     info.setNo5(SecurityUtils.getUid());
/* 451 */     return RestResult.ok(this.bussOrderInfoService.queryOrderGroupInfo(info));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationOrderCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */