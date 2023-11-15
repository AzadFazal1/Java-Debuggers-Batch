package com.BinaryLogic.synchronization;

public class Runner {

	public static void main(String[] args) {
		Resource resource = new Resource();
		Producer producer = new Producer(resource);
		Consumer consumer = new Consumer(resource);
		

	}

}
