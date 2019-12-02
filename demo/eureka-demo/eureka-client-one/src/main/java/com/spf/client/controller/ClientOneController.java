package com.spf.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientOneController {
    @RequestMapping("client01")
    public String client01(){
        System.out.print( "=====client01====" );
        return "client01";
    }
}
