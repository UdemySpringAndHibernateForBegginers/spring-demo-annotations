package com.luv2code.springdemo.conf;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.SwimCoach;
import com.luv2code.springdemo.service.FortuneService;
import com.luv2code.springdemo.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
