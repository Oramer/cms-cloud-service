package com.cms.base_service.common.utils;

import com.cms.base_service.common.utils.StringUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.Set;












public class Convert
{
  public static String toStr(Object value, String defaultValue) {
/*  25 */     if (null == value) {
/*  26 */       return defaultValue;
    }
/*  28 */     if (value instanceof String) {
/*  29 */       return (String)value;
    }
/*  31 */     return value.toString();
  }








  
  public static String toStr(Object value) {
/*  43 */     return toStr(value, null);
  }









  
  public static Character toChar(Object value, Character defaultValue) {
/*  56 */     if (null == value) {
/*  57 */       return defaultValue;
    }
/*  59 */     if (value instanceof Character) {
/*  60 */       return (Character)value;
    }
    
/*  63 */     String valueStr = toStr(value, null);
/*  64 */     return Character.valueOf(StringUtils.isEmpty(valueStr) ? defaultValue.charValue() : valueStr.charAt(0));
  }








  
  public static Character toChar(Object value) {
/*  76 */     return toChar(value, null);
  }









  
  public static Byte toByte(Object value, Byte defaultValue) {
/*  89 */     if (value == null) {
/*  90 */       return defaultValue;
    }
/*  92 */     if (value instanceof Byte) {
/*  93 */       return (Byte)value;
    }
/*  95 */     if (value instanceof Number) {
/*  96 */       return Byte.valueOf(((Number)value).byteValue());
    }
/*  98 */     String valueStr = toStr(value, null);
/*  99 */     if (StringUtils.isEmpty(valueStr)) {
/* 100 */       return defaultValue;
    }
    try {
/* 103 */       return Byte.valueOf(Byte.parseByte(valueStr));
/* 104 */     } catch (Exception e) {
/* 105 */       return defaultValue;
    } 
  }








  
  public static Byte toByte(Object value) {
/* 118 */     return toByte(value, null);
  }









  
  public static Short toShort(Object value, Short defaultValue) {
/* 131 */     if (value == null) {
/* 132 */       return defaultValue;
    }
/* 134 */     if (value instanceof Short) {
/* 135 */       return (Short)value;
    }
/* 137 */     if (value instanceof Number) {
/* 138 */       return Short.valueOf(((Number)value).shortValue());
    }
/* 140 */     String valueStr = toStr(value, null);
/* 141 */     if (StringUtils.isEmpty(valueStr)) {
/* 142 */       return defaultValue;
    }
    try {
/* 145 */       return Short.valueOf(Short.parseShort(valueStr.trim()));
/* 146 */     } catch (Exception e) {
/* 147 */       return defaultValue;
    } 
  }








  
  public static Short toShort(Object value) {
/* 160 */     return toShort(value, null);
  }









  
  public static Number toNumber(Object value, Number defaultValue) {
/* 173 */     if (value == null) {
/* 174 */       return defaultValue;
    }
/* 176 */     if (value instanceof Number) {
/* 177 */       return (Number)value;
    }
/* 179 */     String valueStr = toStr(value, null);
/* 180 */     if (StringUtils.isEmpty(valueStr)) {
/* 181 */       return defaultValue;
    }
    try {
/* 184 */       return NumberFormat.getInstance().parse(valueStr);
/* 185 */     } catch (Exception e) {
/* 186 */       return defaultValue;
    } 
  }








  
  public static Number toNumber(Object value) {
/* 199 */     return toNumber(value, null);
  }









  
  public static Integer toInt(Object value, Integer defaultValue) {
/* 212 */     if (value == null) {
/* 213 */       return defaultValue;
    }
/* 215 */     if (value instanceof Integer) {
/* 216 */       return (Integer)value;
    }
/* 218 */     if (value instanceof Number) {
/* 219 */       return Integer.valueOf(((Number)value).intValue());
    }
/* 221 */     String valueStr = toStr(value, null);
/* 222 */     if (StringUtils.isEmpty(valueStr)) {
/* 223 */       return defaultValue;
    }
    try {
/* 226 */       return Integer.valueOf(Integer.parseInt(valueStr.trim()));
/* 227 */     } catch (Exception e) {
/* 228 */       return defaultValue;
    } 
  }








  
  public static Integer toInt(Object value) {
/* 241 */     return toInt(value, null);
  }






  
  public static Integer[] toIntArray(String str) {
/* 251 */     return toIntArray(",", str);
  }






  
  public static Long[] toLongArray(String str) {
/* 261 */     return toLongArray(",", str);
  }







  
  public static Integer[] toIntArray(String split, String str) {
/* 272 */     if (StringUtils.isEmpty(str)) {
/* 273 */       return new Integer[0];
    }
/* 275 */     String[] arr = str.split(split);
/* 276 */     Integer[] ints = new Integer[arr.length];
/* 277 */     for (int i = 0; i < arr.length; i++) {
/* 278 */       Integer v = toInt(arr[i], Integer.valueOf(0));
/* 279 */       ints[i] = v;
    } 
/* 281 */     return ints;
  }







  
  public static Long[] toLongArray(String split, String str) {
/* 292 */     if (StringUtils.isEmpty(str)) {
/* 293 */       return new Long[0];
    }
/* 295 */     String[] arr = str.split(split);
/* 296 */     Long[] longs = new Long[arr.length];
/* 297 */     for (int i = 0; i < arr.length; i++) {
/* 298 */       Long v = toLong(arr[i], null);
/* 299 */       longs[i] = v;
    } 
/* 301 */     return longs;
  }






  
  public static String[] toStrArray(String str) {
/* 311 */     return toStrArray(",", str);
  }







  
  public static String[] toStrArray(String split, String str) {
/* 322 */     return str.split(split);
  }









  
  public static Long toLong(Object value, Long defaultValue) {
/* 335 */     if (value == null) {
/* 336 */       return defaultValue;
    }
/* 338 */     if (value instanceof Long) {
/* 339 */       return (Long)value;
    }
/* 341 */     if (value instanceof Number) {
/* 342 */       return Long.valueOf(((Number)value).longValue());
    }
/* 344 */     String valueStr = toStr(value, null);
/* 345 */     if (StringUtils.isEmpty(valueStr)) {
/* 346 */       return defaultValue;
    }
    
    try {
/* 350 */       return Long.valueOf((new BigDecimal(valueStr.trim())).longValue());
/* 351 */     } catch (Exception e) {
/* 352 */       return defaultValue;
    } 
  }








  
  public static Long toLong(Object value) {
/* 365 */     return toLong(value, null);
  }









  
  public static Double toDouble(Object value, Double defaultValue) {
/* 378 */     if (value == null) {
/* 379 */       return defaultValue;
    }
/* 381 */     if (value instanceof Double) {
/* 382 */       return (Double)value;
    }
/* 384 */     if (value instanceof Number) {
/* 385 */       return Double.valueOf(((Number)value).doubleValue());
    }
/* 387 */     String valueStr = toStr(value, null);
/* 388 */     if (StringUtils.isEmpty(valueStr)) {
/* 389 */       return defaultValue;
    }
    
    try {
/* 393 */       return Double.valueOf((new BigDecimal(valueStr.trim())).doubleValue());
/* 394 */     } catch (Exception e) {
/* 395 */       return defaultValue;
    } 
  }








  
  public static Double toDouble(Object value) {
/* 408 */     return toDouble(value, null);
  }









  
  public static Float toFloat(Object value, Float defaultValue) {
/* 421 */     if (value == null) {
/* 422 */       return defaultValue;
    }
/* 424 */     if (value instanceof Float) {
/* 425 */       return (Float)value;
    }
/* 427 */     if (value instanceof Number) {
/* 428 */       return Float.valueOf(((Number)value).floatValue());
    }
/* 430 */     String valueStr = toStr(value, null);
/* 431 */     if (StringUtils.isEmpty(valueStr)) {
/* 432 */       return defaultValue;
    }
    try {
/* 435 */       return Float.valueOf(Float.parseFloat(valueStr.trim()));
/* 436 */     } catch (Exception e) {
/* 437 */       return defaultValue;
    } 
  }








  
  public static Float toFloat(Object value) {
/* 450 */     return toFloat(value, null);
  }









  
  public static Boolean toBool(Object value, Boolean defaultValue) {
/* 463 */     if (value == null) {
/* 464 */       return defaultValue;
    }
/* 466 */     if (value instanceof Boolean) {
/* 467 */       return (Boolean)value;
    }
/* 469 */     String valueStr = toStr(value, null);
/* 470 */     if (StringUtils.isEmpty(valueStr)) {
/* 471 */       return defaultValue;
    }
/* 473 */     valueStr = valueStr.trim().toLowerCase();
/* 474 */     switch (valueStr) {
      case "true":
/* 476 */         return Boolean.valueOf(true);
      case "false":
/* 478 */         return Boolean.valueOf(false);
      case "yes":
/* 480 */         return Boolean.valueOf(true);
      case "ok":
/* 482 */         return Boolean.valueOf(true);
      case "no":
/* 484 */         return Boolean.valueOf(false);
      case "1":
/* 486 */         return Boolean.valueOf(true);
      case "0":
/* 488 */         return Boolean.valueOf(false);
    } 
/* 490 */     return defaultValue;
  }









  
  public static Boolean toBool(Object value) {
/* 503 */     return toBool(value, null);
  }









  
  public static <E extends Enum<E>> E toEnum(Class<E> clazz, Object value, E defaultValue) {
/* 516 */     if (value == null) {
/* 517 */       return defaultValue;
    }
/* 519 */     if (clazz.isAssignableFrom(value.getClass()))
    {
/* 521 */       return (E)value;
    }
    
/* 524 */     String valueStr = toStr(value, null);
/* 525 */     if (StringUtils.isEmpty(valueStr)) {
/* 526 */       return defaultValue;
    }
    try {
/* 529 */       return Enum.valueOf(clazz, valueStr);
/* 530 */     } catch (Exception e) {
/* 531 */       return defaultValue;
    } 
  }








  
  public static <E extends Enum<E>> E toEnum(Class<E> clazz, Object value) {
/* 544 */     return toEnum(clazz, value, null);
  }









  
  public static BigInteger toBigInteger(Object value, BigInteger defaultValue) {
/* 557 */     if (value == null) {
/* 558 */       return defaultValue;
    }
/* 560 */     if (value instanceof BigInteger) {
/* 561 */       return (BigInteger)value;
    }
/* 563 */     if (value instanceof Long) {
/* 564 */       return BigInteger.valueOf(((Long)value).longValue());
    }
/* 566 */     String valueStr = toStr(value, null);
/* 567 */     if (StringUtils.isEmpty(valueStr)) {
/* 568 */       return defaultValue;
    }
    try {
/* 571 */       return new BigInteger(valueStr);
/* 572 */     } catch (Exception e) {
/* 573 */       return defaultValue;
    } 
  }








  
  public static BigInteger toBigInteger(Object value) {
/* 586 */     return toBigInteger(value, null);
  }









  
  public static BigDecimal toBigDecimal(Object value, BigDecimal defaultValue) {
/* 599 */     if (value == null) {
/* 600 */       return defaultValue;
    }
/* 602 */     if (value instanceof BigDecimal) {
/* 603 */       return (BigDecimal)value;
    }
/* 605 */     if (value instanceof Long) {
/* 606 */       return new BigDecimal(((Long)value).longValue());
    }
/* 608 */     if (value instanceof Double) {
/* 609 */       return new BigDecimal(((Double)value).doubleValue());
    }
/* 611 */     if (value instanceof Integer) {
/* 612 */       return new BigDecimal(((Integer)value).intValue());
    }
/* 614 */     String valueStr = toStr(value, null);
/* 615 */     if (StringUtils.isEmpty(valueStr)) {
/* 616 */       return defaultValue;
    }
    try {
/* 619 */       return new BigDecimal(valueStr);
/* 620 */     } catch (Exception e) {
/* 621 */       return defaultValue;
    } 
  }








  
  public static BigDecimal toBigDecimal(Object value) {
/* 634 */     return toBigDecimal(value, null);
  }







  
  public static String utf8Str(Object obj) {
/* 645 */     return str(obj, "utf-8");
  }








  
  public static String str(Object obj, String charsetName) {
/* 657 */     return str(obj, Charset.forName(charsetName));
  }








  
  public static String str(Object obj, Charset charset) {
/* 669 */     if (null == obj) {
/* 670 */       return null;
    }
    
/* 673 */     if (obj instanceof String)
/* 674 */       return (String)obj; 
/* 675 */     if (obj instanceof byte[] || obj instanceof Byte[])
/* 676 */       return str(obj, charset); 
/* 677 */     if (obj instanceof ByteBuffer) {
/* 678 */       return str((ByteBuffer)obj, charset);
    }
/* 680 */     return obj.toString();
  }







  
  public static String str(byte[] bytes, String charset) {
/* 691 */     return str(bytes, StringUtils.isEmpty(charset) ? Charset.defaultCharset() : Charset.forName(charset));
  }







  
  public static String str(byte[] data, Charset charset) {
/* 702 */     if (data == null) {
/* 703 */       return null;
    }
    
/* 706 */     if (null == charset) {
/* 707 */       return new String(data);
    }
/* 709 */     return new String(data, charset);
  }







  
  public static String str(ByteBuffer data, String charset) {
/* 720 */     if (data == null) {
/* 721 */       return null;
    }
    
/* 724 */     return str(data, Charset.forName(charset));
  }







  
  public static String str(ByteBuffer data, Charset charset) {
/* 735 */     if (null == charset) {
/* 736 */       charset = Charset.defaultCharset();
    }
/* 738 */     return charset.decode(data).toString();
  }








  
  public static String toSBC(String input) {
/* 750 */     return toSBC(input, null);
  }







  
  public static String toSBC(String input, Set<Character> notConvertSet) {
/* 761 */     char[] c = input.toCharArray();
/* 762 */     for (int i = 0; i < c.length; i++) {
/* 763 */       if (null == notConvertSet || !notConvertSet.contains(Character.valueOf(c[i])))
      {


        
/* 768 */         if (c[i] == ' ') {
/* 769 */           c[i] = '　';
/* 770 */         } else if (c[i] < '') {
/* 771 */           c[i] = (char)(c[i] + 65248);
        } 
      }
    } 
/* 775 */     return new String(c);
  }






  
  public static String toDBC(String input) {
/* 785 */     return toDBC(input, null);
  }







  
  public static String toDBC(String text, Set<Character> notConvertSet) {
/* 796 */     char[] c = text.toCharArray();
/* 797 */     for (int i = 0; i < c.length; i++) {
/* 798 */       if (null == notConvertSet || !notConvertSet.contains(Character.valueOf(c[i])))
      {


        
/* 803 */         if (c[i] == '　') {
/* 804 */           c[i] = ' ';
/* 805 */         } else if (c[i] > '＀' && c[i] < '｟') {
/* 806 */           c[i] = (char)(c[i] - 65248);
        }  } 
    } 
/* 809 */     String returnString = new String(c);
    
/* 811 */     return returnString;
  }






  
  public static String digitUppercase(double n) {
/* 821 */     String[] fraction = { "角", "分" };
/* 822 */     String[] digit = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
/* 823 */     String[][] unit = { { "元", "万", "亿" }, { "", "拾", "佰", "仟" } };
    
/* 825 */     String head = (n < 0.0D) ? "负" : "";
/* 826 */     n = Math.abs(n);
    
/* 828 */     String s = "";
/* 829 */     for (int i = 0; i < fraction.length; i++) {
/* 830 */       s = s + (digit[(int)(Math.floor(n * 10.0D * Math.pow(10.0D, i)) % 10.0D)] + fraction[i]).replaceAll("(零.)+", "");
    }
/* 832 */     if (s.length() < 1) {
/* 833 */       s = "整";
    }
/* 835 */     int integerPart = (int)Math.floor(n);
    
/* 837 */     for (int j = 0; j < (unit[0]).length && integerPart > 0; j++) {
/* 838 */       String p = "";
/* 839 */       for (int k = 0; k < (unit[1]).length && n > 0.0D; k++) {
/* 840 */         p = digit[integerPart % 10] + unit[1][k] + p;
/* 841 */         integerPart /= 10;
      } 
/* 843 */       s = p.replaceAll("(零.)*零$", "").replaceAll("^$", "零") + unit[0][j] + s;
    } 
/* 845 */     return head + s.replaceAll("(零.)*零元", "元").replaceFirst("(零.)+", "").replaceAll("(零.)+", "零").replaceAll("^整$", "零元整");
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\Convert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */