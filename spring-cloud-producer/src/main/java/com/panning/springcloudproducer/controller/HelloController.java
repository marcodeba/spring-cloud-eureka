package com.panning.springcloudproducer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "hello " + name + "，this is first message " + port;
    }
}