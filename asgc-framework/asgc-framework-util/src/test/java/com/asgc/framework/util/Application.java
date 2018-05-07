package com.asgc.framework.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Controller
public class Application {

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String,Object> hello(){
        return new HashMap<String,Object>(){
            {
                this.put("a","1");
                this.put("b","2");
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
