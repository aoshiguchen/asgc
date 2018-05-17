package com.asgc.sys.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.asgc.sys.facade.test.service.DemoService;
import com.asgc.sys.facade.test.service.DemoService2;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Reference
    private DemoService demoService;

    @Reference
    private DemoService2 demoService2;

    public DemoService getDemoService() {
        return demoService;
    }

    public DemoService2 getDemoService2() {
        return demoService2;
    }
}
