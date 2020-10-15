package com.training;

import java.util.ArrayList;

public class Building1 {
	private String buildingName;
	private String buildingAddress;
	private ArrayList<Rooms> room;
	
	public Building1() {
		System.out.println("default constructor");
		this.buildingName="";
		this.buildingAddress="";
		this.room=new ArrayList<Rooms>();
	}
	public Building1(String buildingName, String buildingAddress, ArrayList<Rooms> room) {
		super();
		this.buildingName = buildingName;
		this.buildingAddress = buildingAddress;
		this.room = room;
	}
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getBuildingAddress() {
		return buildingAddress;
	}
	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}
	public ArrayList<Rooms> getRoom() {
		return room;
	}
	public void setRoom(ArrayList<Rooms> room) {
		this.room = room;
	}
	@Override
	public String toString() {
		return "Building1 [buildingName=" + buildingName + ", buildingAddress=" + buildingAddress + ", room=" + room
				+ "]";
	}
	
}
