package com.panning.springcloudconsumer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SpringCloudConsumerApplicationTests {

    @Test
    public void restTemplateGetTest() {
        RestTemplate restTemplate = new RestTemplate();
        String template = restTemplate.getForObject("http://localhost:9000/hello?name=neo", String.class);
        System.out.println(template);
    }
}
