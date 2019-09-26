package com.practice.multimodule.service_a.serive.impl;

import com.practice.multimodule.service_a.serive.AService;
import com.practice.multimodule.service_a.integration.b.spi.ServiceBClient;
import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService {
    private final ServiceBClient serviceBClient;

    public AServiceImpl(ServiceBClient serviceBClient) {
        this.serviceBClient = serviceBClient;
    }

    @Override
    public String hello(String username) {
        return serviceBClient.hello(username);
    }
}
