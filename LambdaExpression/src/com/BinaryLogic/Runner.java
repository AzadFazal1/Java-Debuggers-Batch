package com.BinaryLogic;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Runner {
	
	static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
//		Circle circle2 = new Circle();
//		circle2.draw();
		
		Consumer<String> x = (e)-> System.out.println(e);
			  
		//circle.draw();
		x.accept("Sufiyan");
		
		Supplier<Integer> y =()-> 10;
		System.out.println(y.get());
		
		Function<Integer, String> function= (a) ->  a +"2345";
		System.out.println(function.apply(100));
		
		
		Predicate<Integer> predicate = (a)-> a % 2 == 0 ;
		if(!predicate.test(35)) {
			System.out.println("number Is odd");
		}
		else {
			System.out.println("number is even");
		}
		//System.out.println(sum(10, 20));
				
		
//		static int sum(int a, int b) {
//			return a + b;
//		}
		
		BiFunction<Integer, Integer, Integer> sum =(a, b)-> a + b;
		
		System.out.println(sum.apply(10, 20));
		
		BiPredicate<String, Integer> biPredicate = (a, b) -> a.length() == b && a.startsWith("J");
		 
		System.out.println(biPredicate.test( "Joe", 3 ));
		

	}

}
