package com.BinaryLogic.multithreading;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName());
		
		Task1 task1= new Task1();
		
		Thread thread1 = new Thread(task1);
		System.out.println(thread1.getState());

		thread1.start();
		System.out.println(thread1.getState());

		System.out.println(thread1.isAlive());
		System.out.println(thread1.getState());

		System.out.println(thread1.getPriority());
		System.out.println(thread1.MAX_PRIORITY);
		System.out.println(thread1.MIN_PRIORITY);
		thread1.setPriority(10);
		System.out.println();
		System.out.println("Task 3 Started");
		for(int i = 301; i <= 399; i++) {
			System.out.print(i + "  ");
		}
		Task2 task2 = new Task2();
		Thread thread2 = new Thread(task2);
		//thread1.join(5000);
		//Thread.yield();
		thread2.start();
//		thread1.start(); exception
		System.out.println();

		System.out.println(thread1.getState());


	}

}
