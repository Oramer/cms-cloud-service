package com.cms.base_service.common.utils;


public class EscapeUtil
{
  public static final String RE_HTML_MARK = "(<[^<]*?>)|(<[\\s]*?/[^<]*?>)|(<[^<]*?/[\\s]*?>)";
/*  13 */   private static final char[][] TEXT = new char[64][];
  
  static {
/*  16 */     for (int i = 0; i < 64; i++) {
/*  17 */       (new char[1])[0] = (char)i; TEXT[i] = new char[1];
    } 

    
/*  21 */     TEXT[39] = "&#039;".toCharArray();
/*  22 */     TEXT[34] = "&#34;".toCharArray();
/*  23 */     TEXT[38] = "&#38;".toCharArray();
/*  24 */     TEXT[60] = "&#60;".toCharArray();
/*  25 */     TEXT[62] = "&#62;".toCharArray();
  }






  
  public static String escape(String text) {
/*  35 */     return encode(text);
  }






  
  public static String unescape(String content) {
/*  45 */     return decode(content);
  }






  
  public static String clean(String content) {
/*  55 */     return (new HTMLFilter()).filter(content);
  }






  
  private static String encode(String text) {
/*  65 */     if (StringUtils.isEmpty(text)) {
/*  66 */       return "";
    }
    
/*  69 */     StringBuilder tmp = new StringBuilder(text.length() * 6);
    
/*  71 */     for (int i = 0; i < text.length(); i++) {
/*  72 */       char c = text.charAt(i);
/*  73 */       if (c < 'Ā') {
/*  74 */         tmp.append("%");
/*  75 */         if (c < '\020') {
/*  76 */           tmp.append("0");
        }
/*  78 */         tmp.append(Integer.toString(c, 16));
      } else {
/*  80 */         tmp.append("%u");
/*  81 */         if (c <= '࿿')
        {
/*  83 */           tmp.append("0");
        }
/*  85 */         tmp.append(Integer.toString(c, 16));
      } 
    } 
/*  88 */     return tmp.toString();
  }






  
  public static String decode(String content) {
/*  98 */     if (StringUtils.isEmpty(content)) {
/*  99 */       return content;
    }
    
/* 102 */     StringBuilder tmp = new StringBuilder(content.length());
/* 103 */     int lastPos = 0, pos = 0;
    
/* 105 */     while (lastPos < content.length()) {
/* 106 */       pos = content.indexOf("%", lastPos);
/* 107 */       if (pos == lastPos) {
/* 108 */         if (content.charAt(pos + 1) == 'u') {
/* 109 */           char c = (char)Integer.parseInt(content.substring(pos + 2, pos + 6), 16);
/* 110 */           tmp.append(c);
/* 111 */           lastPos = pos + 6; continue;
        } 
/* 113 */         char ch = (char)Integer.parseInt(content.substring(pos + 1, pos + 3), 16);
/* 114 */         tmp.append(ch);
/* 115 */         lastPos = pos + 3;
        continue;
      } 
/* 118 */       if (pos == -1) {
/* 119 */         tmp.append(content.substring(lastPos));
/* 120 */         lastPos = content.length(); continue;
      } 
/* 122 */       tmp.append(content.substring(lastPos, pos));
/* 123 */       lastPos = pos;
    } 

    
/* 127 */     return tmp.toString();
  }
  
  public static void main(String[] args) {
/* 131 */     String html = "<script>alert(1);</script>";
/* 132 */     String escape = escape(html);


    
/* 136 */     System.out.println("clean: " + clean(html));
/* 137 */     System.out.println("escape: " + escape);
/* 138 */     System.out.println("unescape: " + unescape(escape));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\EscapeUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */