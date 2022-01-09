package com.annotation.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

//	Init method

	@PostConstruct
	public void doInit() {
		System.out.println("I am initiated.");
	}

	@PreDestroy
	public void willItDestroy() {
		System.out.println("I am destroyed.");

	}

	@Override
	public String getDailyWorkout() {
		return "Hello Tennis Coach";
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
