package com.luv2code.springdemo;

import com.luv2code.springdemo.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {


    private FortuneService service;

    @Autowired
    public BaseballCoach(@Qualifier("happyFortuneService") FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Please spand 30 minutes on batting practise.";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}
