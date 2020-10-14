
package com.training.org.main;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.org.Employee;
import com.training.org.EmployeeJDBCTemplate;

public class MyMain {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("applicationContext.xml");

      EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate)context.getBean("employeeJDBCTemplate");
      
      System.out.println("------Records Creation--------" );
      employeeJDBCTemplate.create(101,"Zara", 11);
      employeeJDBCTemplate.create(102,"Nuha", 2);
      employeeJDBCTemplate.create(103,"Ayan", 15);

      System.out.println("------Listing Multiple Records--------" );
      List<Employee> students = employeeJDBCTemplate.listEmployees();
      for (Employee record : students) {
         System.out.print("ID : " + record.getEmpId() );
         System.out.print(", Name : " + record.getName() );
         System.out.println(", Age : " + record.getSalary());
      }

      	  
   }
}








