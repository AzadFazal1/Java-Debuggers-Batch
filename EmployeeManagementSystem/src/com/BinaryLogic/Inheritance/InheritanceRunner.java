package com.BinaryLogic.Inheritance;

import java.util.function.BiConsumer;

public class InheritanceRunner {

	public static void main(String[] args) {
		//Child child = new Parent();
		//child.read();
		
//		Parent parent = new Child();
//		parent.read();
		
		//Child child = (Child) new Parent(); Error
		
//		Parent  p = new Parent();
//		p.read();
		
		Child child = new Child();
		child.read();
		child.runBusiness();
		
		Bike bike = new Bike();
		bike.setBrand("Yamaha");
		bike.setCost(2345.89f);
		bike.setModel("AXSC1000");
		MountainBike mBike = new MountainBike(12, "abc", "abcs", 4, 333);
//		mBike.setGears(4);
//		mBike.setSize(29);
		System.out.println(bike.getBrand());
		System.out.println(mBike.getBrand());
		
		
		

	}

}
