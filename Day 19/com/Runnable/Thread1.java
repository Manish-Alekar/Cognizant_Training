//Thread1
package com.Runnable;

public class Thread1 extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
	
			System.out.println("2 x "+i+" = "+2*i);
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
