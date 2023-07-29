package com.cms.system_service.system.mapper;

import com.cms.system_service.system.domain.SysRoleMenu;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleMenuMapper {
  int checkMenuExistRole(Long paramLong);
  
  int deleteRoleMenuByRoleId(Long paramLong);
  
  int deleteRoleMenu(Long[] paramArrayOfLong);
  
  int batchRoleMenu(List<SysRoleMenu> paramList);
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\mapper\SysRoleMenuMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */