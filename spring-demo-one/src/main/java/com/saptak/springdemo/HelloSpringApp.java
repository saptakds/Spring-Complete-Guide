package com.saptak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from Spring Container
		Coach theCoach=context.getBean("myCoach",Coach.class);

		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Call new method for fortune service
		System.out.println(theCoach.getDailyFortune());

		// Close the context
		context.close();
	}

}
