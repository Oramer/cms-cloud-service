 package com.cms.base_service.common;

 import com.cms.base_service.common.utils.StringUtils;
 import java.nio.charset.Charset;
 import java.nio.charset.StandardCharsets;












 public class CharsetKit
 {
   public static final String ISO_8859_1 = "ISO-8859-1";
   public static final String UTF_8 = "UTF-8";
   public static final String GBK = "GBK";
/* 23 */   public static final Charset CHARSET_ISO_8859_1 = Charset.forName("ISO-8859-1");

/* 25 */   public static final Charset CHARSET_UTF_8 = Charset.forName("UTF-8");

/* 27 */   public static final Charset CHARSET_GBK = Charset.forName("GBK");








   public static Charset charset(String charset) {
/* 37 */     return StringUtils.isEmpty(charset) ? Charset.defaultCharset() : Charset.forName(charset);
   }










   public static String convert(String source, String srcCharset, String destCharset) {
/* 50 */     return convert(source, Charset.forName(srcCharset), Charset.forName(destCharset));
   }










   public static String convert(String source, Charset srcCharset, Charset destCharset) {
/* 63 */     if (null == srcCharset)
     {
/* 65 */       srcCharset = StandardCharsets.ISO_8859_1;
     }

/* 68 */     if (null == destCharset)
     {
/* 70 */       destCharset = StandardCharsets.UTF_8;
     }

/* 73 */     if (StringUtils.isEmpty(source) || srcCharset.equals(destCharset))
     {
/* 75 */       return source;
     }
/* 77 */     return new String(source.getBytes(srcCharset), destCharset);
   }





   public static String systemCharset() {
/* 85 */     return Charset.defaultCharset().name();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\CharsetKit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */