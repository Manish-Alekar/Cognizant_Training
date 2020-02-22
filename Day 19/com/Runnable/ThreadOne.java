package com.Runnable;

public class ThreadOne implements Runnable {
	/*@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			if(i%2!=0)
			System.out.println("Thread 1 :"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	Resource resource;
	public ThreadOne(resource) {
		this.resource=resource;
	}
	@Override
	public void run() {
		try {
			resource.display("Thread 1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
}
