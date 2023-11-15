package com.codeexample.demo.niceapp17.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy // activate lazy load for this component
// @Primary set as main component to be loaded from Autowired
public class HikingCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Run to the hill.";
    }
}
