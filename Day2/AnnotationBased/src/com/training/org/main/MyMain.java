package com.training.org.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.org.Person;



public class MyMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

		Person p1=(Person)context.getBean("person");
		System.out.println(p1.getPersonName());
		System.out.println(p1.getPersonAge());
		
	
	}

}

