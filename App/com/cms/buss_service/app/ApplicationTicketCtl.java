package com.cms.buss_service.app;

import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.buss_service.product.domain.BussProductInfo;
import com.cms.buss_service.product.service.BussProductInfoService;
import com.cms.buss_service.ticket.domain.BussTicketInfo;
import com.cms.buss_service.ticket.domain.BussUserTicketInfo;
import com.cms.buss_service.ticket.service.BussTicketInfoService;
import com.cms.buss_service.ticket.service.BussUserTicketInfoService;
import com.cms.system_service.system.mapper.SysUserMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/api"})
public class ApplicationTicketCtl extends BaseCtl {
    /*  26 */   private static final Logger log = LoggerFactory.getLogger(com.cms.buss_service.app.ApplicationTicketCtl.class);

    @Autowired
    private BussTicketInfoService bussTicketInfoService;
    @Autowired
    private BussUserTicketInfoService bussUserTicketInfoService;
    @Autowired
    private BussProductInfoService bussProductInfoService;
    @Autowired(required = false)
    SysUserMapper sysUserMapper;

    @PostMapping({"/ticket/info/add"})
    public RestResult add(@RequestBody BussTicketInfo bussTicketInfo) {
        try {
            /*  40 */
            if (bussTicketInfo.getpBasic() == null || bussTicketInfo.getpBonus() == null) {
                /*  41 */
                return RestResult.fail("当前满赠规则参数异常满赠条件缺失");
            }
            /*  43 */
            bussTicketInfo.setRuleName("满" + bussTicketInfo.getpBasic() + "赠" + bussTicketInfo.getpBonus());
            /*  44 */
            return RestResult.ok(Integer.valueOf(this.bussTicketInfoService.insertBussTicketInfo(bussTicketInfo)));
            /*  45 */
        } catch (DuplicateKeyException e) {
            /*  46 */
            return RestResult.fail("当前满赠规则已存在请勿重复添加");
        }
    }


    @GetMapping({"/ticket/info/delete/{ticketId}"})
    public RestResult add(@PathVariable String ticketId) {
        try {
            /*  54 */
            BussTicketInfo io = new BussTicketInfo();
            /*  55 */
            io.setPk(ticketId);
            /*  56 */
            io.setNo1("Y");
            /*  57 */
            this.bussTicketInfoService.updateBussTicketInfo(io);
            /*  58 */
            return RestResult.ok("删除成功");
            /*  59 */
        } catch (DuplicateKeyException e) {
            /*  60 */
            return RestResult.fail("当前满赠规则已存在请勿重复添加");
        }
    }


    @GetMapping({"/ticket/my_tickets"})
    public TableDataInfo list(BussUserTicketInfo info) {
        /*  75 */
        HashMap<String, Object> map = new HashMap<>();
        /*  76 */
        info.setUserId(SecurityUtils.getUid());

        /*  78 */
        List<BussUserTicketInfo> list = this.bussUserTicketInfoService.selectBussUserTicketInfoList(info);
        /*  79 */
        HashSet<BussUserTicketInfo> userTicketInfos = new HashSet<>(list);
        /*  80 */
        String wtid = this.sysUserMapper.queryUserGroupId(SecurityUtils.getUid());
        /*  81 */
        if (StringUtils.isNotEmpty(wtid)) {
            /*  82 */
            List<BussUserTicketInfo> groupTicket = this.bussUserTicketInfoService.queryYjGroupTicketInfo(wtid);
            /*  83 */
            userTicketInfos.addAll(groupTicket);
        }
        /*  85 */
        return getDataTable(new ArrayList<>(userTicketInfos));
    }

    @GetMapping({"/ticket/query_by_productpk"})
    public RestResult query_by_productpk(BussUserTicketInfo info) {
        /*  90 */
        BussProductInfo list = this.bussProductInfoService.selectBussProductInfoById(info.getProductId());
        /*  91 */
        return RestResult.ok(list);
    }


    @PostMapping({"/ticket/sendTicket"})
    public RestResult sendTicket(@RequestBody BussUserTicketInfo info) {
        /* 101 */
        if (info.getTicketAccount() == null || info.getTicketAccount().intValue() == 0) {
            /* 102 */
            return RestResult.fail("参数异常,发送水票数量缺失");
        }
        /* 104 */
        if (StringUtils.isEmpty(info.getProductId()) || StringUtils.isEmpty(info.getUserId())) {
            /* 105 */
            return RestResult.fail("参数异常,发送水票信息或用户信息缺失");
        }
        /* 107 */
        BussUserTicketInfo ts = new BussUserTicketInfo();
        /* 108 */
        ts.setProductId(info.getProductId());
        /* 109 */
        ts.setUserId(info.getUserId());
        /* 110 */
        List<BussUserTicketInfo> tssList = this.bussUserTicketInfoService.selectBussUserTicketInfoList(ts);
        /* 111 */
        if (tssList != null && tssList.size() > 0) {

            /* 113 */
            BussUserTicketInfo ticketInfo = tssList.get(0);
            /* 114 */
            Integer ticketAccount = ticketInfo.getTicketAccount();
            /* 115 */
            ticketInfo.setTicketAccount(Integer.valueOf(ticketAccount.intValue() + info.getTicketAccount().intValue()));
            /* 116 */
            this.bussUserTicketInfoService.updateBussUserTicketInfo(ticketInfo);
        } else {

            /* 119 */
            this.bussUserTicketInfoService.insertBussUserTicketInfo(info);
        }
        /* 121 */
        log.info("水票信息发送成功..........");
        /* 122 */
        return RestResult.ok("水票信息发送成功");
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationTicketCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */