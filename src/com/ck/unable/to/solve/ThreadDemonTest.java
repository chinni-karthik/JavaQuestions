package com.ck.unable.to.solve;

class ThreadDemonDoubt extends Thread {
	@Override
	public void run() {
		System.out.println("In child class run method...!!!");
	}
}

public class ThreadDemonTest {
	public static void main(String[] args) {
		ThreadDemonDoubt t1=new ThreadDemonDoubt();
		ThreadDemonDoubt t2=new ThreadDemonDoubt();
		t1.start();
		t1.setDaemon(true);//java.lang.IllegalThreadStateException. //Compiled fine but exception during runtime.
		t2.start();
		
	}
}
