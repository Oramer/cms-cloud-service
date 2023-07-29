package com.cms;

import com.cms.base_service.advice.CommonAdvice;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
// import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
// import org.springframework.jms.annotation.EnableJms;

// @EnableJms
@CommonAdvice
@SpringBootApplication
public class CxcBaseServiceApplication {
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jacksonObjectMapperCustomization() {
        /* 18 */
        return jacksonObjectMapperBuilder -> jacksonObjectMapperBuilder.timeZone(TimeZone.getDefault());
    }

    public static void main(String[] args) {
        /* 22 */
        SpringApplication.run(com.cms.CxcBaseServiceApplication.class, args);
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\CxcBaseServiceApplication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */