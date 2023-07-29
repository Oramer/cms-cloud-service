package com.cms.base_service.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.cms.base_service.common.HttpUtils;
import com.cms.base_service.common.utils.EscapeUtil;
import com.cms.base_service.common.utils.StringUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IpUtils
{
/*  16 */   private static final Logger log = LoggerFactory.getLogger(com.cms.base_service.common.utils.IpUtils.class);

  
  public static final String IP_URL = "http://whois.pconline.com.cn/ipJson.jsp";

  
  public static final String UNKNOWN = "XX XX";

  
  public static String getRealAddressByIP(String ip) {
/*  26 */     String address = "XX XX";
    
/*  28 */     if (internalIp(ip)) {
/*  29 */       return "内网IP";
    }
    try {
/*  32 */       HashMap<String, String> map = new HashMap<>();
/*  33 */       map.put("ip", ip);
/*  34 */       map.put("json", "true");
/*  35 */       String rspStr = HttpUtils.sendGet("http://whois.pconline.com.cn/ipJson.jsp", map);
/*  36 */       if (StringUtils.isEmpty(rspStr)) {
/*  37 */         log.error("获取地理位置异常 {}", ip);
/*  38 */         return "XX XX";
      } 
/*  40 */       JSONObject obj = JSONObject.parseObject(rspStr);
/*  41 */       String region = obj.getString("pro");
/*  42 */       String city = obj.getString("city");
/*  43 */       return String.format("%s %s", new Object[] { region, city });
/*  44 */     } catch (Exception e) {
/*  45 */       log.error("获取地理位置异常 {}", ip);
      
/*  47 */       return address;
    } 
  }
  public static String getIpAddr(HttpServletRequest request) {
/*  51 */     if (request == null) {
/*  52 */       return "unknown";
    }
/*  54 */     String ip = request.getHeader("x-forwarded-for");
/*  55 */     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
/*  56 */       ip = request.getHeader("Proxy-Client-IP");
    }
/*  58 */     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
/*  59 */       ip = request.getHeader("X-Forwarded-For");
    }
/*  61 */     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
/*  62 */       ip = request.getHeader("WL-Proxy-Client-IP");
    }
/*  64 */     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
/*  65 */       ip = request.getHeader("X-Real-IP");
    }
    
/*  68 */     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
/*  69 */       ip = request.getRemoteAddr();
    }
/*  71 */     return "0:0:0:0:0:0:0:1".equals(ip) ? "127.0.0.1" : EscapeUtil.clean(ip);
  }
  
  public static boolean internalIp(String ip) {
/*  75 */     byte[] addr = textToNumericFormatV4(ip);
/*  76 */     return (internalIp(addr) || "127.0.0.1".equals(ip));
  }
  
  private static boolean internalIp(byte[] addr) {
/*  80 */     if (StringUtils.isNull(addr) || addr.length < 2) {
/*  81 */       return true;
    }
/*  83 */     byte b0 = addr[0];
/*  84 */     byte b1 = addr[1];
    
/*  86 */     byte SECTION_1 = 10;
    
/*  88 */     byte SECTION_2 = -84;
/*  89 */     byte SECTION_3 = 16;
/*  90 */     byte SECTION_4 = 31;
    
/*  92 */     byte SECTION_5 = -64;
/*  93 */     byte SECTION_6 = -88;
/*  94 */     switch (b0) {
      case 10:
/*  96 */         return true;
      case -84:
/*  98 */         if (b1 >= 16 && b1 <= 31) {
/*  99 */           return true;
        }
      case -64:
/* 102 */         switch (b1) {
          case -88:
/* 104 */             return true;
        }  break;
    } 
/* 107 */     return false;
  }







  
  public static byte[] textToNumericFormatV4(String text) {
/* 118 */     if (text.length() == 0) {
/* 119 */       return null;
    }
    
/* 122 */     byte[] bytes = new byte[4];
/* 123 */     String[] elements = text.split("\\.", -1);
    try {
      long l;
      int i;
/* 127 */       switch (elements.length) {
        case 1:
/* 129 */           l = Long.parseLong(elements[0]);
/* 130 */           if (l < 0L || l > 4294967295L) {
/* 131 */             return null;
          }
/* 133 */           bytes[0] = (byte)(int)(l >> 24L & 0xFFL);
/* 134 */           bytes[1] = (byte)(int)((l & 0xFFFFFFL) >> 16L & 0xFFL);
/* 135 */           bytes[2] = (byte)(int)((l & 0xFFFFL) >> 8L & 0xFFL);
/* 136 */           bytes[3] = (byte)(int)(l & 0xFFL);












































          
/* 182 */           return bytes;case 2: l = Integer.parseInt(elements[0]); if (l < 0L || l > 255L) return null;  bytes[0] = (byte)(int)(l & 0xFFL); l = Integer.parseInt(elements[1]); if (l < 0L || l > 16777215L) return null;  bytes[1] = (byte)(int)(l >> 16L & 0xFFL); bytes[2] = (byte)(int)((l & 0xFFFFL) >> 8L & 0xFFL); bytes[3] = (byte)(int)(l & 0xFFL); return bytes;case 3: for (i = 0; i < 2; i++) { l = Integer.parseInt(elements[i]); if (l < 0L || l > 255L) return null;  bytes[i] = (byte)(int)(l & 0xFFL); }  l = Integer.parseInt(elements[2]); if (l < 0L || l > 65535L) return null;  bytes[2] = (byte)(int)(l >> 8L & 0xFFL); bytes[3] = (byte)(int)(l & 0xFFL); return bytes;case 4: for (i = 0; i < 4; i++) { l = Integer.parseInt(elements[i]); if (l < 0L || l > 255L) return null;  bytes[i] = (byte)(int)(l & 0xFFL); }  return bytes;
      }  return null;
    } catch (NumberFormatException e) {
      return null;
    }  } public static String getHostIp() { try {
/* 187 */       return InetAddress.getLocalHost().getHostAddress();
/* 188 */     } catch (UnknownHostException unknownHostException) {
      
/* 190 */       return "127.0.0.1";
    }  }
  
  public static String getHostName() {
    try {
/* 195 */       return InetAddress.getLocalHost().getHostName();
/* 196 */     } catch (UnknownHostException unknownHostException) {
      
/* 198 */       return "未知";
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\IpUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */