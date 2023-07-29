package com.cms.base_service.common;

import com.cms.base_service.common.CharsetKit;
import com.cms.base_service.common.utils.StringUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
















public class Convert
{
  public static String toStr(Object value, String defaultValue) {
/*  31 */     if (null == value)
    {
/*  33 */       return defaultValue;
    }
/*  35 */     if (value instanceof String)
    {
/*  37 */       return (String)value;
    }
/*  39 */     return value.toString();
  }










  public static String toStr(Object value) {
/*  52 */     return toStr(value, null);
  }











  public static Character toChar(Object value, Character defaultValue) {
/*  66 */     if (null == value)
    {
/*  68 */       return defaultValue;
    }
/*  70 */     if (value instanceof Character)
    {
/*  72 */       return (Character)value;
    }

/*  75 */     String valueStr = toStr(value, null);
/*  76 */     return Character.valueOf(StringUtils.isEmpty(valueStr) ? defaultValue.charValue() : valueStr.charAt(0));
  }










  public static Character toChar(Object value) {
/*  89 */     return toChar(value, null);
  }











  public static Byte toByte(Object value, Byte defaultValue) {
/* 103 */     if (value == null)
    {
/* 105 */       return defaultValue;
    }
/* 107 */     if (value instanceof Byte)
    {
/* 109 */       return (Byte)value;
    }
/* 111 */     if (value instanceof Number)
    {
/* 113 */       return Byte.valueOf(((Number)value).byteValue());
    }
/* 115 */     String valueStr = toStr(value, null);
/* 116 */     if (StringUtils.isEmpty(valueStr))
    {
/* 118 */       return defaultValue;
    }

    try {
/* 122 */       return Byte.valueOf(Byte.parseByte(valueStr));
    }
/* 124 */     catch (Exception e) {

/* 126 */       return defaultValue;
    }
  }










  public static Byte toByte(Object value) {
/* 140 */     return toByte(value, null);
  }











  public static Short toShort(Object value, Short defaultValue) {
/* 154 */     if (value == null)
    {
/* 156 */       return defaultValue;
    }
/* 158 */     if (value instanceof Short)
    {
/* 160 */       return (Short)value;
    }
/* 162 */     if (value instanceof Number)
    {
/* 164 */       return Short.valueOf(((Number)value).shortValue());
    }
/* 166 */     String valueStr = toStr(value, null);
/* 167 */     if (StringUtils.isEmpty(valueStr))
    {
/* 169 */       return defaultValue;
    }

    try {
/* 173 */       return Short.valueOf(Short.parseShort(valueStr.trim()));
    }
/* 175 */     catch (Exception e) {

/* 177 */       return defaultValue;
    }
  }










  public static Short toShort(Object value) {
/* 191 */     return toShort(value, null);
  }











  public static Number toNumber(Object value, Number defaultValue) {
/* 205 */     if (value == null)
    {
/* 207 */       return defaultValue;
    }
/* 209 */     if (value instanceof Number)
    {
/* 211 */       return (Number)value;
    }
/* 213 */     String valueStr = toStr(value, null);
/* 214 */     if (StringUtils.isEmpty(valueStr))
    {
/* 216 */       return defaultValue;
    }

    try {
/* 220 */       return NumberFormat.getInstance().parse(valueStr);
    }
/* 222 */     catch (Exception e) {

/* 224 */       return defaultValue;
    }
  }










  public static Number toNumber(Object value) {
/* 238 */     return toNumber(value, null);
  }











  public static Integer toInt(Object value, Integer defaultValue) {
/* 252 */     if (value == null)
    {
/* 254 */       return defaultValue;
    }
/* 256 */     if (value instanceof Integer)
    {
/* 258 */       return (Integer)value;
    }
/* 260 */     if (value instanceof Number)
    {
/* 262 */       return Integer.valueOf(((Number)value).intValue());
    }
/* 264 */     String valueStr = toStr(value, null);
/* 265 */     if (StringUtils.isEmpty(valueStr))
    {
/* 267 */       return defaultValue;
    }

    try {
/* 271 */       return Integer.valueOf(Integer.parseInt(valueStr.trim()));
    }
/* 273 */     catch (Exception e) {

/* 275 */       return defaultValue;
    }
  }










  public static Integer toInt(Object value) {
/* 289 */     return toInt(value, null);
  }








  public static Integer[] toIntArray(String str) {
/* 300 */     return toIntArray(",", str);
  }








  public static Long[] toLongArray(String str) {
/* 311 */     return toLongArray(",", str);
  }









  public static Integer[] toIntArray(String split, String str) {
/* 323 */     if (StringUtils.isEmpty(str))
    {
/* 325 */       return new Integer[0];
    }
/* 327 */     String[] arr = str.split(split);
/* 328 */     Integer[] ints = new Integer[arr.length];
/* 329 */     for (int i = 0; i < arr.length; i++) {

/* 331 */       Integer v = toInt(arr[i], Integer.valueOf(0));
/* 332 */       ints[i] = v;
    }
/* 334 */     return ints;
  }









  public static Long[] toLongArray(String split, String str) {
/* 346 */     if (StringUtils.isEmpty(str))
    {
/* 348 */       return new Long[0];
    }
/* 350 */     String[] arr = str.split(split);
/* 351 */     Long[] longs = new Long[arr.length];
/* 352 */     for (int i = 0; i < arr.length; i++) {

/* 354 */       Long v = toLong(arr[i], null);
/* 355 */       longs[i] = v;
    }
/* 357 */     return longs;
  }








  public static String[] toStrArray(String str) {
/* 368 */     return toStrArray(",", str);
  }









  public static String[] toStrArray(String split, String str) {
/* 380 */     return str.split(split);
  }











  public static Long toLong(Object value, Long defaultValue) {
/* 394 */     if (value == null)
    {
/* 396 */       return defaultValue;
    }
/* 398 */     if (value instanceof Long)
    {
/* 400 */       return (Long)value;
    }
/* 402 */     if (value instanceof Number)
    {
/* 404 */       return Long.valueOf(((Number)value).longValue());
    }
/* 406 */     String valueStr = toStr(value, null);
/* 407 */     if (StringUtils.isEmpty(valueStr))
    {
/* 409 */       return defaultValue;
    }


    try {
/* 414 */       return Long.valueOf((new BigDecimal(valueStr.trim())).longValue());
    }
/* 416 */     catch (Exception e) {

/* 418 */       return defaultValue;
    }
  }










  public static Long toLong(Object value) {
/* 432 */     return toLong(value, null);
  }











  public static Double toDouble(Object value, Double defaultValue) {
/* 446 */     if (value == null)
    {
/* 448 */       return defaultValue;
    }
/* 450 */     if (value instanceof Double)
    {
/* 452 */       return (Double)value;
    }
/* 454 */     if (value instanceof Number)
    {
/* 456 */       return Double.valueOf(((Number)value).doubleValue());
    }
/* 458 */     String valueStr = toStr(value, null);
/* 459 */     if (StringUtils.isEmpty(valueStr))
    {
/* 461 */       return defaultValue;
    }


    try {
/* 466 */       return Double.valueOf((new BigDecimal(valueStr.trim())).doubleValue());
    }
/* 468 */     catch (Exception e) {

/* 470 */       return defaultValue;
    }
  }










  public static Double toDouble(Object value) {
/* 484 */     return toDouble(value, null);
  }











  public static Float toFloat(Object value, Float defaultValue) {
/* 498 */     if (value == null)
    {
/* 500 */       return defaultValue;
    }
/* 502 */     if (value instanceof Float)
    {
/* 504 */       return (Float)value;
    }
/* 506 */     if (value instanceof Number)
    {
/* 508 */       return Float.valueOf(((Number)value).floatValue());
    }
/* 510 */     String valueStr = toStr(value, null);
/* 511 */     if (StringUtils.isEmpty(valueStr))
    {
/* 513 */       return defaultValue;
    }

    try {
/* 517 */       return Float.valueOf(Float.parseFloat(valueStr.trim()));
    }
/* 519 */     catch (Exception e) {

/* 521 */       return defaultValue;
    }
  }










  public static Float toFloat(Object value) {
/* 535 */     return toFloat(value, null);
  }











  public static Boolean toBool(Object value, Boolean defaultValue) {
/* 549 */     if (value == null)
    {
/* 551 */       return defaultValue;
    }
/* 553 */     if (value instanceof Boolean)
    {
/* 555 */       return (Boolean)value;
    }
/* 557 */     String valueStr = toStr(value, null);
/* 558 */     if (StringUtils.isEmpty(valueStr))
    {
/* 560 */       return defaultValue;
    }
/* 562 */     valueStr = valueStr.trim().toLowerCase();
/* 563 */     switch (valueStr) {

      case "true":
      case "yes":
      case "ok":
      case "1":
/* 569 */         return Boolean.valueOf(true);
      case "false":
      case "no":
      case "0":
/* 573 */         return Boolean.valueOf(false);
    }
/* 575 */     return defaultValue;
  }











  public static Boolean toBool(Object value) {
/* 589 */     return toBool(value, null);
  }











  public static <E extends Enum<E>> E toEnum(Class<E> clazz, Object value, E defaultValue) {
/* 603 */     if (value == null)
    {
/* 605 */       return defaultValue;
    }
/* 607 */     if (clazz.isAssignableFrom(value.getClass()))
    {

/* 610 */       return (E)value;
    }

/* 613 */     String valueStr = toStr(value, null);
/* 614 */     if (StringUtils.isEmpty(valueStr))
    {
/* 616 */       return defaultValue;
    }

    try {
/* 620 */       return Enum.valueOf(clazz, valueStr);
    }
/* 622 */     catch (Exception e) {

/* 624 */       return defaultValue;
    }
  }










  public static <E extends Enum<E>> E toEnum(Class<E> clazz, Object value) {
/* 638 */     return toEnum(clazz, value, null);
  }











  public static BigInteger toBigInteger(Object value, BigInteger defaultValue) {
/* 652 */     if (value == null)
    {
/* 654 */       return defaultValue;
    }
/* 656 */     if (value instanceof BigInteger)
    {
/* 658 */       return (BigInteger)value;
    }
/* 660 */     if (value instanceof Long)
    {
/* 662 */       return BigInteger.valueOf(((Long)value).longValue());
    }
/* 664 */     String valueStr = toStr(value, null);
/* 665 */     if (StringUtils.isEmpty(valueStr))
    {
/* 667 */       return defaultValue;
    }

    try {
/* 671 */       return new BigInteger(valueStr);
    }
/* 673 */     catch (Exception e) {

/* 675 */       return defaultValue;
    }
  }










  public static BigInteger toBigInteger(Object value) {
/* 689 */     return toBigInteger(value, null);
  }











  public static BigDecimal toBigDecimal(Object value, BigDecimal defaultValue) {
/* 703 */     if (value == null)
    {
/* 705 */       return defaultValue;
    }
/* 707 */     if (value instanceof BigDecimal)
    {
/* 709 */       return (BigDecimal)value;
    }
/* 711 */     if (value instanceof Long)
    {
/* 713 */       return new BigDecimal(((Long)value).longValue());
    }
/* 715 */     if (value instanceof Double)
    {
/* 717 */       return new BigDecimal(((Double)value).doubleValue());
    }
/* 719 */     if (value instanceof Integer)
    {
/* 721 */       return new BigDecimal(((Integer)value).intValue());
    }
/* 723 */     String valueStr = toStr(value, null);
/* 724 */     if (StringUtils.isEmpty(valueStr))
    {
/* 726 */       return defaultValue;
    }

    try {
/* 730 */       return new BigDecimal(valueStr);
    }
/* 732 */     catch (Exception e) {

/* 734 */       return defaultValue;
    }
  }










  public static BigDecimal toBigDecimal(Object value) {
/* 748 */     return toBigDecimal(value, null);
  }









  public static String utf8Str(Object obj) {
/* 760 */     return str(obj, CharsetKit.CHARSET_UTF_8);
  }










  public static String str(Object obj, String charsetName) {
/* 773 */     return str(obj, Charset.forName(charsetName));
  }










  public static String str(Object obj, Charset charset) {
/* 786 */     if (null == obj)
    {
/* 788 */       return null;
    }

/* 791 */     if (obj instanceof String)
    {
/* 793 */       return (String)obj;
    }
/* 795 */     if (obj instanceof byte[])
    {
/* 797 */       return str((byte[])obj, charset);
    }
/* 799 */     if (obj instanceof Byte[]) {

/* 801 */       byte[] bytes = ArrayUtils.toPrimitive((Byte[])obj);
/* 802 */       return str(bytes, charset);
    }
/* 804 */     if (obj instanceof ByteBuffer)
    {
/* 806 */       return str((ByteBuffer)obj, charset);
    }
/* 808 */     return obj.toString();
  }









  public static String str(byte[] bytes, String charset) {
/* 820 */     return str(bytes, StringUtils.isEmpty(charset) ? Charset.defaultCharset() : Charset.forName(charset));
  }









  public static String str(byte[] data, Charset charset) {
/* 832 */     if (data == null)
    {
/* 834 */       return null;
    }

/* 837 */     if (null == charset)
    {
/* 839 */       return new String(data);
    }
/* 841 */     return new String(data, charset);
  }









  public static String str(ByteBuffer data, String charset) {
/* 853 */     if (data == null)
    {
/* 855 */       return null;
    }

/* 858 */     return str(data, Charset.forName(charset));
  }









  public static String str(ByteBuffer data, Charset charset) {
/* 870 */     if (null == charset)
    {
/* 872 */       charset = Charset.defaultCharset();
    }
/* 874 */     return charset.decode(data).toString();
  }









  public static String toSBC(String input) {
/* 886 */     return toSBC(input, null);
  }









  public static String toSBC(String input, Set<Character> notConvertSet) {
/* 898 */     char[] c = input.toCharArray();
/* 899 */     for (int i = 0; i < c.length; i++) {

/* 901 */       if (null == notConvertSet || !notConvertSet.contains(Character.valueOf(c[i])))
      {




/* 907 */         if (c[i] == ' ') {

/* 909 */           c[i] = '　';
        }
/* 911 */         else if (c[i] < '') {

/* 913 */           c[i] = (char)(c[i] + 65248);
        }
      }
    }
/* 917 */     return new String(c);
  }








  public static String toDBC(String input) {
/* 928 */     return toDBC(input, null);
  }









  public static String toDBC(String text, Set<Character> notConvertSet) {
/* 940 */     char[] c = text.toCharArray();
/* 941 */     for (int i = 0; i < c.length; i++) {

/* 943 */       if (null == notConvertSet || !notConvertSet.contains(Character.valueOf(c[i])))
      {




/* 949 */         if (c[i] == '　') {

/* 951 */           c[i] = ' ';
        }
/* 953 */         else if (c[i] > '＀' && c[i] < '｟') {

/* 955 */           c[i] = (char)(c[i] - 65248);
        }  }
    }
/* 958 */     String returnString = new String(c);

/* 960 */     return returnString;
  }








  public static String digitUppercase(double n) {
/* 971 */     String[] fraction = { "角", "分" };
/* 972 */     String[] digit = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
/* 973 */     String[][] unit = { { "元", "万", "亿" }, { "", "拾", "佰", "仟" } };

/* 975 */     String head = (n < 0.0D) ? "负" : "";
/* 976 */     n = Math.abs(n);

/* 978 */     String s = "";
/* 979 */     for (int i = 0; i < fraction.length; i++)
    {
/* 981 */       s = s + (digit[(int)(Math.floor(n * 10.0D * Math.pow(10.0D, i)) % 10.0D)] + fraction[i]).replaceAll("(零.)+", "");
    }
/* 983 */     if (s.length() < 1)
    {
/* 985 */       s = "整";
    }
/* 987 */     int integerPart = (int)Math.floor(n);

/* 989 */     for (int j = 0; j < (unit[0]).length && integerPart > 0; j++) {

/* 991 */       String p = "";
/* 992 */       for (int k = 0; k < (unit[1]).length && n > 0.0D; k++) {

/* 994 */         p = digit[integerPart % 10] + unit[1][k] + p;
/* 995 */         integerPart /= 10;
      }
/* 997 */       s = p.replaceAll("(零.)*零$", "").replaceAll("^$", "零") + unit[0][j] + s;
    }
/* 999 */     return head + s.replaceAll("(零.)*零元", "元").replaceFirst("(零.)+", "").replaceAll("(零.)+", "零").replaceAll("^整$", "零元整");
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\Convert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */