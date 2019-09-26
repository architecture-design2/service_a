package com.practice.multimodule.service_a.integration.b.local.client;

import com.practice.multimodule.service_a.integration.b.spi.ServiceBClient;
import com.practice.multimodule.service_b.service.ServiceBService;
import org.springframework.stereotype.Component;

@Component
public class ServiceBLocalClientImpl implements ServiceBClient {


    private final ServiceBService serviceBService;

    public ServiceBLocalClientImpl(ServiceBService serviceBService) {
        this.serviceBService = serviceBService;
    }


    @Override
    public String hello(String username) {
        return serviceBService.hello(username);
    }
}
