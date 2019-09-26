package com.practice.multimodule.service_a.integration.b.local.client;

import com.practice.multimodule.service_a.integration.spi.b.ServiceBClient;
import com.practice.multimodule.service_b.endpoint.ServiceBController;
import org.springframework.stereotype.Component;

@Component
public class ServiceBLocalClientImpl implements ServiceBClient {

    private final ServiceBController serviceBController;

    public ServiceBLocalClientImpl(ServiceBController serviceBController) {
        this.serviceBController = serviceBController;
    }

    @Override
    public String hello(String username) {
        return serviceBController.hello(username);
    }
}
