package com.healthcare.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 *   1. enforce some validation == aspect oriented programming lan 
 *   
 *   @Aspect--> intercepter 
 */

@Aspect
@Component
public class CustomerServiceValidationsAOP {
	
	
	//@Before(value = "")
	 @Before("execution(com.healthcare.service.CustomerService.createCustomer(..))")
	//@Pointcut("@within(com.healthcare.service.CustomerService.createCustomer(..))")
	public String validateAddress(String address) {
		
		//rest api to google api 
		// httpclient -- older 
		// RestTemplate --> call rest api
		// Webclient --> asynchronism
		// RestTemplate.ex
		System.out.println("I am from validateAddress method of AOP class" );
		return "new correct address";
		
	}
	
}
