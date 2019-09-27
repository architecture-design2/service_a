package com.practice.multimodule.a.api.impl;

import com.practice.multimodule.a.api.AApi;
import com.practice.multimodule.a.service.AService;
import org.springframework.stereotype.Component;

@Component
public class AApiImpl implements AApi {

    private final AService aService;


    public AApiImpl(AService aService) {
        this.aService = aService;
    }

    @Override
    public String hello(String username) {
        return aService.hello(username);
    }

}
