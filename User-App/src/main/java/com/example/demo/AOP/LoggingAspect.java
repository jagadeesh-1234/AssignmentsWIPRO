package com.example.demo.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;


@Aspect
@Component
@Slf4j
public class LoggingAspect {
	
	@Before("execution( *com.example.demo.controller.UserController.addUser(..))")
	public void logbeforeAddUser() {
		log.warn("loging something before addNewUser Endpoint");
	}

}
