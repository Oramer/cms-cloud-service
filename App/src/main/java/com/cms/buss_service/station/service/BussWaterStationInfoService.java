package com.cms.buss_service.station.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.buss_service.poster.domain.BussStationPoster;
import com.cms.buss_service.poster.service.BussStationPosterService;
import com.cms.buss_service.station.domain.BussWaterStationInfo;
import com.cms.buss_service.station.mapper.BussWaterStationInfoMapper;
import com.cms.buss_service.weichat.MapLocation;
import com.cms.buss_service.weichat.WeiChatUtils;
import com.cms.system_service.system.domain.SysDept;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.domain.SysUserRole;
import com.cms.system_service.system.mapper.SysUserRoleMapper;
import com.cms.system_service.system.service.ISysDeptService;
import com.cms.system_service.system.service.ISysUserService;

import java.util.List;


@Service
public class BussWaterStationInfoService
{
/*  32 */   private static final Logger log = LoggerFactory.getLogger(BussWaterStationInfoService.class);
  @Autowired(required = false)
  private BussWaterStationInfoMapper bussWaterStationInfoMapper;
  @Autowired
  ISysUserService sysUserService;
  @Autowired
  ISysDeptService sysDeptService;
  @Autowired(required = false)
  SysUserRoleMapper sysUserRoleMapper;
  @Autowired
  private BussStationPosterService bussStationPosterService;
  
  public BussWaterStationInfo selectBussWaterStationInfoById(Long pk) {
/*  45 */     return this.bussWaterStationInfoMapper.selectBussWaterStationInfoById(pk);
  }






  
  public List<BussWaterStationInfo> selectBussWaterStationInfoList(BussWaterStationInfo bussWaterStationInfo) {
/*  55 */     return this.bussWaterStationInfoMapper.selectBussWaterStationInfoList(bussWaterStationInfo);
  }







  
  public int insertBussWaterStationInfo(BussWaterStationInfo bussWaterStationInfo) {
/*  66 */     bussWaterStationInfo.setCreateTime(DateUtils.getTime());
/*  67 */     return this.bussWaterStationInfoMapper.insertBussWaterStationInfo(bussWaterStationInfo);
  }






  
  public int updateBussWaterStationInfo(BussWaterStationInfo bussWaterStationInfo) {
/*  77 */     bussWaterStationInfo.setUpdateBy(SecurityUtils.getUid());
/*  78 */     bussWaterStationInfo.setUpdateTime(DateUtils.getTime());
/*  79 */     return this.bussWaterStationInfoMapper.updateBussWaterStationInfo(bussWaterStationInfo);
  }







  
  public int deleteBussWaterStationInfoByIds(Long[] pks) {
/*  90 */     return this.bussWaterStationInfoMapper.deleteBussWaterStationInfoByIds(pks);
  }






  
  public int deleteBussWaterStationInfoById(Long pk) {
/* 100 */     return this.bussWaterStationInfoMapper.deleteBussWaterStationInfoById(pk);
  }
  
  public BussWaterStationInfo queryMyStationInfo(BussWaterStationInfo bussWaterStationInfo) {
/* 104 */     return this.bussWaterStationInfoMapper.queryMyStationInfo(bussWaterStationInfo);
  }
  
  public Boolean checkIsStationManger(String userPk) {
/* 108 */     Integer mls = this.bussWaterStationInfoMapper.checkIsStationManger(userPk);
/* 109 */     log.error("用户" + userPk + "是否为水站管理" + ((mls.intValue() > 0) ? 1 : 0));
/* 110 */     return Boolean.valueOf((mls.intValue() > 0));
  }










  
  @Transactional(rollbackFor = {Exception.class})
  public void createNewStation(BussWaterStationInfo se) {
/* 125 */     if (StringUtils.isNotBlank(se.getStationAddr())) {
/* 126 */       MapLocation point = WeiChatUtils.getPointByAddress(se.getStationAddr());
/* 127 */       se.setStationLongitude(point.getLng());
/* 128 */       se.setStationLatitude(point.getLat());
    } 
/* 130 */     this.bussWaterStationInfoMapper.insertBussWaterStationInfo(se);
/* 131 */     String stationId = String.valueOf(se.getPk());
    
/* 133 */     SysDept dep = new SysDept();
/* 134 */     dep.setDeptName(se.getStationName());
/* 135 */     dep.setAncestors("0,1");
/* 136 */     dep.setParentId("1");
/* 137 */     dep.setCropFlag("Y");
/* 138 */     dep.setDeptId(stationId);
/* 139 */     int deptId = this.sysDeptService.insertDept(dep);
    
/* 141 */     if (StringUtils.isNotBlank(se.getStationCharge())) {
/* 142 */       BussStationPoster ps = this.bussStationPosterService.selectBussStationPosterById(se.getStationCharge());
/* 143 */       SysUser user = this.sysUserService.selectUserById(se.getStationCharge());
/* 144 */       if (ps == null) {
/* 145 */         ps = new BussStationPoster();
/* 146 */         ps.setPk(user.getUserId());
/* 147 */         ps.setUserPk(user.getUserId());
/* 148 */         ps.setStationPk(stationId);
/* 149 */         ps.setNickName(user.getNickName());
/* 150 */         ps.setPhonenumber(user.getPhonenumber());
/* 151 */         ps.setJoinTime(DateUtils.getTime());
/* 152 */         ps.setPosterStatus("2");
/* 153 */         this.bussStationPosterService.insertBussStationPoster(ps);
      } 
/* 155 */       user.setCloudPk(stationId);
/* 156 */       user.setOrgId(stationId);
/* 157 */       user.setDeptId(stationId);
/* 158 */       this.sysUserService.updateUser(user);
/* 159 */       SysUserRole role = new SysUserRole();
/* 160 */       role.setRoleId(Constants.DEFAULT_SUPER_ADMIN_FOR_STATION);
/* 161 */       role.setUserId(user.getUserId());
      
/* 163 */       this.sysUserRoleMapper.addUserRole(role);
    } 
  }
  
  public Boolean checkStationIsOpenFenXiao(Long cloudPk) {
/* 168 */     BussWaterStationInfo st = this.bussWaterStationInfoMapper.selectBussWaterStationInfoById(cloudPk);
/* 169 */     return Boolean.valueOf((st != null && "Y".equalsIgnoreCase(st.getNo15())));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\service\BussWaterStationInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */