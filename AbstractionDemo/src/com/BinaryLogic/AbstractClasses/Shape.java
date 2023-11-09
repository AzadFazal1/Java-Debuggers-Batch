package com.BinaryLogic.AbstractClasses;

public abstract class Shape {
	
	abstract void draw();
	
	void getColor() {
		System.out.println("Blue Color");
	}
	
	static void getSize() {
		System.out.println("size is 10*10");
	}
}
