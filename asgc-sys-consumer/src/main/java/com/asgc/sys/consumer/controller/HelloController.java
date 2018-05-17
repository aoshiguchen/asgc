package com.asgc.sys.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.asgc.sys.consumer.service.HelloService;
import com.asgc.sys.facade.test.service.DemoService;
import com.asgc.sys.facade.test.service.DemoService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Reference
    private DemoService demoService;

    @Reference
    private DemoService2 demoService2;

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return "consumer hello";
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

    @RequestMapping("/sayHello2")
    @ResponseBody
    public String sayHello2() {
        return helloService.getDemoService().sayHello("consumer");
    }

    @RequestMapping("/sayBye2")
    @ResponseBody
    public String sayBye2(){
        return helloService.getDemoService2().bye("consumer");
    }

}
