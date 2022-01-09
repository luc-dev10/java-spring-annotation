package com.annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		return "Random Fortune for you";
	}

}
