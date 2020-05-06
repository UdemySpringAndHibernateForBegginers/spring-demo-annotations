package com.luv2code.springdemo.app;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.conf.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //retrieve bean from spring container
        Coach firstCoach = context.getBean("tennisCoach", Coach.class);
        Coach secondCoach = context.getBean("baseballCoach", Coach.class);
        Coach thirdCoach = context.getBean("cricketCoach", Coach.class);
        Coach fourthCoach = context.getBean("trackCoach", Coach.class);
        Coach fifthCoach = context.getBean("swimCoach", Coach.class);

        //call a method on the bean
        System.out.println();
        System.out.println(secondCoach.getDailyWorkout());
        System.out.println(secondCoach.getDailyFortune());
        System.out.println();
        System.out.println(firstCoach.getDailyWorkout());
        System.out.println(firstCoach.getDailyFortune());
        System.out.println();
        System.out.println(thirdCoach.getDailyWorkout());
        System.out.println(thirdCoach.getDailyFortune());
        System.out.println();
        System.out.println(fourthCoach.getDailyWorkout());
        System.out.println(fourthCoach.getDailyFortune());
        System.out.println();
        System.out.println(fifthCoach.getDailyWorkout());
        System.out.println(fifthCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
