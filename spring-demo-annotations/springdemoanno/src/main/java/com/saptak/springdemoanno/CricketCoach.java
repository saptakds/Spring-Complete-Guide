package com.saptak.springdemoanno;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	public String getDailyWorkout() {
		return "Practice bowling spin 100 balls";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
