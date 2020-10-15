package com.training.org.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.training.org.Organisation;  

public class Test {  
	public static void main(String[] args) {  
		//Resource resource=new ClassPathResource("applicationContext.xml");  
		//BeanFactory factory=new XmlBeanFactory(resource);  
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		Organisation org=(Organisation)context.getBean("organisationbean");  
		System.out.println(org);  
	}  
} 
