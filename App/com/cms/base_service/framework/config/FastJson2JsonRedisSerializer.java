 package com.cms.base_service.framework.config;
 
 import com.alibaba.fastjson2.JSON;
 import com.alibaba.fastjson2.JSONReader;
 import com.alibaba.fastjson2.JSONWriter;
 import java.nio.charset.Charset;
 import org.springframework.data.redis.serializer.RedisSerializer;
 import org.springframework.data.redis.serializer.SerializationException;
 
 
 
 
 
 public class FastJson2JsonRedisSerializer<T>
   implements RedisSerializer<T>
 {
/* 17 */   public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
   
   private Class<T> clazz;
 
   
   public FastJson2JsonRedisSerializer(Class<T> clazz) {
/* 23 */     this.clazz = clazz;
   }
 
   
   public byte[] serialize(T t) throws SerializationException {
/* 28 */     if (t == null) {
/* 29 */       return new byte[0];
     }
/* 31 */     return JSON.toJSONString(t, new JSONWriter.Feature[] { JSONWriter.Feature.WriteClassName }).getBytes(DEFAULT_CHARSET);
   }
 
   
   public T deserialize(byte[] bytes) throws SerializationException {
/* 36 */     if (bytes == null || bytes.length <= 0) {
/* 37 */       return null;
     }
/* 39 */     String str = new String(bytes, DEFAULT_CHARSET);
     
/* 41 */     return (T)JSON.parseObject(str, this.clazz, new JSONReader.Feature[] { JSONReader.Feature.SupportAutoType });
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\config\FastJson2JsonRedisSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */