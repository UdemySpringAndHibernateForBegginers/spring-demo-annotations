package com.luv2code.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Message from REST Fortune Service!";
    }
}
