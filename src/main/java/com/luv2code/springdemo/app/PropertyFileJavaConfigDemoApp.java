package com.luv2code.springdemo.app;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.SwimCoach;
import com.luv2code.springdemo.conf.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyFileJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //retrieve bean from spring container
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        //call a method on the bean
        System.out.println();
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());

        //close the context
        context.close();
    }
}
