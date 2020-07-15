package com.panning.springcloudconsumer.hystrix;

import com.panning.springcloudconsumer.service.IHelloRemoteService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class HelloRemoteHystrix implements IHelloRemoteService {

    @Override
    public String hello(@PathVariable("name") String name) {
        return "hello " + name + ", this messge send failed ";
    }
}