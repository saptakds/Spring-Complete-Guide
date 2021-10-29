package com.saptak.springdemoanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
