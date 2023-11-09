package com.BinaryLogic.Model;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return (int) (o1.getPrice() - o2.getPrice());
	}

}
