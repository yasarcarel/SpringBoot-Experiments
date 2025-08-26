package com.yasarcarel.bean;

import com.yasarcarel.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDTO() {

        return BeanDto
                .builder()
                    .id(0L)
                    .beanName("fasulye memed")
                    .beanData("26")
                .build();
    }
}
