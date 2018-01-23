package com.ck.threads;

public class DeadLockPrevention extends Thread {
	ClassOne c1 = new ClassOne();
	ClassTwo c2 = new ClassTwo();

	public DeadLockPrevention() {//Having this Constructor to handle the static checks and all. Just understand the code. This is just to handle the compile errors!
		Thread t = new Thread(this);//(this) is required. Understand why!
		t.start();
		try {
			c1.foo(c2);
		} catch (Exception e) {}

	}

	public void run() {
		try {
			c2.bar(c1);
		} catch (Exception e) {}

	}

	public static void main(String[] args) throws Exception {
		new DeadLockPrevention();//To avoid the compile errors of static.
	}
}

class ClassOne {
	public synchronized void foo(ClassTwo c2) throws InterruptedException {
		System.out.println("c1 executing foo(c2)");
		Thread.sleep(2000);
		System.out.println("c2 executing last() of ClassOne");
		c2.last();
	}

	public synchronized void last() {//DeadLock here...!!!
		System.out.println("Executing last() of ClassOne");
	}
}

class ClassTwo {
	public synchronized void bar(ClassOne c1) throws InterruptedException {
		System.out.println("c2 executing bar(c1)");
		Thread.sleep(2000);
		System.out.println("c1 executing last() of ClassTwo");
		c1.last();
	}

	public synchronized void last() {//DeadLock here...!!!
		System.out.println("Executing last() of ClassTwo");
	}
}