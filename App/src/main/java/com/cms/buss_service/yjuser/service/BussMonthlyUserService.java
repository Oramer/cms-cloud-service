package com.cms.buss_service.yjuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.*;
import com.cms.buss_service.ticket.domain.BussUserTicketInfo;
import com.cms.buss_service.ticket.service.BussUserTicketInfoService;
import com.cms.buss_service.wxpay.TicketTransferVo;
import com.cms.buss_service.yjuser.domain.BussMonthlyUser;
import com.cms.buss_service.yjuser.domain.BussMonthlyUserDetails;
import com.cms.buss_service.yjuser.domain.BussYjOrderInfo;
import com.cms.buss_service.yjuser.domain.ParamsVo;
import com.cms.buss_service.yjuser.mapper.BussMonthlyUserDetailsMapper;
import com.cms.buss_service.yjuser.mapper.BussMonthlyUserMapper;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.mapper.SysUserMapper;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;


@Service
public class BussMonthlyUserService
{
  @Autowired(required = false)
  private BussMonthlyUserMapper bussMonthlyUserMapper;
  @Autowired(required = false)
  private BussMonthlyUserDetailsMapper bussMonthlyUserDetailsMapper;
  
  public BussMonthlyUser selectBussMonthlyUserById(Long id) {
/*  41 */     return this.bussMonthlyUserMapper.selectBussMonthlyUserById(id);
  }
  @Autowired
  private BussUserTicketInfoService bussUserTicketInfoService;
  @Autowired(required = false)
  SysUserMapper sysUserMapper;
  @Autowired
  private BussYjOrderInfoService bussYjOrderInfoService;
  
  public List<BussMonthlyUser> selectBussMonthlyUserList(BussMonthlyUser bussMonthlyUser) {
/*  51 */     return this.bussMonthlyUserMapper.selectBussMonthlyUserList(bussMonthlyUser);
  }






  
  public int insertBussMonthlyUser(BussMonthlyUser bussMonthlyUser) {
/*  61 */     bussMonthlyUser.setCreateTime(DateUtils.getNowDate());
/*  62 */     bussMonthlyUser.setCreateBy(SecurityUtils.getUid());
/*  63 */     return this.bussMonthlyUserMapper.insertBussMonthlyUser(bussMonthlyUser);
  }






  
  public int updateBussMonthlyUser(BussMonthlyUser bussMonthlyUser) {
/*  73 */     bussMonthlyUser.setUpdateTime(DateUtils.getNowDate());
/*  74 */     return this.bussMonthlyUserMapper.updateBussMonthlyUser(bussMonthlyUser);
  }






  
  public int deleteBussMonthlyUserByIds(Long[] ids) {
/*  84 */     return this.bussMonthlyUserMapper.deleteBussMonthlyUserByIds(ids);
  }






  
  public int deleteBussMonthlyUserById(Long id) {
/*  94 */     return this.bussMonthlyUserMapper.deleteBussMonthlyUserById(id);
  }







  
  @Transactional(rollbackFor = {Exception.class})
  public RestResult transferYuejie(TicketTransferVo vo) {
/* 106 */     String wtid = this.sysUserMapper.queryUserGroupId(SecurityUtils.getUid());
/* 107 */     if (StringUtils.isBlank(wtid)) {
/* 108 */       return RestResult.fail("尚未成为月结用户,无法执行此操作");
    }
    
/* 111 */     BussMonthlyUserDetails source = this.bussMonthlyUserDetailsMapper.queryUserInfoByIdAndYjId(SecurityUtils.getUid(), wtid);
/* 112 */     if (source == null || source.getIsManger().intValue() != 1) {
/* 113 */       return RestResult.fail("当前非企业订水管理员,无法执行此操作");
    }
    
/* 116 */     BussMonthlyUserDetails target = this.bussMonthlyUserDetailsMapper.queryUserInfoByIdAndYjId(vo.getTargetUser(), wtid);
/* 117 */     if (target == null) {
/* 118 */       return RestResult.fail("尚无可移交的对象");
    }
/* 120 */     source.setIsManger(Integer.valueOf(0));
/* 121 */     this.bussMonthlyUserDetailsMapper.updateBussMonthlyUserDetails(source);
/* 122 */     target.setIsManger(Integer.valueOf(1));
/* 123 */     this.bussMonthlyUserDetailsMapper.updateBussMonthlyUserDetails(target);

    
/* 126 */     List<BussUserTicketInfo> infos = vo.getTickets();
/* 127 */     if (infos != null && infos.size() > 0) {
/* 128 */       infos.stream().filter(it -> (it.getZcCount().intValue() != 0)).forEach(it -> {
            if (it.getTicketAccount() == it.getZcCount()) {
              it.setUserId(vo.getTargetUser());
              
              this.bussUserTicketInfoService.deleteBussUserTicketInfoById(Long.valueOf(it.getPk().longValue()));
            } 
            
            if (it.getTicketAccount().intValue() > it.getZcCount().intValue()) {
              int syticke = it.getTicketAccount().intValue() - it.getZcCount().intValue();
              
              it.setTicketAccount(Integer.valueOf(syticke));
              this.bussUserTicketInfoService.updateBussUserTicketInfo(it);
              BussUserTicketInfo imfo = new BussUserTicketInfo();
              BeanUtils.copyBeanProp(imfo, it);
              imfo.setPk(null);
              imfo.setTicketAccount(it.getZcCount());
              imfo.setUserId(vo.getTargetUser());
              imfo.setNo15("From Manger Change_" + it.getUserId() + " amount:" + it.getZcCount());
              this.bussUserTicketInfoService.insertBussUserTicketInfo(imfo);
            } 
          });
    }
/* 150 */     return RestResult.ok();
  }
  
  @Transactional(rollbackFor = {Exception.class})
  public RestResult addGroupUser(ParamsVo ps) {
/* 155 */     SysUser user = this.sysUserMapper.selectUserById(SecurityUtils.getUid());
/* 156 */     if (StringUtils.isNotBlank(ps.getPhonenumber())) {
/* 157 */       SysUser targetUser = this.sysUserMapper.checkPhoneUnique(ps.getPhonenumber());
/* 158 */       String wtid = this.sysUserMapper.queryUserGroupId(SecurityUtils.getUid());
/* 159 */       if (StringUtils.isBlank(wtid)) {
/* 160 */         return RestResult.fail("尚未成为月结用户,无法执行此操作");
      }
/* 162 */       if (targetUser != null) {
        
/* 164 */         BussMonthlyUserDetails dd = new BussMonthlyUserDetails();
/* 165 */         dd.setUserId(targetUser.getUserId());
/* 166 */         dd.setMouthUserId(wtid);
/* 167 */         this.bussMonthlyUserDetailsMapper.insertBussMonthlyUserDetails(dd);
      } else {
        
/* 170 */         String uid = IdUtils.get();
/* 171 */         SysUser user1 = new SysUser();
/* 172 */         user1.setUserName(ps.getPhonenumber());
/* 173 */         user1.setPhonenumber(ps.getPhonenumber());
/* 174 */         user1.setNickName(ps.getNickName());
/* 175 */         user1.setUserId(uid);
/* 176 */         user1.setCloudPk(user.getCloudPk());
/* 177 */         this.sysUserMapper.insertUser(user1);
        
/* 179 */         BussMonthlyUserDetails dd = new BussMonthlyUserDetails();
/* 180 */         dd.setUserId(uid);
/* 181 */         dd.setMouthUserId(wtid);
/* 182 */         this.bussMonthlyUserDetailsMapper.insertBussMonthlyUserDetails(dd);
      } 
/* 184 */       return RestResult.ok();
    } 
/* 186 */     return RestResult.fail("参数异常,无法执行此操作");
  }

  
  @Transactional(rollbackFor = {Exception.class})
  public RestResult comfirmQyysApply(Long oid) {
/* 192 */     BussMonthlyUser bussMonthlyUser = this.bussMonthlyUserMapper.selectBussMonthlyUserById(oid);
/* 193 */     bussMonthlyUser.setStatus(Long.valueOf(1L));
/* 194 */     bussMonthlyUser.setStationId(SecurityUtils.getUserStationId());
/* 195 */     this.bussMonthlyUserMapper.updateBussMonthlyUser(bussMonthlyUser);
    
/* 197 */     BussMonthlyUserDetails details = new BussMonthlyUserDetails();
/* 198 */     details.setUserId(bussMonthlyUser.getCreateBy());
/* 199 */     details.setMouthUserId(String.valueOf(bussMonthlyUser.getId()));
/* 200 */     details.setIsManger(Integer.valueOf(1));
/* 201 */     this.bussMonthlyUserDetailsMapper.insertBussMonthlyUserDetails(details);
/* 202 */     return RestResult.ok("企业用户申请确认成功");
  }
  
  public RestResult queryQyyjGroupUser() {
/* 206 */     List<SysUser> sysUsers = this.sysUserMapper.queryMyGroupUser(SecurityUtils.getUid());
/* 207 */     return RestResult.ok(sysUsers);
  }








  
  @Transactional(rollbackFor = {Exception.class})
  public void createYjOrderInfo() {
/* 220 */     BussMonthlyUser us = new BussMonthlyUser();
/* 221 */     us.setStatus(Long.valueOf(1L));
/* 222 */     List<BussMonthlyUser> monthlyUsers = this.bussMonthlyUserMapper.selectBussMonthlyUserList(us);
/* 223 */     if (monthlyUsers != null && monthlyUsers.size() > 0) {
/* 224 */       monthlyUsers.forEach(it -> {
            BigDecimal decimal = this.bussMonthlyUserMapper.selectUserYjOrderInfo(it.getId().toString());
            if (decimal != null && decimal.compareTo(BigDecimal.ZERO) >= 0) {
              Calendar cd = Calendar.getInstance();
              BussYjOrderInfo info = new BussYjOrderInfo();
              info.setPk(IdUtils.get());
              info.setOrderTime(DateUtils.getTime());
              info.setOrderPersion(it.getId().toString());
              info.setAmountofmoney(decimal);
              info.setOyear(Integer.valueOf(cd.get(1)));
              info.setOmouth(Integer.valueOf(cd.get(2) + 1));
              info.setStationId(it.getStationId());
              this.bussYjOrderInfoService.insertBussYjOrderInfo(info);
            } 
          });
    }
  }

  
  public BigDecimal selectUserYjOrderInfo(String uid) {
/* 244 */     return this.bussMonthlyUserMapper.selectUserYjOrderInfo(uid);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\service\BussMonthlyUserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */