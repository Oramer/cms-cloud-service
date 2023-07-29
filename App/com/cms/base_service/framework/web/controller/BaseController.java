package com.cms.base_service.framework.web.controller;

import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.PageUtils;
import com.cms.base_service.common.utils.SecurityUtils;
import com.cms.base_service.common.utils.SqlUtil;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.web.page.PageDomain;
import com.cms.base_service.framework.web.page.TableDataInfo;
import com.cms.base_service.framework.web.page.TableSupport;
import com.cms.system_service.system.domain.SysUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.beans.PropertyEditor;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;




public class BaseController
{
/*  27 */   protected final Logger logger = LoggerFactory.getLogger(getClass());




  
  @InitBinder
  public void initBinder(WebDataBinder binder) {
/*  35 */     binder.registerCustomEditor(Date.class, (PropertyEditor)new Object());
  }








  
  protected void startPage() {
/*  47 */     PageUtils.startPage();
  }



  
  protected void startOrderBy() {
/*  54 */     PageDomain pageDomain = TableSupport.buildPageRequest();
/*  55 */     if (StringUtils.isNotEmpty(pageDomain.getOrderBy())) {
/*  56 */       String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
/*  57 */       PageHelper.orderBy(orderBy);
    } 
  }



  
  protected void clearPage() {
/*  65 */     PageUtils.clearPage();
  }




  
  protected TableDataInfo getDataTable(List<?> list) {
/*  73 */     PageInfo info = new PageInfo(list);
/*  74 */     TableDataInfo rspData = new TableDataInfo();
/*  75 */     rspData.setCode(200);
/*  76 */     rspData.setMsg("查询成功");
/*  77 */     rspData.setRows(list);
/*  78 */     rspData.setTotal(info.getTotal());
/*  79 */     rspData.setPages(info.getPages());
/*  80 */     return rspData;
  }



  
  public RestResult success() {
/*  87 */     return RestResult.ok();
  }



  
  public RestResult error() {
/*  94 */     return RestResult.fail();
  }



  
  public RestResult success(String message) {
/* 101 */     return RestResult.ok(message);
  }



  
  public RestResult error(String message) {
/* 108 */     return RestResult.fail(message);
  }






  
  protected RestResult toAjax(int rows) {
/* 118 */     return (rows > 0) ? RestResult.ok() : RestResult.fail();
  }






  
  protected RestResult toAjax(boolean result) {
/* 128 */     return result ? success() : error();
  }



  
  public SysUser getLoginUser() {
/* 135 */     return SecurityUtils.getLoginUser();
  }



  
  public String getUserId() {
/* 142 */     return getLoginUser().getUserId();
  }



  
  public String getDeptId() {
/* 149 */     return getLoginUser().getDeptId();
  }



  
  public String getUsername() {
/* 156 */     return getLoginUser().getUserName();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\web\controller\BaseController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */