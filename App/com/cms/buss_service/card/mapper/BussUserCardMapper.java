package com.cms.buss_service.card.mapper;

import com.cms.buss_service.card.domain.BussUserCard;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussUserCardMapper {
  BussUserCard selectBussUserCardById(Long paramLong);
  
  List<BussUserCard> selectBussUserCardList(BussUserCard paramBussUserCard);
  
  int insertBussUserCard(BussUserCard paramBussUserCard);
  
  int updateBussUserCard(BussUserCard paramBussUserCard);
  
  int deleteBussUserCardById(Long paramLong);
  
  int deleteBussUserCardByIds(Long[] paramArrayOfLong);
  
  List<Map<String, Object>> selectBussUserCardProductInfoList(BussUserCard paramBussUserCard);
  
  BussUserCard queryCardByUserIdAndProductId(String paramString1, String paramString2);
  
  int deleteBussUserCardByPj(BussUserCard paramBussUserCard);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\card\mapper\BussUserCardMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */