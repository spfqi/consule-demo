package com.spf.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="spf",url="http://127.0.0.1:8083")
public interface ClientOneApi {
    @RequestMapping("client01")
    public String client01();
}
