package com.cms.buss_service.poster.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.buss_service.poster.domain.BussStationPoster;
import com.cms.buss_service.poster.domain.PosterDetailsVo;
import com.cms.buss_service.poster.mapper.BussStationPosterMapper;
import com.cms.buss_service.station.domain.BussStationInountRecord;

import java.util.List;
import java.util.Map;


@Service
public class BussStationPosterService
{
/*  26 */   private static final Logger log = LoggerFactory.getLogger(BussStationPosterService.class);




  @Autowired(required = false)
  private BussStationPosterMapper bussStationPosterMapper;





  public BussStationPoster selectBussStationPosterById(String pk) {
/*  39 */     return this.bussStationPosterMapper.selectBussStationPosterById(pk);
  }







  public List<BussStationPoster> selectBussStationPosterList(BussStationPoster bussStationPoster) {
/*  49 */     return this.bussStationPosterMapper.selectBussStationPosterList(bussStationPoster);
  }








  public int insertBussStationPoster(BussStationPoster bussStationPoster) {
/*  60 */     bussStationPoster.setCreateBy(SecurityUtils.getUid());
/*  61 */     bussStationPoster.setCreateTime(DateUtils.getTime());
/*  62 */     return this.bussStationPosterMapper.insertBussStationPoster(bussStationPoster);
  }







  public int updateBussStationPoster(BussStationPoster bussStationPoster) {
/*  72 */     bussStationPoster.setUpdateBy(SecurityUtils.getUid());
/*  73 */     bussStationPoster.setUpdateTime(DateUtils.getTime());
/*  74 */     return this.bussStationPosterMapper.updateBussStationPoster(bussStationPoster);
  }







  public int deleteBussStationPosterByIds(String[] pks) {
/*  84 */     return this.bussStationPosterMapper.deleteBussStationPosterByIds(pks);
  }







  public int deleteBussStationPosterById(String pk) {
/*  94 */     return this.bussStationPosterMapper.deleteBussStationPosterById(pk);
  }

  public PosterDetailsVo selectPosterDetailsVo(BussStationPoster bussStationPoster) {
/*  98 */     if (StringUtils.isBlank(bussStationPoster.getPk())) {
/*  99 */       bussStationPoster.setPk(SecurityUtils.getUid());
    }
/* 101 */     return this.bussStationPosterMapper.selectPosterDetailsVo(bussStationPoster);
  }

  public List<Map<String, Object>> queryPosterTjInfo(BussStationPoster po) {
/* 105 */     return this.bussStationPosterMapper.queryPosterTjInfo(po);
  }

  public List<Map<String, Object>> selectMyChildPoster(BussStationPoster bussStationPoster) {
/* 109 */     if (StringUtils.isBlank(bussStationPoster.getParentPk())) {
/* 110 */       bussStationPoster.setParentPk(SecurityUtils.getUid());
    }
/* 112 */     return this.bussStationPosterMapper.selectMyChildPoster(bussStationPoster);
  }

  public Boolean checkIsPoster(String userId) {
/* 116 */     Integer nls = this.bussStationPosterMapper.checkIsPoster(userId);
/* 117 */     log.error("用户" + userId + "是否为水站派送员" + ((nls.intValue() > 0) ? 1 : 0));
/* 118 */     return Boolean.valueOf((nls.intValue() > 0));
  }

  public List<BussStationPoster> selectBussStationUserList(BussStationPoster station) {
/* 122 */     return this.bussStationPosterMapper.selectBussStationUserList(station);
  }

  public Map<String, Object> queryUserIncome(BussStationInountRecord po) {
/* 126 */     return this.bussStationPosterMapper.queryUserIncome(po);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\service\BussStationPosterService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */