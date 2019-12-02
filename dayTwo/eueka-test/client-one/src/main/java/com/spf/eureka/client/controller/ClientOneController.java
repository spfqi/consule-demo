package com.spf.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientOneController {
    @RequestMapping("client01")
    public String client01(){
        System.out.println( "=========client01--------" );
        return "client01";
    }
}
