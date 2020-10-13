package com.training.org;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
	private int numCourses;
	private List<String> courses;
	public Teacher() {
		super();
		System.out.println("default");
		numCourses=0;
		courses=new ArrayList<String>();
	}
	public Teacher(String name, String address) {
		super(name, address);
	}
	public Teacher(String name, String address, int numCourses, List<String> courses) {
		super(name, address);
		this.numCourses = numCourses;
		this.courses = courses;
	}
	public int getNumCourses() {
		return numCourses;
	}
	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Teacher [numCourses=" + numCourses + ", courses=" + courses + "]";
	}
	
	public boolean addCourse(String course) {
		if(courses.contains(course)) {
			return false;
		}else {
			courses.add(course);
			numCourses+=1;
			return true;
		}
	}
	public boolean removeCourse(String course) {
		if(courses.contains(course)) {
			courses.remove(course);
			numCourses-=1;
			return true;
		}
	else {
		return false;
	}
	}
	
}
