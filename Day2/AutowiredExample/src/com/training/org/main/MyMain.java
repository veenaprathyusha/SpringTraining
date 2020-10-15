










package com.training.org.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.org.TextEditor;

public class MyMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();
	}

}





