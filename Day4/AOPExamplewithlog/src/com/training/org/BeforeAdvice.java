package com.training.org;

import java.lang.reflect.Method;
import java.util.logging.Logger;
import org.springframework.aop.MethodBeforeAdvice;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
public class BeforeAdvice implements MethodBeforeAdvice{
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("Additional before advice");
	//	System.out.println("Method infor"+arg0.getName());
	//	for(Object arg:arg1) {
	//		System.out.println(arg);
	//	}
	//	System.out.println("Target "+arg2);
	//	System.out.println("Target class"+arg2.getClass().getName());
		FileHandler handler= new FileHandler("file.log",true);
		Logger log =Logger.getLogger("log");
		log.addHandler(handler);
		log.info("before Advice");
		
	}
}
