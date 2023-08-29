package com.cms.system_service.system.service.impl;

import com.aliyun.oss.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.DataScope;
import com.cms.system_service.system.domain.SysRole;
import com.cms.system_service.system.domain.SysRoleDept;
import com.cms.system_service.system.domain.SysRoleMenu;
import com.cms.system_service.system.domain.SysUserRole;
import com.cms.system_service.system.mapper.SysRoleDeptMapper;
import com.cms.system_service.system.mapper.SysRoleMapper;
import com.cms.system_service.system.mapper.SysRoleMenuMapper;
import com.cms.system_service.system.mapper.SysUserRoleMapper;
import com.cms.system_service.system.service.ISysRoleService;

import java.util.*;


@Service
public class SysRoleServiceImpl
  implements ISysRoleService
{
  @Autowired(required = false)
  private SysRoleMapper roleMapper;
  @Autowired(required = false)
  private SysRoleMenuMapper roleMenuMapper;
  @Autowired(required = false)
  private SysUserRoleMapper userRoleMapper;
  @Autowired(required = false)
  private SysRoleDeptMapper roleDeptMapper;

  @DataScope(deptAlias = "d")
  public List<SysRole> selectRoleList(SysRole role) {
/*  57 */     return this.roleMapper.selectRoleList(role);
  }








  public List<SysRole> selectRolesByUserId(String userId) {
/*  68 */     List<SysRole> userRoles = this.roleMapper.selectRolePermissionByUserId(userId);
/*  69 */     List<SysRole> roles = selectRoleAll();
/*  70 */     for (SysRole role : roles) {
/*  71 */       for (SysRole userRole : userRoles) {
/*  72 */         if (role.getRoleId().longValue() == userRole.getRoleId().longValue()) {
/*  73 */           role.setFlag(true);
        }
      }
    }

/*  78 */     return roles;
  }








  public Set<String> selectRolePermissionByUserId(String userId) {
/*  89 */     List<SysRole> perms = this.roleMapper.selectRolePermissionByUserId(userId);
/*  90 */     Set<String> permsSet = new HashSet<>();
/*  91 */     for (SysRole perm : perms) {
/*  92 */       if (StringUtils.isNotNull(perm)) {
/*  93 */         permsSet.addAll(Arrays.asList(perm.getRoleKey().trim().split(",")));
      }
    }
/*  96 */     return permsSet;
  }







  public List<SysRole> selectRoleAll() {
/* 106 */     return this.roleMapper.selectRoleList(new SysRole());
  }








  public List<Long> selectRoleListByUserId(Long userId) {
/* 117 */     return this.roleMapper.selectRoleListByUserId(userId);
  }








  public SysRole selectRoleById(Long roleId) {
/* 128 */     return this.roleMapper.selectRoleById(roleId);
  }








  public String checkRoleNameUnique(SysRole role) {
/* 139 */     Long roleId = Long.valueOf(StringUtils.isNull(role.getRoleId()) ? -1L : role.getRoleId().longValue());
/* 140 */     SysRole info = this.roleMapper.checkRoleNameUnique(role.getRoleName());
/* 141 */     if (StringUtils.isNotNull(info) && info.getRoleId().longValue() != roleId.longValue()) {
/* 142 */       return "1";
    }
/* 144 */     return "0";
  }








  public String checkRoleKeyUnique(SysRole role) {
/* 155 */     Long roleId = Long.valueOf(StringUtils.isNull(role.getRoleId()) ? -1L : role.getRoleId().longValue());
/* 156 */     SysRole info = this.roleMapper.checkRoleKeyUnique(role.getRoleKey());



/* 160 */     if (StringUtils.isNotNull(info) && info.getRoleId() != roleId) {
/* 161 */       return "1";
    }
/* 163 */     return "0";
  }







  public void checkRoleAllowed(SysRole role) {
/* 173 */     if (StringUtils.isNotNull(role.getRoleId()) && role.isAdmin()) {
/* 174 */       throw new ServiceException("不允许操作超级管理员角色");
    }
  }







  public void checkRoleDataScope(Long roleId) {
/* 185 */     if (!SecurityUtils.isAdmin().booleanValue()) {
/* 186 */       SysRole role = new SysRole();
/* 187 */       role.setRoleId(roleId);
/* 188 */       List<SysRole> roles = this.roleMapper.selectRoleList(role);
/* 189 */       if (StringUtils.isEmpty(roles)) {
/* 190 */         throw new ServiceException("没有权限访问角色数据！");
      }
    }
  }








  public int countUserRoleByRoleId(Long roleId) {
/* 203 */     return this.userRoleMapper.countUserRoleByRoleId(roleId);
  }









  @Transactional
  public int insertRole(SysRole role) {
/* 216 */     this.roleMapper.insertRole(role);
/* 217 */     return insertRoleMenu(role);
  }









  @Transactional
  public int updateRole(SysRole role) {
/* 230 */     this.roleMapper.updateRole(role);

/* 232 */     this.roleMenuMapper.deleteRoleMenuByRoleId(role.getRoleId());
/* 233 */     return insertRoleMenu(role);
  }








  public int updateRoleStatus(SysRole role) {
/* 244 */     return this.roleMapper.updateRole(role);
  }









  @Transactional
  public int authDataScope(SysRole role) {
/* 257 */     this.roleMapper.updateRole(role);

/* 259 */     this.roleDeptMapper.deleteRoleDeptByRoleId(role.getRoleId());

/* 261 */     return insertRoleDept(role);
  }






  public int insertRoleMenu(SysRole role) {
/* 270 */     int rows = 1;

/* 272 */     List<SysRoleMenu> list = new ArrayList<>();
/* 273 */     for (Long menuId : role.getMenuIds()) {
/* 274 */       SysRoleMenu rm = new SysRoleMenu();
/* 275 */       rm.setRoleId(role.getRoleId());
/* 276 */       rm.setMenuId(menuId);
/* 277 */       list.add(rm);
    }
/* 279 */     if (list.size() > 0) {
/* 280 */       rows = this.roleMenuMapper.batchRoleMenu(list);
    }
/* 282 */     return rows;
  }






  public int insertRoleDept(SysRole role) {
/* 291 */     int rows = 1;

/* 293 */     List<SysRoleDept> list = new ArrayList<>();
/* 294 */     for (Long deptId : role.getDeptIds()) {
/* 295 */       SysRoleDept rd = new SysRoleDept();
/* 296 */       rd.setRoleId(role.getRoleId());
/* 297 */       rd.setDeptId(deptId);
/* 298 */       list.add(rd);
    }
/* 300 */     if (list.size() > 0) {
/* 301 */       rows = this.roleDeptMapper.batchRoleDept(list);
    }
/* 303 */     return rows;
  }









  @Transactional
  public int deleteRoleById(Long roleId) {
/* 316 */     this.roleMenuMapper.deleteRoleMenuByRoleId(roleId);

/* 318 */     this.roleDeptMapper.deleteRoleDeptByRoleId(roleId);
/* 319 */     return this.roleMapper.deleteRoleById(roleId);
  }








  @Transactional
  public int deleteRoleByIds(Long[] roleIds) {
/* 331 */     for (Long roleId : roleIds) {
/* 332 */       checkRoleAllowed(new SysRole(roleId));
/* 333 */       checkRoleDataScope(roleId);
/* 334 */       SysRole role = selectRoleById(roleId);
/* 335 */       if (countUserRoleByRoleId(roleId) > 0) {
/* 336 */         throw new ServiceException(String.format("%1$s已分配,不能删除", new Object[] { role.getRoleName() }));
      }
    }

/* 340 */     this.roleMenuMapper.deleteRoleMenu(roleIds);

/* 342 */     this.roleDeptMapper.deleteRoleDept(roleIds);
/* 343 */     return this.roleMapper.deleteRoleByIds(roleIds);
  }








  public int deleteAuthUser(SysUserRole userRole) {
/* 354 */     return this.userRoleMapper.deleteUserRoleInfo(userRole);
  }









  public int deleteAuthUsers(Long roleId, Long[] userIds) {
/* 366 */     return this.userRoleMapper.deleteUserRoleInfos(roleId, userIds);
  }










  public int insertAuthUsers(Long roleId, String[] userIds) {
/* 379 */     List<SysUserRole> list = new ArrayList<>();
/* 380 */     for (String userId : userIds) {
/* 381 */       SysUserRole ur = new SysUserRole();
/* 382 */       ur.setUserId(userId);
/* 383 */       ur.setRoleId(roleId);
/* 384 */       list.add(ur);
    }
/* 386 */     return this.userRoleMapper.batchUserRole(list);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\impl\SysRoleServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */