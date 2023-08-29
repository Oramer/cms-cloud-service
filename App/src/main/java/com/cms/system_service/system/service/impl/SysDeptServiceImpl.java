package com.cms.system_service.system.service.impl;

import com.aliyun.oss.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.base_service.common.utils.*;
import com.cms.base_service.framework.aspectj.lang.annotation.DataScope;
import com.cms.system_service.system.domain.SysDept;
import com.cms.system_service.system.domain.SysRole;
import com.cms.system_service.system.mapper.SysDeptMapper;
import com.cms.system_service.system.mapper.SysRoleMapper;
import com.cms.system_service.system.service.ISysDeptService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class SysDeptServiceImpl
        implements ISysDeptService {
    @Autowired(required = false)
    private SysDeptMapper deptMapper;
    @Autowired(required = false)
    private SysRoleMapper roleMapper;
    @Override
    @DataScope(deptAlias = "d")
    public List<SysDept> selectDeptList(SysDept dept) {
        /*  42 */
        return this.deptMapper.selectDeptList(dept);
    }

    @Override
    public List<SysDept> buildDeptTree(List<SysDept> depts) {
        /*  53 */
        List<SysDept> returnList = new ArrayList<>();
        /*  54 */
        List<String> tempList = new ArrayList<>();
        /*  55 */
        for (SysDept dept : depts) {
            /*  56 */
            tempList.add(dept.getDeptId());
        }
        /*  58 */
        for (SysDept dept : depts) {

            /*  60 */
            if (!tempList.contains(dept.getParentId())) {
                /*  61 */
                recursionFn(depts, dept);
                /*  62 */
                returnList.add(dept);
            }
        }
        /*  65 */
        if (returnList.isEmpty()) {
            /*  66 */
            returnList = depts;
        }
        /*  68 */
        return returnList;
    }

    @Override
    public List<TreeSelect> buildDeptTreeSelect(List<SysDept> depts) {
        /*  79 */
        List<SysDept> deptTrees = buildDeptTree(depts);
        /*  80 */
        return (List<TreeSelect>) deptTrees.stream().map(TreeSelect::new).collect(Collectors.toList());
    }

    @Override
    public List<Long> selectDeptListByRoleId(Long roleId) {
        /*  91 */
        SysRole role = this.roleMapper.selectRoleById(roleId);
        /*  92 */
        return this.deptMapper.selectDeptListByRoleId(roleId, role.isDeptCheckStrictly());
    }

    @Override
    public SysDept selectDeptById(String deptId) {
        /* 103 */
        return this.deptMapper.selectDeptById(deptId);
    }

    @Override
    public int selectNormalChildrenDeptById(String deptId) {
        /* 114 */
        return this.deptMapper.selectNormalChildrenDeptById(deptId);
    }

    @Override
    public boolean hasChildByDeptId(String deptId) {
        /* 125 */
        int result = this.deptMapper.hasChildByDeptId(deptId);
        /* 126 */
        return (result > 0);
    }

    @Override
    public boolean checkDeptExistUser(String deptId) {
        /* 137 */
        int result = this.deptMapper.checkDeptExistUser(deptId);
        /* 138 */
        return (result > 0);
    }

    @Override
    public String checkDeptNameUnique(SysDept dept) {
        /* 149 */
        String deptId = StringUtils.isNull(dept.getDeptId()) ? "-1L" : dept.getDeptId();
        /* 150 */
        SysDept info = this.deptMapper.checkDeptNameUnique(dept.getDeptName(), dept.getParentId());
        /* 151 */
        if (StringUtils.isNotNull(info) && !info.getDeptId().equalsIgnoreCase(deptId)) {
            /* 152 */
            return "1";
        }
        /* 154 */
        return "0";
    }

    @Override
    public void checkDeptDataScope(String deptId) {
        /* 164 */
        if (!SecurityUtils.isAdmin().booleanValue()) {
            /* 165 */
            SysDept dept = new SysDept();
            /* 166 */
            dept.setDeptId(deptId);
            /* 167 */
            List<SysDept> depts = this.deptMapper.selectDeptList(dept);
            /* 168 */
            if (StringUtils.isEmpty(depts)) {
                /* 169 */
                throw new ServiceException("没有权限访问部门数据！");
            }
        }
    }

    @Override
    public int insertDept(SysDept dept) {
        /* 182 */
        if (StringUtils.isBlank(dept.getDeptId())) {
            /* 183 */
            dept.setDeptId(IdUtils.get());
        }
        /* 185 */
        SysDept info = this.deptMapper.selectDeptById(dept.getParentId());

        /* 187 */
        if (!"0".equals(info.getStatus())) {
            /* 188 */
            throw new ServiceException("部门停用，不允许新增");
        }
        /* 190 */
        dept.setAncestors(info.getAncestors() + "," + dept.getParentId());
        /* 191 */
        return this.deptMapper.insertDept(dept);
    }

    @Override
    public int updateDept(SysDept dept) {
        /* 202 */
        SysDept newParentDept = this.deptMapper.selectDeptById(dept.getParentId());
        /* 203 */
        SysDept oldDept = this.deptMapper.selectDeptById(dept.getDeptId());
        /* 204 */
        if (StringUtils.isNotNull(newParentDept) && StringUtils.isNotNull(oldDept)) {
            /* 205 */
            String newAncestors = newParentDept.getAncestors() + "," + newParentDept.getDeptId();
            /* 206 */
            String oldAncestors = oldDept.getAncestors();
            /* 207 */
            dept.setAncestors(newAncestors);
            /* 208 */
            updateDeptChildren(dept.getDeptId(), newAncestors, oldAncestors);
        }
        /* 210 */
        int result = this.deptMapper.updateDept(dept);
        /* 211 */
        if ("0".equals(dept.getStatus()) && StringUtils.isNotEmpty(dept.getAncestors()) &&
                /* 212 */       !StringUtils.equals("0", dept.getAncestors())) {
            /* 214 */
            updateParentDeptStatusNormal(dept);
        }
        /* 216 */
        return result;
    }


    private void updateParentDeptStatusNormal(SysDept dept) {
        /* 227 */
        String ancestors = dept.getAncestors();
        /* 228 */
        Long[] deptIds = Convert.toLongArray(ancestors);
        /* 229 */
        this.deptMapper.updateDeptStatusNormal(deptIds);
    }


    public void updateDeptChildren(String deptId, String newAncestors, String oldAncestors) {
        /* 240 */
        List<SysDept> children = this.deptMapper.selectChildrenDeptById(deptId);
        /* 241 */
        for (SysDept child : children) {
            /* 242 */
            child.setAncestors(child.getAncestors().replaceFirst(oldAncestors, newAncestors));
        }
        /* 244 */
        if (children.size() > 0) {
            /* 245 */
            this.deptMapper.updateDeptChildren(children);
        }
    }

    @Override
    public int deleteDeptById(String deptId) {
        /* 257 */
        return this.deptMapper.deleteDeptById(deptId);
    }


    private void recursionFn(List<SysDept> list, SysDept t) {
        /* 265 */
        List<SysDept> childList = getChildList(list, t);
        /* 266 */
        t.setChildren(childList);
        /* 267 */
        for (SysDept tChild : childList) {
            /* 268 */
            if (hasChild(list, tChild)) {
                /* 269 */
                recursionFn(list, tChild);
            }
        }
    }


    private List<SysDept> getChildList(List<SysDept> list, SysDept t) {
        /* 278 */
        List<SysDept> tlist = new ArrayList<>();
        /* 279 */
        Iterator<SysDept> it = list.iterator();
        /* 280 */
        while (it.hasNext()) {
            /* 281 */
            SysDept n = it.next();
            /* 282 */
            if (StringUtils.isNotNull(n.getParentId()) && n.getParentId().equalsIgnoreCase(t.getDeptId())) {
                /* 283 */
                tlist.add(n);
            }
        }
        /* 286 */
        return tlist;
    }


    private boolean hasChild(List<SysDept> list, SysDept t) {
        /* 293 */
        return (getChildList(list, t).size() > 0);
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\service\impl\SysDeptServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */