package com.cms.buss_service.fenxiao;

import com.aliyun.oss.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.DataScope;
import com.cms.system_service.system.domain.SysUserRole;
import com.cms.system_service.system.mapper.SysUserRoleMapper;

import java.util.*;


@Service
public class SysRoleFenxiaoService
{
  @Autowired(required = false)
  private SysRoleFenxiaoMapper roleMapper;
  @Autowired(required = false)
  private SysRoleFenxiaoMapper roleMenuMapper;
  @Autowired(required = false)
  private SysUserRoleMapper userRoleMapper;
  
  @DataScope(deptAlias = "d")
  public List<SysRoleFenxiao> selectRoleList(SysRoleFenxiao role) {
/*  42 */     return this.roleMapper.selectRoleList(role);
  }







  
  public List<SysRoleFenxiao> selectRolesByUserId(String userId) {
/*  53 */     List<SysRoleFenxiao> userRoles = this.roleMapper.selectRolePermissionByUserId(userId);
/*  54 */     List<SysRoleFenxiao> roles = selectRoleAll();
/*  55 */     for (SysRoleFenxiao role : roles) {
/*  56 */       for (SysRoleFenxiao userRole : userRoles) {
/*  57 */         if (role.getRoleId().longValue() == userRole.getRoleId().longValue()) {
          break;
        }
      } 
    } 
/*  62 */     return roles;
  }







  
  public Set<String> selectRolePermissionByUserId(String userId) {
/*  73 */     List<SysRoleFenxiao> perms = this.roleMapper.selectRolePermissionByUserId(userId);
/*  74 */     Set<String> permsSet = new HashSet<>();
/*  75 */     for (SysRoleFenxiao perm : perms) {
/*  76 */       if (StringUtils.isNotNull(perm)) {
/*  77 */         permsSet.addAll(Arrays.asList(perm.getRoleKey().trim().split(",")));
      }
    } 
/*  80 */     return permsSet;
  }






  
  public List<SysRoleFenxiao> selectRoleAll() {
/*  90 */     return this.roleMapper.selectRoleList(new SysRoleFenxiao());
  }







  
  public List<Long> selectRoleListByUserId(Long userId) {
/* 101 */     return this.roleMapper.selectRoleListByUserId(userId);
  }







  
  public SysRoleFenxiao selectRoleById(Long roleId) {
/* 112 */     return this.roleMapper.selectRoleById(roleId);
  }







  
  public String checkRoleNameUnique(SysRoleFenxiao role) {
/* 123 */     Long roleId = Long.valueOf(StringUtils.isNull(role.getRoleId()) ? -1L : role.getRoleId().longValue());
/* 124 */     SysRoleFenxiao info = this.roleMapper.checkRoleNameUnique(role.getRoleName());
/* 125 */     if (StringUtils.isNotNull(info) && info.getRoleId().longValue() != roleId.longValue()) {
/* 126 */       return "1";
    }
/* 128 */     return "0";
  }







  
  public String checkRoleKeyUnique(SysRoleFenxiao role) {
/* 139 */     Long roleId = Long.valueOf(StringUtils.isNull(role.getRoleId()) ? -1L : role.getRoleId().longValue());
/* 140 */     SysRoleFenxiao info = this.roleMapper.checkRoleKeyUnique(role.getRoleKey());


    
/* 144 */     if (StringUtils.isNotNull(info) && info.getRoleId() != roleId) {
/* 145 */       return "1";
    }
/* 147 */     return "0";
  }






  
  public void checkRoleDataScope(Long roleId) {
/* 157 */     if (!SecurityUtils.isAdmin().booleanValue()) {
/* 158 */       SysRoleFenxiao role = new SysRoleFenxiao();
/* 159 */       role.setRoleId(roleId);
/* 160 */       List<SysRoleFenxiao> roles = this.roleMapper.selectRoleList(role);
/* 161 */       if (StringUtils.isEmpty(roles)) {
/* 162 */         throw new ServiceException("没有权限访问角色数据！");
      }
    } 
  }







  
  public int countUserRoleByRoleId(Long roleId) {
/* 175 */     return this.userRoleMapper.countUserRoleByRoleId(roleId);
  }









  
  @Transactional
  public int insertRole(SysRoleFenxiao role) {
/* 189 */     return this.roleMapper.insertRole(role);
  }







  
  @Transactional
  public int updateRole(SysRoleFenxiao role) {
/* 201 */     return this.roleMapper.updateRole(role);
  }







  
  public int updateRoleStatus(SysRoleFenxiao role) {
/* 212 */     return this.roleMapper.updateRole(role);
  }








  
  @Transactional
  public int authDataScope(SysRoleFenxiao role) {
/* 225 */     return insertRole(role);
  }








  
  @Transactional
  public int deleteRoleById(Long roleId) {
/* 238 */     return this.roleMapper.deleteRoleById(roleId);
  }







  
  @Transactional
  public int deleteRoleByIds(Long[] roleIds) {
/* 250 */     return this.roleMapper.deleteRoleByIds(roleIds);
  }







  
  public int deleteAuthUser(SysUserRole userRole) {
/* 261 */     return this.userRoleMapper.deleteUserRoleInfo(userRole);
  }








  
  public int deleteAuthUsers(Long roleId, Long[] userIds) {
/* 273 */     return this.userRoleMapper.deleteUserRoleInfos(roleId, userIds);
  }









  
  public int insertAuthUsers(Long roleId, String[] userIds) {
/* 286 */     List<SysUserRole> list = new ArrayList<>();
/* 287 */     for (String userId : userIds) {
/* 288 */       SysUserRole ur = new SysUserRole();
/* 289 */       ur.setUserId(userId);
/* 290 */       ur.setRoleId(roleId);
/* 291 */       list.add(ur);
    } 
/* 293 */     return this.userRoleMapper.batchUserRole(list);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\fenxiao\SysRoleFenxiaoService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */