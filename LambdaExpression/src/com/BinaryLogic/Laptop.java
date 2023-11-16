package com.BinaryLogic;

public class Laptop {
	String brandName;
	double price;
	int quantity;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String brandName, double price, int quantity) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
