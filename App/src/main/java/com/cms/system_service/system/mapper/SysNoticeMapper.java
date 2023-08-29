package com.cms.system_service.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.system_service.system.domain.SysNotice;

import java.util.List;

@Mapper
public interface SysNoticeMapper {
  SysNotice selectNoticeById(Long paramLong);
  
  List<SysNotice> selectNoticeList(SysNotice paramSysNotice);
  
  int insertNotice(SysNotice paramSysNotice);
  
  int updateNotice(SysNotice paramSysNotice);
  
  int deleteNoticeById(Long paramLong);
  
  int deleteNoticeByIds(Long[] paramArrayOfLong);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysNoticeMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */