package com.yasarcarel.bean;

import com.yasarcarel.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    @Scope("singleton")   //projeyle başlar projeyle biter
//  @Scope("request")       istek boyunca çalışır
//  @Scope("session")       bir oturum boyunca çalışır
    public BeanDto beanDTO() {

        return BeanDto
                .builder()
                    .id(0L)
                    .beanName("fasulye memed")
                    .beanData("26")
                .build();
    }
}
