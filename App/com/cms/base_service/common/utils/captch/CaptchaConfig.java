 package com.cms.base_service.common.utils.captch;

 import com.google.code.kaptcha.impl.DefaultKaptcha;
 import com.google.code.kaptcha.util.Config;
 import java.util.Properties;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;








 @Configuration
 public class CaptchaConfig
 {
   @Bean(name = {"captchaProducer"})
   public DefaultKaptcha getKaptchaBean() {
/* 21 */     DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
/* 22 */     Properties properties = new Properties();

/* 24 */     properties.setProperty("kaptcha.border", "yes");

/* 26 */     properties.setProperty("kaptcha.textproducer.font.color", "black");

/* 28 */     properties.setProperty("kaptcha.image.width", "160");

/* 30 */     properties.setProperty("kaptcha.image.height", "60");

/* 32 */     properties.setProperty("kaptcha.textproducer.font.size", "38");

/* 34 */     properties.setProperty("kaptcha.session.key", "kaptchaCode");

/* 36 */     properties.setProperty("kaptcha.textproducer.char.length", "4");

/* 38 */     properties.setProperty("kaptcha.textproducer.font.names", "Arial,Courier");

/* 40 */     properties.setProperty("kaptcha.obscurificator.impl", "com.google.code.kaptcha.impl.ShadowGimpy");
/* 41 */     Config config = new Config(properties);
/* 42 */     defaultKaptcha.setConfig(config);
/* 43 */     return defaultKaptcha;
   }

   @Bean(name = {"captchaProducerMath"})
   public DefaultKaptcha getKaptchaBeanMath() {
/* 48 */     DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
/* 49 */     Properties properties = new Properties();

/* 51 */     properties.setProperty("kaptcha.border", "yes");

/* 53 */     properties.setProperty("kaptcha.border.color", "105,179,90");

/* 55 */     properties.setProperty("kaptcha.textproducer.font.color", "blue");

/* 57 */     properties.setProperty("kaptcha.image.width", "160");

/* 59 */     properties.setProperty("kaptcha.image.height", "60");

/* 61 */     properties.setProperty("kaptcha.textproducer.font.size", "35");

/* 63 */     properties.setProperty("kaptcha.session.key", "kaptchaCodeMath");

/* 65 */     properties.setProperty("kaptcha.textproducer.impl", "com.cms.base_service.framework.config.KaptchaTextCreator");

/* 67 */     properties.setProperty("kaptcha.textproducer.char.space", "3");

/* 69 */     properties.setProperty("kaptcha.textproducer.char.length", "6");

/* 71 */     properties.setProperty("kaptcha.textproducer.font.names", "Arial,Courier");

/* 73 */     properties.setProperty("kaptcha.noise.color", "white");

/* 75 */     properties.setProperty("kaptcha.noise.impl", "com.google.code.kaptcha.impl.NoNoise");

/* 77 */     properties.setProperty("kaptcha.obscurificator.impl", "com.google.code.kaptcha.impl.ShadowGimpy");
/* 78 */     Config config = new Config(properties);
/* 79 */     defaultKaptcha.setConfig(config);
/* 80 */     return defaultKaptcha;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\captch\CaptchaConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */