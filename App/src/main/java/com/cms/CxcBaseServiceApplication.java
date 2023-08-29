package com.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import com.cms.base_service.advice.CommonAdvice;

import java.util.TimeZone;

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
        SpringApplication.run(CxcBaseServiceApplication.class, args);
    }
}