package com.training.org;


public class Employee {
   private Integer empId;
   private String name;
   private double salary;
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee(Integer empId, String name, double salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	super();
	this.empId=empId;
	this.name=name;
	this.salary=salary;
}

   
}