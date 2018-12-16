package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name + " (from Spring Boot)";
    }
}
