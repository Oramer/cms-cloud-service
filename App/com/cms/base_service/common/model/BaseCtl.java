package com.cms.base_service.common.model;

import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.web.page.PageDomain;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BaseCtl {
    /* 11 */   private static final Logger log = LoggerFactory.getLogger(com.cms.base_service.common.model.BaseCtl.class);


    protected void startPage() {
        /* 19 */
        PageDomain pageDomain = TableSupport.buildPageRequest();
        /* 20 */
        Integer pageNum = pageDomain.getPageNum();
        /* 21 */
        Integer pageSize = pageDomain.getPageSize();
        /* 22 */
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)) {
            /* 23 */
            PageHelper.startPage(pageNum.intValue(), pageSize.intValue(), pageDomain.getOrderBy());
        }
    }


    protected TableDataInfo getDataTable(List<?> list) {
        /* 31 */
        PageInfo info = new PageInfo(list);
        /* 32 */
        TableDataInfo rspData = new TableDataInfo();
        /* 33 */
        rspData.setCode(Constants.BUSSINESS_SUCCESS_CODE.intValue());
        /* 34 */
        rspData.setMsg("查询成功");
        /* 35 */
        rspData.setRows(list);
        /* 36 */
        rspData.setTotal(info.getTotal());
        /* 37 */
        rspData.setPages(info.getPages());
        /* 38 */
        rspData.setSuccess(Boolean.valueOf(true));
        /* 39 */
        return rspData;
    }


    protected RestResult toAjax(int rows) {
        /* 49 */
        return (rows > 0) ? RestResult.ok() : RestResult.fail();
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\BaseCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */