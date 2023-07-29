package com.cms.system_service.system.controller;

import com.cms.base_service.annotation.DataScope;
import com.cms.base_service.annotation.PreAuthor;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.ExcelUtil;
import com.cms.base_service.common.utils.IdUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.aspectj.lang.annotation.Log;
import com.cms.base_service.framework.aspectj.lang.enums.BusinessType;
import com.cms.base_service.framework.web.controller.BaseController;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.system_service.system.domain.SysRole;
import com.cms.system_service.system.domain.SysUser;
import com.cms.system_service.system.service.ISysPostService;
import com.cms.system_service.system.service.ISysRoleService;
import com.cms.system_service.system.service.ISysUserService;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping({"/system/user"})
public class SysUserController
        extends BaseController {
    @Autowired
    private ISysUserService userService;
    @Autowired
    private ISysRoleService roleService;
    @Autowired
    private ISysPostService postService;

    @DataScope
    @PreAuthor("system:user:list")
    @GetMapping({"/list"})
    public TableDataInfo list(SysUser user) {
        /*  62 */
        if (SecurityUtils.isAdmin().booleanValue()) {
            /*  63 */
            user.setCloudPk("");
        }
        /*  65 */
        startPage();
        /*  66 */
        List<SysUser> list = this.userService.selectUserList(user);
        /*  67 */
        return getDataTable(list);
    }

    @Log(title = "用户管理", businessType = BusinessType.EXPORT)
    @PreAuthor("system:user:export")
    @PostMapping({"/export"})
    public void export(HttpServletResponse response, SysUser user) {
        /*  74 */
        List<SysUser> list = this.userService.selectUserList(user);
        /*  75 */
        ExcelUtil<SysUser> util = new ExcelUtil(SysUser.class);
        /*  76 */
        util.exportExcel(response, list, "用户数据");
    }

    @Log(title = "用户管理", businessType = BusinessType.IMPORT)
    @PreAuthor("system:user:import")
    @PostMapping({"/importData"})
    public RestResult importData(MultipartFile file, boolean updateSupport) throws Exception {
        /*  83 */
        ExcelUtil<SysUser> util = new ExcelUtil(SysUser.class);
        /*  84 */
        List<SysUser> userList = util.importExcel(file.getInputStream());
        /*  85 */
        String operName = getUsername();
        /*  86 */
        String message = this.userService.importUser(userList, Boolean.valueOf(updateSupport), operName);
        /*  87 */
        return RestResult.ok(message);
    }

    @PostMapping({"/importTemplate"})
    public void importTemplate(HttpServletResponse response) {
        /*  92 */
        ExcelUtil<SysUser> util = new ExcelUtil(SysUser.class);
        /*  93 */
        util.importTemplateExcel(response, "用户数据");
    }


    @PreAuthor("system:user:query")
    @GetMapping({"/", "/{userId}"})
    public RestResult getInfo(@PathVariable(value = "userId", required = false) String userId) {
        /* 102 */
        this.userService.checkUserDataScope(userId);

        /* 104 */
        List<SysRole> roles = this.roleService.selectRoleAll();
        /* 105 */
        HashMap<String, Object> map = new HashMap<>();
        /* 106 */
        map.put("roles", SecurityUtils.isAdmin(userId).booleanValue() ? roles : roles.stream().filter(r -> !r.isAdmin()).collect(Collectors.toList()));
        /* 107 */
        map.put("posts", this.postService.selectPostAll());
        /* 108 */
        if (StringUtils.isNotNull(userId)) {
            /* 109 */
            SysUser sysUser = this.userService.selectUserById(userId);
            /* 110 */
            map.put("data", sysUser);
            /* 111 */
            map.put("postIds", this.postService.selectPostListByUserId(userId));
            /* 112 */
            map.put("roleIds", sysUser.getRoles().stream().map(SysRole::getRoleId).collect(Collectors.toList()));
        }
        /* 114 */
        RestResult ajax = RestResult.ok(map);
        /* 115 */
        return ajax;
    }


    @PreAuthor("system:user:add")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping
    public RestResult add(@Validated @RequestBody SysUser user) {
        /* 125 */
        if ("1".equals(this.userService.checkUserNameUnique(user.getUserName())))
            /* 126 */ {
            return RestResult.fail("新增用户'" + user.getUserName() + "'失败，登录账号已存在");
        }
        /* 127 */
        if (StringUtils.isNotEmpty(user.getPhonenumber()) && "1"
/* 128 */.equals(this.userService.checkPhoneUnique(user)))
            /* 129 */ {
            return RestResult.fail("新增用户'" + user.getUserName() + "'失败，手机号码已存在");
        }
        /* 130 */
        if (StringUtils.isNotEmpty(user.getEmail()) && "1"
/* 131 */.equals(this.userService.checkEmailUnique(user))) {
            /* 132 */
            return RestResult.fail("新增用户'" + user.getUserName() + "'失败，邮箱账号已存在");
        }
        /* 134 */
        user.setUserId(IdUtils.get());
        /* 135 */
        user.setCreateBy(getUsername());
        /* 136 */
        user.setPassword(SecurityUtils.generatorPassword(user.getPassword(), user.getUserName()));
        /* 137 */
        return toAjax(this.userService.insertUser(user));
    }


    @PreAuthor("system:user:edit")
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public RestResult edit(@Validated @RequestBody SysUser user) {
        /* 147 */
        this.userService.checkUserAllowed(user);
        /* 148 */
        this.userService.checkUserDataScope(user.getUserId());
        /* 149 */
        if (StringUtils.isNotEmpty(user.getPhonenumber()) && "1"
/* 150 */.equals(this.userService.checkPhoneUnique(user)))
            /* 151 */ {
            return RestResult.fail("修改用户'" + user.getUserName() + "'失败，手机号码已存在");
        }
        /* 152 */
        if (StringUtils.isNotEmpty(user.getEmail()) && "1"
/* 153 */.equals(this.userService.checkEmailUnique(user))) {
            /* 154 */
            return RestResult.fail("修改用户'" + user.getUserName() + "'失败，邮箱账号已存在");
        }
        /* 156 */
        user.setUpdateBy(getUsername());
        /* 157 */
        return toAjax(this.userService.updateUser(user));
    }


    @PreAuthor("system:user:remove")
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
    @DeleteMapping({"/{userIds}"})
    public RestResult remove(@PathVariable String[] userIds) {
        /* 167 */
        if (ArrayUtils.contains((Object[]) userIds, getUserId())) {
            /* 168 */
            return error("当前用户不能删除");
        }
        /* 170 */
        return toAjax(this.userService.deleteUserByIds(userIds));
    }


    @PreAuthor("system:user:resetPwd")
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PutMapping({"/resetPwd"})
    public RestResult resetPwd(@RequestBody SysUser user) {
        /* 180 */
        this.userService.checkUserAllowed(user);
        /* 181 */
        this.userService.checkUserDataScope(user.getUserId());
        /* 182 */
        SysUser user2 = this.userService.selectUserById(user.getUserId());
        /* 183 */
        user.setPassword(SecurityUtils.generatorPassword(user.getPassword(), user2.getUserName().trim()));
        /* 184 */
        user.setUpdateBy(getUsername());
        /* 185 */
        return toAjax(this.userService.resetPwd(user));
    }


    @PreAuthor("system:user:edit")
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PutMapping({"/changeStatus"})
    public RestResult changeStatus(@RequestBody SysUser user) {
        /* 195 */
        this.userService.checkUserAllowed(user);
        /* 196 */
        this.userService.checkUserDataScope(user.getUserId());
        /* 197 */
        user.setUpdateBy(getUsername());
        /* 198 */
        return toAjax(this.userService.updateUserStatus(user));
    }


    @PreAuthor("system:user:query")
    @GetMapping({"/authRole/{userId}"})
    public RestResult authRole(@PathVariable("userId") String userId) {
        /* 207 */
        SysUser user = this.userService.selectUserById(userId);
        /* 208 */
        List<SysRole> roles = this.roleService.selectRolesByUserId(userId);
        /* 209 */
        HashMap<String, Object> map = new HashMap<>();
        /* 210 */
        map.put("user", user);
        /* 211 */
        map.put("roles", SecurityUtils.isAdmin(userId).booleanValue() ? roles : roles.stream().filter(r -> !r.isAdmin()).collect(Collectors.toList()));
        /* 212 */
        RestResult ajax = RestResult.ok(map);
        /* 213 */
        return ajax;
    }


    @PreAuthor("system:user:edit")
    @Log(title = "用户管理", businessType = BusinessType.GRANT)
    @PutMapping({"/authRole"})
    public RestResult insertAuthRole(String userId, Long[] roleIds) {
        /* 223 */
        this.userService.checkUserDataScope(userId);
        /* 224 */
        this.userService.insertUserAuth(userId, roleIds);
        /* 225 */
        return success();
    }


    @GetMapping({"/optionselect"})
    public RestResult optionselect(SysUser user) {
        /* 231 */
        return RestResult.ok(this.userService.selectUserOption(user));
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\controller\SysUserController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */