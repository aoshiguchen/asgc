package com.asgc.framework.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Application {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
