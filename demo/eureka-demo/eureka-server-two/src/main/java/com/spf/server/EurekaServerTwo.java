package com.spf.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerTwo {

    public static void main(String[] args) {

        SpringApplication.run( EurekaServerTwo.class,args);

    }

}
