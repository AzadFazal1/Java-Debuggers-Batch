package com.BinaryLogic.synchronization;

public class Resource {
	
	int data;
	boolean flag = true;
	public synchronized void writeData(int data) {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
   				e.printStackTrace();
			}	
		}
		this.data = data;
		System.out.println("Writing data : " + this.data);
		flag = !flag;
		notify();
	}
	
	public synchronized int readData() {
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Reading data : " + this.data);
		flag = !flag;
		notify();
		return this.data;
	}

}
