package com.Runnable;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(1);
		Resource res = new Resource();
		ThreadOne t1 = new ThreadOne(res);
		ThreadTwo t2 = new ThreadTwo(res);
		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		//t11.setPriority(Thread.MAX_PRIORITY);
		//t22.setPriority(Thread.NORM_PRIORITY+2);
		
		
		
		t11.start();
		t22.start();
		//for(int i=1;i<=5;i++) 
		//	System.out.println(Thread.currentThread().getName()+":"+i);
		//System.out.println("Main thread priority :"+Thread.currentThread().getPriority());
		//System.out.println("Thread 1 priority :"+t11.getPriority());
		//System.out.println("Thread 2 priority :"+t22.getPriority());
		
	}
}
