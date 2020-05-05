package com.luv2code.springdemo.app;

import com.luv2code.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach firstCoach = context.getBean("tennisCoach", Coach.class);
        Coach secondCoach = context.getBean("baseballCoach", Coach.class);
        Coach thirdCoach = context.getBean("cricketCoach", Coach.class);
        Coach fourthCoach = context.getBean("trackCoach", Coach.class);

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

        //close the context
        context.close();
    }
}
