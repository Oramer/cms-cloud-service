package com.cms.base_service.common.utils;

import com.cms.base_service.common.utils.Convert;
import com.cms.base_service.common.utils.StringUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;








public class ServletUtils
{
  public static String getParameter(String name) {
/*  26 */     return getRequest().getParameter(name);
  }



  
  public static String getParameter(String name, String defaultValue) {
/*  33 */     return Convert.toStr(getRequest().getParameter(name), defaultValue);
  }



  
  public static Integer getParameterToInt(String name) {
/*  40 */     return Convert.toInt(getRequest().getParameter(name));
  }



  
  public static Integer getParameterToInt(String name, Integer defaultValue) {
/*  47 */     return Convert.toInt(getRequest().getParameter(name), defaultValue);
  }



  
  public static Boolean getParameterToBool(String name) {
/*  54 */     return Convert.toBool(getRequest().getParameter(name));
  }



  
  public static Boolean getParameterToBool(String name, Boolean defaultValue) {
/*  61 */     return Convert.toBool(getRequest().getParameter(name), defaultValue);
  }



  
  public static HttpServletRequest getRequest() {
/*  68 */     return getRequestAttributes().getRequest();
  }



  
  public static HttpServletResponse getResponse() {
/*  75 */     return getRequestAttributes().getResponse();
  }



  
  public static HttpSession getSession() {
/*  82 */     return getRequest().getSession();
  }
  
  public static ServletRequestAttributes getRequestAttributes() {
/*  86 */     RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
/*  87 */     return (ServletRequestAttributes)attributes;
  }






  
  public static void renderString(HttpServletResponse response, String string) {
    try {
/*  98 */       response.setStatus(200);
/*  99 */       response.setContentType("application/json");
/* 100 */       response.setCharacterEncoding("utf-8");
/* 101 */       response.getWriter().print(string);
/* 102 */     } catch (IOException e) {
/* 103 */       e.printStackTrace();
    } 
  }





  
  public static boolean isAjaxRequest(HttpServletRequest request) {
/* 113 */     String accept = request.getHeader("accept");
/* 114 */     if (accept != null && accept.contains("application/json")) {
/* 115 */       return true;
    }
    
/* 118 */     String xRequestedWith = request.getHeader("X-Requested-With");
/* 119 */     if (xRequestedWith != null && xRequestedWith.contains("XMLHttpRequest")) {
/* 120 */       return true;
    }
    
/* 123 */     String uri = request.getRequestURI();
/* 124 */     if (StringUtils.inStringIgnoreCase(uri, new String[] { ".json", ".xml" })) {
/* 125 */       return true;
    }
    
/* 128 */     String ajax = request.getParameter("__ajax");
/* 129 */     return StringUtils.inStringIgnoreCase(ajax, new String[] { "json", "xml" });
  }






  
  public static String urlEncode(String str) {
    try {
/* 140 */       return URLEncoder.encode(str, "UTF-8");
/* 141 */     } catch (UnsupportedEncodingException e) {
/* 142 */       return "";
    } 
  }






  
  public static String urlDecode(String str) {
    try {
/* 154 */       return URLDecoder.decode(str, "UTF-8");
/* 155 */     } catch (UnsupportedEncodingException e) {
/* 156 */       return "";
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\ServletUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */