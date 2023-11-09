package com.BinaryLogic.Inheritance;

public class Bike {
	
	float cost;
	
	String brand;
	
	String model;
	
	Bike(){
		
	}
	
	public Bike(float cost, String brand, String model) {
		this.cost = cost;
		this.brand = brand;
		this.model = model;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
