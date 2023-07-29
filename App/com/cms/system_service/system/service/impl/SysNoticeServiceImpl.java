 package com.cms.system_service.system.service.impl;
 
 import com.cms.system_service.system.domain.SysNotice;
 import com.cms.system_service.system.mapper.SysNoticeMapper;
 import com.cms.system_service.system.service.ISysNoticeService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 @Service
 public class SysNoticeServiceImpl
   implements ISysNoticeService
 {
   @Autowired(required = false)
   private SysNoticeMapper noticeMapper;
   
   public SysNotice selectNoticeById(Long noticeId) {
/* 31 */     return this.noticeMapper.selectNoticeById(noticeId);
   }
 
 
 
 
 
 
 
 
   
   public List<SysNotice> selectNoticeList(SysNotice notice) {
/* 43 */     return this.noticeMapper.selectNoticeList(notice);
   }
 
 
 
 
 
 
 
 
   
   public int insertNotice(SysNotice notice) {
/* 55 */     return this.noticeMapper.insertNotice(notice);
   }
 
 
 
 
 
 
 
 
   
   public int updateNotice(SysNotice notice) {
/* 67 */     return this.noticeMapper.updateNotice(notice);
   }
 
 
 
 
 
 
 
 
   
   public int deleteNoticeById(Long noticeId) {
/* 79 */     return this.noticeMapper.deleteNoticeById(noticeId);
   }
 
 
 
 
 
 
 
 
   
   public int deleteNoticeByIds(Long[] noticeIds) {
/* 91 */     return this.noticeMapper.deleteNoticeByIds(noticeIds);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\impl\SysNoticeServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */