package com.BinaryLogic;
import java.util.List;

import org.w3c.dom.ls.LSOutput;

import com.BinaryLogic.Model.*;

import java.util.*;
public class ArrayListRunner {

	public static void main(String[] args) {
		Book book1 = new Book(1, "Hunger Games", "Susanne Collins", 234, "Fiction", 123.45, true);
		Book book2 = new Book(2, "Java for Dummies", "John Doe", 145, "Educational", 56.34, false);
		Book book3 = new Book(3, "Harry Potter", "J K Rowling", 345, "Fiction", 100.23, true);
		Book book4 = new Book(4, "Game Of Thrones", "R. R. Martin", 560, "Drama", 150.23, false);
		Book book5 = new Book(5, "Cracking the coding Interview", "Gayle Laakmann McDowell", 700, "Educational", 70.23, true);
		
		List<Book> books = new ArrayList<>();
		books.add(book2);
		books.add(book5);
		books.add(book1);
		books.add(book3);
		books.add(book4);
		
//		Iterator<Book> it = books.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());	
//		}
//		System.out.println("==========================");
//
//		ListIterator<Book> it2 = books.listIterator();
//		while(it2.hasNext()) {
//			System.out.println(it2.next());	
//		}

		//books.remove(0);
		//System.out.println(books.get(3));
		
		System.out.println("==========================");
		Collections.sort(books);
		//List<Integer> list = List.of(1, 3, 2, 6, 5);
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println("==========================");

		CompareByCategory compareByCategory = new CompareByCategory();
		Collections.sort(books, compareByCategory);
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println("==========================");

		CompareByPrice compareByPrice = new CompareByPrice();
		Collections.sort(books, compareByPrice);
		for(Book book : books) {
			System.out.println(book);
		}
		
	}

}
