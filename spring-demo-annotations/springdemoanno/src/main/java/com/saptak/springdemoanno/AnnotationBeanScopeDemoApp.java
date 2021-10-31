package com.saptak.springdemoanno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// Read Spring config file
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// Get bean from spring container
		Coach theCoach = classPathXmlApplicationContext.getBean("thatSillyCoach", Coach.class);

		Coach theAlpha = classPathXmlApplicationContext.getBean("thatSillyCoach", Coach.class);

		// Check if both are same
		boolean result = (theCoach == theAlpha);

		// Print the results
		System.out.println("Pointing to the same object: " + result);

		System.out.println("Memory location of theCoach: " + theCoach);

		System.out.println("Memory location of theAlpha: " + theAlpha);

		// Close the context
		classPathXmlApplicationContext.close();

	}

}
