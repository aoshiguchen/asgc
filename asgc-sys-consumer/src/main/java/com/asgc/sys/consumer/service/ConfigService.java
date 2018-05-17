package com.asgc.sys.consumer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

    @Value("${name}")
    private String name;

    @Value("${addr}")
    private String addr;

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }
}
