package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zensar.spring.Greeting;

//creating the Obj of spring IOC container

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("greetings.xml");
		Greeting g = ctx.getBean("anniversary", Greeting.class); 
		System.out.println(g.greet());
		Greeting g1 = ctx.getBean("festival", Greeting.class); 
		System.out.println(g1.greet());
	
	}

}
