package com.javabanters.springcoredemo.rest;

import com.javabanters.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    public DemoController(@Qualifier("cricketCoach") Coach coach,
                          @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("In Constructor "+ getClass().getSimpleName());
        this.myCoach = coach;
        this.anotherCoach = anotherCoach;
    }

//    @Autowired
//    public void setCoach(@Qualifier("cricketCoach") Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getWorkout();
    }

    @GetMapping("/check")
    public String compareBeans() {
        return "The objects are :: "+ (this.myCoach == this.anotherCoach);
    }
}
