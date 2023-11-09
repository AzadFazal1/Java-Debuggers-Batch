package com.BinaryLogic;
import com.BinaryLogic.Model.*;
import java.util.*;
public class HashMapRunner {

	public static void main(String[] args) {
		Map<Integer, Book> mapOfBooks = new HashMap<>();
		Book book2 = new Book(2, "Java for Dummies", "John Doe", 145, "Educational", 56.34, false);
		Book book3 = new Book(3, "Harry Potter", "J K Rowling", 345, "Fiction", 100.23, true);
		Book book4 = new Book(4, "Game Of Thrones", "R. R. Martin", 560, "Drama", 150.23, false);
		Book book5 = new Book(5, "Cracking the coding Interview", "Gayle Laakmann McDowell", 700, "Educational", 70.23, true);
		mapOfBooks.put(23, new Book(1, "Hunger Games", "Susanne Collins", 234, "Fiction", 123.45, true));
		mapOfBooks.put(34,  book2);
		mapOfBooks.put(32,  book4);
		mapOfBooks.put(31,  book3);
		mapOfBooks.put(22,  book5);
		
		for(Map.Entry<Integer, Book> entry : mapOfBooks.entrySet()) {
			System.out.println(entry.getKey() + " ,    " + entry.getValue());
		}
		System.out.println("+++++++++++++++++++++++++");
		Set<Integer> set = mapOfBooks.keySet();
		for(Integer key : set) {
			System.out.println(mapOfBooks.get(key));
		}
		int [] arr = {23, 45, 56, 45, 56, 34, 78, 56};
		Map<Integer, Integer> map = new HashMap<>();
		for(int element : arr) {
			map.put(element, map.getOrDefault(element, 0) + 1);
		}
		System.out.println(map);
		// 23, 45, 56, 45, 56, 34, 78, 56
		//  23 : 1     45 : 2   56: 3   34 : 1   78 : 1
		//
		//
		//System.out.println(mapOfBooks);

		
	}

}
