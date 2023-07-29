package com.cms.buss_service.station.mapper;

import com.cms.buss_service.station.domain.BussStationInountRecord;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussStationInountRecordMapper {
  BussStationInountRecord selectBussStationInountRecordById(Long paramLong);
  
  List<BussStationInountRecord> selectBussStationInountRecordList(BussStationInountRecord paramBussStationInountRecord);
  
  int insertBussStationInountRecord(BussStationInountRecord paramBussStationInountRecord);
  
  int updateBussStationInountRecord(BussStationInountRecord paramBussStationInountRecord);
  
  int deleteBussStationInountRecordById(Integer paramInteger);
  
  int deleteBussStationInountRecordByIds(Integer[] paramArrayOfInteger);
  
  BigDecimal queryStationIncomeForTx(BussStationInountRecord paramBussStationInountRecord);
  
  int selectToadyTixianRecord(String paramString);
  
  List<BussStationInountRecord> queryStationTxDetails(BussStationInountRecord paramBussStationInountRecord);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\station\mapper\BussStationInountRecordMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */