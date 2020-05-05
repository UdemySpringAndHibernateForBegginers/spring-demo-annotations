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

        //call a method on the bean
        System.out.println(secondCoach.getDailyWorkout());
        System.out.println(firstCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
