package com.training.main;

import java.util.ArrayList;

import com.training.Building1;
import com.training.Rooms;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Building1 b1 =new Building1();
		//System.out.println(b1);
		Rooms r1=new Rooms(101, 200.00);
		Rooms r2=new Rooms(102, 234.33);
		Rooms r3=new Rooms(103, 345.23);
		Rooms r4=new Rooms(104, 223.10);
		Rooms r5=new Rooms(105, 342.24);
		
		
		ArrayList<Rooms> lst=new ArrayList<Rooms>();
		lst.add(r1);
		lst.add(r2);
		lst.add(r3);
		lst.add(r4);
		lst.add(r5);
		
		
		Building1 b2=new Building1("Symphony","Pune",lst);
		System.out.println(b2);

	}

}
