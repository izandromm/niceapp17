package com.codeexample.demo.niceapp17.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy // activate lazy load for this component
// @Primary set as main component to be loaded from Autowired
// @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // creates the component as a singleton obj.
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)// scope prototype creates a new bean for each injection. prototype beans are lazy by default.

public class HikingCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Run to the hill.";
    }
}
