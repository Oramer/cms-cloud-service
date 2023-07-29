 package com.cms.base_service.common.utils;

 import java.security.MessageDigest;
 import java.security.NoSuchAlgorithmException;
 import org.apache.commons.codec.binary.Hex;



 public class MD5Util
 {
   public static String MD5(String input) {
/* 12 */     MessageDigest md5 = null;
     try {
/* 14 */       md5 = MessageDigest.getInstance("MD5");
/* 15 */     } catch (NoSuchAlgorithmException e) {
/* 16 */       return "check jdk";
/* 17 */     } catch (Exception e) {
/* 18 */       e.printStackTrace();
/* 19 */       return "";
     }
/* 21 */     char[] charArray = input.toCharArray();
/* 22 */     byte[] byteArray = new byte[charArray.length];

/* 24 */     for (int i = 0; i < charArray.length; i++)
/* 25 */       byteArray[i] = (byte)charArray[i]; 
/* 26 */     byte[] md5Bytes = md5.digest(byteArray);
/* 27 */     StringBuffer hexValue = new StringBuffer();
/* 28 */     for (int j = 0; j < md5Bytes.length; j++) {
/* 29 */       int val = md5Bytes[j] & 0xFF;
/* 30 */       if (val < 16)
/* 31 */         hexValue.append("0"); 
/* 32 */       hexValue.append(Integer.toHexString(val));
     }
/* 34 */     return hexValue.toString();
   }


   public static String generate(String password, String salt) {
/* 39 */     StringBuilder sb = new StringBuilder(salt);
/* 40 */     int len = sb.length();
/* 41 */     if (len < 16) {
/* 42 */       for (int j = 0; j < 16 - len; j++) {
/* 43 */         sb.append("0");
       }
     }
/* 46 */     salt = sb.toString();
/* 47 */     password = md5Hex(password + salt);
/* 48 */     char[] cs = new char[48];
/* 49 */     for (int i = 0; i < 48; i += 3) {
/* 50 */       cs[i] = password.charAt(i / 3 * 2);
/* 51 */       char c = salt.charAt(i / 3);
/* 52 */       cs[i + 1] = c;
/* 53 */       cs[i + 2] = password.charAt(i / 3 * 2 + 1);
     }
/* 55 */     return new String(cs);
   }

   public static boolean verify(String password, String md5) {
/* 59 */     char[] cs1 = new char[32];
/* 60 */     char[] cs2 = new char[16];
/* 61 */     for (int i = 0; i < 48; i += 3) {
/* 62 */       cs1[i / 3 * 2] = md5.charAt(i);
/* 63 */       cs1[i / 3 * 2 + 1] = md5.charAt(i + 2);
/* 64 */       cs2[i / 3] = md5.charAt(i + 1);
     }
/* 66 */     String salt = new String(cs2);
/* 67 */     return md5Hex(password + salt).equals(new String(cs1));
   }


   private static String md5Hex(String src) {
     try {
/* 73 */       MessageDigest md5 = MessageDigest.getInstance("MD5");
/* 74 */       byte[] bs = md5.digest(src.getBytes());
/* 75 */       return new String((new Hex()).encode(bs));
/* 76 */     } catch (Exception e) {
/* 77 */       return null;
     }
   }


   public static void main(String[] args) {
/* 83 */     String admin = generate("111111", "pmj");
/* 84 */     System.out.println(admin);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\MD5Util.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */