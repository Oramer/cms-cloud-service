package com.cms.buss_service.yjuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.buss_service.yjuser.domain.BussYjOrderInfo;
import com.cms.buss_service.yjuser.mapper.BussYjOrderInfoMapper;
import com.cms.system_service.system.mapper.SysUserMapper;

import java.math.BigDecimal;
import java.util.List;


@Service
public class BussYjOrderInfoService
{
  @Autowired(required = false)
  private BussYjOrderInfoMapper bussYjOrderInfoMapper;
  @Autowired(required = false)
  SysUserMapper sysUserMapper;
  
  public BussYjOrderInfo selectBussYjOrderInfoById(String pk) {
/*  34 */     return this.bussYjOrderInfoMapper.selectBussYjOrderInfoById(pk);
  }






  
  public List<BussYjOrderInfo> selectBussYjOrderInfoList(BussYjOrderInfo info) {
/*  44 */     if (info.getStationId() == null) {
/*  45 */       String wtid = this.sysUserMapper.queryUserGroupId(SecurityUtils.getUid());
/*  46 */       info.setOrderPersion(wtid);
    } 
/*  48 */     return this.bussYjOrderInfoMapper.selectBussYjOrderInfoList(info);
  }








  
  public int insertBussYjOrderInfo(BussYjOrderInfo bussYjOrderInfo) {
/*  60 */     bussYjOrderInfo.setCreateTime(DateUtils.getTime());
/*  61 */     return this.bussYjOrderInfoMapper.insertBussYjOrderInfo(bussYjOrderInfo);
  }







  
  public int updateBussYjOrderInfo(BussYjOrderInfo bussYjOrderInfo) {
/*  72 */     bussYjOrderInfo.setUpdateTime(DateUtils.getTime());
/*  73 */     return this.bussYjOrderInfoMapper.updateBussYjOrderInfo(bussYjOrderInfo);
  }






  
  public int deleteBussYjOrderInfoByIds(String[] pks) {
/*  83 */     return this.bussYjOrderInfoMapper.deleteBussYjOrderInfoByIds(pks);
  }






  
  public int deleteBussYjOrderInfoById(String pk) {
/*  93 */     return this.bussYjOrderInfoMapper.deleteBussYjOrderInfoById(pk);
  }



  
  public BigDecimal queryYjDaiZhifuInfo(BussYjOrderInfo info) {
/* 100 */     if (info.getStationId() == null) {
/* 101 */       String wtid = this.sysUserMapper.queryUserGroupId(SecurityUtils.getUid());
/* 102 */       info.setOrderPersion(wtid);
    } 
/* 104 */     return this.bussYjOrderInfoMapper.queryYjDaiZhifuInfo(info);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\yjuser\service\BussYjOrderInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */