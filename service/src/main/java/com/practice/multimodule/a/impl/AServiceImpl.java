package com.practice.multimodule.a.impl;

import com.practice.multimodule.a.api.AService;
import com.practice.multimodule.a.integration.b.spi.BClient;
import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService {
    private final BClient BClient;

    public AServiceImpl(BClient BClient) {
        this.BClient = BClient;
    }

    @Override
    public String hello(String username) {
        return BClient.hello(username);
    }
}
