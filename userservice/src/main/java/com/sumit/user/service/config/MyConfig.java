package com.sumit.user.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {

    @Bean
    @LoadBalanced   //distribute load in the way that we will use the service name insted of ip or port
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

}
