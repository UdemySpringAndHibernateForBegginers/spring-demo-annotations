package com.luv2code.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Message from DATABASE Fortune Service!";
    }
}
