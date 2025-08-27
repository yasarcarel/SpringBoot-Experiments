package com.yasarcarel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;

    //başlangıç
    public void initialBeanMethod(){ //bean başlamadan önce terminalde çalıştıran method
        log.info("bean başlamadan önce ben varım");
        System.out.println("bean başlamadan önce çalışacak method");
    }

    //bitiş
    public void destroyBeanMethod(){ //bean bittikten sonra terminalde çalıştıran method
        log.info("bean bittikten sonra ben varım");
        System.err.println("bean bittikten sonra çalışacak method");
    }
}
