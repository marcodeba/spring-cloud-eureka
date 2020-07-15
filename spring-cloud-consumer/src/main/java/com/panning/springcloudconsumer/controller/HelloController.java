package com.panning.springcloudconsumer.controller;

import com.panning.springcloudconsumer.service.IHelloRemoteService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private IHelloRemoteService service;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return service.hello(name);
    }
}
