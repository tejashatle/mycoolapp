package com.example.springboot.demo.mycoolaap.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;
	
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/teaminfo")
	public String teamInfo() {
		return "Coach name: "+ coachName +" Team Name: " + teamName;
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "I do workout for 2 hrs.";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day.";
	}
}
