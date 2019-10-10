package com.zensar.Spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.Spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		Performer p = ctx.getBean("sanjay",Performer.class);
		p.perform();
		
		Performer p1 = ctx.getBean("ramesh", Performer.class);
		p1.perform();
		
		Performer p2 = ctx.getBean("anu", Performer.class);
		p2.perform();
		
	  	}
}
