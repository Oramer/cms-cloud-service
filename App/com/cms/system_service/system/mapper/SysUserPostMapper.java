package com.cms.system_service.system.mapper;

import com.cms.system_service.system.domain.SysUserPost;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserPostMapper {
  int deleteUserPostByUserId(String paramString);
  
  int countUserPostById(String paramString);
  
  int deleteUserPost(String[] paramArrayOfString);
  
  int batchUserPost(List<SysUserPost> paramList);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysUserPostMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */