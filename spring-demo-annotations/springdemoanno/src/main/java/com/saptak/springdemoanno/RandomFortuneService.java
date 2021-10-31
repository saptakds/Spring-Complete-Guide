package com.saptak.springdemoanno;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private List<String> fortunes = Arrays.asList("Gold", "Silver", "Bronze");

	public String getFortune() {
		return fortunes.get(new Random().nextInt(fortunes.size()));
	}

}
