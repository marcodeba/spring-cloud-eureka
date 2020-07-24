package com.panning.springcloudconsumer.configuration;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class MyPing implements IPing {
    @Override
    public boolean isAlive(Server server) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString("http://spring-cloud-eureka-producer/health");

        URI uri = builder.build().toUri();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity(uri, String.class);

        return HttpStatus.OK.equals(entity.getStatusCode());
    }
}
