package com.BinaryLogic.AbstractClasses;

public class Runner {

	public static void main(String args[]) {
		Shape obj = new Circle2();
		obj.draw();
		obj.getColor();
		Shape.getSize();
		
		Shape obj2 = new Square();
		obj2.draw();
		obj2.getColor();
		
		Circle2 cir = new Circle2();
		cir.getColor();
		cir.draw();
		
	}
}



