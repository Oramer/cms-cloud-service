package com.cms.buss_service.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.buss_service.order.domain.BussReceiverMessage;
import com.cms.buss_service.poster.domain.BussStationPoster;
import com.cms.buss_service.product.domain.BussProductInfo;

import java.util.List;
import java.util.Map;

@Mapper
public interface BussReceiverMessageMapper {
  BussReceiverMessage selectBussReceiverMessageById(Long paramLong);
  
  List<BussReceiverMessage> selectBussReceiverMessageList(BussReceiverMessage paramBussReceiverMessage);
  
  int insertBussReceiverMessage(BussReceiverMessage paramBussReceiverMessage);
  
  int updateBussReceiverMessage(BussReceiverMessage paramBussReceiverMessage);
  
  int deleteBussReceiverMessageById(Long paramLong);
  
  int deleteBussReceiverMessageByIds(Long[] paramArrayOfLong);
  
  List<BussReceiverMessage> selectReceiveDefault(String paramString);
  
  List<Map<String, Object>> queryUserTjInfoForPT(BussReceiverMessage paramBussReceiverMessage);
  
  List<Map<String, Object>> queryProductSaleInfoForPT(BussProductInfo paramBussProductInfo);
  
  List<Map<String, Object>> queryPosterTjForPT(BussStationPoster paramBussStationPoster);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\mapper\BussReceiverMessageMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */