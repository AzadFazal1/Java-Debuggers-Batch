package com.BinaryLogic.synchronization;

public class Producer implements Runnable {
	Resource r;
	public Producer(Resource r) {
		this.r = r;
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		int data = 0;
		while(true) {
			++data;
			r.writeData(data);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
