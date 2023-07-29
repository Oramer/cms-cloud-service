 package com.cms.base_service.common.redis;

 import com.alibaba.fastjson.JSON;
 import com.alibaba.fastjson.parser.ParserConfig;
 import com.alibaba.fastjson.serializer.SerializerFeature;
 import com.fasterxml.jackson.databind.JavaType;
 import com.fasterxml.jackson.databind.ObjectMapper;
 import com.fasterxml.jackson.databind.type.TypeFactory;
 import java.nio.charset.Charset;
 import org.springframework.data.redis.serializer.RedisSerializer;
 import org.springframework.data.redis.serializer.SerializationException;
 import org.springframework.util.Assert;



 public class FastJson2JsonRedisSerializer<T>
   implements RedisSerializer<T>
 {
/* 19 */   private ObjectMapper objectMapper = new ObjectMapper();

/* 21 */   public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

   private Class<T> clazz;

   static {
/* 26 */     ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
   }


   public FastJson2JsonRedisSerializer(Class<T> clazz) {
/* 31 */     this.clazz = clazz;
   }


   public byte[] serialize(T t) throws SerializationException {
/* 36 */     if (t == null) {
/* 37 */       return new byte[0];
     }
/* 39 */     return JSON.toJSONString(t, new SerializerFeature[] { SerializerFeature.WriteClassName }).getBytes(DEFAULT_CHARSET);
   }


   public T deserialize(byte[] bytes) throws SerializationException {
/* 44 */     if (bytes == null || bytes.length <= 0) {
/* 45 */       return null;
     }
/* 47 */     String str = new String(bytes, DEFAULT_CHARSET);

/* 49 */     return (T)JSON.parseObject(str, this.clazz);
   }

   public void setObjectMapper(ObjectMapper objectMapper) {
/* 53 */     Assert.notNull(objectMapper, "'objectMapper' must not be null");
/* 54 */     this.objectMapper = objectMapper;
   }

   protected JavaType getJavaType(Class<?> clazz) {
/* 58 */     return TypeFactory.defaultInstance().constructType(clazz);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\redis\FastJson2JsonRedisSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */