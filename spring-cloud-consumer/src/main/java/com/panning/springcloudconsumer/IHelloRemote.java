package com.panning.springcloudconsumer;

import com.panning.springcloudconsumer.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface IHelloRemote {
    @RequestMapping(value = "/hello/{name}")
    String hello(@PathVariable(value = "name") String name);
}