package com.Runnable;

public class ThreadTwo implements Runnable {
	/*@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			System.out.println("Thread 2 :"+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	Resource resource;
	public ThreadTwo(resource) {
		this.resource=resource;
	}
	@Override
	public void run() {
		try {
			resource.display("Thread 2");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
}
