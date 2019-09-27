package com.practice.multimodule.a.integration.b.local.client;

import com.practice.multimodule.a.integration.b.spi.BSpi;
import com.practice.multimodule.b.api.BService;
import org.springframework.stereotype.Component;

@Component
public class BLocalSpiImpl implements BSpi {


    private final BService bService;

    public BLocalSpiImpl(BService bService) {
        this.bService = bService;
    }


    @Override
    public String hello(String username) {
        return bService.hello(username);
    }
}
