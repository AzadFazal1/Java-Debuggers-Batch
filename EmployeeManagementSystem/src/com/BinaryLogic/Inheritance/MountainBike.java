package com.BinaryLogic.Inheritance;

public class MountainBike extends Bike{
	
	int gears;
	int size;
	
	MountainBike(){
		super();
		
	}
	MountainBike(float cost, String brand, String model, int gears, int size){

		super(cost, brand, model);
		this.gears = gears;
		this.size = size;
		
	}
	
	
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
	

	
}
