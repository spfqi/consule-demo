package com.spf.client.controller;

import com.spf.client.api.ClientOneApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTwo {
    @Autowired
    private ClientOneApi ClientOneApi;

    @RequestMapping("client02")
    public String client02(){
        String client01 = ClientOneApi.client01();
        System.out.print( "------client02-------" );
        return client01;
    }
}
