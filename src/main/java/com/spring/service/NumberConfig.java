package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(NumberProperties.class)
public class NumberConfig {

    @Autowired
    public NumberProperties numberProperties;

    @Bean
    public CheckNumberService checkNumberService() {
        numberProperties.setNumber(79);
        return new CheckNumberService(numberProperties.getNumber());
    }
}
