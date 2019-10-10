package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival")//Decorative annotations
public class FestivalGreeting implements Greeting {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Diwali";
	}	
		public FestivalGreeting() {
			System.out.println("Festival Greeting Created");
		
	}

}
