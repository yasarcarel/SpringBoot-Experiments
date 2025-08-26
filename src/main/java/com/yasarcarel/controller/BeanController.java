package com.yasarcarel.controller;

import com.yasarcarel.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired
    BeanConfig beanConfig;

    // http://localhost:8080/bean/beanDTO
    @GetMapping("/bean/beanDTO") // url yapısı burda belirtilir
    @ResponseBody //html olmadan direkt ekranda göster
    public String getBeanDTO(){
        return beanConfig.beanDTO()+"";
    }

}
