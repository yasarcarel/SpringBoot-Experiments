package com.yasarcarel.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import jakarta.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {

    /*@Autowired
    Logger LOG;*/

    //PARAMETRESİZ CONSTRUCTOR
    //because "this.LOG" is null
    /*public PostConstructTutorials() {
        LOG.info("change the world my final message");
    }*/

    //bean henüz başlamadığından null alıyoruz ve burada bağımlılığı enjecte edemiyoruz.
    //Postconstruct bir bean nesnesi oluşuturlduğunda hemen oluşur.


    /*@PostConstruct
    public void init(){
        LOG.info("change the world my final message");
    };*/

   /* public static void main(String[] args) {
        PostConstructTutorials beanController = new PostConstructTutorials();
        System.out.println(beanController);
    }
*/
}
