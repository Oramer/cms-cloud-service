package com.cms.buss_service.station.service;

import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.buss_service.station.domain.BussStationClimbFee;
import com.cms.buss_service.station.mapper.BussStationClimbFeeMapper;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;















@Service
public class BussStationClimbFeeService
{
  @Autowired(required = false)
  private BussStationClimbFeeMapper bussStationClimbFeeMapper;

  public BussStationClimbFee selectBussStationClimbFeeById(String pk) {
/*  34 */     return this.bussStationClimbFeeMapper.selectBussStationClimbFeeById(pk);
  }







  public List<BussStationClimbFee> selectBussStationClimbFeeList(BussStationClimbFee bussStationClimbFee) {
/*  44 */     return this.bussStationClimbFeeMapper.selectBussStationClimbFeeList(bussStationClimbFee);
  }



  public BigDecimal selectBussStationClimbSetUp(Integer type, Integer floornum) {
/*  50 */     if (type.intValue() == 1) {
/*  51 */       BussStationClimbFee bussStationClimbFee = new BussStationClimbFee();

/*  53 */       bussStationClimbFee.setStationPk(String.valueOf(SecurityUtils.getUserStationId()));
/*  54 */       List<BussStationClimbFee> list = this.bussStationClimbFeeMapper.selectBussStationClimbFeeList(bussStationClimbFee);

/*  56 */       if (list != null && list.size() > 0) {
/*  57 */         BussStationClimbFee fee = list.get(0);
/*  58 */         BigDecimal dd = (floornum.intValue() == 2) ? fee.getF2() : ((floornum.intValue() == 3) ? fee.getF3() : ((floornum.intValue() == 4) ? fee.getF4() : ((floornum.intValue() == 5) ? fee.getF5() : ((floornum.intValue() == 6) ? fee.getF6() : fee.getF7()))));
/*  59 */         return dd;
      }
/*  61 */       return new BigDecimal(0);
    }
/*  63 */     BussStationClimbFee ckl = new BussStationClimbFee();

/*  65 */     ckl.setStationPk(String.valueOf(SecurityUtils.getUserStationId()));
/*  66 */     List<BussStationClimbFee> bussStationClimbFees = this.bussStationClimbFeeMapper.selectBussStationClimbFeeList(ckl);

/*  68 */     if (bussStationClimbFees != null && bussStationClimbFees.size() > 0) {
/*  69 */       BussStationClimbFee fee = bussStationClimbFees.get(0);
/*  70 */       String dd = (floornum.intValue() == 2) ? fee.getNo2() : ((floornum.intValue() == 3) ? fee.getNo3() : ((floornum.intValue() == 4) ? fee.getNo4() : ((floornum.intValue() == 5) ? fee.getNo5() : ((floornum.intValue() == 6) ? fee.getNo6() : fee.getNo7()))));
/*  71 */       return new BigDecimal(dd);
    }
/*  73 */     return Constants.DEFAULT_CLIMB_FREE;
  }









  public int insertBussStationClimbFee(BussStationClimbFee bussStationClimbFee) {
/*  85 */     if (bussStationClimbFee.getPk() != null) {
/*  86 */       return this.bussStationClimbFeeMapper.updateBussStationClimbFee(bussStationClimbFee);
    }
/*  88 */     bussStationClimbFee.setCreateBy(SecurityUtils.getUid());
/*  89 */     bussStationClimbFee.setCreateTime(DateUtils.getTime());
/*  90 */     bussStationClimbFee.setStationPk(String.valueOf(SecurityUtils.getUserStationId()));
/*  91 */     return this.bussStationClimbFeeMapper.insertBussStationClimbFee(bussStationClimbFee);
  }









  public int updateBussStationClimbFee(BussStationClimbFee bussStationClimbFee) {
/* 103 */     bussStationClimbFee.setUpdateBy(SecurityUtils.getUid());
/* 104 */     bussStationClimbFee.setUpdateTime(DateUtils.getTime());
/* 105 */     return this.bussStationClimbFeeMapper.updateBussStationClimbFee(bussStationClimbFee);
  }







  public int deleteBussStationClimbFeeByIds(String[] pks) {
/* 115 */     return this.bussStationClimbFeeMapper.deleteBussStationClimbFeeByIds(pks);
  }







  public int deleteBussStationClimbFeeById(String pk) {
/* 125 */     return this.bussStationClimbFeeMapper.deleteBussStationClimbFeeById(pk);
  }

  public BussStationClimbFee queryClimbFeeByStationPk(BussStationClimbFee bussStationClimbFee) {
/* 129 */     bussStationClimbFee.setStationPk(String.valueOf(SecurityUtils.getUserStationId()));
/* 130 */     return this.bussStationClimbFeeMapper.queryClimbFeeByStationPk(bussStationClimbFee);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\service\BussStationClimbFeeService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */