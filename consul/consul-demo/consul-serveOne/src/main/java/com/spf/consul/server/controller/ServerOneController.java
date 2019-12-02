package com.spf.consul.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ServerOneController {

    @Value("${test}")
     private String mytest;

    @RequestMapping("test01")
    public String test01(){
        return mytest;
    }

}
