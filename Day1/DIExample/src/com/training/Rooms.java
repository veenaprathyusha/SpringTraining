package com.training;

public class Rooms {
	private int roomNo;
	private double area;
	public Rooms() {
		System.out.println("Default constructor of rooms is called");
	}
	public Rooms(int roomNo,double area) {
		super();
		// TODO Auto-generated constructor stub
		this.roomNo=roomNo;
		this.area=area;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "\nRooms [roomNo=" + roomNo + ", area=" + area + "]";
	}
	
}
