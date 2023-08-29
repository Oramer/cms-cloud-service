package com.cms.system_service.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.cms.system_service.system.domain.SysPost;

import java.util.List;

@Mapper
public interface SysPostMapper {
  List<SysPost> selectPostList(SysPost paramSysPost);
  
  List<SysPost> selectPostAll();
  
  SysPost selectPostById(String paramString);
  
  List<Long> selectPostListByUserId(String paramString);
  
  List<SysPost> selectPostsByUserName(String paramString);
  
  int deletePostById(String paramString);
  
  int deletePostByIds(String[] paramArrayOfString);
  
  int updatePost(SysPost paramSysPost);
  
  int insertPost(SysPost paramSysPost);
  
  SysPost checkPostNameUnique(String paramString);
  
  SysPost checkPostCodeUnique(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysPostMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */