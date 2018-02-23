package com.ck.unable.to.solve;

public class SyncMakeObjNullDoubt {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.start();
		t2.start();

	}

	public void syncTest() {
		Object obj = new Object();
		//In this block, the thread has the lock of obj and can modify it to whatever it wants to.
		//In this block, NPE will never be occuring...!!!
		synchronized (obj) {
			System.out.println("Before null...");
			obj = null;
			System.out.println("After null...");
		}
		//Program comes here and obj is null now. Hence acquiring lock cannot be done.
		//Hence , it gives NPE.
		synchronized (obj) {
			System.out.println("Before null...2");
			obj = null;
			System.out.println("After null...2");
		}
	}
}

class MyThread extends Thread {
	public void run() {
		new SyncMakeObjNullDoubt().syncTest();
	}
}
