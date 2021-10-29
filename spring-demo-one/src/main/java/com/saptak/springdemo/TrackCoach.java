package com.saptak.springdemo;

public class TrackCoach implements Coach {
	
	//Define a private field for dependency
	private FortuneService fortuneService;
	
	//Define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		
	}

	public String getDailyWorkout() {
		return "Run a hard 5 km";
	}

	public String getDailyFortune() {
		return "Just Do it:"+fortuneService.getFortune();
	}
	
	// Init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside doMyStartupStuff method");
	}
	
	// Destroy method
	public void doMyStopStuff() {
		System.out.println("TrackCoach: Inside doMyStopStuff method");
	}
}
