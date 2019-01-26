package com.bjornspetprojects.microservices.limitsservice.controllers;

import com.bjornspetprojects.microservices.limitsservice.beans.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){
        return new LimitConfiguration(99,9999);
    }
}
