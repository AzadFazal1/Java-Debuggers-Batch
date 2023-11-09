package com.BinaryLogic.Functionalnterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	void method1();
	
	default void method2() {
		
	}

	static void method3() {
		
	}
	
}
