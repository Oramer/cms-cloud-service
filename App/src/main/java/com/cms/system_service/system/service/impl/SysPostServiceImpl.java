package com.cms.system_service.system.service.impl;

import com.aliyun.oss.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.system_service.system.domain.SysPost;
import com.cms.system_service.system.mapper.SysPostMapper;
import com.cms.system_service.system.mapper.SysUserPostMapper;
import com.cms.system_service.system.service.ISysPostService;

import java.util.List;


@Service
public class SysPostServiceImpl
  implements ISysPostService
{
  @Autowired(required = false)
  private SysPostMapper postMapper;
  @Autowired(required = false)
  private SysUserPostMapper userPostMapper;
  
  public List<SysPost> selectPostList(SysPost post) {
/*  36 */     return this.postMapper.selectPostList(post);
  }






  
  public List<SysPost> selectPostAll() {
/*  46 */     return this.postMapper.selectPostAll();
  }







  
  public SysPost selectPostById(String postId) {
/*  57 */     return this.postMapper.selectPostById(postId);
  }







  
  public List<Long> selectPostListByUserId(String userId) {
/*  68 */     return this.postMapper.selectPostListByUserId(userId);
  }







  
  public String checkPostNameUnique(SysPost post) {
/*  79 */     String postId = StringUtils.isNull(post.getPostId()) ? "-1L" : post.getPostId();
/*  80 */     SysPost info = this.postMapper.checkPostNameUnique(post.getPostName());
/*  81 */     if (StringUtils.isNotNull(info) && !info.getPostId().equalsIgnoreCase(postId)) {
/*  82 */       return "1";
    }
/*  84 */     return "0";
  }







  
  public String checkPostCodeUnique(SysPost post) {
/*  95 */     String postId = StringUtils.isNull(post.getPostId()) ? "-1L" : post.getPostId();
/*  96 */     SysPost info = this.postMapper.checkPostCodeUnique(post.getPostCode());
/*  97 */     if (StringUtils.isNotNull(info) && info.getPostId().equalsIgnoreCase(postId)) {
/*  98 */       return "0";
    }
/* 100 */     return "1";
  }







  
  public int countUserPostById(String postId) {
/* 111 */     return this.userPostMapper.countUserPostById(postId);
  }







  
  public int deletePostById(String postId) {
/* 122 */     return this.postMapper.deletePostById(postId);
  }







  
  public int deletePostByIds(String[] postIds) {
/* 133 */     for (String postId : postIds) {
/* 134 */       SysPost post = selectPostById(postId);
/* 135 */       if (countUserPostById(postId) > 0) {
/* 136 */         throw new ServiceException(String.format("%1$s已分配,不能删除", new Object[] { post.getPostName() }));
      }
    } 
/* 139 */     return this.postMapper.deletePostByIds(postIds);
  }







  
  public int insertPost(SysPost post) {
/* 150 */     return this.postMapper.insertPost(post);
  }







  
  public int updatePost(SysPost post) {
/* 161 */     return this.postMapper.updatePost(post);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\impl\SysPostServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */