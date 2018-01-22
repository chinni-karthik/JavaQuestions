package com.ck.threads;

public class YieldDemo {
	public static void main(String[] args) {
		Thread t = new MyThreadYealdDemo();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread Running...!!!");
		}
	}
}

class MyThreadYealdDemo extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("Child Thread Running...!!!");
		}
	}
}