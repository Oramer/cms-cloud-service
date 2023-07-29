 package com.cms.base_service.common.redis;
 
 import com.cms.base_service.common.redis.FastJson2JsonRedisSerializer;
 import com.fasterxml.jackson.annotation.JsonAutoDetect;
 import com.fasterxml.jackson.annotation.PropertyAccessor;
 import com.fasterxml.jackson.databind.ObjectMapper;
 import org.springframework.cache.annotation.CachingConfigurerSupport;
 import org.springframework.cache.annotation.EnableCaching;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.data.redis.connection.RedisConnectionFactory;
 import org.springframework.data.redis.core.RedisTemplate;
 import org.springframework.data.redis.serializer.RedisSerializer;
 import org.springframework.data.redis.serializer.StringRedisSerializer;
 
 @Configuration
 @EnableCaching
 public class RedisConfig
   extends CachingConfigurerSupport {
   @Bean
   public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
/* 22 */     RedisTemplate<Object, Object> template = new RedisTemplate();
/* 23 */     template.setConnectionFactory(connectionFactory);
     
/* 25 */     FastJson2JsonRedisSerializer serializer = new FastJson2JsonRedisSerializer(Object.class);
     
/* 27 */     ObjectMapper mapper = new ObjectMapper();
/* 28 */     mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
/* 29 */     serializer.setObjectMapper(mapper);
 
     
/* 32 */     template.setKeySerializer((RedisSerializer)new StringRedisSerializer());
/* 33 */     template.setValueSerializer((RedisSerializer)serializer);
 
     
/* 36 */     template.setHashKeySerializer((RedisSerializer)new StringRedisSerializer());
/* 37 */     template.setHashValueSerializer((RedisSerializer)serializer);
     
/* 39 */     template.afterPropertiesSet();
/* 40 */     return template;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\redis\RedisConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */