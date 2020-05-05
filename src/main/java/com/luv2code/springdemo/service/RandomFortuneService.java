package com.luv2code.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Message from RANDOM Fortune Service!";
    }
}
