package com.saptak.springdemoanno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaDemoApp {
	public static void main(String[] args) {
		// Read Spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Get bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// Call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());

		// Close the context
		context.close();
	}
}
