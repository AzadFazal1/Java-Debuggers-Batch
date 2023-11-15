package com.BinaryLogic.multithreading;

public class Task1 extends Thread {
	
	public void run() {
		System.out.println("Task 1 Started");
		for(int i = 101; i <= 199; i++) {
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
