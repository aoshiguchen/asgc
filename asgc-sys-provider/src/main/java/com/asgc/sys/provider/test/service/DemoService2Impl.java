package com.asgc.sys.provider.test.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.asgc.sys.facade.test.service.DemoService2;

@Service
public class DemoService2Impl implements DemoService2 {
    @Override
    public String bye(String name) {
        return "[dubbo provider] say : " + name + " bye !" ;
    }

}
