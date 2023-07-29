package com.cms.buss_service.station.service;

import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.buss_service.station.domain.BussStationInount;
import com.cms.buss_service.station.domain.BussStationInountRecord;
import com.cms.buss_service.station.mapper.BussStationInountRecordMapper;
import com.cms.buss_service.station.service.BussStationInountService;
import com.cms.buss_service.station.service.BussWaterStationInfoService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;






@Service
public class BussStationInountRecordService
{
  @Autowired(required = false)
  private BussStationInountRecordMapper bussStationInountRecordMapper;
  @Autowired
  BussWaterStationInfoService bussWaterStationInfoService;
  @Autowired
  BussStationInountService bussStationInountService;

  public BussStationInountRecord selectBussStationInountRecordById(Long id) {
/*  34 */     return this.bussStationInountRecordMapper.selectBussStationInountRecordById(id);
  }







  public List<BussStationInountRecord> selectBussStationInountRecordList(BussStationInountRecord bussStationInountRecord) {
/*  44 */     return this.bussStationInountRecordMapper.selectBussStationInountRecordList(bussStationInountRecord);
  }







  public int insertBussStationInountRecord(BussStationInountRecord bussStationInountRecord) {
/*  54 */     bussStationInountRecord.setCreateTime(DateUtils.getTime());
/*  55 */     return this.bussStationInountRecordMapper.insertBussStationInountRecord(bussStationInountRecord);
  }







  public int updateBussStationInountRecord(BussStationInountRecord bussStationInountRecord) {
/*  65 */     bussStationInountRecord.setUpdateTime(DateUtils.getTime());
/*  66 */     return this.bussStationInountRecordMapper.updateBussStationInountRecord(bussStationInountRecord);
  }







  public int deleteBussStationInountRecordByIds(Integer[] ids) {
/*  76 */     return this.bussStationInountRecordMapper.deleteBussStationInountRecordByIds(ids);
  }







  public int deleteBussStationInountRecordById(Integer id) {
/*  86 */     return this.bussStationInountRecordMapper.deleteBussStationInountRecordById(id);
  }






  public RestResult queryStationIncomeForTx(BussStationInountRecord ins) {
/*  95 */     String uid = SecurityUtils.getUid();
/*  96 */     Boolean aBoolean = this.bussWaterStationInfoService.checkIsStationManger(uid);
/*  97 */     if (!aBoolean.booleanValue()) {
/*  98 */       return RestResult.fail("无权执行此操作,当前账号不是水站总管理员");
    }
/* 100 */     BigDecimal bls = this.bussStationInountService.queryStationTotalIncome(SecurityUtils.getUserStationId());
/* 101 */     return RestResult.ok().setData(bls);
  }







  @Transactional(rollbackFor = {Exception.class})
  public RestResult submitTixian(BussStationInountRecord ins) {
/* 112 */     if (checkTodayIsSubmit(ins.getStationId())) {
/* 113 */       return RestResult.fail("提现功能24小时内仅允许发起一次,请勿重复发起");
    }
/* 115 */     if (StringUtils.isBlank(ins.getStationId()) || ins.getMoneyTaxNum() == null) {
/* 116 */       return RestResult.fail("参数异常,水站信息或提成金额参数缺失");
    }

/* 119 */     BigDecimal decimal = this.bussStationInountService.queryStationTotalIncome(Long.valueOf(Long.parseLong(ins.getStationId())));
/* 120 */     BigDecimal negate = ins.getMoneyTaxNum().negate();
/* 121 */     ins.setMoneyTaxNum(negate);
/* 122 */     ins.setMoneyNum(negate);
/* 123 */     ins.setSourceFrom(Integer.valueOf(2));
/* 124 */     ins.setRecordType(Integer.valueOf(2));
/* 125 */     ins.setStatus(Integer.valueOf(3));
/* 126 */     ins.setCreateTime(DateUtils.getTime());
/* 127 */     this.bussStationInountRecordMapper.insertBussStationInountRecord(ins);
/* 128 */     return RestResult.ok().setMsg("提成申请提交成功,等待平台审核");
  }







  private boolean checkTodayIsSubmit(String stationId) {
/* 138 */     Integer count = Integer.valueOf(this.bussStationInountRecordMapper.selectToadyTixianRecord(stationId));
/* 139 */     return (count != null && count.intValue() > 0);
  }









  @Transactional(rollbackFor = {Exception.class})
  public RestResult confirmTxianSq(BussStationInountRecord ins) {
/* 152 */     BussStationInountRecord inss = this.bussStationInountRecordMapper.selectBussStationInountRecordById(ins.getId());
/* 153 */     if (inss.getStatus().intValue() == 3) {

/* 155 */       BussStationInount inount = this.bussStationInountService.selectBussStationInountById(Long.valueOf(Long.parseLong(ins.getStationId())));

/* 157 */       inount.setMoneyNum(inount.getMoneyNum().add(inss.getMoneyTaxNum()));
/* 158 */       inount.setUpdateTime(DateUtils.getTime());
/* 159 */       this.bussStationInountService.updateBussStationInount(inount);

/* 161 */       inss.setStatus(Integer.valueOf(2));
/* 162 */       this.bussStationInountRecordMapper.updateBussStationInountRecord(inss);
/* 163 */       return RestResult.ok().setMsg("提现申请处理成功");
    }
/* 165 */     return RestResult.fail("单据状态信息异常");
  }


  public RestResult queryStationTxDetails(BussStationInountRecord ins) {
/* 170 */     return RestResult.ok().setData(this.bussStationInountRecordMapper.queryStationTxDetails(ins));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\service\BussStationInountRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */