package com.asgc.sys.consumer.controller;

import com.asgc.sys.consumer.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/config")
public class ConfigController {

    @Value("${name}")
    private String name;

    @Value("${addr}")
    private String addr;

    @Autowired
    private ConfigService configService;

    @RequestMapping("/name")
    @ResponseBody
    public String name(){
        return name;
    }

    @RequestMapping("/addr")
    @ResponseBody
    public String addr(){
        return addr;
    }

    @RequestMapping("/name2")
    @ResponseBody
    public String name2(){
        return configService.getName();
    }

    @RequestMapping("/addr2")
    @ResponseBody
    public String addr2(){
        return configService.getAddr();
    }

}
