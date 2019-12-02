package com.spf.consul.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@SpringBootApplication
@RestController
@EnableScheduling
public class ConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class,args);
    }

   @RequestMapping("testHelth")
       public String testHelth(){
        System.out.print(" =======helath======" );
        return "ok";
       }
}
