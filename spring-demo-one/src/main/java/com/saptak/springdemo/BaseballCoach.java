package com.saptak.springdemo;

public class BaseballCoach implements Coach{

	//Define a private field for dependency
	private FortuneService fortuneService;
	
	//Define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		//Use my fortune service to get fortune
		return fortuneService.getFortune();
	}
}
