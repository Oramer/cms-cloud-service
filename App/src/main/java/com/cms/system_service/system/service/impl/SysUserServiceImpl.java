package com.cms.system_service.system.service.impl;

import com.aliyun.oss.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import com.cms.base_service.common.utils.BeanValidators;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.DataScope;
import com.cms.buss_service.station.domain.SearchUserVo;
import com.cms.buss_service.station.domain.SysUserVo;
import com.cms.system_service.system.domain.*;
import com.cms.system_service.system.mapper.*;
import com.cms.system_service.system.service.ISysConfigService;
import com.cms.system_service.system.service.ISysUserService;

import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SysUserServiceImpl implements ISysUserService {
/*  36 */   private static final Logger log = LoggerFactory.getLogger(SysUserServiceImpl.class);

  
  @Autowired(required = false)
  private SysUserMapper userMapper;

  
  @Autowired(required = false)
  private SysRoleMapper roleMapper;

  
  @Autowired(required = false)
  private SysPostMapper postMapper;

  
  @Autowired(required = false)
  private SysUserRoleMapper userRoleMapper;

  
  @Autowired(required = false)
  private SysUserPostMapper userPostMapper;

  
  @Autowired(required = false)
  private ISysConfigService configService;
  
  @Autowired
  protected Validator validator;

  
  @DataScope(deptAlias = "d", userAlias = "u")
  public List<SysUser> selectUserList(SysUser user) {
/*  68 */     return this.userMapper.selectUserList(user);
  }







  
  @DataScope(deptAlias = "d", userAlias = "u")
  public List<SysUser> selectAllocatedList(SysUser user) {
/*  80 */     return this.userMapper.selectAllocatedList(user);
  }







  
  @DataScope(deptAlias = "d", userAlias = "u")
  public List<SysUser> selectUnallocatedList(SysUser user) {
/*  92 */     return this.userMapper.selectUnallocatedList(user);
  }







  
  public SysUser selectUserByUserName(String userName) {
/* 103 */     return this.userMapper.selectUserByUserName(userName);
  }







  
  public SysUser selectUserById(String userId) {
/* 114 */     return this.userMapper.selectUserById(userId);
  }







  
  public String selectUserRoleGroup(String userName) {
/* 125 */     List<SysRole> list = this.roleMapper.selectRolesByUserName(userName);
/* 126 */     if (CollectionUtils.isEmpty(list)) {
/* 127 */       return "";
    }
/* 129 */     return list.stream().map(SysRole::getRoleName).collect(Collectors.joining(","));
  }







  
  public String selectUserPostGroup(String userName) {
/* 140 */     List<SysPost> list = this.postMapper.selectPostsByUserName(userName);
/* 141 */     if (CollectionUtils.isEmpty(list)) {
/* 142 */       return "";
    }
/* 144 */     return list.stream().map(SysPost::getPostName).collect(Collectors.joining(","));
  }







  
  public String checkUserNameUnique(String userName) {
/* 155 */     int count = this.userMapper.checkUserNameUnique(userName);
/* 156 */     if (count > 0) {
/* 157 */       return "1";
    }
/* 159 */     return "0";
  }







  
  public String checkPhoneUnique(SysUser user) {
/* 170 */     String userId = StringUtils.isNull(user.getUserId()) ? "-1L" : user.getUserId();
/* 171 */     SysUser info = this.userMapper.checkPhoneUnique(user.getPhonenumber());
/* 172 */     if (StringUtils.isNotNull(info) && !info.getUserId().equalsIgnoreCase(userId)) {
/* 173 */       return "1";
    }
/* 175 */     return "0";
  }







  
  public String checkEmailUnique(SysUser user) {
/* 186 */     String userId = StringUtils.isNull(user.getUserId()) ? "-1L" : user.getUserId();
/* 187 */     SysUser info = this.userMapper.checkEmailUnique(user.getEmail());
/* 188 */     if (StringUtils.isNotNull(info) && !info.getUserId().equalsIgnoreCase(userId)) {
/* 189 */       return "1";
    }
/* 191 */     return "0";
  }






  
  public void checkUserAllowed(SysUser user) {
/* 201 */     if (StringUtils.isNotNull(user.getUserId()) && SecurityUtils.isAdmin(user.getUserId()).booleanValue()) {
/* 202 */       throw new ServiceException("不允许操作超级管理员用户");
    }
  }






  
  public void checkUserDataScope(String userId) {
/* 213 */     if (!SecurityUtils.isAdmin().booleanValue()) {
/* 214 */       SysUser user = new SysUser();
/* 215 */       user.setUserId(userId);
/* 216 */       List<SysUser> users = this.userMapper.selectUserList(user);
/* 217 */       if (StringUtils.isEmpty(users)) {
/* 218 */         throw new ServiceException("没有权限访问用户数据！");
      }
    } 
  }








  
  @Transactional
  public int insertUser(SysUser user) {
/* 233 */     int rows = this.userMapper.insertUser(user);
    
/* 235 */     insertUserPost(user);
    
/* 237 */     insertUserRole(user);
/* 238 */     return rows;
  }







  
  public boolean registerUser(SysUser user) {
/* 249 */     return (this.userMapper.insertUser(user) > 0);
  }







  
  @Transactional
  public int updateUser(SysUser user) {
/* 261 */     String userId = user.getUserId();
    
/* 263 */     this.userRoleMapper.deleteUserRoleByUserId(userId);
    
/* 265 */     insertUserRole(user);
    
/* 267 */     this.userPostMapper.deleteUserPostByUserId(userId);
    
/* 269 */     insertUserPost(user);
/* 270 */     return this.userMapper.updateUser(user);
  }







  
  @Transactional
  public void insertUserAuth(String userId, Long[] roleIds) {
/* 282 */     this.userRoleMapper.deleteUserRoleByUserId(userId);
/* 283 */     insertUserRole(userId, roleIds);
  }







  
  public int updateUserStatus(SysUser user) {
/* 294 */     return this.userMapper.updateUser(user);
  }







  
  public int updateUserProfile(SysUser user) {
/* 305 */     return this.userMapper.updateUser(user);
  }








  
  public boolean updateUserAvatar(String userName, String avatar) {
/* 317 */     return (this.userMapper.updateUserAvatar(userName, avatar) > 0);
  }







  
  public int resetPwd(SysUser user) {
/* 328 */     return this.userMapper.updateUser(user);
  }








  
  public int resetUserPwd(String userName, String password) {
/* 340 */     return this.userMapper.resetUserPwd(userName, password);
  }





  
  public void insertUserRole(SysUser user) {
/* 349 */     insertUserRole(user.getUserId(), user.getRoleIds());
  }





  
  public void insertUserPost(SysUser user) {
/* 358 */     Long[] posts = user.getPostIds();
/* 359 */     if (StringUtils.isNotEmpty((Object[])posts)) {
      
/* 361 */       List<SysUserPost> list = new ArrayList<>(posts.length);
/* 362 */       for (Long postId : posts) {
/* 363 */         SysUserPost up = new SysUserPost();
/* 364 */         up.setUserId(user.getUserId());
/* 365 */         up.setPostId(postId);
/* 366 */         list.add(up);
      } 
/* 368 */       this.userPostMapper.batchUserPost(list);
    } 
  }






  
  public void insertUserRole(String userId, Long[] roleIds) {
/* 379 */     if (StringUtils.isNotEmpty((Object[])roleIds)) {
      
/* 381 */       List<SysUserRole> list = new ArrayList<>(roleIds.length);
/* 382 */       for (Long roleId : roleIds) {
/* 383 */         SysUserRole ur = new SysUserRole();
/* 384 */         ur.setUserId(userId);
/* 385 */         ur.setRoleId(roleId);
/* 386 */         list.add(ur);
      } 
/* 388 */       this.userRoleMapper.batchUserRole(list);
    } 
  }








  
  @Transactional
  public int deleteUserById(String userId) {
/* 402 */     this.userRoleMapper.deleteUserRoleByUserId(userId);
    
/* 404 */     this.userPostMapper.deleteUserPostByUserId(userId);
/* 405 */     return this.userMapper.deleteUserById(userId);
  }







  
  @Transactional
  public int deleteUserByIds(String[] userIds) {
/* 417 */     for (String userId : userIds) {
/* 418 */       checkUserAllowed(new SysUser(userId));
/* 419 */       checkUserDataScope(userId);
    } 
    
/* 422 */     this.userRoleMapper.deleteUserRole(userIds);
    
/* 424 */     this.userPostMapper.deleteUserPost(userIds);
/* 425 */     return this.userMapper.deleteUserByIds(userIds);
  }









  
  public String importUser(List<SysUser> userList, Boolean isUpdateSupport, String operName) {
/* 438 */     if (StringUtils.isNull(userList) || userList.size() == 0) {
/* 439 */       throw new ServiceException("导入用户数据不能为空！");
    }
/* 441 */     int successNum = 0;
/* 442 */     int failureNum = 0;
/* 443 */     StringBuilder successMsg = new StringBuilder();
/* 444 */     StringBuilder failureMsg = new StringBuilder();
/* 445 */     String password = this.configService.selectConfigByKey("sys.user.initPassword");
/* 446 */     for (SysUser user : userList) {
      
      try {
/* 449 */         SysUser u = this.userMapper.selectUserByUserName(user.getUserName());
/* 450 */         if (StringUtils.isNull(u)) {
/* 451 */           BeanValidators.validateWithException(this.validator, user, new Class[0]);
/* 452 */           user.setPassword(SecurityUtils.generatorPassword(password, user.getUserName()));
/* 453 */           user.setCreateBy(operName);
/* 454 */           insertUser(user);
/* 455 */           successNum++;
/* 456 */           successMsg.append("<br/>" + successNum + "、账号 " + user.getUserName() + " 导入成功"); continue;
/* 457 */         }  if (isUpdateSupport.booleanValue()) {
/* 458 */           BeanValidators.validateWithException(this.validator, user, new Class[0]);
/* 459 */           user.setUpdateBy(operName);
/* 460 */           updateUser(user);
/* 461 */           successNum++;
/* 462 */           successMsg.append("<br/>" + successNum + "、账号 " + user.getUserName() + " 更新成功"); continue;
        } 
/* 464 */         failureNum++;
/* 465 */         failureMsg.append("<br/>" + failureNum + "、账号 " + user.getUserName() + " 已存在");
      }
/* 467 */       catch (Exception e) {
/* 468 */         failureNum++;
/* 469 */         String msg = "<br/>" + failureNum + "、账号 " + user.getUserName() + " 导入失败：";
/* 470 */         failureMsg.append(msg + e.getMessage());
/* 471 */         log.error(msg, e);
      } 
    } 
/* 474 */     if (failureNum > 0) {
/* 475 */       failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
/* 476 */       throw new ServiceException(failureMsg.toString());
    } 
/* 478 */     successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
    
/* 480 */     return successMsg.toString();
  }
  
  public List<Map<String, Object>> selectUserOption(SysUser sysUser) {
/* 484 */     return this.userMapper.selectUserOption(sysUser);
  }

  
  public Map<String, Object> queryUserInfoCount(String userPk) {
/* 489 */     return this.userMapper.queryUserInfoCount(userPk);
  }

  
  public List<SysUserVo> selectUserListByHoverCondition(SearchUserVo user) {
/* 494 */     return this.userMapper.selectUserListByHoverCondition(user);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\impl\SysUserServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */