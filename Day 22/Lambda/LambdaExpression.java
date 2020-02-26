package com.Lambda;

public class LambdaExpression {
	public static void main(String[] args) {
//		MyThread t=new MyThread();
//		Thread thread=new Thread(t);
//		thread.start();
		
		
		
//		Runnable r=() -> System.out.println("Hello runnable");
//		Thread t=new Thread(r);
//		t.start();
		
		Hello h=() -> "Gangadhar hi";
		System.out.println(h.greetings());
		Hello h1=() -> "Shaktimaan";
		System.out.println(h1.greetings());
		Hello h2=() -> "tha";
		System.out.println(h2.greetings());
	}
}

@FunctionalInterface
interface Hello
{
	String greetings();
	//public void display();
	
}

//class MyThread implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("Hello runnable");
//		
//	}
//	
//}
