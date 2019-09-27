package com.practice.multimodule.a.integration.b.local.client;

import com.practice.multimodule.a.integration.b.spi.BSpi;
import com.practice.multimodule.b.api.BApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BLocalClient implements BSpi {

    @Autowired
    private BApi bApi;

    @Override
    public String hello(String username) {
        return bApi.hello(username);
    }
}
