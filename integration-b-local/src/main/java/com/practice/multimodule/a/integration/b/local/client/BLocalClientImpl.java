package com.practice.multimodule.a.integration.b.local.client;

import com.practice.multimodule.a.integration.b.spi.BClient;
import com.practice.multimodule.b.api.BService;
import org.springframework.stereotype.Component;

@Component
public class BLocalClientImpl implements BClient {


    private final BService bService;

    public BLocalClientImpl(BService bService) {
        this.bService = bService;
    }


    @Override
    public String hello(String username) {
        return bService.hello(username);
    }
}
