package com.panning.springcloudconsumer.controller;

import com.panning.springcloudconsumer.IHelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    IHelloRemote iHelloRemote;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return iHelloRemote.hello(name);
    }
}
