package com.luv2code.springdemo.service;

import org.springframework.stereotype.Component;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your sad day!";
    }
}
