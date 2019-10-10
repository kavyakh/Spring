package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zensar.spring.Greeting;
import com.zensar.spring.config.GreetingConfig;

//creating the Obj of spring IOC container

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(GreetingConfig.class);
		Greeting g = ctx.getBean("festival", Greeting.class); 
		//System.out.println(g.greet());
		
		Greeting g1 = ctx.getBean("anniversary", Greeting.class); 
		//System.out.println(g1.greet());
	
	}
 
}
