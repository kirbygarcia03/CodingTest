package com.codingtest;

public class Consumer extends Thread {
	
	public void run() {
		for (int ctr = 1; ctr <= 3; ctr ++) 
		{
			System.out.println("Consume");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
