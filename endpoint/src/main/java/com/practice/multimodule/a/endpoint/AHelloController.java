package com.practice.multimodule.a.endpoint;

import com.practice.multimodule.a.service.AService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AHelloController {

    private final AService aService;

    public AHelloController(AService aService) {
        this.aService = aService;
    }

    @RequestMapping("/hello/{username}")
    public String hello(@PathVariable("username") String username) {
        return aService.hello(username);
    }

}
