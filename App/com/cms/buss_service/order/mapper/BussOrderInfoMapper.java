package com.cms.buss_service.order.mapper;

import com.cms.buss_service.bucket.domain.BussBucketDetails;
import com.cms.buss_service.bucket.domain.BussBucketInfo;
import com.cms.buss_service.order.domain.BussOrderInfo;
import com.cms.buss_service.yjuser.domain.BussYjOrderInfo;
import com.cms.system_service.system.domain.SysUser;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussOrderInfoMapper {
  BussOrderInfo selectBussOrderInfoById(String paramString);
  
  List<BussOrderInfo> selectBussOrderInfoList(BussOrderInfo paramBussOrderInfo);
  
  int insertBussOrderInfo(BussOrderInfo paramBussOrderInfo);
  
  int updateBussOrderInfo(BussOrderInfo paramBussOrderInfo);
  
  int deleteBussOrderInfoById(String paramString);
  
  int deleteBussOrderInfoByIds(String[] paramArrayOfString);
  
  List<BussOrderInfo> selectBussOrderInvoiceList(BussOrderInfo paramBussOrderInfo);
  
  Map<String, Object> queryUserLastOrderInfo(String paramString);
  
  List<BussOrderInfo> selectUnPayOrderInfo();
  
  Map<String, Object> queryMyStationInTjInfo(BussOrderInfo paramBussOrderInfo);
  
  List<BussOrderInfo> selectUserReminderList(BussOrderInfo paramBussOrderInfo);
  
  Map<String, Object> queryPosterTjInfo(BussOrderInfo paramBussOrderInfo);
  
  List<BussOrderInfo> queryBucketList(BussOrderInfo paramBussOrderInfo);
  
  void cancelOrderPd(BussOrderInfo paramBussOrderInfo);
  
  Map<String, Object> queryOrderGroupInfo(BussOrderInfo paramBussOrderInfo);
  
  Map<String, Object> queryOrderCount(BussOrderInfo paramBussOrderInfo);
  
  List<BussBucketDetails> queryUserYtInfo(BussBucketInfo paramBussBucketInfo);
  
  List<BussBucketDetails> queryUserQtInfo(BussBucketInfo paramBussBucketInfo);
  
  List<BussOrderInfo> selectBussOrderInfoListForYj(BussYjOrderInfo paramBussYjOrderInfo);
  
  List<Map<Object, Object>> queryStationOrderTjInfo(BussOrderInfo paramBussOrderInfo);
  
  List<Map<Object, Object>> queryStationOrderMoneyTjInfo(BussOrderInfo paramBussOrderInfo);
  
  List<Map<Object, Object>> queryStaionUserTjInfo(SysUser paramSysUser);
  
  Map<String, Object> queryStaionHomeTj(BussOrderInfo paramBussOrderInfo);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\mapper\BussOrderInfoMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */