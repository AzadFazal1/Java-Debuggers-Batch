package com.BinaryLogic;
import com.BinaryLogic.Model.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class SetRunner {
	
	public static  List<Book> removeDuplicates(List<Book> books){
		Set<Book> set = new HashSet<>();
		for(Book book : books) {
			set.add(book);
		}
		 List<Book> result = List.copyOf(set);
		 return result;
		
	}

	public static void main(String[] args) {
		//Set<Book> books = new HashSet<>();
		Book book1 = new Book(1, "Hunger Games", "Susanne Collins", 234, "Fiction", 123.45, true);
		Book book2 = new Book(2, "Java for Dummies", "John Doe", 145, "Educational", 56.34, false);
		Book book3 = new Book(3, "Harry Potter", "J K Rowling", 345, "Fiction", 100.23, true);
		Book book4 = new Book(4, "Game Of Thrones", "R. R. Martin", 560, "Drama", 150.23, false);
		Book book5 = new Book(5, "Cracking the coding Interview", "Gayle Laakmann McDowell", 700, "Educational", 70.23, true);
//		books.add(book1);
//		books.add(book2);
//		books.add(book3);
//		books.add(book4);
//		books.add(book5);
//		books.add(book1);
		List<Book> listOfBooks = new ArrayList<>();
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		listOfBooks.add(book4);
		listOfBooks.add(book5);
		listOfBooks.add(book1);
		
//
//		Iterator<Book> it  = books.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Iterator<Book> it2  = listOfBooks.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println(removeDuplicates(listOfBooks));
		

	}

}
