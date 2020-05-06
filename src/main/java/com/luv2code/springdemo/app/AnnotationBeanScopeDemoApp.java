package com.luv2code.springdemo.app;

import com.luv2code.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach firstCoach = context.getBean("tennisCoach", Coach.class);
        Coach secondCoach = context.getBean("tennisCoach", Coach.class);

        //check if they are the same
        boolean result = firstCoach == secondCoach;
        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location for the firstCoach: " + firstCoach);
        System.out.println("Memory location for the secondCoach: " + secondCoach);

        //call a method on the bean
//        System.out.println();
//        System.out.println(firstCoach.getDailyWorkout());
//        System.out.println(firstCoach.getDailyFortune());
//        System.out.println();
//        System.out.println(secondCoach.getDailyWorkout());
//        System.out.println(secondCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
