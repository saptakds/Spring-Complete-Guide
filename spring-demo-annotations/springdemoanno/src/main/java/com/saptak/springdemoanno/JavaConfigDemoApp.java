package com.saptak.springdemoanno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		// Read Spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Get bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

		// Call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// Close the context
		context.close();
	}
}
