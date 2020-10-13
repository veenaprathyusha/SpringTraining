package com.training.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student extends Person {
		private int numCourses;
		private List<String> courses;
		private List<Integer> grades;
		public Student() {
			super();
			System.out.println("default");
			numCourses=0;
			courses=new ArrayList<String>();
			grades=new ArrayList<Integer>();
		}
		public Student(String name, String address) {
			super(name, address);
		}
		public Student(String name, String address, int numCourses, List<String> courses, List<Integer> grades) {
			super(name, address);
			this.numCourses = numCourses;
			this.courses = courses;
			this.grades = grades;
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
		public List<Integer> getGrades() {
			return grades;
		}
		public void setGrades(List<Integer> grades) {
			this.grades = grades;
		}
		public void printGrades() {
			System.out.println("grades");
			Iterator<Integer> iter1 = grades.iterator();
			while(iter1.hasNext()) {
				System.out.println(iter1.next());
			}
		}
		public double getAverageGrade() {
			System.out.println("avg marks");
			double val=0;
			Iterator<Integer> iter2=grades.iterator();
			while(iter2.hasNext()) {
				val=val=iter2.next();
				
			}
			val=val/numCourses;
			return val;
		}
		
		public void addCourseGrade(String course, int grade) {
			courses.add(course);
			grades.add(grade);
			numCourses+=1;
		}
		@Override
		public String toString() {
			return "Student [numCourses=" + numCourses + ", courses=" + courses + ", grades=" + grades + "]";
		}
		
		
}
