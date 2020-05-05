package com.luv2code.springdemo;

import com.luv2code.springdemo.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    // == fields ==
    private FortuneService service;

    // == constructor ==
    public CricketCoach() {
        System.out.println("TennisCoach -> inside default constructor");
    }

    // == public methods ==

    @Autowired
    @Qualifier("randomFortuneService")
    public void myExampleMethod(FortuneService service) {
        this.service = service;
        System.out.println("TennisCoach -> inside myExampleMethod");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}
