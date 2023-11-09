package com.BinaryLogic.Model;

import java.util.Comparator;

public class CompareByCategory implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o2.getCategory().compareTo(o1.getCategory());
	}

}
