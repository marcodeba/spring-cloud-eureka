package com.panning.springcloudconsumer.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;

import java.util.List;

//public class MyRuler {
//    @Bean
//    public IRule myRule() {
//        return new RandomRule();
//    }
//}

public class MyRuler extends AbstractLoadBalancerRule {

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        ILoadBalancer loadBalancer = getLoadBalancer();
        List<Server> reachableServers = loadBalancer.getReachableServers();

        // 永远选择最后一台可达服务器
        return reachableServers.isEmpty() ? null : (reachableServers.get(reachableServers.size() - 1));
    }
}