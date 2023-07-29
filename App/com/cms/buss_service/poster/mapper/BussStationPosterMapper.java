package com.cms.buss_service.poster.mapper;

import com.cms.buss_service.poster.domain.BussStationPoster;
import com.cms.buss_service.poster.domain.PosterDetailsVo;
import com.cms.buss_service.station.domain.BussStationInountRecord;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BussStationPosterMapper {
  BussStationPoster selectBussStationPosterById(String paramString);
  
  List<BussStationPoster> selectBussStationPosterList(BussStationPoster paramBussStationPoster);
  
  int insertBussStationPoster(BussStationPoster paramBussStationPoster);
  
  int updateBussStationPoster(BussStationPoster paramBussStationPoster);
  
  int deleteBussStationPosterById(String paramString);
  
  int deleteBussStationPosterByIds(String[] paramArrayOfString);
  
  PosterDetailsVo selectPosterDetailsVo(BussStationPoster paramBussStationPoster);
  
  List<Map<String, Object>> queryPosterTjInfo(BussStationPoster paramBussStationPoster);
  
  List<PosterDetailsVo> queryPosterChild(BussStationPoster paramBussStationPoster);
  
  List<Map<String, Object>> selectMyChildPoster(BussStationPoster paramBussStationPoster);
  
  Integer checkIsPoster(String paramString);
  
  List<BussStationPoster> selectBussStationUserList(BussStationPoster paramBussStationPoster);
  
  Map<String, Object> queryUserIncome(BussStationInountRecord paramBussStationInountRecord);
  
  BigDecimal queryPaiSongFei(BussStationPoster paramBussStationPoster);
  
  BigDecimal queryPaLouFei(BussStationPoster paramBussStationPoster);
  
  BigDecimal queryJuLiTicheng(BussStationPoster paramBussStationPoster);
  
  BigDecimal queryFenxiang(BussStationPoster paramBussStationPoster);
  
  BigDecimal queryXiaJiPeisong(BussStationPoster paramBussStationPoster);
  
  BigDecimal queryZongTc(BussStationPoster paramBussStationPoster);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\poster\mapper\BussStationPosterMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */