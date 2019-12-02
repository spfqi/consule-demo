package client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@FeignClient(name = "SPF1",url = "http://127.0.0.1:1003")
public interface ClientOneApi {
    @RequestMapping("client01")
    public String client01();
}
