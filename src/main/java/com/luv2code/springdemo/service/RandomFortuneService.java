package com.luv2code.springdemo.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {"Message 1 from RANDOM Fortune Service!", "Message 2 from RANDOM Fortune Service!", "Message 3 from RANDOM Fortune Service!"};

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
