package com.cms.buss_service.app;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.buss_service.wxpay.BuildOrderInfoSevice;
import com.cms.buss_service.wxpay.TicketTransferVo;
import com.cms.buss_service.wxpay.WxReturnVo;
import com.cms.buss_service.yjuser.domain.BussMonthlyUser;
import com.cms.buss_service.yjuser.domain.BussYjOrderInfo;
import com.cms.buss_service.yjuser.domain.ParamsVo;
import com.cms.buss_service.yjuser.domain.PrepareYueJieVo;
import com.cms.buss_service.yjuser.mapper.BussMonthlyUserDetailsMapper;
import com.cms.buss_service.yjuser.service.BussMonthlyUserService;
import com.cms.buss_service.yjuser.service.BussYjOrderInfoService;

import java.util.List;

@RestController
@RequestMapping({"/api/yj_user"})
public class ApplicationForYjUser extends BaseCtl {
    /*  29 */   private static final Logger log = LoggerFactory.getLogger(ApplicationForYjUser.class);


    @Autowired
    private BussMonthlyUserService bussMonthlyUserService;


    @Autowired
    private BussYjOrderInfoService bussYjOrderInfoService;

    @Autowired
    protected BuildOrderInfoSevice buildService;

    @Autowired(required = false)
    private BussMonthlyUserDetailsMapper bussMonthlyUserDetailsMapper;


    @PostMapping({"/add"})
    public RestResult add(@RequestBody BussMonthlyUser bussMonthlyUser) {
        /*  48 */
        int rows = this.bussMonthlyUserService.insertBussMonthlyUser(bussMonthlyUser);
        /*  49 */
        return (rows > 0) ? RestResult.ok() : RestResult.fail();
    }

    @PostMapping({"/edit"})
    public RestResult edit(@RequestBody BussMonthlyUser bussMonthlyUser) {
        /*  54 */
        int rows = this.bussMonthlyUserService.updateBussMonthlyUser(bussMonthlyUser);
        /*  55 */
        return (rows > 0) ? RestResult.ok() : RestResult.fail();
    }

    @GetMapping({"/list"})
    public TableDataInfo list(BussMonthlyUser bussMonthlyUser) {
        /*  60 */
        startPage();
        /*  61 */
        List<BussMonthlyUser> list = this.bussMonthlyUserService.selectBussMonthlyUserList(bussMonthlyUser);
        /*  62 */
        return getDataTable(list);
    }


    @GetMapping({"/group_user"})
    public RestResult group_user() {
        /*  68 */
        return this.bussMonthlyUserService.queryQyyjGroupUser();
    }

    @PostMapping({"/group_user_add"})
    public RestResult addPoster2(@RequestBody ParamsVo ps) {
        /*  73 */
        return this.bussMonthlyUserService.addGroupUser(ps);
    }


    @GetMapping({"/confirm/{oid}"})
    public RestResult confirmSq(@PathVariable Long oid) {
        /*  86 */
        return this.bussMonthlyUserService.comfirmQyysApply(oid);
    }


    @PostMapping({"/tranfer_manger"})
    public RestResult confirmSq(@RequestBody TicketTransferVo vo) {
        /*  98 */
        return this.bussMonthlyUserService.transferYuejie(vo);
    }


    @GetMapping({"/my_yj_order"})
    public RestResult queryYjOrderList(BussYjOrderInfo info) {
        /* 110 */
        return RestResult.ok(this.bussYjOrderInfoService.selectBussYjOrderInfoList(info));
    }


    @GetMapping({"/my_yj_order_money"})
    public RestResult queryYjDaiZhifuInfo(BussYjOrderInfo info) {
        /* 116 */
        return RestResult.ok(this.bussYjOrderInfoService.queryYjDaiZhifuInfo(info));
    }


    @PostMapping({"/to_payforyj"})
    public RestResult to_payforyj(@RequestBody PrepareYueJieVo vo) {
        /* 123 */
        BussYjOrderInfo dds = this.bussYjOrderInfoService.selectBussYjOrderInfoById(vo.getOrderId());
        /* 124 */
        if (dds != null && dds.getOrderStatus().longValue() == 1L) {

            /* 126 */
            RestResult rss = this.buildService.prepareYjPayInfo("月结订单支付", vo.getOrderId(), dds.getAmountofmoney(), vo.getOpenid());
            /* 127 */
            String prepareInfo = JSON.toJSONString(rss.getData());
            /* 128 */
            WxReturnVo rt = (WxReturnVo) JSON.parseObject(prepareInfo, WxReturnVo.class);
            /* 129 */
            vo.setPrepareInfo(prepareInfo);
            /* 130 */
            vo.setWx_trade_no(rt.getWx_trade_no());
            /* 131 */
            vo.setUserId(SecurityUtils.getUid());


            /* 134 */
            return RestResult.ok("success", prepareInfo);
        }
        /* 136 */
        return RestResult.fail("参数异常, 订单不存在或已支付, 请刷新重试");
    }


    @PostMapping({"/confirm_xx_pay"})
    public RestResult confirm_xx_pay(@RequestBody BussYjOrderInfo vo) {
        /* 146 */
        if (StringUtils.isNotBlank(vo.getPk()) && StringUtils.isNotBlank(vo.getNo11())) {
            /* 147 */
            vo.setNo12("Y");
            /* 148 */
            this.bussYjOrderInfoService.updateBussYjOrderInfo(vo);
            /* 149 */
            return RestResult.ok();
        }
        /* 151 */
        return RestResult.fail("请填写打款方式");
    }


    @PostMapping({"/confirm_shsk"})
    public RestResult confirm_shsk(@RequestBody BussYjOrderInfo vo) {
        /* 161 */
        if (StringUtils.isNotBlank(vo.getPk())) {
            /* 162 */
            vo.setOrderStatus(Long.valueOf(2L));
            /* 163 */
            this.bussYjOrderInfoService.updateBussYjOrderInfo(vo);
            /* 164 */
            return RestResult.ok();
        }
        /* 166 */
        return RestResult.fail("参数异常");
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationForYjUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */