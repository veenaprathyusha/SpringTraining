package com.training.org;

public class Address {
	private String lane;
	private String city;
	private String state;
	
	public Address() {
		super();
		System.out.println("Default of Address is called");
	}

	public Address(String lane, String city, String state) {
		super();
		System.out.println("Parameteried of Address is called");
		this.lane = lane;
		this.city = city;
		this.state = state;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [lane=" + lane + ", city=" + city + ", state=" + state + "]";
	}
}


