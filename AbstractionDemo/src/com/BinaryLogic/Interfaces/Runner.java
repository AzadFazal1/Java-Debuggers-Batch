package com.BinaryLogic.Interfaces;

public class Runner {

	public static void main(String args[]) {
		Shape obj = new Circle();
		obj.draw();
		obj.getColor();
		Shape.getSize();
		
		Shape obj2 = new Square();
		obj2.draw();
		obj2.getColor();
		
		Circle cir = new Circle();
		cir.getColor();
		cir.draw();
		
	}
}
