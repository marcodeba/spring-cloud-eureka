package com.panning.springcloudconsumer;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.panning.springcloudconsumer.configuration.MyPing;
import com.panning.springcloudconsumer.configuration.MyRuler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RibbonClient(name = "spring-cloud-eureka-producer")// 指定目标应用名称
public class SpringCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerApplication.class, args);
    }

    @Bean
    public IRule myRule() {
        return new MyRuler();
    }

//    @Bean
//    public IPing myPing() {
//        return new MyPing();
//    }
}
