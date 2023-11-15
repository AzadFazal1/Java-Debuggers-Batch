package com.BinaryLogic.multithreading;

public class Task2 implements Runnable{
	public void run() {
		System.out.println();
		System.out.println("Task 2 Started");
		for(int i = 201; i <= 299; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.print(i + "  ");
		}
	}
}
