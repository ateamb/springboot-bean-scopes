package com.javabanters.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In Constructor "+ getClass().getSimpleName());
    }
    @Override
    public String getWorkout() {
        return "Practice backhand for 36 mins";
    }
}
