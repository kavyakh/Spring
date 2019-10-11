package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
     @Pointcut("execution(* *.perform(..))")//.. indicates all parameter,1st * indicates Return-type ,2nd * indicates class 
	//@Pointcut("execution(void *.perform(..)")
	//@Pointcut("execution(void com.zensar.spring.performers.Juggler.perform(..)")
	//@Pointcut("execution(public void com.zensar.spring.performers.Juggler.perform(..)")
	public void performencePointcut() {
		
	}
	
	@Before("execution(* *.perform(..))")
	public void takeSeats() {
		System.out.println("Audience are taking their seats");
	}
	
	@Before("performencePointcut())")
	public void switchOffCellPhones() {
		System.out.println("Audience are switching off their cellphones");
	}
	
	@AfterReturning("performencePointcut())")
	public void aploud() {
		System.out.println("CLAP CLAP");
	}
	@AfterThrowing("performencePointcut())")
	public void demandRefund() {
		System.out.println("Give me money back!");
	}
}

