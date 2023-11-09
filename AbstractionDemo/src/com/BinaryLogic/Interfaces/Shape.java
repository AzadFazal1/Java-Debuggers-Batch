package com.BinaryLogic.Interfaces;

public interface Shape {
	
	void draw();
	
	default void getColor() {
		System.out.println("Blue Color");
	}
	
	static void getSize() {
		System.out.println("size is 10*10");
	}
	
}
