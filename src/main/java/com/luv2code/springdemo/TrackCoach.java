package com.luv2code.springdemo;

import com.luv2code.springdemo.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    // == fields ==
    @Autowired
    @Qualifier("restFortuneService")
    private FortuneService service;

    // == constructor ==
    public TrackCoach() {
    }

    // == public methods ==
    @Override
    public String getDailyWorkout() {
        return "Please run a hard 5k.";
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }
}
