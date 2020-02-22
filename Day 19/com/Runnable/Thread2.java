//Thread2
package com.Runnable;

public class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
	
			System.out.println("4 x "+i+" = "+4*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
	
	
}
