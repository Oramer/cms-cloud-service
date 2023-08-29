package com.cms.buss_service.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.buss_service.order.domain.BussReceiverMessage;
import com.cms.buss_service.order.mapper.BussReceiverMessageMapper;

import java.util.List;


@Service
public class BussReceiverMessageService
{
  @Autowired(required = false)
  private BussReceiverMessageMapper bussReceiverMessageMapper;

  public BussReceiverMessage selectBussReceiverMessageById(Long id) {
/*  30 */     return this.bussReceiverMessageMapper.selectBussReceiverMessageById(id);
  }







  public List<BussReceiverMessage> selectBussReceiverMessageList(BussReceiverMessage bussReceiverMessage) {
/*  40 */     return this.bussReceiverMessageMapper.selectBussReceiverMessageList(bussReceiverMessage);
  }







  public int insertBussReceiverMessage(BussReceiverMessage mess) {
/*  50 */     if (StringUtils.isNotBlank(mess.getIsDefault()) && "Y".equalsIgnoreCase(mess.getIsDefault())) {
/*  51 */       List<BussReceiverMessage> res = this.bussReceiverMessageMapper.selectReceiveDefault(SecurityUtils.getUid());
/*  52 */       if (res != null && res.size() > 0) {
/*  53 */         res.forEach(is -> {
              is.setIsDefault("N");
              this.bussReceiverMessageMapper.updateBussReceiverMessage(is);
            });
      }
    }
/*  59 */     mess.setCreateBy(SecurityUtils.getUid());
/*  60 */     mess.setCreateTime(DateUtils.getTime());
/*  61 */     mess.setMemberPk(SecurityUtils.getUid());
/*  62 */     return this.bussReceiverMessageMapper.insertBussReceiverMessage(mess);
  }







  public int updateBussReceiverMessage(BussReceiverMessage mess) {
/*  72 */     if (StringUtils.isNotBlank(mess.getIsDefault()) && "Y".equalsIgnoreCase(mess.getIsDefault())) {
/*  73 */       List<BussReceiverMessage> res = this.bussReceiverMessageMapper.selectReceiveDefault(SecurityUtils.getUid());
/*  74 */       if (res != null && res.size() > 0) {
/*  75 */         res.forEach(is -> {
              is.setIsDefault("N");
              this.bussReceiverMessageMapper.updateBussReceiverMessage(is);
            });
      }
    }
/*  81 */     mess.setUpdateBy(SecurityUtils.getUid());
/*  82 */     mess.setUpdateTime(DateUtils.getTime());
/*  83 */     return this.bussReceiverMessageMapper.updateBussReceiverMessage(mess);
  }







  public int deleteBussReceiverMessageByIds(Long[] ids) {
/*  93 */     return this.bussReceiverMessageMapper.deleteBussReceiverMessageByIds(ids);
  }








  public int deleteBussReceiverMessageById(Long id) {
/* 104 */     return this.bussReceiverMessageMapper.deleteBussReceiverMessageById(id);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\service\BussReceiverMessageService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */