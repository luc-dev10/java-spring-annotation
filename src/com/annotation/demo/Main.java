package com.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		System.out.println("Start");

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// fetch bean
		Coach tennisCoachJunior = context.getBean("tennisCoach", Coach.class);

		Coach tennisCoachSecond = context.getBean("tennisCoach", Coach.class);

		// method on bean
		System.out.println(tennisCoachJunior.hashCode());
		System.out.println(tennisCoachSecond.hashCode());

		// close context
		context.close();

	}
}
