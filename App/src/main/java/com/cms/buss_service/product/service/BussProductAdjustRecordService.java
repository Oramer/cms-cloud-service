 package com.cms.buss_service.product.service;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.base_service.common.utils.SecurityUtils;
 import com.cms.buss_service.product.domain.BussProductAdjustRecord;
 import com.cms.buss_service.product.mapper.BussProductAdjustRecordMapper;

 import java.util.List;


 @Service
 public class BussProductAdjustRecordService
 {
   @Autowired(required = false)
   private BussProductAdjustRecordMapper bussProductAdjustRecordMapper;

   public BussProductAdjustRecord selectBussProductAdjustRecordById(Long pk) {
/* 29 */     return this.bussProductAdjustRecordMapper.selectBussProductAdjustRecordById(pk);
   }







   public List<BussProductAdjustRecord> selectBussProductAdjustRecordList(BussProductAdjustRecord bussProductAdjustRecord) {
/* 39 */     return this.bussProductAdjustRecordMapper.selectBussProductAdjustRecordList(bussProductAdjustRecord);
   }








   public int insertBussProductAdjustRecord(BussProductAdjustRecord bussProductAdjustRecord) {
/* 50 */     bussProductAdjustRecord.setCreateBy(SecurityUtils.getUid());
/* 51 */     bussProductAdjustRecord.setCreateTime(DateUtils.getTime());
/* 52 */     return this.bussProductAdjustRecordMapper.insertBussProductAdjustRecord(bussProductAdjustRecord);
   }







   public int updateBussProductAdjustRecord(BussProductAdjustRecord bussProductAdjustRecord) {
/* 62 */     bussProductAdjustRecord.setUpdateBy(SecurityUtils.getUid());
/* 63 */     bussProductAdjustRecord.setUpdateTime(DateUtils.getTime());
/* 64 */     return this.bussProductAdjustRecordMapper.updateBussProductAdjustRecord(bussProductAdjustRecord);
   }







   public int deleteBussProductAdjustRecordByIds(Long[] pks) {
/* 74 */     return this.bussProductAdjustRecordMapper.deleteBussProductAdjustRecordByIds(pks);
   }







   public int deleteBussProductAdjustRecordById(Long pk) {
/* 84 */     return this.bussProductAdjustRecordMapper.deleteBussProductAdjustRecordById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\product\service\BussProductAdjustRecordService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */