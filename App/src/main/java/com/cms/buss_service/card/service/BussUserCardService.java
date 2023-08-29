package com.cms.buss_service.card.service;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.buss_service.card.domain.BussUserCard;
import com.cms.buss_service.card.mapper.BussUserCardMapper;

import java.util.List;
import java.util.Map;


@Service
public class BussUserCardService
{
/*  22 */   private static final Logger log = LoggerFactory.getLogger(BussUserCardService.class);




  @Autowired(required = false)
  private BussUserCardMapper bussUserCardMapper;





  public BussUserCard selectBussUserCardById(Long pk) {
/*  35 */     return this.bussUserCardMapper.selectBussUserCardById(pk);
  }







  public List<BussUserCard> selectBussUserCardList(BussUserCard bussUserCard) {
/*  45 */     return this.bussUserCardMapper.selectBussUserCardList(bussUserCard);
  }









  public void insertBussUserCard(BussUserCard bussUserCard) {
    try {
/*  58 */       this.bussUserCardMapper.insertBussUserCard(bussUserCard);
/*  59 */     } catch (DuplicateKeyException e) {
/*  60 */       List<BussUserCard> cards = this.bussUserCardMapper.selectBussUserCardList(bussUserCard);
/*  61 */       if (CollectionUtils.isNotEmpty(cards)) {
/*  62 */         cards.forEach(is -> {
              is.setProductCount(Integer.valueOf(is.getProductCount().intValue() + 1));
              this.bussUserCardMapper.updateBussUserCard(is);
            });
      }
    }
  }








  public int updateBussUserCard(BussUserCard bussUserCard) {
/*  78 */     bussUserCard.setUpdateBy(SecurityUtils.getUid());
/*  79 */     bussUserCard.setUpdateTime(DateUtils.getTime());
/*  80 */     return this.bussUserCardMapper.updateBussUserCard(bussUserCard);
  }







  public int deleteBussUserCardByIds(Long[] pks) {
/*  90 */     return this.bussUserCardMapper.deleteBussUserCardByIds(pks);
  }







  public int deleteBussUserCardById(Long pk) {
/* 100 */     return this.bussUserCardMapper.deleteBussUserCardById(pk);
  }

  public List<Map<String, Object>> selectBussUserCardProductInfoList(BussUserCard bussUserCard) {
/* 104 */     return this.bussUserCardMapper.selectBussUserCardProductInfoList(bussUserCard);
  }







  public BussUserCard queryCardByUserIdAndProductId(String productPk) {
/* 114 */     return this.bussUserCardMapper.queryCardByUserIdAndProductId(productPk, SecurityUtils.getUid());
  }

  public int deleteBussUserCardByPj(BussUserCard cd) {
/* 118 */     return this.bussUserCardMapper.deleteBussUserCardByPj(cd);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\card\service\BussUserCardService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */