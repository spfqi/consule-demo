package client.controller;

import client.api.ClientOneApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTwoController {
    @Autowired
    private ClientOneApi clientOneApi;

    @RequestMapping("client02")
    public String client02(){
        System.out.println( "=========client02--------" );
        String client01 = clientOneApi.client01();
        return client01;
    }
}
