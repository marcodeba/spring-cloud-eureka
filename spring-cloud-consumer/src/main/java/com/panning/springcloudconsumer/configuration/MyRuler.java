package com.panning.springcloudconsumer.configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

public class MyRuler {
    @Bean
    public IRule rule() {
        return new RandomRule();
    }
}
