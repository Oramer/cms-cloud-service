package com.cms.buss_service.station.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.buss_service.station.domain.BussStationInount;
import com.cms.buss_service.station.mapper.BussStationInountMapper;

import java.math.BigDecimal;
import java.util.List;


@Service
public class BussStationInountService
{
/*  20 */   private static final Logger log = LoggerFactory.getLogger(BussStationInountService.class);



  
  @Autowired(required = false)
  private BussStationInountMapper bussStationInountMapper;




  
  public BussStationInount selectBussStationInountById(Long id) {
/*  33 */     return this.bussStationInountMapper.selectBussStationInountById(id);
  }






  
  public List<BussStationInount> selectBussStationInountList(BussStationInount bussStationInount) {
/*  43 */     return this.bussStationInountMapper.selectBussStationInountList(bussStationInount);
  }






  
  public int insertBussStationInount(BussStationInount bussStationInount) {
/*  53 */     bussStationInount.setCreateTime(DateUtils.getNowDate());
/*  54 */     return this.bussStationInountMapper.insertBussStationInount(bussStationInount);
  }






  
  public int updateBussStationInount(BussStationInount bussStationInount) {
/*  64 */     bussStationInount.setUpdateTime(DateUtils.getNowDate());
/*  65 */     return this.bussStationInountMapper.updateBussStationInount(bussStationInount);
  }






  
  public int deleteBussStationInountByIds(Integer[] ids) {
/*  75 */     return this.bussStationInountMapper.deleteBussStationInountByIds(ids);
  }






  
  public int deleteBussStationInountById(Integer id) {
/*  85 */     return this.bussStationInountMapper.deleteBussStationInountById(id);
  }





  
  public void updateStationInount(Long stationId, BigDecimal subtract) {
/*  94 */     BussStationInount bins = this.bussStationInountMapper.selectBussStationInountByStationId(stationId);
/*  95 */     if (bins != null && bins.getId() != null) {
/*  96 */       BigDecimal add = bins.getMoneyNum().add(subtract);
/*  97 */       log.info("更新水站收支信息--- " + bins.getMoneyNum() + "--追加: " + subtract.setScale(2, 4) + "---追加后:" + add.setScale(2, 4));
/*  98 */       bins.setMoneyNum(add.setScale(2, 4));
/*  99 */       this.bussStationInountMapper.updateBussStationInount(bins);
    } else {
/* 101 */       BussStationInount ins = new BussStationInount();
/* 102 */       ins.setStationId(stationId);
/* 103 */       ins.setMoneyNum(BigDecimal.ZERO);
/* 104 */       ins.setCreateTime(DateUtils.getTime());
/* 105 */       this.bussStationInountMapper.insertBussStationInount(ins);
    } 
  }
  
  public BigDecimal queryStationTotalIncome(Long stationId) {
/* 110 */     return this.bussStationInountMapper.queryStationIncome(stationId);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\service\BussStationInountService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */