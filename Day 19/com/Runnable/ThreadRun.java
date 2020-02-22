//ThreadRun
package com.Runnable;

public class ThreadRun {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		
		Thread2 t2 = new Thread2();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
