package com.BinaryLogic;

import java.util.*;

public class LaptopRunner {

	public static void main(String[] args) {
		
		Laptop hpLaptop = new Laptop("HP", 400, 2);
		Laptop macBook = new Laptop("Apple", 1299, 1);
		Laptop dellLaptop = new Laptop("Dell", 600, 3);

		List<Laptop> laptops = new ArrayList<>();
		laptops.add(hpLaptop);
		laptops.add(dellLaptop);
		laptops.add(macBook);
		
		Collections.sort(laptops, (a, b)->b.getQuantity() - a.getQuantity());
		
		Collections.sort(laptops, Comparator.comparingDouble(a->-a.getPrice()));
		
		for(Laptop laptop : laptops) {
			System.out.println(laptop);
		}

	}

}
