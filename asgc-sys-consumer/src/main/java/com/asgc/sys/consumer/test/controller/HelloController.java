package com.asgc.sys.consumer.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.asgc.sys.facade.test.service.DemoService;
import com.asgc.sys.facade.test.service.DemoService2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Reference
    private DemoService demoService;

    @Reference
    private DemoService2 demoService2;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return "hello";
    }

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return demoService.sayHello("consumer");
    }

    @RequestMapping("/sayBye")
    @ResponseBody
    public String sayBye(){
        return demoService2.bye("consumer");
    }
}
