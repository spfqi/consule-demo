package com.spf.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientOneApplication.class,args);
    }

}
