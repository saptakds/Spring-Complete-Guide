package com.saptak.springdemoanno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		// Read Spring config file
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Get bean from spring container
		Coach theCoach = classPathXmlApplicationContext.getBean("thatSillyCoach", Coach.class);

		// Call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// Close the context
		classPathXmlApplicationContext.close();
	}
}
