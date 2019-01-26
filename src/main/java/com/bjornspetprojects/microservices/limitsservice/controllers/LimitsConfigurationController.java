package com.bjornspetprojects.microservices.limitsservice.controllers;

import com.bjornspetprojects.microservices.limitsservice.beans.LimitConfiguration;
import com.bjornspetprojects.microservices.limitsservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private final Configuration configuration;

    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
}
