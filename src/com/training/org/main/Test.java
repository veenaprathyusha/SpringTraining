package com.training.org.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.org.Student;
import com.training.org.Teacher;

public class Test {  
	public static void main(String[] args) {  
		//Resource resource=new ClassPathResource("applicationContext.xml");  
		//BeanFactory factory=new XmlBeanFactory(resource);  
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student=(Student)factory.getBean("student");  
		System.out.println(student);
		student.addCourseGrade("java",25);
		student.printGrades();
		student.getAverageGrade();
		
		Teacher teacher=(Teacher)factory.getBean("teacher");
		System.out.println(teacher);
		teacher.addCourse("Reat");
		teacher.removeCourse("Java");
		System.out.println(teacher.getCourses());
		
	}  
} 
