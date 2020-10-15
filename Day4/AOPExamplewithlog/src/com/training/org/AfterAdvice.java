package com.training.org;

import java.lang.reflect.Method;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		FileHandler handler= new FileHandler("file.log",true);
		Logger log =Logger.getLogger("log");
		log.addHandler(handler);
		log.info("After Advice");
		
		System.out.println("After Advice statement");
		
	}

}
