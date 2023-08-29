package com.cms.system_service.system.service;

import com.cms.system_service.system.domain.SysPost;

import java.util.List;

public interface ISysPostService {
  List<SysPost> selectPostList(SysPost paramSysPost);
  
  List<SysPost> selectPostAll();
  
  SysPost selectPostById(String paramString);
  
  List<Long> selectPostListByUserId(String paramString);
  
  String checkPostNameUnique(SysPost paramSysPost);
  
  String checkPostCodeUnique(SysPost paramSysPost);
  
  int countUserPostById(String paramString);
  
  int deletePostById(String paramString);
  
  int deletePostByIds(String[] paramArrayOfString);
  
  int insertPost(SysPost paramSysPost);
  
  int updatePost(SysPost paramSysPost);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\ISysPostService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */