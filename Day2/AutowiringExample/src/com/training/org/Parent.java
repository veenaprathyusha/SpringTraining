package com.training.org;

public class Parent {
	private Child child;
	
	public Parent() {
		System.out.println("Default constructor of Parent is called");
	}

	public Parent(Child child) {
		super();
		System.out.println("Parameterised constructor of Parent is called");
		this.child = child;
	}
	
	public Child getChild() {
		System.out.println("getChild is called");
		return child;
	}

	public void setChild(Child child) {
		System.out.println("setChild is called");
		this.child = child;
	}

	public void showParentDetails() {
		System.out.println("Parent Details are");
		child.showChildDetails();
	}
	
	
	

}



