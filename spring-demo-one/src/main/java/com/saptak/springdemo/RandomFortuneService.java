package com.saptak.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private List<String> fortunes=Arrays.asList("Gold","Silver","Bronze");

	public String getFortune() {
		return fortunes.get(new Random().nextInt(fortunes.size()));
	}

}
