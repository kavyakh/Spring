package com.zensar.Spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.Spring.config.PerformerConfig;
import com.zensar.Spring.performers.Performer;


public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PerformerConfig.class);
		Performer p = ctx.getBean("pyara mohan", PerformerConfig.class);
		p.perform();
	  	}
}
