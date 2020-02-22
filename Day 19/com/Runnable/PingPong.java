package com.Runnable;

public class PingPong {
public static void main(String[] args) {
		
		Ping p1 = new Ping();
		
		Pong p2 = new Pong();
		System.out.println("Player 1 ready...");
		System.out.println("Player 2 ready...");
		p1.start();
		
		p2.start();
	}
}
