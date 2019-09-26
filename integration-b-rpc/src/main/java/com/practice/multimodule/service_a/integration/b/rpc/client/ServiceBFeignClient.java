package com.practice.multimodule.service_a.integration.b.rpc.client;

import com.practice.multimodule.service_a.integration.spi.b.ServiceBClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-b")
public interface ServiceBFeignClient extends ServiceBClient {

    @RequestMapping("/service_b/hello")
    String hello(@RequestParam("username") String username);

}
