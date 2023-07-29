 package com.cms.base_service.common.utils.captch;

 import com.google.code.kaptcha.text.impl.DefaultTextCreator;
 import java.util.Random;





 public class KaptchaTextCreator
   extends DefaultTextCreator
 {
/* 13 */   private static final String[] CNUMBERS = "0,1,2,3,4,5,6,7,8,9,10".split(",");


   public String getText() {
/* 17 */     Integer result = Integer.valueOf(0);
/* 18 */     Random random = new Random();
/* 19 */     int x = random.nextInt(10);
/* 20 */     int y = random.nextInt(10);
/* 21 */     StringBuilder suChinese = new StringBuilder();
/* 22 */     int randomoperands = (int)Math.round(Math.random() * 2.0D);
/* 23 */     if (randomoperands == 0) {
/* 24 */       result = Integer.valueOf(x * y);
/* 25 */       suChinese.append(CNUMBERS[x]);
/* 26 */       suChinese.append("*");
/* 27 */       suChinese.append(CNUMBERS[y]);
/* 28 */     } else if (randomoperands == 1) {
/* 29 */       if (x != 0 && y % x == 0) {
/* 30 */         result = Integer.valueOf(y / x);
/* 31 */         suChinese.append(CNUMBERS[y]);
/* 32 */         suChinese.append("/");
/* 33 */         suChinese.append(CNUMBERS[x]);
       } else {
/* 35 */         result = Integer.valueOf(x + y);
/* 36 */         suChinese.append(CNUMBERS[x]);
/* 37 */         suChinese.append("+");
/* 38 */         suChinese.append(CNUMBERS[y]);
       }
/* 40 */     } else if (randomoperands == 2) {
/* 41 */       if (x >= y) {
/* 42 */         result = Integer.valueOf(x - y);
/* 43 */         suChinese.append(CNUMBERS[x]);
/* 44 */         suChinese.append("-");
/* 45 */         suChinese.append(CNUMBERS[y]);
       } else {
/* 47 */         result = Integer.valueOf(y - x);
/* 48 */         suChinese.append(CNUMBERS[y]);
/* 49 */         suChinese.append("-");
/* 50 */         suChinese.append(CNUMBERS[x]);
       }
     } else {
/* 53 */       result = Integer.valueOf(x + y);
/* 54 */       suChinese.append(CNUMBERS[x]);
/* 55 */       suChinese.append("+");
/* 56 */       suChinese.append(CNUMBERS[y]);
     }
/* 58 */     suChinese.append("=?@" + result);
/* 59 */     return suChinese.toString();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\captch\KaptchaTextCreator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */