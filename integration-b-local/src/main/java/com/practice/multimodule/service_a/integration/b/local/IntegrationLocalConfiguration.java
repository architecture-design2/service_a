package com.practice.multimodule.service_a.integration.b.local;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.practice.multimodule.service_b")
public class IntegrationLocalConfiguration {


}
