package com.practice.multimodule.a.integration.b.rpc.client;

import com.practice.multimodule.a.integration.b.spi.BClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-b")
public interface BFeignClient extends BClient {

    @RequestMapping("/service_b/hello")
    String hello(@RequestParam("username") String username);

}
