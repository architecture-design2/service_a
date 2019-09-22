package com.practice.multimodule.service_a.integration.local;

import com.practice.multimodule.service_a.integration.spi.ServiceBClient;
import com.practice.multimodule.service_b.endpoint.ServiceBController;
import org.springframework.stereotype.Component;

@Component
public class ServiceBClientImpl implements ServiceBClient {


    private final ServiceBController serviceBController;

    public ServiceBClientImpl(ServiceBController serviceBController) {
        this.serviceBController = serviceBController;
    }

    @Override
    public String hello(String username) {
        return serviceBController.hello(username);
    }
}
