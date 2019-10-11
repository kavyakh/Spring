package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.zensar.spring.exceptions.PerformanceException;
@Component("sanjay")
public class Juggler implements Performer {
	@Value("3")
	private int beanBags;

	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		if(beanBags<3) {
			throw new PerformanceException("No of beanBags are not sufficient");
		}
		else {
			System.out.println("Juggler juggling"+ beanBags);
		}

	}

}
