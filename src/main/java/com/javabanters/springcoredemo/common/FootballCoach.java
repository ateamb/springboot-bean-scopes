package com.javabanters.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//marks the class as a spring bean
@Component
@Lazy
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println("In Constructor "+ getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice running for 20 mins";
    }
}
