package com.test.JsonConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${message}")
    private String msg;



    @RequestMapping("/msg")
    public String getMessage(){
        return msg;
    }

}
