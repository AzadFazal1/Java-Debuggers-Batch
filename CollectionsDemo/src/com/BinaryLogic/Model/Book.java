package com.BinaryLogic.Model;

import java.util.Objects;

public class Book implements Comparable<Book>{
	int id;
	String title;
	String author;
	int noOfPages;
	String category;
	double price;
	boolean hardCover;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String title, String author, int noOfPages, String category, double price, boolean hardCover) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.noOfPages = noOfPages;
		this.category = category;
		this.price = price;
		this.hardCover = hardCover;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isHardCover() {
		return hardCover;
	}
	public void setHardCover(boolean hardCover) {
		this.hardCover = hardCover;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", noOfPages=" + noOfPages + ", category="
				+ category + ", price=" + price + ", hardCover=" + hardCover + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, category, hardCover, id, noOfPages, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category)
				&& hardCover == other.hardCover && id == other.id && noOfPages == other.noOfPages
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	@Override
	public int compareTo(Book that) {
		//return this.id - that.id;
//		if(this.id > that.id) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
		
//		boolean flag = this.getAuthor().equals(that.getAuthor());
//		if(flag) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
		return this.getAuthor().compareTo(that.getAuthor());
	}
	
	
	
}
