 package com.cms.buss_service.message;

 import com.cms.base_service.common.utils.DateUtils;
 import com.cms.buss_service.message.BussMessageInfo;
 import com.cms.buss_service.message.BussMessageInfoMapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;










 @Service
 public class BussMessageInfoService
 {
   @Autowired(required = false)
   private BussMessageInfoMapper bussMessageInfoMapper;

   public BussMessageInfo selectBussMessageInfoById(Long pk) {
/* 26 */     return this.bussMessageInfoMapper.selectBussMessageInfoById(pk);
   }







   public List<BussMessageInfo> selectBussMessageInfoList(BussMessageInfo bussMessageInfo) {
/* 36 */     return this.bussMessageInfoMapper.selectBussMessageInfoList(bussMessageInfo);
   }







   public int insertBussMessageInfo(BussMessageInfo bussMessageInfo) {
/* 46 */     bussMessageInfo.setCreateTime(DateUtils.getNowDate());
/* 47 */     return this.bussMessageInfoMapper.insertBussMessageInfo(bussMessageInfo);
   }







   public int updateBussMessageInfo(BussMessageInfo bussMessageInfo) {
/* 57 */     bussMessageInfo.setUpdateTime(DateUtils.getNowDate());
/* 58 */     return this.bussMessageInfoMapper.updateBussMessageInfo(bussMessageInfo);
   }







   public int deleteBussMessageInfoByIds(Long[] pks) {
/* 68 */     return this.bussMessageInfoMapper.deleteBussMessageInfoByIds(pks);
   }







   public int deleteBussMessageInfoById(Long pk) {
/* 78 */     return this.bussMessageInfoMapper.deleteBussMessageInfoById(pk);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\message\BussMessageInfoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */