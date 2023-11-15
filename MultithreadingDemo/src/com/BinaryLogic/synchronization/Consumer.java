package com.BinaryLogic.synchronization;

public class Consumer extends Thread{
	Resource r;
	
	public Consumer(Resource r) {
		this.r = r;
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		while(true) {
			r.readData();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	

}
