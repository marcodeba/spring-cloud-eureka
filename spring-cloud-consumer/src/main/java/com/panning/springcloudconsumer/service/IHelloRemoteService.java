package com.panning.springcloudconsumer.service;

import com.panning.springcloudconsumer.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface IHelloRemoteService {
    @RequestMapping(value = "/hello/{name}")
    String hello(@PathVariable(value = "name") String name);
}