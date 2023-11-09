package com.BinaryLogic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;
import java.util.ListIterator;


import com.BinaryLogic.Model.Book;

public class Dequeue {

	public static void main(String[] args) {
		Book book1 = new Book(1, "Hunger Games", "Susanne Collins", 234, "Fiction", 123.45, true);
		Book book2 = new Book(2, "Java for Dummies", "John Doe", 145, "Educational", 56.34, false);
		Book book3 = new Book(3, "Harry Potter", "J K Rowling", 345, "Fiction", 100.23, true);
		Book book4 = new Book(4, "Game Of Thrones", "R. R. Martin", 560, "Drama", 150.23, false);
		Book book5 = new Book(5, "Cracking the coding Interview", "Gayle Laakmann McDowell", 700, "Educational", 70.23, true);

		ArrayDeque<Book> books = new ArrayDeque<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		Iterator<Book> it = books.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
		System.out.println("==========================");

		Iterator<Book> it2 = books.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());	
		}

		books.remove(0);
		
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println("==========================");
		int size = books.size();
		//size = 5
		while(size  > 0) {
			Book book = books.poll();
			System.out.println(book);
			books.offer(book);
			--size;
		}
		System.out.println("==========================");
		System.out.println(books.size());
		//books.addFirst(book5);
		System.out.println(books.peek());
		System.out.println(books.peekFirst());
		System.out.println(books.peekLast());

	}

}
