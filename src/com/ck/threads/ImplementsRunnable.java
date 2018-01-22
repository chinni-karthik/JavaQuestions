package com.ck.threads;

public class ImplementsRunnable {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread Running...!!!");
		}
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread Running...!!!");
		}
	}
}