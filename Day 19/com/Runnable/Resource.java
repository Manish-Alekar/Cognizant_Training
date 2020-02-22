package com.Runnable;

public class Resource {
	public synchronized void display(String name) throws InterruptedException {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Name Count :"+i+":-"+name);
			try {
				Thread.sleep(1000);
		
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}	
		Thread.sleep(1000);
	}
}
