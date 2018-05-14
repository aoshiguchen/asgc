package com.asgc.sys.provider.test.service;
import com.alibaba.dubbo.config.annotation.Service;
import com.asgc.sys.facade.test.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "[dubbo provider] say : " + name + " hello !" ;
    }
}
