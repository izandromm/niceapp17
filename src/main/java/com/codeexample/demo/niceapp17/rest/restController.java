package com.codeexample.demo.niceapp17.rest;

import com.codeexample.demo.niceapp17.common.Coach;
import com.codeexample.demo.niceapp17.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    // sem auto
    private Coach noautoCoach = new CricketCoach();


    // constructor injection
    private Coach myCoach;
    @Autowired
    public restController(@Qualifier("cricketCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    //setter injection
    private Coach setterInjCoach;
    // qualifier specifies which component will be loaded by spring.
    // qualifier`s specific component has greater priority over primary qualifier
    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach theCoach){
        setterInjCoach = theCoach;
    }


    // inject properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    // expose "/" that return "Hello world"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }


    // expose a new endpoint for "workout"
    /*
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run a hard 5k!";
    }*/

    @GetMapping("/workout") // constructor injected
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";
    }

}
