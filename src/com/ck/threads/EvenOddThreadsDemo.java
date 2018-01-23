package com.ck.threads;

public class EvenOddThreadsDemo {
	public static void main(String[] args) {
		PrintEvenOddThreads objPrintEvenOddThreads	= new PrintEvenOddThreads();//Object on which wait() and notifyAll() work
		MyEvenThread evenThread						= new MyEvenThread(objPrintEvenOddThreads);//Separate thread to print even numbers
		MyOddThread oddThread						= new MyOddThread(objPrintEvenOddThreads);//Separate thread to print odd numbers
		
		oddThread.start();
		evenThread.start();
		
	}
}

class MyEvenThread extends Thread{
	PrintEvenOddThreads objPrintEvenOddThreads;//Object on which wait() and notifyAll() work

	public MyEvenThread(PrintEvenOddThreads obj) {
		this.objPrintEvenOddThreads = obj;
	}

	public void run() {
		objPrintEvenOddThreads.displayEven(objPrintEvenOddThreads);
	}
}

class MyOddThread extends Thread{
	PrintEvenOddThreads objPrintEvenOddThreads;//Object on which wait() and notifyAll() work

	public MyOddThread(PrintEvenOddThreads obj) {
		this.objPrintEvenOddThreads = obj;
	}

	public void run() {
		objPrintEvenOddThreads.displayOdd(objPrintEvenOddThreads);
	}
}

class PrintEvenOddThreads {
	public synchronized void displayEven(PrintEvenOddThreads objPrintEvenOddThreads) {//Sync method as we used wait() and notifyAll()
		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println("getting printed by even thread : " + i);
			objPrintEvenOddThreads.notifyAll();
			try {
				objPrintEvenOddThreads.wait();
			} catch (InterruptedException e) {}
		}
	}

	public synchronized void displayOdd(PrintEvenOddThreads objPrintEvenOddThreads) {//Sync method as we used wait() and notifyAll()
		for (int i = 1; i <= 9; i = i + 2) {
			System.out.println("getting printed by odd thread : " + i);
			objPrintEvenOddThreads.notifyAll();
			try {
				objPrintEvenOddThreads.wait();
			} catch (InterruptedException e) {}
		}
	}
}