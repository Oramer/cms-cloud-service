 package com.cms.buss_service.poster.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.poster.domain.BussPosterDistanceDeduct;
 import com.cms.buss_service.poster.domain.DistanceDeductVo;
 import com.cms.buss_service.poster.mapper.BussPosterDistanceDeductMapper;

 import java.util.List;


 @Service
 public class BussPosterDistanceDeductService
 {
   @Autowired(required = false)
   private BussPosterDistanceDeductMapper bussPosterDistanceDeductMapper;
   
   public BussPosterDistanceDeduct selectBussPosterDistanceDeductById(Long id) {
/* 30 */     return this.bussPosterDistanceDeductMapper.selectBussPosterDistanceDeductById(id);
   }
 
 
 
 
 
 
   
   public List<BussPosterDistanceDeduct> selectBussPosterDistanceDeductList(BussPosterDistanceDeduct bussPosterDistanceDeduct) {
/* 40 */     return this.bussPosterDistanceDeductMapper.selectBussPosterDistanceDeductList(bussPosterDistanceDeduct);
   }
 
 
 
 
 
 
   
   public int insertBussPosterDistanceDeduct(BussPosterDistanceDeduct bussPosterDistanceDeduct) {
/* 50 */     bussPosterDistanceDeduct.setCreateBy(SecurityUtils.getUid());
/* 51 */     bussPosterDistanceDeduct.setCreateTime(DateUtils.getTime());
/* 52 */     return this.bussPosterDistanceDeductMapper.insertBussPosterDistanceDeduct(bussPosterDistanceDeduct);
   }
 
 
 
 
 
 
   
   public int updateBussPosterDistanceDeduct(BussPosterDistanceDeduct bussPosterDistanceDeduct) {
/* 62 */     bussPosterDistanceDeduct.setUpdateBy(SecurityUtils.getUid());
/* 63 */     bussPosterDistanceDeduct.setUpdateTime(DateUtils.getTime());
/* 64 */     return this.bussPosterDistanceDeductMapper.updateBussPosterDistanceDeduct(bussPosterDistanceDeduct);
   }
 
 
 
 
 
 
   
   public int deleteBussPosterDistanceDeductByIds(Long[] ids) {
/* 74 */     return this.bussPosterDistanceDeductMapper.deleteBussPosterDistanceDeductByIds(ids);
   }
 
 
 
 
 
 
   
   public int deleteBussPosterDistanceDeductById(Long id) {
/* 84 */     return this.bussPosterDistanceDeductMapper.deleteBussPosterDistanceDeductById(id);
   }
   
   public List<DistanceDeductVo> selectBussPosterDistanceDeductMapList(BussPosterDistanceDeduct bps) {
/* 88 */     return this.bussPosterDistanceDeductMapper.selectBussPosterDistanceDeductMapList(bps);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\service\BussPosterDistanceDeductService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */