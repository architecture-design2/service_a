package com.practice.multimodule.a.service.impl;

import com.practice.multimodule.a.service.AService;
import com.practice.multimodule.a.integration.b.spi.BSpi;
import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService {
    private final BSpi bSpi;

    public AServiceImpl(BSpi bSpi) {
        this.bSpi = bSpi;
    }

    @Override
    public String hello(String username) {
        return bSpi.hello(username);
    }
}
