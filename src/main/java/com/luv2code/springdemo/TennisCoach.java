package com.luv2code.springdemo;

import com.luv2code.springdemo.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    // == fields ==
    private FortuneService service;

    // == constructor ==
    public TennisCoach() {
        System.out.println("TennisCoach -> inside default constructor");
    }

    // == setters ==
    @Autowired
    @Qualifier("databaseFortuneService")
    public void setService(FortuneService service) {
        this.service = service;
        System.out.println("TennisCoach -> inside setter named setService");
    }

    // == public methods
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}
